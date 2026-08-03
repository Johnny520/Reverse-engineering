package hh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends java.util.ArrayList {
    public final java.lang.Object a() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.Object r0 = r1.first()
            return r0
    }

    public final java.lang.Object first() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lc
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            return r0
        Lc:
            java.lang.String r0 = "list is empty"
            j8.o.A(r0)
            r0 = 0
            return r0
    }
}
