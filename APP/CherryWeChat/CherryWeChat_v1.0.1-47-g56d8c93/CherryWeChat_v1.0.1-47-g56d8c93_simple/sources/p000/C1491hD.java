package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: hD */
/* JADX INFO: loaded from: classes.dex */
public final class C1491hD extends AbstractC1535iD {
    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: c */
    public final boolean mo2763c(long r2, Object r4) {
        return this.f5418a.getBoolean(r4, r2);
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: d */
    public final byte mo2764d(long r2, Object r4) {
        return this.f5418a.getByte(r4, r2);
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: e */
    public final double mo2765e(long r2, Object r4) {
        return this.f5418a.getDouble(r4, r2);
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: f */
    public final float mo2766f(long r2, Object r4) {
        return this.f5418a.getFloat(r4, r2);
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: k */
    public final void mo2767k(Object r2, long r3, boolean r5) {
        this.f5418a.putBoolean(r2, r3, r5);
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: l */
    public final void mo2768l(Object r2, long r3, byte r5) {
        this.f5418a.putByte(r2, r3, r5);
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: m */
    public final void mo2769m(Object r7, long r8, double r10) {
        this.f5418a.putDouble(r7, r8, r10);
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: n */
    public final void mo2770n(Object r2, long r3, float r5) {
        this.f5418a.putFloat(r2, r3, r5);
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: r */
    public final boolean mo2849r() {
        if (super.mo2849r() == true) goto L11;
        return false;
    L11:
        Class<?> r1 = this.f5418a.getClass();     // Catch: Throwable -> L8
        Class r4 = Long.TYPE;     // Catch: Throwable -> L8
        r1.getMethod("getByte", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
        r1.getMethod("putByte", new Class[]{Object.class, r4, Byte.TYPE});     // Catch: Throwable -> L8
        r1.getMethod("getBoolean", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
        r1.getMethod("putBoolean", new Class[]{Object.class, r4, Boolean.TYPE});     // Catch: Throwable -> L8
        r1.getMethod("getFloat", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
        r1.getMethod("putFloat", new Class[]{Object.class, r4, Float.TYPE});     // Catch: Throwable -> L8
        r1.getMethod("getDouble", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
        r1.getMethod("putDouble", new Class[]{Object.class, r4, Double.TYPE});     // Catch: Throwable -> L8
        return true;
    L8:
        th = move-exception;
        AbstractC2092jD.m4261a(th);
        return false;
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: s */
    public final boolean mo2771s() {
        Unsafe r3 = this.f5418a;
        if (r3 != null) goto L19;
    L16:
        return false;
    L19:
        Class<?> r32 = r3.getClass();     // Catch: Throwable -> L14
        r32.getMethod("objectFieldOffset", new Class[]{Field.class});     // Catch: Throwable -> L14
        Class r5 = Long.TYPE;     // Catch: Throwable -> L14
        r32.getMethod("getLong", new Class[]{Object.class, r5});     // Catch: Throwable -> L14
        if (AbstractC2092jD.m4265e() == null) goto L16;
        Class<?> r33 = this.f5418a.getClass();     // Catch: Throwable -> L11
        r33.getMethod("getByte", new Class[]{r5});     // Catch: Throwable -> L11
        r33.getMethod("putByte", new Class[]{r5, Byte.TYPE});     // Catch: Throwable -> L11
        r33.getMethod("getInt", new Class[]{r5});     // Catch: Throwable -> L11
        r33.getMethod("putInt", new Class[]{r5, Integer.TYPE});     // Catch: Throwable -> L11
        r33.getMethod("getLong", new Class[]{r5});     // Catch: Throwable -> L11
        r33.getMethod("putLong", new Class[]{r5, r5});     // Catch: Throwable -> L11
        r33.getMethod("copyMemory", new Class[]{r5, r5, r5});     // Catch: Throwable -> L11
        r33.getMethod("copyMemory", new Class[]{Object.class, r5, Object.class, r5, r5});     // Catch: Throwable -> L11
        return true;
    L11:
        th = move-exception;
        AbstractC2092jD.m4261a(th);
        return false;
    L14:
        th = move-exception;
        AbstractC2092jD.m4261a(th);
        goto L16
    }
}
