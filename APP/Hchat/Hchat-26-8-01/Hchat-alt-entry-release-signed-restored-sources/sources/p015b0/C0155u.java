package p015b0;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;
import p071f1.C1034w;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p276sf.C3967n;
import p372z.C6056d;

/* JADX INFO: renamed from: b0.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0155u implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f412g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f413h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0155u(Object obj, int i9) {
        this.f412g = i9;
        this.f413h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f412g) {
            case 0:
                long j3 = ((C1034w) obj).f3265a;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c1836h0.m4532e(j3) ? 4 : 2;
                }
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    AbstractC0157w.m736b(((C6056d) this.f413h).f24522c, j3, c1836h0, (iIntValue << 3) & 112);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                long j4 = ((C1034w) obj).f3265a;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    C0138e0.f360a.m714a((Drawable) this.f413h, c1836h02, 48);
                } else {
                    c1836h02.m4519V();
                }
                break;
            default:
                long j5 = ((C1034w) obj).f3265a;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    C0138e0.f360a.m715b(((RemoteAction) this.f413h).getIcon(), c1836h03, 48);
                } else {
                    c1836h03.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
