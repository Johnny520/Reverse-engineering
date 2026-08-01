package kotlin.collections.builders;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC5184;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\f\b\u0000\u0018\u0000 /*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u00010B\u001b\b\u0000\u0012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010\nJ\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010!\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\u001eJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020\u00192\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\u00192\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\b)\u0010(J\u001d\u0010*\u001a\u00020\u00192\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\b*\u0010(R\u001e\u0010\u0007\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010.\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061"}, m151d2 = {"Lkotlin/collections/builders/SetBuilder;", "E", "", "Lkotlin/collections/飘花落叶言子楪苏哲世兰;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/collections/builders/MapBuilder;", "backing", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lkotlin/collections/builders/MapBuilder;)V", "()V", "", "initialCapacity", "(I)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "Lkotlin/飘花落叶言子楪兰苏哲世;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "build", "()Ljava/util/Set;", "", "isEmpty", "()Z", "element", "contains", "(Ljava/lang/Object;)Z", "clear", "add", "remove", "", "iterator", "()Ljava/util/Iterator;", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "removeAll", "retainAll", "Lkotlin/collections/builders/MapBuilder;", "getSize", "()I", "size", "Companion", "kotlin/collections/builders/飘花落叶言子楪哲世苏兰", "kotlin-stdlib"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class SetBuilder<E> extends AbstractC5184 implements Set<E>, Serializable {
    private static final C5151 Companion = new C5151();
    private static final SetBuilder Empty;
    private final MapBuilder<E, ?> backing;

    static {
        MapBuilder.Companion.getClass();
        Empty = new SetBuilder(MapBuilder.Empty);
    }

    public SetBuilder(MapBuilder<E, ?> mapBuilder) {
        mapBuilder.getClass();
        this.backing = mapBuilder;
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.backing.getIsReadOnly()) {
            return new SerializedCollection(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E element) {
        return this.backing.addKey$kotlin_stdlib(element) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        elements.getClass();
        this.backing.checkIsMutable$kotlin_stdlib();
        return super.addAll(elements);
    }

    public final Set<E> build() {
        this.backing.build();
        return size() > 0 ? this : Empty;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.backing.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        return this.backing.containsKey(element);
    }

    @Override // kotlin.collections.AbstractC5184
    public int getSize() {
        return this.backing.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.backing.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.backing.keysIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        return this.backing.removeKey$kotlin_stdlib(element);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> elements) {
        elements.getClass();
        this.backing.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> elements) {
        elements.getClass();
        this.backing.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }

    public SetBuilder() {
        this(new MapBuilder());
    }

    public SetBuilder(int i) {
        this(new MapBuilder(i));
    }
}
