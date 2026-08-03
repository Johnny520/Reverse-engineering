package kh;

import gg.AbstractC1417m;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: kh.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2406a extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: h */
    public static final C2406a f7878h;

    /* JADX INFO: renamed from: i */
    public static final C2406a f7879i;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7880g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9 = 1;
        f7878h = new C2406a(i9, 0);
        f7879i = new C2406a(i9, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2406a(int i9, int i10) {
        super(i9);
        this.f7880g = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f7880g) {
            case 0:
                Class cls = (Class) obj;
                cls.getClass();
                return AbstractC2407b.m5748f(cls);
            default:
                Class cls2 = (Class) obj;
                cls2.getClass();
                return AbstractC2407b.m5748f(cls2);
        }
    }
}
