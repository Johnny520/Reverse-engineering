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
    public transient int f6728b;

    /* JADX INFO: renamed from: c */
    public transient int f6729c;

    /* JADX INFO: renamed from: d */
    public transient boolean f6730d;

    /* JADX INFO: renamed from: e */
    public final int f6731e;

    public C1879h(int r2) {
        this.f6728b = 0;
        this.f6729c = 0;
        this.f6730d = false;
        if (r2 <= 0) goto L7;
        Object[] r22 = new Object[r2];
        this.f6727a = r22;
        this.f6731e = r22.length;
        return;
    L7:
        throw new IllegalArgumentException("The size must be greater than 0");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object r5) {
        if (r5 == null) goto L14;
        int r0 = size();
        int r1 = this.f6731e;
        if (r0 != r1) goto L6;
        remove();
    L6:
        int r02 = this.f6729c;
        int r2 = r02 + 1;
        this.f6729c = r2;
        this.f6727a[r02] = r5;
        if (r2 < r1) goto L10;
        this.f6729c = 0;
    L10:
        if (this.f6729c != this.f6728b) goto L12;
        this.f6730d = true;
    L12:
        return true;
    L14:
        throw new NullPointerException("Attempted to add null object to queue");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f6730d = false;
        this.f6728b = 0;
        this.f6729c = 0;
        Arrays.fill(this.f6727a, null);
    }

    @Override // java.util.Queue
    public final Object element() {
        if (isEmpty() == true) goto L7;
        return peek();
    L7:
        throw new NoSuchElementException("queue is empty");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        if (size() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1875g(this);
    }

    @Override // java.util.Queue
    public final boolean offer(Object r1) {
        add(r1);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (isEmpty() == false) goto L7;
        return null;
    L7:
        return this.f6727a[this.f6728b];
    }

    @Override // java.util.Queue
    public final Object poll() {
        if (isEmpty() == false) goto L7;
        return null;
    L7:
        return remove();
    }

    @Override // java.util.Queue
    public final Object remove() {
        if (isEmpty() == true) goto L12;
        int r0 = this.f6728b;
        Object[] r1 = this.f6727a;
        Object r2 = r1[r0];
        if (r2 == null) goto L10;
        int r3 = r0 + 1;
        this.f6728b = r3;
        r1[r0] = null;
        if (r3 < this.f6731e) goto L9;
        this.f6728b = 0;
    L9:
        this.f6730d = false;
    L10:
        return r2;
    L12:
        throw new NoSuchElementException("queue is empty");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int r0 = this.f6729c;
        int r1 = this.f6728b;
        int r2 = this.f6731e;
        if (r0 < r1) goto L5;
        if (r0 != r1) goto L13;
        if (this.f6730d == false) goto L10;
        return r2;
    L10:
        return 0;
    L13:
        return r0 - r1;
    L5:
        return (r2 - r1) + r0;
    }
}
