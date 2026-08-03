package org.luckypray.dexkit.result;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
        if (isEmpty() == true) goto L7;
        return get(0);
    L7:
        throw new IllegalStateException("list is empty".toString());
    }

    public final T firstOrNull() {
        if (isEmpty() == false) goto L6;
        return null;
    L6:
        return first();
    }

    public final T firstOrThrow(InterfaceC0275a r2) {
        AbstractC0307g.m703e(r2, "exceptionSupplier");
        if (isEmpty() == true) goto L7;
        return get(0);
    L7:
        throw ((Throwable) r2.invoke());
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int r1) {
        return (T) removeAt(r1);
    }

    public /* bridge */ Object removeAt(int r1) {
        return super.remove(r1);
    }

    public final T single() {
        if (size() == 0) goto L13;
        T r02 = get(0);
        int r1 = size();
        int r2 = 1;
    L5:
        if (r2 >= r1) goto L11;
        if (AbstractC0307g.m699a(r02, get(r2)) == false) goto L10;
        r2 = r2 + 1;
        goto L5
    L10:
        throw new NonUniqueResultException(size());
    L11:
        return r02;
    L13:
        throw new NoResultException("No result found for query");
    }

    public final T singleOrNull() {
        if (size() != 0) goto L5;
        return null;
    L5:
        T r02 = get(0);
        int r2 = size();
        int r3 = 1;
    L6:
        if (r3 >= r2) goto L11;
        if (AbstractC0307g.m699a(r02, get(r3)) == false) goto L9;
        r3 = r3 + 1;
        goto L6
    L9:
        return null;
    L11:
        return r02;
    }

    public final T singleOrThrow(InterfaceC0275a r2) {
        AbstractC0307g.m703e(r2, "exceptionSupplier");
        T r02 = singleOrNull();
        if (r02 == null) goto L6;
        return r02;
    L6:
        throw ((Throwable) r2.invoke());
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public BaseDataList(int r1) {
        super(r1);
    }

    public final T first(InterfaceC0286l r4) {
        AbstractC0307g.m703e(r4, "predicate");
        Iterator<T> r02 = iterator();
    L4:
        if (r02.hasNext() == false) goto L9;
        T r1 = r02.next();
        if (((Boolean) r4.invoke(r1)).booleanValue() == false) goto L4;
        return r1;
    L9:
        throw new IllegalStateException("No element matching predicate was found.".toString());
    }

    public final T firstOrNull(InterfaceC0286l r4) {
        AbstractC0307g.m703e(r4, "predicate");
        Iterator<T> r02 = iterator();
    L4:
        if (r02.hasNext() == false) goto L8;
        T r1 = r02.next();
        if (((Boolean) r4.invoke(r1)).booleanValue() == false) goto L4;
        return r1;
    L8:
        return null;
    }

    public BaseDataList(Collection<? extends T> r2) {
        AbstractC0307g.m703e(r2, "elements");
        super(r2);
    }

    public final T singleOrNull(InterfaceC0286l r6) {
        AbstractC0307g.m703e(r6, "predicate");
        if (size() != 0) goto L5;
        return null;
    L5:
        Iterator<T> r02 = iterator();
        T r2 = null;
    L7:
        if (r02.hasNext() == false) goto L15;
        T r3 = r02.next();
        if (((Boolean) r6.invoke(r3)).booleanValue() == false) goto L7;
        if (r2 != null) goto L12;
    L14:
        r2 = r3;
        goto L7
    L12:
        if (r2.equals(r3) == true) goto L14;
        return null;
    L15:
        return r2;
    }

    public final T single(InterfaceC0286l r6) {
        AbstractC0307g.m703e(r6, "predicate");
        if (size() == 0) goto L21;
        Iterator<T> r02 = iterator();
        T r2 = null;
    L6:
        if (r02.hasNext() == false) goto L16;
        T r3 = r02.next();
        if (((Boolean) r6.invoke(r3)).booleanValue() == false) goto L6;
        if (r2 != null) goto L11;
    L15:
        r2 = r3;
        goto L6
    L11:
        if (r2.equals(r3) == true) goto L15;
        throw new NonUniqueResultException(size());
    L16:
        if (r2 == null) goto L19;
        return r2;
    L19:
        throw new NoResultException("No result found for query");
    L21:
        throw new NoResultException("No result found for query");
    }
}
