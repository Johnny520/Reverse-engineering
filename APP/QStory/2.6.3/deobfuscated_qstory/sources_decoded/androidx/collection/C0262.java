package androidx.collection;

import com.google.protobuf.C3347;
import com.google.protobuf.C3350;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.C4696;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C0262 extends AbstractSet {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Map f946;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f947;

    public /* synthetic */ C0262(int i, Map map) {
        this.f947 = i;
        this.f946 = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i = this.f947;
        Map map = this.f946;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((C3350) map).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((C4696) map).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f947;
        Map map = this.f946;
        switch (i) {
            case 1:
                ((C3350) map).clear();
                break;
            case 2:
                ((C4696) map).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        int i = this.f947;
        Map map = this.f946;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((C3350) map).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 != value) {
                    return obj2 != null && obj2.equals(value);
                }
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((C4696) map).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj3 != value2) {
                    return obj3 != null && obj3.equals(value2);
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i = this.f947;
        Map map = this.f946;
        switch (i) {
            case 0:
                return new C0259((C0257) map);
            case 1:
                return new C3347((C3350) map, 0);
            default:
                return new C3347((C4696) map, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int i = this.f947;
        Map map = this.f946;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((C3350) map).remove(entry.getKey());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((C4696) map).remove(entry2.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.f947;
        Map map = this.f946;
        switch (i) {
            case 0:
                return ((C0257) map).f994;
            case 1:
                return ((C3350) map).size();
            default:
                return ((C4696) map).size();
        }
    }
}
