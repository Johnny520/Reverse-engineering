package xe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k implements java.lang.Iterable {
    public static int a(java.util.List r2, ud.p r3, int r4) {
            int r0 = r2.size()
        L4:
            if (r4 >= r0) goto L10
            java.lang.Object r1 = r2.get(r4)
            if (r1 != r3) goto Ld
            return r4
        Ld:
            int r4 = r4 + 1
            goto L4
        L10:
            r2 = -1
            return r2
    }

    public static void b(ud.a r1, ud.p r2) {
            java.util.ArrayList r1 = r1.f13674l
            java.util.Iterator r1 = r1.iterator()
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r1.next()
            ud.p r0 = (ud.p) r0
            if (r0 != r2) goto L6
            r1.remove()
        L17:
            return
    }
}
