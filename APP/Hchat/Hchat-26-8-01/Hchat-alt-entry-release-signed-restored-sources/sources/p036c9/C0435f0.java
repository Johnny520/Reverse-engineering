package p036c9;

import java.util.List;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p276sf.C3967n;
import p332wb.AbstractC4955ho;
import p332wb.C5491y2;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: c9.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0435f0 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1280g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1281h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f1282i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1283j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f1284k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f1285l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f1286m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f1287n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0435f0(C0452j1 c0452j1, InterfaceC1220a interfaceC1220a, String str, InterfaceC1220a interfaceC1220a2, boolean z9, int i9, int i10) {
        this.f1280g = 0;
        this.f1281h = c0452j1;
        this.f1283j = interfaceC1220a;
        this.f1282i = str;
        this.f1287n = interfaceC1220a2;
        this.f1284k = z9;
        this.f1285l = i9;
        this.f1286m = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1280g) {
            case 0:
                ((Integer) obj2).getClass();
                ((C0452j1) this.f1281h).m1465f((InterfaceC1220a) this.f1283j, this.f1282i, (InterfaceC1220a) this.f1287n, this.f1284k, (C1836h0) obj, AbstractC1874r.m4617C(this.f1285l | 1), this.f1286m);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((C0452j1) this.f1281h).m1464e(this.f1282i, (InterfaceC1220a) this.f1283j, (InterfaceC5853o) this.f1287n, this.f1284k, (C1836h0) obj, AbstractC1874r.m4617C(this.f1285l | 1), this.f1286m);
                break;
            case 2:
                C5491y2 c5491y2 = (C5491y2) this.f1281h;
                String str = (String) this.f1283j;
                ((Integer) obj2).getClass();
                int iM4617C = AbstractC1874r.m4617C(this.f1286m | 1);
                c5491y2.m9909p(this.f1285l, iM4617C, (InterfaceC1231l) this.f1287n, (C1836h0) obj, this.f1282i, str, this.f1284k);
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9361J2(this.f1282i, (String) this.f1281h, (List) this.f1283j, this.f1285l, (InterfaceC1231l) this.f1287n, this.f1284k, (C1836h0) obj, AbstractC1874r.m4617C(this.f1286m | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f1281h).m9899k(this.f1282i, (InterfaceC1220a) this.f1283j, (InterfaceC5853o) this.f1287n, this.f1284k, (C1836h0) obj, AbstractC1874r.m4617C(this.f1285l | 1), this.f1286m);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C0435f0(Object obj, String str, InterfaceC1220a interfaceC1220a, InterfaceC5853o interfaceC5853o, boolean z9, int i9, int i10, int i11) {
        this.f1280g = i11;
        this.f1281h = obj;
        this.f1282i = str;
        this.f1283j = interfaceC1220a;
        this.f1287n = interfaceC5853o;
        this.f1284k = z9;
        this.f1285l = i9;
        this.f1286m = i10;
    }

    public /* synthetic */ C0435f0(String str, String str2, List list, int i9, InterfaceC1231l interfaceC1231l, boolean z9, int i10) {
        this.f1280g = 3;
        this.f1282i = str;
        this.f1281h = str2;
        this.f1283j = list;
        this.f1285l = i9;
        this.f1287n = interfaceC1231l;
        this.f1284k = z9;
        this.f1286m = i10;
    }

    public /* synthetic */ C0435f0(C5491y2 c5491y2, String str, String str2, boolean z9, int i9, InterfaceC1231l interfaceC1231l, int i10) {
        this.f1280g = 2;
        this.f1281h = c5491y2;
        this.f1282i = str;
        this.f1283j = str2;
        this.f1284k = z9;
        this.f1285l = i9;
        this.f1287n = interfaceC1231l;
        this.f1286m = i10;
    }
}
