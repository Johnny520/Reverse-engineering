package p065eb;

import gg.C1421q;
import p085fg.InterfaceC1235p;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p222p.AbstractC3222h1;
import p222p.AbstractC3241o;
import p266s0.C3878h;
import p276sf.C3967n;
import p293u2.C4238h;
import p308v1.InterfaceC4412n0;
import p321w.AbstractC4583b;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: eb.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0896u implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2780g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f2781h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2782i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0896u(long j3, Object obj, int i9) {
        this.f2780g = i9;
        this.f2781h = j3;
        this.f2782i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2780g) {
            case 0:
                return ScriptPluginRuntime.logSendButtonDiagnostic$lambda$0(this.f2781h, (C1421q) this.f2782i, (String) obj, (Long) obj2);
            default:
                InterfaceC5853o interfaceC5853o = (InterfaceC5853o) this.f2782i;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    long j3 = this.f2781h;
                    if (j3 != 9205357640488583168L) {
                        c1836h0.m4525a0(-1244013944);
                        InterfaceC5853o interfaceC5853oM6906i = AbstractC3222h1.m6906i(interfaceC5853o, C4238h.m8524b(j3), C4238h.m8523a(j3), 0.0f, 0.0f, 12);
                        InterfaceC4412n0 interfaceC4412n0M6930d = AbstractC3241o.m6930d(C5840b.f23762h, false);
                        int iHashCode = Long.hashCode(c1836h0.f6095T);
                        C3878h c3878hM4546l = c1836h0.m4546l();
                        InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853oM6906i);
                        InterfaceC5605g.f22815f.getClass();
                        C5660y c5660y = C5601f.f22758b;
                        c1836h0.m4531d0();
                        if (c1836h0.f6094S) {
                            c1836h0.m4544k(c5660y);
                        } else {
                            c1836h0.m4551n0();
                        }
                        AbstractC1874r.m4615A(C5601f.f22761e, c1836h0, interfaceC4412n0M6930d);
                        AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
                        AbstractC1874r.m4615A(C5601f.f22762f, c1836h0, Integer.valueOf(iHashCode));
                        AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
                        AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
                        AbstractC4583b.m9028b(null, c1836h0, 0, 1);
                        c1836h0.m4553p(true);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(-1243644858);
                        AbstractC4583b.m9028b(interfaceC5853o, c1836h0, 0, 0);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
        }
    }
}
