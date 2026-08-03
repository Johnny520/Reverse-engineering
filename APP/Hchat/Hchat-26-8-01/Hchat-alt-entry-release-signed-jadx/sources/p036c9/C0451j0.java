package p036c9;

import java.util.Map;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p119i2.C1926g;
import p119i2.C1941n0;
import p276sf.C3967n;
import p321w.AbstractC4634s;
import p332wb.C5491y2;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: c9.j0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0451j0 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1318g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC5853o f1319h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1231l f1320i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1321j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f1322k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1323l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f1324m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f1325n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0451j0(C0452j1 c0452j1, String str, String str2, InterfaceC1231l interfaceC1231l, InterfaceC5853o interfaceC5853o, int i9, int i10) {
        this.f1323l = c0452j1;
        this.f1324m = str;
        this.f1325n = str2;
        this.f1320i = interfaceC1231l;
        this.f1319h = interfaceC5853o;
        this.f1321j = i9;
        this.f1322k = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1318g) {
            case 0:
                C0452j1 c0452j1 = (C0452j1) this.f1323l;
                String str = (String) this.f1324m;
                String str2 = (String) this.f1325n;
                ((Integer) obj2).getClass();
                c0452j1.m1466g(AbstractC1874r.m4617C(this.f1321j | 1), this.f1322k, this.f1320i, (C1836h0) obj, str, str2, this.f1319h);
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC4634s.m9058a((C1926g) this.f1323l, this.f1319h, (C1941n0) this.f1324m, this.f1320i, this.f1321j, (Map) this.f1325n, (C1836h0) obj, AbstractC1874r.m4617C(this.f1322k | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iM4617C = AbstractC1874r.m4617C(1576327);
                ((C5491y2) this.f1323l).m9897j((String) this.f1324m, (String) this.f1325n, this.f1321j, this.f1322k, this.f1319h, this.f1320i, (C1836h0) obj, iM4617C);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C0451j0(C1926g c1926g, InterfaceC5853o interfaceC5853o, C1941n0 c1941n0, InterfaceC1231l interfaceC1231l, int i9, Map map, int i10) {
        this.f1323l = c1926g;
        this.f1319h = interfaceC5853o;
        this.f1324m = c1941n0;
        this.f1320i = interfaceC1231l;
        this.f1321j = i9;
        this.f1325n = map;
        this.f1322k = i10;
    }

    public /* synthetic */ C0451j0(C5491y2 c5491y2, String str, String str2, int i9, int i10, InterfaceC5853o interfaceC5853o, InterfaceC1231l interfaceC1231l, int i11) {
        this.f1323l = c5491y2;
        this.f1324m = str;
        this.f1325n = str2;
        this.f1321j = i9;
        this.f1322k = i10;
        this.f1319h = interfaceC5853o;
        this.f1320i = interfaceC1231l;
    }
}
