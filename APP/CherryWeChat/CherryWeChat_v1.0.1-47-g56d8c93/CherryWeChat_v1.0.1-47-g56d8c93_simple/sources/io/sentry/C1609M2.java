package io.sentry;

import io.sentry.util.C2029a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: renamed from: io.sentry.M2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1609M2 implements Queue, Collection, Serializable {

    /* JADX INFO: renamed from: a */
    public final C1879h f5795a;

    /* JADX INFO: renamed from: b */
    public final C2029a f5796b;

    public C1609M2(C1879h r1) {
        this.f5795a = r1;
        this.f5796b = new C2029a();
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object r3) {
        C1981r r0 = this.f5796b.m4173a();
        boolean r32 = this.f5795a.add(r3);     // Catch: Throwable -> L6
        r0.close();
        return r32;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection r3) {
        C1981r r0 = this.f5796b.m4173a();
        boolean r32 = this.f5795a.addAll(r3);     // Catch: Throwable -> L6
        r0.close();
        return r32;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // java.util.Collection
    public final void clear() {
        C1981r r0 = this.f5796b.m4173a();
        this.f5795a.clear();     // Catch: Throwable -> L6
        r0.close();
        return;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // java.util.Collection
    public final boolean contains(Object r3) {
        C1981r r0 = this.f5796b.m4173a();
        boolean r32 = this.f5795a.contains(r3);     // Catch: Throwable -> L6
        r0.close();
        return r32;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection r3) {
        C1981r r0 = this.f5796b.m4173a();
        boolean r32 = this.f5795a.containsAll(r3);     // Catch: Throwable -> L6
        r0.close();
        return r32;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // java.util.Queue
    public final Object element() {
        C1981r r0 = this.f5796b.m4173a();
        Object r1 = this.f5795a.element();     // Catch: Throwable -> L6
        r0.close();
        return r1;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // java.util.Collection
    public final boolean equals(Object r3) {
        if (r3 != this) goto L5;
        return true;
    L5:
        C1981r r0 = this.f5796b.m4173a();
        boolean r32 = this.f5795a.equals(r3);     // Catch: Throwable -> L9
        r0.close();
        return r32;
    L9:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L12
    L14:
        throw th;
    L12:
        th = move-exception;
        th.addSuppressed(th);
        goto L14
    }

    @Override // java.util.Collection
    public final int hashCode() {
        C1981r r0 = this.f5796b.m4173a();
        int r1 = this.f5795a.hashCode();     // Catch: Throwable -> L6
        r0.close();
        return r1;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        C1981r r0 = this.f5796b.m4173a();
        boolean r1 = this.f5795a.isEmpty();     // Catch: Throwable -> L6
        r0.close();
        return r1;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f5795a.iterator();
    }

    @Override // java.util.Queue
    public final boolean offer(Object r3) {
        C1981r r0 = this.f5796b.m4173a();
        boolean r32 = this.f5795a.offer(r3);     // Catch: Throwable -> L6
        r0.close();
        return r32;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // java.util.Queue
    public final Object peek() {
        C1981r r0 = this.f5796b.m4173a();
        Object r1 = this.f5795a.peek();     // Catch: Throwable -> L6
        r0.close();
        return r1;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // java.util.Queue
    public final Object poll() {
        C1981r r0 = this.f5796b.m4173a();
        Object r1 = this.f5795a.poll();     // Catch: Throwable -> L6
        r0.close();
        return r1;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // java.util.Queue
    public final Object remove() {
        C1981r r0 = this.f5796b.m4173a();
        Object r1 = this.f5795a.remove();     // Catch: Throwable -> L6
        r0.close();
        return r1;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection r3) {
        C1981r r0 = this.f5796b.m4173a();
        boolean r32 = this.f5795a.removeAll(r3);     // Catch: Throwable -> L6
        r0.close();
        return r32;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection r3) {
        C1981r r0 = this.f5796b.m4173a();
        boolean r32 = this.f5795a.retainAll(r3);     // Catch: Throwable -> L6
        r0.close();
        return r32;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // java.util.Collection
    public final int size() {
        C1981r r0 = this.f5796b.m4173a();
        int r1 = this.f5795a.size();     // Catch: Throwable -> L6
        r0.close();
        return r1;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C1981r r0 = this.f5796b.m4173a();
        Object[] r1 = this.f5795a.toArray();     // Catch: Throwable -> L6
        r0.close();
        return r1;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    public final String toString() {
        C1981r r0 = this.f5796b.m4173a();
        String r1 = this.f5795a.toString();     // Catch: Throwable -> L6
        r0.close();
        return r1;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // java.util.Collection
    public final boolean remove(Object r3) {
        C1981r r0 = this.f5796b.m4173a();
        boolean r32 = this.f5795a.remove(r3);     // Catch: Throwable -> L6
        r0.close();
        return r32;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] r3) {
        C1981r r0 = this.f5796b.m4173a();
        Object[] r32 = this.f5795a.toArray(r3);     // Catch: Throwable -> L6
        r0.close();
        return r32;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }
}
