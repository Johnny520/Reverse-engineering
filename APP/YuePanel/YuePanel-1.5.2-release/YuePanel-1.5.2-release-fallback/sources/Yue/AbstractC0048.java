package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC2709
public abstract class AbstractC0048<T> implements Yue.InterfaceC2464<T>, Yue.InterfaceC0937<T> {

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۡ۠$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", i = {0}, l = {230}, m = "collect", n = {"safeCollector"}, s = {"L$0"})
    public static final class C0049 extends Yue.AbstractC1600 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public java.lang.Object f108;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f109;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0048<T> f110;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f111;

        public C0049(Yue.AbstractC0048<T> r1, Yue.InterfaceC1598<? super Yue.AbstractC0048.C0049> r2) {
                r0 = this;
                r0.f110 = r1
                r0.<init>(r2)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                r1 = this;
                r1.f109 = r2
                int r2 = r1.f111
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f111 = r2
                Yue.ۥ۟۟ۡ۠<T> r2 = r1.f110
                r0 = 0
                java.lang.Object r2 = r2.mo392(r0, r1)
                return r2
        }
    }

    public AbstractC0048() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.InterfaceC2464
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Object mo392(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r6, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r7) {
            r5 = this;
            boolean r0 = r7 instanceof Yue.AbstractC0048.C0049
            if (r0 == 0) goto L13
            r0 = r7
            Yue.ۥ۟۟ۡ۠$ۥ r0 = (Yue.AbstractC0048.C0049) r0
            int r1 = r0.f111
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111 = r1
            goto L18
        L13:
            Yue.ۥ۟۟ۡ۠$ۥ r0 = new Yue.ۥ۟۟ۡ۠$ۥ
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f109
            java.lang.Object r1 = Yue.C3341.m13947()
            int r2 = r0.f111
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f108
            Yue.ۥۡۧۢ۠ r6 = (Yue.C5460) r6
            Yue.C5391.m20403(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            Yue.C5391.m20403(r7)
            Yue.ۥۡۧۢ۠ r7 = new Yue.ۥۡۧۢ۠
            Yue.ۥ۟ۧۦۥ r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f108 = r7     // Catch: java.lang.Throwable -> L55
            r0.f111 = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.mo393(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public abstract java.lang.Object mo393(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r2);
}
