package kotlin;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import p052.InterfaceC6542;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001d"}, d2 = {"Lkotlin/UnsafeLazyImpl;", "T", "Lkotlin/飘花落叶言子楪苏世哲兰;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "input", "Lkotlin/飘花落叶言子楪兰苏哲世;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "isInitialized", "()Z", "", "toString", "()Ljava/lang/String;", "L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;", "_value", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, "getValue", "value", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UnsafeLazyImpl<T> implements InterfaceC5183, Serializable {
    private Object _value;
    private InterfaceC6542 initializer;

    public UnsafeLazyImpl(InterfaceC6542 interfaceC6542) {
        interfaceC6542.getClass();
        this.initializer = interfaceC6542;
        this._value = C5173.f14737;
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.InterfaceC5183
    public T getValue() {
        if (this._value == C5173.f14737) {
            InterfaceC6542 interfaceC6542 = this.initializer;
            interfaceC6542.getClass();
            this._value = interfaceC6542.invoke();
            this.initializer = null;
        }
        return (T) this._value;
    }

    @Override // kotlin.InterfaceC5183
    public boolean isInitialized() {
        return this._value != C5173.f14737;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
