package com.alibaba.fastjson2.util;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.nio.ByteOrder;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class JDKUtils {
    public static final int ANDROID_SDK_INT;
    public static final long ARRAY_BYTE_BASE_OFFSET;
    public static final long ARRAY_CHAR_BASE_OFFSET;
    public static final boolean BIG_ENDIAN;
    public static final long FIELD_DECIMAL_INT_COMPACT_OFFSET;
    public static final boolean GRAAL = false;
    public static final Unsafe UNSAFE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Unsafe unsafe;
        int iArrayBaseOffset;
        int iArrayBaseOffset2;
        long jObjectFieldOffset;
        Field field;
        int i9 = 0;
        BIG_ENDIAN = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        try {
            Field[] declaredFields = Unsafe.class.getDeclaredFields();
            int length = declaredFields.length;
            while (true) {
                if (i9 >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i9];
                String name = field.getName();
                if (name.equals("theUnsafe") || name.equals("THE_ONE")) {
                    break;
                } else {
                    i9++;
                }
            }
        } catch (Throwable unused) {
        }
        if (field != null) {
            field.setAccessible(true);
            unsafe = (Unsafe) field.get(null);
        } else {
            unsafe = null;
        }
        UNSAFE = unsafe;
        int i10 = -1;
        if (unsafe != null) {
            iArrayBaseOffset = unsafe.arrayBaseOffset(byte[].class);
            iArrayBaseOffset2 = unsafe.arrayBaseOffset(char[].class);
        } else {
            iArrayBaseOffset = -1;
            iArrayBaseOffset2 = -1;
        }
        ARRAY_BYTE_BASE_OFFSET = iArrayBaseOffset;
        ARRAY_CHAR_BASE_OFFSET = iArrayBaseOffset2;
        try {
            jObjectFieldOffset = unsafe.objectFieldOffset(BigDecimal.class.getDeclaredField("intCompact"));
        } catch (Throwable unused2) {
            jObjectFieldOffset = -1;
        }
        FIELD_DECIMAL_INT_COMPACT_OFFSET = jObjectFieldOffset;
        try {
            i10 = Class.forName("android.os.Build$VERSION").getField("SDK_INT").getInt(null);
        } catch (Throwable unused3) {
        }
        ANDROID_SDK_INT = i10;
    }
}
