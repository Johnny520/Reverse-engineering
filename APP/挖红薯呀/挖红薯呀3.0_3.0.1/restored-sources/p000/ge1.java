package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ge1 implements fe1 {

    /* JADX INFO: renamed from: b */
    public final String f1930b;

    /* JADX INFO: renamed from: c */
    public final d20 f1931c;

    /* JADX INFO: renamed from: d */
    public final d20 f1932d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ge1(String str) {
        this.f1930b = str;
        this.f1931c = new d20(str);
        this.f1932d = new d20(str.concat(" maximum"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f1930b;
    }
}
