package p058e2;

import gg.AbstractC1417m;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;

/* JADX INFO: renamed from: e2.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0812b extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: h */
    public static final C0812b f2436h;

    /* JADX INFO: renamed from: i */
    public static final C0812b f2437i;

    /* JADX INFO: renamed from: j */
    public static final C0812b f2438j;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2439g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9 = 1;
        f2436h = new C0812b(i9, 0);
        f2437i = new C0812b(i9, 1);
        f2438j = new C0812b(i9, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0812b(int i9, int i10) {
        super(i9);
        this.f2439g = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f2439g) {
            case 0:
                ((Number) obj).longValue();
                return C3967n.f12976a;
            case 1:
                return Integer.valueOf(((C0819i) obj).f2456b);
            default:
                return Integer.valueOf(((C0819i) obj).f2457c.m8532a());
        }
    }
}
