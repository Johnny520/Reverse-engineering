package tf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends tf.p {
    public static void f1(java.util.List r2) {
            int r0 = r2.size()
            r1 = 1
            if (r0 <= r1) goto La
            java.util.Collections.sort(r2)
        La:
            return
    }

    public static void g1(java.util.List r2, java.util.Comparator r3) {
            r2.getClass()
            r3.getClass()
            int r0 = r2.size()
            r1 = 1
            if (r0 <= r1) goto L10
            java.util.Collections.sort(r2, r3)
        L10:
            return
    }
}
