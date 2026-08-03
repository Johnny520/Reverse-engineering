package Yue;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3394<K, V> extends C7467<K, V> implements Map<K, V> {

    @InterfaceC6490
    AbstractC5934<K, V> mCollections;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۨۡ$ۥ */
    public class C0128 extends AbstractC5934<K, V> {
        public C0128() {
        }

        @Override // Yue.AbstractC5934
        /* JADX INFO: renamed from: ۥ */
        public void mo480() {
            C3394.this.clear();
        }

        @Override // Yue.AbstractC5934
        /* JADX INFO: renamed from: ۥ۟ */
        public Object mo481(int i, int i2) {
            return C3394.this.mArray[(i << 1) + i2];
        }

        @Override // Yue.AbstractC5934
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Map<K, V> mo7003() {
            return C3394.this;
        }

        @Override // Yue.AbstractC5934
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int mo7004() {
            return C3394.this.mSize;
        }

        @Override // Yue.AbstractC5934
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int mo7005(Object obj) {
            return C3394.this.indexOfKey(obj);
        }

        @Override // Yue.AbstractC5934
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int mo7006(Object obj) {
            return C3394.this.indexOfValue(obj);
        }

        @Override // Yue.AbstractC5934
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void mo7007(K k, V v) {
            C3394.this.put(k, v);
        }

        @Override // Yue.AbstractC5934
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void mo7008(int i) {
            C3394.this.removeAt(i);
        }

        @Override // Yue.AbstractC5934
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public V mo7009(int i, V v) {
            return C3394.this.setValueAt(i, v);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3394() {
    }

    public boolean containsAll(@InterfaceC6391 Collection<?> collection) {
        return AbstractC5934.m18549(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m7002().m18553();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m7002().m18554();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        ensureCapacity(this.mSize + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean removeAll(@InterfaceC6391 Collection<?> collection) {
        return AbstractC5934.m18551(this, collection);
    }

    public boolean retainAll(@InterfaceC6391 Collection<?> collection) {
        return AbstractC5934.m18552(this, collection);
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m7002().m18555();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final AbstractC5934<K, V> m7002() {
        if (this.mCollections == null) {
            this.mCollections = new C0128();
        }
        return this.mCollections;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3394(int i) {
        super(i);
    }

    public C3394(C7467 c7467) {
        super(c7467);
    }
}
