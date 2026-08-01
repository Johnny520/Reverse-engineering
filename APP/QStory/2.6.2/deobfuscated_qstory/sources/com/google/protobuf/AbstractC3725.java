package com.google.protobuf;

import bsh.C2632;
import com.android.dx.io.Opcodes;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏楪世子兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3725 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f11540;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final boolean f11541;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final boolean f11542;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final AbstractC3726 f11543;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Class f11544;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Unsafe f11545;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean f11546;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final long f11547;

    static {
        Unsafe unsafeM8013 = m8013();
        f11545 = unsafeM8013;
        f11544 = AbstractC3546.f11193;
        boolean zM7998 = m7998(Long.TYPE);
        boolean zM79982 = m7998(Integer.TYPE);
        char c = 1;
        int i = 0;
        AbstractC3726 c3733 = null;
        if (unsafeM8013 != null) {
            if (!AbstractC3546.m7799()) {
                c3733 = new C3733(unsafeM8013);
            } else if (zM7998) {
                c3733 = new C3732(unsafeM8013, c == true ? 1 : 0);
            } else if (zM79982) {
                c3733 = new C3732(unsafeM8013, i);
            }
        }
        f11543 = c3733;
        f11542 = c3733 == null ? false : c3733.mo8022();
        f11541 = c3733 == null ? false : c3733.mo8020();
        f11540 = m8001(byte[].class);
        m8001(boolean[].class);
        m8000(boolean[].class);
        m8001(int[].class);
        m8000(int[].class);
        m8001(long[].class);
        m8000(long[].class);
        m8001(float[].class);
        m8000(float[].class);
        m8001(double[].class);
        m8000(double[].class);
        m8001(Object[].class);
        m8000(Object[].class);
        java.lang.reflect.Field fieldM7999 = m7999();
        f11547 = (fieldM7999 == null || c3733 == null) ? -1L : c3733.m8032(fieldM7999);
        f11546 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean m7998(Class cls) {
        if (!AbstractC3546.m7799()) {
            return false;
        }
        try {
            Class cls2 = f11544;
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
    public static java.lang.reflect.Field m7999() {
        java.lang.reflect.Field declaredField;
        java.lang.reflect.Field declaredField2;
        if (AbstractC3546.m7799()) {
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
    public static void m8000(Class cls) {
        if (f11541) {
            f11543.m8018(cls);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m8001(Class cls) {
        if (f11541) {
            return f11543.m8019(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m8002(Class cls) {
        try {
            return f11545.allocateInstance(cls);
        } catch (InstantiationException e) {
            C2632.m5292(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m8003(Throwable th) {
        Logger.getLogger(AbstractC3725.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m8004(Object obj, long j, int i) {
        f11543.m8025(obj, j, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m8005(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m8004(obj, j2, ((255 & b) << i) | (f11543.m8029(obj, j2) & (~(Opcodes.CONST_METHOD_TYPE << i))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m8006(Object obj, long j, long j2) {
        f11543.m8026(obj, j, j2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static void m8007(long j, Object obj, Object obj2) {
        f11543.m8021(j, obj, obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static byte m8008(Object obj, long j) {
        return (byte) ((f11543.m8029(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & Opcodes.CONST_METHOD_TYPE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static byte m8009(long j, byte[] bArr) {
        return f11543.mo8015(bArr, f11540 + j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m8010(byte[] bArr, long j, byte b) {
        f11543.mo8023(bArr, f11540 + j, b);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m8011(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM8029 = f11543.m8029(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m8004(obj, j2, ((255 & b) << i) | (iM8029 & (~(Opcodes.CONST_METHOD_TYPE << i))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static byte m8012(Object obj, long j) {
        return (byte) ((f11543.m8029(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & Opcodes.CONST_METHOD_TYPE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Unsafe m8013() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C3735());
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
            Logger.getLogger(AbstractC3725.class.getName()).log(Level.WARNING, "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }
}
