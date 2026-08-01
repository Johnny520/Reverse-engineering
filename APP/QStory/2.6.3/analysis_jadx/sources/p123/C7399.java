package p123;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p054.InterfaceC6563;
import p115.C7336;
import p115.C7337;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C7399 extends AbstractMap implements Map, InterfaceC6563 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f20059;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f20060;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f20061;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C7336 f20062 = new C7336();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C7407 f20063;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C7401 f20064;

    public C7399(C7401 c7401) {
        this.f20064 = c7401;
        this.f20063 = c7401.f20070;
        this.f20061 = c7401.f20069;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f20063 = C7407.f20076;
        m12569(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f20063.m12576(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new C7397(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f20063.m12593(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new C7397(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f20060 = null;
        this.f20063 = this.f20063.m12595(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f20060;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        C7401 c7401Mo2173 = null;
        C7401 c7401 = map instanceof C7401 ? (C7401) map : null;
        if (c7401 == null) {
            C7399 c7399 = map instanceof C7399 ? (C7399) map : null;
            if (c7399 != null) {
                c7401Mo2173 = c7399.mo2173();
            }
        } else {
            c7401Mo2173 = c7401;
        }
        if (c7401Mo2173 == null) {
            super.putAll(map);
            return;
        }
        C7337 c7337 = new C7337();
        c7337.f19549 = 0;
        int i = this.f20061;
        C7407 c7407 = this.f20063;
        C7407 c74072 = c7401Mo2173.f20070;
        c74072.getClass();
        this.f20063 = c7407.m12587(c74072, 0, c7337, this);
        int i2 = (c7401Mo2173.f20069 + i) - c7337.f19549;
        if (i != i2) {
            m12569(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.f20061;
        C7407 c7407M12590 = this.f20063.m12590(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (c7407M12590 == null) {
            c7407M12590 = C7407.f20076;
        }
        this.f20063 = c7407M12590;
        return i != this.f20061;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f20061;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new C7405(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12569(int i) {
        this.f20061 = i;
        this.f20059++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public /* bridge */ C7401 mo2173() {
        return mo2173();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public C7401 mo2173() {
        C7407 c7407 = this.f20063;
        C7401 c7401 = this.f20064;
        if (c7407 != c7401.f20070) {
            this.f20062 = new C7336();
            c7401 = new C7401(this.f20063, this.f20061);
        }
        this.f20064 = c7401;
        return c7401;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f20060 = null;
        C7407 c7407M12586 = this.f20063.m12586(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (c7407M12586 == null) {
            c7407M12586 = C7407.f20076;
        }
        this.f20063 = c7407M12586;
        return this.f20060;
    }
}
