package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class da1 implements aa0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1945a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1946b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1947c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f1948d;

    public /* synthetic */ da1(Object obj, Object obj2, Object obj3, int i) {
        this.f1945a = i;
        this.f1946b = obj;
        this.f1947c = obj2;
        this.f1948d = obj3;
    }

    @Override // p000.aa0
    /* JADX INFO: renamed from: a */
    public final void mo120a() {
        int i = this.f1945a;
        Object obj = this.f1948d;
        Object obj2 = this.f1947c;
        Object obj3 = this.f1946b;
        switch (i) {
            case 0:
                ((ia1) obj3).getLifecycle().mo506b((ca1) obj2);
                C0389kj c0389kj = (C0389kj) ((o72) obj).f7574i;
                if (c0389kj != null) {
                    c0389kj.m2692a();
                }
                break;
            default:
                dc2 dc2Var = (dc2) obj3;
                ic2 ic2Var = (ic2) obj;
                if (dc2Var.f1986i.m4509k(obj2) == ic2Var) {
                    Map map = dc2Var.f1985h;
                    Map mapMo977c = ic2Var.mo977c();
                    if (!mapMo977c.isEmpty()) {
                        map.put(obj2, mapMo977c);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
        }
    }
}
