package p076P;

import me.dartcv.nuke.BuildConfig;
import p027E4.C0330q;
import p091S.EnumC1240l;
import p095T.C1341U0;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p211o0.AbstractC2767z;
import p211o0.InterfaceC2738M;
import p272z.AbstractC3507e;
import p272z.C3504b;
import p272z.C3506d;

/* JADX INFO: renamed from: P.Y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1078Y {

    /* JADX INFO: renamed from: a */
    public static final C1341U0 f3363a = new C1341U0(new C1073T(1));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC2738M m2140a(EnumC1240l enumC1240l, InterfaceC1373m interfaceC1373m) {
        C1077X c1077x = (C1077X) ((C1383r) interfaceC1373m).m2590j(f3363a);
        switch (enumC1240l.ordinal()) {
            case 0:
                return c1077x.f3362h;
            case BuildConfig.VERSION_CODE /* 1 */:
                return c1077x.f3359e;
            case 2:
                return c1077x.f3361g;
            case 3:
                return m2141b(c1077x.f3359e);
            case 4:
                return c1077x.f3355a;
            case 5:
                return m2141b(c1077x.f3355a);
            case 6:
                return AbstractC3507e.f10918a;
            case 7:
                return c1077x.f3358d;
            case 8:
                C3506d c3506d = c1077x.f3358d;
                C3504b c3504b = AbstractC1076W.f3354i;
                return C3506d.m5760b(c3506d, c3504b, null, null, c3504b, 6);
            case 9:
                return c1077x.f3360f;
            case 10:
                C3506d c3506d2 = c1077x.f3358d;
                C3504b c3504b2 = AbstractC1076W.f3354i;
                return C3506d.m5760b(c3506d2, null, c3504b2, c3504b2, null, 9);
            case 11:
                return m2141b(c1077x.f3358d);
            case 12:
                return c1077x.f3357c;
            case 13:
                return AbstractC2767z.f8776b;
            case 14:
                return c1077x.f3356b;
            default:
                throw new C0330q();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C3506d m2141b(C3506d c3506d) {
        C3504b c3504b = AbstractC1076W.f3354i;
        return C3506d.m5760b(c3506d, null, null, c3504b, c3504b, 3);
    }
}
