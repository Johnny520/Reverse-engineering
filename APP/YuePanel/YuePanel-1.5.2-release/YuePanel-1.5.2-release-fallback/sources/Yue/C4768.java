package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4768 {
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final android.graphics.Picture m18988(@Yue.InterfaceC4418 android.graphics.Picture r0, int r1, int r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.graphics.Canvas, Yue.C6593> r3) {
            android.graphics.Canvas r1 = r0.beginRecording(r1, r2)
            r2 = 1
            r3.invoke(r1)     // Catch: java.lang.Throwable -> L12
            Yue.C3249.m13687(r2)
            r0.endRecording()
            Yue.C3249.m13686(r2)
            return r0
        L12:
            r1 = move-exception
            Yue.C3249.m13687(r2)
            r0.endRecording()
            Yue.C3249.m13686(r2)
            throw r1
    }
}
