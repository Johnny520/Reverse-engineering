package p332wb;

import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;

/* JADX INFO: renamed from: wb.uh */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5375uh implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21114g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f21115h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f21116i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f21117j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f21118k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC3955b f21119l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5375uh(Object obj, boolean z9, boolean z10, InterfaceC3955b interfaceC3955b, int i9, int i10) {
        this.f21114g = i10;
        this.f21118k = obj;
        this.f21115h = z9;
        this.f21116i = z10;
        this.f21119l = interfaceC3955b;
        this.f21117j = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21114g) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9495a0((C5292s0) this.f21118k, this.f21115h, this.f21116i, (InterfaceC1220a) this.f21119l, (C1836h0) obj, AbstractC1874r.m4617C(this.f21117j | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9478Y((EnumC5325t0) this.f21118k, this.f21115h, this.f21116i, (InterfaceC1231l) this.f21119l, (C1836h0) obj, AbstractC1874r.m4617C(this.f21117j | 1));
                break;
        }
        return C3967n.f12976a;
    }
}
