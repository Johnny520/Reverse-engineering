package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nCancellationException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellationException.kt\nkotlin/coroutines/cancellation/CancellationExceptionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
public final class C0942 {
    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.util.concurrent.CancellationException m5359(java.lang.String r1, java.lang.Throwable r2) {
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            r0.initCause(r2)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.util.concurrent.CancellationException m5360(java.lang.Throwable r2) {
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            if (r2 == 0) goto L9
            java.lang.String r1 = r2.toString()
            goto La
        L9:
            r1 = 0
        La:
            r0.<init>(r1)
            r0.initCause(r2)
            return r0
    }

    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m5361() {
            return
    }
}
