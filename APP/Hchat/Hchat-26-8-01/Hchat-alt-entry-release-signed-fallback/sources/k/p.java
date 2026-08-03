package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f1.g f7030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f1.b f7031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h1.b f7032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f1.j f7033d;

    public p() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f7030a = r0
            r1.f7031b = r0
            r1.f7032c = r0
            r1.f7033d = r0
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof k.p
            if (r0 != 0) goto L8
            goto L35
        L8:
            k.p r3 = (k.p) r3
            f1.g r0 = r2.f7030a
            f1.g r1 = r3.f7030a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            f1.b r0 = r2.f7031b
            f1.b r1 = r3.f7031b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            h1.b r0 = r2.f7032c
            h1.b r1 = r3.f7032c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            f1.j r0 = r2.f7033d
            f1.j r3 = r3.f7033d
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L37
        L35:
            r3 = 0
            return r3
        L37:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            f1.g r0 = r3.f7030a
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            f1.b r2 = r3.f7031b
            if (r2 != 0) goto L13
            r2 = r1
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            h1.b r2 = r3.f7032c
            if (r2 != 0) goto L20
            r2 = r1
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r0 = r0 + r2
            int r0 = r0 * 31
            f1.j r2 = r3.f7033d
            if (r2 != 0) goto L2c
            goto L30
        L2c:
            int r1 = r2.hashCode()
        L30:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BorderCache(imageBitmap="
            r0.<init>(r1)
            f1.g r1 = r2.f7030a
            r0.append(r1)
            java.lang.String r1 = ", canvas="
            r0.append(r1)
            f1.b r1 = r2.f7031b
            r0.append(r1)
            java.lang.String r1 = ", canvasDrawScope="
            r0.append(r1)
            h1.b r1 = r2.f7032c
            r0.append(r1)
            java.lang.String r1 = ", borderPath="
            r0.append(r1)
            f1.j r1 = r2.f7033d
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
