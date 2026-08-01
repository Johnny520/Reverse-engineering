package p000;

/* JADX INFO: renamed from: fl */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0289fl {

    /* JADX INFO: renamed from: α */
    public final android.view.View f4002;

    /* JADX INFO: renamed from: β */
    public final p000.EnumC0117cl f4003;

    /* JADX INFO: renamed from: γ */
    public final p000.C0326gl f4004;

    public C0289fl(android.view.View r1, p000.EnumC0117cl r2, p000.C0326gl r3) {
            r0 = this;
            r0.<init>()
            r0.f4002 = r1
            r0.f4003 = r2
            r0.f4004 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof p000.C0289fl
            if (r0 != 0) goto L8
            goto L26
        L8:
            fl r3 = (p000.C0289fl) r3
            android.view.View r0 = r2.f4002
            android.view.View r1 = r3.f4002
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            cl r0 = r2.f4003
            cl r1 = r3.f4003
            if (r0 == r1) goto L1c
            goto L26
        L1c:
            gl r2 = r2.f4004
            gl r3 = r3.f4004
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            android.view.View r0 = r2.f4002
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            cl r1 = r2.f4003
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            gl r2 = r2.f4004
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Binding(view="
            r0.<init>(r1)
            android.view.View r1 = r2.f4002
            r0.append(r1)
            java.lang.String r1 = ", role="
            r0.append(r1)
            cl r1 = r2.f4003
            r0.append(r1)
            java.lang.String r1 = ", channels="
            r0.append(r1)
            gl r2 = r2.f4004
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
