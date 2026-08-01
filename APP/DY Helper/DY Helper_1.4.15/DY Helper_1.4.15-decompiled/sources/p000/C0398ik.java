package p000;

/* JADX INFO: renamed from: ik */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0398ik {

    /* JADX INFO: renamed from: α */
    public final p000.EnumC0362hk f5098;

    /* JADX INFO: renamed from: β */
    public final java.lang.Class f5099;

    /* JADX INFO: renamed from: γ */
    public final java.lang.reflect.Method f5100;

    /* JADX INFO: renamed from: δ */
    public final java.lang.Object f5101;

    /* JADX INFO: renamed from: ε */
    public final p000.C0325gk f5102;

    /* JADX INFO: renamed from: ζ */
    public final p000.C0116ck f5103;

    public C0398ik(p000.EnumC0362hk r1, java.lang.Class r2, java.lang.reflect.Method r3, java.util.List r4, p000.C0325gk r5, p000.C0116ck r6) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f5098 = r1
            r0.f5099 = r2
            r0.f5100 = r3
            r0.f5101 = r4
            r0.f5102 = r5
            r0.f5103 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L49
        L3:
            boolean r0 = r3 instanceof p000.C0398ik
            if (r0 != 0) goto L8
            goto L47
        L8:
            ik r3 = (p000.C0398ik) r3
            hk r0 = r2.f5098
            hk r1 = r3.f5098
            if (r0 == r1) goto L11
            goto L47
        L11:
            java.lang.Class r0 = r2.f5099
            java.lang.Class r1 = r3.f5099
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L1c
            goto L47
        L1c:
            java.lang.reflect.Method r0 = r2.f5100
            java.lang.reflect.Method r1 = r3.f5100
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L47
        L27:
            java.lang.Object r0 = r2.f5101
            java.lang.Object r1 = r3.f5101
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            goto L47
        L32:
            gk r0 = r2.f5102
            gk r1 = r3.f5102
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3d
            goto L47
        L3d:
            ck r2 = r2.f5103
            ck r3 = r3.f5103
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L49
        L47:
            r2 = 0
            return r2
        L49:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            hk r0 = r2.f5098
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Class r1 = r2.f5099
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.reflect.Method r0 = r2.f5100
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Object r1 = r2.f5101
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            gk r0 = r2.f5102
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            ck r2 = r2.f5103
            if (r2 != 0) goto L32
            r2 = 0
            goto L36
        L32:
            int r2 = r2.hashCode()
        L36:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HolderTarget(kind="
            r0.<init>(r1)
            hk r1 = r2.f5098
            r0.append(r1)
            java.lang.String r1 = ", holderClass="
            r0.append(r1)
            java.lang.Class r1 = r2.f5099
            r0.append(r1)
            java.lang.String r1 = ", bindMethod="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f5100
            r0.append(r1)
            java.lang.String r1 = ", updateMethods="
            r0.append(r1)
            java.lang.Object r1 = r2.f5101
            r0.append(r1)
            java.lang.String r1 = ", fields="
            r0.append(r1)
            gk r1 = r2.f5102
            r0.append(r1)
            java.lang.String r1 = ", delegateTarget="
            r0.append(r1)
            ck r2 = r2.f5103
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
