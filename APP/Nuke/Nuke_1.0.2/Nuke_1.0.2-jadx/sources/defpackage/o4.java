package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o4 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ int j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ o4(int i, Collection collection) {
        this.h = 2;
        this.j = i;
        this.i = collection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        a83 a83Var = a83.a;
        Object obj2 = this.i;
        int i2 = this.j;
        switch (i) {
            case 0:
                rz1.g((rz1) obj, (sz1) obj2, 0, -i2);
                return a83Var;
            case 1:
                rz1.g((rz1) obj, (sz1) obj2, -i2, 0);
                return a83Var;
            default:
                return Boolean.valueOf(((List) obj).addAll(i2, (Collection) obj2));
        }
    }

    public /* synthetic */ o4(sz1 sz1Var, int i, int i2) {
        this.h = i2;
        this.i = sz1Var;
        this.j = i;
    }
}
