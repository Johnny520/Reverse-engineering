package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lt0 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6297h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ mn0 f6298i;

    public /* synthetic */ lt0(int i, mn0 mn0Var) {
        this.f6297h = i;
        this.f6298i = mn0Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        Object x92Var;
        fc2 fc2Var;
        int i = this.f6297h;
        mn0 mn0Var = this.f6298i;
        switch (i) {
            case 0:
                yp2 yp2Var = (yp2) obj;
                rs1 rs1Var = (rs1) obj2;
                yp2Var.getClass();
                String str = yp2Var.f13557c;
                if (str != null) {
                    try {
                        x92Var = wm0.valueOf(str);
                    } catch (Throwable th) {
                        x92Var = new x92(th);
                    }
                    obj = (wm0) (x92Var instanceof x92 ? null : x92Var);
                    break;
                }
                if (obj != null) {
                    mn0Var.mo12g(obj, rs1Var);
                }
                return a83.f116a;
            default:
                bc2 bc2Var = (bc2) obj;
                List list = (List) mn0Var.mo12g(bc2Var, obj2);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list.get(i2);
                    if (obj3 != null && (fc2Var = bc2Var.f779i) != null && !fc2Var.mo976b(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i2 + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
        }
    }
}
