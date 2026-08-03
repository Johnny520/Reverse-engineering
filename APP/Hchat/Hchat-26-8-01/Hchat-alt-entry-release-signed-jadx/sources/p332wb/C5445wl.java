package p332wb;

import android.content.SharedPreferences;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.InterfaceC1809a1;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.wl */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5445wl implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21738g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f21739h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SharedPreferences f21740i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f21741j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f21742k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5445wl(SharedPreferences sharedPreferences, boolean z9, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f21740i = sharedPreferences;
        this.f21741j = z9;
        this.f21739h = interfaceC1809a1;
        this.f21742k = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f21738g;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((C3619d) obj).getClass();
        int i10 = iIntValue & 17;
        switch (i9) {
            case 0:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-386023719, new C4907g9(this.f21740i, this.f21741j, this.f21739h, this.f21742k), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1339828328, new C4907g9(this.f21739h, this.f21740i, this.f21741j, this.f21742k), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5445wl(InterfaceC1809a1 interfaceC1809a1, SharedPreferences sharedPreferences, boolean z9, InterfaceC1809a1 interfaceC1809a12) {
        this.f21739h = interfaceC1809a1;
        this.f21740i = sharedPreferences;
        this.f21741j = z9;
        this.f21742k = interfaceC1809a12;
    }
}
