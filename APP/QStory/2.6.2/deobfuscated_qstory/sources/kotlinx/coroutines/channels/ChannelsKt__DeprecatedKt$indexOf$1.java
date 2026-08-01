package kotlinx.coroutines.channels;

import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$IntRef;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {667}, m = "indexOf", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class ChannelsKt__DeprecatedKt$indexOf$1<E> extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$indexOf$1(InterfaceC4356<? super ChannelsKt__DeprecatedKt$indexOf$1> interfaceC4356) {
        super(interfaceC4356);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new ChannelsKt__DeprecatedKt$indexOf$1<>(this);
        }
        Object objM10260 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        InterfaceC5198 interfaceC5198 = null;
        if (i2 == 0) {
            AbstractC5184.m10206(objM10260);
            new Ref$IntRef();
            try {
                throw null;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i2 != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.I$2;
            int i4 = this.I$1;
            int i5 = this.I$0;
            ?? r6 = (InterfaceC5211) this.L$6;
            InterfaceC5198 interfaceC51982 = (InterfaceC5198) this.L$4;
            Ref$IntRef ref$IntRef = (Ref$IntRef) this.L$2;
            Object obj2 = this.L$1;
            try {
                AbstractC5184.m10206(objM10260);
                while (((Boolean) objM10260).booleanValue()) {
                    r6 = (C5190) r6;
                    if (AbstractC4394.m8917(obj2, r6.m10258())) {
                        Integer num = new Integer(ref$IntRef.element);
                        interfaceC51982.mo10252(null);
                        return num;
                    }
                    ref$IntRef.element++;
                    this.L$0 = null;
                    this.L$1 = obj2;
                    this.L$2 = ref$IntRef;
                    this.L$3 = null;
                    this.L$4 = interfaceC51982;
                    this.L$5 = null;
                    this.L$6 = r6;
                    this.I$0 = i5;
                    this.I$1 = i4;
                    this.I$2 = i3;
                    this.label = 1;
                    objM10260 = r6.m10260(this);
                    if (objM10260 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                interfaceC51982.mo10252(null);
                return new Integer(-1);
            } catch (Throwable th2) {
                th = th2;
                interfaceC5198 = interfaceC51982;
            }
        }
        try {
            throw th;
        } catch (Throwable th3) {
            AbstractC5204.m10274(interfaceC5198, th);
            throw th3;
        }
    }
}
