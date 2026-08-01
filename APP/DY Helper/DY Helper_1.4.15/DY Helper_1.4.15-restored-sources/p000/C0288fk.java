package p000;

/* JADX INFO: renamed from: fk */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0288fk {

    /* JADX INFO: renamed from: α */
    public final java.lang.Class f3972;

    /* JADX INFO: renamed from: β */
    public final java.util.ArrayList f3973;

    /* JADX INFO: renamed from: γ */
    public final java.lang.reflect.Field f3974;

    public C0288fk(java.lang.Class r1, java.util.ArrayList r2, java.lang.reflect.Field r3) {
            r0 = this;
            r0.<init>()
            r0.f3972 = r1
            r0.f3973 = r2
            r0.f3974 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof p000.C0288fk
            if (r0 != 0) goto L8
            goto L2a
        L8:
            fk r3 = (p000.C0288fk) r3
            java.lang.Class r0 = r2.f3972
            java.lang.Class r1 = r3.f3972
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.util.ArrayList r0 = r2.f3973
            java.util.ArrayList r1 = r3.f3973
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.lang.reflect.Field r2 = r2.f3974
            java.lang.reflect.Field r3 = r3.f3974
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
            r2 = this;
            java.lang.Class r0 = r2.f3972
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.ArrayList r1 = r2.f3973
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.reflect.Field r2 = r2.f3974
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ExpandControlTarget(holderClass="
            r0.<init>(r1)
            java.lang.Class r1 = r2.f3972
            r0.append(r1)
            java.lang.String r1 = ", renderMethods="
            r0.append(r1)
            java.util.ArrayList r1 = r2.f3973
            r0.append(r1)
            java.lang.String r1 = ", titleField="
            r0.append(r1)
            java.lang.reflect.Field r2 = r2.f3974
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
