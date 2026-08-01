package com.esotericsoftware.kryo.unsafe;

import androidx.profileinstaller.AbstractC3275;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.util.Util;
import com.esotericsoftware.minlog.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import sun.misc.Unsafe;
import sun.nio.ch.DirectBuffer;
import top.suzhelan.qstory.hook.item.C6755;

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
        long j;
        long jArrayBaseOffset;
        long jArrayBaseOffset2;
        long jArrayBaseOffset3;
        long jArrayBaseOffset4;
        long jArrayBaseOffset5;
        long j2;
        long j3;
        long j4;
        long j5;
        long jArrayBaseOffset6;
        long j6;
        Unsafe unsafe2 = null;
        try {
            if (Util.isAndroid) {
                if (Log.DEBUG) {
                    Log.debug("kryo", "Unsafe is not available on Android.");
                }
                j3 = 0;
                j4 = 0;
                jArrayBaseOffset6 = 0;
                jArrayBaseOffset2 = 0;
                jArrayBaseOffset3 = 0;
                jArrayBaseOffset4 = 0;
                j6 = 0;
                j2 = 0;
            } else {
                Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                Unsafe unsafe3 = (Unsafe) declaredField.get(null);
                try {
                    jArrayBaseOffset = unsafe3.arrayBaseOffset(byte[].class);
                } catch (Exception e) {
                    e = e;
                    unsafe2 = unsafe3;
                    j = 0;
                    jArrayBaseOffset = 0;
                    jArrayBaseOffset2 = 0;
                    jArrayBaseOffset3 = 0;
                    jArrayBaseOffset4 = 0;
                    jArrayBaseOffset5 = 0;
                    j2 = 0;
                    if (Log.DEBUG) {
                    }
                    j3 = j;
                    j4 = jArrayBaseOffset;
                    j5 = 0;
                    byteArrayBaseOffset = j4;
                    charArrayBaseOffset = jArrayBaseOffset2;
                    shortArrayBaseOffset = jArrayBaseOffset3;
                    intArrayBaseOffset = jArrayBaseOffset4;
                    floatArrayBaseOffset = jArrayBaseOffset5;
                    longArrayBaseOffset = j2;
                    doubleArrayBaseOffset = j3;
                    booleanArrayBaseOffset = j5;
                    unsafe = unsafe2;
                }
                try {
                    jArrayBaseOffset2 = unsafe3.arrayBaseOffset(char[].class);
                    try {
                        jArrayBaseOffset3 = unsafe3.arrayBaseOffset(short[].class);
                    } catch (Exception e2) {
                        e = e2;
                        unsafe2 = unsafe3;
                        j = 0;
                        jArrayBaseOffset3 = 0;
                        jArrayBaseOffset4 = 0;
                        jArrayBaseOffset5 = 0;
                        j2 = 0;
                        if (Log.DEBUG) {
                        }
                        j3 = j;
                        j4 = jArrayBaseOffset;
                        j5 = 0;
                        byteArrayBaseOffset = j4;
                        charArrayBaseOffset = jArrayBaseOffset2;
                        shortArrayBaseOffset = jArrayBaseOffset3;
                        intArrayBaseOffset = jArrayBaseOffset4;
                        floatArrayBaseOffset = jArrayBaseOffset5;
                        longArrayBaseOffset = j2;
                        doubleArrayBaseOffset = j3;
                        booleanArrayBaseOffset = j5;
                        unsafe = unsafe2;
                    }
                    try {
                        jArrayBaseOffset4 = unsafe3.arrayBaseOffset(int[].class);
                        try {
                            jArrayBaseOffset5 = unsafe3.arrayBaseOffset(float[].class);
                        } catch (Exception e3) {
                            e = e3;
                            unsafe2 = unsafe3;
                            j = 0;
                            jArrayBaseOffset5 = 0;
                            j2 = 0;
                            if (Log.DEBUG) {
                                Log.debug("kryo", "Unsafe is not available.", e);
                            }
                            j3 = j;
                            j4 = jArrayBaseOffset;
                            j5 = 0;
                            byteArrayBaseOffset = j4;
                            charArrayBaseOffset = jArrayBaseOffset2;
                            shortArrayBaseOffset = jArrayBaseOffset3;
                            intArrayBaseOffset = jArrayBaseOffset4;
                            floatArrayBaseOffset = jArrayBaseOffset5;
                            longArrayBaseOffset = j2;
                            doubleArrayBaseOffset = j3;
                            booleanArrayBaseOffset = j5;
                            unsafe = unsafe2;
                        }
                        try {
                            long jArrayBaseOffset7 = unsafe3.arrayBaseOffset(long[].class);
                            try {
                                j2 = jArrayBaseOffset7;
                                long jArrayBaseOffset8 = unsafe3.arrayBaseOffset(double[].class);
                                try {
                                    j6 = jArrayBaseOffset5;
                                    unsafe2 = unsafe3;
                                    j4 = jArrayBaseOffset;
                                    jArrayBaseOffset6 = unsafe3.arrayBaseOffset(boolean[].class);
                                    j3 = jArrayBaseOffset8;
                                } catch (Exception e4) {
                                    e = e4;
                                    j = jArrayBaseOffset8;
                                    unsafe2 = unsafe3;
                                    if (Log.DEBUG) {
                                    }
                                    j3 = j;
                                    j4 = jArrayBaseOffset;
                                    j5 = 0;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                j2 = jArrayBaseOffset7;
                                unsafe2 = unsafe3;
                                j = 0;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            unsafe2 = unsafe3;
                            j = 0;
                            j2 = 0;
                            if (Log.DEBUG) {
                            }
                            j3 = j;
                            j4 = jArrayBaseOffset;
                            j5 = 0;
                            byteArrayBaseOffset = j4;
                            charArrayBaseOffset = jArrayBaseOffset2;
                            shortArrayBaseOffset = jArrayBaseOffset3;
                            intArrayBaseOffset = jArrayBaseOffset4;
                            floatArrayBaseOffset = jArrayBaseOffset5;
                            longArrayBaseOffset = j2;
                            doubleArrayBaseOffset = j3;
                            booleanArrayBaseOffset = j5;
                            unsafe = unsafe2;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        unsafe2 = unsafe3;
                        j = 0;
                        jArrayBaseOffset4 = 0;
                        jArrayBaseOffset5 = 0;
                        j2 = 0;
                        if (Log.DEBUG) {
                        }
                        j3 = j;
                        j4 = jArrayBaseOffset;
                        j5 = 0;
                        byteArrayBaseOffset = j4;
                        charArrayBaseOffset = jArrayBaseOffset2;
                        shortArrayBaseOffset = jArrayBaseOffset3;
                        intArrayBaseOffset = jArrayBaseOffset4;
                        floatArrayBaseOffset = jArrayBaseOffset5;
                        longArrayBaseOffset = j2;
                        doubleArrayBaseOffset = j3;
                        booleanArrayBaseOffset = j5;
                        unsafe = unsafe2;
                    }
                } catch (Exception e8) {
                    e = e8;
                    unsafe2 = unsafe3;
                    j = 0;
                    jArrayBaseOffset2 = 0;
                    jArrayBaseOffset3 = 0;
                    jArrayBaseOffset4 = 0;
                    jArrayBaseOffset5 = 0;
                    j2 = 0;
                    if (Log.DEBUG) {
                    }
                    j3 = j;
                    j4 = jArrayBaseOffset;
                    j5 = 0;
                    byteArrayBaseOffset = j4;
                    charArrayBaseOffset = jArrayBaseOffset2;
                    shortArrayBaseOffset = jArrayBaseOffset3;
                    intArrayBaseOffset = jArrayBaseOffset4;
                    floatArrayBaseOffset = jArrayBaseOffset5;
                    longArrayBaseOffset = j2;
                    doubleArrayBaseOffset = j3;
                    booleanArrayBaseOffset = j5;
                    unsafe = unsafe2;
                }
            }
            jArrayBaseOffset5 = j6;
            j5 = jArrayBaseOffset6;
        } catch (Exception e9) {
            e = e9;
        }
        byteArrayBaseOffset = j4;
        charArrayBaseOffset = jArrayBaseOffset2;
        shortArrayBaseOffset = jArrayBaseOffset3;
        intArrayBaseOffset = jArrayBaseOffset4;
        floatArrayBaseOffset = jArrayBaseOffset5;
        longArrayBaseOffset = j2;
        doubleArrayBaseOffset = j3;
        booleanArrayBaseOffset = j5;
        unsafe = unsafe2;
    }

    public static boolean isNewDirectBufferAvailable() {
        return DirectBuffers.directByteBufferConstructor != null;
    }

    public static ByteBuffer newDirectBuffer(long j, int i) {
        if (!isNewDirectBufferAvailable()) {
            C6755.m11867("No direct ByteBuffer constructor is available.");
            return null;
        }
        try {
            return (ByteBuffer) DirectBuffers.directByteBufferConstructor.newInstance(Long.valueOf(j), Integer.valueOf(i));
        } catch (Exception e) {
            throw new KryoException(AbstractC3275.m5143(j, "Error creating a ByteBuffer at address: "), e);
        }
    }

    public static void dispose(ByteBuffer byteBuffer) {
    }
}
