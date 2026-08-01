package p197m;

import me.dartcv.nuke.BuildConfig;
import p027E4.C0330q;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1666k;
import p153e1.C2014j;
import p153e1.C2016l;

/* JADX INFO: renamed from: m.J */
/* JADX INFO: loaded from: classes.dex */
public final class C2525J extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f8071e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2527L f8072f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f8073g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2525J(C2527L c2527l, long j5, int i5) {
        super(1);
        this.f8071e = i5;
        this.f8072f = c2527l;
        this.f8073g = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v12, types: [W2.c, X2.k] */
    /* JADX WARN: Type inference failed for: r1v10, types: [W2.c, X2.k] */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        int iOrdinal;
        switch (this.f8071e) {
            case 0:
                int iOrdinal2 = ((EnumC2517B) obj).ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new C0330q();
                    }
                    C2540Z c2540z = this.f8072f.f8084w.f8092a;
                }
                return new C2016l(this.f8073g);
            case BuildConfig.VERSION_CODE /* 1 */:
                EnumC2517B enumC2517B = (EnumC2517B) obj;
                C2527L c2527l = this.f8072f;
                if (c2527l.f8076A != null && c2527l.m4467J0() != null && !AbstractC1665j.m2981a(c2527l.f8076A, c2527l.m4467J0()) && (iOrdinal = enumC2517B.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new C0330q();
                    }
                    C2540Z c2540z2 = c2527l.f8084w.f8092a;
                }
                return new C2014j(0L);
            default:
                EnumC2517B enumC2517B2 = (EnumC2517B) obj;
                C2527L c2527l2 = this.f8072f;
                C2538X c2538x = c2527l2.f8083v.f8089a.f8108b;
                long j5 = this.f8073g;
                long j6 = 0;
                long j7 = c2538x != null ? ((C2014j) c2538x.f8104a.mo1h(new C2016l(j5))).f6735a : 0L;
                C2538X c2538x2 = c2527l2.f8084w.f8092a.f8108b;
                long j8 = c2538x2 != null ? ((C2014j) c2538x2.f8104a.mo1h(new C2016l(j5))).f6735a : 0L;
                int iOrdinal3 = enumC2517B2.ordinal();
                if (iOrdinal3 == 0) {
                    j6 = j7;
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        throw new C0330q();
                    }
                    j6 = j8;
                }
                return new C2014j(j6);
        }
    }
}
