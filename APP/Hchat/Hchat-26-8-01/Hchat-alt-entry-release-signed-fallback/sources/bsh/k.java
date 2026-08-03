package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements java.util.function.BiFunction {
    @Override // java.util.function.BiFunction
    public final java.lang.Object apply(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            bsh.Variable r2 = (bsh.Variable) r2
            bsh.Variable r1 = bsh.NameSpace.e(r1, r2)
            return r1
    }
}
