package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C0257 extends C0283 implements Map {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C0260 f932;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C0262 f933;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C0258 f934;

    public C0257(C0257 c0257) {
        super(0);
        mo869(c0257);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0262 c0262 = this.f933;
        if (c0262 != null) {
            return c0262;
        }
        C0262 c02622 = new C0262(0, this);
        this.f933 = c02622;
        return c02622;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0260 c0260 = this.f932;
        if (c0260 != null) {
            return c0260;
        }
        C0260 c02602 = new C0260(this);
        this.f932 = c02602;
        return c02602;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m866(map.size() + this.f994);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C0258 c0258 = this.f934;
        if (c0258 != null) {
            return c0258;
        }
        C0258 c02582 = new C0258(this);
        this.f934 = c02582;
        return c02582;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m820(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m821(Collection collection) {
        int i = this.f994;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f994;
    }
}
