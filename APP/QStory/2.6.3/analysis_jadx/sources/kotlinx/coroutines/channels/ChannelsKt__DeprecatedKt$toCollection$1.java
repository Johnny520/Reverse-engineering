package kotlinx.coroutines.channels;

import java.util.Collection;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {667}, m = "toCollection", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class ChannelsKt__DeprecatedKt$toCollection$1<E, C extends Collection<? super E>> extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$toCollection$1(InterfaceC4357<? super ChannelsKt__DeprecatedKt$toCollection$1> interfaceC4357) {
        super(interfaceC4357);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.Collection] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new ChannelsKt__DeprecatedKt$toCollection$1<>(this);
        }
        Object objM10264 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        InterfaceC5199 interfaceC5199 = null;
        if (i2 == 0) {
            AbstractC5185.m10210(objM10264);
            try {
                throw null;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i2 != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.I$2;
            int i4 = this.I$1;
            int i5 = this.I$0;
            ?? r6 = (InterfaceC5212) this.L$5;
            InterfaceC5199 interfaceC51992 = (InterfaceC5199) this.L$3;
            ?? r8 = (Collection) this.L$1;
            try {
                AbstractC5185.m10210(objM10264);
                while (((Boolean) objM10264).booleanValue()) {
                    r6 = (C5191) r6;
                    r8.add(r6.m10262());
                    this.L$0 = null;
                    this.L$1 = r8;
                    this.L$2 = null;
                    this.L$3 = interfaceC51992;
                    this.L$4 = null;
                    this.L$5 = r6;
                    this.I$0 = i5;
                    this.I$1 = i4;
                    this.I$2 = i3;
                    this.label = 1;
                    objM10264 = r6.m10264(this);
                    if (objM10264 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                interfaceC51992.mo10256(null);
                return r8;
            } catch (Throwable th2) {
                th = th2;
                interfaceC5199 = interfaceC51992;
            }
        }
        try {
            throw th;
        } catch (Throwable th3) {
            AbstractC5205.m10278(interfaceC5199, th);
            throw th3;
        }
    }
}
