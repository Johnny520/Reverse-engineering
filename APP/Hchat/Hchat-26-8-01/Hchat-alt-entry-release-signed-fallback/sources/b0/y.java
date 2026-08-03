package b0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements y2.b0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.x f417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u2.l f418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u2.m f419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u2.l f420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u2.j f421k;

    public y(androidx.lifecycle.x r1) {
            r0 = this;
            r0.<init>()
            r0.f417g = r1
            return
    }

    @Override // y2.b0
    public final long e(u2.k r8, long r9, u2.m r11, long r12) {
            r7 = this;
            u2.j r0 = r7.f421k
            if (r0 == 0) goto L27
            u2.l r1 = r7.f418h
            r2 = 0
            if (r1 != 0) goto Lb
            r1 = r2
            goto L11
        Lb:
            long r3 = r1.f13353a
            boolean r1 = u2.l.a(r3, r9)
        L11:
            if (r1 == 0) goto L27
            u2.m r1 = r7.f419i
            if (r1 != r11) goto L27
            u2.l r1 = r7.f420j
            if (r1 != 0) goto L1c
            goto L22
        L1c:
            long r1 = r1.f13353a
            boolean r2 = u2.l.a(r1, r12)
        L22:
            if (r2 == 0) goto L27
            long r8 = r0.f13347a
            return r8
        L27:
            androidx.lifecycle.x r0 = r7.f417g
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            long r8 = r0.e(r1, r2, r4, r5)
            u2.l r10 = new u2.l
            r10.<init>(r2)
            r7.f418h = r10
            r7.f419i = r4
            u2.l r10 = new u2.l
            r10.<init>(r5)
            r7.f420j = r10
            u2.j r10 = new u2.j
            r10.<init>(r8)
            r7.f421k = r10
            return r8
    }
}
