package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.C4355;
import kotlin.coroutines.InterfaceC4353;
import kotlin.coroutines.InterfaceC4354;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import net.bytebuddy.description.method.MethodDescription;
import p063.C6863;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "", "completion", "Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "_context", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V", "(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V", "intercepted", "()Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "releaseIntercepted", "()V", "Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "getContext", "()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "context", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final InterfaceC4359 _context;
    private transient InterfaceC4356<Object> intercepted;

    public ContinuationImpl(InterfaceC4356<Object> interfaceC4356) {
        this(interfaceC4356, interfaceC4356 != null ? interfaceC4356.getContext() : null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.InterfaceC4356
    public InterfaceC4359 getContext() {
        InterfaceC4359 interfaceC4359 = this._context;
        interfaceC4359.getClass();
        return interfaceC4359;
    }

    public final InterfaceC4356<Object> intercepted() {
        InterfaceC4356 interfaceC4356Mo8481 = this.intercepted;
        if (interfaceC4356Mo8481 == null) {
            InterfaceC4354 interfaceC4354 = (InterfaceC4354) getContext().get(C4355.f12932);
            interfaceC4356Mo8481 = interfaceC4354 != null ? interfaceC4354.mo8481(this) : this;
            this.intercepted = interfaceC4356Mo8481;
        }
        return interfaceC4356Mo8481;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        InterfaceC4356<Object> interfaceC4356 = this.intercepted;
        if (interfaceC4356 != null && interfaceC4356 != this) {
            InterfaceC4353 interfaceC4353 = getContext().get(C4355.f12932);
            interfaceC4353.getClass();
            ((InterfaceC4354) interfaceC4353).mo8482(interfaceC4356);
        }
        this.intercepted = C6863.f18310;
    }

    public ContinuationImpl(InterfaceC4356<Object> interfaceC4356, InterfaceC4359 interfaceC4359) {
        super(interfaceC4356);
        this._context = interfaceC4359;
    }
}
