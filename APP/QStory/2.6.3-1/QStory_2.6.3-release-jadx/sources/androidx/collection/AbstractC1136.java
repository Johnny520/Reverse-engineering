package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5214;
import kotlin.jvm.internal.AbstractC5227;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1136 implements Set, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC1138 f1351;

    public AbstractC1136(C1090 c1090) {
        c1090.getClass();
        this.f1351 = c1090;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f1351.m1447(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f1351.m1447(it.next())) {
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
        return AbstractC5227.m9466(this.f1351, ((AbstractC1136) obj).f1351);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f1351.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f1351.f1359 == 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f1351.f1359;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return AbstractC5214.m9433(this, objArr);
    }

    public final String toString() {
        return this.f1351.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC5214.m9434(this);
    }
}
