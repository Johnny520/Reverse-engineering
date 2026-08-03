package sh;

import gg.AbstractC1416l;
import java.util.List;
import okio.C3193a;
import p085fg.InterfaceC1231l;
import p129ig.AbstractC2043a;
import p136j8.C2104o;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;
import p293u2.C4231a;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4377b1;
import p308v1.AbstractC4434w;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4412n0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p324w2.AbstractC4679a;
import tf.C4174u;

/* JADX INFO: renamed from: sh.c2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3997c2 implements InterfaceC4412n0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f13083a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C4059w1 f13084b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3997c2(float f3, C4059w1 c4059w1) {
        this.f13083a = f3;
        this.f13084b = c4059w1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: h */
    public final InterfaceC4415o0 mo3994h(InterfaceC4418p0 interfaceC4418p0, List list, final long j3) {
        C4005e2 c4005e2;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            InterfaceC4409m0 interfaceC4409m0 = (InterfaceC4409m0) list.get(i9);
            if (AbstractC1416l.m3825a(AbstractC4434w.m8885i(interfaceC4409m0), "navigationIcon")) {
                final AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(C4231a.m8497a(j3, 0, 0, 0, 0, 10));
                int size2 = list.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    InterfaceC4409m0 interfaceC4409m02 = (InterfaceC4409m0) list.get(i10);
                    if (AbstractC1416l.m3825a(AbstractC4434w.m8885i(interfaceC4409m02), "actionIcons")) {
                        final AbstractC4377b1 abstractC4377b1Mo8831Q2 = interfaceC4409m02.mo8831Q(C4231a.m8497a(j3, 0, 0, 0, 0, 10));
                        int iM8504h = (C4231a.m8504h(j3) - abstractC4377b1Mo8831Q.f14593g) - abstractC4377b1Mo8831Q2.f14593g;
                        int size3 = list.size();
                        for (int i11 = 0; i11 < size3; i11++) {
                            InterfaceC4409m0 interfaceC4409m03 = (InterfaceC4409m0) list.get(i11);
                            if (AbstractC1416l.m3825a(AbstractC4434w.m8885i(interfaceC4409m03), "title")) {
                                double d10 = ((double) iM8504h) * 0.9d;
                                if (Double.isNaN(d10)) {
                                    C2104o.m5294t("Cannot round NaN value.");
                                    return null;
                                }
                                final AbstractC4377b1 abstractC4377b1Mo8831Q3 = interfaceC4409m03.mo8831Q(C4231a.m8497a(j3, 0, d10 > 2.147483647E9d ? Integer.MAX_VALUE : d10 < -2.147483648E9d ? Integer.MIN_VALUE : (int) Math.round(d10), 0, 0, 8));
                                int size4 = list.size();
                                for (int i12 = 0; i12 < size4; i12++) {
                                    InterfaceC4409m0 interfaceC4409m04 = (InterfaceC4409m0) list.get(i12);
                                    if (AbstractC1416l.m3825a(AbstractC4434w.m8885i(interfaceC4409m04), "largeTitle")) {
                                        final AbstractC4377b1 abstractC4377b1Mo8831Q4 = interfaceC4409m04.mo8831Q(C4231a.m8497a(j3, 0, 0, 0, Integer.MAX_VALUE, 2));
                                        final int iMo1590G0 = interfaceC4418p0.mo1590G0(AbstractC4047s1.f13375b);
                                        int iMax = Math.max(iMo1590G0, abstractC4377b1Mo8831Q4.f14594h);
                                        float f3 = this.f13083a;
                                        float fM7907q = 1.0f;
                                        if (f3 > 0.0f) {
                                            C4060x c4060x = this.f13084b.f13435a;
                                            float fM4488g = (c4060x == null || (c4005e2 = c4060x.f13436a) == null) ? 0.0f : c4005e2.f13117c.m4488g();
                                            if (!Float.isNaN(fM4488g)) {
                                                fM7907q = 1.0f - AbstractC3754e0.m7907q(Math.abs(fM4488g) / f3, 0.0f, 1.0f);
                                            }
                                        }
                                        return interfaceC4418p0.mo8010z(C4231a.m8504h(j3), AbstractC2043a.m5018X(((int) Math.round(((double) (iMax - iMo1590G0)) * ((double) fM7907q))) + iMo1590G0), C4174u.f13711g, new InterfaceC1231l() { // from class: sh.b2
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // p085fg.InterfaceC1231l
                                            public final Object invoke(Object obj) {
                                                int iM8504h2;
                                                AbstractC4374a1 abstractC4374a1 = (AbstractC4374a1) obj;
                                                abstractC4374a1.getClass();
                                                int i13 = iMo1590G0 / 2;
                                                AbstractC4377b1 abstractC4377b1 = abstractC4377b1Mo8831Q;
                                                AbstractC4374a1.m8811E(abstractC4374a1, abstractC4377b1, 0, i13 - (abstractC4377b1.f14594h / 2));
                                                long j4 = j3;
                                                int iM8504h3 = C4231a.m8504h(j4);
                                                AbstractC4377b1 abstractC4377b12 = abstractC4377b1Mo8831Q3;
                                                int i14 = abstractC4377b12.f14593g;
                                                int i15 = (iM8504h3 - i14) / 2;
                                                int i16 = abstractC4377b1.f14593g;
                                                AbstractC4377b1 abstractC4377b13 = abstractC4377b1Mo8831Q2;
                                                if (i15 >= i16) {
                                                    if (i14 + i15 > C4231a.m8504h(j4) - abstractC4377b13.f14593g) {
                                                        iM8504h2 = (C4231a.m8504h(j4) - abstractC4377b13.f14593g) - (abstractC4377b12.f14593g + i15);
                                                    }
                                                    AbstractC4374a1.m8811E(abstractC4374a1, abstractC4377b12, i15, i13 - (abstractC4377b12.f14594h / 2));
                                                    AbstractC4374a1.m8811E(abstractC4374a1, abstractC4377b13, C4231a.m8504h(j4) - abstractC4377b13.f14593g, i13 - (abstractC4377b13.f14594h / 2));
                                                    AbstractC4374a1.m8811E(abstractC4374a1, abstractC4377b1Mo8831Q4, 0, 0);
                                                    return C3967n.f12976a;
                                                }
                                                iM8504h2 = i16 - i15;
                                                i15 += iM8504h2;
                                                AbstractC4374a1.m8811E(abstractC4374a1, abstractC4377b12, i15, i13 - (abstractC4377b12.f14594h / 2));
                                                AbstractC4374a1.m8811E(abstractC4374a1, abstractC4377b13, C4231a.m8504h(j4) - abstractC4377b13.f14593g, i13 - (abstractC4377b13.f14594h / 2));
                                                AbstractC4374a1.m8811E(abstractC4374a1, abstractC4377b1Mo8831Q4, 0, 0);
                                                return C3967n.f12976a;
                                            }
                                        });
                                    }
                                }
                                AbstractC4679a.m9171b("Collection contains no element matching the predicate.");
                                C3193a.m6814c();
                                return null;
                            }
                        }
                        AbstractC4679a.m9171b("Collection contains no element matching the predicate.");
                        C3193a.m6814c();
                        return null;
                    }
                }
                AbstractC4679a.m9171b("Collection contains no element matching the predicate.");
                C3193a.m6814c();
                return null;
            }
        }
        AbstractC4679a.m9171b("Collection contains no element matching the predicate.");
        C3193a.m6814c();
        return null;
    }
}
