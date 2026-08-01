package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class hy1 {

    /* JADX INFO: renamed from: α */
    public boolean f4844;

    /* JADX INFO: renamed from: β */
    public boolean f4845;

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L19
        L3:
            boolean r0 = r3 instanceof p000.hy1
            if (r0 != 0) goto L8
            goto L17
        L8:
            hy1 r3 = (p000.hy1) r3
            boolean r0 = r2.f4844
            boolean r1 = r3.f4844
            if (r0 == r1) goto L11
            goto L17
        L11:
            boolean r2 = r2.f4845
            boolean r3 = r3.f4845
            if (r2 == r3) goto L19
        L17:
            r2 = 0
            return r2
        L19:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            boolean r0 = r1.f4844
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 * 31
            boolean r1 = r1.f4845
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.f4844
            boolean r3 = r3.f4845
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "OfficialTaskState(hasConversationId="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", hasContentList="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }
}
