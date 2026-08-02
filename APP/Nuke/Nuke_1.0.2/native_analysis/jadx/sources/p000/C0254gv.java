package p000;

import java.util.Comparator;

/* JADX INFO: renamed from: gv */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0254gv implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3705a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3706b;

    public /* synthetic */ C0254gv(int i, Object obj) {
        this.f3705a = i;
        this.f3706b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f3705a;
        Object obj3 = this.f3706b;
        switch (i) {
            case 0:
                for (in0 in0Var : (in0[]) obj3) {
                    int iM1897o = gf1.m1897o((Comparable) in0Var.mo5j(obj), (Comparable) in0Var.mo5j(obj2));
                    if (iM1897o != 0) {
                        return iM1897o;
                    }
                }
                return 0;
            default:
                return ((Number) ((mn0) obj3).mo12g(obj, obj2)).intValue();
        }
    }
}
