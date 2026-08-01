package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ly1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f6842;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f6843;

    /* JADX INFO: renamed from: γ */
    public final p000.my1 f6844;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f6845;

    /* JADX INFO: renamed from: ε */
    public final p000.C0757rd f6846;

    /* JADX INFO: renamed from: ζ */
    public final java.util.List f6847;

    public ly1(java.lang.String r1, java.lang.String r2, p000.my1 r3, java.lang.String r4, p000.C0757rd r5, java.util.List r6) {
            r0 = this;
            r4.getClass()
            r6.getClass()
            r0.<init>()
            r0.f6842 = r1
            r0.f6843 = r2
            r0.f6844 = r3
            r0.f6845 = r4
            r0.f6846 = r5
            r0.f6847 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L4d
        L3:
            boolean r0 = r3 instanceof p000.ly1
            if (r0 != 0) goto L8
            goto L4b
        L8:
            ly1 r3 = (p000.ly1) r3
            java.lang.String r0 = r2.f6842
            java.lang.String r1 = r3.f6842
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L4b
        L15:
            java.lang.String r0 = r2.f6843
            java.lang.String r1 = r3.f6843
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L4b
        L20:
            my1 r0 = r2.f6844
            my1 r1 = r3.f6844
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L4b
        L2b:
            java.lang.String r0 = r2.f6845
            java.lang.String r1 = r3.f6845
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L36
            goto L4b
        L36:
            rd r0 = r2.f6846
            rd r1 = r3.f6846
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            goto L4b
        L41:
            java.util.List r2 = r2.f6847
            java.util.List r3 = r3.f6847
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L4d
        L4b:
            r2 = 0
            return r2
        L4d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f6842
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f6843
            int r0 = p000.a12.m15(r0, r1, r2)
            my1 r2 = r3.f6844
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r3.f6845
            int r0 = p000.a12.m15(r2, r1, r0)
            rd r2 = r3.f6846
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.List r3 = r3.f6847
            int r3 = r3.hashCode()
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", name="
            java.lang.String r1 = ", messageConfig="
            java.lang.String r2 = "SparkMessageGroup(id="
            java.lang.String r3 = r5.f6842
            java.lang.String r4 = r5.f6843
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            my1 r1 = r5.f6844
            r0.append(r1)
            java.lang.String r1 = ", renewMode="
            r0.append(r1)
            java.lang.String r1 = r5.f6845
            r0.append(r1)
            java.lang.String r1 = ", campRule="
            r0.append(r1)
            rd r1 = r5.f6846
            r0.append(r1)
            java.lang.String r1 = ", members="
            r0.append(r1)
            java.util.List r5 = r5.f6847
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
