package p274t;

import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p024b9.C1046l0;
import p121i3.AbstractC3174d;
import p121i3.C3173c;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3555o0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p165l1.InterfaceC4499e;
import p172l8.C4700i0;

/* JADX INFO: renamed from: t.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7889r implements InterfaceC3555o0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4499e f26292a;

    /* JADX INFO: renamed from: b */
    public final boolean f26293b;

    public C7889r(InterfaceC4499e interfaceC4499e, boolean z10) {
        this.f26292a = interfaceC4499e;
        this.f26293b = z10;
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m30478a(AbstractC3545l1.a aVar) {
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: f */
    public static C4700i0 m30479f(AbstractC3545l1 abstractC3545l1, InterfaceC3552n0 interfaceC3552n0, InterfaceC3561q0 interfaceC3561q0, int i10, int i11, C7889r c7889r, AbstractC3545l1.a aVar) {
        AbstractC7869n.m30429i(aVar, abstractC3545l1, interfaceC3552n0, interfaceC3561q0.getLayoutDirection(), i10, i11, c7889r.f26292a);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: g */
    public static C4700i0 m30480g(AbstractC3545l1[] abstractC3545l1Arr, List list, InterfaceC3561q0 interfaceC3561q0, C1046l0 c1046l0, C1046l0 c1046l02, C7889r c7889r, AbstractC3545l1.a aVar) {
        int length = abstractC3545l1Arr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            AbstractC3545l1 abstractC3545l1 = abstractC3545l1Arr[i10];
            abstractC3545l1.getClass();
            AbstractC7869n.m30429i(aVar, abstractC3545l1, (InterfaceC3552n0) list.get(i11), interfaceC3561q0.getLayoutDirection(), c1046l0.f3205q, c1046l02.f3205q, c7889r.f26292a);
            i10++;
            i11++;
        }
        return C4700i0.f13910a;
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: c */
    public InterfaceC3558p0 mo2920c(final InterfaceC3561q0 interfaceC3561q0, final List list, long j10) {
        int iM11974m;
        final int i10;
        final AbstractC3545l1 abstractC3545l1Mo13148X;
        if (list.isEmpty()) {
            return InterfaceC3561q0.m13345n0(interfaceC3561q0, C3173c.m11975n(j10), C3173c.m11974m(j10), null, new InterfaceC0184l() { // from class: t.o
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return C7889r.m30478a((AbstractC3545l1.a) obj);
                }
            }, 4, null);
        }
        long jM11963b = this.f26293b ? j10 : C3173c.m11963b((-8589934589L) & j10);
        if (list.size() == 1) {
            final InterfaceC3552n0 interfaceC3552n0 = (InterfaceC3552n0) list.get(0);
            if (AbstractC7869n.m30427g(interfaceC3552n0)) {
                int iM11975n = C3173c.m11975n(j10);
                iM11974m = C3173c.m11974m(j10);
                i10 = iM11975n;
                abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(C3173c.f8451b.m11981c(C3173c.m11975n(j10), C3173c.m11974m(j10)));
            } else {
                AbstractC3545l1 abstractC3545l1Mo13148X2 = interfaceC3552n0.mo13148X(jM11963b);
                int iMax = Math.max(C3173c.m11975n(j10), abstractC3545l1Mo13148X2.m13264M0());
                iM11974m = Math.max(C3173c.m11974m(j10), abstractC3545l1Mo13148X2.m13259G0());
                i10 = iMax;
                abstractC3545l1Mo13148X = abstractC3545l1Mo13148X2;
            }
            final int i11 = iM11974m;
            return InterfaceC3561q0.m13345n0(interfaceC3561q0, i10, i11, null, new InterfaceC0184l() { // from class: t.p
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return C7889r.m30479f(abstractC3545l1Mo13148X, interfaceC3552n0, interfaceC3561q0, i10, i11, this, (AbstractC3545l1.a) obj);
                }
            }, 4, null);
        }
        final AbstractC3545l1[] abstractC3545l1Arr = new AbstractC3545l1[list.size()];
        final C1046l0 c1046l0 = new C1046l0();
        c1046l0.f3205q = C3173c.m11975n(j10);
        final C1046l0 c1046l02 = new C1046l0();
        c1046l02.f3205q = C3173c.m11974m(j10);
        int size = list.size();
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC3552n0 interfaceC3552n02 = (InterfaceC3552n0) list.get(i12);
            if (AbstractC7869n.m30427g(interfaceC3552n02)) {
                z10 = true;
            } else {
                AbstractC3545l1 abstractC3545l1Mo13148X3 = interfaceC3552n02.mo13148X(jM11963b);
                abstractC3545l1Arr[i12] = abstractC3545l1Mo13148X3;
                c1046l0.f3205q = Math.max(c1046l0.f3205q, abstractC3545l1Mo13148X3.m13264M0());
                c1046l02.f3205q = Math.max(c1046l02.f3205q, abstractC3545l1Mo13148X3.m13259G0());
            }
        }
        if (z10) {
            int i13 = c1046l0.f3205q;
            int i14 = i13 != Integer.MAX_VALUE ? i13 : 0;
            int i15 = c1046l02.f3205q;
            long jM11984a = AbstractC3174d.m11984a(i14, i13, i15 != Integer.MAX_VALUE ? i15 : 0, i15);
            int size2 = list.size();
            for (int i16 = 0; i16 < size2; i16++) {
                InterfaceC3552n0 interfaceC3552n03 = (InterfaceC3552n0) list.get(i16);
                if (AbstractC7869n.m30427g(interfaceC3552n03)) {
                    abstractC3545l1Arr[i16] = interfaceC3552n03.mo13148X(jM11984a);
                }
            }
        }
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, c1046l0.f3205q, c1046l02.f3205q, null, new InterfaceC0184l() { // from class: t.q
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C7889r.m30480g(abstractC3545l1Arr, list, interfaceC3561q0, c1046l0, c1046l02, this, (AbstractC3545l1.a) obj);
            }
        }, 4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7889r)) {
            return false;
        }
        C7889r c7889r = (C7889r) obj;
        return AbstractC1061t.m3842c(this.f26292a, c7889r.f26292a) && this.f26293b == c7889r.f26293b;
    }

    public int hashCode() {
        return (this.f26292a.hashCode() * 31) + Boolean.hashCode(this.f26293b);
    }

    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f26292a + ", propagateMinConstraints=" + this.f26293b + ')';
    }
}
