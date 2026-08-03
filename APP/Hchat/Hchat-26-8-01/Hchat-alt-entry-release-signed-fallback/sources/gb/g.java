package gb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f4422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f4423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f4424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f4426e;

    public g(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, long r5) {
            r0 = this;
            r0.<init>()
            r0.f4422a = r1
            r0.f4423b = r2
            r0.f4424c = r3
            r0.f4425d = r5
            r0.f4426e = r4
            return
    }

    public final byte[] a() {
            r3 = this;
            java.lang.String r0 = "utf8"
            java.lang.String r1 = r3.f4426e
            boolean r0 = r1.equals(r0)
            java.lang.String r2 = r3.f4423b
            if (r0 == 0) goto L16
            java.nio.charset.Charset r0 = og.a.f9804a
            byte[] r0 = r2.getBytes(r0)
            r0.getClass()
            return r0
        L16:
            java.lang.String r0 = "base64"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L27
            r0 = 2
            byte[] r0 = android.util.Base64.decode(r2, r0)
            r0.getClass()
            return r0
        L27:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "不支持的插件文件编码: "
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L40
        L3:
            boolean r0 = r5 instanceof gb.g
            if (r0 != 0) goto L8
            goto L3e
        L8:
            gb.g r5 = (gb.g) r5
            java.lang.String r0 = r4.f4422a
            java.lang.String r1 = r5.f4422a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L3e
        L15:
            java.lang.String r0 = r4.f4423b
            java.lang.String r1 = r5.f4423b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L3e
        L20:
            java.lang.String r0 = r4.f4424c
            java.lang.String r1 = r5.f4424c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L3e
        L2b:
            long r0 = r4.f4425d
            long r2 = r5.f4425d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L34
            goto L3e
        L34:
            java.lang.String r0 = r4.f4426e
            java.lang.String r5 = r5.f4426e
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L40
        L3e:
            r5 = 0
            return r5
        L40:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f4422a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f4423b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f4424c
            int r0 = eh.a.g(r0, r1, r2)
            long r2 = r4.f4425d
            int r0 = eh.a.f(r0, r1, r2)
            java.lang.String r1 = r4.f4426e
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", content="
            java.lang.String r1 = ", sha256="
            java.lang.String r2 = "PluginMarketFile(name="
            java.lang.String r3 = r5.f4422a
            java.lang.String r4 = r5.f4423b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f4424c
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            long r1 = r5.f4425d
            r0.append(r1)
            java.lang.String r1 = ", encoding="
            r0.append(r1)
            java.lang.String r1 = r5.f4426e
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
