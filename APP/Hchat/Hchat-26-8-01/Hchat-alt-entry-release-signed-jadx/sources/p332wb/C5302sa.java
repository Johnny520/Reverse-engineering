package p332wb;

import android.content.SharedPreferences;
import java.util.List;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.InterfaceC1809a1;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.sa */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5302sa implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20621g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f20622h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ List f20623i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f20624j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f20625k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f20626l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f20627m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f20628n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5302sa(SharedPreferences sharedPreferences, List list, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15) {
        this.f20622h = sharedPreferences;
        this.f20623i = list;
        this.f20624j = interfaceC1809a1;
        this.f20625k = interfaceC1809a12;
        this.f20626l = interfaceC1809a13;
        this.f20627m = interfaceC1809a14;
        this.f20628n = interfaceC1809a15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f20621g;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((C3619d) obj).getClass();
        int i10 = iIntValue & 17;
        switch (i9) {
            case 0:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1083815983, new C5271rc(this.f20623i, this.f20622h, this.f20624j, this.f20625k, this.f20626l, this.f20627m, this.f20628n), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(486176724, new C5271rc(this.f20622h, this.f20623i, this.f20624j, this.f20625k, this.f20626l, this.f20627m, this.f20628n), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5302sa(List list, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15) {
        this.f20623i = list;
        this.f20622h = sharedPreferences;
        this.f20624j = interfaceC1809a1;
        this.f20625k = interfaceC1809a12;
        this.f20626l = interfaceC1809a13;
        this.f20627m = interfaceC1809a14;
        this.f20628n = interfaceC1809a15;
    }
}
