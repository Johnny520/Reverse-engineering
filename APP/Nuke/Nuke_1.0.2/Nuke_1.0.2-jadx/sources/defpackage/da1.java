package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class da1 implements aa0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ da1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.aa0
    public final void a() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((ia1) obj3).getLifecycle().b((ca1) obj2);
                kj kjVar = (kj) ((o72) obj).i;
                if (kjVar != null) {
                    kjVar.a();
                }
                break;
            default:
                dc2 dc2Var = (dc2) obj3;
                ic2 ic2Var = (ic2) obj;
                if (dc2Var.i.k(obj2) == ic2Var) {
                    Map map = dc2Var.h;
                    Map mapC = ic2Var.c();
                    if (!mapC.isEmpty()) {
                        map.put(obj2, mapC);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
        }
    }
}
