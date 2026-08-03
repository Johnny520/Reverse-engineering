package a;

/* JADX INFO: renamed from: a.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0242l5 extends a.V4 {
    public int m;

    public C0242l5(a.ih r1) {
            r0 = this;
            r0.<init>(r1)
            boolean r1 = r1 instanceof a.K8
            if (r1 == 0) goto Lc
            a.V4$a r1 = a.V4.a.b
            r0.e = r1
            return
        Lc:
            a.V4$a r1 = a.V4.a.c
            r0.e = r1
            return
    }

    @Override // a.V4
    public final void d(int r2) {
            r1 = this;
            boolean r0 = r1.j
            if (r0 == 0) goto L5
            goto L20
        L5:
            r0 = 1
            r1.j = r0
            r1.g = r2
            java.util.ArrayList r2 = r1.k
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r2.next()
            a.T4 r0 = (a.T4) r0
            r0.a(r0)
            goto L10
        L20:
            return
    }
}
