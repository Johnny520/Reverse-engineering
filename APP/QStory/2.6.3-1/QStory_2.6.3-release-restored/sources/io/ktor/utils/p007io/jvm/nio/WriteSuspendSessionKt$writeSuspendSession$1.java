package io.ktor.utils.p007io.jvm.nio;

import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import java.nio.ByteBuffer;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt", m556f = "WriteSuspendSession.kt", m557l = {43, 45, 45}, m558m = "writeSuspendSession")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class WriteSuspendSessionKt$writeSuspendSession$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public WriteSuspendSessionKt$writeSuspendSession$1(InterfaceC5189<? super WriteSuspendSessionKt$writeSuspendSession$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (((io.ktor.utils.p007io.C5081) r1).m9259(r6) == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new WriteSuspendSessionKt$writeSuspendSession$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        InterfaceC5079 interfaceC5079 = null;
        if (i2 != 0) {
            if (i2 == 1) {
                InterfaceC5079 interfaceC50792 = (InterfaceC5079) this.L$0;
                try {
                    AbstractC6017.m10769(obj2);
                    this.L$0 = null;
                    this.label = 2;
                } catch (Throwable th) {
                    th = th;
                    interfaceC5079 = interfaceC50792;
                    this.L$0 = th;
                    this.label = 3;
                    if (((C5081) interfaceC5079).m9259(this) != coroutineSingletons) {
                    }
                }
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th2 = (Throwable) this.L$0;
                    AbstractC6017.m10769(obj2);
                    throw th2;
                }
                AbstractC6017.m10769(obj2);
            }
            return C6008.f15084;
        }
        AbstractC6017.m10769(obj2);
        try {
            interfaceC5079.getClass();
            ByteBuffer.allocate(8192);
            throw null;
        } catch (Throwable th3) {
            th = th3;
        }
        this.L$0 = th;
        this.label = 3;
        if (((C5081) interfaceC5079).m9259(this) != coroutineSingletons) {
            throw th;
        }
        return coroutineSingletons;
    }
}
