package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gc0 {
    public defpackage.fc0 a;

    public gc0(int r3, android.view.animation.DecelerateInterpolator r4, long r5) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L15
            ec0 r0 = new ec0
            android.view.WindowInsetsAnimation r3 = defpackage.d0.i(r3, r4, r5)
            r0.<init>(r3)
            r2.a = r0
            return
        L15:
            cc0 r0 = new cc0
            r0.<init>(r3, r4, r5)
            r2.a = r0
            return
    }
}
