package p000;

/* JADX INFO: renamed from: dx */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0227dx {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f3315;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f3316;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f3317;

    public C0227dx(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f3315 = r1
            r0.f3316 = r2
            r0.f3317 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof p000.C0227dx
            if (r0 != 0) goto L8
            goto L2a
        L8:
            dx r3 = (p000.C0227dx) r3
            java.lang.String r0 = r2.f3315
            java.lang.String r1 = r3.f3315
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.String r0 = r2.f3316
            java.lang.String r1 = r3.f3316
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.lang.String r2 = r2.f3317
            java.lang.String r3 = r3.f3317
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f3315
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3316
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r3 = r3.f3317
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", fieldName="
            java.lang.String r1 = ", fieldType="
            java.lang.String r2 = "DyDexFieldRef(className="
            java.lang.String r3 = r5.f3315
            java.lang.String r4 = r5.f3316
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = ")"
            java.lang.String r5 = r5.f3317
            java.lang.String r5 = p000.lz1.m3691(r0, r5, r1)
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final java.lang.reflect.Field m1818(java.lang.ClassLoader r5) {
            r4 = this;
            r5.getClass()
            java.util.concurrent.ConcurrentHashMap r0 = p000.AbstractC0093bx.f1879
            java.lang.String r0 = r4.f3315
            java.lang.Class r5 = p000.AbstractC0093bx.m1082(r5, r0)
            r0 = 0
            if (r5 != 0) goto Lf
            goto L50
        Lf:
            if (r5 == 0) goto L50
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L50
            java.lang.String r1 = r4.f3316     // Catch: java.lang.Throwable -> L20
            java.lang.reflect.Field r1 = r5.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L20
            goto L27
        L20:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L27:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L2c
            r1 = r0
        L2c:
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            if (r1 == 0) goto L4b
            java.lang.String r2 = r4.f3317
            boolean r3 = p000.q02.m4671(r2)
            if (r3 != 0) goto L46
            java.lang.Class r3 = r1.getType()
            java.lang.String r3 = r3.getName()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L4b
        L46:
            r4 = 1
            r1.setAccessible(r4)
            return r1
        L4b:
            java.lang.Class r5 = r5.getSuperclass()
            goto Lf
        L50:
            return r0
    }
}
