package androidx.collection;

import com.google.protobuf.C4179;
import com.google.protobuf.C4182;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.C5528;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C1109 extends AbstractSet {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Map f1291;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1292;

    public /* synthetic */ C1109(int i, Map map) {
        this.f1292 = i;
        this.f1291 = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i = this.f1292;
        Map map = this.f1291;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((C4182) map).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((C5528) map).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f1292;
        Map map = this.f1291;
        switch (i) {
            case 1:
                ((C4182) map).clear();
                break;
            case 2:
                ((C5528) map).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        int i = this.f1292;
        Map map = this.f1291;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((C4182) map).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 != value) {
                    return obj2 != null && obj2.equals(value);
                }
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((C5528) map).get(entry2.getKey());
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
        int i = this.f1292;
        Map map = this.f1291;
        switch (i) {
            case 0:
                return new C1106((C1104) map);
            case 1:
                return new C4179((C4182) map, 0);
            default:
                return new C4179((C5528) map, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int i = this.f1292;
        Map map = this.f1291;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((C4182) map).remove(entry.getKey());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((C5528) map).remove(entry2.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.f1292;
        Map map = this.f1291;
        switch (i) {
            case 0:
                return ((C1104) map).f1339;
            case 1:
                return ((C4182) map).size();
            default:
                return ((C5528) map).size();
        }
    }
}
