package n2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements n2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8950b;

    public f(int r3, int r4) {
            r2 = this;
            r2.<init>()
            r2.f8949a = r3
            r2.f8950b = r4
            if (r3 < 0) goto Ld
            if (r4 < 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 != 0) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " and "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = " respectively."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            o2.a.a(r3)
        L2e:
            return
    }

    @Override // n2.g
    public final void a(k5.n r8) {
            r7 = this;
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            int r3 = r7.f8949a
            if (r1 >= r3) goto L2f
            int r3 = r2 + 1
            int r4 = r8.f7238h
            if (r4 <= r3) goto L2e
            int r4 = r4 - r3
            int r4 = r4 + (-1)
            char r4 = r8.b(r4)
            int r5 = r8.f7238h
            int r5 = r5 - r3
            char r5 = r8.b(r5)
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L2a
            boolean r4 = java.lang.Character.isLowSurrogate(r5)
            if (r4 == 0) goto L2a
            int r2 = r2 + 2
            goto L2b
        L2a:
            r2 = r3
        L2b:
            int r1 = r1 + 1
            goto L3
        L2e:
            r2 = r4
        L2f:
            r1 = r0
        L30:
            int r3 = r7.f8950b
            if (r0 >= r3) goto L6e
            int r3 = r1 + 1
            int r4 = r8.f7239i
            java.lang.Object r5 = r8.f7242l
            c8.a r5 = (c8.a) r5
            int r4 = r4 + r3
            int r6 = r5.b()
            if (r4 >= r6) goto L66
            int r4 = r8.f7239i
            int r4 = r4 + r3
            int r4 = r4 + (-1)
            char r4 = r8.b(r4)
            int r5 = r8.f7239i
            int r5 = r5 + r3
            char r5 = r8.b(r5)
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L62
            boolean r4 = java.lang.Character.isLowSurrogate(r5)
            if (r4 == 0) goto L62
            int r1 = r1 + 2
            goto L63
        L62:
            r1 = r3
        L63:
            int r0 = r0 + 1
            goto L30
        L66:
            int r0 = r5.b()
            int r1 = r8.f7239i
            int r1 = r0 - r1
        L6e:
            int r0 = r8.f7239i
            int r1 = r1 + r0
            r8.a(r0, r1)
            int r0 = r8.f7238h
            int r1 = r0 - r2
            r8.a(r1, r0)
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof n2.f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            n2.f r5 = (n2.f) r5
            int r1 = r5.f8949a
            int r3 = r4.f8949a
            if (r3 == r1) goto L13
            return r2
        L13:
            int r1 = r4.f8950b
            int r5 = r5.f8950b
            if (r1 == r5) goto L1a
            return r2
        L1a:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f8949a
            int r0 = r0 * 31
            int r1 = r2.f8950b
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor="
            r0.<init>(r1)
            int r1 = r3.f8949a
            r0.append(r1)
            java.lang.String r1 = ", lengthAfterCursor="
            r0.append(r1)
            int r1 = r3.f8950b
            r2 = 41
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }
}
