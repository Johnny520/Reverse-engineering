package p000a;

import java.util.HashMap;
import p000a.C0124Gd;

/* JADX INFO: renamed from: a.m6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0704m6<K, V> extends C0124Gd<K, V> {

    /* JADX INFO: renamed from: e */
    public final HashMap<K, C0124Gd.c<K, V>> f2652e = new HashMap<>();

    @Override // p000a.C0124Gd
    /* JADX INFO: renamed from: a */
    public final C0124Gd.c<K, V> mo324a(K k) {
        return this.f2652e.get(k);
    }

    @Override // p000a.C0124Gd
    /* JADX INFO: renamed from: b */
    public final V mo325b(K k) {
        V v = (V) super.mo325b(k);
        this.f2652e.remove(k);
        return v;
    }
}
