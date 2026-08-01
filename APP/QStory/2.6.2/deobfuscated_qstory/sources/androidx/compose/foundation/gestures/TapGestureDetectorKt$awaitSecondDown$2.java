package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.InterfaceC1633;
import com.android.dx.io.Opcodes;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {Opcodes.CONST_METHOD_HANDLE}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;"}, k = 3, mv = {2, 1, 0})
final class TapGestureDetectorKt$awaitSecondDown$2 extends RestrictedSuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C1643 $firstUp;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$awaitSecondDown$2(C1643 c1643, InterfaceC4356<? super TapGestureDetectorKt$awaitSecondDown$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$firstUp = c1643;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2 = new TapGestureDetectorKt$awaitSecondDown$2(this.$firstUp, interfaceC4356);
        tapGestureDetectorKt$awaitSecondDown$2.L$0 = obj;
        return tapGestureDetectorKt$awaitSecondDown$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4356<? super C1643> interfaceC4356) {
        return ((TapGestureDetectorKt$awaitSecondDown$2) create(interfaceC1633, interfaceC4356)).invokeSuspend(C5175.f14739);
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
        To view partially-correct add '--show-bad-code' argument
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
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.ui.input.pointer.InterfaceC1633) r1
            kotlin.AbstractC5184.m10206(r9)
            goto L41
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r8)
            return r2
        L1a:
            kotlin.AbstractC5184.m10206(r9)
            java.lang.Object r9 = r8.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r9 = (androidx.compose.ui.input.pointer.InterfaceC1633) r9
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r1 = r8.$firstUp
            long r4 = r1.f4807
            androidx.compose.ui.input.pointer.飘花落叶言子世楪兰哲苏 r9 = (androidx.compose.ui.input.pointer.C1621) r9
            androidx.compose.ui.platform.飘花落叶言子哲兰苏世楪 r1 = r9.m2987()
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
            java.lang.Object r9 = androidx.compose.foundation.gestures.AbstractC0503.m1265(r1, r2, r8, r9)
            if (r9 != r0) goto L41
            return r0
        L41:
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r9 = (androidx.compose.ui.input.pointer.C1643) r9
            long r6 = r9.f4807
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 < 0) goto L33
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
