package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t extends java.util.AbstractList {
    public abstract java.lang.Object a(int r1);

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int r2) {
            r1 = this;
            if (r2 < 0) goto Ld
            int r0 = r1.size()
            if (r2 >= r0) goto Ld
            java.lang.Object r2 = r1.a(r2)
            return r2
        Ld:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
    }
}
