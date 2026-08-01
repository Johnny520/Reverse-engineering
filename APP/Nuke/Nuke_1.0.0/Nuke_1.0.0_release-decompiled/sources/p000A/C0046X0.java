package p000A;

import p011B4.AbstractC0231b;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p029F0.InterfaceC0433x;
import p061L2.C0982v;
import p112W2.InterfaceC1599a;
import p115X0.C1624B;
import p117X2.AbstractC1665j;
import p153e1.C2005a;

/* JADX INFO: renamed from: A.X0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0046X0 implements InterfaceC0433x {

    /* JADX INFO: renamed from: a */
    public final C0029O0 f195a;

    /* JADX INFO: renamed from: b */
    public final int f196b;

    /* JADX INFO: renamed from: c */
    public final C1624B f197c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1599a f198d;

    public C0046X0(C0029O0 c0029o0, int i5, C1624B c1624b, InterfaceC1599a interfaceC1599a) {
        this.f195a = c0029o0;
        this.f196b = i5;
        this.f197c = c1624b;
        this.f198d = interfaceC1599a;
    }

    @Override // p029F0.InterfaceC0433x
    /* JADX INFO: renamed from: d */
    public final InterfaceC0378P mo59d(InterfaceC0379Q interfaceC0379Q, InterfaceC0376N interfaceC0376N, long j5) {
        AbstractC0391b0 abstractC0391b0Mo648e = interfaceC0376N.mo648e(C2005a.m3673a(j5, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(abstractC0391b0Mo648e.f1207e, C2005a.m3679g(j5));
        return interfaceC0379Q.mo604f0(abstractC0391b0Mo648e.f1206d, iMin, C0982v.f3048d, new C0044W0(this, abstractC0391b0Mo648e, iMin));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0046X0)) {
            return false;
        }
        C0046X0 c0046x0 = (C0046X0) obj;
        return AbstractC1665j.m2981a(this.f195a, c0046x0.f195a) && this.f196b == c0046x0.f196b && AbstractC1665j.m2981a(this.f197c, c0046x0.f197c) && AbstractC1665j.m2981a(this.f198d, c0046x0.f198d);
    }

    public final int hashCode() {
        return this.f198d.hashCode() + ((this.f197c.hashCode() + AbstractC0231b.m391b(this.f196b, this.f195a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f195a + ", cursorOffset=" + this.f196b + ", transformedText=" + this.f197c + ", textLayoutResultProvider=" + this.f198d + ')';
    }
}
