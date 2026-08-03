package k2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends x6.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.text.BreakIterator f7139g;

    public c(java.lang.CharSequence r2) {
            r1 = this;
            r1.<init>()
            java.text.BreakIterator r0 = java.text.BreakIterator.getCharacterInstance()
            java.lang.String r2 = r2.toString()
            r0.setText(r2)
            r1.f7139g = r0
            return
    }

    @Override // x6.d
    public final int P(int r2) {
            r1 = this;
            java.text.BreakIterator r0 = r1.f7139g
            int r2 = r0.following(r2)
            return r2
    }

    @Override // x6.d
    public final int V(int r2) {
            r1 = this;
            java.text.BreakIterator r0 = r1.f7139g
            int r2 = r0.preceding(r2)
            return r2
    }
}
