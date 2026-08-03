package o9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r2.compareTo(r1)
            return r1
    }
}
