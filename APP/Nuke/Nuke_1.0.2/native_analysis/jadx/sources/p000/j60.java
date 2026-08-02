package p000;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class j60 implements nn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4899h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f4900i;

    public /* synthetic */ j60(int i, Object obj) {
        this.f4899h = i;
        this.f4900i = obj;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        int i = this.f4899h;
        a83 a83Var = a83.f116a;
        Object obj4 = this.f4900i;
        switch (i) {
            case 0:
                long j = ((C0363ju) obj).f5219a;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((go0) interfaceC0596px).m1978e(j) ? 4 : 2;
                }
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 19) != 18)) {
                    go0Var.m1961R();
                } else {
                    k60.m2607b(((xy2) obj4).f13238c, j, go0Var, (iIntValue << 3) & 112);
                }
                break;
            case 1:
                long j2 = ((C0363ju) obj).f5219a;
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    go0Var2.m1961R();
                } else {
                    gd3.f3425L.m1839a((Drawable) obj4, go0Var2, 48);
                }
                break;
            default:
                long j3 = ((C0363ju) obj).f5219a;
                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                go0 go0Var3 = (go0) interfaceC0596px3;
                if (!go0Var3.m1958O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    go0Var3.m1961R();
                } else {
                    gd3.f3425L.m1843e(((RemoteAction) obj4).getIcon(), go0Var3, 48);
                }
                break;
        }
        return a83Var;
    }
}
