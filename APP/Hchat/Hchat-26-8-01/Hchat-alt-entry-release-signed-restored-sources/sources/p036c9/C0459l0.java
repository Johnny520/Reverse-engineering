package p036c9;

import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p276sf.C3967n;

/* JADX INFO: renamed from: c9.l0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0459l0 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1345g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0452j1 f1346h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f1347i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f1348j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f1349k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean f1350l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1220a f1351m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f1352n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0459l0(C0452j1 c0452j1, String str, String str2, int i9, boolean z9, InterfaceC1220a interfaceC1220a, int i10) {
        this.f1346h = c0452j1;
        this.f1347i = str;
        this.f1348j = str2;
        this.f1349k = i9;
        this.f1350l = z9;
        this.f1351m = interfaceC1220a;
        this.f1352n = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1345g) {
            case 0:
                ((Integer) obj2).getClass();
                int iM4617C = AbstractC1874r.m4617C(this.f1349k | 1);
                this.f1346h.m1460a(iM4617C, this.f1352n, this.f1351m, (C1836h0) obj, this.f1347i, this.f1348j, this.f1350l);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM4617C2 = AbstractC1874r.m4617C(this.f1352n | 1);
                this.f1346h.m1468i(this.f1349k, iM4617C2, this.f1351m, (C1836h0) obj, this.f1347i, this.f1348j, this.f1350l);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C0459l0(C0452j1 c0452j1, String str, String str2, InterfaceC1220a interfaceC1220a, boolean z9, int i9, int i10) {
        this.f1346h = c0452j1;
        this.f1347i = str;
        this.f1348j = str2;
        this.f1351m = interfaceC1220a;
        this.f1350l = z9;
        this.f1349k = i9;
        this.f1352n = i10;
    }
}
