package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ck implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wb.a0 f15482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15483i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f15484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15485k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15487m;

    public /* synthetic */ ck(wb.a0 r2, i0.a1 r3, android.content.SharedPreferences r4, i0.a1 r5, i0.a1 r6, i0.a1 r7) {
            r1 = this;
            r0 = 1
            r1.f15481g = r0
            r1.<init>()
            r1.f15482h = r2
            r1.f15483i = r3
            r1.f15484j = r4
            r1.f15485k = r5
            r1.f15486l = r6
            r1.f15487m = r7
            return
    }

    public /* synthetic */ ck(wb.a0 r2, i0.a1 r3, i0.a1 r4, android.content.SharedPreferences r5, i0.a1 r6, i0.a1 r7) {
            r1 = this;
            r0 = 0
            r1.f15481g = r0
            r1.<init>()
            r1.f15482h = r2
            r1.f15483i = r3
            r1.f15485k = r4
            r1.f15484j = r5
            r1.f15486l = r6
            r1.f15487m = r7
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f15481g
            switch(r0) {
                case 0: goto L51;
                default: goto L5;
            }
        L5:
            ua.h r10 = (ua.h) r10
            r10.getClass()
            i0.a1 r2 = r9.f15483i
            java.lang.Object r0 = r2.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r0 = tf.m.R1(r0)
            int r1 = r0.size()
            wb.a0 r3 = r9.f15482h
            wb.x r3 = (wb.x) r3
            wb.mu r3 = r3.f20073a
            int r3 = r3.f17790a
            if (r3 < 0) goto L29
            if (r3 >= r1) goto L29
            r0.remove(r3)
        L29:
            java.util.List r10 = a.a.x0(r10)
            java.util.List r10 = wb.ho.u7(r0, r10)
            r2.setValue(r10)
            java.lang.Object r10 = r2.getValue()
            r5 = r10
            java.util.List r5 = (java.util.List) r5
            r6 = 0
            r7 = 80
            android.content.SharedPreferences r0 = r9.f15484j
            i0.a1 r1 = r9.f15485k
            i0.a1 r3 = r9.f15486l
            r4 = 0
            wb.ho.J(r0, r1, r2, r3, r4, r5, r6, r7)
            r10 = 0
            i0.a1 r0 = r9.f15487m
            r0.setValue(r10)
        L4e:
            sf.n r10 = sf.n.f12433a
            return r10
        L51:
            ua.i r10 = (ua.i) r10
            r10.getClass()
            wb.a0 r0 = r9.f15482h
            wb.z r0 = (wb.z) r0
            wb.nu r0 = r0.f20510a
            i0.a1 r2 = r9.f15483i
            java.lang.Object r1 = r2.getValue()
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
            int r0 = r0.f17985a
            if (r0 < 0) goto L7d
            if (r0 >= r1) goto L7d
            java.lang.Object r1 = r2.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r1 = tf.m.R1(r1)
            r1.set(r0, r10)
        L7b:
            r5 = r1
            goto L88
        L7d:
            java.lang.Object r0 = r2.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r1 = tf.m.G1(r0, r10)
            goto L7b
        L88:
            r2.setValue(r5)
            i0.a1 r4 = r9.f15485k
            java.lang.Object r0 = r4.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = og.m.t0(r0)
            if (r0 == 0) goto L9e
            java.lang.String r10 = r10.f13623a
            r4.setValue(r10)
        L9e:
            java.lang.Object r10 = r4.getValue()
            r7 = r10
            java.lang.String r7 = (java.lang.String) r7
            r8 = 32
            android.content.SharedPreferences r1 = r9.f15484j
            i0.a1 r3 = r9.f15486l
            r6 = 0
            wb.ho.J(r1, r2, r3, r4, r5, r6, r7, r8)
            r10 = 0
            i0.a1 r0 = r9.f15487m
            r0.setValue(r10)
            goto L4e
    }
}
