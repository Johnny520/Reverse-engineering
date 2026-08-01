package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class jt0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.reflect.Method f5574;

    /* JADX INFO: renamed from: β */
    public final java.lang.reflect.Method f5575;

    /* JADX INFO: renamed from: γ */
    public final java.lang.reflect.Method f5576;

    /* JADX INFO: renamed from: δ */
    public final java.lang.reflect.Method f5577;

    /* JADX INFO: renamed from: ε */
    public final java.lang.reflect.Method f5578;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.reflect.Method f5579;

    public jt0(java.lang.reflect.Method r1, java.lang.reflect.Method r2, java.lang.reflect.Method r3, java.lang.reflect.Method r4, java.lang.reflect.Method r5, java.lang.reflect.Method r6) {
            r0 = this;
            r0.<init>()
            r0.f5574 = r1
            r0.f5575 = r2
            r0.f5576 = r3
            r0.f5577 = r4
            r0.f5578 = r5
            r0.f5579 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L4d
        L3:
            boolean r0 = r3 instanceof p000.jt0
            if (r0 != 0) goto L8
            goto L4b
        L8:
            jt0 r3 = (p000.jt0) r3
            java.lang.reflect.Method r0 = r2.f5574
            java.lang.reflect.Method r1 = r3.f5574
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L4b
        L15:
            java.lang.reflect.Method r0 = r2.f5575
            java.lang.reflect.Method r1 = r3.f5575
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L4b
        L20:
            java.lang.reflect.Method r0 = r2.f5576
            java.lang.reflect.Method r1 = r3.f5576
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L4b
        L2b:
            java.lang.reflect.Method r0 = r2.f5577
            java.lang.reflect.Method r1 = r3.f5577
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L36
            goto L4b
        L36:
            java.lang.reflect.Method r0 = r2.f5578
            java.lang.reflect.Method r1 = r3.f5578
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L41
            goto L4b
        L41:
            java.lang.reflect.Method r2 = r2.f5579
            java.lang.reflect.Method r3 = r3.f5579
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L4d
        L4b:
            r2 = 0
            return r2
        L4d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.reflect.Method r0 = r3.f5574
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = 0
            java.lang.reflect.Method r2 = r3.f5575
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.reflect.Method r2 = r3.f5576
            if (r2 != 0) goto L1c
            r2 = r1
            goto L20
        L1c:
            int r2 = r2.hashCode()
        L20:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.reflect.Method r2 = r3.f5577
            if (r2 != 0) goto L29
            r2 = r1
            goto L2d
        L29:
            int r2 = r2.hashCode()
        L2d:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.reflect.Method r2 = r3.f5578
            if (r2 != 0) goto L36
            r2 = r1
            goto L3a
        L36:
            int r2 = r2.hashCode()
        L3a:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.reflect.Method r3 = r3.f5579
            if (r3 != 0) goto L42
            goto L46
        L42:
            int r1 = r3.hashCode()
        L46:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TabAccessors(tabType="
            r0.<init>(r1)
            java.lang.reflect.Method r1 = r2.f5574
            r0.append(r1)
            java.lang.String r1 = ", currentTabId="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f5575
            r0.append(r1)
            java.lang.String r1 = ", title="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f5576
            r0.append(r1)
            java.lang.String r1 = ", selected="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f5577
            r0.append(r1)
            java.lang.String r1 = ", countDot="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f5578
            r0.append(r1)
            java.lang.String r1 = ", dot="
            r0.append(r1)
            java.lang.reflect.Method r2 = r2.f5579
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
