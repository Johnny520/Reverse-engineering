package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", l = {34}, m = "whileSelect", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
final class WhileSelectKt$whileSelect$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public WhileSelectKt$whileSelect$1(InterfaceC4357<? super WhileSelectKt$whileSelect$1> interfaceC4357) {
        super(interfaceC4357);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0048 -> B:12:0x004b). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            r7.result = r8
            int r0 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r7.label = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L27
            if (r0 != r3) goto L21
            int r0 = r7.I$0
            java.lang.Object r5 = r7.L$1
            kotlinx.coroutines.selects.飘花落叶言子楪世兰苏哲 r5 = (kotlinx.coroutines.selects.C5369) r5
            java.lang.Object r5 = r7.L$0
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r5 = (p052.InterfaceC6558) r5
            kotlin.AbstractC5185.m10210(r8)
            goto L4b
        L21:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            return r2
        L27:
            kotlin.AbstractC5185.m10210(r8)
            r5 = r2
            r0 = r4
        L2c:
            kotlinx.coroutines.selects.飘花落叶言子楪世兰苏哲 r8 = new kotlinx.coroutines.selects.飘花落叶言子楪世兰苏哲
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r6 = r7.getContext()
            r8.<init>(r6)
            r5.invoke(r8)
            r7.L$0 = r5
            r7.L$1 = r2
            r7.I$0 = r0
            r7.I$1 = r4
            r7.I$2 = r4
            r7.label = r3
            java.lang.Object r8 = r8.m10419(r7)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L2c
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5176.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
