package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kb1 extends AbstractSet {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5437h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Map f5438i;

    public /* synthetic */ kb1(Map map, int i) {
        this.f5437h = i;
        this.f5438i = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f5437h;
        Map map = this.f5438i;
        switch (i) {
            case 0:
                ((mb1) map).clear();
                break;
            case 1:
                ((mb1) map).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        lb1 lb1VarM3051a;
        int i = this.f5437h;
        Map map = this.f5438i;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                mb1 mb1Var = (mb1) map;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                lb1 lb1Var = null;
                if (key != null) {
                    try {
                        lb1VarM3051a = mb1Var.m3051a(key, false);
                    } catch (ClassCastException unused) {
                        lb1VarM3051a = null;
                    }
                    break;
                } else {
                    lb1VarM3051a = null;
                }
                if (lb1VarM3051a != null && Objects.equals(lb1VarM3051a.f6028o, entry.getValue())) {
                    lb1Var = lb1VarM3051a;
                }
                return lb1Var != null;
            case 1:
                return ((mb1) map).containsKey(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f5437h;
        Map map = this.f5438i;
        switch (i) {
            case 0:
                return new jb1((mb1) map, 0);
            case 1:
                return new jb1((mb1) map, 1);
            default:
                return new C0202fg((C0276hg) map);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        lb1 lb1VarM3051a;
        int i = this.f5437h;
        lb1 lb1VarM3051a2 = null;
        Map map = this.f5438i;
        switch (i) {
            case 0:
                mb1 mb1Var = (mb1) map;
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                if (key != null) {
                    try {
                        lb1VarM3051a = mb1Var.m3051a(key, false);
                    } catch (ClassCastException unused) {
                        lb1VarM3051a = null;
                    }
                    break;
                } else {
                    lb1VarM3051a = null;
                }
                if (lb1VarM3051a != null && Objects.equals(lb1VarM3051a.f6028o, entry.getValue())) {
                    lb1VarM3051a2 = lb1VarM3051a;
                }
                if (lb1VarM3051a2 == null) {
                    return false;
                }
                mb1Var.m3053c(lb1VarM3051a2, true);
                return true;
            case 1:
                mb1 mb1Var2 = (mb1) map;
                if (obj != null) {
                    try {
                        lb1VarM3051a2 = mb1Var2.m3051a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (lb1VarM3051a2 != null) {
                    mb1Var2.m3053c(lb1VarM3051a2, true);
                }
                return lb1VarM3051a2 != null;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.f5437h;
        Map map = this.f5438i;
        switch (i) {
            case 0:
                return ((mb1) map).f6546k;
            case 1:
                return ((mb1) map).f6546k;
            default:
                return ((C0276hg) map).f11446j;
        }
    }
}
