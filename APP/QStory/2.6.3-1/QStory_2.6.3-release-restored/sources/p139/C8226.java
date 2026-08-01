package p139;

import androidx.compose.p001ui.graphics.vector.C2376;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractC5184;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8226 extends AbstractC5184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C8228 f20398;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f20399;

    public /* synthetic */ C8226(int i, C8228 c8228) {
        this.f20399 = i;
        this.f20398 = c8228;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f20399) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f20399) {
            case 0:
                this.f20398.clear();
                break;
            default:
                this.f20398.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f20399) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C8228 c8228 = this.f20398;
                Object obj2 = c8228.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && c8228.containsKey(entry.getKey());
            default:
                return this.f20398.containsKey(obj);
        }
    }

    @Override // kotlin.collections.AbstractC5184
    public final int getSize() {
        switch (this.f20399) {
        }
        return this.f20398.f20406;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f20399) {
            case 0:
                return new C2376(this.f20398);
            default:
                AbstractC8237[] abstractC8237Arr = new AbstractC8237[8];
                for (int i = 0; i < 8; i++) {
                    abstractC8237Arr[i] = new C8233(1);
                }
                return new C8235(this.f20398, abstractC8237Arr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f20399) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f20398.remove(entry.getKey(), entry.getValue());
            default:
                C8228 c8228 = this.f20398;
                if (!c8228.containsKey(obj)) {
                    return false;
                }
                c8228.remove(obj);
                return true;
        }
    }
}
