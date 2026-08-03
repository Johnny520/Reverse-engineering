package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5906 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.ArrayList<java.lang.Object> f21541;

    public C5906(int r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.f21541 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m21924(java.lang.Object r2) {
            r1 = this;
            java.util.ArrayList<java.lang.Object> r0 = r1.f21541
            r0.add(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m21925(java.lang.Object r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            boolean r0 = r4 instanceof java.lang.Object[]
            if (r0 == 0) goto L1d
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r0 = r4.length
            if (r0 <= 0) goto L59
            java.util.ArrayList<java.lang.Object> r0 = r3.f21541
            int r1 = r0.size()
            int r2 = r4.length
            int r1 = r1 + r2
            r0.ensureCapacity(r1)
            java.util.ArrayList<java.lang.Object> r0 = r3.f21541
            java.util.Collections.addAll(r0, r4)
            goto L59
        L1d:
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L29
            java.util.ArrayList<java.lang.Object> r0 = r3.f21541
            java.util.Collection r4 = (java.util.Collection) r4
            r0.addAll(r4)
            goto L59
        L29:
            boolean r0 = r4 instanceof java.lang.Iterable
            if (r0 == 0) goto L43
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L33:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r4.next()
            java.util.ArrayList<java.lang.Object> r1 = r3.f21541
            r1.add(r0)
            goto L33
        L43:
            boolean r0 = r4 instanceof java.util.Iterator
            if (r0 == 0) goto L5a
            java.util.Iterator r4 = (java.util.Iterator) r4
        L49:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L59
            java.util.ArrayList<java.lang.Object> r0 = r3.f21541
            java.lang.Object r1 = r4.next()
            r0.add(r1)
            goto L49
        L59:
            return
        L5a:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Don't know how to spread "
            r1.append(r2)
            java.lang.Class r4 = r4.getClass()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m21926() {
            r1 = this;
            java.util.ArrayList<java.lang.Object> r0 = r1.f21541
            int r0 = r0.size()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.lang.Object[] m21927(java.lang.Object[] r2) {
            r1 = this;
            java.util.ArrayList<java.lang.Object> r0 = r1.f21541
            java.lang.Object[] r2 = r0.toArray(r2)
            return r2
    }
}
