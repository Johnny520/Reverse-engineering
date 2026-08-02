package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jl2 implements aw1 {
    public final int h;
    public final List i;
    public Float j = null;
    public Float k = null;
    public el2 l = null;
    public el2 m = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jl2(int i, ArrayList arrayList) {
        this.h = i;
        this.i = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.aw1
    public final boolean B() {
        return this.i.contains(this);
    }
}
