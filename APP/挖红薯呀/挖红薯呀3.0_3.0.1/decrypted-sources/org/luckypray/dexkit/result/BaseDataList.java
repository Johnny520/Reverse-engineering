package org.luckypray.dexkit.result;

import java.util.ArrayList;
import java.util.Collection;
import org.luckypray.dexkit.exceptions.NoResultException;
import org.luckypray.dexkit.exceptions.NonUniqueResultException;
import org.luckypray.dexkit.query.base.QueryComponent;
import p000.C0921xc;
import p000.InterfaceC0298hw;
import p000.InterfaceC0742sw;
import p000.p30;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseDataList<T> extends ArrayList<T> implements QueryComponent {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDataList(Collection<? extends T> collection) {
        super(collection);
        collection.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final T first(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        for (T t : this) {
            if (((Boolean) interfaceC0742sw.invoke(t)).booleanValue()) {
                return t;
            }
        }
        C0921xc.m5134o("No element matching predicate was found.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final T firstOrNull(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        for (T t : this) {
            if (((Boolean) interfaceC0742sw.invoke(t)).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final T firstOrThrow(InterfaceC0298hw interfaceC0298hw) throws Throwable {
        interfaceC0298hw.getClass();
        if (isEmpty()) {
            throw ((Throwable) interfaceC0298hw.invoke());
        }
        return get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* bridge */ int getSize() {
        return super.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) removeAt(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final T single(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        if (size() == 0) {
            throw new NoResultException("No result found for query");
        }
        T t = null;
        for (T t2 : this) {
            if (((Boolean) interfaceC0742sw.invoke(t2)).booleanValue()) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final T singleOrNull(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.getClass();
        if (size() == 0) {
            return null;
        }
        T t = null;
        for (T t2 : this) {
            if (((Boolean) interfaceC0742sw.invoke(t2)).booleanValue()) {
                if (t != null && !t.equals(t2)) {
                    return null;
                }
                t = t2;
            }
        }
        return t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final T singleOrThrow(InterfaceC0298hw interfaceC0298hw) throws Throwable {
        interfaceC0298hw.getClass();
        T tSingleOrNull = singleOrNull();
        if (tSingleOrNull != null) {
            return tSingleOrNull;
        }
        throw ((Throwable) interfaceC0298hw.invoke());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        C0921xc.m5134o("list is empty");
        return null;
    }

    public final T singleOrNull() {
        if (size() == 0) {
            return null;
        }
        T t = get(0);
        int size = size();
        for (int i = 1; i < size; i++) {
            if (!p30.m3002l(t, get(i))) {
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
                if (!p30.m3002l(t, get(i))) {
                    throw new NonUniqueResultException(size());
                }
            }
            return t;
        }
        throw new NoResultException("No result found for query");
    }
}
