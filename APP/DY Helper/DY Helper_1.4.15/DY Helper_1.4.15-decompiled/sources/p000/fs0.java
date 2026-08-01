package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class fs0 extends p000.hs0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f4082;

    /* JADX INFO: renamed from: β */
    public final p000.o32 f4083;

    public fs0(java.lang.String r1, p000.o32 r2) {
            r0 = this;
            r0.<init>()
            r0.f4082 = r1
            r0.f4083 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof p000.fs0
            if (r0 != 0) goto L8
            goto L1f
        L8:
            fs0 r3 = (p000.fs0) r3
            java.lang.String r0 = r3.f4082
            java.lang.String r1 = r2.f4082
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            o32 r2 = r2.f4083
            o32 r3 = r3.f4083
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f4082
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            o32 r1 = r1.f4083
            if (r1 == 0) goto L11
            int r1 = r1.hashCode()
            goto L12
        L11:
            r1 = 0
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LinkAnnotation.Clickable(tag="
            r0.<init>(r1)
            java.lang.String r2 = r2.f4082
            r1 = 41
            java.lang.String r2 = p000.AbstractC0602nx.m4132(r0, r2, r1)
            return r2
    }
}
