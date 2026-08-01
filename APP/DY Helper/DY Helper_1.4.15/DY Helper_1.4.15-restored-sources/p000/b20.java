package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class b20 {

    /* JADX INFO: renamed from: α */
    public final long f1422;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f1423;

    /* JADX INFO: renamed from: γ */
    public final long f1424;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f1425;

    /* JADX INFO: renamed from: ε */
    public final android.view.View f1426;

    public b20(long r1, java.lang.String r3, long r4, java.lang.String r6, android.view.View r7) {
            r0 = this;
            r0.<init>()
            r0.f1422 = r1
            r0.f1423 = r3
            r0.f1424 = r4
            r0.f1425 = r6
            r0.f1426 = r7
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L3e
        L3:
            boolean r0 = r5 instanceof p000.b20
            if (r0 != 0) goto L8
            goto L3c
        L8:
            b20 r5 = (p000.b20) r5
            long r0 = r4.f1422
            long r2 = r5.f1422
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L3c
        L13:
            java.lang.String r0 = r4.f1423
            java.lang.String r1 = r5.f1423
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            goto L3c
        L1e:
            long r0 = r4.f1424
            long r2 = r5.f1424
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L27
            goto L3c
        L27:
            java.lang.String r0 = r4.f1425
            java.lang.String r1 = r5.f1425
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L32
            goto L3c
        L32:
            android.view.View r4 = r4.f1426
            android.view.View r5 = r5.f1426
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L3e
        L3c:
            r4 = 0
            return r4
        L3e:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.f1422
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f1423
            int r0 = p000.a12.m15(r0, r1, r2)
            long r2 = r4.f1424
            int r0 = p000.lz1.m3677(r0, r1, r2)
            r2 = 0
            java.lang.String r3 = r4.f1425
            if (r3 != 0) goto L1c
            r3 = r2
            goto L20
        L1c:
            int r3 = r3.hashCode()
        L20:
            int r0 = r0 + r3
            int r0 = r0 * r1
            android.view.View r4 = r4.f1426
            if (r4 != 0) goto L27
            goto L2b
        L27:
            int r2 = r4.hashCode()
        L2b:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ActiveSelection(generation="
            r0.<init>(r1)
            long r1 = r5.f1422
            r0.append(r1)
            java.lang.String r1 = ", awemeId="
            r0.append(r1)
            java.lang.String r1 = r5.f1423
            r0.append(r1)
            java.lang.String r1 = ", createTime="
            java.lang.String r2 = ", publishLocation="
            long r3 = r5.f1424
            p000.AbstractC0602nx.m4118(r0, r1, r3, r2)
            java.lang.String r1 = r5.f1425
            r0.append(r1)
            java.lang.String r1 = ", itemView="
            r0.append(r1)
            android.view.View r5 = r5.f1426
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
