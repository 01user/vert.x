package org.vertx.java.tests.core.globalhandlers;

import org.vertx.java.core.app.AppType;
import org.vertx.java.newtests.TestBase;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class RubyGlobalHandlersTest extends TestBase {

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    startApp(AppType.RUBY, "core/globalhandlers/test_client.rb");
  }

  @Override
  protected void tearDown() throws Exception {
    super.tearDown();
  }

  public void testFoo() {

  }

//  public void test_global_handlers() {
//    startTest(getMethodName());
//  }
}
