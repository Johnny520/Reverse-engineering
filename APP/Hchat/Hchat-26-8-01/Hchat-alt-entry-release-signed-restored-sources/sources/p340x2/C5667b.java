package p340x2;

import gg.AbstractC1417m;
import p015b0.RunnableC0133c;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;

/* JADX INFO: renamed from: x2.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5667b extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: h */
    public static final C5667b f23059h;

    /* JADX INFO: renamed from: i */
    public static final C5667b f23060i;

    /* JADX INFO: renamed from: j */
    public static final C5667b f23061j;

    /* JADX INFO: renamed from: k */
    public static final C5667b f23062k;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23063g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9 = 1;
        f23059h = new C5667b(i9, 0);
        f23060i = new C5667b(i9, 1);
        f23061j = new C5667b(i9, 2);
        f23062k = new C5667b(i9, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5667b(int i9, int i10) {
        super(i9);
        this.f23063g = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f23063g) {
            case 0:
                AbstractC5673h abstractC5673h = (AbstractC5673h) obj;
                abstractC5673h.getHandler().post(new RunnableC0133c(abstractC5673h.f23102x, 5));
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return C3967n.f12976a;
    }
}
