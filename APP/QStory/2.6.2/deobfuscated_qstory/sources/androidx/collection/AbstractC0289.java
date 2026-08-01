package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4381;
import kotlin.jvm.internal.AbstractC4394;
import p054.InterfaceC6566;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0289 implements Set, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC0291 f1006;

    public AbstractC0289(C0243 c0243) {
        c0243.getClass();
        this.f1006 = c0243;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f1006.m886(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f1006.m886(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return AbstractC4394.m8917(this.f1006, ((AbstractC0289) obj).f1006);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f1006.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f1006.f1014 == 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f1006.f1014;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return AbstractC4381.m8884(this, objArr);
    }

    public final String toString() {
        return this.f1006.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4381.m8885(this);
    }
}
