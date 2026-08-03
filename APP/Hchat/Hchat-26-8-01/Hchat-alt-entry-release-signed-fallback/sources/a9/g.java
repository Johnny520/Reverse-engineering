package a9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f95a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f96b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f97c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f98d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f99e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fg.a f100f;

    public /* synthetic */ g() {
            r7 = this;
            r4 = 0
            r5 = 0
            java.lang.String r1 = ""
            r2 = 0
            r3 = 0
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public g(java.lang.String r1, int r2, int r3, int r4, int r5, wb.zh r6) {
            r0 = this;
            r0.<init>()
            r0.f95a = r1
            r0.f96b = r2
            r0.f97c = r3
            r0.f98d = r4
            r0.f99e = r5
            r0.f100f = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3d
        L3:
            boolean r0 = r3 instanceof a9.g
            if (r0 != 0) goto L8
            goto L3b
        L8:
            a9.g r3 = (a9.g) r3
            java.lang.String r0 = r2.f95a
            java.lang.String r1 = r3.f95a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L3b
        L15:
            int r0 = r2.f96b
            int r1 = r3.f96b
            if (r0 == r1) goto L1c
            goto L3b
        L1c:
            int r0 = r2.f97c
            int r1 = r3.f97c
            if (r0 == r1) goto L23
            goto L3b
        L23:
            int r0 = r2.f98d
            int r1 = r3.f98d
            if (r0 == r1) goto L2a
            goto L3b
        L2a:
            int r0 = r2.f99e
            int r1 = r3.f99e
            if (r0 == r1) goto L31
            goto L3b
        L31:
            fg.a r0 = r2.f100f
            fg.a r3 = r3.f100f
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L3d
        L3b:
            r3 = 0
            return r3
        L3d:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f95a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f96b
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f97c
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f98d
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f99e
            int r0 = eh.a.e(r2, r0, r1)
            fg.a r1 = r3.f100f
            if (r1 != 0) goto L27
            r1 = 0
            goto L2b
        L27:
            int r1 = r1.hashCode()
        L2b:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TitleState(text="
            r0.<init>(r1)
            java.lang.String r1 = r5.f95a
            r0.append(r1)
            java.lang.String r1 = ", bgStart="
            r0.append(r1)
            int r1 = r5.f96b
            r0.append(r1)
            java.lang.String r1 = ", bgEnd="
            r0.append(r1)
            java.lang.String r1 = ", textStart="
            java.lang.String r2 = ", textEnd="
            int r3 = r5.f97c
            int r4 = r5.f98d
            wb.en.p(r0, r3, r1, r4, r2)
            int r1 = r5.f99e
            r0.append(r1)
            java.lang.String r1 = ", onClick="
            r0.append(r1)
            fg.a r1 = r5.f100f
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
