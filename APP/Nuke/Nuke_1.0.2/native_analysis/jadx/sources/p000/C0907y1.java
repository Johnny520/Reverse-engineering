package p000;

import java.util.List;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: y1 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0907y1 implements nn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13272h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ List f13273i;

    public /* synthetic */ C0907y1(int i, List list) {
        this.f13272h = i;
        this.f13273i = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        int i = this.f13272h;
        a83 a83Var = a83.f116a;
        List list = this.f13273i;
        int i2 = 1;
        Object[] objArr = 0;
        InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((o71) obj).getClass();
        int i3 = iIntValue & 17;
        switch (i) {
            case 0:
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, i3 != 16)) {
                    go0Var.m1961R();
                } else {
                    AbstractC0179eu.m1464n(null, rg3.m4462P(R.string.about_module_project_section, go0Var), xe1.m6126i0(-1353787701, new C0601q1(objArr == true ? 1 : 0, list), go0Var), go0Var, 384, 1);
                }
                break;
            case 1:
                go0 go0Var2 = (go0) interfaceC0596px;
                if (!go0Var2.m1958O(iIntValue & 1, i3 != 16)) {
                    go0Var2.m1961R();
                } else {
                    AbstractC0179eu.m1464n(null, rg3.m4462P(R.string.about_module_thanks_section, go0Var2), xe1.m6126i0(785052172, new C0601q1(i2, list), go0Var2), go0Var2, 384, 1);
                }
                break;
            default:
                go0 go0Var3 = (go0) interfaceC0596px;
                if (!go0Var3.m1958O(iIntValue & 1, i3 != 16)) {
                    go0Var3.m1961R();
                } else {
                    s11.m4708n(list, go0Var3, 0);
                }
                break;
        }
        return a83Var;
    }
}
