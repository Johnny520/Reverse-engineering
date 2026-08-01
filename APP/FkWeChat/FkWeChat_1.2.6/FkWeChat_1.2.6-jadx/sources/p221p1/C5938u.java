package p221p1;

import p117i.AbstractC3094x0;
import p117i.C3076o0;
import p120i2.AbstractC3167a;
import p265s1.InterfaceC7064d2;
import p305v1.C8761c;

/* JADX INFO: renamed from: p1.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5938u implements InterfaceC7064d2 {

    /* JADX INFO: renamed from: a */
    public C3076o0 f18850a;

    /* JADX INFO: renamed from: b */
    public InterfaceC7064d2 f18851b;

    @Override // p265s1.InterfaceC7064d2
    /* JADX INFO: renamed from: a */
    public C8761c mo23872a() {
        InterfaceC7064d2 interfaceC7064d2 = this.f18851b;
        if (!(interfaceC7064d2 != null)) {
            AbstractC3167a.m11956b("GraphicsContext not provided");
        }
        C8761c c8761cMo23872a = interfaceC7064d2.mo23872a();
        C3076o0 c3076o0 = this.f18850a;
        if (c3076o0 == null) {
            this.f18850a = AbstractC3094x0.m11605g(c8761cMo23872a);
            return c8761cMo23872a;
        }
        c3076o0.m11461n(c8761cMo23872a);
        return c8761cMo23872a;
    }

    @Override // p265s1.InterfaceC7064d2
    /* JADX INFO: renamed from: b */
    public void mo23873b(C8761c c8761c) {
        InterfaceC7064d2 interfaceC7064d2 = this.f18851b;
        if (interfaceC7064d2 != null) {
            interfaceC7064d2.mo23873b(c8761c);
        }
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC7064d2 m23874c() {
        return this.f18851b;
    }

    /* JADX INFO: renamed from: d */
    public final void m23875d() {
        C3076o0 c3076o0 = this.f18850a;
        if (c3076o0 != null) {
            Object[] objArr = c3076o0.f8235a;
            int i10 = c3076o0.f8236b;
            for (int i11 = 0; i11 < i10; i11++) {
                mo23873b((C8761c) objArr[i11]);
            }
            c3076o0.m11468u();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m23876e(InterfaceC7064d2 interfaceC7064d2) {
        m23875d();
        this.f18851b = interfaceC7064d2;
    }
}
