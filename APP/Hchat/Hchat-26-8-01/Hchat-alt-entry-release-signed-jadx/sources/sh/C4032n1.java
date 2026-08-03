package sh;

import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p176m1.C2730f;
import p276sf.C3967n;
import p332wb.AbstractC4955ho;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: sh.n1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4032n1 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f13287g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f13288h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f13289i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f13290j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f13291k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f13292l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f13293m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f13294n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4032n1(C2730f c2730f, String str, boolean z9, InterfaceC1220a interfaceC1220a, boolean z10, int i9, int i10) {
        this.f13292l = c2730f;
        this.f13293m = str;
        this.f13288h = z9;
        this.f13294n = interfaceC1220a;
        this.f13289i = z10;
        this.f13290j = i9;
        this.f13291k = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13287g) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4045s.m8249m(this.f13288h, (InterfaceC1231l) this.f13292l, (InterfaceC5853o) this.f13293m, (C4026l1) this.f13294n, this.f13289i, (C1836h0) obj, AbstractC1874r.m4617C(this.f13290j | 1), this.f13291k);
                break;
            case 1:
                C2730f c2730f = (C2730f) this.f13292l;
                String str = (String) this.f13293m;
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9431S0(AbstractC1874r.m4617C(this.f13290j | 1), this.f13291k, (InterfaceC1220a) this.f13294n, (C1836h0) obj, str, c2730f, this.f13288h, this.f13289i);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9410P3(this.f13288h, (String) this.f13293m, (String) this.f13294n, this.f13289i, (InterfaceC1231l) this.f13292l, (C1836h0) obj, AbstractC1874r.m4617C(this.f13290j | 1), this.f13291k);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4032n1(boolean z9, InterfaceC1231l interfaceC1231l, InterfaceC5853o interfaceC5853o, C4026l1 c4026l1, boolean z10, int i9, int i10) {
        this.f13288h = z9;
        this.f13292l = interfaceC1231l;
        this.f13293m = interfaceC5853o;
        this.f13294n = c4026l1;
        this.f13289i = z10;
        this.f13290j = i9;
        this.f13291k = i10;
    }

    public /* synthetic */ C4032n1(boolean z9, String str, String str2, boolean z10, InterfaceC1231l interfaceC1231l, int i9, int i10) {
        this.f13288h = z9;
        this.f13293m = str;
        this.f13294n = str2;
        this.f13289i = z10;
        this.f13292l = interfaceC1231l;
        this.f13290j = i9;
        this.f13291k = i10;
    }
}
