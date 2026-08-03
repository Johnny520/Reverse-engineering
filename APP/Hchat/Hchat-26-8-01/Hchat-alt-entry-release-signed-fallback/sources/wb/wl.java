package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wl implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f19996i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f19997j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19998k;

    public /* synthetic */ wl(android.content.SharedPreferences r2, boolean r3, i0.a1 r4, i0.a1 r5) {
            r1 = this;
            r0 = 0
            r1.f19994g = r0
            r1.<init>()
            r1.f19996i = r2
            r1.f19997j = r3
            r1.f19995h = r4
            r1.f19998k = r5
            return
    }

    public /* synthetic */ wl(i0.a1 r2, android.content.SharedPreferences r3, boolean r4, i0.a1 r5) {
            r1 = this;
            r0 = 1
            r1.f19994g = r0
            r1.<init>()
            r1.f19995h = r2
            r1.f19996i = r3
            r1.f19997j = r4
            r1.f19998k = r5
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
            r4 = this;
            int r0 = r4.f19994g
            r.d r5 = (r.d) r5
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.getClass()
            r5 = r7 & 17
            switch(r0) {
                case 0: goto L44;
                default: goto L14;
            }
        L14:
            r0 = 16
            r1 = 1
            if (r5 == r0) goto L1b
            r5 = r1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            r7 = r7 & r1
            boolean r5 = r6.S(r7, r5)
            if (r5 == 0) goto L3e
            wb.g9 r5 = new wb.g9
            i0.a1 r7 = r4.f19995h
            android.content.SharedPreferences r0 = r4.f19996i
            boolean r2 = r4.f19997j
            i0.a1 r3 = r4.f19998k
            r5.<init>(r7, r0, r2, r3)
            r7 = 1339828328(0x4fdc2868, float:7.387271E9)
            s0.d r5 = s0.i.e(r7, r5, r6)
            r7 = 48
            r0 = 0
            wb.ho.C3(r0, r5, r6, r7, r1)
            goto L41
        L3e:
            r6.V()
        L41:
            sf.n r5 = sf.n.f12433a
            return r5
        L44:
            r0 = 16
            r1 = 1
            if (r5 == r0) goto L4b
            r5 = r1
            goto L4c
        L4b:
            r5 = 0
        L4c:
            r7 = r7 & r1
            boolean r5 = r6.S(r7, r5)
            if (r5 == 0) goto L6e
            wb.g9 r5 = new wb.g9
            android.content.SharedPreferences r7 = r4.f19996i
            boolean r0 = r4.f19997j
            i0.a1 r2 = r4.f19995h
            i0.a1 r3 = r4.f19998k
            r5.<init>(r7, r0, r2, r3)
            r7 = -386023719(0xffffffffe8fdbed9, float:-9.586234E24)
            s0.d r5 = s0.i.e(r7, r5, r6)
            r7 = 48
            r0 = 0
            wb.ho.C3(r0, r5, r6, r7, r1)
            goto L71
        L6e:
            r6.V()
        L71:
            sf.n r5 = sf.n.f12433a
            return r5
    }
}
