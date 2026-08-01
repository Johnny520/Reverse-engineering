package io.ktor.utils.p007io;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;
import p110.C8034;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", m556f = "ByteReadChannelOperations.jvm.kt", m557l = {107}, m558m = "skipDelimiter")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class ByteReadChannelOperations_jvmKt$skipDelimiter$2 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperations_jvmKt$skipDelimiter$2(InterfaceC5189<? super ByteReadChannelOperations_jvmKt$skipDelimiter$2> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i2 = this.I$1;
        int i3 = this.I$0;
        C8034 c8034 = (C8034) this.L$1;
        InterfaceC5084 interfaceC5084 = (InterfaceC5084) this.L$0;
        AbstractC6017.m10769(obj);
        while (((Number) obj).byteValue() == c8034.m12999(i3)) {
            i3++;
            if (i3 >= i2) {
                return C6008.f15084;
            }
            this.L$0 = interfaceC5084;
            this.L$1 = c8034;
            this.I$0 = i3;
            this.I$1 = i2;
            this.label = 1;
            obj = AbstractC5076.m9239(interfaceC5084, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        C6755.m11870("Delimiter is not found");
        return null;
    }
}
