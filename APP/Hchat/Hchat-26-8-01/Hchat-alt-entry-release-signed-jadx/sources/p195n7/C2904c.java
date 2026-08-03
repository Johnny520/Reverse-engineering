package p195n7;

/* JADX INFO: renamed from: n7.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2904c extends AbstractC2902a {

    /* JADX INFO: renamed from: b */
    public static final C2904c f9377b = new C2904c(5);

    /* JADX INFO: renamed from: c */
    public static final C2904c f9378c = new C2904c(9);

    /* JADX INFO: renamed from: d */
    public static final C2904c f9379d = new C2904c(4);

    /* JADX INFO: renamed from: e */
    public static final C2904c f9380e = new C2904c(7);

    /* JADX INFO: renamed from: a */
    public final int f9381a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2904c(int i9) {
        this.f9381a = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p195n7.AbstractC2902a
    /* JADX INFO: renamed from: a */
    public final String mo6306a(int i9) {
        StringBuilder sb2 = new StringBuilder("#");
        int i10 = this.f9381a - 2;
        int i11 = i10 < 5 ? 8 : 4;
        for (int i12 = i10 * i11; i12 >= 0; i12 -= i11) {
            int i13 = (i9 >> i12) & 15;
            sb2.append((char) (i13 < 10 ? i13 + 48 : i13 + 87));
        }
        return sb2.toString();
    }
}
