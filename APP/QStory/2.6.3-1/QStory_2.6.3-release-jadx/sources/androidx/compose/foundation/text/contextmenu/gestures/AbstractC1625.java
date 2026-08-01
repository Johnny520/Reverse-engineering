package androidx.compose.foundation.text.contextmenu.gestures;

import androidx.compose.foundation.gestures.AbstractC1362;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.gestures.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1625 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object m2149(InterfaceC2470 interfaceC2470, InterfaceC7387 interfaceC7387, InterfaceC5189 interfaceC5189) {
        Object objM1871 = AbstractC1362.m1871(interfaceC2470, new RightClickGesturesKt$onRightClickDown$2(interfaceC7387, null), interfaceC5189);
        return objM1871 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1871 : C6008.f15084;
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
    */
    public static final java.lang.Object m2150(androidx.compose.p001ui.input.pointer.InterfaceC2468 r7, kotlin.coroutines.jvm.internal.BaseContinuationImpl r8) {
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
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r7 = (androidx.compose.p001ui.input.pointer.InterfaceC2468) r7
            kotlin.AbstractC6017.m10769(r8)
            goto L40
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C6755.m11870(r7)
            r7 = 0
            return r7
        L32:
            kotlin.AbstractC6017.m10769(r8)
        L35:
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = androidx.compose.p001ui.input.pointer.InterfaceC2468.m3576(r7, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世 r8 = (androidx.compose.p001ui.input.pointer.C2487) r8
            int r2 = r8.f5194
            java.util.List r8 = r8.f5197
            r2 = r2 & 66
            if (r2 == 0) goto L35
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L50:
            if (r5 >= r2) goto L62
            java.lang.Object r6 = r8.get(r5)
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r6 = (androidx.compose.p001ui.input.pointer.C2478) r6
            boolean r6 = androidx.compose.p001ui.input.pointer.AbstractC2481.m3590(r6)
            if (r6 != 0) goto L5f
            goto L35
        L5f:
            int r5 = r5 + 1
            goto L50
        L62:
            java.lang.Object r7 = r8.get(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.contextmenu.gestures.AbstractC1625.m2150(androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }
}
