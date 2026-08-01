package top.suzhelan.qstory.hook.item;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.suzhelan.qstory.hook.item.NewAutoGrabHb", f = "NewAutoGrabHb.kt", l = {373}, m = "onGrabSuccess", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = 50)
final class NewAutoGrabHb$onGrabSuccess$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$16;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5951 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewAutoGrabHb$onGrabSuccess$1(C5951 c5951, InterfaceC4356<? super NewAutoGrabHb$onGrabSuccess$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c5951;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m11269(null, null, null, 0, this);
    }
}
