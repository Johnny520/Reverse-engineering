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
    public static final Unsafe f7364a = null;

    /* JADX INFO: renamed from: b */
    public static final Class f7365b = null;

    /* JADX INFO: renamed from: c */
    public static final AbstractC1535iD f7366c = null;

    /* JADX INFO: renamed from: d */
    public static final boolean f7367d = false;

    /* JADX INFO: renamed from: e */
    public static final boolean f7368e = false;

    /* JADX INFO: renamed from: f */
    public static final long f7369f = 0;

    /* JADX INFO: renamed from: g */
    public static final boolean f7370g = false;

    static {
        Unsafe r0 = m4270j();
        f7364a = r0;
        f7365b = AbstractC2783z2.f9446a;
        boolean r1 = m4266f(Long.TYPE);
        boolean r2 = m4266f(Integer.TYPE);
        AbstractC1535iD r3 = null;
        if (r0 != null) goto L6;
    L12:
        f7366c = r3;
        boolean r02 = false;
        if (r3 != null) goto L15;
        boolean r12 = false;
    L16:
        f7367d = r12;
        if (r3 != null) goto L19;
        boolean r13 = false;
    L20:
        f7368e = r13;
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
        Field r14 = m4265e();
        if (r14 == null) goto L26;
        if (r3 == null) goto L26;
        r3.m2909j(r14);
    L26:
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) goto L28;
        r02 = true;
    L28:
        f7370g = r02;
        return;
    L19:
        r13 = r3.mo2849r();
        goto L20
    L15:
        r12 = r3.mo2771s();
        goto L16
    L6:
        if (AbstractC2783z2.m5355a() == false) goto L11;
        if (r1 == false) goto L9;
        r3 = new C1447gD(r0, 1);
        goto L12
    L9:
        if (r2 == false) goto L12;
        r3 = new C1447gD(r0, 0);
        goto L12
    L11:
        r3 = new C1491hD(r0);
        goto L12
    }

    /* JADX INFO: renamed from: a */
    public static void m4261a(Throwable r4) {
        Logger.getLogger(AbstractC2092jD.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + r4);
    }

    /* JADX INFO: renamed from: b */
    public static Object m4262b(Class r1) {
        return f7364a.allocateInstance(r1);
    L4:
        e = move-exception;
        throw new IllegalStateException(e);
    }

    /* JADX INFO: renamed from: c */
    public static int m4263c(Class r1) {
        if (f7368e == true) goto L5;
        return -1;
    L5:
        return f7366c.m2904a(r1);
    }

    /* JADX INFO: renamed from: d */
    public static void m4264d(Class r1) {
        if (f7368e == false) goto L6;
        f7366c.m2905b(r1);
        return;
    }

    /* JADX INFO: renamed from: e */
    public static Field m4265e() {
        if (AbstractC2783z2.m5355a() == false) goto L21;
        Field r0 = Buffer.class.getDeclaredField("effectiveDirectAddress");     // Catch: Throwable -> L7
    L8:
        if (r0 == null) goto L21;
        return r0;
    L7:
        r0 = null;
    L21:
        Field r02 = Buffer.class.getDeclaredField("address");     // Catch: Throwable -> L13
    L14:
        if (r02 != null) goto L16;
        return null;
    L16:
        if (r02.getType() == Long.TYPE) goto L18;
        return null;
    L18:
        return r02;
    L13:
        r02 = null;
        goto L14
    }

    /* JADX INFO: renamed from: f */
    public static boolean m4266f(Class r7) {
        if (AbstractC2783z2.m5355a() == true) goto L9;
        return false;
    L9:
        Class r1 = f7365b;     // Catch: Throwable -> L8
        Class r4 = Boolean.TYPE;     // Catch: Throwable -> L8
        r1.getMethod("peekLong", new Class[]{r7, r4});     // Catch: Throwable -> L8
        r1.getMethod("pokeLong", new Class[]{r7, Long.TYPE, r4});     // Catch: Throwable -> L8
        Class r5 = Integer.TYPE;     // Catch: Throwable -> L8
        r1.getMethod("pokeInt", new Class[]{r7, r5, r4});     // Catch: Throwable -> L8
        r1.getMethod("peekInt", new Class[]{r7, r4});     // Catch: Throwable -> L8
        r1.getMethod("pokeByte", new Class[]{r7, Byte.TYPE});     // Catch: Throwable -> L8
        r1.getMethod("peekByte", new Class[]{r7});     // Catch: Throwable -> L8
        r1.getMethod("pokeByteArray", new Class[]{r7, byte[].class, r5, r5});     // Catch: Throwable -> L8
        r1.getMethod("peekByteArray", new Class[]{r7, byte[].class, r5, r5});     // Catch: Throwable -> L8
        return true;
    L8:
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static byte m4267g(long r2, byte[] r4) {
        long r0 = f7369f + r2;
        return f7366c.mo2764d(r0, r4);
    }

    /* JADX INFO: renamed from: h */
    public static byte m4268h(long r3, Object r5) {
        AbstractC1535iD r2 = f7366c;
        return (byte) ((r2.m2906g((-4) & r3, r5) >>> ((int) (((~r3) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: i */
    public static byte m4269i(long r3, Object r5) {
        AbstractC1535iD r2 = f7366c;
        return (byte) ((r2.m2906g((-4) & r3, r5) >>> ((int) ((r3 & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: j */
    public static Unsafe m4270j() {
        return (Unsafe) AccessController.doPrivileged(new C1403fD());
    L4:
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static void m4271k(byte[] r2, long r3, byte r5) {
        long r0 = f7369f + r3;
        f7366c.mo2768l(r2, r0, r5);
    }

    /* JADX INFO: renamed from: l */
    public static void m4272l(Object r4, long r5, byte r7) {
        long r0 = (-4) & r5;
        int r2 = f7366c.m2906g(r0, r4);
        int r52 = ((~((int) r5)) & 3) << 3;
        int r22 = r2 & (~(255 << r52));
        m4274n(((255 & r7) << r52) | r22, r0, r4);
    }

    /* JADX INFO: renamed from: m */
    public static void m4273m(Object r4, long r5, byte r7) {
        long r0 = (-4) & r5;
        int r52 = (((int) r5) & 3) << 3;
        int r2 = f7366c.m2906g(r0, r4) & (~(255 << r52));
        m4274n(((255 & r7) << r52) | r2, r0, r4);
    }

    /* JADX INFO: renamed from: n */
    public static void m4274n(int r1, long r2, Object r4) {
        f7366c.m2910o(r1, r2, r4);
    }

    /* JADX INFO: renamed from: o */
    public static void m4275o(Object r6, long r7, long r9) {
        f7366c.m2911p(r6, r7, r9);
    }

    /* JADX INFO: renamed from: p */
    public static void m4276p(long r1, Object r3, Object r4) {
        f7366c.m2912q(r1, r3, r4);
    }
}
