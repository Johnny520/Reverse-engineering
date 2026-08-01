package kotlin;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import p052.InterfaceC6542;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u0000 \u001f*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001 B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u0012\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000b¨\u0006!"}, d2 = {"Lkotlin/SafePublicationLazyImpl;", "T", "Lkotlin/飘花落叶言子楪苏世哲兰;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "Lkotlin/飘花落叶言子楪兰苏哲世;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "isInitialized", "()Z", "", "toString", "()Ljava/lang/String;", "L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;", "_value", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, "final", "getFinal$annotations", "()V", "getValue", "value", "Companion", "kotlin/飘花落叶言子楪苏兰哲世", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class SafePublicationLazyImpl<T> implements InterfaceC5183, Serializable {
    public static final C5185 Companion = new C5185();
    private static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> valueUpdater = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
    private volatile Object _value;
    private final Object final;
    private volatile InterfaceC6542 initializer;

    public SafePublicationLazyImpl(InterfaceC6542 interfaceC6542) {
        interfaceC6542.getClass();
        this.initializer = interfaceC6542;
        C5173 c5173 = C5173.f14737;
        this._value = c5173;
        this.final = c5173;
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.InterfaceC5183
    public T getValue() {
        ?? r0 = this._value;
        C5173 c5173 = C5173.f14737;
        if (r0 != c5173) {
            return r0;
        }
        InterfaceC6542 interfaceC6542 = this.initializer;
        if (interfaceC6542 != null) {
            T t = (T) interfaceC6542.invoke();
            AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> atomicReferenceFieldUpdater = valueUpdater;
            while (!atomicReferenceFieldUpdater.compareAndSet((SafePublicationLazyImpl<?>) this, c5173, t)) {
                if (atomicReferenceFieldUpdater.get((SafePublicationLazyImpl<?>) this) != c5173) {
                }
            }
            this.initializer = null;
            return t;
        }
        return this._value;
    }

    @Override // kotlin.InterfaceC5183
    public boolean isInitialized() {
        return this._value != C5173.f14737;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    private static /* synthetic */ void getFinal$annotations() {
    }
}
