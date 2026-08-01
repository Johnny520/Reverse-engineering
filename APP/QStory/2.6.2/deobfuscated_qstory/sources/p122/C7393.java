package p122;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC4351;
import p054.InterfaceC6565;
import p115.C7335;
import p123.C7398;
import p123.C7400;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7393 extends AbstractC4351 implements Collection, InterfaceC6565 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C7398 f20048;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f20049;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f20050;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C7394 f20051;

    public C7393(C7394 c7394) {
        this.f20051 = c7394;
        this.f20049 = c7394.f20055;
        this.f20050 = c7394.f20053;
        this.f20048 = c7394.f20054.mo2178();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        C7398 c7398 = this.f20048;
        if (c7398.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.f20049 = obj;
            this.f20050 = obj;
            c7398.put(obj, new C7395());
            return true;
        }
        V v = c7398.get(this.f20050);
        v.getClass();
        c7398.put(this.f20050, new C7395(((C7395) v).f20057, obj));
        c7398.put(obj, new C7395(this.f20050));
        this.f20050 = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f20048.clear();
        C7335 c7335 = C7335.f19553;
        this.f20049 = c7335;
        this.f20050 = c7335;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f20048.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC4351
    public final int getSize() {
        return this.f20048.f20066;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C7392(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C7398 c7398 = this.f20048;
        C7395 c7395 = (C7395) c7398.remove(obj);
        if (c7395 == null) {
            return false;
        }
        Object obj2 = c7395.f20056;
        Object obj3 = c7395.f20057;
        C7335 c7335 = C7335.f19553;
        if (obj3 != c7335) {
            V v = c7398.get(obj3);
            v.getClass();
            c7398.put(obj3, new C7395(((C7395) v).f20057, obj2));
        } else {
            this.f20049 = obj2;
        }
        if (obj2 == c7335) {
            this.f20050 = obj3;
            return true;
        }
        V v2 = c7398.get(obj2);
        v2.getClass();
        c7398.put(obj2, new C7395(obj3, ((C7395) v2).f20056));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7394 m12538() {
        C7400 c7400Mo2163 = this.f20048.mo2163();
        C7394 c7394 = this.f20051;
        if (c7400Mo2163 != c7394.f20054) {
            c7394 = new C7394(this.f20049, this.f20050, c7400Mo2163);
        }
        this.f20051 = c7394;
        return c7394;
    }
}
