package p145jc;

import ec.AbstractC2181s0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p024b9.AbstractC1034f0;
import p193n3.AbstractC5489b;

/* JADX INFO: renamed from: jc.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3822o {

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11003q = AtomicReferenceFieldUpdater.newUpdater(C3822o.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11004r = AtomicReferenceFieldUpdater.newUpdater(C3822o.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11005s = AtomicReferenceFieldUpdater.newUpdater(C3822o.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: renamed from: d */
    public final boolean m15220d(C3822o c3822o, int i10) {
        C3822o c3822oM15229n;
        do {
            c3822oM15229n = m15229n();
            if (c3822oM15229n instanceof C3818m) {
                return (((C3818m) c3822oM15229n).f11000t & i10) == 0 && c3822oM15229n.m15220d(c3822o, i10);
            }
        } while (!c3822oM15229n.m15221e(c3822o, this));
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m15221e(C3822o c3822o, C3822o c3822o2) {
        f11004r.set(c3822o, this);
        f11003q.set(c3822o, c3822o2);
        if (!AbstractC5489b.m22334a(f11003q, this, c3822o2, c3822o)) {
            return false;
        }
        c3822o.m15226k(c3822o2);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m15222f(C3822o c3822o) {
        f11004r.set(c3822o, this);
        f11003q.set(c3822o, this);
        while (m15227l() == this) {
            if (AbstractC5489b.m22334a(f11003q, this, this, c3822o)) {
                c3822o.m15226k(this);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m15223g(int i10) {
        m15220d(new C3818m(i10), i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (p193n3.AbstractC5489b.m22334a(p145jc.C3822o.f11003q, r3, r2, ((p145jc.C3833x) r4).f11024a) != false) goto L21;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p145jc.C3822o m15224i() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = m15218p()
            java.lang.Object r0 = r0.get(r7)
            jc.o r0 = (p145jc.C3822o) r0
            r1 = 0
            r2 = r0
        Lc:
            r3 = r1
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = m15217o()
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L26
            if (r0 != r2) goto L1a
            goto L25
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = m15218p()
            boolean r0 = p193n3.AbstractC5489b.m22334a(r1, r7, r0, r2)
            if (r0 != 0) goto L25
            goto L0
        L25:
            return r2
        L26:
            boolean r5 = r7.mo15216r()
            if (r5 == 0) goto L2d
            return r1
        L2d:
            boolean r5 = r4 instanceof p145jc.C3833x
            if (r5 == 0) goto L4f
            if (r3 == 0) goto L44
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = m15217o()
            jc.x r4 = (p145jc.C3833x) r4
            jc.o r4 = r4.f11024a
            boolean r2 = p193n3.AbstractC5489b.m22334a(r5, r3, r2, r4)
            if (r2 != 0) goto L42
            goto L0
        L42:
            r2 = r3
            goto Lc
        L44:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = m15218p()
            java.lang.Object r2 = r4.get(r2)
            jc.o r2 = (p145jc.C3822o) r2
            goto Ld
        L4f:
            r4.getClass()
            r3 = r4
            jc.o r3 = (p145jc.C3822o) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: p145jc.C3822o.m15224i():jc.o");
    }

    /* JADX INFO: renamed from: j */
    public final C3822o m15225j(C3822o c3822o) {
        while (c3822o.mo15216r()) {
            c3822o = (C3822o) f11004r.get(c3822o);
        }
        return c3822o;
    }

    /* JADX INFO: renamed from: k */
    public final void m15226k(C3822o c3822o) {
        C3822o c3822o2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11004r;
        do {
            c3822o2 = (C3822o) atomicReferenceFieldUpdater.get(c3822o);
            if (m15227l() != c3822o) {
                return;
            }
        } while (!AbstractC5489b.m22334a(f11004r, c3822o, c3822o2, this));
        if (mo15216r()) {
            c3822o.m15224i();
        }
    }

    /* JADX INFO: renamed from: l */
    public final Object m15227l() {
        return f11003q.get(this);
    }

    /* JADX INFO: renamed from: m */
    public final C3822o m15228m() {
        C3822o c3822o;
        Object objM15227l = m15227l();
        C3833x c3833x = objM15227l instanceof C3833x ? (C3833x) objM15227l : null;
        if (c3833x != null && (c3822o = c3833x.f11024a) != null) {
            return c3822o;
        }
        objM15227l.getClass();
        return (C3822o) objM15227l;
    }

    /* JADX INFO: renamed from: n */
    public final C3822o m15229n() {
        C3822o c3822oM15224i = m15224i();
        return c3822oM15224i == null ? m15225j((C3822o) f11004r.get(this)) : c3822oM15224i;
    }

    /* JADX INFO: renamed from: r */
    public boolean mo15216r() {
        return m15227l() instanceof C3833x;
    }

    /* JADX INFO: renamed from: s */
    public boolean m15230s() {
        return m15231t() == null;
    }

    /* JADX INFO: renamed from: t */
    public final C3822o m15231t() {
        Object objM15227l;
        C3822o c3822o;
        do {
            objM15227l = m15227l();
            if (objM15227l instanceof C3833x) {
                return ((C3833x) objM15227l).f11024a;
            }
            if (objM15227l == this) {
                return (C3822o) objM15227l;
            }
            objM15227l.getClass();
            c3822o = (C3822o) objM15227l;
        } while (!AbstractC5489b.m22334a(f11003q, this, objM15227l, c3822o.m15232u()));
        c3822o.m15224i();
        return null;
    }

    public String toString() {
        return new AbstractC1034f0(this) { // from class: jc.o.a
            @Override // p098g9.InterfaceC2558l
            public Object get() {
                return AbstractC2181s0.m7898a(this.f3190r);
            }
        } + '@' + AbstractC2181s0.m7899b(this);
    }

    /* JADX INFO: renamed from: u */
    public final C3833x m15232u() {
        C3833x c3833x = (C3833x) f11005s.get(this);
        if (c3833x != null) {
            return c3833x;
        }
        C3833x c3833x2 = new C3833x(this);
        f11005s.set(this, c3833x2);
        return c3833x2;
    }
}
