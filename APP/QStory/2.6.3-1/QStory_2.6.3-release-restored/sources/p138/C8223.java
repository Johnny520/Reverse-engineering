package p138;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC5184;
import p070.InterfaceC7395;
import p131.C8165;
import p139.C8228;
import p139.C8230;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8223 extends AbstractC5184 implements Collection, InterfaceC7395 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C8228 f20388;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f20389;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f20390;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C8224 f20391;

    public C8223(C8224 c8224) {
        this.f20391 = c8224;
        this.f20389 = c8224.f20395;
        this.f20390 = c8224.f20393;
        this.f20388 = c8224.f20394.mo2748();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        C8228 c8228 = this.f20388;
        if (c8228.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.f20389 = obj;
            this.f20390 = obj;
            c8228.put(obj, new C8225());
            return true;
        }
        V v = c8228.get(this.f20390);
        v.getClass();
        c8228.put(this.f20390, new C8225(((C8225) v).f20397, obj));
        c8228.put(obj, new C8225(this.f20390));
        this.f20390 = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f20388.clear();
        C8165 c8165 = C8165.f19893;
        this.f20389 = c8165;
        this.f20390 = c8165;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f20388.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC5184
    public final int getSize() {
        return this.f20388.f20406;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C8222(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C8228 c8228 = this.f20388;
        C8225 c8225 = (C8225) c8228.remove(obj);
        if (c8225 == null) {
            return false;
        }
        Object obj2 = c8225.f20396;
        Object obj3 = c8225.f20397;
        C8165 c8165 = C8165.f19893;
        if (obj3 != c8165) {
            V v = c8228.get(obj3);
            v.getClass();
            c8228.put(obj3, new C8225(((C8225) v).f20397, obj2));
        } else {
            this.f20389 = obj2;
        }
        if (obj2 == c8165) {
            this.f20390 = obj3;
            return true;
        }
        V v2 = c8228.get(obj2);
        v2.getClass();
        c8228.put(obj2, new C8225(obj3, ((C8225) v2).f20396));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8224 m13124() {
        C8230 c8230Mo2733 = this.f20388.mo2733();
        C8224 c8224 = this.f20391;
        if (c8230Mo2733 != c8224.f20394) {
            c8224 = new C8224(this.f20389, this.f20390, c8230Mo2733);
        }
        this.f20391 = c8224;
        return c8224;
    }
}
