package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lb1 implements Map.Entry {
    public lb1 h;
    public lb1 i;
    public lb1 j;
    public lb1 k;
    public lb1 l;
    public final Object m;
    public final boolean n;
    public Object o;
    public int p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public lb1(boolean z, lb1 lb1Var, Object obj, lb1 lb1Var2, lb1 lb1Var3) {
        this.h = lb1Var;
        this.m = obj;
        this.n = z;
        this.p = 1;
        this.k = lb1Var2;
        this.l = lb1Var3;
        lb1Var3.k = this;
        lb1Var2.l = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.m;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.o;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.m;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.o;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.n) {
            um2.f("value == null");
            return null;
        }
        Object obj2 = this.o;
        this.o = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.m + "=" + this.o;
    }

    public lb1(boolean z) {
        this.m = null;
        this.n = z;
        this.l = this;
        this.k = this;
    }
}
