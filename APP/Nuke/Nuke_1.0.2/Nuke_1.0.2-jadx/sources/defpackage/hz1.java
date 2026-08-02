package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hz1 extends m3 implements zx0 {
    public final /* synthetic */ int h;
    public final zy1 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ hz1(zy1 zy1Var, int i) {
        this.h = i;
        this.i = zy1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k2
    public final int a() {
        int i = this.h;
        zy1 zy1Var = this.i;
        switch (i) {
            case 0:
                zy1Var.getClass();
                break;
            default:
                zy1Var.getClass();
                break;
        }
        return zy1Var.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k2, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.h;
        zy1 zy1Var = this.i;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = zy1Var.get(entry.getKey());
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && zy1Var.containsKey(entry.getKey());
            default:
                return zy1Var.containsKey(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.h) {
            case 0:
                h43 h43Var = this.i.h;
                i43[] i43VarArr = new i43[8];
                for (int i = 0; i < 8; i++) {
                    i43VarArr[i] = new j43(0);
                }
                return new iz1(h43Var, i43VarArr);
            default:
                h43 h43Var2 = this.i.h;
                i43[] i43VarArr2 = new i43[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    i43VarArr2[i2] = new j43(1);
                }
                return new iz1(h43Var2, i43VarArr2);
        }
    }
}
