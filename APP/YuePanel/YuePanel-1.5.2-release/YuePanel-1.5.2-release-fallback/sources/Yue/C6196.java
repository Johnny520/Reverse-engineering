package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nThread.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Thread.kt\nkotlin/concurrent/ThreadsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
@Yue.InterfaceC3421(name = "ThreadsKt")
public final class C6196 {

    /* JADX INFO: renamed from: Yue.ۥۢۡۢۧ$ۥ, reason: contains not printable characters */
    public static final class C6197 extends java.lang.Thread {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2823<Yue.C6593> f22176;

        public C6197(Yue.InterfaceC2823<Yue.C6593> r1) {
                r0 = this;
                r0.f22176 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r1 = this;
                Yue.ۥۣ۠۠ۨ<Yue.ۥۣۢ۠ۤ> r0 = r1.f22176
                r0.invoke()
                return
        }
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <T> T m23171(java.lang.ThreadLocal<T> r1, Yue.InterfaceC2823<? extends T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "default"
            Yue.C3329.m13906(r2, r0)
            java.lang.Object r0 = r1.get()
            if (r0 != 0) goto L17
            java.lang.Object r0 = r2.invoke()
            r1.set(r0)
        L17:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.Thread m23172(boolean r1, boolean r2, @Yue.InterfaceC4543 java.lang.ClassLoader r3, @Yue.InterfaceC4543 java.lang.String r4, int r5, @Yue.InterfaceC4418 Yue.InterfaceC2823<Yue.C6593> r6) {
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r6, r0)
            Yue.ۥۢۡۢۧ$ۥ r0 = new Yue.ۥۢۡۢۧ$ۥ
            r0.<init>(r6)
            if (r2 == 0) goto L10
            r2 = 1
            r0.setDaemon(r2)
        L10:
            if (r5 <= 0) goto L15
            r0.setPriority(r5)
        L15:
            if (r4 == 0) goto L1a
            r0.setName(r4)
        L1a:
            if (r3 == 0) goto L1f
            r0.setContextClassLoader(r3)
        L1f:
            if (r1 == 0) goto L24
            r0.start()
        L24:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Thread m23173(boolean r6, boolean r7, java.lang.ClassLoader r8, java.lang.String r9, int r10, Yue.InterfaceC2823 r11, int r12, java.lang.Object r13) {
            r13 = r12 & 1
            if (r13 == 0) goto L5
            r6 = 1
        L5:
            r0 = r6
            r6 = r12 & 2
            if (r6 == 0) goto Lb
            r7 = 0
        Lb:
            r1 = r7
            r6 = r12 & 4
            r7 = 0
            if (r6 == 0) goto L13
            r2 = r7
            goto L14
        L13:
            r2 = r8
        L14:
            r6 = r12 & 8
            if (r6 == 0) goto L1a
            r3 = r7
            goto L1b
        L1a:
            r3 = r9
        L1b:
            r6 = r12 & 16
            if (r6 == 0) goto L20
            r10 = -1
        L20:
            r4 = r10
            r5 = r11
            java.lang.Thread r6 = m23172(r0, r1, r2, r3, r4, r5)
            return r6
    }
}
