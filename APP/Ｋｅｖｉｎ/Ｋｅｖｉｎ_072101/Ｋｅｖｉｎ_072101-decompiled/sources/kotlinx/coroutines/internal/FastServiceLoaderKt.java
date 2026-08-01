package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: FastServiceLoader.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m115d2 = {"ANDROID_DETECTED", "", "getANDROID_DETECTED", "()Z", "kotlinx-coroutines-core"}, m116k = 2, m117mv = {1, 6, 0}, m119xi = 48)
public final class FastServiceLoaderKt {
    private static final boolean ANDROID_DETECTED = false;

    static {
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> Le
            r0 = 0
            java.lang.String r1 = "android.os.Build"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.Object r0 = kotlin.Result.m8669constructorimpl(r1)     // Catch: java.lang.Throwable -> Le
            goto L19
        Le:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m8669constructorimpl(r0)
        L19:
            boolean r0 = kotlin.Result.m8676isSuccessimpl(r0)
            kotlinx.coroutines.internal.FastServiceLoaderKt.ANDROID_DETECTED = r0
            return
    }

    public static final boolean getANDROID_DETECTED() {
            boolean r0 = kotlinx.coroutines.internal.FastServiceLoaderKt.ANDROID_DETECTED
            return r0
    }
}
