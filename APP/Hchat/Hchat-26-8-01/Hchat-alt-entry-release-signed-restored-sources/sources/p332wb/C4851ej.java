package p332wb;

import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p136j8.C2098i;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;

/* JADX INFO: renamed from: wb.ej */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4851ej implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16915g = 2;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f16916h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f16917i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1220a f16918j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f16919k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC3955b f16920l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4851ej(C2098i c2098i, boolean z9, boolean z10, InterfaceC1231l interfaceC1231l, InterfaceC1220a interfaceC1220a, int i9) {
        this.f16919k = c2098i;
        this.f16916h = z9;
        this.f16917i = z10;
        this.f16920l = interfaceC1231l;
        this.f16918j = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16915g) {
            case 0:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f16919k;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f16920l;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC4955ho.m9498a3(this.f16916h, this.f16917i, this.f16918j, interfaceC1220a, interfaceC1220a2, c1836h0, 0);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9498a3(this.f16916h, this.f16917i, this.f16918j, (InterfaceC1220a) this.f16919k, (InterfaceC1220a) this.f16920l, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9287A0((C2098i) this.f16919k, this.f16916h, this.f16917i, (InterfaceC1231l) this.f16920l, this.f16918j, (C1836h0) obj, AbstractC1874r.m4617C(9));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4851ej(boolean z9, boolean z10, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, InterfaceC1220a interfaceC1220a3) {
        this.f16916h = z9;
        this.f16917i = z10;
        this.f16918j = interfaceC1220a;
        this.f16919k = interfaceC1220a2;
        this.f16920l = interfaceC1220a3;
    }

    public /* synthetic */ C4851ej(boolean z9, boolean z10, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, InterfaceC1220a interfaceC1220a3, int i9) {
        this.f16916h = z9;
        this.f16917i = z10;
        this.f16918j = interfaceC1220a;
        this.f16919k = interfaceC1220a2;
        this.f16920l = interfaceC1220a3;
    }
}
