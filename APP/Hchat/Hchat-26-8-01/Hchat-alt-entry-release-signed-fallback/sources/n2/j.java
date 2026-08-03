package n2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n2.j f8952g = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2.b f8958f;

    static {
            n2.j r0 = new n2.j
            r5 = 1
            p2.b r6 = p2.b.f10086i
            r1 = 0
            r2 = 0
            r3 = 1
            r4 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            n2.j.f8952g = r0
            return
    }

    public j(boolean r1, int r2, boolean r3, int r4, int r5, p2.b r6) {
            r0 = this;
            r0.<init>()
            r0.f8953a = r1
            r0.f8954b = r2
            r0.f8955c = r3
            r0.f8956d = r4
            r0.f8957e = r5
            r0.f8958f = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L35
        L3:
            boolean r0 = r3 instanceof n2.j
            if (r0 != 0) goto L8
            goto L37
        L8:
            n2.j r3 = (n2.j) r3
            boolean r0 = r3.f8953a
            boolean r1 = r2.f8953a
            if (r1 == r0) goto L11
            goto L37
        L11:
            int r0 = r2.f8954b
            int r1 = r3.f8954b
            if (r0 != r1) goto L37
            boolean r0 = r2.f8955c
            boolean r1 = r3.f8955c
            if (r0 == r1) goto L1e
            goto L37
        L1e:
            int r0 = r2.f8956d
            int r1 = r3.f8956d
            if (r0 != r1) goto L37
            int r0 = r2.f8957e
            int r1 = r3.f8957e
            if (r0 != r1) goto L37
            p2.b r0 = r2.f8958f
            p2.b r3 = r3.f8958f
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L35
            goto L37
        L35:
            r3 = 1
            return r3
        L37:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f8953a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f8954b
            int r0 = eh.a.e(r2, r0, r1)
            boolean r2 = r3.f8955c
            int r0 = eh.a.h(r0, r1, r2)
            int r2 = r3.f8956d
            int r0 = eh.a.e(r2, r0, r1)
            int r1 = r3.f8957e
            r2 = 961(0x3c1, float:1.347E-42)
            int r0 = eh.a.e(r1, r0, r2)
            p2.b r1 = r3.f8958f
            java.lang.Object r1 = r1.f10087g
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ImeOptions(singleLine="
            r0.<init>(r1)
            boolean r1 = r3.f8953a
            r0.append(r1)
            java.lang.String r1 = ", capitalization="
            r0.append(r1)
            r1 = -1
            int r2 = r3.f8954b
            if (r2 != r1) goto L19
            java.lang.String r1 = "Unspecified"
            goto L32
        L19:
            if (r2 != 0) goto L1e
            java.lang.String r1 = "None"
            goto L32
        L1e:
            r1 = 1
            if (r2 != r1) goto L24
            java.lang.String r1 = "Characters"
            goto L32
        L24:
            r1 = 2
            if (r2 != r1) goto L2a
            java.lang.String r1 = "Words"
            goto L32
        L2a:
            r1 = 3
            if (r2 != r1) goto L30
            java.lang.String r1 = "Sentences"
            goto L32
        L30:
            java.lang.String r1 = "Invalid"
        L32:
            r0.append(r1)
            java.lang.String r1 = ", autoCorrect="
            r0.append(r1)
            boolean r1 = r3.f8955c
            r0.append(r1)
            java.lang.String r1 = ", keyboardType="
            r0.append(r1)
            int r1 = r3.f8956d
            java.lang.String r1 = n2.k.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", imeAction="
            r0.append(r1)
            int r1 = r3.f8957e
            java.lang.String r1 = n2.i.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", platformImeOptions=null, hintLocales="
            r0.append(r1)
            p2.b r1 = r3.f8958f
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
