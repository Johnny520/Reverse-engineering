package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p30 extends i30 {

    /* JADX INFO: renamed from: i */
    public static final p30 f7958i = new p30(0);

    @Override // p000.w53
    /* JADX INFO: renamed from: a */
    public final o43 mo22a() {
        return o43.f7515u;
    }

    @Override // p000.t23
    /* JADX INFO: renamed from: b */
    public final String mo23b() {
        return Integer.toString(this.f4250h);
    }

    @Override // p000.AbstractC0147dz
    /* JADX INFO: renamed from: f */
    public final String mo24f() {
        return "short";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("short{0x");
        int i = this.f4250h;
        sb.append(pp0.m3898J(i));
        sb.append(" / ");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}
