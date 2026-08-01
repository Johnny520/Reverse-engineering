package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5227;
import p070.InterfaceC7392;
import p139.C8228;
import p139.C8230;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2112 implements InterfaceC2092, Map, InterfaceC7392 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C2114 f4068;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2114 f4069;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2114 f4070;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C2108 f4071;

    public C2112() {
        C8230 c8230 = C8230.f20413;
        AbstractC2121 abstractC2121M2840 = AbstractC2115.m2840();
        C2108 c2108 = new C2108(abstractC2121M2840.mo2770(), c8230);
        if (!(abstractC2121M2840 instanceof C2107)) {
            c2108.f3991 = new C2108(1L, c8230);
        }
        this.f4071 = c2108;
        this.f4069 = new C2114(this, 0);
        this.f4070 = new C2114(this, 1);
        this.f4068 = new C2114(this, 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m2811(C2112 c2112, C2108 c2108, int i, C8230 c8230) {
        boolean z;
        synchronized (AbstractC2109.f4051) {
            int i2 = c2108.f4048;
            if (i2 == i) {
                c2108.f4049 = c8230;
                z = true;
                c2108.f4048 = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // java.util.Map
    public final void clear() {
        AbstractC2121 abstractC2121M2840;
        C2108 c2108 = this.f4071;
        c2108.getClass();
        C2108 c21082 = (C2108) AbstractC2115.m2835(c2108);
        C8230 c8230 = C8230.f20413;
        if (c8230 != c21082.f4049) {
            C2108 c21083 = this.f4071;
            c21083.getClass();
            synchronized (AbstractC2115.f4090) {
                abstractC2121M2840 = AbstractC2115.m2840();
                C2108 c21084 = (C2108) AbstractC2115.m2826(c21083, this, abstractC2121M2840);
                synchronized (AbstractC2109.f4051) {
                    c21084.f4049 = c8230;
                    c21084.f4048++;
                }
            }
            AbstractC2115.m2829(abstractC2121M2840, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m2812().f4049.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m2812().f4049.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f4069;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return m2812().f4049.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return m2812().f4049.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f4070;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        C8230 c8230;
        int i;
        Object objPut;
        AbstractC2121 abstractC2121M2840;
        boolean zM2811;
        do {
            synchronized (AbstractC2109.f4051) {
                C2108 c2108 = this.f4071;
                c2108.getClass();
                C2108 c21082 = (C2108) AbstractC2115.m2835(c2108);
                c8230 = c21082.f4049;
                i = c21082.f4048;
            }
            c8230.getClass();
            C8228 c8228Mo2747 = c8230.mo2747();
            objPut = c8228Mo2747.put(obj, obj2);
            C8230 c8230Mo2733 = c8228Mo2747.mo2733();
            if (AbstractC5227.m9466(c8230Mo2733, c8230)) {
                break;
            }
            C2108 c21083 = this.f4071;
            c21083.getClass();
            synchronized (AbstractC2115.f4090) {
                abstractC2121M2840 = AbstractC2115.m2840();
                zM2811 = m2811(this, (C2108) AbstractC2115.m2826(c21083, this, abstractC2121M2840), i, c8230Mo2733);
            }
            AbstractC2115.m2829(abstractC2121M2840, this);
        } while (!zM2811);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        C8230 c8230;
        int i;
        AbstractC2121 abstractC2121M2840;
        boolean zM2811;
        do {
            synchronized (AbstractC2109.f4051) {
                C2108 c2108 = this.f4071;
                c2108.getClass();
                C2108 c21082 = (C2108) AbstractC2115.m2835(c2108);
                c8230 = c21082.f4049;
                i = c21082.f4048;
            }
            c8230.getClass();
            C8228 c8228Mo2747 = c8230.mo2747();
            c8228Mo2747.putAll(map);
            C8230 c8230Mo2733 = c8228Mo2747.mo2733();
            if (AbstractC5227.m9466(c8230Mo2733, c8230)) {
                return;
            }
            C2108 c21083 = this.f4071;
            c21083.getClass();
            synchronized (AbstractC2115.f4090) {
                abstractC2121M2840 = AbstractC2115.m2840();
                zM2811 = m2811(this, (C2108) AbstractC2115.m2826(c21083, this, abstractC2121M2840), i, c8230Mo2733);
            }
            AbstractC2115.m2829(abstractC2121M2840, this);
        } while (!zM2811);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        C8230 c8230;
        int i;
        V vRemove;
        AbstractC2121 abstractC2121M2840;
        boolean zM2811;
        do {
            synchronized (AbstractC2109.f4051) {
                C2108 c2108 = this.f4071;
                c2108.getClass();
                C2108 c21082 = (C2108) AbstractC2115.m2835(c2108);
                c8230 = c21082.f4049;
                i = c21082.f4048;
            }
            c8230.getClass();
            C8228 c8228Mo2747 = c8230.mo2747();
            vRemove = c8228Mo2747.remove(obj);
            C8230 c8230Mo2733 = c8228Mo2747.mo2733();
            if (AbstractC5227.m9466(c8230Mo2733, c8230)) {
                break;
            }
            C2108 c21083 = this.f4071;
            c21083.getClass();
            synchronized (AbstractC2115.f4090) {
                abstractC2121M2840 = AbstractC2115.m2840();
                zM2811 = m2811(this, (C2108) AbstractC2115.m2826(c21083, this, abstractC2121M2840), i, c8230Mo2733);
            }
            AbstractC2115.m2829(abstractC2121M2840, this);
        } while (!zM2811);
        return vRemove;
    }

    @Override // java.util.Map
    public final int size() {
        C8230 c8230 = m2812().f4049;
        c8230.getClass();
        return c8230.f20414;
    }

    public final String toString() {
        C2108 c2108 = this.f4071;
        c2108.getClass();
        return "SnapshotStateMap(value=" + ((C2108) AbstractC2115.m2835(c2108)).f4049 + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f4068;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2092
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final AbstractC2090 mo2753() {
        return this.f4071;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2092
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2754(AbstractC2090 abstractC2090) {
        this.f4071 = (C2108) abstractC2090;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2108 m2812() {
        C2108 c2108 = this.f4071;
        c2108.getClass();
        return (C2108) AbstractC2115.m2824(c2108, this);
    }
}
