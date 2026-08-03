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
    public final C2029a f5796b = new C2029a();

    public C1609M2(C1879h c1879h) {
        this.f5795a = c1879h;
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        C1981r c1981rM4173a = this.f5796b.m4173a();
        try {
            boolean zAdd = this.f5795a.add(obj);
            c1981rM4173a.close();
            return zAdd;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        C1981r c1981rM4173a = this.f5796b.m4173a();
        try {
            boolean zAddAll = this.f5795a.addAll(collection);
            c1981rM4173a.close();
            return zAddAll;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        C1981r c1981rM4173a = this.f5796b.m4173a();
        try {
            this.f5795a.clear();
            c1981rM4173a.close();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        C1981r c1981rM4173a = this.f5796b.m4173a();
        try {
            boolean zContains = this.f5795a.contains(obj);
            c1981rM4173a.close();
            return zContains;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        C1981r c1981rM4173a = this.f5796b.m4173a();
        try {
            boolean zContainsAll = this.f5795a.containsAll(collection);
            c1981rM4173a.close();
            return zContainsAll;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final Object element() {
        C1981r c1981rM4173a = this.f5796b.m4173a();
        try {
            Object objElement = this.f5795a.element();
            c1981rM4173a.close();
            return objElement;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        C1981r c1981rM4173a = this.f5796b.m4173a();
        try {
            boolean zEquals = this.f5795a.equals(obj);
            c1981rM4173a.close();
            return zEquals;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final int hashCode() {
        C1981r c1981rM4173a = this.f5796b.m4173a();
        try {
            int iHashCode = this.f5795a.hashCode();
            c1981rM4173a.close();
            return iHashCode;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        C1981r c1981rM4173a = this.f5796b.m4173a();
        try {
            boolean zIsEmpty = this.f5795a.isEmpty();
            c1981rM4173a.close();
            return zIsEmpty;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f5795a.iterator();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        C1981r c1981rM4173a = this.f5796b.m4173a();
        try {
            boolean zOffer = this.f5795a.offer(obj);
            c1981rM4173a.close();
            return zOffer;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final Object peek() {
        C1981r c1981rM4173a = this.f5796b.m4173a();
        try {
            Object objPeek = this.f5795a.peek();
            c1981rM4173a.close();
            return objPeek;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final Object poll() {
        C1981r c1981rM4173a = this.f5796b.m4173a();
        try {
            Object objPoll = this.f5795a.poll();
            c1981rM4173a.close();
            return objPoll;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final Object remove() {
        C1981r c1981rM4173a = this.f5796b.m4173a();
        try {
            Object objRemove = this.f5795a.remove();
            c1981rM4173a.close();
            return objRemove;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C1981r c1981rM4173a = this.f5796b.m4173a();
        try {
            boolean zRemoveAll = this.f5795a.removeAll(collection);
            c1981rM4173a.close();
            return zRemoveAll;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1981r c1981rM4173a = this.f5796b.m4173a();
        try {
            boolean zRetainAll = this.f5795a.retainAll(collection);
            c1981rM4173a.close();
            return zRetainAll;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final int size() {
        C1981r c1981rM4173a = this.f5796b.m4173a();
        try {
            int size = this.f5795a.size();
            c1981rM4173a.close();
            return size;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C1981r c1981rM4173a = this.f5796b.m4173a();
        try {
            Object[] array = this.f5795a.toArray();
            c1981rM4173a.close();
            return array;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String toString() {
        C1981r c1981rM4173a = this.f5796b.m4173a();
        try {
            String string = this.f5795a.toString();
            c1981rM4173a.close();
            return string;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C1981r c1981rM4173a = this.f5796b.m4173a();
        try {
            boolean zRemove = this.f5795a.remove(obj);
            c1981rM4173a.close();
            return zRemove;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1981r c1981rM4173a = this.f5796b.m4173a();
        try {
            Object[] array = this.f5795a.toArray(objArr);
            c1981rM4173a.close();
            return array;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
