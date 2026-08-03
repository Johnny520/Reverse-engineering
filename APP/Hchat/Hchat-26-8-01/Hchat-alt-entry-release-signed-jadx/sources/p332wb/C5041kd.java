package p332wb;

import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.kd */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5041kd implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18352g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f18353h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f18354i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1220a f18355j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f18356k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5041kd(String str, String str2, InterfaceC1220a interfaceC1220a, int i9, int i10) {
        this.f18352g = i10;
        this.f18353h = str;
        this.f18354i = str2;
        this.f18355j = interfaceC1220a;
        this.f18356k = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        int i9 = this.f18352g;
        C1836h0 c1836h0 = (C1836h0) obj;
        ((Integer) obj2).intValue();
        switch (i9) {
            case 0:
                AbstractC4955ho.m9503b(this.f18353h, this.f18354i, this.f18355j, c1836h0, AbstractC1874r.m4617C(this.f18356k | 1));
                break;
            default:
                AbstractC4955ho.m9704x3(this.f18353h, this.f18354i, this.f18355j, c1836h0, AbstractC1874r.m4617C(this.f18356k | 1));
                break;
        }
        return C3967n.f12976a;
    }
}
