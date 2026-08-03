package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w.p0 f14594b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14595a;

    static {
            w.p0 r0 = new w.p0
            r1 = 0
            r2 = 127(0x7f, float:1.78E-43)
            r0.<init>(r1, r2)
            w.p0.f14594b = r0
            return
    }

    public p0(int r1, int r2) {
            r0 = this;
            r2 = r2 & 4
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.<init>()
            r0.f14595a = r1
            return
    }

    public final n2.j a(boolean r8) {
            r7 = this;
            n2.j r0 = new n2.j
            n2.k r1 = new n2.k
            int r2 = r7.f14595a
            r1.<init>(r2)
            if (r2 != 0) goto Lc
            r1 = 0
        Lc:
            r3 = 1
            if (r1 == 0) goto L13
            int r1 = r1.f8959a
            r4 = r1
            goto L14
        L13:
            r4 = r3
        L14:
            p2.b r6 = p2.b.f10086i
            r2 = 0
            r5 = r3
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L10
        L3:
            boolean r0 = r2 instanceof w.p0
            if (r0 != 0) goto L8
            goto L12
        L8:
            w.p0 r2 = (w.p0) r2
            int r0 = r1.f14595a
            int r2 = r2.f14595a
            if (r0 != r2) goto L12
        L10:
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r4 = this;
            r0 = -1
            int r1 = java.lang.Integer.hashCode(r0)
            int r1 = r1 * 961
            int r2 = r4.f14595a
            r3 = 31
            int r1 = eh.a.e(r2, r1, r3)
            r2 = 29791(0x745f, float:4.1746E-41)
            int r0 = eh.a.e(r0, r1, r2)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "KeyboardOptions(capitalization="
            r0.<init>(r1)
            java.lang.String r1 = "Unspecified"
            r0.append(r1)
            java.lang.String r2 = ", autoCorrectEnabled=null, keyboardType="
            r0.append(r2)
            int r2 = r3.f14595a
            java.lang.String r2 = n2.k.a(r2)
            r0.append(r2)
            java.lang.String r2 = ", imeAction="
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
