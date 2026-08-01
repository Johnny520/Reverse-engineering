package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ab2 {

    /* JADX INFO: renamed from: α */
    public final java.lang.Object f176;

    /* JADX INFO: renamed from: β */
    public final java.lang.reflect.Field f177;

    /* JADX INFO: renamed from: γ */
    public final java.lang.reflect.Field f178;

    /* JADX INFO: renamed from: δ */
    public final java.lang.reflect.Field f179;

    /* JADX INFO: renamed from: ε */
    public final java.io.File f180;

    /* JADX INFO: renamed from: ζ */
    public final long f181;

    /* JADX INFO: renamed from: η */
    public final java.util.List f182;

    public ab2(java.lang.Object r1, java.lang.reflect.Field r2, java.lang.reflect.Field r3, java.lang.reflect.Field r4, java.io.File r5, long r6, java.util.List r8) {
            r0 = this;
            r0.<init>()
            r0.f176 = r1
            r0.f177 = r2
            r0.f178 = r3
            r0.f179 = r4
            r0.f180 = r5
            r0.f181 = r6
            r0.f182 = r8
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L56
        L3:
            boolean r0 = r5 instanceof p000.ab2
            if (r0 != 0) goto L8
            goto L54
        L8:
            ab2 r5 = (p000.ab2) r5
            java.lang.Object r0 = r4.f176
            java.lang.Object r1 = r5.f176
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L54
        L15:
            java.lang.reflect.Field r0 = r4.f177
            java.lang.reflect.Field r1 = r5.f177
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L54
        L20:
            java.lang.reflect.Field r0 = r4.f178
            java.lang.reflect.Field r1 = r5.f178
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L54
        L2b:
            java.lang.reflect.Field r0 = r4.f179
            java.lang.reflect.Field r1 = r5.f179
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L36
            goto L54
        L36:
            java.io.File r0 = r4.f180
            java.io.File r1 = r5.f180
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            goto L54
        L41:
            long r0 = r4.f181
            long r2 = r5.f181
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L4a
            goto L54
        L4a:
            java.util.List r4 = r4.f182
            java.util.List r5 = r5.f182
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L56
        L54:
            r4 = 0
            return r4
        L56:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.lang.Object r0 = r4.f176
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.reflect.Field r2 = r4.f177
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            r0 = 0
            java.lang.reflect.Field r3 = r4.f178
            if (r3 != 0) goto L18
            r3 = r0
            goto L1c
        L18:
            int r3 = r3.hashCode()
        L1c:
            int r2 = r2 + r3
            int r2 = r2 * r1
            java.lang.reflect.Field r3 = r4.f179
            if (r3 != 0) goto L23
            goto L27
        L23:
            int r0 = r3.hashCode()
        L27:
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.io.File r0 = r4.f180
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            long r2 = r4.f181
            int r0 = p000.lz1.m3677(r0, r1, r2)
            java.util.List r4 = r4.f182
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VoiceInfoAccess(target="
            r0.<init>(r1)
            java.lang.Object r1 = r5.f176
            r0.append(r1)
            java.lang.String r1 = ", fileField="
            r0.append(r1)
            java.lang.reflect.Field r1 = r5.f177
            r0.append(r1)
            java.lang.String r1 = ", durationField="
            r0.append(r1)
            java.lang.String r1 = ", waveField="
            java.lang.String r2 = ", file="
            java.lang.reflect.Field r3 = r5.f178
            java.lang.reflect.Field r4 = r5.f179
            p000.lz1.m3672(r0, r3, r1, r4, r2)
            java.io.File r1 = r5.f180
            r0.append(r1)
            java.lang.String r1 = ", durationMs="
            r0.append(r1)
            long r1 = r5.f181
            r0.append(r1)
            java.lang.String r1 = ", wave="
            r0.append(r1)
            java.util.List r5 = r5.f182
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final void m55(p000.cb2 r5, p000.kf0 r6) {
            r4 = this;
            java.lang.Object r0 = r4.f176
            r5.getClass()
            java.lang.reflect.Field r1 = r4.f177     // Catch: java.lang.Throwable -> L2b
            java.io.File r2 = r5.f2057     // Catch: java.lang.Throwable -> L2b
            r1.set(r0, r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.reflect.Field r1 = r4.f178     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L1d
            long r2 = r5.f2058     // Catch: java.lang.Throwable -> L2b
            long r2 = r6.m3240(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.Long r6 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L2b
            r1.set(r0, r6)     // Catch: java.lang.Throwable -> L2b
        L1d:
            java.lang.reflect.Field r4 = r4.f179     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L29
            java.util.List r5 = r5.f2059     // Catch: java.lang.Throwable -> L2b
            r4.set(r0, r5)     // Catch: java.lang.Throwable -> L2b
            s62 r4 = p000.s62.f9751     // Catch: java.lang.Throwable -> L2b
            goto L32
        L29:
            r4 = 0
            goto L32
        L2b:
            r4 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L32:
            java.lang.Throwable r4 = p000.fo1.m2190(r4)
            if (r4 == 0) goto L3f
            java.lang.String r5 = "rb360b99c73f2f647"
            java.lang.String r6 = "apply voice replacement failed"
            p000.C0888ux.m5977(r5, r6, r4)
        L3f:
            return
    }
}
