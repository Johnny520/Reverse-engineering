package p119Y;

import java.util.Iterator;
import java.util.Map;
import p061L2.AbstractC0968h;
import p136b0.C1846h;

/* JADX INFO: renamed from: Y.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1722f extends AbstractC0968h {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5968d;

    /* JADX INFO: renamed from: e */
    public final C1846h f5969e;

    public /* synthetic */ C1722f(int i5, C1846h c1846h) {
        this.f5968d = i5;
        this.f5969e = c1846h;
    }

    @Override // p061L2.AbstractC0968h
    /* JADX INFO: renamed from: a */
    public final int mo1978a() {
        switch (this.f5968d) {
            case 0:
                C1846h c1846h = this.f5969e;
                c1846h.getClass();
                return c1846h.f6253h;
            default:
                C1846h c1846h2 = this.f5969e;
                c1846h2.getClass();
                return c1846h2.f6253h;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f5968d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f5968d) {
            case 0:
                this.f5969e.clear();
                break;
            default:
                this.f5969e.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f5968d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C1846h c1846h = this.f5969e;
                Object obj2 = c1846h.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && c1846h.containsKey(entry.getKey());
            default:
                return this.f5969e.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f5968d) {
            case 0:
                return new C1723g(this.f5969e);
            default:
                AbstractC1729m[] abstractC1729mArr = new AbstractC1729m[8];
                for (int i5 = 0; i5 < 8; i5++) {
                    abstractC1729mArr[i5] = new C1730n(1);
                }
                return new C1724h(this.f5969e, abstractC1729mArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f5968d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f5969e.remove(entry.getKey(), entry.getValue());
            default:
                C1846h c1846h = this.f5969e;
                if (!c1846h.containsKey(obj)) {
                    return false;
                }
                c1846h.remove(obj);
                return true;
        }
    }
}
