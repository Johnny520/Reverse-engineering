package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ji1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.reflect.Method f5478;

    /* JADX INFO: renamed from: β */
    public final java.lang.reflect.Field f5479;

    public ji1(java.lang.reflect.Field r1, java.lang.reflect.Method r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f5478 = r2
            r0.f5479 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof p000.ji1
            if (r0 != 0) goto L8
            goto L1f
        L8:
            ji1 r3 = (p000.ji1) r3
            java.lang.reflect.Method r0 = r2.f5478
            java.lang.reflect.Method r1 = r3.f5478
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            java.lang.reflect.Field r2 = r2.f5479
            java.lang.reflect.Field r3 = r3.f5479
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.f5478
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.reflect.Field r1 = r1.f5479
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TemplateTimeTarget(renderMethod="
            r0.<init>(r1)
            java.lang.reflect.Method r1 = r2.f5478
            r0.append(r1)
            java.lang.String r1 = ", textViewField="
            r0.append(r1)
            java.lang.reflect.Field r2 = r2.f5479
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
