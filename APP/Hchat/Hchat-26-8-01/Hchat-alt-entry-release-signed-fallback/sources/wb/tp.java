package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class tp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wb.sp f19314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19315b;

    public tp(wb.sp r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f19314a = r1
            r0.f19315b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof wb.tp
            if (r0 != 0) goto L8
            goto L1b
        L8:
            wb.tp r3 = (wb.tp) r3
            wb.sp r0 = r2.f19314a
            wb.sp r1 = r3.f19314a
            if (r0 == r1) goto L11
            goto L1b
        L11:
            java.lang.String r0 = r2.f19315b
            java.lang.String r3 = r3.f19315b
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L1d
        L1b:
            r3 = 0
            return r3
        L1d:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            wb.sp r0 = r2.f19314a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.f19315b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PluginMarketUploadStatus(phase="
            r0.<init>(r1)
            wb.sp r1 = r2.f19314a
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r1 = r2.f19315b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
