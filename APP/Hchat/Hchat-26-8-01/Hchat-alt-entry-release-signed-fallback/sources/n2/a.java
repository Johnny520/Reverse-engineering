package n2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.g f8919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8920b;

    public a(i2.g r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f8919a = r1
            r0.f8920b = r2
            return
    }

    public a(java.lang.String r2, int r3) {
            r1 = this;
            i2.g r0 = new i2.g
            r0.<init>(r2)
            r1.<init>(r0, r3)
            return
    }

    @Override // n2.g
    public final void a(k5.n r6) {
            r5 = this;
            int r0 = r6.f7240j
            i2.g r1 = r5.f8919a
            r2 = -1
            if (r0 == r2) goto Lf
            int r3 = r6.f7241k
            java.lang.String r4 = r1.f6314h
            r6.f(r0, r3, r4)
            goto L18
        Lf:
            int r0 = r6.f7238h
            int r3 = r6.f7239i
            java.lang.String r4 = r1.f6314h
            r6.f(r0, r3, r4)
        L18:
            int r0 = r6.f7238h
            int r3 = r6.f7239i
            if (r0 != r3) goto L1f
            r2 = r3
        L1f:
            int r0 = r5.f8920b
            if (r0 <= 0) goto L27
            int r2 = r2 + r0
            int r2 = r2 + (-1)
            goto L2f
        L27:
            int r2 = r2 + r0
            java.lang.String r0 = r1.f6314h
            int r0 = r0.length()
            int r2 = r2 - r0
        L2f:
            java.lang.Object r0 = r6.f7242l
            c8.a r0 = (c8.a) r0
            int r0 = r0.b()
            r1 = 0
            int r0 = r9.e0.r(r2, r1, r0)
            r6.h(r0, r0)
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof n2.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            i2.g r1 = r4.f8919a
            java.lang.String r1 = r1.f6314h
            n2.a r5 = (n2.a) r5
            i2.g r3 = r5.f8919a
            java.lang.String r3 = r3.f6314h
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L1b
            return r2
        L1b:
            int r1 = r4.f8920b
            int r5 = r5.f8920b
            if (r1 == r5) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            i2.g r0 = r2.f8919a
            java.lang.String r0 = r0.f6314h
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.f8920b
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CommitTextCommand(text='"
            r0.<init>(r1)
            i2.g r1 = r3.f8919a
            java.lang.String r1 = r1.f6314h
            r0.append(r1)
            java.lang.String r1 = "', newCursorPosition="
            r0.append(r1)
            int r1 = r3.f8920b
            r2 = 41
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }
}
