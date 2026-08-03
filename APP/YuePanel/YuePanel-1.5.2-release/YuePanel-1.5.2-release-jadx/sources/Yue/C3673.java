package Yue;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nCancellationException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellationException.kt\nkotlin/coroutines/cancellation/CancellationExceptionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
public final class C3673 {
    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ */
    public static final CancellationException m739(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final CancellationException m740(Throwable th) {
        CancellationException cancellationException = new CancellationException(th != null ? th.toString() : null);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m10064() {
    }
}
