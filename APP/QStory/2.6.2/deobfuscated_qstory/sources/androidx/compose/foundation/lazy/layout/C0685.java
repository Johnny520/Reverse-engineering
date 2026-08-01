package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C0741;
import androidx.compose.foundation.lazy.C0762;
import androidx.compose.runtime.InterfaceC1395;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0685 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1914;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1915;

    public /* synthetic */ C0685(Object obj, int i) {
        this.f1915 = i;
        this.f1914 = obj;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f1915;
        Object obj = this.f1914;
        switch (i) {
            case 0:
                C0741 c0741 = ((C0680) obj).f1903.f2128;
                return Float.valueOf((c0741.f2104.m1550() * 500) + c0741.f2104.m1548());
            case 1:
                C0741 c07412 = ((C0680) obj).f1903.f2128;
                int iM1550 = c07412.f2104.m1550();
                int iM1548 = c07412.f2104.m1548();
                return Float.valueOf(c07412.mo1277() ? (iM1550 * 500) + iM1548 + 100.0f : (iM1550 * 500) + iM1548);
            case 2:
                C0680 c0680 = (C0680) obj;
                C0741 c07413 = c0680.f1903.f2128;
                int iM1556 = (int) (c07413.m1541().f2208 == Orientation.Vertical ? c07413.m1541().m1556() & 4294967295L : c07413.m1541().m1556() >> 32);
                C0741 c07414 = c0680.f1903.f2128;
                return Float.valueOf(iM1556 - ((-c07414.m1541().f2213) + c07414.m1541().f2209));
            default:
                return (C0762) ((InterfaceC6542) ((InterfaceC1395) obj).getValue()).invoke();
        }
    }
}
