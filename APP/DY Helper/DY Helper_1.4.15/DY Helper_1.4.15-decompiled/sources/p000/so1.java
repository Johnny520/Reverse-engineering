package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class so1 {

    /* JADX INFO: renamed from: α */
    public final int f9982;

    public /* synthetic */ so1(int r1) {
            r0 = this;
            r0.<init>()
            r0.f9982 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.so1
            if (r0 != 0) goto L5
            goto Ld
        L5:
            so1 r2 = (p000.so1) r2
            int r2 = r2.f9982
            int r1 = r1.f9982
            if (r1 == r2) goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.f9982
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            r0 = 1
            int r1 = r1.f9982
            if (r1 != r0) goto L8
            java.lang.String r1 = "Checkbox"
            return r1
        L8:
            r0 = 2
            if (r1 != r0) goto Le
            java.lang.String r1 = "Switch"
            return r1
        Le:
            r0 = 3
            if (r1 != r0) goto L14
            java.lang.String r1 = "RadioButton"
            return r1
        L14:
            r0 = 4
            if (r1 != r0) goto L1a
            java.lang.String r1 = "Tab"
            return r1
        L1a:
            r0 = 5
            if (r1 != r0) goto L20
            java.lang.String r1 = "Image"
            return r1
        L20:
            r0 = 6
            if (r1 != r0) goto L26
            java.lang.String r1 = "DropdownList"
            return r1
        L26:
            r0 = 7
            if (r1 != r0) goto L2c
            java.lang.String r1 = "Picker"
            return r1
        L2c:
            r0 = 8
            if (r1 != r0) goto L33
            java.lang.String r1 = "Carousel"
            return r1
        L33:
            java.lang.String r1 = "Unknown"
            return r1
    }
}
