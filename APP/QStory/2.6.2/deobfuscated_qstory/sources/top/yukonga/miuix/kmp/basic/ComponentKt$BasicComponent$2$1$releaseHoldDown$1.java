package top.yukonga.miuix.kmp.basic;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.basic.ComponentKt$BasicComponent$2$1", f = "Component.kt", l = {137}, m = "invokeSuspend$releaseHoldDown", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class ComponentKt$BasicComponent$2$1$releaseHoldDown$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ComponentKt$BasicComponent$2$1$releaseHoldDown$1(InterfaceC4356<? super ComponentKt$BasicComponent$2$1$releaseHoldDown$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ComponentKt$BasicComponent$2$1.invokeSuspend$releaseHoldDown(null, null, this);
    }
}
