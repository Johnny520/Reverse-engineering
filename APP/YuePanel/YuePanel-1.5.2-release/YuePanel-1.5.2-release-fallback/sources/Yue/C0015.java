package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n1#1,219:1\n1#2:220\n51#3:221\n51#3:222\n51#3:223\n51#3:224\n51#3:225\n51#3:226\n51#3:227\n51#3:228\n51#3:229\n51#3:230\n51#3:231\n51#3:232\n51#3:233\n51#3:234\n51#3:235\n51#3:236\n51#3:237\n51#3:238\n51#3:239\n51#3:240\n51#3:241\n51#3:242\n51#3:243\n51#3:244\n51#3:245\n51#3:246\n51#3:247\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n*L\n35#1:221\n41#1:222\n51#1:223\n57#1:224\n67#1:225\n73#1:226\n79#1:227\n89#1:228\n96#1:229\n107#1:230\n117#1:231\n123#1:232\n129#1:233\n135#1:234\n141#1:235\n147#1:236\n153#1:237\n159#1:238\n165#1:239\n171#1:240\n172#1:241\n178#1:242\n179#1:243\n185#1:244\n186#1:245\n198#1:246\n199#1:247\n*E\n"})
@Yue.InterfaceC3421(name = "-RealBufferedSink")
public final class C0015 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final void m185(@Yue.InterfaceC4418 Yue.C5211 r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            boolean r0 = r4.f19558
            if (r0 == 0) goto La
            return
        La:
            Yue.ۥۣ۟ۢۨ r0 = r4.f19557     // Catch: java.lang.Throwable -> L22
            long r0 = r0.m4889()     // Catch: java.lang.Throwable -> L22
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L24
            Yue.ۥۣۢ۟ۡ r0 = r4.f19556     // Catch: java.lang.Throwable -> L22
            Yue.ۥۣ۟ۢۨ r1 = r4.f19557     // Catch: java.lang.Throwable -> L22
            long r2 = r1.m4889()     // Catch: java.lang.Throwable -> L22
            r0.mo4176(r1, r2)     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r0 = move-exception
            goto L25
        L24:
            r0 = 0
        L25:
            Yue.ۥۣۢ۟ۡ r1 = r4.f19556     // Catch: java.lang.Throwable -> L2b
            r1.close()     // Catch: java.lang.Throwable -> L2b
            goto L2f
        L2b:
            r1 = move-exception
            if (r0 != 0) goto L2f
            r0 = r1
        L2f:
            r1 = 1
            r4.f19558 = r1
            if (r0 != 0) goto L35
            return
        L35:
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final Yue.InterfaceC0848 m186(@Yue.InterfaceC4418 Yue.C5211 r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            boolean r0 = r4.f19558
            r0 = r0 ^ 1
            if (r0 == 0) goto L1f
            Yue.ۥۣ۟ۢۨ r0 = r4.f19557
            long r0 = r0.m4889()
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1e
            Yue.ۥۣۢ۟ۡ r2 = r4.f19556
            Yue.ۥۣ۟ۢۨ r3 = r4.f19557
            r2.mo4176(r3, r0)
        L1e:
            return r4
        L1f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Yue.InterfaceC0848 m187(@Yue.InterfaceC4418 Yue.C5211 r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            boolean r0 = r4.f19558
            r0 = r0 ^ 1
            if (r0 == 0) goto L1f
            Yue.ۥۣ۟ۢۨ r0 = r4.f19557
            long r0 = r0.m4813()
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1e
            Yue.ۥۣۢ۟ۡ r2 = r4.f19556
            Yue.ۥۣ۟ۢۨ r3 = r4.f19557
            r2.mo4176(r3, r0)
        L1e:
            return r4
        L1f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m188(@Yue.InterfaceC4418 Yue.C5211 r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            boolean r0 = r4.f19558
            r0 = r0 ^ 1
            if (r0 == 0) goto L28
            Yue.ۥۣ۟ۢۨ r0 = r4.f19557
            long r0 = r0.m4889()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L22
            Yue.ۥۣۢ۟ۡ r0 = r4.f19556
            Yue.ۥۣ۟ۢۨ r1 = r4.f19557
            long r2 = r1.m4889()
            r0.mo4176(r1, r2)
        L22:
            Yue.ۥۣۢ۟ۡ r4 = r4.f19556
            r4.flush()
            return
        L28:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Yue.C6250 m189(@Yue.InterfaceC4418 Yue.C5211 r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥۣۢ۟ۡ r1 = r1.f19556
            Yue.ۥۢۡۤۧ r1 = r1.mo4174()
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.String m190(@Yue.InterfaceC4418 Yue.C5211 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "buffer("
            r0.append(r1)
            Yue.ۥۣۢ۟ۡ r2 = r2.f19556
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final Yue.InterfaceC0848 m191(@Yue.InterfaceC4418 Yue.C5211 r1, @Yue.InterfaceC4418 Yue.C0879 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "byteString"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = r1.f19558
            r0 = r0 ^ 1
            if (r0 == 0) goto L1a
            Yue.ۥۣ۟ۢۨ r0 = r1.f19557
            r0.m4893(r2)
            Yue.ۥۣۣ۟۟ r1 = r1.mo4837()
            return r1
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final Yue.InterfaceC0848 m192(@Yue.InterfaceC4418 Yue.C5211 r1, @Yue.InterfaceC4418 Yue.C0879 r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "byteString"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = r1.f19558
            r0 = r0 ^ 1
            if (r0 == 0) goto L1a
            Yue.ۥۣ۟ۢۨ r0 = r1.f19557
            r0.m4894(r2, r3, r4)
            Yue.ۥۣۣ۟۟ r1 = r1.mo4837()
            return r1
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final Yue.InterfaceC0848 m193(@Yue.InterfaceC4418 Yue.C5211 r4, @Yue.InterfaceC4418 Yue.InterfaceC5839 r5, long r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r5, r0)
        La:
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L27
            Yue.ۥۣ۟ۢۨ r0 = r4.f19557
            long r0 = r5.mo4179(r0, r6)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            long r6 = r6 - r0
            r4.mo4837()
            goto La
        L21:
            java.io.EOFException r4 = new java.io.EOFException
            r4.<init>()
            throw r4
        L27:
            return r4
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final Yue.InterfaceC0848 m194(@Yue.InterfaceC4418 Yue.C5211 r1, @Yue.InterfaceC4418 byte[] r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = r1.f19558
            r0 = r0 ^ 1
            if (r0 == 0) goto L1a
            Yue.ۥۣ۟ۢۨ r0 = r1.f19557
            r0.m4896(r2)
            Yue.ۥۣۣ۟۟ r1 = r1.mo4837()
            return r1
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final Yue.InterfaceC0848 m195(@Yue.InterfaceC4418 Yue.C5211 r1, @Yue.InterfaceC4418 byte[] r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = r1.f19558
            r0 = r0 ^ 1
            if (r0 == 0) goto L1a
            Yue.ۥۣ۟ۢۨ r0 = r1.f19557
            r0.m4897(r2, r3, r4)
            Yue.ۥۣۣ۟۟ r1 = r1.mo4837()
            return r1
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final void m196(@Yue.InterfaceC4418 Yue.C5211 r1, @Yue.InterfaceC4418 Yue.C0843 r2, long r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = r1.f19558
            r0 = r0 ^ 1
            if (r0 == 0) goto L19
            Yue.ۥۣ۟ۢۨ r0 = r1.f19557
            r0.mo4176(r2, r3)
            r1.mo4837()
            return
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final long m197(@Yue.InterfaceC4418 Yue.C5211 r6, @Yue.InterfaceC4418 Yue.InterfaceC5839 r7) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r7, r0)
            r0 = 0
        Lc:
            Yue.ۥۣ۟ۢۨ r2 = r6.f19557
            r3 = 8192(0x2000, double:4.0474E-320)
            long r2 = r7.mo4179(r2, r3)
            r4 = -1
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L1f
            long r0 = r0 + r2
            r6.mo4837()
            goto Lc
        L1f:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final Yue.InterfaceC0848 m198(@Yue.InterfaceC4418 Yue.C5211 r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1.f19558
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            Yue.ۥۣ۟ۢۨ r0 = r1.f19557
            r0.m4898(r2)
            Yue.ۥۣۣ۟۟ r1 = r1.mo4837()
            return r1
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final Yue.InterfaceC0848 m199(@Yue.InterfaceC4418 Yue.C5211 r1, long r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1.f19558
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            Yue.ۥۣ۟ۢۨ r0 = r1.f19557
            r0.m4899(r2)
            Yue.ۥۣۣ۟۟ r1 = r1.mo4837()
            return r1
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final Yue.InterfaceC0848 m200(@Yue.InterfaceC4418 Yue.C5211 r1, long r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1.f19558
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            Yue.ۥۣ۟ۢۨ r0 = r1.f19557
            r0.m4900(r2)
            Yue.ۥۣۣ۟۟ r1 = r1.mo4837()
            return r1
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final Yue.InterfaceC0848 m201(@Yue.InterfaceC4418 Yue.C5211 r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1.f19558
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            Yue.ۥۣ۟ۢۨ r0 = r1.f19557
            r0.m4901(r2)
            Yue.ۥۣۣ۟۟ r1 = r1.mo4837()
            return r1
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final Yue.InterfaceC0848 m202(@Yue.InterfaceC4418 Yue.C5211 r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1.f19558
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            Yue.ۥۣ۟ۢۨ r0 = r1.f19557
            r0.m4902(r2)
            Yue.ۥۣۣ۟۟ r1 = r1.mo4837()
            return r1
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final Yue.InterfaceC0848 m203(@Yue.InterfaceC4418 Yue.C5211 r1, long r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1.f19558
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            Yue.ۥۣ۟ۢۨ r0 = r1.f19557
            r0.m4903(r2)
            Yue.ۥۣۣ۟۟ r1 = r1.mo4837()
            return r1
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final Yue.InterfaceC0848 m204(@Yue.InterfaceC4418 Yue.C5211 r1, long r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1.f19558
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            Yue.ۥۣ۟ۢۨ r0 = r1.f19557
            r0.m4904(r2)
            Yue.ۥۣۣ۟۟ r1 = r1.mo4837()
            return r1
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final Yue.InterfaceC0848 m205(@Yue.InterfaceC4418 Yue.C5211 r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1.f19558
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            Yue.ۥۣ۟ۢۨ r0 = r1.f19557
            r0.m4905(r2)
            Yue.ۥۣۣ۟۟ r1 = r1.mo4837()
            return r1
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final Yue.InterfaceC0848 m206(@Yue.InterfaceC4418 Yue.C5211 r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1.f19558
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            Yue.ۥۣ۟ۢۨ r0 = r1.f19557
            r0.m4906(r2)
            Yue.ۥۣۣ۟۟ r1 = r1.mo4837()
            return r1
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final Yue.InterfaceC0848 m207(@Yue.InterfaceC4418 Yue.C5211 r1, @Yue.InterfaceC4418 java.lang.String r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "string"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = r1.f19558
            r0 = r0 ^ 1
            if (r0 == 0) goto L1a
            Yue.ۥۣ۟ۢۨ r0 = r1.f19557
            r0.m4911(r2)
            Yue.ۥۣۣ۟۟ r1 = r1.mo4837()
            return r1
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final Yue.InterfaceC0848 m208(@Yue.InterfaceC4418 Yue.C5211 r1, @Yue.InterfaceC4418 java.lang.String r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "string"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = r1.f19558
            r0 = r0 ^ 1
            if (r0 == 0) goto L1a
            Yue.ۥۣ۟ۢۨ r0 = r1.f19557
            r0.m4912(r2, r3, r4)
            Yue.ۥۣۣ۟۟ r1 = r1.mo4837()
            return r1
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final Yue.InterfaceC0848 m209(@Yue.InterfaceC4418 Yue.C5211 r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1.f19558
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            Yue.ۥۣ۟ۢۨ r0 = r1.f19557
            r0.m4913(r2)
            Yue.ۥۣۣ۟۟ r1 = r1.mo4837()
            return r1
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }
}
