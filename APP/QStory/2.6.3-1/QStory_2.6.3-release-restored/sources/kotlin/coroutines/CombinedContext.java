package kotlin.coroutines;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.C1898;
import androidx.compose.foundation.lazy.C1594;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$IntRef;
import net.bytebuddy.description.method.MethodDescription;
import p068.InterfaceC7383;
import p332.C9496;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u00011B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0019\u001a\u00020\u00182\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001b*\u00020\u00052\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010 2\u0006\u0010!\u001a\u00028\u00002\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00012\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0016¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010\u000bJ\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100¨\u00062"}, m151d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;", "element", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;)V", "", "size", "()I", "", "contains", "(Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;)Z", "context", "containsAll", "(Lkotlin/coroutines/CombinedContext;)Z", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "input", "Lkotlin/飘花落叶言子楪兰苏哲世;", "readObject", "(Ljava/io/ObjectInputStream;)V", "E", "Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;", "key", "get", "(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Ljava/lang/Object;", "minusKey", "(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;", "Serialized", "kotlin-stdlib"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class CombinedContext implements InterfaceC5192, Serializable {
    private final InterfaceC5186 element;
    private final InterfaceC5192 left;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0002\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000fB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m151d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "elements", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "([Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V", "", "readResolve", "()Ljava/lang/Object;", "[Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "getElements", "()[Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "Companion", "kotlin/coroutines/飘花落叶言子楪世苏兰哲", "kotlin-stdlib"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
    public static final class Serialized implements Serializable {
        public static final C5190 Companion = new C5190();
        private static final long serialVersionUID = 0;
        private final InterfaceC5192[] elements;

        public Serialized(InterfaceC5192[] interfaceC5192Arr) {
            interfaceC5192Arr.getClass();
            this.elements = interfaceC5192Arr;
        }

        private final Object readResolve() {
            InterfaceC5192[] interfaceC5192Arr = this.elements;
            InterfaceC5192 interfaceC5192Plus = EmptyCoroutineContext.INSTANCE;
            for (InterfaceC5192 interfaceC5192 : interfaceC5192Arr) {
                interfaceC5192Plus = interfaceC5192Plus.plus(interfaceC5192);
            }
            return interfaceC5192Plus;
        }

        public final InterfaceC5192[] getElements() {
            return this.elements;
        }
    }

    public CombinedContext(InterfaceC5192 interfaceC5192, InterfaceC5186 interfaceC5186) {
        interfaceC5192.getClass();
        interfaceC5186.getClass();
        this.left = interfaceC5192;
        this.element = interfaceC5186;
    }

    private final boolean contains(InterfaceC5186 element) {
        return AbstractC5227.m9466(get(element.getKey()), element);
    }

    private final boolean containsAll(CombinedContext context) {
        while (contains(context.element)) {
            InterfaceC5192 interfaceC5192 = context.left;
            if (!(interfaceC5192 instanceof CombinedContext)) {
                interfaceC5192.getClass();
                return contains((InterfaceC5186) interfaceC5192);
            }
            context = (CombinedContext) interfaceC5192;
        }
        return false;
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final int size() {
        int i = 2;
        while (true) {
            InterfaceC5192 interfaceC5192 = this.left;
            this = interfaceC5192 instanceof CombinedContext ? (CombinedContext) interfaceC5192 : null;
            if (this == null) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toString$lambda$0(String str, InterfaceC5186 interfaceC5186) {
        str.getClass();
        interfaceC5186.getClass();
        if (str.length() == 0) {
            return interfaceC5186.toString();
        }
        return str + ", " + interfaceC5186;
    }

    private final Object writeReplace() {
        int size = size();
        InterfaceC5192[] interfaceC5192Arr = new InterfaceC5192[size];
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        fold(C6008.f15084, new C1898(interfaceC5192Arr, 7, ref$IntRef));
        if (ref$IntRef.element == size) {
            return new Serialized(interfaceC5192Arr);
        }
        C6755.m11870("Check failed.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 writeReplace$lambda$0(InterfaceC5192[] interfaceC5192Arr, Ref$IntRef ref$IntRef, C6008 c6008, InterfaceC5186 interfaceC5186) {
        c6008.getClass();
        interfaceC5186.getClass();
        int i = ref$IntRef.element;
        ref$IntRef.element = i + 1;
        interfaceC5192Arr[i] = interfaceC5186;
        return C6008.f15084;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CombinedContext)) {
            return false;
        }
        CombinedContext combinedContext = (CombinedContext) other;
        return combinedContext.size() == size() && combinedContext.containsAll(this);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public <R> R fold(R initial, InterfaceC7383 operation) {
        operation.getClass();
        return (R) operation.invoke(this.left.fold(initial, operation), this.element);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public <E extends InterfaceC5186> E get(InterfaceC5193 key) {
        key.getClass();
        while (true) {
            E e = (E) this.element.get(key);
            if (e != null) {
                return e;
            }
            InterfaceC5192 interfaceC5192 = this.left;
            if (!(interfaceC5192 instanceof CombinedContext)) {
                return (E) interfaceC5192.get(key);
            }
            this = (CombinedContext) interfaceC5192;
        }
    }

    public int hashCode() {
        return this.element.hashCode() + this.left.hashCode();
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public InterfaceC5192 minusKey(InterfaceC5193 key) {
        key.getClass();
        InterfaceC5186 interfaceC5186 = this.element.get(key);
        InterfaceC5192 interfaceC5192 = this.left;
        if (interfaceC5186 != null) {
            return interfaceC5192;
        }
        InterfaceC5192 interfaceC5192MinusKey = interfaceC5192.minusKey(key);
        if (interfaceC5192MinusKey == this.left) {
            return this;
        }
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        InterfaceC5186 interfaceC51862 = this.element;
        return interfaceC5192MinusKey == emptyCoroutineContext ? interfaceC51862 : new CombinedContext(interfaceC5192MinusKey, interfaceC51862);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public /* bridge */ InterfaceC5192 plus(InterfaceC5192 interfaceC5192) {
        return C9496.m14924(this, interfaceC5192);
    }

    public String toString() {
        return AbstractC0900.m708(new StringBuilder("["), (String) fold("", new C1594(15)), ']');
    }
}
