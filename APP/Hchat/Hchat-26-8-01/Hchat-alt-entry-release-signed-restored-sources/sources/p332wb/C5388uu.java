package p332wb;

import java.util.List;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;

/* JADX INFO: renamed from: wb.uu */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5388uu implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21252g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5491y2 f21253h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f21254i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f21255j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC3955b f21256k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5388uu(C5491y2 c5491y2, Object obj, Object obj2, InterfaceC3955b interfaceC3955b, int i9, int i10) {
        this.f21252g = i10;
        this.f21253h = c5491y2;
        this.f21254i = obj;
        this.f21255j = obj2;
        this.f21256k = interfaceC3955b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21252g) {
            case 0:
                ((Integer) obj2).getClass();
                int iM4617C = AbstractC1874r.m4617C(3073);
                this.f21253h.m9923z((String) this.f21254i, (String) this.f21255j, (InterfaceC1220a) this.f21256k, (C1836h0) obj, iM4617C);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM4617C2 = AbstractC1874r.m4617C(3073);
                this.f21253h.m9891g((List) this.f21254i, (EnumC4993iv) this.f21255j, (InterfaceC1231l) this.f21256k, (C1836h0) obj, iM4617C2);
                break;
        }
        return C3967n.f12976a;
    }
}
