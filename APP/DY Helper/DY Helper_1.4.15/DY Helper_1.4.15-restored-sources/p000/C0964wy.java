package p000;

/* JADX INFO: renamed from: wy */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0964wy {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f11892;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f11893;

    /* JADX INFO: renamed from: γ */
    public final p000.EnumC0229dz f11894;

    public C0964wy(java.lang.String r1, java.lang.String r2, p000.EnumC0229dz r3) {
            r0 = this;
            r0.<init>()
            r0.f11892 = r1
            r0.f11893 = r2
            r0.f11894 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof p000.C0964wy
            if (r0 != 0) goto L8
            goto L26
        L8:
            wy r3 = (p000.C0964wy) r3
            java.lang.String r0 = r2.f11892
            java.lang.String r1 = r3.f11892
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            java.lang.String r0 = r2.f11893
            java.lang.String r1 = r3.f11893
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L26
        L20:
            dz r2 = r2.f11894
            dz r3 = r3.f11894
            if (r2 == r3) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f11892
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f11893
            int r0 = p000.a12.m15(r0, r1, r2)
            dz r3 = r3.f11894
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", ext="
            java.lang.String r1 = ", strategy="
            java.lang.String r2 = "EmojiSaveFormat(mime="
            java.lang.String r3 = r5.f11892
            java.lang.String r4 = r5.f11893
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            dz r5 = r5.f11894
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
