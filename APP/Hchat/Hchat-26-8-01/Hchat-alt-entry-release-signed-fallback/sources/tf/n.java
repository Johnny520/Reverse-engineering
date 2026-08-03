package tf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends a.a {
    public static int e1(java.lang.Iterable r1) {
            r1.getClass()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Le
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            return r1
        Le:
            r1 = 10
            return r1
    }
}
