package y0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface m extends y0.o {
    @Override // y0.o
    default boolean a(fg.l r1) {
            r0 = this;
            java.lang.Object r1 = r1.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }

    @Override // y0.o
    default java.lang.Object b(fg.p r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = r1.invoke(r2, r0)
            return r1
    }
}
