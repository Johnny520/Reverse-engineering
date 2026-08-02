package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lb1 implements Map.Entry {

    /* JADX INFO: renamed from: h */
    public lb1 f6021h;

    /* JADX INFO: renamed from: i */
    public lb1 f6022i;

    /* JADX INFO: renamed from: j */
    public lb1 f6023j;

    /* JADX INFO: renamed from: k */
    public lb1 f6024k;

    /* JADX INFO: renamed from: l */
    public lb1 f6025l;

    /* JADX INFO: renamed from: m */
    public final Object f6026m;

    /* JADX INFO: renamed from: n */
    public final boolean f6027n;

    /* JADX INFO: renamed from: o */
    public Object f6028o;

    /* JADX INFO: renamed from: p */
    public int f6029p;

    public lb1(boolean z, lb1 lb1Var, Object obj, lb1 lb1Var2, lb1 lb1Var3) {
        this.f6021h = lb1Var;
        this.f6026m = obj;
        this.f6027n = z;
        this.f6029p = 1;
        this.f6024k = lb1Var2;
        this.f6025l = lb1Var3;
        lb1Var3.f6024k = this;
        lb1Var2.f6025l = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f6026m;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f6028o;
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

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f6026m;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f6028o;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f6026m;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f6028o;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f6027n) {
            um2.m5516f("value == null");
            return null;
        }
        Object obj2 = this.f6028o;
        this.f6028o = obj;
        return obj2;
    }

    public final String toString() {
        return this.f6026m + "=" + this.f6028o;
    }

    public lb1(boolean z) {
        this.f6026m = null;
        this.f6027n = z;
        this.f6025l = this;
        this.f6024k = this;
    }
}
