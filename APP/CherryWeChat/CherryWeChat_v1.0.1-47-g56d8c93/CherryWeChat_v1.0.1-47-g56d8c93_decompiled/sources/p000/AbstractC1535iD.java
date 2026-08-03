package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: iD */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1535iD {

    /* JADX INFO: renamed from: a */
    public final Unsafe f5418a;

    public AbstractC1535iD(Unsafe unsafe) {
        this.f5418a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public final int m2904a(Class cls) {
        return this.f5418a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: b */
    public final int m2905b(Class cls) {
        return this.f5418a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo2763c(long j, Object obj);

    /* JADX INFO: renamed from: d */
    public abstract byte mo2764d(long j, Object obj);

    /* JADX INFO: renamed from: e */
    public abstract double mo2765e(long j, Object obj);

    /* JADX INFO: renamed from: f */
    public abstract float mo2766f(long j, Object obj);

    /* JADX INFO: renamed from: g */
    public final int m2906g(long j, Object obj) {
        return this.f5418a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: h */
    public final long m2907h(long j, Object obj) {
        return this.f5418a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: i */
    public final Object m2908i(long j, Object obj) {
        return this.f5418a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: j */
    public final long m2909j(Field field) {
        return this.f5418a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo2767k(Object obj, long j, boolean z);

    /* JADX INFO: renamed from: l */
    public abstract void mo2768l(Object obj, long j, byte b);

    /* JADX INFO: renamed from: m */
    public abstract void mo2769m(Object obj, long j, double d);

    /* JADX INFO: renamed from: n */
    public abstract void mo2770n(Object obj, long j, float f);

    /* JADX INFO: renamed from: o */
    public final void m2910o(int i, long j, Object obj) {
        this.f5418a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: p */
    public final void m2911p(Object obj, long j, long j2) {
        this.f5418a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: q */
    public final void m2912q(long j, Object obj, Object obj2) {
        this.f5418a.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: r */
    public boolean mo2849r() {
        Unsafe unsafe = this.f5418a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            AbstractC2092jD.m4261a(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public abstract boolean mo2771s();
}
