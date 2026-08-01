package p000;

/* JADX INFO: renamed from: ck */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0116ck {

    /* JADX INFO: renamed from: α */
    public final java.lang.Class f2172;

    /* JADX INFO: renamed from: β */
    public final java.lang.reflect.Field f2173;

    /* JADX INFO: renamed from: γ */
    public final java.lang.reflect.Field f2174;

    /* JADX INFO: renamed from: δ */
    public final java.lang.reflect.Field f2175;

    public C0116ck(java.lang.Class r1, java.lang.reflect.Field r2, java.lang.reflect.Field r3, java.lang.reflect.Field r4) {
            r0 = this;
            r0.<init>()
            r0.f2172 = r1
            r0.f2173 = r2
            r0.f2174 = r3
            r0.f2175 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof p000.C0116ck
            if (r0 != 0) goto L8
            goto L35
        L8:
            ck r3 = (p000.C0116ck) r3
            java.lang.Class r0 = r2.f2172
            java.lang.Class r1 = r3.f2172
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            java.lang.reflect.Field r0 = r2.f2173
            java.lang.reflect.Field r1 = r3.f2173
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            java.lang.reflect.Field r0 = r2.f2174
            java.lang.reflect.Field r1 = r3.f2174
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            java.lang.reflect.Field r2 = r2.f2175
            java.lang.reflect.Field r3 = r3.f2175
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L37
        L35:
            r2 = 0
            return r2
        L37:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Class r0 = r3.f2172
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = 0
            java.lang.reflect.Field r2 = r3.f2173
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.reflect.Field r2 = r3.f2174
            if (r2 != 0) goto L1c
            r2 = r1
            goto L20
        L1c:
            int r2 = r2.hashCode()
        L20:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.reflect.Field r3 = r3.f2175
            if (r3 != 0) goto L28
            goto L2c
        L28:
            int r1 = r3.hashCode()
        L2c:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DelegateTarget(delegateClass="
            r0.<init>(r1)
            java.lang.Class r1 = r2.f2172
            r0.append(r1)
            java.lang.String r1 = ", oldDigg="
            r0.append(r1)
            java.lang.reflect.Field r1 = r2.f2173
            r0.append(r1)
            java.lang.String r1 = ", newDigg="
            r0.append(r1)
            java.lang.reflect.Field r1 = r2.f2174
            r0.append(r1)
            java.lang.String r1 = ", bury="
            r0.append(r1)
            java.lang.reflect.Field r2 = r2.f2175
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
