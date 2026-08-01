package p000;

/* JADX INFO: renamed from: bk */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0080bk {

    /* JADX INFO: renamed from: α */
    public final p000.EnumC1060zj f1748;

    /* JADX INFO: renamed from: β */
    public final java.lang.Class f1749;

    /* JADX INFO: renamed from: γ */
    public final java.lang.reflect.Method f1750;

    /* JADX INFO: renamed from: δ */
    public final java.lang.reflect.Field f1751;

    /* JADX INFO: renamed from: ε */
    public final java.util.ArrayList f1752;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.reflect.Field f1753;

    /* JADX INFO: renamed from: η */
    public final java.lang.reflect.Field f1754;

    public C0080bk(p000.EnumC1060zj r1, java.lang.Class r2, java.lang.reflect.Method r3, java.lang.reflect.Field r4, java.util.ArrayList r5, java.lang.reflect.Field r6, java.lang.reflect.Field r7) {
            r0 = this;
            r0.<init>()
            r0.f1748 = r1
            r0.f1749 = r2
            r0.f1750 = r3
            r0.f1751 = r4
            r0.f1752 = r5
            r0.f1753 = r6
            r0.f1754 = r7
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L54
        L3:
            boolean r0 = r3 instanceof p000.C0080bk
            if (r0 != 0) goto L8
            goto L52
        L8:
            bk r3 = (p000.C0080bk) r3
            zj r0 = r2.f1748
            zj r1 = r3.f1748
            if (r0 == r1) goto L11
            goto L52
        L11:
            java.lang.Class r0 = r2.f1749
            java.lang.Class r1 = r3.f1749
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L52
        L1c:
            java.lang.reflect.Method r0 = r2.f1750
            java.lang.reflect.Method r1 = r3.f1750
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L52
        L27:
            java.lang.reflect.Field r0 = r2.f1751
            java.lang.reflect.Field r1 = r3.f1751
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            goto L52
        L32:
            java.util.ArrayList r0 = r2.f1752
            java.util.ArrayList r1 = r3.f1752
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3d
            goto L52
        L3d:
            java.lang.reflect.Field r0 = r2.f1753
            java.lang.reflect.Field r1 = r3.f1753
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L48
            goto L52
        L48:
            java.lang.reflect.Field r2 = r2.f1754
            java.lang.reflect.Field r3 = r3.f1754
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L54
        L52:
            r2 = 0
            return r2
        L54:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            zj r0 = r3.f1748
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Class r1 = r3.f1749
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.reflect.Method r0 = r3.f1750
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.reflect.Field r1 = r3.f1751
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.ArrayList r0 = r3.f1752
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            r1 = 0
            java.lang.reflect.Field r2 = r3.f1753
            if (r2 != 0) goto L33
            r2 = r1
            goto L37
        L33:
            int r2 = r2.hashCode()
        L37:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.reflect.Field r3 = r3.f1754
            if (r3 != 0) goto L3f
            goto L43
        L3f:
            int r1 = r3.hashCode()
        L43:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ComponentTarget(kind="
            r0.<init>(r1)
            zj r1 = r2.f1748
            r0.append(r1)
            java.lang.String r1 = ", componentClass="
            r0.append(r1)
            java.lang.Class r1 = r2.f1749
            r0.append(r1)
            java.lang.String r1 = ", renderMethod="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f1750
            r0.append(r1)
            java.lang.String r1 = ", viewField="
            r0.append(r1)
            java.lang.reflect.Field r1 = r2.f1751
            r0.append(r1)
            java.lang.String r1 = ", associatedViewFields="
            r0.append(r1)
            java.util.ArrayList r1 = r2.f1752
            r0.append(r1)
            java.lang.String r1 = ", iconField="
            r0.append(r1)
            java.lang.reflect.Field r1 = r2.f1753
            r0.append(r1)
            java.lang.String r1 = ", countField="
            r0.append(r1)
            java.lang.reflect.Field r2 = r2.f1754
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
