package p000;

/* JADX INFO: renamed from: eb */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0242eb {

    /* JADX INFO: renamed from: α */
    public final p000.EnumC0206db f3465;

    /* JADX INFO: renamed from: β */
    public final java.lang.reflect.Method f3466;

    public C0242eb(p000.EnumC0206db r1, java.lang.reflect.Method r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f3465 = r1
            r0.f3466 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof p000.C0242eb
            if (r0 != 0) goto L8
            goto L1b
        L8:
            eb r3 = (p000.C0242eb) r3
            db r0 = r2.f3465
            db r1 = r3.f3465
            if (r0 == r1) goto L11
            goto L1b
        L11:
            java.lang.reflect.Method r2 = r2.f3466
            java.lang.reflect.Method r3 = r3.f3466
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L1d
        L1b:
            r2 = 0
            return r2
        L1d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            db r0 = r1.f3465
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.reflect.Method r1 = r1.f3466
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ResolvedMethod(kind="
            r0.<init>(r1)
            db r1 = r2.f3465
            r0.append(r1)
            java.lang.String r1 = ", method="
            r0.append(r1)
            java.lang.reflect.Method r2 = r2.f3466
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
