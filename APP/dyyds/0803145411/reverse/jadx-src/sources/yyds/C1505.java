package yyds;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᛷᛲᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1505 extends C0988 implements Map {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public C0830 f7082;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public C2463 f7083;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C0628 f7084;

    @Override // java.util.Map
    public final Set entrySet() {
        C0628 c0628 = this.f7084;
        if (c0628 != null) {
            return c0628;
        }
        C0628 c06282 = new C0628(this, 2);
        this.f7084 = c06282;
        return c06282;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2463 c2463 = this.f7083;
        if (c2463 != null) {
            return c2463;
        }
        C2463 c24632 = new C2463(this);
        this.f7083 = c24632;
        return c24632;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m2170(map.size() + this.f4500);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C0830 c0830 = this.f7082;
        if (c0830 != null) {
            return c0830;
        }
        C0830 c08302 = new C0830(this);
        this.f7082 = c08302;
        return c08302;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final boolean m3014(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final boolean m3015(Collection collection) {
        int i = this.f4500;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f4500;
    }
}
