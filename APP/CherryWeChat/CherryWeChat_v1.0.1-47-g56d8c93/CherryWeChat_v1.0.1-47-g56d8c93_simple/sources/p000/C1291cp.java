package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: cp */
/* JADX INFO: loaded from: classes.dex */
public class C1291cp {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4720a = null;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4721b = null;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4722c = null;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        f4720a = AtomicReferenceFieldUpdater.newUpdater(C1291cp.class, Object.class, "_next$volatile");
        f4721b = AtomicReferenceFieldUpdater.newUpdater(C1291cp.class, Object.class, "_prev$volatile");
        f4722c = AtomicReferenceFieldUpdater.newUpdater(C1291cp.class, Object.class, "_removedRef$volatile");
    }

    public C1291cp() {
        this._next$volatile = this;
        this._prev$volatile = this;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2526c(C1291cp r5, int r6) {
    L2:
        C1291cp r0 = m2527f();
        AtomicReferenceFieldUpdater r1 = f4721b;
        if (r0 != null) goto L10;
        Object r02 = r1.get(this);
    L5:
        r0 = (C1291cp) r02;
        if (r0.mo1687i() == false) goto L10;
        r02 = r1.get(r0);
    L10:
        if ((r0 instanceof C2510so) == true) goto L12;
        r1.set(r5, r0);
        AtomicReferenceFieldUpdater r12 = f4720a;
        r12.set(r5, this);
    L20:
        if (r12.compareAndSet(r0, this, r5) == true) goto L21;
        if (r12.get(r0) == this) goto L20;
    L21:
        r5.m2528g(this);
        return true;
    L12:
        if ((((C2510so) r0).f8797d & r6) == 0) goto L14;
        return false;
    L14:
        if (r0.m2526c(r5, r6) == false) goto L31;
        return true;
    L31:
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final C1291cp m2527f() {
    L2:
        AtomicReferenceFieldUpdater r0 = f4721b;
        C1291cp r1 = (C1291cp) r0.get(this);
        C1291cp r3 = r1;
    L3:
        C1291cp r4 = null;
    L4:
        AtomicReferenceFieldUpdater r5 = f4720a;
        Object r6 = r5.get(r3);
        if (r6 == this) goto L6;
        if (mo1687i() == true) goto L16;
        if ((r6 instanceof C0854Tv) == true) goto L19;
        r4 = r3;
        r3 = (C1291cp) r6;
        goto L4
    L19:
        if (r4 != null) goto L20;
        r3 = (C1291cp) r0.get(r3);
        goto L4
    L20:
        C1291cp r62 = ((C0854Tv) r6).f2704a;
    L22:
        if (r5.compareAndSet(r4, r3, r62) == true) goto L23;
        if (r5.get(r4) == r3) goto L22;
    L23:
        r3 = r4;
        goto L3
    L16:
        return null;
    L6:
        if (r1 == r3) goto L7;
    L9:
        if (r0.compareAndSet(this, r1, r3) == true) goto L10;
        if (r0.get(this) == r1) goto L9;
    L10:
        return r3;
    L7:
        return r3;
    }

    /* JADX INFO: renamed from: g */
    public final void m2528g(C1291cp r4) {
    L2:
        AtomicReferenceFieldUpdater r0 = f4721b;
        C1291cp r1 = (C1291cp) r0.get(r4);
        if (f4720a.get(this) != r4) goto L19;
    L6:
        if (r0.compareAndSet(r4, r1, this) == true) goto L8;
        if (r0.get(r4) == r1) goto L6;
    L8:
        if (mo1687i() == false) goto L18;
        r4.m2527f();
        return;
    L18:
        return;
    }

    /* JADX INFO: renamed from: h */
    public final C1291cp m2529h() {
        Object r0 = f4720a.get(this);
        if ((r0 instanceof C0854Tv) == false) goto L5;
        C0854Tv r1 = (C0854Tv) r0;
    L6:
        if (r1 == null) goto L12;
        C1291cp r12 = r1.f2704a;
        if (r12 == null) goto L12;
        return r12;
    L12:
        return (C1291cp) r0;
    L5:
        r1 = null;
        goto L6
    }

    /* JADX INFO: renamed from: i */
    public boolean mo1687i() {
        return f4720a.get(this) instanceof C0854Tv;
    }

    public String toString() {
        return new C1230bp(1, AbstractC0148Dc.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + AbstractC0148Dc.m278l(this);
    }
}
