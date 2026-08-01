package p260x;

import p007B0.C0172E;
import p041H0.InterfaceC0632z0;
import p077P0.AbstractC1124k;
import p077P0.AbstractC1132s;
import p077P0.AbstractC1134u;
import p077P0.C1114a;
import p077P0.C1116c;
import p077P0.C1122i;
import p077P0.C1135v;
import p077P0.InterfaceC1136w;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p137b3.InterfaceC1855c;
import p169h0.AbstractC2206o;
import p227r.EnumC2983d0;
import p255w.C3373d;

/* JADX INFO: renamed from: x.L */
/* JADX INFO: loaded from: classes.dex */
public final class C3406L extends AbstractC2206o implements InterfaceC0632z0 {

    /* JADX INFO: renamed from: r */
    public InterfaceC1599a f10646r;

    /* JADX INFO: renamed from: s */
    public C3373d f10647s;

    /* JADX INFO: renamed from: t */
    public EnumC2983d0 f10648t;

    /* JADX INFO: renamed from: u */
    public boolean f10649u;

    /* JADX INFO: renamed from: v */
    public C1122i f10650v;

    /* JADX INFO: renamed from: w */
    public final C3403I f10651w = new C3403I(this, 0);

    /* JADX INFO: renamed from: x */
    public C3403I f10652x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3406L(InterfaceC1599a interfaceC1599a, C3373d c3373d, EnumC2983d0 enumC2983d0, boolean z5) {
        this.f10646r = interfaceC1599a;
        this.f10647s = c3373d;
        this.f10648t = enumC2983d0;
        this.f10649u = z5;
        m5674J0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public final void m5674J0() {
        this.f10650v = new C1122i(new C3404J(this, 0), new C3404J(this, 1));
        this.f10652x = this.f10649u ? new C3403I(this, 1) : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0632z0
    /* JADX INFO: renamed from: X */
    public final void mo943X(InterfaceC1136w interfaceC1136w) {
        InterfaceC1855c[] interfaceC1855cArr = AbstractC1134u.f3766a;
        C1135v c1135v = AbstractC1132s.f3750m;
        InterfaceC1855c[] interfaceC1855cArr2 = AbstractC1134u.f3766a;
        InterfaceC1855c interfaceC1855c = interfaceC1855cArr2[6];
        interfaceC1136w.mo1128a(c1135v, Boolean.TRUE);
        interfaceC1136w.mo1128a(AbstractC1132s.f3734M, this.f10651w);
        if (this.f10648t == EnumC2983d0.f9447d) {
            C1122i c1122i = this.f10650v;
            if (c1122i == null) {
                AbstractC1665j.m2991k("scrollAxisRange");
                throw null;
            }
            C1135v c1135v2 = AbstractC1132s.f3759v;
            InterfaceC1855c interfaceC1855c2 = interfaceC1855cArr2[13];
            interfaceC1136w.mo1128a(c1135v2, c1122i);
        } else {
            C1122i c1122i2 = this.f10650v;
            if (c1122i2 == null) {
                AbstractC1665j.m2991k("scrollAxisRange");
                throw null;
            }
            C1135v c1135v3 = AbstractC1132s.f3758u;
            InterfaceC1855c interfaceC1855c3 = interfaceC1855cArr2[12];
            interfaceC1136w.mo1128a(c1135v3, c1122i2);
        }
        C3403I c3403i = this.f10652x;
        if (c3403i != null) {
            interfaceC1136w.mo1128a(AbstractC1124k.f3681f, new C1114a(null, c3403i));
        }
        interfaceC1136w.mo1128a(AbstractC1124k.f3675C, new C1114a(null, new C0172E(15, new C3404J(this, 2))));
        C3373d c3373d = this.f10647s;
        c3373d.getClass();
        C1116c c1116c = new C1116c(((Number) c3373d.f10487a.getValue()).intValue(), 1);
        C1135v c1135v4 = AbstractC1132s.f3743f;
        InterfaceC1855c interfaceC1855c4 = interfaceC1855cArr2[23];
        interfaceC1136w.mo1128a(c1135v4, c1116c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: y0 */
    public final boolean mo656y0() {
        return false;
    }
}
