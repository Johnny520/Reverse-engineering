package androidx.compose.material3.internal;

import androidx.compose.animation.core.AbstractC0336;
import androidx.compose.animation.core.C0341;
import androidx.compose.animation.core.C0362;

/* JADX INFO: renamed from: androidx.compose.material3.internal.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1127 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0362 f3271;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0362 f3272;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0362 f3273;

    static {
        C0341 c0341 = new C0341(0.4f, 0.0f, 0.6f, 1.0f);
        f3273 = new C0362(120, 0, AbstractC0336.f1142);
        f3272 = new C0362(150, 0, c0341);
        f3271 = new C0362(120, 0, c0341);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009 A[PHI: r1
  0x0009: PHI (r1v3 androidx.compose.animation.core.飘花落叶言子苏兰楪哲世) = 
  (r1v0 androidx.compose.animation.core.飘花落叶言子苏兰楪哲世)
  (r1v0 androidx.compose.animation.core.飘花落叶言子苏兰楪哲世)
  (r1v0 androidx.compose.animation.core.飘花落叶言子苏兰楪哲世)
  (r1v4 androidx.compose.animation.core.飘花落叶言子苏兰楪哲世)
  (r1v4 androidx.compose.animation.core.飘花落叶言子苏兰楪哲世)
  (r1v4 androidx.compose.animation.core.飘花落叶言子苏兰楪哲世)
  (r1v4 androidx.compose.animation.core.飘花落叶言子苏兰楪哲世)
 binds: [B:19:0x0022, B:22:0x0027, B:28:0x0033, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2007(androidx.compose.animation.core.C0331 r8, float r9, androidx.compose.foundation.interaction.InterfaceC0582 r10, androidx.compose.foundation.interaction.InterfaceC0582 r11, kotlin.coroutines.jvm.internal.SuspendLambda r12) {
        /*
            r0 = 0
            if (r11 == 0) goto L1c
            boolean r10 = r11 instanceof androidx.compose.foundation.interaction.C0575
            androidx.compose.animation.core.飘花落叶言子苏兰楪哲世 r1 = androidx.compose.material3.internal.AbstractC1127.f3273
            if (r10 == 0) goto Lb
        L9:
            r0 = r1
            goto L1a
        Lb:
            boolean r10 = r11 instanceof androidx.compose.foundation.interaction.C0570
            if (r10 == 0) goto L10
            goto L9
        L10:
            boolean r10 = r11 instanceof androidx.compose.foundation.interaction.C0577
            if (r10 == 0) goto L15
            goto L9
        L15:
            boolean r10 = r11 instanceof androidx.compose.foundation.interaction.C0566
            if (r10 == 0) goto L1a
            goto L9
        L1a:
            r3 = r0
            goto L36
        L1c:
            if (r10 == 0) goto L1a
            boolean r11 = r10 instanceof androidx.compose.foundation.interaction.C0575
            androidx.compose.animation.core.飘花落叶言子苏兰楪哲世 r1 = androidx.compose.material3.internal.AbstractC1127.f3272
            if (r11 == 0) goto L25
        L24:
            goto L9
        L25:
            boolean r11 = r10 instanceof androidx.compose.foundation.interaction.C0570
            if (r11 == 0) goto L2a
            goto L24
        L2a:
            boolean r11 = r10 instanceof androidx.compose.foundation.interaction.C0577
            if (r11 == 0) goto L31
            androidx.compose.animation.core.飘花落叶言子苏兰楪哲世 r0 = androidx.compose.material3.internal.AbstractC1127.f3271
            goto L1a
        L31:
            boolean r10 = r10 instanceof androidx.compose.foundation.interaction.C0566
            if (r10 == 0) goto L1a
            goto L24
        L36:
            if (r3 == 0) goto L4c
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪世兰哲苏 r2 = new 飘花落叶言子苏哲世楪兰.飘花落叶言子楪世兰哲苏
            r2.<init>(r9)
            r5 = 0
            r7 = 12
            r4 = 0
            r1 = r8
            r6 = r12
            java.lang.Object r8 = androidx.compose.animation.core.C0331.m1028(r1, r2, r3, r4, r5, r6, r7)
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r8 != r9) goto L5c
            return r8
        L4c:
            r1 = r8
            r6 = r12
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪世兰哲苏 r8 = new 飘花落叶言子苏哲世楪兰.飘花落叶言子楪世兰哲苏
            r8.<init>(r9)
            java.lang.Object r8 = r1.m1030(r8, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r8 != r9) goto L5c
            return r8
        L5c:
            kotlin.飘花落叶言子楪兰苏哲世 r8 = kotlin.C5175.f14739
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AbstractC1127.m2007(androidx.compose.animation.core.飘花落叶言子楪世苏兰哲, float, androidx.compose.foundation.interaction.飘花落叶言子楪苏哲兰世, androidx.compose.foundation.interaction.飘花落叶言子楪苏哲兰世, kotlin.coroutines.jvm.internal.SuspendLambda):java.lang.Object");
    }
}
