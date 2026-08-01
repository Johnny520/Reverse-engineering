package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4394;
import p054.InterfaceC6562;
import p123.C7398;
import p123.C7400;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1277 implements InterfaceC1257, Map, InterfaceC6562 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C1279 f3722;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1279 f3723;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1279 f3724;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C1273 f3725;

    public C1277() {
        C7400 c7400 = C7400.f20073;
        AbstractC1286 abstractC1286M2270 = AbstractC1280.m2270();
        C1273 c1273 = new C1273(abstractC1286M2270.mo2200(), c7400);
        if (!(abstractC1286M2270 instanceof C1272)) {
            c1273.f3645 = new C1273(1L, c7400);
        }
        this.f3725 = c1273;
        this.f3723 = new C1279(this, 0);
        this.f3724 = new C1279(this, 1);
        this.f3722 = new C1279(this, 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m2241(C1277 c1277, C1273 c1273, int i, C7400 c7400) {
        boolean z;
        synchronized (AbstractC1274.f3705) {
            int i2 = c1273.f3702;
            if (i2 == i) {
                c1273.f3703 = c7400;
                z = true;
                c1273.f3702 = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // java.util.Map
    public final void clear() {
        AbstractC1286 abstractC1286M2270;
        C1273 c1273 = this.f3725;
        c1273.getClass();
        C1273 c12732 = (C1273) AbstractC1280.m2265(c1273);
        C7400 c7400 = C7400.f20073;
        if (c7400 != c12732.f3703) {
            C1273 c12733 = this.f3725;
            c12733.getClass();
            synchronized (AbstractC1280.f3744) {
                abstractC1286M2270 = AbstractC1280.m2270();
                C1273 c12734 = (C1273) AbstractC1280.m2256(c12733, this, abstractC1286M2270);
                synchronized (AbstractC1274.f3705) {
                    c12734.f3703 = c7400;
                    c12734.f3702++;
                }
            }
            AbstractC1280.m2259(abstractC1286M2270, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m2242().f3703.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m2242().f3703.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f3723;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return m2242().f3703.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return m2242().f3703.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f3724;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        C7400 c7400;
        int i;
        Object objPut;
        AbstractC1286 abstractC1286M2270;
        boolean zM2241;
        do {
            synchronized (AbstractC1274.f3705) {
                C1273 c1273 = this.f3725;
                c1273.getClass();
                C1273 c12732 = (C1273) AbstractC1280.m2265(c1273);
                c7400 = c12732.f3703;
                i = c12732.f3702;
            }
            c7400.getClass();
            C7398 c7398Mo2177 = c7400.mo2177();
            objPut = c7398Mo2177.put(obj, obj2);
            C7400 c7400Mo2163 = c7398Mo2177.mo2163();
            if (AbstractC4394.m8917(c7400Mo2163, c7400)) {
                break;
            }
            C1273 c12733 = this.f3725;
            c12733.getClass();
            synchronized (AbstractC1280.f3744) {
                abstractC1286M2270 = AbstractC1280.m2270();
                zM2241 = m2241(this, (C1273) AbstractC1280.m2256(c12733, this, abstractC1286M2270), i, c7400Mo2163);
            }
            AbstractC1280.m2259(abstractC1286M2270, this);
        } while (!zM2241);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        C7400 c7400;
        int i;
        AbstractC1286 abstractC1286M2270;
        boolean zM2241;
        do {
            synchronized (AbstractC1274.f3705) {
                C1273 c1273 = this.f3725;
                c1273.getClass();
                C1273 c12732 = (C1273) AbstractC1280.m2265(c1273);
                c7400 = c12732.f3703;
                i = c12732.f3702;
            }
            c7400.getClass();
            C7398 c7398Mo2177 = c7400.mo2177();
            c7398Mo2177.putAll(map);
            C7400 c7400Mo2163 = c7398Mo2177.mo2163();
            if (AbstractC4394.m8917(c7400Mo2163, c7400)) {
                return;
            }
            C1273 c12733 = this.f3725;
            c12733.getClass();
            synchronized (AbstractC1280.f3744) {
                abstractC1286M2270 = AbstractC1280.m2270();
                zM2241 = m2241(this, (C1273) AbstractC1280.m2256(c12733, this, abstractC1286M2270), i, c7400Mo2163);
            }
            AbstractC1280.m2259(abstractC1286M2270, this);
        } while (!zM2241);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        C7400 c7400;
        int i;
        V vRemove;
        AbstractC1286 abstractC1286M2270;
        boolean zM2241;
        do {
            synchronized (AbstractC1274.f3705) {
                C1273 c1273 = this.f3725;
                c1273.getClass();
                C1273 c12732 = (C1273) AbstractC1280.m2265(c1273);
                c7400 = c12732.f3703;
                i = c12732.f3702;
            }
            c7400.getClass();
            C7398 c7398Mo2177 = c7400.mo2177();
            vRemove = c7398Mo2177.remove(obj);
            C7400 c7400Mo2163 = c7398Mo2177.mo2163();
            if (AbstractC4394.m8917(c7400Mo2163, c7400)) {
                break;
            }
            C1273 c12733 = this.f3725;
            c12733.getClass();
            synchronized (AbstractC1280.f3744) {
                abstractC1286M2270 = AbstractC1280.m2270();
                zM2241 = m2241(this, (C1273) AbstractC1280.m2256(c12733, this, abstractC1286M2270), i, c7400Mo2163);
            }
            AbstractC1280.m2259(abstractC1286M2270, this);
        } while (!zM2241);
        return vRemove;
    }

    @Override // java.util.Map
    public final int size() {
        C7400 c7400 = m2242().f3703;
        c7400.getClass();
        return c7400.f20074;
    }

    public final String toString() {
        C1273 c1273 = this.f3725;
        c1273.getClass();
        return "SnapshotStateMap(value=" + ((C1273) AbstractC1280.m2265(c1273)).f3703 + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f3722;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final AbstractC1255 mo2183() {
        return this.f3725;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2184(AbstractC1255 abstractC1255) {
        this.f3725 = (C1273) abstractC1255;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1273 m2242() {
        C1273 c1273 = this.f3725;
        c1273.getClass();
        return (C1273) AbstractC1280.m2254(c1273, this);
    }
}
