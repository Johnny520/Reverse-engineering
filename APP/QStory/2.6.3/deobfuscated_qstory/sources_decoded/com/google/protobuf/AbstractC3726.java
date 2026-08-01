package com.google.protobuf;

import bsh.C2633;
import com.android.dx.io.Opcodes;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏楪世子兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3726 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f11545;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final boolean f11546;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final boolean f11547;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final AbstractC3727 f11548;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Class f11549;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Unsafe f11550;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean f11551;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final long f11552;

    static {
        Unsafe unsafeM8000 = m8000();
        f11550 = unsafeM8000;
        f11549 = AbstractC3547.f11198;
        boolean zM7985 = m7985(Long.TYPE);
        boolean zM79852 = m7985(Integer.TYPE);
        char c = 1;
        int i = 0;
        AbstractC3727 c3734 = null;
        if (unsafeM8000 != null) {
            if (!AbstractC3547.m7786()) {
                c3734 = new C3734(unsafeM8000);
            } else if (zM7985) {
                c3734 = new C3733(unsafeM8000, c == true ? 1 : 0);
            } else if (zM79852) {
                c3734 = new C3733(unsafeM8000, i);
            }
        }
        f11548 = c3734;
        f11547 = c3734 == null ? false : c3734.mo8009();
        f11546 = c3734 == null ? false : c3734.mo8007();
        f11545 = m7988(byte[].class);
        m7988(boolean[].class);
        m7987(boolean[].class);
        m7988(int[].class);
        m7987(int[].class);
        m7988(long[].class);
        m7987(long[].class);
        m7988(float[].class);
        m7987(float[].class);
        m7988(double[].class);
        m7987(double[].class);
        m7988(Object[].class);
        m7987(Object[].class);
        java.lang.reflect.Field fieldM7986 = m7986();
        f11552 = (fieldM7986 == null || c3734 == null) ? -1L : c3734.m8019(fieldM7986);
        f11551 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean m7985(Class cls) {
        if (!AbstractC3547.m7786()) {
            return false;
        }
        try {
            Class cls2 = f11549;
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
    public static java.lang.reflect.Field m7986() {
        java.lang.reflect.Field declaredField;
        java.lang.reflect.Field declaredField2;
        if (AbstractC3547.m7786()) {
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
    public static void m7987(Class cls) {
        if (f11546) {
            f11548.m8005(cls);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m7988(Class cls) {
        if (f11546) {
            return f11548.m8006(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m7989(Class cls) {
        try {
            return f11550.allocateInstance(cls);
        } catch (InstantiationException e) {
            C2633.m5337(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m7990(Throwable th) {
        Logger.getLogger(AbstractC3726.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m7991(Object obj, long j, int i) {
        f11548.m8012(obj, j, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m7992(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m7991(obj, j2, ((255 & b) << i) | (f11548.m8016(obj, j2) & (~(Opcodes.CONST_METHOD_TYPE << i))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m7993(Object obj, long j, long j2) {
        f11548.m8013(obj, j, j2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static void m7994(long j, Object obj, Object obj2) {
        f11548.m8008(j, obj, obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static byte m7995(Object obj, long j) {
        return (byte) ((f11548.m8016(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & Opcodes.CONST_METHOD_TYPE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static byte m7996(long j, byte[] bArr) {
        return f11548.mo8002(bArr, f11545 + j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m7997(byte[] bArr, long j, byte b) {
        f11548.mo8010(bArr, f11545 + j, b);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m7998(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM8016 = f11548.m8016(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m7991(obj, j2, ((255 & b) << i) | (iM8016 & (~(Opcodes.CONST_METHOD_TYPE << i))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static byte m7999(Object obj, long j) {
        return (byte) ((f11548.m8016(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & Opcodes.CONST_METHOD_TYPE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Unsafe m8000() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C3736());
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
            Logger.getLogger(AbstractC3726.class.getName()).log(Level.WARNING, "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }
}
