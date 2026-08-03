package p134j6;

/* JADX INFO: renamed from: j6.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2078p implements CharSequence {

    /* JADX INFO: renamed from: g */
    public char[] f6980g;

    /* JADX INFO: renamed from: h */
    public String f6981h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final char charAt(int i9) {
        return this.f6980g[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final int length() {
        return this.f6980g.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i9, int i10) {
        return new String(this.f6980g, i9, i10 - i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.f6981h == null) {
            this.f6981h = new String(this.f6980g);
        }
        return this.f6981h;
    }
}
