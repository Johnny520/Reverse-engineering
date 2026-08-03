package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: jD */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2092jD {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f7364a;

    /* JADX INFO: renamed from: b */
    public static final Class f7365b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC1535iD f7366c;

    /* JADX INFO: renamed from: d */
    public static final boolean f7367d;

    /* JADX INFO: renamed from: e */
    public static final boolean f7368e;

    /* JADX INFO: renamed from: f */
    public static final long f7369f;

    /* JADX INFO: renamed from: g */
    public static final boolean f7370g;

    static {
        Unsafe unsafeM4270j = m4270j();
        f7364a = unsafeM4270j;
        f7365b = AbstractC2783z2.f9446a;
        boolean zM4266f = m4266f(Long.TYPE);
        boolean zM4266f2 = m4266f(Integer.TYPE);
        AbstractC1535iD c1491hD = null;
        if (unsafeM4270j != null) {
            if (!AbstractC2783z2.m5355a()) {
                c1491hD = new C1491hD(unsafeM4270j);
            } else if (zM4266f) {
                c1491hD = new C1447gD(unsafeM4270j, 1);
            } else if (zM4266f2) {
                c1491hD = new C1447gD(unsafeM4270j, 0);
            }
        }
        f7366c = c1491hD;
        f7367d = c1491hD == null ? false : c1491hD.mo2771s();
        f7368e = c1491hD == null ? false : c1491hD.mo2849r();
        f7369f = m4263c(byte[].class);
        m4263c(boolean[].class);
        m4264d(boolean[].class);
        m4263c(int[].class);
        m4264d(int[].class);
        m4263c(long[].class);
        m4264d(long[].class);
        m4263c(float[].class);
        m4264d(float[].class);
        m4263c(double[].class);
        m4264d(double[].class);
        m4263c(Object[].class);
        m4264d(Object[].class);
        Field fieldM4265e = m4265e();
        if (fieldM4265e != null && c1491hD != null) {
            c1491hD.m2909j(fieldM4265e);
        }
        f7370g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m4261a(Throwable th) {
        Logger.getLogger(AbstractC2092jD.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX INFO: renamed from: b */
    public static Object m4262b(Class cls) {
        try {
            return f7364a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m4263c(Class cls) {
        if (f7368e) {
            return f7366c.m2904a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static void m4264d(Class cls) {
        if (f7368e) {
            f7366c.m2905b(cls);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Field m4265e() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC2783z2.m5355a()) {
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

    /* JADX INFO: renamed from: f */
    public static boolean m4266f(Class cls) {
        if (!AbstractC2783z2.m5355a()) {
            return false;
        }
        try {
            Class cls2 = f7365b;
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

    /* JADX INFO: renamed from: g */
    public static byte m4267g(long j, byte[] bArr) {
        return f7366c.mo2764d(f7369f + j, bArr);
    }

    /* JADX INFO: renamed from: h */
    public static byte m4268h(long j, Object obj) {
        return (byte) ((f7366c.m2906g((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: i */
    public static byte m4269i(long j, Object obj) {
        return (byte) ((f7366c.m2906g((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: j */
    public static Unsafe m4270j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C1403fD());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m4271k(byte[] bArr, long j, byte b) {
        f7366c.mo2768l(bArr, f7369f + j, b);
    }

    /* JADX INFO: renamed from: l */
    public static void m4272l(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM2906g = f7366c.m2906g(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m4274n(((255 & b) << i) | (iM2906g & (~(255 << i))), j2, obj);
    }

    /* JADX INFO: renamed from: m */
    public static void m4273m(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m4274n(((255 & b) << i) | (f7366c.m2906g(j2, obj) & (~(255 << i))), j2, obj);
    }

    /* JADX INFO: renamed from: n */
    public static void m4274n(int i, long j, Object obj) {
        f7366c.m2910o(i, j, obj);
    }

    /* JADX INFO: renamed from: o */
    public static void m4275o(Object obj, long j, long j2) {
        f7366c.m2911p(obj, j, j2);
    }

    /* JADX INFO: renamed from: p */
    public static void m4276p(long j, Object obj, Object obj2) {
        f7366c.m2912q(j, obj, obj2);
    }
}
