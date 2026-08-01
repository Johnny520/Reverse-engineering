package p123;

import androidx.compose.ui.graphics.vector.C1541;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractC4351;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7396 extends AbstractC4351 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7398 f20058;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f20059;

    public /* synthetic */ C7396(int i, C7398 c7398) {
        this.f20059 = i;
        this.f20058 = c7398;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f20059) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f20059) {
            case 0:
                this.f20058.clear();
                break;
            default:
                this.f20058.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f20059) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C7398 c7398 = this.f20058;
                Object obj2 = c7398.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && c7398.containsKey(entry.getKey());
            default:
                return this.f20058.containsKey(obj);
        }
    }

    @Override // kotlin.collections.AbstractC4351
    public final int getSize() {
        switch (this.f20059) {
        }
        return this.f20058.f20066;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f20059) {
            case 0:
                return new C1541(this.f20058);
            default:
                AbstractC7407[] abstractC7407Arr = new AbstractC7407[8];
                for (int i = 0; i < 8; i++) {
                    abstractC7407Arr[i] = new C7403(1);
                }
                return new C7405(this.f20058, abstractC7407Arr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f20059) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f20058.remove(entry.getKey(), entry.getValue());
            default:
                C7398 c7398 = this.f20058;
                if (!c7398.containsKey(obj)) {
                    return false;
                }
                c7398.remove(obj);
                return true;
        }
    }
}
