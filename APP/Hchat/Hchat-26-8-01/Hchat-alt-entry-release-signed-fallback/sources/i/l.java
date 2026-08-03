package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements i0.l2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i.m1 f5718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0.j1 f5719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i.q f5720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f5721j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f5722k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5723l;

    public /* synthetic */ l(i.m1 r10, java.lang.Object r11, i.q r12, int r13) {
            r9 = this;
            r13 = r13 & 4
            if (r13 == 0) goto L5
            r12 = 0
        L5:
            r3 = r12
            r6 = -9223372036854775808
            r8 = 0
            r4 = -9223372036854775808
            r0 = r9
            r1 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r6, r8)
            return
    }

    public l(i.m1 r2, java.lang.Object r3, i.q r4, long r5, long r7, boolean r9) {
            r1 = this;
            r1.<init>()
            r1.f5718g = r2
            i0.j1 r0 = i0.r.u(r3)
            r1.f5719h = r0
            if (r4 == 0) goto L12
            i.q r2 = i.d.i(r4)
            goto L1d
        L12:
            fg.l r2 = r2.f5730a
            java.lang.Object r2 = r2.invoke(r3)
            i.q r2 = (i.q) r2
            r2.d()
        L1d:
            r1.f5720i = r2
            r1.f5721j = r5
            r1.f5722k = r7
            r1.f5723l = r9
            return
    }

    @Override // i0.l2
    public final java.lang.Object getValue() {
            r1 = this;
            i0.j1 r0 = r1.f5719h
            java.lang.Object r0 = r0.getValue()
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AnimationState(value="
            r0.<init>(r1)
            i0.j1 r1 = r3.f5719h
            java.lang.Object r1 = r1.getValue()
            r0.append(r1)
            java.lang.String r1 = ", velocity="
            r0.append(r1)
            i.m1 r1 = r3.f5718g
            fg.l r1 = r1.f5731b
            i.q r2 = r3.f5720i
            java.lang.Object r1 = r1.invoke(r2)
            r0.append(r1)
            java.lang.String r1 = ", isRunning="
            r0.append(r1)
            boolean r1 = r3.f5723l
            r0.append(r1)
            java.lang.String r1 = ", lastFrameTimeNanos="
            r0.append(r1)
            long r1 = r3.f5721j
            r0.append(r1)
            java.lang.String r1 = ", finishedTimeNanos="
            r0.append(r1)
            long r1 = r3.f5722k
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
