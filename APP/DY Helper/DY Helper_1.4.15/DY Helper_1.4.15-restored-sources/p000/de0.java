package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class de0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.Class f3102;

    /* JADX INFO: renamed from: β */
    public final java.lang.reflect.Field f3103;

    /* JADX INFO: renamed from: γ */
    public final java.util.ArrayList f3104;

    /* JADX INFO: renamed from: δ */
    public final java.util.ArrayList f3105;

    public de0(java.lang.Class r1, java.lang.reflect.Field r2, java.util.ArrayList r3, java.util.ArrayList r4) {
            r0 = this;
            r0.<init>()
            r0.f3102 = r1
            r0.f3103 = r2
            r0.f3104 = r3
            r0.f3105 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof p000.de0
            if (r0 != 0) goto L8
            goto L35
        L8:
            de0 r3 = (p000.de0) r3
            java.lang.Class r0 = r2.f3102
            java.lang.Class r1 = r3.f3102
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            java.lang.reflect.Field r0 = r2.f3103
            java.lang.reflect.Field r1 = r3.f3103
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            java.util.ArrayList r0 = r2.f3104
            java.util.ArrayList r1 = r3.f3104
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            java.util.ArrayList r2 = r2.f3105
            java.util.ArrayList r3 = r3.f3105
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L37
        L35:
            r2 = 0
            return r2
        L37:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.f3102
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.reflect.Field r1 = r2.f3103
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.ArrayList r0 = r2.f3104
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.ArrayList r2 = r2.f3105
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RefactorTopOnlineTarget(adapterClass="
            r0.<init>(r1)
            java.lang.Class r1 = r2.f3102
            r0.append(r1)
            java.lang.String r1 = ", differField="
            r0.append(r1)
            java.lang.reflect.Field r1 = r2.f3103
            r0.append(r1)
            java.lang.String r1 = ", registrationMethods="
            r0.append(r1)
            java.util.ArrayList r1 = r2.f3104
            r0.append(r1)
            java.lang.String r1 = ", submitMethods="
            r0.append(r1)
            java.util.ArrayList r2 = r2.f3105
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
