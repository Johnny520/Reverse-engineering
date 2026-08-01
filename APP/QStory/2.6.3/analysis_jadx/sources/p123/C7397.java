package p123;

import androidx.compose.ui.graphics.vector.C1541;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractC4352;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7397 extends AbstractC4352 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7399 f20053;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f20054;

    public /* synthetic */ C7397(int i, C7399 c7399) {
        this.f20054 = i;
        this.f20053 = c7399;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f20054) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f20054) {
            case 0:
                this.f20053.clear();
                break;
            default:
                this.f20053.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f20054) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C7399 c7399 = this.f20053;
                Object obj2 = c7399.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && c7399.containsKey(entry.getKey());
            default:
                return this.f20053.containsKey(obj);
        }
    }

    @Override // kotlin.collections.AbstractC4352
    public final int getSize() {
        switch (this.f20054) {
        }
        return this.f20053.f20061;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f20054) {
            case 0:
                return new C1541(this.f20053);
            default:
                AbstractC7408[] abstractC7408Arr = new AbstractC7408[8];
                for (int i = 0; i < 8; i++) {
                    abstractC7408Arr[i] = new C7404(1);
                }
                return new C7406(this.f20053, abstractC7408Arr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f20054) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f20053.remove(entry.getKey(), entry.getValue());
            default:
                C7399 c7399 = this.f20053;
                if (!c7399.containsKey(obj)) {
                    return false;
                }
                c7399.remove(obj);
                return true;
        }
    }
}
