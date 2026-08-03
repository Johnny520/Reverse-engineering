package p340x2;

import androidx.lifecycle.InterfaceC0112q;
import gg.AbstractC1417m;
import okio.C3193a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p276sf.C3967n;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p294u3.InterfaceC4250c;
import p339x1.C5602f0;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: x2.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5676k extends AbstractC1417m implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public static final C5676k f23111h;

    /* JADX INFO: renamed from: i */
    public static final C5676k f23112i;

    /* JADX INFO: renamed from: j */
    public static final C5676k f23113j;

    /* JADX INFO: renamed from: k */
    public static final C5676k f23114k;

    /* JADX INFO: renamed from: l */
    public static final C5676k f23115l;

    /* JADX INFO: renamed from: m */
    public static final C5676k f23116m;

    /* JADX INFO: renamed from: n */
    public static final C5676k f23117n;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23118g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9 = 2;
        f23111h = new C5676k(i9, 0);
        f23112i = new C5676k(i9, 1);
        f23113j = new C5676k(i9, 2);
        f23114k = new C5676k(i9, 3);
        f23115l = new C5676k(i9, 4);
        f23116m = new C5676k(i9, 5);
        f23117n = new C5676k(i9, 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5676k(int i9, int i10) {
        super(i9);
        this.f23118g = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        int i9;
        switch (this.f23118g) {
            case 0:
                AbstractC5674i.m10238e((C5602f0) obj).setUpdateBlock((InterfaceC1231l) obj2);
                break;
            case 1:
                AbstractC5674i.m10238e((C5602f0) obj).setReleaseBlock((InterfaceC1231l) obj2);
                break;
            case 2:
                AbstractC5674i.m10238e((C5602f0) obj).setModifier((InterfaceC5853o) obj2);
                break;
            case 3:
                AbstractC5674i.m10238e((C5602f0) obj).setDensity((InterfaceC4233c) obj2);
                break;
            case 4:
                AbstractC5674i.m10238e((C5602f0) obj).setLifecycleOwner((InterfaceC0112q) obj2);
                break;
            case 5:
                AbstractC5674i.m10238e((C5602f0) obj).setSavedStateRegistryOwner((InterfaceC4250c) obj2);
                break;
            default:
                C5687v c5687vM10238e = AbstractC5674i.m10238e((C5602f0) obj);
                int iOrdinal = ((EnumC4243m) obj2).ordinal();
                if (iOrdinal != 0) {
                    i9 = 1;
                    if (iOrdinal != 1) {
                        C3193a.m6822k();
                    }
                } else {
                    i9 = 0;
                }
                c5687vM10238e.setLayoutDirection(i9);
                break;
        }
        return C3967n.f12976a;
    }
}
