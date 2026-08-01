package androidx.compose.p001ui.layout;

import androidx.collection.AbstractC1139;
import androidx.collection.C1086;
import androidx.collection.C1087;
import androidx.collection.C1090;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.AbstractC5214;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2549 implements Collection, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1090 f5330;

    public C2549() {
        int i = AbstractC1139.f1360;
        this.f5330 = new C1090(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.f5330.m1326(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f5330.m1325();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5330.m1447(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f5330.m1447(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f5330.f1359 == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C1090 c1090 = this.f5330;
        c1090.getClass();
        return new C1086(new C1087(c1090));
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f5330.m1328(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f5330.m1328(collection);
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f5330.m1329(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f5330.f1359;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC5214.m9434(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC5214.m9433(this, objArr);
    }
}
