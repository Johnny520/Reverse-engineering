package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w93 extends t93 {

    /* JADX INFO: renamed from: h */
    public final String f12424h;

    /* JADX INFO: renamed from: i */
    public final List f12425i;

    /* JADX INFO: renamed from: j */
    public final int f12426j;

    /* JADX INFO: renamed from: k */
    public final AbstractC0024an f12427k;

    /* JADX INFO: renamed from: l */
    public final float f12428l;

    /* JADX INFO: renamed from: m */
    public final AbstractC0024an f12429m;

    /* JADX INFO: renamed from: n */
    public final float f12430n;

    /* JADX INFO: renamed from: o */
    public final float f12431o;

    /* JADX INFO: renamed from: p */
    public final int f12432p;

    /* JADX INFO: renamed from: q */
    public final int f12433q;

    /* JADX INFO: renamed from: r */
    public final float f12434r;

    /* JADX INFO: renamed from: s */
    public final float f12435s;

    /* JADX INFO: renamed from: t */
    public final float f12436t;

    /* JADX INFO: renamed from: u */
    public final float f12437u;

    public w93(String str, List list, int i, AbstractC0024an abstractC0024an, float f, AbstractC0024an abstractC0024an2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.f12424h = str;
        this.f12425i = list;
        this.f12426j = i;
        this.f12427k = abstractC0024an;
        this.f12428l = f;
        this.f12429m = abstractC0024an2;
        this.f12430n = f2;
        this.f12431o = f3;
        this.f12432p = i2;
        this.f12433q = i3;
        this.f12434r = f4;
        this.f12435s = f5;
        this.f12436t = f6;
        this.f12437u = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w93.class != obj.getClass()) {
            return false;
        }
        w93 w93Var = (w93) obj;
        return this.f12424h.equals(w93Var.f12424h) && t11.m5086l(this.f12427k, w93Var.f12427k) && this.f12428l == w93Var.f12428l && t11.m5086l(this.f12429m, w93Var.f12429m) && this.f12430n == w93Var.f12430n && this.f12431o == w93Var.f12431o && this.f12432p == w93Var.f12432p && this.f12433q == w93Var.f12433q && this.f12434r == w93Var.f12434r && this.f12435s == w93Var.f12435s && this.f12436t == w93Var.f12436t && this.f12437u == w93Var.f12437u && this.f12426j == w93Var.f12426j && t11.m5086l(this.f12425i, w93Var.f12425i);
    }

    public final int hashCode() {
        int iHashCode = (this.f12425i.hashCode() + (this.f12424h.hashCode() * 31)) * 31;
        AbstractC0024an abstractC0024an = this.f12427k;
        int iM5684c = vi0.m5684c(this.f12428l, (iHashCode + (abstractC0024an != null ? abstractC0024an.hashCode() : 0)) * 31, 31);
        AbstractC0024an abstractC0024an2 = this.f12429m;
        return Integer.hashCode(this.f12426j) + vi0.m5684c(this.f12437u, vi0.m5684c(this.f12436t, vi0.m5684c(this.f12435s, vi0.m5684c(this.f12434r, vi0.m5685d(this.f12433q, vi0.m5685d(this.f12432p, vi0.m5684c(this.f12431o, vi0.m5684c(this.f12430n, (iM5684c + (abstractC0024an2 != null ? abstractC0024an2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
