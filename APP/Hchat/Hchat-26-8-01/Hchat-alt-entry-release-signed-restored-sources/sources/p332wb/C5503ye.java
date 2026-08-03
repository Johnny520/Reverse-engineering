package p332wb;

import java.util.List;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p266s0.C3874d;
import p276sf.C3967n;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: wb.ye */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5503ye implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22157g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f22158h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1231l f22159i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f22160j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f22161k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f22162l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f22163m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f22164n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f22165o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5503ye(Object obj, InterfaceC5853o interfaceC5853o, String str, InterfaceC1231l interfaceC1231l, boolean z9, C3874d c3874d, int i9, int i10) {
        this.f22163m = obj;
        this.f22164n = interfaceC5853o;
        this.f22158h = str;
        this.f22159i = interfaceC1231l;
        this.f22160j = z9;
        this.f22165o = c3874d;
        this.f22161k = i9;
        this.f22162l = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22157g) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9430S(this.f22158h, (String) this.f22163m, (String) this.f22164n, this.f22160j, (InterfaceC1220a) this.f22165o, this.f22159i, (C1836h0) obj, AbstractC1874r.m4617C(this.f22161k | 1), this.f22162l);
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9322E3(this.f22163m, (InterfaceC5853o) this.f22164n, this.f22158h, this.f22159i, this.f22160j, (C3874d) this.f22165o, (C1836h0) obj, AbstractC1874r.m4617C(this.f22161k | 1), this.f22162l);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9353I2(this.f22158h, (String) this.f22163m, (List) this.f22165o, (String) this.f22164n, this.f22159i, this.f22160j, (C1836h0) obj, AbstractC1874r.m4617C(this.f22161k | 1), this.f22162l);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5503ye(String str, String str2, String str3, boolean z9, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l, int i9, int i10) {
        this.f22158h = str;
        this.f22163m = str2;
        this.f22164n = str3;
        this.f22160j = z9;
        this.f22165o = interfaceC1220a;
        this.f22159i = interfaceC1231l;
        this.f22161k = i9;
        this.f22162l = i10;
    }

    public /* synthetic */ C5503ye(String str, String str2, List list, String str3, InterfaceC1231l interfaceC1231l, boolean z9, int i9, int i10) {
        this.f22158h = str;
        this.f22163m = str2;
        this.f22165o = list;
        this.f22164n = str3;
        this.f22159i = interfaceC1231l;
        this.f22160j = z9;
        this.f22161k = i9;
        this.f22162l = i10;
    }
}
