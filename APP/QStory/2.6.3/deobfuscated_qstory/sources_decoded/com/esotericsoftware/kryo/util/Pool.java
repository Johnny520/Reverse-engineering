package com.esotericsoftware.kryo.util;

import java.lang.ref.SoftReference;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Pool<T> {
    private final Queue<T> freeObjects;
    private int peak;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface Poolable {
        void reset();
    }

    public Pool(boolean z, boolean z2, final int i) {
        Queue<T> queue = z ? new LinkedBlockingQueue<T>(i) { // from class: com.esotericsoftware.kryo.util.Pool.1
            @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
            public boolean add(T t) {
                return super.offer(t);
            }
        } : z2 ? new LinkedList<T>() { // from class: com.esotericsoftware.kryo.util.Pool.2
            @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
            public boolean add(T t) {
                if (size() >= i) {
                    return false;
                }
                super.add(t);
                return true;
            }
        } : new ArrayDeque<T>() { // from class: com.esotericsoftware.kryo.util.Pool.3
            @Override // java.util.ArrayDeque, java.util.Deque, java.util.Queue
            public boolean offer(T t) {
                if (size() >= i) {
                    return false;
                }
                super.offer(t);
                return true;
            }
        };
        this.freeObjects = z2 ? new SoftReferenceQueue(queue) : queue;
    }

    public void clean() {
        Queue<T> queue = this.freeObjects;
        if (queue instanceof SoftReferenceQueue) {
            ((SoftReferenceQueue) queue).clean();
        }
    }

    public void clear() {
        this.freeObjects.clear();
    }

    public abstract T create();

    public void free(T t) {
        if (t == null) {
            C5925.m11310("object cannot be null.");
            return;
        }
        reset(t);
        if (!this.freeObjects.offer(t)) {
            Queue<T> queue = this.freeObjects;
            if (queue instanceof SoftReferenceQueue) {
                ((SoftReferenceQueue) queue).cleanOne();
                this.freeObjects.offer(t);
            }
        }
        this.peak = Math.max(this.peak, this.freeObjects.size());
    }

    public int getFree() {
        return this.freeObjects.size();
    }

    public int getPeak() {
        return this.peak;
    }

    public T obtain() {
        T tPoll = this.freeObjects.poll();
        return tPoll != null ? tPoll : create();
    }

    public void reset(T t) {
        if (t instanceof Poolable) {
            ((Poolable) t).reset();
        }
    }

    public void resetPeak() {
        this.peak = 0;
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class SoftReferenceQueue<T> implements Queue<T> {
        private final Queue<SoftReference<T>> delegate;

        public SoftReferenceQueue(Queue<SoftReference<T>> queue) {
            this.delegate = queue;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$clean$0(SoftReference softReference) {
            return softReference.get() == null;
        }

        @Override // java.util.Queue, java.util.Collection
        public boolean add(T t) {
            return false;
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            return false;
        }

        public void clean() {
            this.delegate.removeIf(new C3075());
        }

        public void cleanOne() {
            Iterator<SoftReference<T>> it = this.delegate.iterator();
            while (it.hasNext()) {
                if (it.next().get() == null) {
                    it.remove();
                    return;
                }
            }
        }

        @Override // java.util.Collection
        public void clear() {
            this.delegate.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return false;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            return false;
        }

        @Override // java.util.Queue
        public T element() {
            return null;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return null;
        }

        @Override // java.util.Queue
        public boolean offer(T t) {
            return this.delegate.add(new SoftReference<>(t));
        }

        @Override // java.util.Queue
        public T peek() {
            return null;
        }

        @Override // java.util.Queue
        public T poll() {
            T t;
            do {
                SoftReference<T> softReferencePoll = this.delegate.poll();
                if (softReferencePoll == null) {
                    return null;
                }
                t = softReferencePoll.get();
            } while (t == null);
            return t;
        }

        @Override // java.util.Queue
        public T remove() {
            return null;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            return false;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            return false;
        }

        @Override // java.util.Collection
        public int size() {
            return this.delegate.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return null;
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            return false;
        }

        @Override // java.util.Collection
        public <E> E[] toArray(E[] eArr) {
            return null;
        }
    }

    public Pool(boolean z, boolean z2) {
        this(z, z2, Integer.MAX_VALUE);
    }
}
