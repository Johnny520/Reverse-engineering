package p358y2;

import gg.AbstractC1417m;
import mg.InterfaceC2842d;
import p072f2.AbstractC1058u;
import p072f2.AbstractC1060w;
import p072f2.InterfaceC1062y;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;

/* JADX INFO: renamed from: y2.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5966c extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: h */
    public static final C5966c f24243h;

    /* JADX INFO: renamed from: i */
    public static final C5966c f24244i;

    /* JADX INFO: renamed from: j */
    public static final C5966c f24245j;

    /* JADX INFO: renamed from: k */
    public static final C5966c f24246k;

    /* JADX INFO: renamed from: l */
    public static final C5966c f24247l;

    /* JADX INFO: renamed from: m */
    public static final C5966c f24248m;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f24249g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9 = 1;
        f24243h = new C5966c(i9, 0);
        f24244i = new C5966c(i9, 1);
        f24245j = new C5966c(i9, 2);
        f24246k = new C5966c(i9, 3);
        f24247l = new C5966c(i9, 4);
        f24248m = new C5966c(i9, 5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5966c(int i9, int i10) {
        super(i9);
        this.f24249g = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        int i9 = this.f24249g;
        C3967n c3967n = C3967n.f12976a;
        switch (i9) {
            case 0:
                InterfaceC2842d[] interfaceC2842dArr = AbstractC1060w.f3404a;
                ((InterfaceC1062y) obj).mo2644a(AbstractC1058u.f3399x, c3967n);
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                InterfaceC2842d[] interfaceC2842dArr2 = AbstractC1060w.f3404a;
                ((InterfaceC1062y) obj).mo2644a(AbstractC1058u.f3398w, c3967n);
                break;
            case 4:
                break;
            default:
                C5989x c5989x = (C5989x) obj;
                if (c5989x.isAttachedToWindow()) {
                    c5989x.m10729r();
                }
                break;
        }
        return c3967n;
    }
}
