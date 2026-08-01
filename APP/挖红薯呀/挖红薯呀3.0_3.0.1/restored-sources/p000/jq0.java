package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class jq0 extends AbstractC0038b0 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2931d;

    /* JADX INFO: renamed from: e */
    public final eq0 f2932e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ jq0(int i, eq0 eq0Var) {
        this.f2931d = i;
        this.f2932e = eq0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0038b0
    /* JADX INFO: renamed from: a */
    public final int mo230a() {
        switch (this.f2931d) {
        }
        return this.f2932e.f1508h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f2931d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f2931d) {
            case 0:
                this.f2932e.clear();
                break;
            default:
                this.f2932e.clear();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f2931d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                eq0 eq0Var = this.f2932e;
                Object obj2 = eq0Var.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && eq0Var.containsKey(entry.getKey());
            default:
                return this.f2932e.containsKey(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f2931d) {
            case 0:
                return new C0016af(this.f2932e);
            default:
                m91[] m91VarArr = new m91[8];
                for (int i = 0; i < 8; i++) {
                    m91VarArr[i] = new n91(1);
                }
                return new kq0(this.f2932e, m91VarArr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f2931d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f2932e.remove(entry.getKey(), entry.getValue());
            default:
                eq0 eq0Var = this.f2932e;
                if (!eq0Var.containsKey(obj)) {
                    return false;
                }
                eq0Var.remove(obj);
                return true;
        }
    }
}
