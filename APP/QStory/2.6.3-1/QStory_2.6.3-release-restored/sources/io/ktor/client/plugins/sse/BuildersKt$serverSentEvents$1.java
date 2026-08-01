package io.ktor.client.plugins.sse;

import androidx.activity.AbstractC0900;
import io.ktor.client.plugins.AbstractC4770;
import io.ktor.util.C5041;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.sse.BuildersKt", m556f = "builders.kt", m557l = {105, 107}, m558m = "serverSentEvents-mY9Nd3A")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class BuildersKt$serverSentEvents$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public BuildersKt$serverSentEvents$1(InterfaceC5189<? super BuildersKt$serverSentEvents$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        C5041 c5041 = AbstractC4739.f12463;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            this.L$0 = null;
            this.label = 1;
            InterfaceC9970 interfaceC9970 = AbstractC4734.f12448;
            int i3 = AbstractC4770.f12498;
            throw null;
        }
        try {
            if (i2 == 1) {
                InterfaceC7383 interfaceC7383 = (InterfaceC7383) this.L$0;
                AbstractC6017.m10769(obj);
                AbstractC0900.m697(obj);
                this.L$0 = null;
                this.label = 2;
                if (interfaceC7383.invoke(null, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0900.m697(this.L$0);
                AbstractC6017.m10769(obj);
            }
            AbstractC6231.m11068(null, null);
            throw null;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
