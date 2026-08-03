package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.tl */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5346tl implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20894g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f20895h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SharedPreferences f20896i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1220a f20897j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5346tl(Context context, SharedPreferences sharedPreferences, InterfaceC1220a interfaceC1220a, int i9, int i10) {
        this.f20894g = i10;
        this.f20895h = context;
        this.f20896i = sharedPreferences;
        this.f20897j = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        int i9 = this.f20894g;
        C1836h0 c1836h0 = (C1836h0) obj;
        ((Integer) obj2).getClass();
        switch (i9) {
            case 0:
                AbstractC4955ho.m9376L1(this.f20895h, this.f20896i, this.f20897j, c1836h0, AbstractC1874r.m4617C(385));
                break;
            default:
                AbstractC4955ho.m9629p(this.f20895h, this.f20896i, this.f20897j, c1836h0, AbstractC1874r.m4617C(385));
                break;
        }
        return C3967n.f12976a;
    }
}
