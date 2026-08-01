package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class fi1 {

    /* JADX INFO: renamed from: α */
    public final int f3948;

    public /* synthetic */ fi1(int r1) {
            r0 = this;
            r0.<init>()
            r0.f3948 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.fi1
            if (r0 != 0) goto L5
            goto Ld
        L5:
            fi1 r2 = (p000.fi1) r2
            int r2 = r2.f3948
            int r1 = r1.f3948
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
            int r0 = r0.f3948
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PointerKeyboardModifiers(packedValue="
            r0.<init>(r1)
            int r2 = r2.f3948
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
