package a;

/* JADX INFO: loaded from: classes.dex */
public final class W8 implements androidx.lifecycle.q.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.Eg<?>[] f323a;

    public W8(a.Eg<?>... r2) {
            r1 = this;
            java.lang.String r0 = "initializers"
            a.C0193i9.e(r2, r0)
            r1.<init>()
            r1.f323a = r2
            return
    }

    @Override // androidx.lifecycle.q.b
    public final a.Dg b(java.lang.Class r5, a.Ab r6) {
            r4 = this;
            a.Eg<?>[] r6 = r4.f323a
            int r0 = r6.length
            r1 = 0
            r2 = 0
        L5:
            if (r2 >= r0) goto L19
            r3 = r6[r2]
            java.lang.Class<T extends a.Dg> r3 = r3.f77a
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L16
            a.Id r1 = new a.Id
            r1.<init>()
        L16:
            int r2 = r2 + 1
            goto L5
        L19:
            if (r1 == 0) goto L1c
            return r1
        L1c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.getName()
            java.lang.String r0 = "No initializer set for given class "
            java.lang.String r5 = r0.concat(r5)
            r6.<init>(r5)
            throw r6
    }
}
