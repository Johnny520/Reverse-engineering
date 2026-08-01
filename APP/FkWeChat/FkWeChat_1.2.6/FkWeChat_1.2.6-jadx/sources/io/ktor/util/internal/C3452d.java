package io.ktor.util.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p024b9.AbstractC1052o0;
import p193n3.AbstractC5489b;
import p376zd.C10010p0;

/* JADX INFO: renamed from: io.ktor.util.internal.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C3452d {

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9520q = AtomicReferenceFieldUpdater.newUpdater(C3452d.class, Object.class, "_next");

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9521r = AtomicReferenceFieldUpdater.newUpdater(C3452d.class, Object.class, "_prev");

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9522s = AtomicReferenceFieldUpdater.newUpdater(C3452d.class, Object.class, "removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object removedRef = null;

    /* JADX INFO: renamed from: b */
    public final void m12864b(C3452d c3452d) {
        Object objM12872k;
        c3452d.getClass();
        do {
            objM12872k = m12872k();
            objM12872k.getClass();
        } while (!((C3452d) objM12872k).m12865c(c3452d, this));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12865c(C3452d c3452d, C3452d c3452d2) {
        c3452d.getClass();
        c3452d2.getClass();
        f9521r.lazySet(c3452d, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9520q;
        atomicReferenceFieldUpdater.lazySet(c3452d, c3452d2);
        if (!AbstractC5489b.m22334a(atomicReferenceFieldUpdater, this, c3452d2, c3452d)) {
            return false;
        }
        c3452d.m12868f(c3452d2);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final C3452d m12866d(C3452d c3452d, AbstractC3453e abstractC3453e) {
        Object obj;
        while (true) {
            C3452d c3452d2 = null;
            while (true) {
                obj = c3452d._next;
                if (obj == abstractC3453e) {
                    return c3452d;
                }
                if (!(obj instanceof C3454f)) {
                    Object obj2 = this._prev;
                    if (obj2 instanceof C3454f) {
                        return null;
                    }
                    if (obj != this) {
                        obj.getClass();
                        c3452d2 = c3452d;
                        c3452d = (C3452d) obj;
                    } else {
                        if (obj2 == c3452d) {
                            return null;
                        }
                        if (AbstractC5489b.m22334a(f9521r, this, obj2, c3452d) && !(c3452d._prev instanceof C3454f)) {
                            return null;
                        }
                    }
                } else {
                    if (c3452d2 != null) {
                        break;
                    }
                    c3452d = AbstractC3451c.m12863a(c3452d._prev);
                }
            }
            c3452d.m12874m();
            AbstractC5489b.m22334a(f9520q, c3452d2, c3452d, ((C3454f) obj).f9523a);
            c3452d = c3452d2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final C3452d m12867e() {
        C3452d c3452dM12871j = this;
        while (!(c3452dM12871j instanceof C3450b)) {
            c3452dM12871j = c3452dM12871j.m12871j();
            if (c3452dM12871j == this) {
                C10010p0.m38820a("Cannot loop to this while looking for list head");
                return null;
            }
        }
        return c3452dM12871j;
    }

    /* JADX INFO: renamed from: f */
    public final void m12868f(C3452d c3452d) {
        Object obj;
        do {
            obj = c3452d._prev;
            if ((obj instanceof C3454f) || m12870i() != c3452d) {
                return;
            }
        } while (!AbstractC5489b.m22334a(f9521r, c3452d, obj, this));
        if (m12870i() instanceof C3454f) {
            obj.getClass();
            c3452d.m12866d((C3452d) obj, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m12869g(C3452d c3452d) {
        m12873l();
        c3452d.m12866d(AbstractC3451c.m12863a(this._prev), null);
    }

    /* JADX INFO: renamed from: i */
    public final Object m12870i() {
        return this._next;
    }

    /* JADX INFO: renamed from: j */
    public final C3452d m12871j() {
        return AbstractC3451c.m12863a(m12870i());
    }

    /* JADX INFO: renamed from: k */
    public final Object m12872k() {
        while (true) {
            Object obj = this._prev;
            if (obj instanceof C3454f) {
                return obj;
            }
            obj.getClass();
            C3452d c3452d = (C3452d) obj;
            if (c3452d.m12870i() == this) {
                return obj;
            }
            m12866d(c3452d, null);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m12873l() {
        Object objM12870i;
        C3452d c3452dM12874m = m12874m();
        Object obj = this._next;
        obj.getClass();
        C3452d c3452d = ((C3454f) obj).f9523a;
        while (true) {
            C3452d c3452d2 = null;
            while (true) {
                Object objM12870i2 = c3452d.m12870i();
                if (objM12870i2 instanceof C3454f) {
                    c3452d.m12874m();
                    c3452d = ((C3454f) objM12870i2).f9523a;
                } else {
                    objM12870i = c3452dM12874m.m12870i();
                    if (objM12870i instanceof C3454f) {
                        if (c3452d2 != null) {
                            break;
                        } else {
                            c3452dM12874m = AbstractC3451c.m12863a(c3452dM12874m._prev);
                        }
                    } else if (objM12870i != this) {
                        objM12870i.getClass();
                        C3452d c3452d3 = (C3452d) objM12870i;
                        if (c3452d3 == c3452d) {
                            return;
                        }
                        c3452d2 = c3452dM12874m;
                        c3452dM12874m = c3452d3;
                    } else if (AbstractC5489b.m22334a(f9520q, c3452dM12874m, this, c3452d)) {
                        return;
                    }
                }
            }
            c3452dM12874m.m12874m();
            AbstractC5489b.m22334a(f9520q, c3452d2, c3452dM12874m, ((C3454f) objM12870i).f9523a);
            c3452dM12874m = c3452d2;
        }
    }

    /* JADX INFO: renamed from: m */
    public final C3452d m12874m() {
        Object obj;
        C3452d c3452dM12867e;
        do {
            obj = this._prev;
            if (obj instanceof C3454f) {
                return ((C3454f) obj).f9523a;
            }
            if (obj == this) {
                c3452dM12867e = m12867e();
            } else {
                obj.getClass();
                c3452dM12867e = (C3452d) obj;
            }
        } while (!AbstractC5489b.m22334a(f9521r, this, obj, c3452dM12867e.m12876o()));
        return (C3452d) obj;
    }

    /* JADX INFO: renamed from: n */
    public boolean m12875n() {
        Object objM12870i;
        C3452d c3452d;
        do {
            objM12870i = m12870i();
            if ((objM12870i instanceof C3454f) || objM12870i == this) {
                return false;
            }
            objM12870i.getClass();
            c3452d = (C3452d) objM12870i;
        } while (!AbstractC5489b.m22334a(f9520q, this, objM12870i, c3452d.m12876o()));
        m12869g(c3452d);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final C3454f m12876o() {
        C3454f c3454f = (C3454f) this.removedRef;
        if (c3454f != null) {
            return c3454f;
        }
        C3454f c3454f2 = new C3454f(this);
        f9522s.lazySet(this, c3454f2);
        return c3454f2;
    }

    public String toString() {
        return AbstractC1052o0.m3807b(getClass()).mo3794w() + '@' + hashCode();
    }
}
