package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1682 extends Yue.AbstractC0630<android.database.Cursor> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final Yue.C3654<android.database.Cursor>.C3655 f5278;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public android.net.Uri f5279;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public java.lang.String[] f5280;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public java.lang.String f5281;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public java.lang.String[] f5282;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public java.lang.String f5283;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public android.database.Cursor f5284;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public Yue.C0943 f5285;

    public C1682(@Yue.InterfaceC4410 android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            Yue.ۥۣ۠ۧۥ$ۥ r1 = new Yue.ۥۣ۠ۧۥ$ۥ
            r1.<init>(r0)
            r0.f5278 = r1
            return
    }

    public C1682(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 android.net.Uri r2, @Yue.InterfaceC4544 java.lang.String[] r3, @Yue.InterfaceC4544 java.lang.String r4, @Yue.InterfaceC4544 java.lang.String[] r5, @Yue.InterfaceC4544 java.lang.String r6) {
            r0 = this;
            r0.<init>(r1)
            Yue.ۥۣ۠ۧۥ$ۥ r1 = new Yue.ۥۣ۠ۧۥ$ۥ
            r1.<init>(r0)
            r0.f5278 = r1
            r0.f5279 = r2
            r0.f5280 = r3
            r0.f5281 = r4
            r0.f5282 = r5
            r0.f5283 = r6
            return
    }

    @Override // Yue.C3654
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ void mo8075(java.lang.Object r1) {
            r0 = this;
            android.database.Cursor r1 = (android.database.Cursor) r1
            r0.m8079(r1)
            return
    }

    @Override // Yue.AbstractC0630, Yue.C3654
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo4128(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4) {
            r0 = this;
            super.mo4128(r1, r2, r3, r4)
            r3.print(r1)
            java.lang.String r2 = "mUri="
            r3.print(r2)
            android.net.Uri r2 = r0.f5279
            r3.println(r2)
            r3.print(r1)
            java.lang.String r2 = "mProjection="
            r3.print(r2)
            java.lang.String[] r2 = r0.f5280
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r3.println(r2)
            r3.print(r1)
            java.lang.String r2 = "mSelection="
            r3.print(r2)
            java.lang.String r2 = r0.f5281
            r3.println(r2)
            r3.print(r1)
            java.lang.String r2 = "mSelectionArgs="
            r3.print(r2)
            java.lang.String[] r2 = r0.f5282
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r3.println(r2)
            r3.print(r1)
            java.lang.String r2 = "mSortOrder="
            r3.print(r2)
            java.lang.String r2 = r0.f5283
            r3.println(r2)
            r3.print(r1)
            java.lang.String r2 = "mCursor="
            r3.print(r2)
            android.database.Cursor r2 = r0.f5284
            r3.println(r2)
            r3.print(r1)
            java.lang.String r1 = "mContentChanged="
            r3.print(r1)
            boolean r1 = r0.f11665
            r3.println(r1)
            return
    }

    @Override // Yue.C3654
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void mo8076() {
            r1 = this;
            super.mo8076()
            r1.mo8078()
            android.database.Cursor r0 = r1.f5284
            if (r0 == 0) goto L15
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L15
            android.database.Cursor r0 = r1.f5284
            r0.close()
        L15:
            r0 = 0
            r1.f5284 = r0
            return
    }

    @Override // Yue.C3654
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void mo8077() {
            r1 = this;
            android.database.Cursor r0 = r1.f5284
            if (r0 == 0) goto L7
            r1.m8079(r0)
        L7:
            boolean r0 = r1.m14795()
            if (r0 != 0) goto L11
            android.database.Cursor r0 = r1.f5284
            if (r0 != 0) goto L14
        L11:
            r1.m14781()
        L14:
            return
    }

    @Override // Yue.C3654
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void mo8078() {
            r0 = this;
            r0.m14777()
            return
    }

    @Override // Yue.AbstractC0630
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public void mo4131() {
            r1 = this;
            super.mo4131()
            monitor-enter(r1)
            Yue.ۥۣ۟ۨۧ r0 = r1.f5285     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            r0.m5362()     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r0 = move-exception
            goto L10
        Le:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            return
        L10:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    @Override // Yue.AbstractC0630
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public /* bridge */ /* synthetic */ android.database.Cursor mo4136() {
            r1 = this;
            android.database.Cursor r0 = r1.m8085()
            return r0
    }

    @Override // Yue.AbstractC0630
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    public /* bridge */ /* synthetic */ void mo4137(android.database.Cursor r1) {
            r0 = this;
            android.database.Cursor r1 = (android.database.Cursor) r1
            r0.m8086(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public void m8079(android.database.Cursor r3) {
            r2 = this;
            boolean r0 = r2.m14785()
            if (r0 == 0) goto Lc
            if (r3 == 0) goto Lb
            r3.close()
        Lb:
            return
        Lc:
            android.database.Cursor r0 = r2.f5284
            r2.f5284 = r3
            boolean r1 = r2.m14786()
            if (r1 == 0) goto L19
            super.mo8075(r3)
        L19:
            if (r0 == 0) goto L26
            if (r0 == r3) goto L26
            boolean r3 = r0.isClosed()
            if (r3 != 0) goto L26
            r0.close()
        L26:
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public java.lang.String[] m8080() {
            r1 = this;
            java.lang.String[] r0 = r1.f5280
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public java.lang.String m8081() {
            r1 = this;
            java.lang.String r0 = r1.f5281
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public java.lang.String[] m8082() {
            r1 = this;
            java.lang.String[] r0 = r1.f5282
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public java.lang.String m8083() {
            r1 = this;
            java.lang.String r0 = r1.f5283
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public android.net.Uri m8084() {
            r1 = this;
            android.net.Uri r0 = r1.f5279
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public android.database.Cursor m8085() {
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.m4135()     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L4c
            Yue.ۥۣ۟ۨۧ r0 = new Yue.ۥۣ۟ۨۧ     // Catch: java.lang.Throwable -> L4a
            r0.<init>()     // Catch: java.lang.Throwable -> L4a
            r9.f5285 = r0     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L4a
            r0 = 0
            android.content.Context r1 = r9.m14782()     // Catch: java.lang.Throwable -> L33
            android.content.ContentResolver r2 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L33
            android.net.Uri r3 = r9.f5279     // Catch: java.lang.Throwable -> L33
            java.lang.String[] r4 = r9.f5280     // Catch: java.lang.Throwable -> L33
            java.lang.String r5 = r9.f5281     // Catch: java.lang.Throwable -> L33
            java.lang.String[] r6 = r9.f5282     // Catch: java.lang.Throwable -> L33
            java.lang.String r7 = r9.f5283     // Catch: java.lang.Throwable -> L33
            Yue.ۥۣ۟ۨۧ r8 = r9.f5285     // Catch: java.lang.Throwable -> L33
            android.database.Cursor r1 = Yue.C1576.m7744(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L3a
            r1.getCount()     // Catch: java.lang.Throwable -> L33 java.lang.RuntimeException -> L35
            Yue.ۥۣ۠ۧۥ<android.database.Cursor>$ۥ r2 = r9.f5278     // Catch: java.lang.Throwable -> L33 java.lang.RuntimeException -> L35
            r1.registerContentObserver(r2)     // Catch: java.lang.Throwable -> L33 java.lang.RuntimeException -> L35
            goto L3a
        L33:
            r1 = move-exception
            goto L42
        L35:
            r2 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L33
            throw r2     // Catch: java.lang.Throwable -> L33
        L3a:
            monitor-enter(r9)
            r9.f5285 = r0     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3f
            return r1
        L3f:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3f
            throw r0
        L42:
            monitor-enter(r9)
            r9.f5285 = r0     // Catch: java.lang.Throwable -> L47
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L47
            throw r1
        L47:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L47
            throw r0
        L4a:
            r0 = move-exception
            goto L52
        L4c:
            Yue.ۥۣۡۤ۟ r0 = new Yue.ۥۣۡۤ۟     // Catch: java.lang.Throwable -> L4a
            r0.<init>()     // Catch: java.lang.Throwable -> L4a
            throw r0     // Catch: java.lang.Throwable -> L4a
        L52:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L4a
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void m8086(android.database.Cursor r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto Lb
            r2.close()
        Lb:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public void m8087(@Yue.InterfaceC4544 java.lang.String[] r1) {
            r0 = this;
            r0.f5280 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m8088(@Yue.InterfaceC4544 java.lang.String r1) {
            r0 = this;
            r0.f5281 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m8089(@Yue.InterfaceC4544 java.lang.String[] r1) {
            r0 = this;
            r0.f5282 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m8090(@Yue.InterfaceC4544 java.lang.String r1) {
            r0 = this;
            r0.f5283 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m8091(@Yue.InterfaceC4410 android.net.Uri r1) {
            r0 = this;
            r0.f5279 = r1
            return
    }
}
