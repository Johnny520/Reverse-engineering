package p000;

/* JADX INFO: renamed from: mm */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0554mm {

    /* JADX INFO: renamed from: α */
    public final java.lang.Object f7204;

    /* JADX INFO: renamed from: β */
    public final p000.C0868ud f7205;

    /* JADX INFO: renamed from: γ */
    public final p000.f80 f7206;

    /* JADX INFO: renamed from: δ */
    public final java.lang.Object f7207;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Throwable f7208;

    public C0554mm(java.lang.Object r1, p000.C0868ud r2, p000.f80 r3, java.lang.Object r4, java.lang.Throwable r5) {
            r0 = this;
            r0.<init>()
            r0.f7204 = r1
            r0.f7205 = r2
            r0.f7206 = r3
            r0.f7207 = r4
            r0.f7208 = r5
            return
    }

    public /* synthetic */ C0554mm(java.lang.Object r3, p000.C0868ud r4, p000.f80 r5, java.lang.Throwable r6, int r7) {
            r2 = this;
            r0 = r7 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r0 = r7 & 4
            if (r0 == 0) goto Lb
            r5 = r1
        Lb:
            r7 = r7 & 16
            if (r7 == 0) goto L11
            r7 = r1
            goto L12
        L11:
            r7 = r6
        L12:
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.C0554mm m3871(p000.C0554mm r6, p000.C0868ud r7, java.lang.Throwable r8, int r9) {
            java.lang.Object r1 = r6.f7204
            r0 = r9 & 2
            if (r0 == 0) goto L8
            ud r7 = r6.f7205
        L8:
            r2 = r7
            f80 r3 = r6.f7206
            java.lang.Object r4 = r6.f7207
            r7 = r9 & 16
            if (r7 == 0) goto L13
            java.lang.Throwable r8 = r6.f7208
        L13:
            r5 = r8
            mm r0 = new mm
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C0554mm
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            mm r5 = (p000.C0554mm) r5
            java.lang.Object r1 = r4.f7204
            java.lang.Object r3 = r5.f7204
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            ud r1 = r4.f7205
            ud r3 = r5.f7205
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            f80 r1 = r4.f7206
            f80 r3 = r5.f7206
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.Object r1 = r4.f7207
            java.lang.Object r3 = r5.f7207
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.Throwable r4 = r4.f7208
            java.lang.Throwable r5 = r5.f7208
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L43
            return r2
        L43:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.Object r1 = r3.f7204
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            ud r2 = r3.f7205
            if (r2 != 0) goto L13
            r2 = r0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            f80 r2 = r3.f7206
            if (r2 != 0) goto L20
            r2 = r0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Object r2 = r3.f7207
            if (r2 != 0) goto L2d
            r2 = r0
            goto L31
        L2d:
            int r2 = r2.hashCode()
        L31:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Throwable r3 = r3.f7208
            if (r3 != 0) goto L39
            goto L3d
        L39:
            int r0 = r3.hashCode()
        L3d:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CompletedContinuation(result="
            r0.<init>(r1)
            java.lang.Object r1 = r2.f7204
            r0.append(r1)
            java.lang.String r1 = ", cancelHandler="
            r0.append(r1)
            ud r1 = r2.f7205
            r0.append(r1)
            java.lang.String r1 = ", onCancellation="
            r0.append(r1)
            f80 r1 = r2.f7206
            r0.append(r1)
            java.lang.String r1 = ", idempotentResume="
            r0.append(r1)
            java.lang.Object r1 = r2.f7207
            r0.append(r1)
            java.lang.String r1 = ", cancelCause="
            r0.append(r1)
            java.lang.Throwable r2 = r2.f7208
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
