package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jl2 implements aw1 {

    /* JADX INFO: renamed from: h */
    public final int f5098h;

    /* JADX INFO: renamed from: i */
    public final List f5099i;

    /* JADX INFO: renamed from: j */
    public Float f5100j = null;

    /* JADX INFO: renamed from: k */
    public Float f5101k = null;

    /* JADX INFO: renamed from: l */
    public el2 f5102l = null;

    /* JADX INFO: renamed from: m */
    public el2 f5103m = null;

    public jl2(int i, ArrayList arrayList) {
        this.f5098h = i;
        this.f5099i = arrayList;
    }

    @Override // p000.aw1
    /* JADX INFO: renamed from: B */
    public final boolean mo298B() {
        return this.f5099i.contains(this);
    }
}
