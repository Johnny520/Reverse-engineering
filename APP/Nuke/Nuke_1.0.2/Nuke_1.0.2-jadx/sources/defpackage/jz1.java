package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jz1 extends m3 implements zx0, Collection, q41 {
    public static final jz1 k;
    public final Object h;
    public final Object i;
    public final zy1 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        gd3 gd3Var = gd3.v;
        k = new jz1(gd3Var, gd3Var, zy1.j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jz1(Object obj, Object obj2, zy1 zy1Var) {
        this.h = obj;
        this.i = obj2;
        this.j = zy1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k2
    public final int a() {
        return this.j.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k2, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.j.containsKey(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ro0(this.h, this.j);
    }
}
