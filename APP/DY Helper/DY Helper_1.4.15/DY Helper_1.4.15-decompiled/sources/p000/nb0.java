package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class nb0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.ClassLoader f7495;

    /* JADX INFO: renamed from: β */
    public final java.lang.Object f7496;

    /* JADX INFO: renamed from: γ */
    public final java.lang.reflect.Method f7497;

    /* JADX INFO: renamed from: δ */
    public final java.lang.reflect.Method f7498;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Class f7499;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Class f7500;

    /* JADX INFO: renamed from: η */
    public final java.lang.reflect.Constructor f7501;

    /* JADX INFO: renamed from: θ */
    public final java.lang.Object f7502;

    public nb0(java.lang.ClassLoader r1, java.lang.Object r2, java.lang.reflect.Method r3, java.lang.reflect.Method r4, java.lang.Class r5, java.lang.Class r6, java.lang.reflect.Constructor r7, java.lang.Object r8) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f7495 = r1
            r0.f7496 = r2
            r0.f7497 = r3
            r0.f7498 = r4
            r0.f7499 = r5
            r0.f7500 = r6
            r0.f7501 = r7
            r0.f7502 = r8
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L63
        L3:
            boolean r0 = r3 instanceof p000.nb0
            if (r0 != 0) goto L8
            goto L61
        L8:
            nb0 r3 = (p000.nb0) r3
            java.lang.ClassLoader r0 = r2.f7495
            java.lang.ClassLoader r1 = r3.f7495
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L61
        L15:
            java.lang.Object r0 = r2.f7496
            java.lang.Object r1 = r3.f7496
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L61
        L20:
            java.lang.reflect.Method r0 = r2.f7497
            java.lang.reflect.Method r1 = r3.f7497
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L61
        L2b:
            java.lang.reflect.Method r0 = r2.f7498
            java.lang.reflect.Method r1 = r3.f7498
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L61
        L36:
            java.lang.Class r0 = r2.f7499
            java.lang.Class r1 = r3.f7499
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            goto L61
        L41:
            java.lang.Class r0 = r2.f7500
            java.lang.Class r1 = r3.f7500
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4c
            goto L61
        L4c:
            java.lang.reflect.Constructor r0 = r2.f7501
            java.lang.reflect.Constructor r1 = r3.f7501
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L57
            goto L61
        L57:
            java.lang.Object r2 = r2.f7502
            java.lang.Object r3 = r3.f7502
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L63
        L61:
            r2 = 0
            return r2
        L63:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.ClassLoader r0 = r2.f7495
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Object r1 = r2.f7496
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.reflect.Method r0 = r2.f7497
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.reflect.Method r1 = r2.f7498
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Class r0 = r2.f7499
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Class r1 = r2.f7500
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.reflect.Constructor r0 = r2.f7501
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Object r2 = r2.f7502
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AuditHandle(classLoader="
            r0.<init>(r1)
            java.lang.ClassLoader r1 = r2.f7495
            r0.append(r1)
            java.lang.String r1 = ", service="
            r0.append(r1)
            java.lang.Object r1 = r2.f7496
            r0.append(r1)
            java.lang.String r1 = ", queryMethod="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f7497
            r0.append(r1)
            java.lang.String r1 = ", batchMethod="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f7498
            r0.append(r1)
            java.lang.String r1 = ", queryCallbackClass="
            r0.append(r1)
            java.lang.Class r1 = r2.f7499
            r0.append(r1)
            java.lang.String r1 = ", batchCallbackClass="
            r0.append(r1)
            java.lang.Class r1 = r2.f7500
            r0.append(r1)
            java.lang.String r1 = ", ackEntryConstructor="
            r0.append(r1)
            java.lang.reflect.Constructor r1 = r2.f7501
            r0.append(r1)
            java.lang.String r1 = ", agreeStatus="
            r0.append(r1)
            java.lang.Object r2 = r2.f7502
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
