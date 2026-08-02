package p000;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xw1 extends op0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13208h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ op0 f13209i;

    public /* synthetic */ xw1(op0 op0Var, int i) {
        this.f13208h = i;
        this.f13209i = op0Var;
    }

    @Override // p000.op0
    /* JADX INFO: renamed from: j */
    public final void mo301j(r82 r82Var, Object obj) {
        int i = this.f13208h;
        op0 op0Var = this.f13209i;
        switch (i) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        op0Var.mo301j(r82Var, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        op0Var.mo301j(r82Var, Array.get(obj, i2));
                    }
                    break;
                }
                break;
        }
    }
}
