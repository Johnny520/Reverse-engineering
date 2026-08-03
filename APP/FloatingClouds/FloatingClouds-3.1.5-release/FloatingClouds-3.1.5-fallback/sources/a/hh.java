package a;

/* JADX INFO: loaded from: classes.dex */
public class hh extends a.N3 {
    public java.util.ArrayList<a.N3> e0;

    public hh() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.e0 = r0
            return
    }

    public void B() {
            r4 = this;
            java.util.ArrayList<a.N3> r0 = r4.e0
            if (r0 != 0) goto L5
            goto L20
        L5:
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L20
            java.util.ArrayList<a.N3> r2 = r4.e0
            java.lang.Object r2 = r2.get(r1)
            a.N3 r2 = (a.N3) r2
            boolean r3 = r2 instanceof a.hh
            if (r3 == 0) goto L1d
            a.hh r2 = (a.hh) r2
            r2.B()
        L1d:
            int r1 = r1 + 1
            goto La
        L20:
            return
    }

    @Override // a.N3
    public void s() {
            r1 = this;
            java.util.ArrayList<a.N3> r0 = r1.e0
            r0.clear()
            super.s()
            return
    }

    @Override // a.N3
    public final void u(a.A2 r4) {
            r3 = this;
            super.u(r4)
            java.util.ArrayList<a.N3> r0 = r3.e0
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<a.N3> r2 = r3.e0
            java.lang.Object r2 = r2.get(r1)
            a.N3 r2 = (a.N3) r2
            r2.u(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }
}
