package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class sg extends defpackage.jg {
    public int m;

    public sg(defpackage.qb0 r1) {
            r0 = this;
            r0.<init>(r1)
            boolean r1 = r1 instanceof defpackage.po
            if (r1 == 0) goto Lb
            r1 = 2
            r0.e = r1
            return
        Lb:
            r1 = 3
            r0.e = r1
            return
    }

    @Override // defpackage.jg
    public final void d(int r4) {
            r3 = this;
            boolean r0 = r3.j
            if (r0 == 0) goto L5
            goto L1f
        L5:
            r0 = 1
            r3.j = r0
            r3.g = r4
            java.util.ArrayList r4 = r3.k
            int r0 = r4.size()
            r1 = 0
        L11:
            if (r1 >= r0) goto L1f
            java.lang.Object r2 = r4.get(r1)
            int r1 = r1 + 1
            hg r2 = (defpackage.hg) r2
            r2.a(r2)
            goto L11
        L1f:
            return
    }
}
