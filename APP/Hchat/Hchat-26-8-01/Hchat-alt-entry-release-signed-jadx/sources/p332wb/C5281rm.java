package p332wb;

import java.util.List;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.rm */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5281rm implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20490g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List f20491h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1220a f20492i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1235p f20493j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1220a f20494k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5281rm(List list, InterfaceC1220a interfaceC1220a, InterfaceC1235p interfaceC1235p, InterfaceC1220a interfaceC1220a2, int i9, int i10) {
        this.f20490g = i10;
        this.f20491h = list;
        this.f20492i = interfaceC1220a;
        this.f20493j = interfaceC1235p;
        this.f20494k = interfaceC1220a2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20490g) {
            case 0:
                ((Integer) obj2).getClass();
                int iM4617C = AbstractC1874r.m4617C(3505);
                AbstractC4955ho.m9515c2(this.f20491h, this.f20492i, this.f20493j, this.f20494k, (C1836h0) obj, iM4617C);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM4617C2 = AbstractC1874r.m4617C(433);
                AbstractC4955ho.m9526d4(this.f20491h, this.f20492i, this.f20493j, this.f20494k, (C1836h0) obj, iM4617C2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM4617C3 = AbstractC1874r.m4617C(433);
                AbstractC4955ho.m9534e3(this.f20491h, this.f20492i, this.f20493j, this.f20494k, (C1836h0) obj, iM4617C3);
                break;
        }
        return C3967n.f12976a;
    }
}
