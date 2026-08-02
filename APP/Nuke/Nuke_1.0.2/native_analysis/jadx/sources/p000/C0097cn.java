package p000;

/* JADX INFO: renamed from: cn */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0097cn implements l03 {

    /* JADX INFO: renamed from: h */
    public final zp2 f1625h;

    /* JADX INFO: renamed from: i */
    public final float f1626i;

    public C0097cn(zp2 zp2Var, float f) {
        this.f1625h = zp2Var;
        this.f1626i = f;
    }

    @Override // p000.l03
    /* JADX INFO: renamed from: a */
    public final float mo863a() {
        return this.f1626i;
    }

    @Override // p000.l03
    /* JADX INFO: renamed from: b */
    public final long mo864b() {
        int i = C0363ju.f5218h;
        return C0363ju.f5217g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0097cn)) {
            return false;
        }
        C0097cn c0097cn = (C0097cn) obj;
        return t11.m5086l(this.f1625h, c0097cn.f1625h) && Float.compare(this.f1626i, c0097cn.f1626i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1626i) + (this.f1625h.hashCode() * 31);
    }

    @Override // p000.l03
    /* JADX INFO: renamed from: k */
    public final AbstractC0024an mo865k() {
        return this.f1625h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f1625h);
        sb.append(", alpha=");
        return vi0.m5693l(sb, this.f1626i, ')');
    }
}
