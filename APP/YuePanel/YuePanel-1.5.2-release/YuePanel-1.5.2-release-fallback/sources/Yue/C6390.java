package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6390 {
    @Yue.InterfaceC1816(message = "Use androidx.tracing.Trace instead", replaceWith = @Yue.InterfaceC5313(expression = "trace(sectionName, block)", imports = {"androidx.tracing.trace"}))
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <T> T m23602(@Yue.InterfaceC4418 java.lang.String r0, @Yue.InterfaceC4418 Yue.InterfaceC2823<? extends T> r1) {
            android.os.Trace.beginSection(r0)
            r0 = 1
            java.lang.Object r1 = r1.invoke()     // Catch: java.lang.Throwable -> L12
            Yue.C3249.m13687(r0)
            android.os.Trace.endSection()
            Yue.C3249.m13686(r0)
            return r1
        L12:
            r1 = move-exception
            Yue.C3249.m13687(r0)
            android.os.Trace.endSection()
            Yue.C3249.m13686(r0)
            throw r1
    }
}
