package p105V;

import java.util.List;
import java.util.ListIterator;
import me.dartcv.nuke.BuildConfig;
import p122Y2.InterfaceC1766a;

/* JADX INFO: renamed from: V.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1482d implements ListIterator, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5178d;

    /* JADX INFO: renamed from: e */
    public final Object f5179e;

    /* JADX INFO: renamed from: f */
    public int f5180f;

    public C1482d(List list, int i5, int i6) {
        this.f5178d = i6;
        switch (i6) {
            case BuildConfig.VERSION_CODE /* 1 */:
                this.f5179e = list;
                this.f5180f = i5 - 1;
                break;
            default:
                this.f5179e = list;
                this.f5180f = i5;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f5178d) {
            case 0:
                this.f5179e.add(this.f5180f, obj);
                this.f5180f++;
                break;
            default:
                int i5 = this.f5180f + 1;
                this.f5180f = i5;
                this.f5179e.add(i5, obj);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5178d) {
            case 0:
                return this.f5180f < this.f5179e.size();
            default:
                return this.f5180f < this.f5179e.size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f5178d) {
            case 0:
                if (this.f5180f > 0) {
                }
                break;
            default:
                if (this.f5180f >= 0) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f5178d) {
            case 0:
                int i5 = this.f5180f;
                this.f5180f = i5 + 1;
                return this.f5179e.get(i5);
            default:
                int i6 = this.f5180f + 1;
                this.f5180f = i6;
                return this.f5179e.get(i6);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f5178d) {
            case 0:
                return this.f5180f;
            default:
                return this.f5180f + 1;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f5178d) {
            case 0:
                int i5 = this.f5180f - 1;
                this.f5180f = i5;
                return this.f5179e.get(i5);
            default:
                int i6 = this.f5180f;
                this.f5180f = i6 - 1;
                return this.f5179e.get(i6);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f5178d) {
            case 0:
                return this.f5180f - 1;
            default:
                return this.f5180f;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f5178d) {
            case 0:
                int i5 = this.f5180f - 1;
                this.f5180f = i5;
                this.f5179e.remove(i5);
                break;
            default:
                this.f5179e.remove(this.f5180f);
                this.f5180f--;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f5178d) {
            case 0:
                this.f5179e.set(this.f5180f, obj);
                break;
            default:
                this.f5179e.set(this.f5180f, obj);
                break;
        }
    }
}
