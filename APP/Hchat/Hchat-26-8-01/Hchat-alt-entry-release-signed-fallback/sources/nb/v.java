package nb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.String r0 = "initial"
            boolean r2 = gg.l.a(r2, r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            boolean r3 = gg.l.a(r3, r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            int r2 = r2.compareTo(r3)
            return r2
    }
}
