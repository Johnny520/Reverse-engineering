package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class sd0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.reflect.Field f9843;

    /* JADX INFO: renamed from: β */
    public final java.lang.reflect.Field f9844;

    /* JADX INFO: renamed from: γ */
    public final java.lang.reflect.Field f9845;

    /* JADX INFO: renamed from: δ */
    public final java.lang.reflect.Field f9846;

    /* JADX INFO: renamed from: ε */
    public final java.lang.reflect.Field f9847;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.reflect.Field f9848;

    /* JADX INFO: renamed from: η */
    public final java.lang.reflect.Field f9849;

    public sd0(java.lang.reflect.Field r1, java.lang.reflect.Field r2, java.lang.reflect.Field r3, java.lang.reflect.Field r4, java.lang.reflect.Field r5, java.lang.reflect.Field r6, java.lang.reflect.Field r7) {
            r0 = this;
            r0.<init>()
            r0.f9843 = r1
            r0.f9844 = r2
            r0.f9845 = r3
            r0.f9846 = r4
            r0.f9847 = r5
            r0.f9848 = r6
            r0.f9849 = r7
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.sd0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            sd0 r5 = (p000.sd0) r5
            java.lang.reflect.Field r1 = r4.f9843
            java.lang.reflect.Field r3 = r5.f9843
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.reflect.Field r1 = r4.f9844
            java.lang.reflect.Field r3 = r5.f9844
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.reflect.Field r1 = r4.f9845
            java.lang.reflect.Field r3 = r5.f9845
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.reflect.Field r1 = r4.f9846
            java.lang.reflect.Field r3 = r5.f9846
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.reflect.Field r1 = r4.f9847
            java.lang.reflect.Field r3 = r5.f9847
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.reflect.Field r1 = r4.f9848
            java.lang.reflect.Field r3 = r5.f9848
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.reflect.Field r4 = r4.f9849
            java.lang.reflect.Field r5 = r5.f9849
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L59
            return r2
        L59:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.reflect.Field r1 = r3.f9843
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.reflect.Field r2 = r3.f9844
            if (r2 != 0) goto L13
            r2 = r0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.reflect.Field r2 = r3.f9845
            if (r2 != 0) goto L20
            r2 = r0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.reflect.Field r2 = r3.f9846
            if (r2 != 0) goto L2d
            r2 = r0
            goto L31
        L2d:
            int r2 = r2.hashCode()
        L31:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.reflect.Field r2 = r3.f9847
            if (r2 != 0) goto L3a
            r2 = r0
            goto L3e
        L3a:
            int r2 = r2.hashCode()
        L3e:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.reflect.Field r2 = r3.f9848
            if (r2 != 0) goto L47
            r2 = r0
            goto L4b
        L47:
            int r2 = r2.hashCode()
        L4b:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.reflect.Field r3 = r3.f9849
            if (r3 != 0) goto L53
            goto L57
        L53:
            int r0 = r3.hashCode()
        L57:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SerializedIdentityFields(uid="
            r0.<init>(r1)
            java.lang.reflect.Field r1 = r5.f9843
            r0.append(r1)
            java.lang.String r1 = ", secUid="
            r0.append(r1)
            java.lang.reflect.Field r1 = r5.f9844
            r0.append(r1)
            java.lang.String r1 = ", conversationId="
            r0.append(r1)
            java.lang.String r1 = ", uniqueId="
            java.lang.String r2 = ", shortId="
            java.lang.reflect.Field r3 = r5.f9845
            java.lang.reflect.Field r4 = r5.f9846
            p000.lz1.m3672(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", remarkName="
            java.lang.String r2 = ", nickname="
            java.lang.reflect.Field r3 = r5.f9847
            java.lang.reflect.Field r4 = r5.f9848
            p000.lz1.m3672(r0, r3, r1, r4, r2)
            java.lang.reflect.Field r5 = r5.f9849
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
