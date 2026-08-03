package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: iD */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1535iD {

    /* JADX INFO: renamed from: a */
    public final Unsafe f5418a;

    public AbstractC1535iD(Unsafe r1) {
        this.f5418a = r1;
    }

    /* JADX INFO: renamed from: a */
    public final int m2904a(Class r2) {
        return this.f5418a.arrayBaseOffset(r2);
    }

    /* JADX INFO: renamed from: b */
    public final int m2905b(Class r2) {
        return this.f5418a.arrayIndexScale(r2);
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo2763c(long r1, Object r3);

    /* JADX INFO: renamed from: d */
    public abstract byte mo2764d(long r1, Object r3);

    /* JADX INFO: renamed from: e */
    public abstract double mo2765e(long r1, Object r3);

    /* JADX INFO: renamed from: f */
    public abstract float mo2766f(long r1, Object r3);

    /* JADX INFO: renamed from: g */
    public final int m2906g(long r2, Object r4) {
        return this.f5418a.getInt(r4, r2);
    }

    /* JADX INFO: renamed from: h */
    public final long m2907h(long r2, Object r4) {
        return this.f5418a.getLong(r4, r2);
    }

    /* JADX INFO: renamed from: i */
    public final Object m2908i(long r2, Object r4) {
        return this.f5418a.getObject(r4, r2);
    }

    /* JADX INFO: renamed from: j */
    public final long m2909j(Field r3) {
        return this.f5418a.objectFieldOffset(r3);
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo2767k(Object r1, long r2, boolean r4);

    /* JADX INFO: renamed from: l */
    public abstract void mo2768l(Object r1, long r2, byte r4);

    /* JADX INFO: renamed from: m */
    public abstract void mo2769m(Object r1, long r2, double r4);

    /* JADX INFO: renamed from: n */
    public abstract void mo2770n(Object r1, long r2, float r4);

    /* JADX INFO: renamed from: o */
    public final void m2910o(int r2, long r3, Object r5) {
        this.f5418a.putInt(r5, r3, r2);
    }

    /* JADX INFO: renamed from: p */
    public final void m2911p(Object r7, long r8, long r10) {
        this.f5418a.putLong(r7, r8, r10);
    }

    /* JADX INFO: renamed from: q */
    public final void m2912q(long r2, Object r4, Object r5) {
        this.f5418a.putObject(r4, r2, r5);
    }

    /* JADX INFO: renamed from: r */
    public boolean mo2849r() {
        Unsafe r2 = this.f5418a;
        if (r2 != null) goto L11;
        return false;
    L11:
        Class<?> r22 = r2.getClass();     // Catch: Throwable -> L8
        r22.getMethod("objectFieldOffset", new Class[]{Field.class});     // Catch: Throwable -> L8
        r22.getMethod("arrayBaseOffset", new Class[]{Class.class});     // Catch: Throwable -> L8
        r22.getMethod("arrayIndexScale", new Class[]{Class.class});     // Catch: Throwable -> L8
        Class r4 = Long.TYPE;     // Catch: Throwable -> L8
        r22.getMethod("getInt", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
        r22.getMethod("putInt", new Class[]{Object.class, r4, Integer.TYPE});     // Catch: Throwable -> L8
        r22.getMethod("getLong", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
        r22.getMethod("putLong", new Class[]{Object.class, r4, r4});     // Catch: Throwable -> L8
        r22.getMethod("getObject", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
        r22.getMethod("putObject", new Class[]{Object.class, r4, Object.class});     // Catch: Throwable -> L8
        return true;
    L8:
        th = move-exception;
        AbstractC2092jD.m4261a(th);
        return false;
    }

    /* JADX INFO: renamed from: s */
    public abstract boolean mo2771s();
}
