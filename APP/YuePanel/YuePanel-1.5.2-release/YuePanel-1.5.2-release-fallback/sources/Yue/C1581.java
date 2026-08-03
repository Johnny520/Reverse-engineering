package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,94:1\n314#2,11:95\n*S KotlinDebug\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n*L\n81#1:95,11\n*E\n"})
public final class C1581 {

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۧ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$1\n*L\n1#1,94:1\n*E\n"})
    public static final class C1582 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Throwable, Yue.C6593> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC1579 f4997;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1581.C1583 f4998;

        public C1582(Yue.InterfaceC1579 r1, Yue.C1581.C1583 r2) {
                r0 = this;
                r0.f4997 = r1
                r0.f4998 = r2
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.m7754(r1)
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m7754(@Yue.InterfaceC4543 java.lang.Throwable r2) {
                r1 = this;
                Yue.ۥۣ۟ۧۥ r2 = r1.f4997
                Yue.ۥۣ۟ۧۧ$ۥ۟ r0 = r1.f4998
                r2.removeOnContextAvailableListener(r0)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۧ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
    public static final class C1583 implements Yue.InterfaceC4613 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC0932<R> f4999;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2825<android.content.Context, R> f5000;

        public C1583(Yue.InterfaceC0932<R> r1, Yue.InterfaceC2825<android.content.Context, R> r2) {
                r0 = this;
                r0.f4999 = r1
                r0.f5000 = r2
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC4613
        /* JADX INFO: renamed from: ۥ */
        public void mo7067(@Yue.InterfaceC4418 android.content.Context r4) {
                r3 = this;
                java.lang.String r0 = "context"
                Yue.C3329.m13906(r4, r0)
                Yue.ۥۣ۟ۨ۟<R> r0 = r3.f4999
                Yue.ۥۣ۠ۡ۟<android.content.Context, R> r1 = r3.f5000
                Yue.ۥۡۦۧۤ$ۥ r2 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L14
                java.lang.Object r4 = r1.invoke(r4)     // Catch: java.lang.Throwable -> L14
                java.lang.Object r4 = Yue.C5388.m20377(r4)     // Catch: java.lang.Throwable -> L14
                goto L1f
            L14:
                r4 = move-exception
                Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029
                java.lang.Object r4 = Yue.C5391.m20390(r4)
                java.lang.Object r4 = Yue.C5388.m20377(r4)
            L1f:
                r0.resumeWith(r4)
                return
        }
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <R> java.lang.Object m7752(@Yue.InterfaceC4418 Yue.InterfaceC1579 r3, @Yue.InterfaceC4418 Yue.InterfaceC2825<android.content.Context, R> r4, @Yue.InterfaceC4418 Yue.InterfaceC1598<R> r5) {
            android.content.Context r0 = r3.peekAvailableContext()
            if (r0 == 0) goto Lb
            java.lang.Object r3 = r4.invoke(r0)
            return r3
        Lb:
            Yue.ۥۣ۟ۨ۠ r0 = new Yue.ۥۣ۟ۨ۠
            Yue.ۥ۟ۧۤۢ r1 = Yue.C3332.m13940(r5)
            r2 = 1
            r0.<init>(r1, r2)
            r0.mo5307()
            Yue.ۥۣ۟ۧۧ$ۥ۟ r1 = new Yue.ۥۣ۟ۧۧ$ۥ۟
            r1.<init>(r0, r4)
            r3.addOnContextAvailableListener(r1)
            Yue.ۥۣ۟ۧۧ$ۥ r4 = new Yue.ۥۣ۟ۧۧ$ۥ
            r4.<init>(r3, r1)
            r0.mo5308(r4)
            java.lang.Object r3 = r0.m5329()
            java.lang.Object r4 = Yue.C3341.m13947()
            if (r3 != r4) goto L35
            Yue.C1757.m8349(r5)
        L35:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <R> java.lang.Object m7753(Yue.InterfaceC1579 r3, Yue.InterfaceC2825<android.content.Context, R> r4, Yue.InterfaceC1598<R> r5) {
            android.content.Context r0 = r3.peekAvailableContext()
            if (r0 == 0) goto Lb
            java.lang.Object r3 = r4.invoke(r0)
            return r3
        Lb:
            r0 = 0
            Yue.C3249.m13688(r0)
            Yue.ۥۣ۟ۨ۠ r0 = new Yue.ۥۣ۟ۨ۠
            Yue.ۥ۟ۧۤۢ r1 = Yue.C3332.m13940(r5)
            r2 = 1
            r0.<init>(r1, r2)
            r0.mo5307()
            Yue.ۥۣ۟ۧۧ$ۥ۟ r1 = new Yue.ۥۣ۟ۧۧ$ۥ۟
            r1.<init>(r0, r4)
            r3.addOnContextAvailableListener(r1)
            Yue.ۥۣ۟ۧۧ$ۥ r4 = new Yue.ۥۣ۟ۧۧ$ۥ
            r4.<init>(r3, r1)
            r0.mo5308(r4)
            Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016
            java.lang.Object r3 = r0.m5329()
            java.lang.Object r4 = Yue.C3341.m13947()
            if (r3 != r4) goto L3b
            Yue.C1757.m8349(r5)
        L3b:
            Yue.C3249.m13688(r2)
            return r3
    }
}
