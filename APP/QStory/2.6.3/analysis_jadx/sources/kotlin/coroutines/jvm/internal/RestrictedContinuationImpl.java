package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import net.bytebuddy.description.method.MethodDescription;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "", "completion", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V", "Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "getContext", "()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "context", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    public RestrictedContinuationImpl(InterfaceC4357<Object> interfaceC4357) {
        super(interfaceC4357);
        if (interfaceC4357 == null || interfaceC4357.getContext() == EmptyCoroutineContext.INSTANCE) {
            return;
        }
        C5925.m11310("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.InterfaceC4357
    public InterfaceC4360 getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }
}
