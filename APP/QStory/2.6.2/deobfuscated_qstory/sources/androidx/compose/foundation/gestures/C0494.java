package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.nestedscroll.InterfaceC1620;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0494 implements InterfaceC1620 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f1472;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0502 f1473;

    public C0494(C0502 c0502, boolean z) {
        this.f1473 = c0502;
        this.f1472 = z;
    }

    @Override // androidx.compose.ui.input.nestedscroll.InterfaceC1620
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final long mo1244(long j, long j2, int i) {
        if (!this.f1472) {
            return 0L;
        }
        C0502 c0502 = this.f1473;
        if (c0502.f1491.mo1240()) {
            return 0L;
        }
        return c0502.m1258(c0502.m1254(c0502.f1491.mo1238(c0502.m1254(c0502.m1259(j2)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.InterfaceC1620
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo1245(long r5, long r7, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r5 = r9 instanceof androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            if (r5 == 0) goto L13
            r5 = r9
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r5 = (androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1) r5
            int r6 = r5.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L13
            int r6 = r6 - r0
            r5.label = r6
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r5 = new androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            r5.<init>(r4, r9)
        L18:
            java.lang.Object r6 = r5.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r5.label
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L29
            long r7 = r5.J$0
            kotlin.AbstractC5184.m10206(r6)
            goto L4b
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r4)
            r4 = 0
            return r4
        L30:
            kotlin.AbstractC5184.m10206(r6)
            boolean r6 = r4.f1472
            r2 = 0
            if (r6 == 0) goto L53
            androidx.compose.foundation.gestures.飘花落叶言子哲兰楪世苏 r4 = r4.f1473
            boolean r6 = r4.f1497
            if (r6 == 0) goto L40
            goto L4f
        L40:
            r5.J$0 = r7
            r5.label = r1
            java.lang.Object r6 = r4.m1257(r7, r5)
            if (r6 != r9) goto L4b
            return r9
        L4b:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r6 = (p205.C7901) r6
            long r2 = r6.f21874
        L4f:
            long r2 = p205.C7901.m13321(r7, r2)
        L53:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r4 = new 飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世
            r4.<init>(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C0494.mo1245(long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
