package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4395;
import p054.InterfaceC6563;
import p123.C7399;
import p123.C7401;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1277 implements InterfaceC1257, Map, InterfaceC6563 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C1279 f3723;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1279 f3724;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1279 f3725;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C1273 f3726;

    public C1277() {
        C7401 c7401 = C7401.f20068;
        AbstractC1286 abstractC1286M2280 = AbstractC1280.m2280();
        C1273 c1273 = new C1273(abstractC1286M2280.mo2210(), c7401);
        if (!(abstractC1286M2280 instanceof C1272)) {
            c1273.f3646 = new C1273(1L, c7401);
        }
        this.f3726 = c1273;
        this.f3724 = new C1279(this, 0);
        this.f3725 = new C1279(this, 1);
        this.f3723 = new C1279(this, 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m2251(C1277 c1277, C1273 c1273, int i, C7401 c7401) {
        boolean z;
        synchronized (AbstractC1274.f3706) {
            int i2 = c1273.f3703;
            if (i2 == i) {
                c1273.f3704 = c7401;
                z = true;
                c1273.f3703 = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // java.util.Map
    public final void clear() {
        AbstractC1286 abstractC1286M2280;
        C1273 c1273 = this.f3726;
        c1273.getClass();
        C1273 c12732 = (C1273) AbstractC1280.m2275(c1273);
        C7401 c7401 = C7401.f20068;
        if (c7401 != c12732.f3704) {
            C1273 c12733 = this.f3726;
            c12733.getClass();
            synchronized (AbstractC1280.f3745) {
                abstractC1286M2280 = AbstractC1280.m2280();
                C1273 c12734 = (C1273) AbstractC1280.m2266(c12733, this, abstractC1286M2280);
                synchronized (AbstractC1274.f3706) {
                    c12734.f3704 = c7401;
                    c12734.f3703++;
                }
            }
            AbstractC1280.m2269(abstractC1286M2280, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m2252().f3704.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m2252().f3704.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f3724;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return m2252().f3704.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return m2252().f3704.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f3725;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        C7401 c7401;
        int i;
        Object objPut;
        AbstractC1286 abstractC1286M2280;
        boolean zM2251;
        do {
            synchronized (AbstractC1274.f3706) {
                C1273 c1273 = this.f3726;
                c1273.getClass();
                C1273 c12732 = (C1273) AbstractC1280.m2275(c1273);
                c7401 = c12732.f3704;
                i = c12732.f3703;
            }
            c7401.getClass();
            C7399 c7399Mo2187 = c7401.mo2187();
            objPut = c7399Mo2187.put(obj, obj2);
            C7401 c7401Mo2173 = c7399Mo2187.mo2173();
            if (AbstractC4395.m8907(c7401Mo2173, c7401)) {
                break;
            }
            C1273 c12733 = this.f3726;
            c12733.getClass();
            synchronized (AbstractC1280.f3745) {
                abstractC1286M2280 = AbstractC1280.m2280();
                zM2251 = m2251(this, (C1273) AbstractC1280.m2266(c12733, this, abstractC1286M2280), i, c7401Mo2173);
            }
            AbstractC1280.m2269(abstractC1286M2280, this);
        } while (!zM2251);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        C7401 c7401;
        int i;
        AbstractC1286 abstractC1286M2280;
        boolean zM2251;
        do {
            synchronized (AbstractC1274.f3706) {
                C1273 c1273 = this.f3726;
                c1273.getClass();
                C1273 c12732 = (C1273) AbstractC1280.m2275(c1273);
                c7401 = c12732.f3704;
                i = c12732.f3703;
            }
            c7401.getClass();
            C7399 c7399Mo2187 = c7401.mo2187();
            c7399Mo2187.putAll(map);
            C7401 c7401Mo2173 = c7399Mo2187.mo2173();
            if (AbstractC4395.m8907(c7401Mo2173, c7401)) {
                return;
            }
            C1273 c12733 = this.f3726;
            c12733.getClass();
            synchronized (AbstractC1280.f3745) {
                abstractC1286M2280 = AbstractC1280.m2280();
                zM2251 = m2251(this, (C1273) AbstractC1280.m2266(c12733, this, abstractC1286M2280), i, c7401Mo2173);
            }
            AbstractC1280.m2269(abstractC1286M2280, this);
        } while (!zM2251);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        C7401 c7401;
        int i;
        V vRemove;
        AbstractC1286 abstractC1286M2280;
        boolean zM2251;
        do {
            synchronized (AbstractC1274.f3706) {
                C1273 c1273 = this.f3726;
                c1273.getClass();
                C1273 c12732 = (C1273) AbstractC1280.m2275(c1273);
                c7401 = c12732.f3704;
                i = c12732.f3703;
            }
            c7401.getClass();
            C7399 c7399Mo2187 = c7401.mo2187();
            vRemove = c7399Mo2187.remove(obj);
            C7401 c7401Mo2173 = c7399Mo2187.mo2173();
            if (AbstractC4395.m8907(c7401Mo2173, c7401)) {
                break;
            }
            C1273 c12733 = this.f3726;
            c12733.getClass();
            synchronized (AbstractC1280.f3745) {
                abstractC1286M2280 = AbstractC1280.m2280();
                zM2251 = m2251(this, (C1273) AbstractC1280.m2266(c12733, this, abstractC1286M2280), i, c7401Mo2173);
            }
            AbstractC1280.m2269(abstractC1286M2280, this);
        } while (!zM2251);
        return vRemove;
    }

    @Override // java.util.Map
    public final int size() {
        C7401 c7401 = m2252().f3704;
        c7401.getClass();
        return c7401.f20069;
    }

    public final String toString() {
        C1273 c1273 = this.f3726;
        c1273.getClass();
        return "SnapshotStateMap(value=" + ((C1273) AbstractC1280.m2275(c1273)).f3704 + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f3723;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final AbstractC1255 mo2193() {
        return this.f3726;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2194(AbstractC1255 abstractC1255) {
        this.f3726 = (C1273) abstractC1255;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1273 m2252() {
        C1273 c1273 = this.f3726;
        c1273.getClass();
        return (C1273) AbstractC1280.m2264(c1273, this);
    }
}
