package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k extends defpackage.l implements java.util.RandomAccess {
    public final defpackage.l a;
    public final int b;
    public final int c;

    public k(defpackage.l r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            int r1 = r1.a()
            defpackage.a80.d(r2, r3, r1)
            int r3 = r3 - r2
            r0.c = r3
            return
    }

    @Override // defpackage.l
    public final int a() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    @Override // java.util.List
    public final java.lang.Object get(int r5) {
            r4 = this;
            int r0 = r4.c
            if (r5 < 0) goto L10
            if (r5 >= r0) goto L10
            int r0 = r4.b
            int r0 = r0 + r5
            l r5 = r4.a
            java.lang.Object r5 = r5.get(r0)
            return r5
        L10:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "index: "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = ", size: "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
    }
}
