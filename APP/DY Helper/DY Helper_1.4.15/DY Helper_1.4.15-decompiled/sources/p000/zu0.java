package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class zu0 {

    /* JADX INFO: renamed from: α */
    public final java.util.Locale f13307;

    public zu0(java.util.Locale r1) {
            r0 = this;
            r0.<init>()
            r0.f13307 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof p000.zu0
            if (r1 != 0) goto L9
            return r0
        L9:
            if (r2 != r3) goto Ld
            r2 = 1
            return r2
        Ld:
            java.util.Locale r2 = r2.f13307
            java.lang.String r2 = r2.toLanguageTag()
            zu0 r3 = (p000.zu0) r3
            java.util.Locale r3 = r3.f13307
            java.lang.String r3 = r3.toLanguageTag()
            boolean r2 = p000.ln0.m3626(r2, r3)
            return r2
    }

    public final int hashCode() {
            r0 = this;
            java.util.Locale r0 = r0.f13307
            java.lang.String r0 = r0.toLanguageTag()
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.util.Locale r0 = r0.f13307
            java.lang.String r0 = r0.toLanguageTag()
            return r0
    }
}
