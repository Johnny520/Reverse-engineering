package l1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f1.r0 f7726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f7727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u2.m f7728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f7729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l1.d f7730e;

    public a(f1.r0 r1, long r2, u2.m r4, float r5, l1.d r6) {
            r0 = this;
            r0.<init>()
            r0.f7726a = r1
            r0.f7727b = r2
            r0.f7728c = r4
            r0.f7729d = r5
            r0.f7730e = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L3e
        L3:
            boolean r0 = r5 instanceof l1.a
            if (r0 != 0) goto L8
            goto L3c
        L8:
            l1.a r5 = (l1.a) r5
            f1.r0 r0 = r4.f7726a
            f1.r0 r1 = r5.f7726a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L3c
        L15:
            long r0 = r4.f7727b
            long r2 = r5.f7727b
            boolean r0 = e1.e.a(r0, r2)
            if (r0 != 0) goto L20
            goto L3c
        L20:
            u2.m r0 = r4.f7728c
            u2.m r1 = r5.f7728c
            if (r0 == r1) goto L27
            goto L3c
        L27:
            float r0 = r4.f7729d
            float r1 = r5.f7729d
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L32
            goto L3c
        L32:
            l1.d r0 = r4.f7730e
            l1.d r5 = r5.f7730e
            boolean r5 = gg.l.a(r0, r5)
            if (r5 != 0) goto L3e
        L3c:
            r5 = 0
            return r5
        L3e:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            f1.r0 r0 = r4.f7726a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f7727b
            int r0 = eh.a.f(r0, r1, r2)
            u2.m r2 = r4.f7728c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            float r0 = r4.f7729d
            int r0 = eh.a.d(r0, r2, r1)
            l1.d r1 = r4.f7730e
            if (r1 != 0) goto L23
            r1 = 0
            goto L27
        L23:
            int r1 = r1.hashCode()
        L27:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ShadowKey(shape="
            r0.<init>(r1)
            f1.r0 r1 = r3.f7726a
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            long r1 = r3.f7727b
            java.lang.String r1 = e1.e.d(r1)
            r0.append(r1)
            java.lang.String r1 = ", layoutDirection="
            r0.append(r1)
            u2.m r1 = r3.f7728c
            r0.append(r1)
            java.lang.String r1 = ", density="
            r0.append(r1)
            float r1 = r3.f7729d
            r0.append(r1)
            java.lang.String r1 = ", shadow="
            r0.append(r1)
            l1.d r1 = r3.f7730e
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
