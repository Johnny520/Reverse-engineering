package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dk implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wb.a0 f15733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f15735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15738m;

    public /* synthetic */ dk(wb.a0 r2, i0.a1 r3, android.content.SharedPreferences r4, i0.a1 r5, i0.a1 r6, i0.a1 r7) {
            r1 = this;
            r0 = 1
            r1.f15732g = r0
            r1.<init>()
            r1.f15733h = r2
            r1.f15734i = r3
            r1.f15735j = r4
            r1.f15736k = r5
            r1.f15737l = r6
            r1.f15738m = r7
            return
    }

    public /* synthetic */ dk(wb.a0 r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, android.content.SharedPreferences r6, i0.a1 r7) {
            r1 = this;
            r0 = 0
            r1.f15732g = r0
            r1.<init>()
            r1.f15733h = r2
            r1.f15734i = r3
            r1.f15736k = r4
            r1.f15737l = r5
            r1.f15735j = r6
            r1.f15738m = r7
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r18 = this;
            r0 = r18
            int r1 = r0.f15732g
            switch(r1) {
                case 0: goto L50;
                default: goto L7;
            }
        L7:
            i0.a1 r4 = r0.f15734i
            java.lang.Object r1 = r4.getValue()
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
            wb.a0 r2 = r0.f15733h
            wb.x r2 = (wb.x) r2
            wb.mu r3 = r2.f20073a
            int r3 = r3.f17790a
            if (r3 < 0) goto L47
            if (r3 >= r1) goto L47
            java.lang.Object r1 = r4.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r1 = tf.m.R1(r1)
            wb.mu r2 = r2.f20073a
            int r2 = r2.f17790a
            r1.remove(r2)
            r4.setValue(r1)
            java.lang.Object r1 = r4.getValue()
            r7 = r1
            java.util.List r7 = (java.util.List) r7
            r8 = 0
            r9 = 80
            android.content.SharedPreferences r2 = r0.f15735j
            i0.a1 r3 = r0.f15736k
            i0.a1 r5 = r0.f15737l
            r6 = 0
            wb.ho.J(r2, r3, r4, r5, r6, r7, r8, r9)
        L47:
            r1 = 0
            i0.a1 r2 = r0.f15738m
            r2.setValue(r1)
        L4d:
            sf.n r1 = sf.n.f12433a
            return r1
        L50:
            wb.a0 r1 = r0.f15733h
            wb.z r1 = (wb.z) r1
            wb.nu r1 = r1.f20510a
            i0.a1 r3 = r0.f15734i
            java.lang.Object r2 = r3.getValue()
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.size()
            int r1 = r1.f17985a
            r10 = 0
            if (r1 < 0) goto Lf5
            if (r1 >= r2) goto Lf5
            java.lang.Object r2 = r3.getValue()
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r2.get(r1)
            ua.i r2 = (ua.i) r2
            java.lang.String r2 = r2.f13623a
            java.lang.Object r4 = r3.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r4 = tf.m.R1(r4)
            r4.remove(r1)
            r3.setValue(r4)
            i0.a1 r4 = r0.f15736k
            java.lang.Object r1 = r4.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = tf.n.e1(r1)
            r5.<init>(r6)
            java.util.Iterator r1 = r1.iterator()
        L9c:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto Lc1
            java.lang.Object r6 = r1.next()
            r11 = r6
            ua.h r11 = (ua.h) r11
            java.lang.String r6 = r11.f13622e
            boolean r6 = gg.l.a(r6, r2)
            if (r6 == 0) goto Lbd
            java.lang.String r16 = ""
            r17 = 15
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            ua.h r11 = ua.h.a(r11, r12, r13, r14, r15, r16, r17)
        Lbd:
            r5.add(r11)
            goto L9c
        Lc1:
            r4.setValue(r5)
            i0.a1 r5 = r0.f15737l
            java.lang.Object r1 = r5.getValue()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto Leb
            java.lang.Object r1 = r3.getValue()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = tf.m.v1(r1)
            ua.i r1 = (ua.i) r1
            if (r1 == 0) goto Le3
            java.lang.String r1 = r1.f13623a
            goto Le4
        Le3:
            r1 = r10
        Le4:
            if (r1 != 0) goto Le8
            java.lang.String r1 = ""
        Le8:
            r5.setValue(r1)
        Leb:
            r8 = 0
            r9 = 112(0x70, float:1.57E-43)
            android.content.SharedPreferences r2 = r0.f15735j
            r6 = 0
            r7 = 0
            wb.ho.J(r2, r3, r4, r5, r6, r7, r8, r9)
        Lf5:
            i0.a1 r1 = r0.f15738m
            r1.setValue(r10)
            goto L4d
    }
}
