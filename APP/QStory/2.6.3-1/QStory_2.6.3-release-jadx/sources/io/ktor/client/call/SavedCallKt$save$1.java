package io.ktor.client.call;

import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.p010io.AbstractC6310;
import kotlinx.p010io.InterfaceC6313;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.call.SavedCallKt", m556f = "SavedCall.kt", m557l = {72}, m558m = "save")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class SavedCallKt$save$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public SavedCallKt$save$1(InterfaceC5189<? super SavedCallKt$save$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        if (this instanceof SavedCallKt$save$1) {
            int i = this.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                this.label = i - Integer.MIN_VALUE;
            } else {
                this = new SavedCallKt$save$1(this);
            }
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        C4700 c4700 = null;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            c4700.m8809();
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C4700 c47002 = (C4700) this.L$0;
        AbstractC6017.m10769(obj2);
        AbstractC6310.m11190((InterfaceC6313) obj2);
        c47002.getClass();
        c47002.m8810();
        throw null;
    }
}
