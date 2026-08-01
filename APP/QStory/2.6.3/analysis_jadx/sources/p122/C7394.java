package p122;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC4352;
import p054.InterfaceC6566;
import p115.C7336;
import p123.C7399;
import p123.C7401;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7394 extends AbstractC4352 implements Collection, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C7399 f20043;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f20044;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f20045;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C7395 f20046;

    public C7394(C7395 c7395) {
        this.f20046 = c7395;
        this.f20044 = c7395.f20050;
        this.f20045 = c7395.f20048;
        this.f20043 = c7395.f20049.mo2188();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        C7399 c7399 = this.f20043;
        if (c7399.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.f20044 = obj;
            this.f20045 = obj;
            c7399.put(obj, new C7396());
            return true;
        }
        V v = c7399.get(this.f20045);
        v.getClass();
        c7399.put(this.f20045, new C7396(((C7396) v).f20052, obj));
        c7399.put(obj, new C7396(this.f20045));
        this.f20045 = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f20043.clear();
        C7336 c7336 = C7336.f19548;
        this.f20044 = c7336;
        this.f20045 = c7336;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f20043.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC4352
    public final int getSize() {
        return this.f20043.f20061;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C7393(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C7399 c7399 = this.f20043;
        C7396 c7396 = (C7396) c7399.remove(obj);
        if (c7396 == null) {
            return false;
        }
        Object obj2 = c7396.f20051;
        Object obj3 = c7396.f20052;
        C7336 c7336 = C7336.f19548;
        if (obj3 != c7336) {
            V v = c7399.get(obj3);
            v.getClass();
            c7399.put(obj3, new C7396(((C7396) v).f20052, obj2));
        } else {
            this.f20044 = obj2;
        }
        if (obj2 == c7336) {
            this.f20045 = obj3;
            return true;
        }
        V v2 = c7399.get(obj2);
        v2.getClass();
        c7399.put(obj2, new C7396(obj3, ((C7396) v2).f20051));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7395 m12565() {
        C7401 c7401Mo2173 = this.f20043.mo2173();
        C7395 c7395 = this.f20046;
        if (c7401Mo2173 != c7395.f20049) {
            c7395 = new C7395(this.f20044, this.f20045, c7401Mo2173);
        }
        this.f20046 = c7395;
        return c7395;
    }
}
