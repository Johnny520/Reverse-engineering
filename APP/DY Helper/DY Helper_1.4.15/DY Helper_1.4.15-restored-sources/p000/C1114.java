package p000;

/* JADX INFO: renamed from: м */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1114 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f13446;

    /* JADX INFO: renamed from: β */
    public final p000.m80 f13447;

    public C1114(java.lang.String r1, p000.m80 r2) {
            r0 = this;
            r0.<init>()
            r0.f13446 = r1
            r0.f13447 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C1114
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            м r5 = (p000.C1114) r5
            java.lang.String r1 = r5.f13446
            java.lang.String r3 = r4.f13446
            boolean r1 = p000.ln0.m3626(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            m80 r4 = r4.f13447
            m80 r5 = r5.f13447
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            r0 = 0
            java.lang.String r1 = r2.f13446
            if (r1 == 0) goto La
            int r1 = r1.hashCode()
            goto Lb
        La:
            r1 = r0
        Lb:
            int r1 = r1 * 31
            m80 r2 = r2.f13447
            if (r2 == 0) goto L15
            int r0 = r2.hashCode()
        L15:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AccessibilityAction(label="
            r0.<init>(r1)
            java.lang.String r1 = r2.f13446
            r0.append(r1)
            java.lang.String r1 = ", action="
            r0.append(r1)
            m80 r2 = r2.f13447
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
