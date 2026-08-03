package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6417 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f22656 = "TransitionBuilder";

    public C6417() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Yue.C4285.C4287 m23673(Yue.C4285 r1, int r2, int r3, androidx.constraintlayout.widget.C7462 r4, int r5, androidx.constraintlayout.widget.C7462 r6) {
            Yue.ۥۡۡۥۥ$ۥ۟ r0 = new Yue.ۥۡۡۥۥ$ۥ۟
            r0.<init>(r2, r1, r3, r5)
            m23674(r1, r0, r4, r6)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m23674(Yue.C4285 r1, Yue.C4285.C4287 r2, androidx.constraintlayout.widget.C7462 r3, androidx.constraintlayout.widget.C7462 r4) {
            int r0 = r2.m16852()
            int r2 = r2.m16845()
            r1.m16811(r0, r3)
            r1.m16811(r2, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m23675(Yue.C4273 r1) {
            Yue.ۥۡۡۥۥ r0 = r1.f13342
            if (r0 == 0) goto L29
            boolean r1 = r0.m16819(r1)
            if (r1 == 0) goto L21
            Yue.ۥۡۡۥۥ$ۥ۟ r1 = r0.f13504
            if (r1 == 0) goto L19
            java.util.ArrayList r1 = r0.m16777()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L19
            return
        L19:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Invalid motion layout. Motion Scene doesn't have any transition."
            r1.<init>(r0)
            throw r1
        L21:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "MotionLayout doesn't have the right motion scene."
            r1.<init>(r0)
            throw r1
        L29:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Invalid motion layout. Layout missing Motion Scene."
            r1.<init>(r0)
            throw r1
    }
}
