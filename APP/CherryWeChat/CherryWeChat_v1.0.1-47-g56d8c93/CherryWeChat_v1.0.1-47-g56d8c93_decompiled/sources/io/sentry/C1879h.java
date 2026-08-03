package io.sentry;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: renamed from: io.sentry.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1879h extends AbstractCollection implements Queue, Serializable {

    /* JADX INFO: renamed from: a */
    public final transient Object[] f6727a;

    /* JADX INFO: renamed from: b */
    public transient int f6728b = 0;

    /* JADX INFO: renamed from: c */
    public transient int f6729c = 0;

    /* JADX INFO: renamed from: d */
    public transient boolean f6730d = false;

    /* JADX INFO: renamed from: e */
    public final int f6731e;

    public C1879h(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        Object[] objArr = new Object[i];
        this.f6727a = objArr;
        this.f6731e = objArr.length;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        int size = size();
        int i = this.f6731e;
        if (size == i) {
            remove();
        }
        int i2 = this.f6729c;
        int i3 = i2 + 1;
        this.f6729c = i3;
        this.f6727a[i2] = obj;
        if (i3 >= i) {
            this.f6729c = 0;
        }
        if (this.f6729c == this.f6728b) {
            this.f6730d = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f6730d = false;
        this.f6728b = 0;
        this.f6729c = 0;
        Arrays.fill(this.f6727a, (Object) null);
    }

    @Override // java.util.Queue
    public final Object element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1875g(this);
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f6727a[this.f6728b];
    }

    @Override // java.util.Queue
    public final Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public final Object remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        int i = this.f6728b;
        Object[] objArr = this.f6727a;
        Object obj = objArr[i];
        if (obj != null) {
            int i2 = i + 1;
            this.f6728b = i2;
            objArr[i] = null;
            if (i2 >= this.f6731e) {
                this.f6728b = 0;
            }
            this.f6730d = false;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.f6729c;
        int i2 = this.f6728b;
        int i3 = this.f6731e;
        if (i < i2) {
            return (i3 - i2) + i;
        }
        if (i != i2) {
            return i - i2;
        }
        if (this.f6730d) {
            return i3;
        }
        return 0;
    }
}
