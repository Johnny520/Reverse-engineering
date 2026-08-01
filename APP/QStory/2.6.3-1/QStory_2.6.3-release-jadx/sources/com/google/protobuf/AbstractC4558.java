package com.google.protobuf;

import bsh.C3466;
import com.android.p002dx.p005io.Opcodes;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏楪世子兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f11890;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final boolean f11891;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final boolean f11892;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final AbstractC4559 f11893;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Class f11894;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Unsafe f11895;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean f11896;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final long f11897;

    static {
        Unsafe unsafeM8559 = m8559();
        f11895 = unsafeM8559;
        f11894 = AbstractC4379.f11543;
        boolean zM8544 = m8544(Long.TYPE);
        boolean zM85442 = m8544(Integer.TYPE);
        char c = 1;
        int i = 0;
        AbstractC4559 c4566 = null;
        if (unsafeM8559 != null) {
            if (!AbstractC4379.m8345()) {
                c4566 = new C4566(unsafeM8559);
            } else if (zM8544) {
                c4566 = new C4565(unsafeM8559, c == true ? 1 : 0);
            } else if (zM85442) {
                c4566 = new C4565(unsafeM8559, i);
            }
        }
        f11893 = c4566;
        f11892 = c4566 == null ? false : c4566.mo8568();
        f11891 = c4566 == null ? false : c4566.mo8566();
        f11890 = m8547(byte[].class);
        m8547(boolean[].class);
        m8546(boolean[].class);
        m8547(int[].class);
        m8546(int[].class);
        m8547(long[].class);
        m8546(long[].class);
        m8547(float[].class);
        m8546(float[].class);
        m8547(double[].class);
        m8546(double[].class);
        m8547(Object[].class);
        m8546(Object[].class);
        java.lang.reflect.Field fieldM8545 = m8545();
        f11897 = (fieldM8545 == null || c4566 == null) ? -1L : c4566.m8578(fieldM8545);
        f11896 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean m8544(Class cls) {
        if (!AbstractC4379.m8345()) {
            return false;
        }
        try {
            Class cls2 = f11894;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static java.lang.reflect.Field m8545() {
        java.lang.reflect.Field declaredField;
        java.lang.reflect.Field declaredField2;
        if (AbstractC4379.m8345()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m8546(Class cls) {
        if (f11891) {
            f11893.m8564(cls);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m8547(Class cls) {
        if (f11891) {
            return f11893.m8565(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m8548(Class cls) {
        try {
            return f11895.allocateInstance(cls);
        } catch (InstantiationException e) {
            C3466.m5897(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m8549(Throwable th) {
        Logger.getLogger(AbstractC4558.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m8550(Object obj, long j, int i) {
        f11893.m8571(obj, j, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m8551(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m8550(obj, j2, ((255 & b) << i) | (f11893.m8575(obj, j2) & (~(Opcodes.CONST_METHOD_TYPE << i))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m8552(Object obj, long j, long j2) {
        f11893.m8572(obj, j, j2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static void m8553(long j, Object obj, Object obj2) {
        f11893.m8567(j, obj, obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static byte m8554(Object obj, long j) {
        return (byte) ((f11893.m8575(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & Opcodes.CONST_METHOD_TYPE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static byte m8555(long j, byte[] bArr) {
        return f11893.mo8561(bArr, f11890 + j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m8556(byte[] bArr, long j, byte b) {
        f11893.mo8569(bArr, f11890 + j, b);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m8557(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM8575 = f11893.m8575(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m8550(obj, j2, ((255 & b) << i) | (iM8575 & (~(Opcodes.CONST_METHOD_TYPE << i))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static byte m8558(Object obj, long j) {
        return (byte) ((f11893.m8575(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & Opcodes.CONST_METHOD_TYPE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Unsafe m8559() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C4568());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(AbstractC4558.class.getName()).log(Level.WARNING, "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }
}
