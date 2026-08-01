package p000;

/* JADX INFO: renamed from: te */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0832te extends p000.C0869ue {

    /* JADX INFO: renamed from: α */
    public final java.lang.Throwable f10343;

    public C0832te(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>()
            r0.f10343 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.C0832te
            if (r0 == 0) goto L12
            te r2 = (p000.C0832te) r2
            java.lang.Throwable r2 = r2.f10343
            java.lang.Throwable r1 = r1.f10343
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.Throwable r0 = r0.f10343
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // p000.C0869ue
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Closed("
            r0.<init>(r1)
            java.lang.Throwable r2 = r2.f10343
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
