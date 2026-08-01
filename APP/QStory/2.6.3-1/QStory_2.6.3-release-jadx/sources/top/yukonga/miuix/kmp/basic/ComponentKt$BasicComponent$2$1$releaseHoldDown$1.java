package top.yukonga.miuix.kmp.basic;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.ComponentKt$BasicComponent$2$1", m556f = "Component.kt", m557l = {137}, m558m = "invokeSuspend$releaseHoldDown", m559v = 2)
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 48)
public final class ComponentKt$BasicComponent$2$1$releaseHoldDown$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ComponentKt$BasicComponent$2$1$releaseHoldDown$1(InterfaceC5189<? super ComponentKt$BasicComponent$2$1$releaseHoldDown$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ComponentKt$BasicComponent$2$1.invokeSuspend$releaseHoldDown(null, null, this);
    }
}
