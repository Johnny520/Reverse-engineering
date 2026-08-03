package org.luckypray.dexkit.result;

import java.util.ArrayList;
import java.util.Collection;
import org.luckypray.dexkit.exceptions.NoResultException;
import org.luckypray.dexkit.exceptions.NonUniqueResultException;
import org.luckypray.dexkit.query.base.IQuery;
import p029P0.InterfaceC0275a;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseDataList<T> extends ArrayList<T> implements IQuery {
    public BaseDataList() {
    }

    public final T first() {
        if (isEmpty()) {
            throw new IllegalStateException("list is empty".toString());
        }
        return get(0);
    }

    public final T firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return first();
    }

    public final T firstOrThrow(InterfaceC0275a interfaceC0275a) throws Throwable {
        AbstractC0307g.m703e(interfaceC0275a, "exceptionSupplier");
        if (isEmpty()) {
            throw ((Throwable) interfaceC0275a.invoke());
        }
        return get(0);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i2) {
        return (T) removeAt(i2);
    }

    public /* bridge */ Object removeAt(int i2) {
        return super.remove(i2);
    }

    public final T single() {
        if (size() == 0) {
            throw new NoResultException("No result found for query");
        }
        T t2 = get(0);
        int size = size();
        for (int i2 = 1; i2 < size; i2++) {
            if (!AbstractC0307g.m699a(t2, get(i2))) {
                throw new NonUniqueResultException(size());
            }
        }
        return t2;
    }

    public final T singleOrNull() {
        if (size() == 0) {
            return null;
        }
        T t2 = get(0);
        int size = size();
        for (int i2 = 1; i2 < size; i2++) {
            if (!AbstractC0307g.m699a(t2, get(i2))) {
                return null;
            }
        }
        return t2;
    }

    public final T singleOrThrow(InterfaceC0275a interfaceC0275a) throws Throwable {
        AbstractC0307g.m703e(interfaceC0275a, "exceptionSupplier");
        T tSingleOrNull = singleOrNull();
        if (tSingleOrNull != null) {
            return tSingleOrNull;
        }
        throw ((Throwable) interfaceC0275a.invoke());
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public BaseDataList(int i2) {
        super(i2);
    }

    public final T first(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "predicate");
        for (T t2 : this) {
            if (((Boolean) interfaceC0286l.invoke(t2)).booleanValue()) {
                return t2;
            }
        }
        throw new IllegalStateException("No element matching predicate was found.".toString());
    }

    public final T firstOrNull(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "predicate");
        for (T t2 : this) {
            if (((Boolean) interfaceC0286l.invoke(t2)).booleanValue()) {
                return t2;
            }
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDataList(Collection<? extends T> collection) {
        super(collection);
        AbstractC0307g.m703e(collection, "elements");
    }

    public final T singleOrNull(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "predicate");
        if (size() == 0) {
            return null;
        }
        T t2 = null;
        for (T t3 : this) {
            if (((Boolean) interfaceC0286l.invoke(t3)).booleanValue()) {
                if (t2 != null && !t2.equals(t3)) {
                    return null;
                }
                t2 = t3;
            }
        }
        return t2;
    }

    public final T single(InterfaceC0286l interfaceC0286l) {
        AbstractC0307g.m703e(interfaceC0286l, "predicate");
        if (size() != 0) {
            T t2 = null;
            for (T t3 : this) {
                if (((Boolean) interfaceC0286l.invoke(t3)).booleanValue()) {
                    if (t2 != null && !t2.equals(t3)) {
                        throw new NonUniqueResultException(size());
                    }
                    t2 = t3;
                }
            }
            if (t2 != null) {
                return t2;
            }
            throw new NoResultException("No result found for query");
        }
        throw new NoResultException("No result found for query");
    }
}
