package org.acme;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeDepedencyInjectionResourceIT extends DepedencyInjectionResourceTest {

    // Execute the same tests but in native mode.
}