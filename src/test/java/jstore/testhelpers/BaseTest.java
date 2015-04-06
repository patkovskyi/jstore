package jstore.testhelpers;

import jstore.testhelpers.rivals.StringSetFactory;
import jstore.testhelpers.rivals.arrayset.ArrayStringSetFactory;
import jstore.testhelpers.rivals.hashset.HashStringSetFactory;
import jstore.testhelpers.rivals.mafsa.MafsaStringSetFactory;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(dataProvider = "factories")
public class BaseTest {
  @DataProvider(name = "factories", parallel = true)
  public StringSetFactory[][] getFactories() {
    return new StringSetFactory[][] { {new MafsaStringSetFactory()}, {new ArrayStringSetFactory()},
        {new HashStringSetFactory()}};
  }
}