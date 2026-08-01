package androidx.compose.foundation.gestures;

import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import com.android.p002dx.p005io.Opcodes;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", m556f = "TapGestureDetector.kt", m557l = {Opcodes.CONST_METHOD_HANDLE}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;"}, m152k = 3, m153mv = {2, 1, 0})
final class TapGestureDetectorKt$awaitSecondDown$2 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C2478 $firstUp;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$awaitSecondDown$2(C2478 c2478, InterfaceC5189<? super TapGestureDetectorKt$awaitSecondDown$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$firstUp = c2478;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2 = new TapGestureDetectorKt$awaitSecondDown$2(this.$firstUp, interfaceC5189);
        tapGestureDetectorKt$awaitSecondDown$2.L$0 = obj;
        return tapGestureDetectorKt$awaitSecondDown$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C2478> interfaceC5189) {
        return ((TapGestureDetectorKt$awaitSecondDown$2) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003e -> B:12:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 != r3) goto L14
            long r4 = r8.J$0
            java.lang.Object r1 = r8.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.p001ui.input.pointer.InterfaceC2468) r1
            kotlin.AbstractC6017.m10769(r9)
            goto L41
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C6755.m11870(r8)
            return r2
        L1a:
            kotlin.AbstractC6017.m10769(r9)
            java.lang.Object r9 = r8.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r9 = (androidx.compose.p001ui.input.pointer.InterfaceC2468) r9
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r1 = r8.$firstUp
            long r4 = r1.f5153
            androidx.compose.ui.input.pointer.飘花落叶言子世楪兰哲苏 r9 = (androidx.compose.p001ui.input.pointer.C2456) r9
            androidx.compose.ui.platform.飘花落叶言子哲兰苏世楪 r1 = r9.m3557()
            r1.getClass()
            r6 = 40
            long r6 = r6 + r4
            r1 = r9
            r4 = r6
        L33:
            r8.L$0 = r1
            r8.J$0 = r4
            r8.label = r3
            r9 = 3
            java.lang.Object r9 = androidx.compose.foundation.gestures.AbstractC1344.m1835(r1, r2, r8, r9)
            if (r9 != r0) goto L41
            return r0
        L41:
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r9 = (androidx.compose.p001ui.input.pointer.C2478) r9
            long r6 = r9.f5153
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 < 0) goto L33
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
