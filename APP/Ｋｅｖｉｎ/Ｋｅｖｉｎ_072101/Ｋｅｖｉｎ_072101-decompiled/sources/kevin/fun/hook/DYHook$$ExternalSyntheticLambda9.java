package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda9 implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final android.graphics.Matrix f$0;
    public final android.graphics.LinearGradient f$1;
    public final android.widget.TextView f$2;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda9(android.graphics.Matrix r3, android.graphics.LinearGradient r4, android.widget.TextView r5) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            int r1 = androidx.core.C1073.m1015()
            r0 = 1616(0x650, float:2.264E-42)
        Lf:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L15;
                case 49: goto L18;
                case 204: goto L1d;
                case 239: goto L28;
                default: goto L14;
            }
        L14:
            goto Lf
        L15:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lf
        L18:
            if (r1 < 0) goto L15
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lf
        L1d:
            java.lang.String r0 = "Kjc6fHTEzr7KrDMYNld65"
            java.lang.String r0 = androidx.activity.C1066.m487(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L28:
            return
    }

    /* JADX INFO: renamed from: ۣۢۤۢ, reason: not valid java name and contains not printable characters */
    public static void m4715(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = androidx.customview.C1074.m1071()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L20;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            android.graphics.LinearGradient r3 = (android.graphics.LinearGradient) r3
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.animation.ValueAnimator r5 = (android.animation.ValueAnimator) r5
            kevin.fun.hook.DYHook.lambda$17(r2, r3, r4, r5)
        L1f:
            return
        L20:
            r0 = 1740(0x6cc, float:2.438E-42)
        L22:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L28;
                case 54: goto L1f;
                default: goto L27;
            }
        L27:
            goto L22
        L28:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L22
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator r6) {
            r5 = this;
            r1 = 0
            java.lang.String r4 = "ۣۤ۟"
            r0 = r1
            r2 = r1
            r3 = r1
        L6:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 1746845: goto L15;
                case 1747810: goto L2c;
                case 1749670: goto L24;
                case 1751745: goto L1c;
                default: goto Ld;
            }
        Ld:
            android.graphics.Matrix r1 = androidx.emoji2.C1080.m1510(r5)
            java.lang.String r4 = "ۤۧۤ"
            r3 = r1
            goto L6
        L15:
            m4715(r3, r0, r2, r6)
            java.lang.String r1 = "۠ۤۦ"
            r4 = r1
            goto L6
        L1c:
            android.graphics.LinearGradient r0 = androidx.core.C1072.m923(r5)
            java.lang.String r1 = "ۢۢۦ"
            r4 = r1
            goto L6
        L24:
            android.widget.TextView r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3806(r5)
            java.lang.String r4 = "۟ۤۢ"
            r2 = r1
            goto L6
        L2c:
            return
    }
}
