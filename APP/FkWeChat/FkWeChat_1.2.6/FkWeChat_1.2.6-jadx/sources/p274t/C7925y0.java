package p274t;

import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p117i.C3069l;
import p121i3.C3173c;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3563r;
import p172l8.C4700i0;
import p215oc.C5729x;
import p274t.AbstractC7910v0;
import p274t.C7870n0;
import p376zd.C10010p0;

/* JADX INFO: renamed from: t.y0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7925y0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC7910v0.a f26404a;

    /* JADX INFO: renamed from: b */
    public final int f26405b;

    /* JADX INFO: renamed from: c */
    public final int f26406c;

    /* JADX INFO: renamed from: d */
    public final String f26407d = "Accessing shownItemCount before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.";

    /* JADX INFO: renamed from: e */
    public int f26408e = -1;

    /* JADX INFO: renamed from: f */
    public int f26409f;

    /* JADX INFO: renamed from: g */
    public InterfaceC3552n0 f26410g;

    /* JADX INFO: renamed from: h */
    public AbstractC3545l1 f26411h;

    /* JADX INFO: renamed from: i */
    public InterfaceC3552n0 f26412i;

    /* JADX INFO: renamed from: j */
    public AbstractC3545l1 f26413j;

    /* JADX INFO: renamed from: k */
    public C3069l f26414k;

    /* JADX INFO: renamed from: l */
    public C3069l f26415l;

    /* JADX INFO: renamed from: m */
    public InterfaceC0188p f26416m;

    /* JADX INFO: renamed from: t.y0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26417a;

        static {
            int[] iArr = new int[AbstractC7910v0.a.values().length];
            try {
                iArr[AbstractC7910v0.a.f26365q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC7910v0.a.f26366r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC7910v0.a.f26367s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC7910v0.a.f26368t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f26417a = iArr;
        }
    }

    public C7925y0(AbstractC7910v0.a aVar, int i10, int i11) {
        this.f26404a = aVar;
        this.f26405b = i10;
        this.f26406c = i11;
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m30600a(C7925y0 c7925y0, InterfaceC7807b1 interfaceC7807b1, AbstractC3545l1 abstractC3545l1) {
        int iMo30244j;
        int iMo30240a;
        if (abstractC3545l1 != null) {
            iMo30244j = interfaceC7807b1.mo30244j(abstractC3545l1);
            iMo30240a = interfaceC7807b1.mo30240a(abstractC3545l1);
        } else {
            iMo30244j = 0;
            iMo30240a = 0;
        }
        c7925y0.f26414k = C3069l.m11390a(C3069l.m11391b(iMo30244j, iMo30240a));
        c7925y0.f26411h = abstractC3545l1;
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m30601b(C7925y0 c7925y0, InterfaceC7807b1 interfaceC7807b1, AbstractC3545l1 abstractC3545l1) {
        int iMo30244j;
        int iMo30240a;
        if (abstractC3545l1 != null) {
            iMo30244j = interfaceC7807b1.mo30244j(abstractC3545l1);
            iMo30240a = interfaceC7807b1.mo30240a(abstractC3545l1);
        } else {
            iMo30244j = 0;
            iMo30240a = 0;
        }
        c7925y0.f26415l = C3069l.m11390a(C3069l.m11391b(iMo30244j, iMo30240a));
        c7925y0.f26413j = abstractC3545l1;
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public final C7870n0.a m30602c(boolean z10, int i10, int i11) {
        InterfaceC3552n0 interfaceC3552n0;
        C3069l c3069l;
        AbstractC3545l1 abstractC3545l1;
        InterfaceC3552n0 interfaceC3552n02;
        AbstractC3545l1 abstractC3545l12;
        int i12 = a.f26417a[this.f26404a.ordinal()];
        if (i12 == 1 || i12 == 2) {
            return null;
        }
        if (i12 != 3 && i12 != 4) {
            C5729x.m23182a();
            return null;
        }
        if (z10) {
            InterfaceC0188p interfaceC0188p = this.f26416m;
            if (interfaceC0188p == null || (interfaceC3552n0 = (InterfaceC3552n0) interfaceC0188p.invoke(Boolean.TRUE, Integer.valueOf(m30605f()))) == null) {
                interfaceC3552n0 = this.f26410g;
            }
            c3069l = this.f26414k;
            if (this.f26416m == null) {
                abstractC3545l1 = this.f26411h;
                interfaceC3552n02 = interfaceC3552n0;
                abstractC3545l12 = abstractC3545l1;
            }
            interfaceC3552n02 = interfaceC3552n0;
            abstractC3545l12 = null;
        } else {
            if (i10 < this.f26405b - 1 || i11 < this.f26406c) {
                interfaceC3552n0 = null;
            } else {
                InterfaceC0188p interfaceC0188p2 = this.f26416m;
                if (interfaceC0188p2 == null || (interfaceC3552n0 = (InterfaceC3552n0) interfaceC0188p2.invoke(Boolean.FALSE, Integer.valueOf(m30605f()))) == null) {
                    interfaceC3552n0 = this.f26412i;
                }
            }
            c3069l = this.f26415l;
            if (this.f26416m == null) {
                abstractC3545l1 = this.f26413j;
                interfaceC3552n02 = interfaceC3552n0;
                abstractC3545l12 = abstractC3545l1;
            }
            interfaceC3552n02 = interfaceC3552n0;
            abstractC3545l12 = null;
        }
        if (interfaceC3552n02 == null) {
            return null;
        }
        c3069l.getClass();
        return new C7870n0.a(interfaceC3552n02, abstractC3545l12, c3069l.m11398i(), false, 8, null);
    }

    /* JADX INFO: renamed from: d */
    public final C3069l m30603d(boolean z10, int i10, int i11) {
        int i12 = a.f26417a[this.f26404a.ordinal()];
        if (i12 != 1 && i12 != 2) {
            if (i12 != 3) {
                if (i12 != 4) {
                    C5729x.m23182a();
                    return null;
                }
                if (z10) {
                    return this.f26414k;
                }
                if (i10 + 1 < this.f26405b || i11 < this.f26406c) {
                    return null;
                }
                return this.f26415l;
            }
            if (z10) {
                return this.f26414k;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final int m30604e() {
        return this.f26405b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7925y0)) {
            return false;
        }
        C7925y0 c7925y0 = (C7925y0) obj;
        return this.f26404a == c7925y0.f26404a && this.f26405b == c7925y0.f26405b && this.f26406c == c7925y0.f26406c;
    }

    /* JADX INFO: renamed from: f */
    public final int m30605f() {
        int i10 = this.f26408e;
        if (i10 != -1) {
            return i10;
        }
        C10010p0.m38820a(this.f26407d);
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC7910v0.a m30606g() {
        return this.f26404a;
    }

    /* JADX INFO: renamed from: h */
    public final void m30607h(int i10) {
        this.f26409f = i10;
    }

    public int hashCode() {
        return (((this.f26404a.hashCode() * 31) + Integer.hashCode(this.f26405b)) * 31) + Integer.hashCode(this.f26406c);
    }

    /* JADX INFO: renamed from: i */
    public final void m30608i(int i10) {
        this.f26408e = i10;
    }

    /* JADX INFO: renamed from: j */
    public final void m30609j(InterfaceC3563r interfaceC3563r, InterfaceC3563r interfaceC3563r2, boolean z10, long j10) {
        long jM30371c = AbstractC7842h2.m30371c(j10, z10 ? EnumC7926y1.f26418q : EnumC7926y1.f26419r);
        if (interfaceC3563r != null) {
            int iM30533l = AbstractC7905u0.m30533l(interfaceC3563r, z10, C3173c.m11972k(jM30371c));
            this.f26414k = C3069l.m11390a(C3069l.m11391b(iM30533l, AbstractC7905u0.m30531j(interfaceC3563r, z10, iM30533l)));
            this.f26410g = interfaceC3563r instanceof InterfaceC3552n0 ? (InterfaceC3552n0) interfaceC3563r : null;
            this.f26411h = null;
        }
        if (interfaceC3563r2 != null) {
            int iM30533l2 = AbstractC7905u0.m30533l(interfaceC3563r2, z10, C3173c.m11972k(jM30371c));
            this.f26415l = C3069l.m11390a(C3069l.m11391b(iM30533l2, AbstractC7905u0.m30531j(interfaceC3563r2, z10, iM30533l2)));
            this.f26412i = interfaceC3563r2 instanceof InterfaceC3552n0 ? (InterfaceC3552n0) interfaceC3563r2 : null;
            this.f26413j = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m30610k(final InterfaceC7807b1 interfaceC7807b1, InterfaceC3552n0 interfaceC3552n0, InterfaceC3552n0 interfaceC3552n02, long j10) {
        EnumC7926y1 enumC7926y1 = interfaceC7807b1.mo30251q() ? EnumC7926y1.f26418q : EnumC7926y1.f26419r;
        long jM30374f = AbstractC7842h2.m30374f(AbstractC7842h2.m30373e(AbstractC7842h2.m30371c(j10, enumC7926y1), 0, 0, 0, 0, 10, null), enumC7926y1);
        if (interfaceC3552n0 != null) {
            AbstractC7905u0.m30534m(interfaceC3552n0, interfaceC7807b1, jM30374f, new InterfaceC0184l() { // from class: t.w0
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return C7925y0.m30600a(this.f26379q, interfaceC7807b1, (AbstractC3545l1) obj);
                }
            });
            this.f26410g = interfaceC3552n0;
        }
        if (interfaceC3552n02 != null) {
            AbstractC7905u0.m30534m(interfaceC3552n02, interfaceC7807b1, jM30374f, new InterfaceC0184l() { // from class: t.x0
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return C7925y0.m30601b(this.f26384q, interfaceC7807b1, (AbstractC3545l1) obj);
                }
            });
            this.f26412i = interfaceC3552n02;
        }
    }

    public String toString() {
        return "FlowLayoutOverflowState(type=" + this.f26404a + ", minLinesToShowCollapse=" + this.f26405b + ", minCrossAxisSizeToShowCollapse=" + this.f26406c + ')';
    }
}
