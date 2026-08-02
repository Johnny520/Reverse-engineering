package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l30 extends j30 {

    /* JADX INFO: renamed from: i */
    public static final l30 f5904i = new l30(0);

    @Override // p000.w53
    /* JADX INFO: renamed from: a */
    public final o43 mo22a() {
        return o43.f7514t;
    }

    @Override // p000.t23
    /* JADX INFO: renamed from: b */
    public final String mo23b() {
        return Long.toString(this.f4885h);
    }

    @Override // p000.AbstractC0147dz
    /* JADX INFO: renamed from: f */
    public final String mo24f() {
        return "long";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("long{0x");
        long j = this.f4885h;
        sb.append(pp0.m3900L(j));
        sb.append(" / ");
        sb.append(j);
        sb.append('}');
        return sb.toString();
    }
}
