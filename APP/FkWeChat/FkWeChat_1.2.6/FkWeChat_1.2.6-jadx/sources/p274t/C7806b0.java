package p274t;

import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p121i3.C3173c;
import p121i3.EnumC3191u;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3555o0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p135j2.InterfaceC3566s;
import p165l1.InterfaceC4499e;
import p172l8.C4700i0;
import p274t.C7823e;

/* JADX INFO: renamed from: t.b0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7806b0 implements InterfaceC3555o0, InterfaceC7917w2 {

    /* JADX INFO: renamed from: a */
    public final C7823e.m f26023a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4499e.b f26024b;

    public C7806b0(C7823e.m mVar, InterfaceC4499e.b bVar) {
        this.f26023a = mVar;
        this.f26024b = bVar;
    }

    /* JADX INFO: renamed from: r */
    public static C4700i0 m30239r(AbstractC3545l1[] abstractC3545l1Arr, C7806b0 c7806b0, int i10, int i11, InterfaceC3561q0 interfaceC3561q0, int[] iArr, AbstractC3545l1.a aVar) {
        int length = abstractC3545l1Arr.length;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            AbstractC3545l1 abstractC3545l1 = abstractC3545l1Arr[i12];
            abstractC3545l1.getClass();
            AbstractC3545l1.a.m13281x(aVar, abstractC3545l1, c7806b0.m30245s(abstractC3545l1, AbstractC7912v2.m30548d(abstractC3545l1), i10, i11, interfaceC3561q0.getLayoutDirection()), iArr[i13], 0.0f, 4, null);
            i12++;
            i13++;
        }
        return C4700i0.f13910a;
    }

    @Override // p274t.InterfaceC7917w2
    /* JADX INFO: renamed from: a */
    public int mo30240a(AbstractC3545l1 abstractC3545l1) {
        return abstractC3545l1.m13264M0();
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: b */
    public int mo3081b(InterfaceC3566s interfaceC3566s, List list, int i10) {
        return C7896s1.f26302a.m30493f(list, i10, interfaceC3566s.mo1236x1(this.f26023a.mo30293a()));
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: c */
    public InterfaceC3558p0 mo2920c(InterfaceC3561q0 interfaceC3561q0, List list, long j10) {
        return AbstractC7922x2.m30575a(this, C3173c.m11974m(j10), C3173c.m11975n(j10), C3173c.m11972k(j10), C3173c.m11973l(j10), interfaceC3561q0.mo1236x1(this.f26023a.mo30293a()), interfaceC3561q0, list, new AbstractC3545l1[list.size()], 0, list.size(), (3072 & 1024) != 0 ? null : null, (3072 & 2048) != 0 ? 0 : 0);
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: d */
    public int mo13327d(InterfaceC3566s interfaceC3566s, List list, int i10) {
        return C7896s1.f26302a.m30492e(list, i10, interfaceC3566s.mo1236x1(this.f26023a.mo30293a()));
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: e */
    public int mo13328e(InterfaceC3566s interfaceC3566s, List list, int i10) {
        return C7896s1.f26302a.m30495h(list, i10, interfaceC3566s.mo1236x1(this.f26023a.mo30293a()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7806b0)) {
            return false;
        }
        C7806b0 c7806b0 = (C7806b0) obj;
        return AbstractC1061t.m3842c(this.f26023a, c7806b0.f26023a) && AbstractC1061t.m3842c(this.f26024b, c7806b0.f26024b);
    }

    @Override // p274t.InterfaceC7917w2
    /* JADX INFO: renamed from: f */
    public long mo30241f(int i10, int i11, int i12, int i13, boolean z10) {
        return AbstractC7929z.m30624b(z10, i10, i11, i12, i13);
    }

    @Override // p274t.InterfaceC7917w2
    /* JADX INFO: renamed from: g */
    public InterfaceC3558p0 mo30242g(final AbstractC3545l1[] abstractC3545l1Arr, final InterfaceC3561q0 interfaceC3561q0, final int i10, final int[] iArr, int i11, final int i12, int[] iArr2, int i13, int i14, int i15) {
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, i12, i11, null, new InterfaceC0184l() { // from class: t.a0
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C7806b0.m30239r(abstractC3545l1Arr, this, i12, i10, interfaceC3561q0, iArr, (AbstractC3545l1.a) obj);
            }
        }, 4, null);
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: h */
    public int mo13329h(InterfaceC3566s interfaceC3566s, List list, int i10) {
        return C7896s1.f26302a.m30494g(list, i10, interfaceC3566s.mo1236x1(this.f26023a.mo30293a()));
    }

    public int hashCode() {
        return (this.f26023a.hashCode() * 31) + this.f26024b.hashCode();
    }

    @Override // p274t.InterfaceC7917w2
    /* JADX INFO: renamed from: i */
    public void mo30243i(int i10, int[] iArr, int[] iArr2, InterfaceC3561q0 interfaceC3561q0) {
        this.f26023a.mo30292c(interfaceC3561q0, i10, iArr, iArr2);
    }

    @Override // p274t.InterfaceC7917w2
    /* JADX INFO: renamed from: j */
    public int mo30244j(AbstractC3545l1 abstractC3545l1) {
        return abstractC3545l1.m13259G0();
    }

    /* JADX INFO: renamed from: s */
    public final int m30245s(AbstractC3545l1 abstractC3545l1, C7927y2 c7927y2, int i10, int i11, EnumC3191u enumC3191u) {
        AbstractC7835g0 abstractC7835g0M30612a = c7927y2 != null ? c7927y2.m30612a() : null;
        return abstractC7835g0M30612a != null ? abstractC7835g0M30612a.mo30361a(i10 - abstractC3545l1.m13264M0(), enumC3191u, abstractC3545l1, i11) : this.f26024b.mo17427a(0, i10 - abstractC3545l1.m13264M0(), enumC3191u);
    }

    public String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f26023a + ", horizontalAlignment=" + this.f26024b + ')';
    }
}
