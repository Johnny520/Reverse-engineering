package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nu2 implements Map.Entry, r41 {
    public final Object h;
    public Object i;
    public final /* synthetic */ ou2 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nu2(ou2 ou2Var) {
        this.j = ou2Var;
        Map.Entry entry = ou2Var.k;
        entry.getClass();
        this.h = entry.getKey();
        Map.Entry entry2 = ou2Var.k;
        entry2.getClass();
        this.i = entry2.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        ou2 ou2Var = this.j;
        rs2 rs2Var = ou2Var.h;
        if (rs2Var.e().d != ou2Var.j) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.i;
        rs2Var.put(this.h, obj);
        this.i = obj;
        return obj2;
    }
}
