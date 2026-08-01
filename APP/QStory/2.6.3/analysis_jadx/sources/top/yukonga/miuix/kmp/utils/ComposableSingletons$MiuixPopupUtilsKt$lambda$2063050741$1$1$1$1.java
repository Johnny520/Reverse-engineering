package top.yukonga.miuix.kmp.utils;

import androidx.compose.ui.input.pointer.InterfaceC1633;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.ComposableSingletons$MiuixPopupUtilsKt$lambda$-2063050741$1$1$1$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.utils.ComposableSingletons$MiuixPopupUtilsKt$lambda$-2063050741$1$1$1$1", f = "MiuixPopupUtils.kt", l = {497}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 3, 0})
final class ComposableSingletons$MiuixPopupUtilsKt$lambda$2063050741$1$1$1$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    private /* synthetic */ Object L$0;
    int label;

    public ComposableSingletons$MiuixPopupUtilsKt$lambda$2063050741$1$1$1$1(InterfaceC4357<? super ComposableSingletons$MiuixPopupUtilsKt$lambda$2063050741$1$1$1$1> interfaceC4357) {
        super(2, interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ComposableSingletons$MiuixPopupUtilsKt$lambda$2063050741$1$1$1$1 composableSingletons$MiuixPopupUtilsKt$lambda$2063050741$1$1$1$1 = new ComposableSingletons$MiuixPopupUtilsKt$lambda$2063050741$1$1$1$1(interfaceC4357);
        composableSingletons$MiuixPopupUtilsKt$lambda$2063050741$1$1$1$1.L$0 = obj;
        return composableSingletons$MiuixPopupUtilsKt$lambda$2063050741$1$1$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ComposableSingletons$MiuixPopupUtilsKt$lambda$2063050741$1$1$1$1) create(interfaceC1633, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[LOOP:0: B:13:0x002f->B:14:0x0031, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:12:0x0026). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r0 = (androidx.compose.ui.input.pointer.InterfaceC1633) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r6.label
            r3 = 1
            if (r2 == 0) goto L18
            if (r2 != r3) goto L11
            kotlin.AbstractC5185.m10210(r7)
            goto L26
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            r6 = 0
            return r6
        L18:
            kotlin.AbstractC5185.m10210(r7)
        L1b:
            r6.L$0 = r0
            r6.label = r3
            java.lang.Object r7 = androidx.compose.ui.input.pointer.InterfaceC1633.m3016(r0, r6)
            if (r7 != r1) goto L26
            return r1
        L26:
            androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世 r7 = (androidx.compose.ui.input.pointer.C1652) r7
            java.util.List r2 = r7.f4852
            int r2 = r2.size()
            r4 = 0
        L2f:
            if (r4 >= r2) goto L1b
            java.util.List r5 = r7.f4852
            java.lang.Object r5 = r5.get(r4)
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r5 = (androidx.compose.ui.input.pointer.C1643) r5
            r5.m3024()
            int r4 = r4 + 1
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.utils.ComposableSingletons$MiuixPopupUtilsKt$lambda$2063050741$1$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
