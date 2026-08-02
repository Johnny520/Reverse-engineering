package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r93 extends t93 implements Iterable, q41 {

    /* JADX INFO: renamed from: h */
    public final String f9472h;

    /* JADX INFO: renamed from: i */
    public final float f9473i;

    /* JADX INFO: renamed from: j */
    public final float f9474j;

    /* JADX INFO: renamed from: k */
    public final float f9475k;

    /* JADX INFO: renamed from: l */
    public final float f9476l;

    /* JADX INFO: renamed from: m */
    public final float f9477m;

    /* JADX INFO: renamed from: n */
    public final float f9478n;

    /* JADX INFO: renamed from: o */
    public final float f9479o;

    /* JADX INFO: renamed from: p */
    public final List f9480p;

    /* JADX INFO: renamed from: q */
    public final List f9481q;

    public r93(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.f9472h = str;
        this.f9473i = f;
        this.f9474j = f2;
        this.f9475k = f3;
        this.f9476l = f4;
        this.f9477m = f5;
        this.f9478n = f6;
        this.f9479o = f7;
        this.f9480p = list;
        this.f9481q = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof r93)) {
            r93 r93Var = (r93) obj;
            return t11.m5086l(this.f9472h, r93Var.f9472h) && this.f9473i == r93Var.f9473i && this.f9474j == r93Var.f9474j && this.f9475k == r93Var.f9475k && this.f9476l == r93Var.f9476l && this.f9477m == r93Var.f9477m && this.f9478n == r93Var.f9478n && this.f9479o == r93Var.f9479o && t11.m5086l(this.f9480p, r93Var.f9480p) && t11.m5086l(this.f9481q, r93Var.f9481q);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9481q.hashCode() + ((this.f9480p.hashCode() + vi0.m5684c(this.f9479o, vi0.m5684c(this.f9478n, vi0.m5684c(this.f9477m, vi0.m5684c(this.f9476l, vi0.m5684c(this.f9475k, vi0.m5684c(this.f9474j, vi0.m5684c(this.f9473i, this.f9472h.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ez1(this);
    }
}
