package top.suzhelan.qstory.hook.item;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.qstory.hook.item.NewAutoGrabHb", m556f = "NewAutoGrabHb.kt", m557l = {373}, m558m = "onGrabSuccess", m559v = 2)
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 50)
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
    final /* synthetic */ C6784 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewAutoGrabHb$onGrabSuccess$1(C6784 c6784, InterfaceC5189<? super NewAutoGrabHb$onGrabSuccess$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c6784;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m11888(null, null, null, 0, this);
    }
}
