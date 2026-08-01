package p000;

/* JADX INFO: renamed from: ol */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0627ol {

    /* JADX INFO: renamed from: α */
    public final java.lang.ref.WeakReference f8132;

    /* JADX INFO: renamed from: β */
    public final java.lang.ref.WeakReference f8133;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f8134;

    /* JADX INFO: renamed from: δ */
    public final boolean f8135;

    /* JADX INFO: renamed from: ε */
    public final long f8136;

    public C0627ol(java.lang.ref.WeakReference r1, java.lang.ref.WeakReference r2, java.lang.String r3, boolean r4, long r5) {
            r0 = this;
            r0.<init>()
            r0.f8132 = r1
            r0.f8133 = r2
            r0.f8134 = r3
            r0.f8135 = r4
            r0.f8136 = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3c
        L3:
            boolean r0 = r3 instanceof p000.C0627ol
            if (r0 != 0) goto L8
            goto L3a
        L8:
            ol r3 = (p000.C0627ol) r3
            java.lang.ref.WeakReference r0 = r2.f8132
            java.lang.ref.WeakReference r1 = r3.f8132
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L3a
        L15:
            java.lang.ref.WeakReference r0 = r2.f8133
            java.lang.ref.WeakReference r1 = r3.f8133
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L3a
        L20:
            java.lang.String r0 = r2.f8134
            java.lang.String r1 = r3.f8134
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L3a
        L2b:
            boolean r0 = r2.f8135
            boolean r1 = r3.f8135
            if (r0 == r1) goto L32
            goto L3a
        L32:
            long r0 = r2.f8136
            long r2 = r3.f8136
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L3c
        L3a:
            r2 = 0
            return r2
        L3c:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            r0 = 0
            java.lang.ref.WeakReference r1 = r4.f8132
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            r2 = 31
            int r1 = r1 * r2
            java.lang.ref.WeakReference r3 = r4.f8133
            if (r3 != 0) goto L13
            goto L17
        L13:
            int r0 = r3.hashCode()
        L17:
            int r1 = r1 + r0
            int r1 = r1 * r2
            java.lang.String r0 = r4.f8134
            int r0 = p000.a12.m15(r1, r2, r0)
            boolean r1 = r4.f8135
            int r0 = p000.lz1.m3678(r0, r2, r1)
            long r1 = r4.f8136
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SimilarEmojiCandidate(container="
            r0.<init>(r1)
            java.lang.ref.WeakReference r1 = r3.f8132
            r0.append(r1)
            java.lang.String r1 = ", anchor="
            r0.append(r1)
            java.lang.ref.WeakReference r1 = r3.f8133
            r0.append(r1)
            java.lang.String r1 = ", url="
            r0.append(r1)
            java.lang.String r1 = r3.f8134
            r0.append(r1)
            java.lang.String r1 = ", animationExpected="
            r0.append(r1)
            boolean r1 = r3.f8135
            r0.append(r1)
            java.lang.String r1 = ", time="
            r0.append(r1)
            long r1 = r3.f8136
            r0.append(r1)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
