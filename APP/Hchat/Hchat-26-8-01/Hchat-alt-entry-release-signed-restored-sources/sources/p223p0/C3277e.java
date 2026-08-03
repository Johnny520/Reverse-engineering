package p223p0;

import java.util.Iterator;
import java.util.Map;
import p176m1.C2731f0;
import p266s0.C3877g;
import tf.AbstractC4161h;

/* JADX INFO: renamed from: p0.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3277e extends AbstractC4161h {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f10433g;

    /* JADX INFO: renamed from: h */
    public final C3877g f10434h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3277e(int i9, C3877g c3877g) {
        this.f10433g = i9;
        this.f10434h = c3877g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4161h
    /* JADX INFO: renamed from: a */
    public final int mo6942a() {
        switch (this.f10433g) {
        }
        return this.f10434h.f12731k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f10433g) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f10433g) {
            case 0:
                this.f10434h.clear();
                break;
            default:
                this.f10434h.clear();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f10433g) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C3877g c3877g = this.f10434h;
                Object obj2 = c3877g.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && c3877g.containsKey(entry.getKey());
            default:
                return this.f10434h.containsKey(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f10433g) {
            case 0:
                return new C2731f0(this.f10434h);
            default:
                AbstractC3283k[] abstractC3283kArr = new AbstractC3283k[8];
                for (int i9 = 0; i9 < 8; i9++) {
                    abstractC3283kArr[i9] = new C3284l(1);
                }
                return new C3278f(this.f10434h, abstractC3283kArr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f10433g) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f10434h.remove(entry.getKey(), entry.getValue());
            default:
                C3877g c3877g = this.f10434h;
                if (!c3877g.containsKey(obj)) {
                    return false;
                }
                c3877g.remove(obj);
                return true;
        }
    }
}
