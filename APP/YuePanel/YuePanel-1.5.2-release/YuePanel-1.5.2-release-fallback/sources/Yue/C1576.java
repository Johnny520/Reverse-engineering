package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1576 {
    public C1576() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4544
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.database.Cursor m7744(@Yue.InterfaceC4410 android.content.ContentResolver r7, @Yue.InterfaceC4410 android.net.Uri r8, @Yue.InterfaceC4544 java.lang.String[] r9, @Yue.InterfaceC4544 java.lang.String r10, @Yue.InterfaceC4544 java.lang.String[] r11, @Yue.InterfaceC4544 java.lang.String r12, @Yue.InterfaceC4544 Yue.C0943 r13) {
            if (r13 == 0) goto La
            java.lang.Object r13 = r13.m5363()
            android.os.CancellationSignal r13 = (android.os.CancellationSignal) r13
        L8:
            r6 = r13
            goto Lc
        La:
            r13 = 0
            goto L8
        Lc:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            android.database.Cursor r7 = m7745(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static android.database.Cursor m7745(@Yue.InterfaceC4410 android.content.ContentResolver r0, @Yue.InterfaceC4410 android.net.Uri r1, @Yue.InterfaceC4544 java.lang.String[] r2, @Yue.InterfaceC4544 java.lang.String r3, @Yue.InterfaceC4544 java.lang.String[] r4, @Yue.InterfaceC4544 java.lang.String r5, @Yue.InterfaceC4544 android.os.CancellationSignal r6) {
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = move-exception
            boolean r1 = r0 instanceof android.os.OperationCanceledException
            if (r1 == 0) goto L10
            Yue.ۥۣۡۤ۟ r0 = new Yue.ۥۣۡۤ۟
            r0.<init>()
            throw r0
        L10:
            throw r0
    }
}
