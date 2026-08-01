package org.luckypray.dexkit.result;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.exceptions.NoResultException;
import org.luckypray.dexkit.exceptions.NonUniqueResultException;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u00020\u0004B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0017\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\r\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\r\u0010\u0012J\r\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u000eJ!\u0010\u0013\u001a\u00028\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u001b\u0010\u0017\u001a\u00028\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0019\u0010\u000eJ#\u0010\u0019\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0019\u0010\u0012J\r\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u000eJ!\u0010\u001a\u001a\u00028\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u001a\u0010\u0012J\u001b\u0010\u001b\u001a\u00028\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lorg/luckypray/dexkit/result/BaseDataList;", "T", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "firstOrNull", "()Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/Object;", "first", "Lkotlin/Function0;", "", "exceptionSupplier", "firstOrThrow", "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;", "singleOrNull", "single", "singleOrThrow", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BaseDataList<T> extends ArrayList<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDataList(Collection<? extends T> collection) {
        super(collection);
        collection.getClass();
    }

    public final T first(InterfaceC6558 predicate) {
        predicate.getClass();
        for (T t : this) {
            if (((Boolean) predicate.invoke(t)).booleanValue()) {
                return t;
            }
        }
        C5925.m11311("No element matching predicate was found.");
        return null;
    }

    public final T firstOrNull(InterfaceC6558 predicate) {
        predicate.getClass();
        for (T t : this) {
            if (((Boolean) predicate.invoke(t)).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    public final T firstOrThrow(InterfaceC6543 exceptionSupplier) throws Throwable {
        exceptionSupplier.getClass();
        if (isEmpty()) {
            throw ((Throwable) exceptionSupplier.invoke());
        }
        return get(0);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) removeAt(i);
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }

    public final T single(InterfaceC6558 predicate) {
        predicate.getClass();
        if (size() == 0) {
            throw new NoResultException("No result found for query");
        }
        T t = null;
        for (T t2 : this) {
            if (((Boolean) predicate.invoke(t2)).booleanValue()) {
                if (t != null && !t.equals(t2)) {
                    throw new NonUniqueResultException(size());
                }
                t = t2;
            }
        }
        if (t != null) {
            return t;
        }
        throw new NoResultException("No result found for query");
    }

    public final T singleOrNull(InterfaceC6558 predicate) {
        predicate.getClass();
        if (size() == 0) {
            return null;
        }
        T t = null;
        for (T t2 : this) {
            if (((Boolean) predicate.invoke(t2)).booleanValue()) {
                if (t != null && !t.equals(t2)) {
                    return null;
                }
                t = t2;
            }
        }
        return t;
    }

    public final T singleOrThrow(InterfaceC6543 exceptionSupplier) throws Throwable {
        exceptionSupplier.getClass();
        T tSingleOrNull = singleOrNull();
        if (tSingleOrNull != null) {
            return tSingleOrNull;
        }
        throw ((Throwable) exceptionSupplier.invoke());
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public BaseDataList(int i) {
        super(i);
    }

    public BaseDataList() {
    }

    public final T firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return first();
    }

    public final T first() {
        if (!isEmpty()) {
            return get(0);
        }
        C5925.m11311("list is empty");
        return null;
    }

    public final T singleOrNull() {
        if (size() == 0) {
            return null;
        }
        T t = get(0);
        int size = size();
        for (int i = 1; i < size; i++) {
            if (!AbstractC4395.m8907(t, get(i))) {
                return null;
            }
        }
        return t;
    }

    public final T single() {
        if (size() != 0) {
            T t = get(0);
            int size = size();
            for (int i = 1; i < size; i++) {
                if (!AbstractC4395.m8907(t, get(i))) {
                    throw new NonUniqueResultException(size());
                }
            }
            return t;
        }
        throw new NoResultException("No result found for query");
    }
}
