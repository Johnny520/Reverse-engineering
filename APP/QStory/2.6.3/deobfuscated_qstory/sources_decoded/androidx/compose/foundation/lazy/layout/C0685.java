package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C0741;
import androidx.compose.foundation.lazy.C0762;
import androidx.compose.runtime.InterfaceC1395;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0685 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1915;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1916;

    public /* synthetic */ C0685(Object obj, int i) {
        this.f1916 = i;
        this.f1915 = obj;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f1916;
        Object obj = this.f1915;
        switch (i) {
            case 0:
                C0741 c0741 = ((C0680) obj).f1904.f2129;
                return Float.valueOf((c0741.f2105.m1560() * 500) + c0741.f2105.m1558());
            case 1:
                C0741 c07412 = ((C0680) obj).f1904.f2129;
                int iM1560 = c07412.f2105.m1560();
                int iM1558 = c07412.f2105.m1558();
                return Float.valueOf(c07412.mo1287() ? (iM1560 * 500) + iM1558 + 100.0f : (iM1560 * 500) + iM1558);
            case 2:
                C0680 c0680 = (C0680) obj;
                C0741 c07413 = c0680.f1904.f2129;
                int iM1566 = (int) (c07413.m1551().f2209 == Orientation.Vertical ? c07413.m1551().m1566() & 4294967295L : c07413.m1551().m1566() >> 32);
                C0741 c07414 = c0680.f1904.f2129;
                return Float.valueOf(iM1566 - ((-c07414.m1551().f2214) + c07414.m1551().f2210));
            default:
                return (C0762) ((InterfaceC6543) ((InterfaceC1395) obj).getValue()).invoke();
        }
    }
}
