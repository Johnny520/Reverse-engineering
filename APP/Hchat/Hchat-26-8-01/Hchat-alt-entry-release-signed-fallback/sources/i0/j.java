package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends java.lang.RuntimeException {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f.f0 f5930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f.f0 f5931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f.v f5932i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5933j;

    public j(f.f0 r1, f.f0 r2, f.v r3, int r4, java.lang.Exception r5) {
            r0 = this;
            r0.<init>(r5)
            r0.f5930g = r1
            r0.f5931h = r2
            r0.f5932i = r3
            r0.f5933j = r4
            return
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n            |Failed to execute op number "
            r0.<init>(r1)
            int r1 = r9.f5933j
            r0.append(r1)
            java.lang.String r1 = ":\n            |"
            r0.append(r1)
            i0.i r1 = new i0.i
            r2 = 0
            r1.<init>(r9, r2)
            ng.k r1 = fb.v0.B(r1)
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L24
            tf.t r1 = tf.t.f13167g
            goto L4a
        L24:
            java.lang.Object r2 = r1.next()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L33
            java.util.List r1 = a.a.x0(r2)
            goto L4a
        L33:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.add(r2)
        L3b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r1.next()
            r3.add(r2)
            goto L3b
        L49:
            r1 = r3
        L4a:
            r2 = 50
            java.util.List r3 = tf.m.M1(r2, r1)
            r7 = 0
            r8 = 62
            java.lang.String r4 = "\n"
            r5 = 0
            r6 = 0
            java.lang.String r1 = tf.m.A1(r3, r4, r5, r6, r7, r8)
            r0.append(r1)
            java.lang.String r1 = "\n            "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = og.n.S(r0)
            return r0
    }
}
