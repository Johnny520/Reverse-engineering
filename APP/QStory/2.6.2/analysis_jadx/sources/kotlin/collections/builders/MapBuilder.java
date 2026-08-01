package kotlin.collections.builders;

import bsh.C2632;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC4329;
import kotlin.collections.C4332;
import kotlin.jvm.internal.AbstractC4394;
import lin.xposed.hook.javaplugin.C5553;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p054.InterfaceC6562;
import p316.C8675;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u000b\b\u0000\u0018\u0000 \u0097\u0001*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\t\u0098\u0001\u0099\u0001GKO\u009a\u0001BG\b\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0013J\u0019\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u001a\u0010\u001f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00028\u0001H\u0016¢\u0006\u0004\b!\u0010\"J%\u0010%\u001a\u00020$2\u0014\u0010#\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010 J\u000f\u0010(\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010\u0011J\u001a\u0010+\u001a\u00020\u00172\b\u0010*\u001a\u0004\u0018\u00010)H\u0096\u0002¢\u0006\u0004\b+\u0010\u001cJ\u000f\u0010,\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u00020$H\u0000¢\u0006\u0004\b1\u0010\u0011J\u0017\u00105\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00028\u0000H\u0000¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00028\u0000H\u0000¢\u0006\u0004\b6\u0010\u001cJ#\u0010<\u001a\u00020\u00172\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000108H\u0000¢\u0006\u0004\b:\u0010;J\u001b\u0010A\u001a\u00020\u00172\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=H\u0000¢\u0006\u0004\b?\u0010@J#\u0010C\u001a\u00020\u00172\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000108H\u0000¢\u0006\u0004\bB\u0010;J\u0017\u0010F\u001a\u00020\u00172\u0006\u0010D\u001a\u00028\u0001H\u0000¢\u0006\u0004\bE\u0010\u001cJ\u001b\u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010GH\u0000¢\u0006\u0004\bH\u0010IJ\u001b\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010KH\u0000¢\u0006\u0004\bL\u0010MJ\u001b\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010OH\u0000¢\u0006\u0004\bP\u0010QJ\u000f\u0010S\u001a\u00020)H\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010W\u001a\u00020$2\u0006\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020$H\u0002¢\u0006\u0004\bY\u0010\u0011J\u0017\u0010[\u001a\u00020$2\u0006\u0010Z\u001a\u00020\fH\u0002¢\u0006\u0004\b[\u0010\u0013J\u0017\u0010]\u001a\u00020\u00172\u0006\u0010\\\u001a\u00020\fH\u0002¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020$2\u0006\u0010_\u001a\u00020\fH\u0002¢\u0006\u0004\b`\u0010\u0013J\u0015\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0002¢\u0006\u0004\ba\u0010bJ\u0017\u0010c\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bc\u00104J\u0017\u0010e\u001a\u00020$2\u0006\u0010d\u001a\u00020\u0017H\u0002¢\u0006\u0004\be\u0010fJ\u0017\u0010h\u001a\u00020$2\u0006\u0010g\u001a\u00020\fH\u0002¢\u0006\u0004\bh\u0010\u0013J\u0017\u0010j\u001a\u00020\u00172\u0006\u0010i\u001a\u00020\fH\u0002¢\u0006\u0004\bj\u0010^J\u0017\u0010k\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bk\u00104J\u0017\u0010l\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00028\u0001H\u0002¢\u0006\u0004\bl\u00104J\u0017\u0010n\u001a\u00020$2\u0006\u0010m\u001a\u00020\fH\u0002¢\u0006\u0004\bn\u0010\u0013J\u0017\u0010p\u001a\u00020$2\u0006\u0010o\u001a\u00020\fH\u0002¢\u0006\u0004\bp\u0010\u0013J\u001f\u0010q\u001a\u00020\u00172\u000e\u0010*\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0014H\u0002¢\u0006\u0004\bq\u0010rJ#\u0010s\u001a\u00020\u00172\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000108H\u0002¢\u0006\u0004\bs\u0010;J)\u0010t\u001a\u00020\u00172\u0018\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001080=H\u0003¢\u0006\u0004\bt\u0010@R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010uR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010uR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010vR\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010vR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010wR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010wR\u0016\u0010x\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010wR\u0016\u0010y\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010wR$\u0010z\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bz\u0010w\u001a\u0004\b{\u0010-R\u001e\u0010}\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R!\u0010\u0080\u0001\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R(\u0010\u0083\u0001\u001a\u0011\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R(\u0010\u0085\u0001\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00178\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010\u0019R\u001e\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0088\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001e\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u008c\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R+\u0010\u0092\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0090\u00010\u0088\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u008a\u0001R\u0016\u0010\u0094\u0001\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010-R\u0016\u0010\u0096\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010-¨\u0006\u009b\u0001"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "keysArray", "valuesArray", "", "presenceArray", "hashArray", "", "maxProbeDistance", "length", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "()V", "initialCapacity", "(I)V", "", "build", "()Ljava/util/Map;", "", "isEmpty", "()Z", "key", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "from", "Lkotlin/飘花落叶言子楪兰苏哲世;", "putAll", "(Ljava/util/Map;)V", "remove", "clear", "", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "checkIsMutable$kotlin_stdlib", "checkIsMutable", "addKey$kotlin_stdlib", "(Ljava/lang/Object;)I", "addKey", "removeKey$kotlin_stdlib", "removeKey", "", "entry", "containsEntry$kotlin_stdlib", "(Ljava/util/Map$Entry;)Z", "containsEntry", "", "m", "containsAllEntries$kotlin_stdlib", "(Ljava/util/Collection;)Z", "containsAllEntries", "removeEntry$kotlin_stdlib", "removeEntry", "element", "removeValue$kotlin_stdlib", "removeValue", "Lkotlin/collections/builders/飘花落叶言子楪世兰哲苏;", "keysIterator$kotlin_stdlib", "()Lkotlin/collections/builders/飘花落叶言子楪世兰哲苏;", "keysIterator", "Lkotlin/collections/builders/飘花落叶言子楪苏世哲兰;", "valuesIterator$kotlin_stdlib", "()Lkotlin/collections/builders/飘花落叶言子楪苏世哲兰;", "valuesIterator", "Lkotlin/collections/builders/飘花落叶言子楪世哲兰苏;", "entriesIterator$kotlin_stdlib", "()Lkotlin/collections/builders/飘花落叶言子楪世哲兰苏;", "entriesIterator", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "readObject", "(Ljava/io/ObjectInputStream;)V", "registerModification", "n", "ensureExtraCapacity", "extraCapacity", "shouldCompact", "(I)Z", "minCapacity", "ensureCapacity", "allocateValuesArray", "()[Ljava/lang/Object;", "hash", "updateHashArray", "compact", "(Z)V", "newHashSize", "rehash", "i", "putRehash", "findKey", "findValue", "index", "removeEntryAt", "removedHash", "removeHashAt", "contentEquals", "(Ljava/util/Map;)Z", "putEntry", "putAllEntries", "[Ljava/lang/Object;", "[I", "I", "hashShift", "modCount", "size", "getSize", "Lkotlin/collections/builders/飘花落叶言子楪苏哲世兰;", "keysView", "Lkotlin/collections/builders/飘花落叶言子楪苏哲世兰;", "Lkotlin/collections/builders/飘花落叶言子楪苏哲兰世;", "valuesView", "Lkotlin/collections/builders/飘花落叶言子楪苏哲兰世;", "Lkotlin/collections/builders/飘花落叶言子楪苏世兰哲;", "entriesView", "Lkotlin/collections/builders/飘花落叶言子楪苏世兰哲;", "isReadOnly", "Z", "isReadOnly$kotlin_stdlib", "", "getKeys", "()Ljava/util/Set;", "keys", "", "getValues", "()Ljava/util/Collection;", "values", "", "getEntries", "entries", "getCapacity$kotlin_stdlib", "capacity", "getHashSize", "hashSize", "Companion", "kotlin/collections/builders/飘花落叶言子楪世哲苏兰", "androidx/core/view/飘花落叶言子世兰楪苏哲", "kotlin/collections/builders/飘花落叶言子楪世兰苏哲", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, InterfaceC6562 {
    public static final C4315 Companion = new C4315();
    private static final MapBuilder Empty;
    private static final int INITIAL_CAPACITY = 8;
    private static final int INITIAL_MAX_PROBE_DISTANCE = 2;
    private static final int MAGIC = -1640531527;
    private static final int TOMBSTONE = -1;
    private C4319 entriesView;
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    private K[] keysArray;
    private C4323 keysView;
    private int length;
    private int maxProbeDistance;
    private int modCount;
    private int[] presenceArray;
    private int size;
    private V[] valuesArray;
    private C4324 valuesView;

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.isReadOnly = true;
        Empty = mapBuilder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MapBuilder(int i) {
        if (i < 0) {
            C5919.m11249("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        Companion.getClass();
        this(objArr, null, iArr, new int[Integer.highestOneBit((i < 1 ? 1 : i) * 3)], 2, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] allocateValuesArray() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
        if (capacity$kotlin_stdlib < 0) {
            C5919.m11249("capacity must be non-negative.");
            return null;
        }
        V[] vArr2 = (V[]) new Object[capacity$kotlin_stdlib];
        this.valuesArray = vArr2;
        return vArr2;
    }

    private final void compact(boolean updateHashArray) {
        int i;
        V[] vArr = this.valuesArray;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.length;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                K[] kArr = this.keysArray;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                if (updateHashArray) {
                    iArr[i3] = i4;
                    this.hashArray[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        C8675.m14344(this.keysArray, i3, i);
        if (vArr != null) {
            C8675.m14344(vArr, i3, this.length);
        }
        this.length = i3;
    }

    private final boolean contentEquals(Map<?, ?> other) {
        return size() == other.size() && containsAllEntries$kotlin_stdlib(other.entrySet());
    }

    private final void ensureCapacity(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        if (minCapacity > getCapacity$kotlin_stdlib()) {
            C4332 c4332 = AbstractC4329.Companion;
            int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
            c4332.getClass();
            int iM8771 = C4332.m8771(capacity$kotlin_stdlib, minCapacity);
            K[] kArr = this.keysArray;
            kArr.getClass();
            this.keysArray = (K[]) Arrays.copyOf(kArr, iM8771);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) Arrays.copyOf(vArr, iM8771) : null;
            this.presenceArray = Arrays.copyOf(this.presenceArray, iM8771);
            Companion.getClass();
            if (iM8771 < 1) {
                iM8771 = 1;
            }
            int iHighestOneBit = Integer.highestOneBit(iM8771 * 3);
            if (iHighestOneBit > getHashSize()) {
                rehash(iHighestOneBit);
            }
        }
    }

    private final void ensureExtraCapacity(int n) {
        if (shouldCompact(n)) {
            compact(true);
        } else {
            ensureCapacity(this.length + n);
        }
    }

    private final int findKey(K key) {
        int iHash = hash(key);
        int i = this.maxProbeDistance;
        while (true) {
            int i2 = this.hashArray[iHash];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (AbstractC4394.m8917(this.keysArray[i3], key)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iHash = iHash == 0 ? getHashSize() - 1 : iHash - 1;
        }
    }

    private final int findValue(V value) {
        int i = this.length;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.presenceArray[i] >= 0) {
                V[] vArr = this.valuesArray;
                vArr.getClass();
                if (AbstractC4394.m8917(vArr[i], value)) {
                    return i;
                }
            }
        }
    }

    private final int getHashSize() {
        return this.hashArray.length;
    }

    private final int hash(K key) {
        return ((key != null ? key.hashCode() : 0) * MAGIC) >>> this.hashShift;
    }

    private final boolean putAllEntries(Collection<? extends Map.Entry<? extends K, ? extends V>> from) {
        boolean z = false;
        if (from.isEmpty()) {
            return false;
        }
        ensureExtraCapacity(from.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = from.iterator();
        while (it.hasNext()) {
            if (putEntry(it.next())) {
                z = true;
            }
        }
        return z;
    }

    private final boolean putEntry(Map.Entry<? extends K, ? extends V> entry) {
        int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
        V[] vArrAllocateValuesArray = allocateValuesArray();
        if (iAddKey$kotlin_stdlib >= 0) {
            vArrAllocateValuesArray[iAddKey$kotlin_stdlib] = entry.getValue();
            return true;
        }
        int i = (-iAddKey$kotlin_stdlib) - 1;
        if (AbstractC4394.m8917(entry.getValue(), vArrAllocateValuesArray[i])) {
            return false;
        }
        vArrAllocateValuesArray[i] = entry.getValue();
        return true;
    }

    private final boolean putRehash(int i) {
        int iHash = hash(this.keysArray[i]);
        int i2 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[iHash] == 0) {
                iArr[iHash] = i + 1;
                this.presenceArray[i] = iHash;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            iHash = iHash == 0 ? getHashSize() - 1 : iHash - 1;
        }
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final void registerModification() {
        this.modCount++;
    }

    private final void rehash(int newHashSize) {
        registerModification();
        int i = 0;
        if (this.length > size()) {
            compact(false);
        }
        this.hashArray = new int[newHashSize];
        Companion.getClass();
        this.hashShift = Integer.numberOfLeadingZeros(newHashSize) + 1;
        while (i < this.length) {
            int i2 = i + 1;
            if (!putRehash(i)) {
                C5919.m11250("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                return;
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeEntryAt(int index) {
        K[] kArr = this.keysArray;
        kArr.getClass();
        kArr[index] = null;
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            vArr[index] = null;
        }
        removeHashAt(this.presenceArray[index]);
        this.presenceArray[index] = -1;
        this.size = size() - 1;
        registerModification();
    }

    private final void removeHashAt(int removedHash) {
        int i;
        int i2;
        while (true) {
            int i3 = removedHash;
            int i4 = 0;
            do {
                removedHash = removedHash == 0 ? getHashSize() - 1 : removedHash - 1;
                int[] iArr = this.hashArray;
                i = iArr[removedHash];
                i4++;
                if (i4 > this.maxProbeDistance) {
                    iArr[i3] = 0;
                    return;
                } else {
                    if (i == 0) {
                        iArr[i3] = 0;
                        return;
                    }
                    i2 = i - 1;
                }
            } while (((hash(this.keysArray[i2]) - removedHash) & (getHashSize() - 1)) < i4);
            this.hashArray[i3] = i;
            this.presenceArray[i2] = i3;
        }
    }

    private final boolean shouldCompact(int extraCapacity) {
        int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
        int i = this.length;
        int i2 = capacity$kotlin_stdlib - i;
        int size = i - size();
        return i2 < extraCapacity && i2 + size >= extraCapacity && size >= getCapacity$kotlin_stdlib() / 4;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int addKey$kotlin_stdlib(K key) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int iHash = hash(key);
            int i = this.maxProbeDistance * 2;
            int hashSize = getHashSize() / 2;
            if (i > hashSize) {
                i = hashSize;
            }
            int i2 = 0;
            while (true) {
                int i3 = this.hashArray[iHash];
                if (i3 == 0) {
                    if (this.length < getCapacity$kotlin_stdlib()) {
                        int i4 = this.length;
                        int i5 = i4 + 1;
                        this.length = i5;
                        this.keysArray[i4] = key;
                        this.presenceArray[i4] = iHash;
                        this.hashArray[iHash] = i5;
                        this.size = size() + 1;
                        registerModification();
                        if (i2 > this.maxProbeDistance) {
                            this.maxProbeDistance = i2;
                        }
                        return i4;
                    }
                    ensureExtraCapacity(1);
                } else {
                    if (AbstractC4394.m8917(this.keysArray[i3 - 1], key)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        rehash(getHashSize() * 2);
                        break;
                    }
                    iHash = iHash == 0 ? getHashSize() - 1 : iHash - 1;
                }
            }
        }
    }

    public final Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        MapBuilder mapBuilder = Empty;
        mapBuilder.getClass();
        return mapBuilder;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly) {
            C5553.m10825();
        }
    }

    @Override // java.util.Map
    public void clear() {
        checkIsMutable$kotlin_stdlib();
        int i = this.length - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.hashArray[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        C8675.m14344(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            C8675.m14344(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        registerModification();
    }

    public final boolean containsAllEntries$kotlin_stdlib(Collection<?> m) {
        m.getClass();
        for (Object obj : m) {
            if (obj != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        entry.getClass();
        int iFindKey = findKey(entry.getKey());
        if (iFindKey < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        vArr.getClass();
        return AbstractC4394.m8917(vArr[iFindKey], entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return findKey(key) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return findValue(value) >= 0;
    }

    public final C4314 entriesIterator$kotlin_stdlib() {
        return new C4314(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof Map) && contentEquals((Map) other);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object key) {
        int iFindKey = findKey(key);
        if (iFindKey < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        vArr.getClass();
        return vArr[iFindKey];
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.keysArray.length;
    }

    public Set<Map.Entry<K, V>> getEntries() {
        C4319 c4319 = this.entriesView;
        if (c4319 != null) {
            return c4319;
        }
        C4319 c43192 = new C4319(this);
        this.entriesView = c43192;
        return c43192;
    }

    public Set<K> getKeys() {
        C4323 c4323 = this.keysView;
        if (c4323 != null) {
            return c4323;
        }
        C4323 c43232 = new C4323(this);
        this.keysView = c43232;
        return c43232;
    }

    public int getSize() {
        return this.size;
    }

    public Collection<V> getValues() {
        C4324 c4324 = this.valuesView;
        if (c4324 != null) {
            return c4324;
        }
        C4324 c43242 = new C4324(this);
        this.valuesView = c43242;
        return c43242;
    }

    @Override // java.util.Map
    public int hashCode() {
        C4314 c4314EntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (c4314EntriesIterator$kotlin_stdlib.hasNext()) {
            int i2 = c4314EntriesIterator$kotlin_stdlib.f6466;
            MapBuilder mapBuilder = (MapBuilder) c4314EntriesIterator$kotlin_stdlib.f6463;
            if (i2 >= mapBuilder.length) {
                C2632.m5291();
                return 0;
            }
            int i3 = c4314EntriesIterator$kotlin_stdlib.f6466;
            c4314EntriesIterator$kotlin_stdlib.f6466 = i3 + 1;
            c4314EntriesIterator$kotlin_stdlib.f6464 = i3;
            Object obj = mapBuilder.keysArray[c4314EntriesIterator$kotlin_stdlib.f6464];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = mapBuilder.valuesArray;
            objArr.getClass();
            Object obj2 = objArr[c4314EntriesIterator$kotlin_stdlib.f6464];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c4314EntriesIterator$kotlin_stdlib.m3987();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: isReadOnly$kotlin_stdlib, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    public final C4312 keysIterator$kotlin_stdlib() {
        return new C4312(this);
    }

    @Override // java.util.Map
    public V put(K key, V value) {
        checkIsMutable$kotlin_stdlib();
        int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(key);
        V[] vArrAllocateValuesArray = allocateValuesArray();
        if (iAddKey$kotlin_stdlib >= 0) {
            vArrAllocateValuesArray[iAddKey$kotlin_stdlib] = value;
            return null;
        }
        int i = (-iAddKey$kotlin_stdlib) - 1;
        V v = vArrAllocateValuesArray[i];
        vArrAllocateValuesArray[i] = value;
        return v;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        from.getClass();
        checkIsMutable$kotlin_stdlib();
        putAllEntries(from.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object key) {
        checkIsMutable$kotlin_stdlib();
        int iFindKey = findKey(key);
        if (iFindKey < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        vArr.getClass();
        V v = vArr[iFindKey];
        removeEntryAt(iFindKey);
        return v;
    }

    public final boolean removeEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        entry.getClass();
        checkIsMutable$kotlin_stdlib();
        int iFindKey = findKey(entry.getKey());
        if (iFindKey < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        vArr.getClass();
        if (!AbstractC4394.m8917(vArr[iFindKey], entry.getValue())) {
            return false;
        }
        removeEntryAt(iFindKey);
        return true;
    }

    public final boolean removeKey$kotlin_stdlib(K key) {
        checkIsMutable$kotlin_stdlib();
        int iFindKey = findKey(key);
        if (iFindKey < 0) {
            return false;
        }
        removeEntryAt(iFindKey);
        return true;
    }

    public final boolean removeValue$kotlin_stdlib(V element) {
        checkIsMutable$kotlin_stdlib();
        int iFindValue = findValue(element);
        if (iFindValue < 0) {
            return false;
        }
        removeEntryAt(iFindValue);
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        C4314 c4314EntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (c4314EntriesIterator$kotlin_stdlib.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = c4314EntriesIterator$kotlin_stdlib.f6466;
            MapBuilder mapBuilder = (MapBuilder) c4314EntriesIterator$kotlin_stdlib.f6463;
            if (i2 >= mapBuilder.length) {
                C2632.m5291();
                return null;
            }
            int i3 = c4314EntriesIterator$kotlin_stdlib.f6466;
            c4314EntriesIterator$kotlin_stdlib.f6466 = i3 + 1;
            c4314EntriesIterator$kotlin_stdlib.f6464 = i3;
            Object obj = mapBuilder.keysArray[c4314EntriesIterator$kotlin_stdlib.f6464];
            if (obj == mapBuilder) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append(SignatureVisitor.INSTANCEOF);
            Object[] objArr = mapBuilder.valuesArray;
            objArr.getClass();
            Object obj2 = objArr[c4314EntriesIterator$kotlin_stdlib.f6464];
            if (obj2 == mapBuilder) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c4314EntriesIterator$kotlin_stdlib.m3987();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public final C4320 valuesIterator$kotlin_stdlib() {
        return new C4320(this);
    }

    public MapBuilder() {
        this(8);
    }

    private MapBuilder(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i;
        this.length = i2;
        C4315 c4315 = Companion;
        int hashSize = getHashSize();
        c4315.getClass();
        this.hashShift = Integer.numberOfLeadingZeros(hashSize) + 1;
    }
}
