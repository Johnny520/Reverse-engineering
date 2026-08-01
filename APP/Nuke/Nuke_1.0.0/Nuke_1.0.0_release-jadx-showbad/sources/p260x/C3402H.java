package p260x;

import p011B4.AbstractC0231b;
import p041H0.AbstractC0582a0;
import p041H0.AbstractC0601k;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;
import p227r.EnumC2983d0;
import p255w.C3373d;

/* JADX INFO: renamed from: x.H */
/* JADX INFO: loaded from: classes.dex */
final class C3402H extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1599a f10635a;

    /* JADX INFO: renamed from: b */
    public final C3373d f10636b;

    /* JADX INFO: renamed from: c */
    public final EnumC2983d0 f10637c;

    /* JADX INFO: renamed from: d */
    public final boolean f10638d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3402H(InterfaceC1599a interfaceC1599a, C3373d c3373d, EnumC2983d0 enumC2983d0, boolean z5) {
        this.f10635a = interfaceC1599a;
        this.f10636b = c3373d;
        this.f10637c = enumC2983d0;
        this.f10638d = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        return new C3406L(this.f10635a, this.f10636b, this.f10637c, this.f10638d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3402H)) {
            return false;
        }
        C3402H c3402h = (C3402H) obj;
        return this.f10635a == c3402h.f10635a && AbstractC1665j.m2981a(this.f10636b, c3402h.f10636b) && this.f10637c == c3402h.f10637c && this.f10638d == c3402h.f10638d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C3406L c3406l = (C3406L) abstractC2206o;
        c3406l.f10646r = this.f10635a;
        c3406l.f10647s = this.f10636b;
        EnumC2983d0 enumC2983d0 = c3406l.f10648t;
        EnumC2983d0 enumC2983d02 = this.f10637c;
        if (enumC2983d0 != enumC2983d02) {
            c3406l.f10648t = enumC2983d02;
            AbstractC0601k.m1036l(c3406l);
        }
        boolean z5 = c3406l.f10649u;
        boolean z6 = this.f10638d;
        if (z5 == z6) {
            return;
        }
        c3406l.f10649u = z6;
        c3406l.m5674J0();
        AbstractC0601k.m1036l(c3406l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC0231b.m395f((this.f10637c.hashCode() + ((this.f10636b.hashCode() + (this.f10635a.hashCode() * 31)) * 31)) * 31, 31, this.f10638d);
    }
}
