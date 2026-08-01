package p136b0;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p065M2.C1004g;
import p095T.AbstractC1384r0;
import p095T.InterfaceC1345W0;
import p117X2.AbstractC1665j;
import p119Y.C1719c;
import p119Y.C1722f;
import p119Y.C1728l;
import p122Y2.InterfaceC1768c;
import p129a0.C1786a;
import p129a0.C1787b;

/* JADX INFO: renamed from: b0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1846h extends AbstractMap implements Map, InterfaceC1768c {

    /* JADX INFO: renamed from: d */
    public C1787b f6249d = new C1787b();

    /* JADX INFO: renamed from: e */
    public C1728l f6250e;

    /* JADX INFO: renamed from: f */
    public Object f6251f;

    /* JADX INFO: renamed from: g */
    public int f6252g;

    /* JADX INFO: renamed from: h */
    public int f6253h;

    /* JADX INFO: renamed from: i */
    public C1847i f6254i;

    public C1846h(C1847i c1847i) {
        this.f6250e = c1847i.f5959d;
        this.f6253h = c1847i.f5960e;
        this.f6254i = c1847i;
    }

    /* JADX INFO: renamed from: a */
    public final C1847i m3306a() {
        C1728l c1728l = this.f6250e;
        C1847i c1847i = this.f6254i;
        if (c1728l != c1847i.f5959d) {
            this.f6249d = new C1787b();
            c1847i = new C1847i(this.f6250e, this.f6253h);
        }
        this.f6254i = c1847i;
        return c1847i;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3307b(Object obj) {
        return this.f6250e.m3064d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    /* JADX INFO: renamed from: c */
    public final Object m3308c(Object obj) {
        return this.f6250e.m3067g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f6250e = C1728l.f5976e;
        m3310e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC1384r0) {
            return m3307b((AbstractC1384r0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof InterfaceC1345W0) {
            return super.containsValue((InterfaceC1345W0) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Object m3309d(Object obj) {
        this.f6251f = null;
        C1728l c1728lM3073n = this.f6250e.m3073n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (c1728lM3073n == null) {
            c1728lM3073n = C1728l.f5976e;
        }
        this.f6250e = c1728lM3073n;
        return this.f6251f;
    }

    /* JADX INFO: renamed from: e */
    public final void m3310e(int i5) {
        this.f6253h = i5;
        this.f6252g++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new C1722f(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC1384r0) {
            return (InterfaceC1345W0) m3308c((AbstractC1384r0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC1384r0) ? obj2 : (InterfaceC1345W0) super.getOrDefault((AbstractC1384r0) obj, (InterfaceC1345W0) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new C1722f(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f6251f = null;
        this.f6250e = this.f6250e.m3071l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f6251f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        C1719c c1719cM3306a = null;
        C1719c c1719c = map instanceof C1719c ? (C1719c) map : null;
        if (c1719c == null) {
            C1846h c1846h = map instanceof C1846h ? (C1846h) map : null;
            if (c1846h != null) {
                c1719cM3306a = c1846h.m3306a();
            }
        } else {
            c1719cM3306a = c1719c;
        }
        if (c1719cM3306a == null) {
            super.putAll(map);
            return;
        }
        C1786a c1786a = new C1786a();
        c1786a.f6102a = 0;
        int i5 = this.f6253h;
        C1728l c1728l = this.f6250e;
        C1728l c1728l2 = c1719cM3306a.f5959d;
        AbstractC1665j.m2983c(c1728l2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f6250e = c1728l.m3072m(c1728l2, 0, c1786a, this);
        int i6 = (c1719cM3306a.f5960e + i5) - c1786a.f6102a;
        if (i5 != i6) {
            m3310e(i6);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i5 = this.f6253h;
        C1728l c1728lM3074o = this.f6250e.m3074o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (c1728lM3074o == null) {
            c1728lM3074o = C1728l.f5976e;
        }
        this.f6250e = c1728lM3074o;
        return i5 != this.f6253h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6253h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new C1004g(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC1384r0) {
            return (InterfaceC1345W0) m3309d((AbstractC1384r0) obj);
        }
        return null;
    }
}
