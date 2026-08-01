package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C1104 extends C1130 implements Map {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C1107 f1277;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C1109 f1278;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C1105 f1279;

    public C1104(C1104 c1104) {
        super(0);
        mo1429(c1104);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C1109 c1109 = this.f1278;
        if (c1109 != null) {
            return c1109;
        }
        C1109 c11092 = new C1109(0, this);
        this.f1278 = c11092;
        return c11092;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1107 c1107 = this.f1277;
        if (c1107 != null) {
            return c1107;
        }
        C1107 c11072 = new C1107(this);
        this.f1277 = c11072;
        return c11072;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m1426(map.size() + this.f1339);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C1105 c1105 = this.f1279;
        if (c1105 != null) {
            return c1105;
        }
        C1105 c11052 = new C1105(this);
        this.f1279 = c11052;
        return c11052;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m1380(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m1381(Collection collection) {
        int i = this.f1339;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f1339;
    }
}
