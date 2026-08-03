package p332wb;

import p080fb.C1101a1;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: wb.im */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4985im implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17942g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f17943h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f17944i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f17945j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f17946k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f17947l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f17948m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC3955b f17949n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4985im(String str, String str2, String str3, int i9, InterfaceC1231l interfaceC1231l, int i10, int i11) {
        this.f17946k = str;
        this.f17947l = str2;
        this.f17948m = str3;
        this.f17943h = i9;
        this.f17949n = interfaceC1231l;
        this.f17944i = i10;
        this.f17945j = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17942g) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9304C1((String) this.f17946k, (String) this.f17947l, (String) this.f17948m, this.f17943h, (InterfaceC1231l) this.f17949n, (C1836h0) obj, AbstractC1874r.m4617C(this.f17944i | 1), this.f17945j);
                break;
            default:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f17946k).m9904m0((C1101a1) this.f17947l, this.f17943h, (InterfaceC5853o) this.f17948m, (InterfaceC1220a) this.f17949n, (C1836h0) obj, AbstractC1874r.m4617C(this.f17944i | 1), this.f17945j);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4985im(C5491y2 c5491y2, C1101a1 c1101a1, int i9, InterfaceC5853o interfaceC5853o, InterfaceC1220a interfaceC1220a, int i10, int i11) {
        this.f17946k = c5491y2;
        this.f17947l = c1101a1;
        this.f17943h = i9;
        this.f17948m = interfaceC5853o;
        this.f17949n = interfaceC1220a;
        this.f17944i = i10;
        this.f17945j = i11;
    }
}
