package ba;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ba.l f577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.res.ColorStateList f578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.res.ColorStateList f579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f582f;

    public k(ba.l r1, android.content.res.ColorStateList r2, android.content.res.ColorStateList r3, boolean r4, boolean r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.f577a = r1
            r0.f578b = r2
            r0.f579c = r3
            r0.f580d = r4
            r0.f581e = r5
            r0.f582f = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L41
        L3:
            boolean r0 = r3 instanceof ba.k
            if (r0 != 0) goto L8
            goto L3f
        L8:
            ba.k r3 = (ba.k) r3
            ba.l r0 = r2.f577a
            ba.l r1 = r3.f577a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L3f
        L15:
            android.content.res.ColorStateList r0 = r2.f578b
            android.content.res.ColorStateList r1 = r3.f578b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L3f
        L20:
            android.content.res.ColorStateList r0 = r2.f579c
            android.content.res.ColorStateList r1 = r3.f579c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L3f
        L2b:
            boolean r0 = r2.f580d
            boolean r1 = r3.f580d
            if (r0 == r1) goto L32
            goto L3f
        L32:
            boolean r0 = r2.f581e
            boolean r1 = r3.f581e
            if (r0 == r1) goto L39
            goto L3f
        L39:
            int r0 = r2.f582f
            int r3 = r3.f582f
            if (r0 == r3) goto L41
        L3f:
            r3 = 0
            return r3
        L41:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            ba.l r0 = r3.f577a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            android.content.res.ColorStateList r2 = r3.f578b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            android.content.res.ColorStateList r0 = r3.f579c
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r2 = r3.f580d
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r3.f581e
            int r0 = eh.a.h(r0, r1, r2)
            int r1 = r3.f582f
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextColorState(target="
            r0.<init>(r1)
            ba.l r1 = r2.f577a
            r0.append(r1)
            java.lang.String r1 = ", textColors="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r2.f578b
            r0.append(r1)
            java.lang.String r1 = ", linkTextColors="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r2.f579c
            r0.append(r1)
            java.lang.String r1 = ", changeTextColor="
            r0.append(r1)
            boolean r1 = r2.f580d
            r0.append(r1)
            java.lang.String r1 = ", changeLinkColor="
            r0.append(r1)
            boolean r1 = r2.f581e
            r0.append(r1)
            java.lang.String r1 = ", appliedColor="
            r0.append(r1)
            int r1 = r2.f582f
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
