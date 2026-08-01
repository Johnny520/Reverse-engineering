package androidx.compose.foundation.gestures;

import androidx.appcompat.app.C0076;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.C1652;
import java.util.List;
import p052.InterfaceC6553;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0556 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0076 f1600 = new C0076(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f1601;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC7895 f1602;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6553 f1603;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0502 f1604;

    public AbstractC0556(C0502 c0502, InterfaceC6553 interfaceC6553, InterfaceC7895 interfaceC7895) {
        this.f1604 = c0502;
        this.f1603 = interfaceC6553;
        this.f1602 = interfaceC7895;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m1340(C1652 c1652) {
        List list = c1652.f4851;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C1643) list.get(i)).m3014();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1341(p052.InterfaceC6553 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.NonTouchScrollingLogic$userScroll$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.NonTouchScrollingLogic$userScroll$1 r0 = (androidx.compose.foundation.gestures.NonTouchScrollingLogic$userScroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.NonTouchScrollingLogic$userScroll$1 r0 = new androidx.compose.foundation.gestures.NonTouchScrollingLogic$userScroll$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            kotlin.AbstractC5184.m10206(r7)
            goto L4a
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r3
        L2e:
            kotlin.AbstractC5184.m10206(r7)
            r5.f1601 = r4
            androidx.compose.foundation.gestures.NonTouchScrollingLogic$userScroll$2 r7 = new androidx.compose.foundation.gestures.NonTouchScrollingLogic$userScroll$2
            r7.<init>(r5, r6, r3)
            r0.label = r4
            kotlinx.coroutines.飘花落叶言子哲楪苏世兰 r6 = new kotlinx.coroutines.飘花落叶言子哲楪苏世兰
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r2 = r0.getContext()
            r6.<init>(r0, r2)
            java.lang.Object r6 = p053.AbstractC6560.m11999(r6, r4, r6, r7)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r6 = 0
            r5.f1601 = r6
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5175.f14739
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0556.m1341(飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
