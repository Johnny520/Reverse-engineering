package p119Y;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1766a;

/* JADX INFO: renamed from: Y.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1720d implements Iterator, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final AbstractC1729m[] f5961d;

    /* JADX INFO: renamed from: e */
    public int f5962e;

    /* JADX INFO: renamed from: f */
    public boolean f5963f = true;

    public AbstractC1720d(C1728l c1728l, AbstractC1729m[] abstractC1729mArr) {
        this.f5961d = abstractC1729mArr;
        abstractC1729mArr[0].m3084a(c1728l.f5980d, Integer.bitCount(c1728l.f5977a) * 2, 0);
        this.f5962e = 0;
        m3056a();
    }

    /* JADX INFO: renamed from: a */
    public final void m3056a() {
        int i5 = this.f5962e;
        AbstractC1729m[] abstractC1729mArr = this.f5961d;
        AbstractC1729m abstractC1729m = abstractC1729mArr[i5];
        if (abstractC1729m.f5983f < abstractC1729m.f5982e) {
            return;
        }
        while (-1 < i5) {
            int iM3057b = m3057b(i5);
            if (iM3057b == -1) {
                AbstractC1729m abstractC1729m2 = abstractC1729mArr[i5];
                int i6 = abstractC1729m2.f5983f;
                Object[] objArr = abstractC1729m2.f5981d;
                if (i6 < objArr.length) {
                    int length = objArr.length;
                    abstractC1729m2.f5983f = i6 + 1;
                    iM3057b = m3057b(i5);
                }
            }
            if (iM3057b != -1) {
                this.f5962e = iM3057b;
                return;
            }
            if (i5 > 0) {
                AbstractC1729m abstractC1729m3 = abstractC1729mArr[i5 - 1];
                int i7 = abstractC1729m3.f5983f;
                int length2 = abstractC1729m3.f5981d.length;
                abstractC1729m3.f5983f = i7 + 1;
            }
            abstractC1729mArr[i5].m3084a(C1728l.f5976e.f5980d, 0, 0);
            i5--;
        }
        this.f5963f = false;
    }

    /* JADX INFO: renamed from: b */
    public final int m3057b(int i5) {
        AbstractC1729m[] abstractC1729mArr = this.f5961d;
        AbstractC1729m abstractC1729m = abstractC1729mArr[i5];
        int i6 = abstractC1729m.f5983f;
        if (i6 < abstractC1729m.f5982e) {
            return i5;
        }
        Object[] objArr = abstractC1729m.f5981d;
        if (i6 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i6];
        AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        C1728l c1728l = (C1728l) obj;
        if (i5 == 6) {
            AbstractC1729m abstractC1729m2 = abstractC1729mArr[i5 + 1];
            Object[] objArr2 = c1728l.f5980d;
            abstractC1729m2.m3084a(objArr2, objArr2.length, 0);
        } else {
            abstractC1729mArr[i5 + 1].m3084a(c1728l.f5980d, Integer.bitCount(c1728l.f5977a) * 2, 0);
        }
        return m3057b(i5 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5963f;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f5963f) {
            throw new NoSuchElementException();
        }
        Object next = this.f5961d[this.f5962e].next();
        m3056a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
