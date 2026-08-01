package p000;

/* JADX INFO: renamed from: zx */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1074zx implements p000.i72 {

    /* JADX INFO: renamed from: α */
    public final p000.x91 f13344;

    public C1074zx(p000.x91 r1) {
            r0 = this;
            r0.<init>()
            r0.f13344 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof p000.C1074zx
            if (r0 != 0) goto L8
            goto L14
        L8:
            zx r2 = (p000.C1074zx) r2
            x91 r1 = r1.f13344
            x91 r2 = r2.f13344
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L16
        L14:
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            x91 r0 = r0.f13344
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DynamicValueHolder(state="
            r0.<init>(r1)
            x91 r2 = r2.f13344
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.i72
    /* JADX INFO: renamed from: α */
    public final java.lang.Object mo2647(androidx.compose.runtime.internal.C0042 r1) {
            r0 = this;
            x91 r0 = r0.f13344
            java.lang.Object r0 = r0.getValue()
            return r0
    }
}
