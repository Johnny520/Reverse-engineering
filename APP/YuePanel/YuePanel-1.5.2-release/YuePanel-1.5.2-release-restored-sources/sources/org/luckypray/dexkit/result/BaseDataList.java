package org.luckypray.dexkit.result;

import Yue.C4750;
import Yue.C5499;
import Yue.InterfaceC5122;
import Yue.InterfaceC5124;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.exceptions.NoResultException;
import org.luckypray.dexkit.exceptions.NonUniqueResultException;
import org.luckypray.dexkit.query.base.QueryComponent;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u00020\u0004B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0017\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\r\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\r\u0010\u0012J\r\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u000eJ!\u0010\u0013\u001a\u00028\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u001b\u0010\u0017\u001a\u00028\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0019\u0010\u000eJ#\u0010\u0019\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0019\u0010\u0012J\r\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u000eJ!\u0010\u001a\u001a\u00028\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u001a\u0010\u0012J\u001b\u0010\u001b\u001a\u00028\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lorg/luckypray/dexkit/result/BaseDataList;", C4750.f10502, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lorg/luckypray/dexkit/query/base/QueryComponent;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "firstOrNull", "()Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "(LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;", "first", "Lkotlin/Function0;", "", "exceptionSupplier", "firstOrThrow", "(LYue/ۥۣ۠۠ۨ;)Ljava/lang/Object;", "singleOrNull", "single", "singleOrThrow", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseDataList<T> extends ArrayList<T> implements QueryComponent {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BaseDataList() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final T first() {
        if (isEmpty()) {
            throw new IllegalStateException("list is empty".toString());
        }
        return get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6489
    public final T firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return first();
    }

    public final T firstOrThrow(@InterfaceC6399 InterfaceC5122<? extends Throwable> exceptionSupplier) throws Throwable {
        C5499.m17103(exceptionSupplier, "exceptionSupplier");
        if (isEmpty()) {
            throw exceptionSupplier.invoke();
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final T single() {
        if (size() == 0) {
            throw new NoResultException("No result found for query");
        }
        T t = get(0);
        int size = size();
        for (int i = 1; i < size; i++) {
            if (!C5499.m17094(t, get(i))) {
                throw new NonUniqueResultException(size());
            }
        }
        return t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6489
    public final T singleOrNull() {
        if (size() == 0) {
            return null;
        }
        T t = get(0);
        int size = size();
        for (int i = 1; i < size; i++) {
            if (!C5499.m17094(t, get(i))) {
                return null;
            }
        }
        return t;
    }

    public final T singleOrThrow(@InterfaceC6399 InterfaceC5122<? extends Throwable> exceptionSupplier) throws Throwable {
        C5499.m17103(exceptionSupplier, "exceptionSupplier");
        T tSingleOrNull = singleOrNull();
        if (tSingleOrNull != null) {
            return tSingleOrNull;
        }
        throw exceptionSupplier.invoke();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public BaseDataList(int i) {
        super(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public final T first(@InterfaceC6399 InterfaceC5124<? super T, Boolean> predicate) {
        C5499.m17103(predicate, "predicate");
        for (T t : this) {
            if (predicate.invoke(t).booleanValue()) {
                return t;
            }
        }
        throw new IllegalStateException("No element matching predicate was found.".toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @InterfaceC6489
    public final T firstOrNull(@InterfaceC6399 InterfaceC5124<? super T, Boolean> predicate) {
        C5499.m17103(predicate, "predicate");
        for (T t : this) {
            if (predicate.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDataList(@InterfaceC6399 Collection<? extends T> collection) {
        super(collection);
        C5499.m17103(collection, "elements");
    }

    @InterfaceC6489
    public final T singleOrNull(@InterfaceC6399 InterfaceC5124<? super T, Boolean> predicate) {
        C5499.m17103(predicate, "predicate");
        if (size() == 0) {
            return null;
        }
        T t = null;
        for (T t2 : this) {
            if (predicate.invoke(t2).booleanValue()) {
                if (t != null && !C5499.m17094(t, t2)) {
                    return null;
                }
                t = t2;
            }
        }
        return t;
    }

    public final T single(@InterfaceC6399 InterfaceC5124<? super T, Boolean> predicate) {
        C5499.m17103(predicate, "predicate");
        if (size() != 0) {
            T t = null;
            for (T t2 : this) {
                if (predicate.invoke(t2).booleanValue()) {
                    if (t != null && !C5499.m17094(t, t2)) {
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
        throw new NoResultException("No result found for query");
    }
}
