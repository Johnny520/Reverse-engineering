package p000;

/* JADX INFO: renamed from: k7 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0459k7 {

    /* JADX INFO: renamed from: α */
    public final java.util.List f5779;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f5780;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f5781;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f5782;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f5783;

    /* JADX INFO: renamed from: ζ */
    public final long f5784;

    public /* synthetic */ C0459k7() {
            r8 = this;
            r1 = 0
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public C0459k7(java.util.ArrayList r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, long r6) {
            r0 = this;
            r0.<init>()
            r0.f5779 = r1
            r0.f5780 = r2
            r0.f5781 = r3
            r0.f5782 = r4
            r0.f5783 = r5
            r0.f5784 = r6
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p000.C0459k7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            k7 r6 = (p000.C0459k7) r6
            java.util.List r1 = r5.f5779
            java.util.List r3 = r6.f5779
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r5.f5780
            java.lang.String r3 = r6.f5780
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r5.f5781
            java.lang.String r3 = r6.f5781
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r5.f5782
            java.lang.String r3 = r6.f5782
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r5.f5783
            java.lang.String r3 = r6.f5783
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            long r3 = r5.f5784
            long r5 = r6.f5784
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L4c
            return r2
        L4c:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            r0 = 0
            java.util.List r1 = r4.f5779
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.String r2 = r4.f5780
            if (r2 != 0) goto L13
            r2 = r0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.String r2 = r4.f5781
            if (r2 != 0) goto L20
            r2 = r0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.String r2 = r4.f5782
            if (r2 != 0) goto L2d
            r2 = r0
            goto L31
        L2d:
            int r2 = r2.hashCode()
        L31:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.String r2 = r4.f5783
            if (r2 != 0) goto L39
            goto L3d
        L39:
            int r0 = r2.hashCode()
        L3d:
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r2 = r4.f5784
            int r4 = java.lang.Long.hashCode(r2)
            int r4 = r4 + r1
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AudioInfo(audioUrls="
            r0.<init>(r1)
            java.util.List r1 = r5.f5779
            r0.append(r1)
            java.lang.String r1 = ", title="
            r0.append(r1)
            java.lang.String r1 = r5.f5780
            r0.append(r1)
            java.lang.String r1 = ", author="
            r0.append(r1)
            java.lang.String r1 = ", mid="
            java.lang.String r2 = ", coverUrl="
            java.lang.String r3 = r5.f5781
            java.lang.String r4 = r5.f5782
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            java.lang.String r1 = r5.f5783
            r0.append(r1)
            java.lang.String r1 = ", durationMs="
            r0.append(r1)
            long r1 = r5.f5784
            r0.append(r1)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final java.util.List m3168() {
            r0 = this;
            java.util.List r0 = r0.f5779
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final java.lang.String m3169() {
            r0 = this;
            java.lang.String r0 = r0.f5781
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final java.lang.String m3170() {
            r0 = this;
            java.lang.String r0 = r0.f5783
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final long m3171() {
            r2 = this;
            long r0 = r2.f5784
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public final boolean m3172() {
            r1 = this;
            r0 = 1
            java.util.List r1 = r1.f5779
            if (r1 == 0) goto Le
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Lc
            goto Le
        Lc:
            r1 = 0
            goto Lf
        Le:
            r1 = r0
        Lf:
            r1 = r1 ^ r0
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String m3173() {
            r0 = this;
            java.lang.String r0 = r0.f5782
            return r0
    }

    /* JADX INFO: renamed from: η */
    public final java.lang.String m3174() {
            r0 = this;
            java.lang.String r0 = r0.f5780
            return r0
    }
}
