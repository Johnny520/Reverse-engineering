package Yue;

import Yue.C7209;
import Yue.InterfaceC7144;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C4791<K, V> extends C7209<K, V> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final HashMap<K, C7209.C7210<K, V>> f10723 = new HashMap<>();

    public boolean contains(K k) {
        return this.f10723.containsKey(k);
    }

    @Override // Yue.C7209
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public C7209.C7210<K, V> mo1695(K k) {
        return this.f10723.get(k);
    }

    @Override // Yue.C7209
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public V mo14467(@InterfaceC6391 K k, @InterfaceC6391 V v) {
        C7209.C7210<K, V> c7210Mo1695 = mo1695(k);
        if (c7210Mo1695 != null) {
            return c7210Mo1695.f21782;
        }
        this.f10723.put(k, m22588(k, v));
        return null;
    }

    @Override // Yue.C7209
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public V mo14468(@InterfaceC6391 K k) {
        V v = (V) super.mo14468(k);
        this.f10723.remove(k);
        return v;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Map.Entry<K, V> m14469(K k) {
        if (contains(k)) {
            return this.f10723.get(k).f21784;
        }
        return null;
    }
}
