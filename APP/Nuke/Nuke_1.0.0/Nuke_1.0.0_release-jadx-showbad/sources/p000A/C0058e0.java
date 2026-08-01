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

/* JADX INFO: renamed from: A.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0058e0 implements InterfaceC0433x {

    /* JADX INFO: renamed from: a */
    public final C0029O0 f231a;

    /* JADX INFO: renamed from: b */
    public final int f232b;

    /* JADX INFO: renamed from: c */
    public final C1624B f233c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1599a f234d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0058e0(C0029O0 c0029o0, int i5, C1624B c1624b, InterfaceC1599a interfaceC1599a) {
        this.f231a = c0029o0;
        this.f232b = i5;
        this.f233c = c1624b;
        this.f234d = interfaceC1599a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0433x
    /* JADX INFO: renamed from: d */
    public final InterfaceC0378P mo59d(InterfaceC0379Q interfaceC0379Q, InterfaceC0376N interfaceC0376N, long j5) {
        long j6;
        if (interfaceC0376N.mo646X(C2005a.m3679g(j5)) < C2005a.m3680h(j5)) {
            j6 = j5;
        } else {
            j6 = j5;
            j5 = C2005a.m3673a(j6, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        AbstractC0391b0 abstractC0391b0Mo648e = interfaceC0376N.mo648e(j5);
        int iMin = Math.min(abstractC0391b0Mo648e.f1206d, C2005a.m3680h(j6));
        return interfaceC0379Q.mo604f0(iMin, abstractC0391b0Mo648e.f1207e, C0982v.f3048d, new C0056d0(this, interfaceC0379Q, abstractC0391b0Mo648e, iMin, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0058e0)) {
            return false;
        }
        C0058e0 c0058e0 = (C0058e0) obj;
        return AbstractC1665j.m2981a(this.f231a, c0058e0.f231a) && this.f232b == c0058e0.f232b && AbstractC1665j.m2981a(this.f233c, c0058e0.f233c) && AbstractC1665j.m2981a(this.f234d, c0058e0.f234d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f234d.hashCode() + ((this.f233c.hashCode() + AbstractC0231b.m391b(this.f232b, this.f231a.hashCode() * 31, 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f231a + ", cursorOffset=" + this.f232b + ", transformedText=" + this.f233c + ", textLayoutResultProvider=" + this.f234d + ')';
    }
}
