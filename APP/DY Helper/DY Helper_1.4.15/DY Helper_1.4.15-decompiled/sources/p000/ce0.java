package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ce0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.Class f2078;

    /* JADX INFO: renamed from: β */
    public final java.lang.reflect.Method f2079;

    /* JADX INFO: renamed from: γ */
    public final int f2080;

    /* JADX INFO: renamed from: δ */
    public final int f2081;

    /* JADX INFO: renamed from: ε */
    public final java.lang.reflect.Method f2082;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.reflect.Method f2083;

    /* JADX INFO: renamed from: η */
    public final java.lang.reflect.Field f2084;

    /* JADX INFO: renamed from: θ */
    public final java.lang.reflect.Field f2085;

    /* JADX INFO: renamed from: ι */
    public final java.lang.reflect.Field f2086;

    /* JADX INFO: renamed from: κ */
    public final java.lang.reflect.Constructor f2087;

    public ce0(java.lang.Class r1, java.lang.reflect.Method r2, int r3, int r4, java.lang.reflect.Method r5, java.lang.reflect.Method r6, java.lang.reflect.Field r7, java.lang.reflect.Field r8, java.lang.reflect.Field r9, java.lang.reflect.Constructor r10) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f2078 = r1
            r0.f2079 = r2
            r0.f2080 = r3
            r0.f2081 = r4
            r0.f2082 = r5
            r0.f2083 = r6
            r0.f2084 = r7
            r0.f2085 = r8
            r0.f2086 = r9
            r0.f2087 = r10
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L73
        L4:
            boolean r0 = r3 instanceof p000.ce0
            if (r0 != 0) goto La
            goto L71
        La:
            ce0 r3 = (p000.ce0) r3
            java.lang.Class r0 = r2.f2078
            java.lang.Class r1 = r3.f2078
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L17
            goto L71
        L17:
            java.lang.reflect.Method r0 = r2.f2079
            java.lang.reflect.Method r1 = r3.f2079
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L22
            goto L71
        L22:
            int r0 = r2.f2080
            int r1 = r3.f2080
            if (r0 == r1) goto L29
            goto L71
        L29:
            int r0 = r2.f2081
            int r1 = r3.f2081
            if (r0 == r1) goto L30
            goto L71
        L30:
            java.lang.reflect.Method r0 = r2.f2082
            java.lang.reflect.Method r1 = r3.f2082
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3b
            goto L71
        L3b:
            java.lang.reflect.Method r0 = r2.f2083
            java.lang.reflect.Method r1 = r3.f2083
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto L71
        L46:
            java.lang.reflect.Field r0 = r2.f2084
            java.lang.reflect.Field r1 = r3.f2084
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L51
            goto L71
        L51:
            java.lang.reflect.Field r0 = r2.f2085
            java.lang.reflect.Field r1 = r3.f2085
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5c
            goto L71
        L5c:
            java.lang.reflect.Field r0 = r2.f2086
            java.lang.reflect.Field r1 = r3.f2086
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L67
            goto L71
        L67:
            java.lang.reflect.Constructor r2 = r2.f2087
            java.lang.reflect.Constructor r3 = r3.f2087
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L73
        L71:
            r2 = 0
            return r2
        L73:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Class r0 = r3.f2078
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.reflect.Method r2 = r3.f2079
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = r3.f2080
            int r0 = p000.a12.m14(r0, r2, r1)
            int r2 = r3.f2081
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.reflect.Method r2 = r3.f2082
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.reflect.Method r0 = r3.f2083
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.reflect.Field r2 = r3.f2084
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.reflect.Field r0 = r3.f2085
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.reflect.Field r2 = r3.f2086
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.reflect.Constructor r3 = r3.f2087
            int r3 = r3.hashCode()
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "QuickShareSubmitTarget(adapterClass="
            r0.<init>(r1)
            java.lang.Class r1 = r5.f2078
            r0.append(r1)
            java.lang.String r1 = ", submitMethod="
            r0.append(r1)
            java.lang.reflect.Method r1 = r5.f2079
            r0.append(r1)
            java.lang.String r1 = ", adapterParameterIndex="
            r0.append(r1)
            java.lang.String r1 = ", stateParameterIndex="
            java.lang.String r2 = ", dataGetter="
            int r3 = r5.f2080
            int r4 = r5.f2081
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.reflect.Method r1 = r5.f2082
            r0.append(r1)
            java.lang.String r1 = ", notifyDataSetChanged="
            r0.append(r1)
            java.lang.reflect.Method r1 = r5.f2083
            r0.append(r1)
            java.lang.String r1 = ", stateListField="
            r0.append(r1)
            java.lang.String r1 = ", stateFlagField="
            java.lang.String r2 = ", stateCacheField="
            java.lang.reflect.Field r3 = r5.f2084
            java.lang.reflect.Field r4 = r5.f2085
            p000.lz1.m3672(r0, r3, r1, r4, r2)
            java.lang.reflect.Field r1 = r5.f2086
            r0.append(r1)
            java.lang.String r1 = ", stateConstructor="
            r0.append(r1)
            java.lang.reflect.Constructor r5 = r5.f2087
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
