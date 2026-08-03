package p332wb;

import android.content.SharedPreferences;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p276sf.C3967n;
import p317vb.InterfaceC4544a;

/* JADX INFO: renamed from: wb.v7 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5398v7 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21290g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC4544a f21291h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SharedPreferences f21292i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f21293j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1220a f21294k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1220a f21295l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5398v7(InterfaceC4544a interfaceC4544a, SharedPreferences sharedPreferences, int i9, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, int i10, int i11) {
        this.f21290g = i11;
        this.f21291h = interfaceC4544a;
        this.f21292i = sharedPreferences;
        this.f21293j = i9;
        this.f21294k = interfaceC1220a;
        this.f21295l = interfaceC1220a2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21290g) {
            case 0:
                ((Integer) obj2).getClass();
                int iM4617C = AbstractC1874r.m4617C(24577);
                AbstractC4955ho.m9587k2(this.f21291h, this.f21292i, this.f21293j, this.f21294k, this.f21295l, (C1836h0) obj, iM4617C);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM4617C2 = AbstractC1874r.m4617C(24577);
                AbstractC4955ho.m9659s2(this.f21291h, this.f21292i, this.f21293j, this.f21294k, this.f21295l, (C1836h0) obj, iM4617C2);
                break;
        }
        return C3967n.f12976a;
    }
}
