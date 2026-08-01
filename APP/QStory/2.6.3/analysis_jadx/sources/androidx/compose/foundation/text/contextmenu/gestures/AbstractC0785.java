package androidx.compose.foundation.text.contextmenu.gestures;

import androidx.compose.foundation.gestures.AbstractC0521;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.gestures.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0785 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object m1589(InterfaceC1635 interfaceC1635, InterfaceC6558 interfaceC6558, InterfaceC4357 interfaceC4357) {
        Object objM1311 = AbstractC0521.m1311(interfaceC1635, new RightClickGesturesKt$onRightClickDown$2(interfaceC6558, null), interfaceC4357);
        return objM1311 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1311 : C5176.f14739;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1590(androidx.compose.ui.input.pointer.InterfaceC1633 r7, kotlin.coroutines.jvm.internal.BaseContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$awaitFirstRightClickDown$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$awaitFirstRightClickDown$1 r0 = (androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$awaitFirstRightClickDown$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$awaitFirstRightClickDown$1 r0 = new androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$awaitFirstRightClickDown$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r7 = (androidx.compose.ui.input.pointer.InterfaceC1633) r7
            kotlin.AbstractC5185.m10210(r8)
            goto L40
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            r7 = 0
            return r7
        L32:
            kotlin.AbstractC5185.m10210(r8)
        L35:
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = androidx.compose.ui.input.pointer.InterfaceC1633.m3016(r7, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世 r8 = (androidx.compose.ui.input.pointer.C1652) r8
            int r2 = r8.f4849
            java.util.List r8 = r8.f4852
            r2 = r2 & 66
            if (r2 == 0) goto L35
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L50:
            if (r5 >= r2) goto L62
            java.lang.Object r6 = r8.get(r5)
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r6 = (androidx.compose.ui.input.pointer.C1643) r6
            boolean r6 = androidx.compose.ui.input.pointer.AbstractC1646.m3030(r6)
            if (r6 != 0) goto L5f
            goto L35
        L5f:
            int r5 = r5 + 1
            goto L50
        L62:
            java.lang.Object r7 = r8.get(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.contextmenu.gestures.AbstractC0785.m1590(androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }
}
