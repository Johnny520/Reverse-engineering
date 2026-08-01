package p000A;

import java.util.List;
import p014C1.C0240b;
import p061L2.C0981u;
import p092S0.AbstractC1251D;
import p092S0.C1260M;
import p092S0.C1269g;
import p110W0.InterfaceC1580e;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;

/* JADX INFO: renamed from: A.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0090u0 {

    /* JADX INFO: renamed from: a */
    public final C1269g f402a;

    /* JADX INFO: renamed from: b */
    public final C1260M f403b;

    /* JADX INFO: renamed from: e */
    public final boolean f406e;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2007c f408g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1580e f409h;

    /* JADX INFO: renamed from: j */
    public C0240b f411j;

    /* JADX INFO: renamed from: k */
    public EnumC2017m f412k;

    /* JADX INFO: renamed from: c */
    public final int f404c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d */
    public final int f405d = 1;

    /* JADX INFO: renamed from: f */
    public final int f407f = 1;

    /* JADX INFO: renamed from: i */
    public final List f410i = C0981u.f3047d;

    public C0090u0(C1269g c1269g, C1260M c1260m, boolean z5, InterfaceC2007c interfaceC2007c, InterfaceC1580e interfaceC1580e, int i5) {
        this.f402a = c1269g;
        this.f403b = c1260m;
        this.f406e = z5;
        this.f408g = interfaceC2007c;
        this.f409h = interfaceC1580e;
    }

    /* JADX INFO: renamed from: a */
    public final void m127a(EnumC2017m enumC2017m) {
        C0240b c0240b = this.f411j;
        if (c0240b == null || enumC2017m != this.f412k || c0240b.mo425b()) {
            this.f412k = enumC2017m;
            c0240b = new C0240b(this.f402a, AbstractC1251D.m2319h(this.f403b, enumC2017m), this.f410i, this.f408g, this.f409h);
        }
        this.f411j = c0240b;
    }
}
