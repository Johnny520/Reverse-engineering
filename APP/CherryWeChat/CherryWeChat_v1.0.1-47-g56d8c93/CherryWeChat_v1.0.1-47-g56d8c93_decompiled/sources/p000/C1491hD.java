package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: hD */
/* JADX INFO: loaded from: classes.dex */
public final class C1491hD extends AbstractC1535iD {
    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: c */
    public final boolean mo2763c(long j, Object obj) {
        return this.f5418a.getBoolean(obj, j);
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: d */
    public final byte mo2764d(long j, Object obj) {
        return this.f5418a.getByte(obj, j);
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: e */
    public final double mo2765e(long j, Object obj) {
        return this.f5418a.getDouble(obj, j);
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: f */
    public final float mo2766f(long j, Object obj) {
        return this.f5418a.getFloat(obj, j);
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: k */
    public final void mo2767k(Object obj, long j, boolean z) {
        this.f5418a.putBoolean(obj, j, z);
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: l */
    public final void mo2768l(Object obj, long j, byte b) {
        this.f5418a.putByte(obj, j, b);
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: m */
    public final void mo2769m(Object obj, long j, double d) {
        this.f5418a.putDouble(obj, j, d);
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: n */
    public final void mo2770n(Object obj, long j, float f) {
        this.f5418a.putFloat(obj, j, f);
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: r */
    public final boolean mo2849r() {
        if (!super.mo2849r()) {
            return false;
        }
        try {
            Class<?> cls = this.f5418a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            AbstractC2092jD.m4261a(th);
            return false;
        }
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: s */
    public final boolean mo2771s() {
        Unsafe unsafe = this.f5418a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (AbstractC2092jD.m4265e() != null) {
                    try {
                        Class<?> cls3 = this.f5418a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        AbstractC2092jD.m4261a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                AbstractC2092jD.m4261a(th2);
            }
        }
        return false;
    }
}
