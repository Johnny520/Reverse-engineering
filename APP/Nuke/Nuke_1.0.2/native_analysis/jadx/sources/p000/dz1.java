package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dz1 extends AbstractC0004a3 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2269h;

    /* JADX INFO: renamed from: i */
    public final bz1 f2270i;

    public /* synthetic */ dz1(int i, bz1 bz1Var) {
        this.f2269h = i;
        this.f2270i = bz1Var;
    }

    @Override // p000.AbstractC0004a3
    /* JADX INFO: renamed from: a */
    public final int mo21a() {
        switch (this.f2269h) {
        }
        return this.f2270i.f1087m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f2269h) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f2269h) {
            case 0:
                this.f2270i.clear();
                break;
            default:
                this.f2270i.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f2269h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                bz1 bz1Var = this.f2270i;
                Object obj2 = bz1Var.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && bz1Var.containsKey(entry.getKey());
            default:
                return this.f2270i.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f2269h) {
            case 0:
                return new ez1(this.f2270i);
            default:
                i43[] i43VarArr = new i43[8];
                for (int i = 0; i < 8; i++) {
                    i43VarArr[i] = new j43(1);
                }
                return new fz1(this.f2270i, i43VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f2269h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f2270i.remove(entry.getKey(), entry.getValue());
            default:
                bz1 bz1Var = this.f2270i;
                if (!bz1Var.containsKey(obj)) {
                    return false;
                }
                bz1Var.remove(obj);
                return true;
        }
    }
}
