package p000A;

import com.bumptech.glide.AbstractC1926h;
import java.util.List;
import p014C1.C0240b;
import p029F0.AbstractC0394d;
import p029F0.InterfaceC0377O;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p029F0.InterfaceC0420q;
import p056K2.C0882h;
import p061L2.AbstractC0984x;
import p092S0.C1256I;
import p092S0.C1257J;
import p092S0.C1260M;
import p092S0.C1269g;
import p092S0.C1277o;
import p110W0.InterfaceC1580e;
import p112W2.InterfaceC1601c;
import p115X0.C1646u;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p153e1.AbstractC2006b;
import p153e1.C2005a;
import p153e1.C2010f;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p158f0.AbstractC2074f;
import p158f0.AbstractC2086r;
import p203n.C2654f0;

/* JADX INFO: renamed from: A.N */
/* JADX INFO: loaded from: classes.dex */
public final class C0026N implements InterfaceC0377O {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0078o0 f132a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1601c f133b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1646u f134c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0042V0 f135d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC2007c f136e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f137f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0026N(C0078o0 c0078o0, InterfaceC1601c interfaceC1601c, C1646u c1646u, C0042V0 c0042v0, InterfaceC2007c interfaceC2007c, int i5) {
        this.f132a = c0078o0;
        this.f133b = interfaceC1601c;
        this.f134c = c1646u;
        this.f135d = c0042v0;
        this.f136e = interfaceC2007c;
        this.f137f = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: f */
    public final int mo15f(InterfaceC0420q interfaceC0420q, List list, int i5) {
        C0078o0 c0078o0 = this.f132a;
        c0078o0.f337a.m127a(interfaceC0420q.getLayoutDirection());
        C0240b c0240b = c0078o0.f337a.f411j;
        if (c0240b != null) {
            return AbstractC0070k0.m83j(c0240b.mo426c());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f3  */
    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0378P mo16i(InterfaceC0379Q interfaceC0379Q, List list, long j5) {
        long j6;
        C0078o0 c0078o0;
        C1257J c1257j;
        C0036S0 c0036s0;
        C1257J c1257j2;
        C1257J c1257j3;
        C0026N c0026n;
        C0078o0 c0078o02;
        int i5;
        C0078o0 c0078o03 = this.f132a;
        AbstractC2074f abstractC2074fM3853e = AbstractC2086r.m3853e();
        InterfaceC1601c interfaceC1601cMo3789e = abstractC2074fM3853e != null ? abstractC2074fM3853e.mo3789e() : null;
        AbstractC2074f abstractC2074fM3856h = AbstractC2086r.m3856h(abstractC2074fM3853e);
        try {
            C0036S0 c0036s0M123d = c0078o03.m123d();
            C1257J c1257j4 = c0036s0M123d != null ? c0036s0M123d.f161a : null;
            C0090u0 c0090u0 = c0078o03.f337a;
            EnumC2017m layoutDirection = interfaceC0379Q.getLayoutDirection();
            int i6 = c0090u0.f407f;
            boolean z5 = c0090u0.f406e;
            int i7 = c0090u0.f404c;
            if (c1257j4 != null) {
                C1277o c1277o = c1257j4.f4527b;
                C1256I c1256i = c1257j4.f4526a;
                C1269g c1269g = c0090u0.f402a;
                C1260M c1260m = c0090u0.f403b;
                List list2 = c0090u0.f410i;
                InterfaceC2007c interfaceC2007c = c0090u0.f408g;
                InterfaceC1580e interfaceC1580e = c0090u0.f409h;
                C1257J c1257j5 = c1257j4;
                if (c1277o.f4585a.mo425b()) {
                    j6 = j5;
                    c0078o0 = c0078o03;
                } else {
                    C1269g c1269g2 = c1256i.f4516a;
                    c0078o0 = c0078o03;
                    long j7 = c1256i.f4525j;
                    if (AbstractC1665j.m2981a(c1269g2, c1269g) && c1256i.f4517b.m2344c(c1260m) && AbstractC1665j.m2981a(c1256i.f4518c, list2) && c1256i.f4519d == i7 && c1256i.f4520e == z5 && c1256i.f4521f == i6 && AbstractC1665j.m2981a(c1256i.f4522g, interfaceC2007c) && c1256i.f4523h == layoutDirection && AbstractC1665j.m2981a(c1256i.f4524i, interfaceC1580e) && C2005a.m3682j(j5) == C2005a.m3682j(j7) && ((!z5 && i6 != 2) || (C2005a.m3680h(j5) == C2005a.m3680h(j7) && C2005a.m3679g(j5) == C2005a.m3679g(j7)))) {
                        c1257j3 = new C1257J(new C1256I(c1256i.f4516a, c0090u0.f403b, c1256i.f4518c, c1256i.f4519d, c1256i.f4520e, c1256i.f4521f, c1256i.f4522g, c1256i.f4523h, c1256i.f4524i, j5), c1277o, AbstractC2006b.m3687d(j5, (((long) AbstractC0070k0.m83j(c1277o.f4589e)) & 4294967295L) | (((long) AbstractC0070k0.m83j(c1277o.f4588d)) << 32)));
                        c1257j2 = c1257j5;
                        c0036s0 = c0036s0M123d;
                        long j8 = c1257j3.f4528c;
                        Integer numValueOf = Integer.valueOf((int) (j8 >> 32));
                        Integer numValueOf2 = Integer.valueOf((int) (j8 & 4294967295L));
                        int iIntValue = numValueOf.intValue();
                        int iIntValue2 = numValueOf2.intValue();
                        if (AbstractC1665j.m2981a(c1257j2, c1257j3)) {
                            c0078o02 = c0078o0;
                            c0078o02.f345i.setValue(new C0036S0(c1257j3, c0036s0 != null ? c0036s0.f163c : null));
                            i5 = 0;
                            c0078o02.f352p = false;
                            c0026n = this;
                            c0026n.f133b.mo1h(c1257j3);
                            AbstractC0070k0.m88o(c0078o02, c0026n.f134c, c0026n.f135d);
                        } else {
                            c0026n = this;
                            c0078o02 = c0078o0;
                            i5 = 0;
                        }
                        c0078o02.f343g.setValue(new C2010f(c0026n.f136e.mo283q0(c0026n.f137f != 1 ? AbstractC0070k0.m83j(c1257j3.f4527b.m2361b(i5)) : i5)));
                        return interfaceC0379Q.mo604f0(iIntValue, iIntValue2, AbstractC0984x.m2035G(new C0882h(AbstractC0394d.f1215a, Integer.valueOf(Math.round(c1257j3.f4529d))), new C0882h(AbstractC0394d.f1216b, Integer.valueOf(Math.round(c1257j3.f4530e)))), new C2654f0(22));
                    }
                    j6 = j5;
                }
                c1257j = c1257j5;
            } else {
                j6 = j5;
                c0078o0 = c0078o03;
                c1257j = c1257j4;
            }
            c0090u0.m127a(layoutDirection);
            int iM3682j = C2005a.m3682j(j6);
            int iM3680h = ((z5 || i6 == 2) && C2005a.m3676d(j6)) ? C2005a.m3680h(j6) : Integer.MAX_VALUE;
            int i8 = (z5 || i6 != 2) ? i7 : 1;
            if (iM3682j != iM3680h) {
                C0240b c0240b = c0090u0.f411j;
                if (c0240b == null) {
                    throw new IllegalStateException("layoutIntrinsics must be called first");
                }
                iM3680h = AbstractC1926h.m3568k(AbstractC0070k0.m83j(c0240b.mo426c()), iM3682j, iM3680h);
            }
            C0240b c0240b2 = c0090u0.f411j;
            if (c0240b2 == null) {
                throw new IllegalStateException("layoutIntrinsics must be called first");
            }
            C1277o c1277o2 = new C1277o(c0240b2, AbstractC1784a.m3233s(0, iM3680h, 0, C2005a.m3679g(j6)), i8, c0090u0.f407f);
            long jM3687d = AbstractC2006b.m3687d(j6, (((long) AbstractC0070k0.m83j(c1277o2.f4588d)) << 32) | (((long) AbstractC0070k0.m83j(c1277o2.f4589e)) & 4294967295L));
            c1257j2 = c1257j;
            c0036s0 = c0036s0M123d;
            c1257j3 = new C1257J(new C1256I(c0090u0.f402a, c0090u0.f403b, c0090u0.f410i, c0090u0.f404c, c0090u0.f406e, c0090u0.f407f, c0090u0.f408g, layoutDirection, c0090u0.f409h, j6), c1277o2, jM3687d);
            long j82 = c1257j3.f4528c;
            Integer numValueOf3 = Integer.valueOf((int) (j82 >> 32));
            Integer numValueOf22 = Integer.valueOf((int) (j82 & 4294967295L));
            int iIntValue3 = numValueOf3.intValue();
            int iIntValue22 = numValueOf22.intValue();
            if (AbstractC1665j.m2981a(c1257j2, c1257j3)) {
            }
            c0078o02.f343g.setValue(new C2010f(c0026n.f136e.mo283q0(c0026n.f137f != 1 ? AbstractC0070k0.m83j(c1257j3.f4527b.m2361b(i5)) : i5)));
            return interfaceC0379Q.mo604f0(iIntValue3, iIntValue22, AbstractC0984x.m2035G(new C0882h(AbstractC0394d.f1215a, Integer.valueOf(Math.round(c1257j3.f4529d))), new C0882h(AbstractC0394d.f1216b, Integer.valueOf(Math.round(c1257j3.f4530e)))), new C2654f0(22));
        } finally {
            AbstractC2086r.m3859k(abstractC2074fM3853e, abstractC2074fM3856h, interfaceC1601cMo3789e);
        }
    }
}
