package org.zrgs.jnanoid;

import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aventrix.jnanoid.jnanoid.NanoIdUtils;

import java.lang.invoke.MethodHandles;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author glick
 */
class JNanoIdExerciserTest {

    private static final Logger LOG
        = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass().getSimpleName());

    private static final int DEFAULT_NANOID_LENGTH = 21;

    @Test
    void testJNanoId() {

        String jnanoid = NanoIdUtils.randomNanoId();

        int nanoIdlength = jnanoid.length();

        LOG.info("the length of the nanoId string is {} characters", nanoIdlength);
        LOG.info("the value of the nanoId is \"{}\"", jnanoid);

        assertThat(nanoIdlength).isEqualTo(DEFAULT_NANOID_LENGTH);
    }
}
