package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2361 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.io.File f7728;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.List<java.io.File> f7729;

    public C2361(@Yue.InterfaceC4418 java.io.File r2, @Yue.InterfaceC4418 java.util.List<? extends java.io.File> r3) {
            r1 = this;
            java.lang.String r0 = "root"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "segments"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f7728 = r2
            r1.f7729 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ Yue.C2361 m10868(Yue.C2361 r0, java.io.File r1, java.util.List r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.io.File r1 = r0.f7728
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.util.List<java.io.File> r2 = r0.f7729
        Lc:
            Yue.ۥ۠ۡۨ۠ r0 = r0.m10871(r1, r2)
            return r0
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof Yue.C2361
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥ۠ۡۨ۠ r5 = (Yue.C2361) r5
            java.io.File r1 = r4.f7728
            java.io.File r3 = r5.f7728
            boolean r1 = Yue.C3329.m13897(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List<java.io.File> r1 = r4.f7729
            java.util.List<java.io.File> r5 = r5.f7729
            boolean r5 = Yue.C3329.m13897(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.io.File r0 = r2.f7728
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List<java.io.File> r1 = r2.f7729
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FilePathComponents(root="
            r0.append(r1)
            java.io.File r1 = r2.f7728
            r0.append(r1)
            java.lang.String r1 = ", segments="
            r0.append(r1)
            java.util.List<java.io.File> r1 = r2.f7729
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.io.File m10869() {
            r1 = this;
            java.io.File r0 = r1.f7728
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.List<java.io.File> m10870() {
            r1 = this;
            java.util.List<java.io.File> r0 = r1.f7729
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.C2361 m10871(@Yue.InterfaceC4418 java.io.File r2, @Yue.InterfaceC4418 java.util.List<? extends java.io.File> r3) {
            r1 = this;
            java.lang.String r0 = "root"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "segments"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥ۠ۡۨ۠ r0 = new Yue.ۥ۠ۡۨ۠
            r0.<init>(r2, r3)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final java.io.File m10872() {
            r1 = this;
            java.io.File r0 = r1.f7728
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final java.lang.String m10873() {
            r2 = this;
            java.io.File r0 = r2.f7728
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = "root.path"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final java.util.List<java.io.File> m10874() {
            r1 = this;
            java.util.List<java.io.File> r0 = r1.f7729
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int m10875() {
            r1 = this;
            java.util.List<java.io.File> r0 = r1.f7729
            int r0 = r0.size()
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m10876() {
            r2 = this;
            java.io.File r0 = r2.f7728
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = "root.path"
            Yue.C3329.m13905(r0, r1)
            int r0 = r0.length()
            if (r0 <= 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final java.io.File m10877(int r12, int r13) {
            r11 = this;
            if (r12 < 0) goto L29
            if (r12 > r13) goto L29
            int r0 = r11.m10875()
            if (r13 > r0) goto L29
            java.io.File r0 = new java.io.File
            java.util.List<java.io.File> r1 = r11.f7729
            java.util.List r2 = r1.subList(r12, r13)
            java.lang.String r3 = java.io.File.separator
            java.lang.String r12 = "separator"
            Yue.C3329.m13905(r3, r12)
            r9 = 62
            r10 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r12 = Yue.C1219.m6398(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.<init>(r12)
            return r0
        L29:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            throw r12
    }
}
