package com.esotericsoftware.kryo.unsafe;

import androidx.profileinstaller.AbstractC2442;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.minlog.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import sun.misc.Unsafe;
import sun.nio.ch.DirectBuffer;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class UnsafeUtil {
    public static final long booleanArrayBaseOffset;
    public static final long byteArrayBaseOffset;
    public static final long charArrayBaseOffset;
    public static final long doubleArrayBaseOffset;
    public static final long floatArrayBaseOffset;
    public static final long intArrayBaseOffset;
    public static final long longArrayBaseOffset;
    public static final long shortArrayBaseOffset;
    public static final Unsafe unsafe;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class DirectBuffers {
        private static Method cleanMethod;
        private static Method cleanerMethod;
        private static Constructor<? extends ByteBuffer> directByteBufferConstructor;

        static {
            try {
                Constructor declaredConstructor = ByteBuffer.allocateDirect(1).getClass().getDeclaredConstructor(Long.TYPE, Integer.TYPE);
                directByteBufferConstructor = declaredConstructor;
                declaredConstructor.setAccessible(true);
            } catch (Exception e) {
                if (Log.DEBUG) {
                    Log.debug("kryo", "No direct ByteBuffer constructor is available.", e);
                }
                directByteBufferConstructor = null;
            }
            try {
                Method method = DirectBuffer.class.getMethod("cleaner", null);
                cleanerMethod = method;
                method.setAccessible(true);
                cleanMethod = cleanerMethod.getReturnType().getMethod("clean", null);
            } catch (Exception e2) {
                if (Log.DEBUG) {
                    Log.debug("kryo", "No direct ByteBuffer clean method is available.", e2);
                }
                cleanerMethod = null;
            }
        }

        private DirectBuffers() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7  */
    static {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.unsafe.UnsafeUtil.<clinit>():void");
    }

    public static boolean isNewDirectBufferAvailable() {
        return DirectBuffers.directByteBufferConstructor != null;
    }

    public static ByteBuffer newDirectBuffer(long j, int i) {
        if (!isNewDirectBufferAvailable()) {
            C5925.m11308("No direct ByteBuffer constructor is available.");
            return null;
        }
        try {
            return (ByteBuffer) DirectBuffers.directByteBufferConstructor.newInstance(Long.valueOf(j), Integer.valueOf(i));
        } catch (Exception e) {
            throw new KryoException(AbstractC2442.m4583(j, "Error creating a ByteBuffer at address: "), e);
        }
    }

    public static void dispose(ByteBuffer byteBuffer) {
    }
}
