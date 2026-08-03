package Yue;

import java.util.Map;
import java.util.Map.Entry;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2994<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractC2998<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return m60((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return mo5809((Map.Entry) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m60(@InterfaceC6399 E e) {
        C5499.m17103(e, "element");
        return mo5808(e);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public abstract boolean mo5808(@InterfaceC6399 Map.Entry<? extends K, ? extends V> entry);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public /* bridge */ boolean mo5809(Map.Entry<?, ?> entry) {
        return super.remove(entry);
    }
}
