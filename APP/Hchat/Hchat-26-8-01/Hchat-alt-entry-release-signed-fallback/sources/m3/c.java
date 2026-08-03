package m3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8714h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8715i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.lang.Object f8716j;

    public c() {
            r2 = this;
            r2.<init>()
            l3.w r0 = l3.w.f7834h
            if (r0 != 0) goto L10
            l3.w r0 = new l3.w
            r1 = 8
            r0.<init>(r1)
            l3.w.f7834h = r0
        L10:
            return
    }

    public int a(int r3) {
            r2 = this;
            int r0 = r2.f8715i
            if (r3 >= r0) goto L10
            java.lang.Object r0 = r2.f8716j
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r1 = r2.f8714h
            int r1 = r1 + r3
            short r3 = r0.getShort(r1)
            return r3
        L10:
            r3 = 0
            return r3
    }

    public void c() {
            r2 = this;
            java.lang.Object r0 = r2.f8716j
            uf.g r0 = (uf.g) r0
            int r0 = r0.f13791n
            int r1 = r2.f8715i
            if (r0 != r1) goto Lb
            return
        Lb:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    public void d() {
            r3 = this;
        L0:
            int r0 = r3.f8713g
            java.lang.Object r1 = r3.f8716j
            uf.g r1 = (uf.g) r1
            int r2 = r1.f13789l
            if (r0 >= r2) goto L15
            int[] r1 = r1.f13786i
            r1 = r1[r0]
            if (r1 >= 0) goto L15
            int r0 = r0 + 1
            r3.f8713g = r0
            goto L0
        L15:
            return
    }

    public boolean hasNext() {
            r2 = this;
            int r0 = r2.f8713g
            java.lang.Object r1 = r2.f8716j
            uf.g r1 = (uf.g) r1
            int r1 = r1.f13789l
            if (r0 >= r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public void remove() {
            r3 = this;
            java.lang.Object r0 = r3.f8716j
            uf.g r0 = (uf.g) r0
            r3.c()
            int r1 = r3.f8714h
            r2 = -1
            if (r1 == r2) goto L1b
            r0.d()
            int r1 = r3.f8714h
            r0.l(r1)
            r3.f8714h = r2
            int r0 = r0.f13791n
            r3.f8715i = r0
            return
        L1b:
            java.lang.String r0 = "Call next() before removing element from the iterator."
            j8.o.A(r0)
            return
    }
}
