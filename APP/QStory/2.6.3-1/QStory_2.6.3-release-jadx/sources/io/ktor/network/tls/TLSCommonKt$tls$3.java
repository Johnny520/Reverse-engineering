package io.ktor.network.tls;

import io.ktor.network.sockets.C4858;
import io.ktor.network.sockets.InterfaceC4854;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5081;
import java.io.IOException;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.network.tls.TLSCommonKt", m556f = "TLSCommon.kt", m557l = {39}, m558m = "tls")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class TLSCommonKt$tls$3 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public TLSCommonKt$tls$3(InterfaceC5189<? super TLSCommonKt$tls$3> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        if (this instanceof TLSCommonKt$tls$3) {
            int i = this.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                this.label = i - Integer.MIN_VALUE;
            } else {
                this = new TLSCommonKt$tls$3(this);
            }
        }
        Object objM9000 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        C4858 c4858 = null;
        try {
            if (i2 == 0) {
                AbstractC6017.m10769(objM9000);
                InterfaceC4854 interfaceC4854 = c4858.f12637;
                C5081 c5081 = c4858.f12636;
                C5081 c50812 = c4858.f12635;
                this.L$0 = null;
                this.label = 1;
                objM9000 = AbstractC4867.m9000(interfaceC4854, c5081, c50812, null, this);
                if (objM9000 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c4858 = (C4858) this.L$0;
                AbstractC6017.m10769(objM9000);
            }
            return (InterfaceC4854) objM9000;
        } catch (Throwable th) {
            c4858.f12636.mo9204(th);
            AbstractC5078.m9251(c4858.f12635, th);
            c4858.f12637.close();
            throw th;
        }
    }
}
