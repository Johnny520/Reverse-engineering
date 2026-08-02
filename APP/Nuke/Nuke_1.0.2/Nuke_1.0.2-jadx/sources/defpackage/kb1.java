package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kb1 extends AbstractSet {
    public final /* synthetic */ int h;
    public final /* synthetic */ Map i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ kb1(Map map, int i) {
        this.h = i;
        this.i = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int i = this.h;
        Map map = this.i;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        lb1 lb1VarA;
        int i = this.h;
        Map map = this.i;
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
                        lb1VarA = mb1Var.a(key, false);
                    } catch (ClassCastException unused) {
                        lb1VarA = null;
                    }
                    break;
                } else {
                    lb1VarA = null;
                }
                if (lb1VarA != null && Objects.equals(lb1VarA.o, entry.getValue())) {
                    lb1Var = lb1VarA;
                }
                return lb1Var != null;
            case 1:
                return ((mb1) map).containsKey(obj);
            default:
                return super.contains(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.h;
        Map map = this.i;
        switch (i) {
            case 0:
                return new jb1((mb1) map, 0);
            case 1:
                return new jb1((mb1) map, 1);
            default:
                return new fg((hg) map);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        lb1 lb1VarA;
        int i = this.h;
        lb1 lb1VarA2 = null;
        Map map = this.i;
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
                        lb1VarA = mb1Var.a(key, false);
                    } catch (ClassCastException unused) {
                        lb1VarA = null;
                    }
                    break;
                } else {
                    lb1VarA = null;
                }
                if (lb1VarA != null && Objects.equals(lb1VarA.o, entry.getValue())) {
                    lb1VarA2 = lb1VarA;
                }
                if (lb1VarA2 == null) {
                    return false;
                }
                mb1Var.c(lb1VarA2, true);
                return true;
            case 1:
                mb1 mb1Var2 = (mb1) map;
                if (obj != null) {
                    try {
                        lb1VarA2 = mb1Var2.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (lb1VarA2 != null) {
                    mb1Var2.c(lb1VarA2, true);
                }
                return lb1VarA2 != null;
            default:
                return super.remove(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.h;
        Map map = this.i;
        switch (i) {
            case 0:
                return ((mb1) map).k;
            case 1:
                return ((mb1) map).k;
            default:
                return ((hg) map).j;
        }
    }
}
