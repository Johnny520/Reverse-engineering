package p224q2;

import java.util.Map;

/* JADX INFO: renamed from: q2.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2922m implements Map.Entry {

    /* JADX INFO: renamed from: d */
    public C2922m f9226d;

    /* JADX INFO: renamed from: e */
    public C2922m f9227e;

    /* JADX INFO: renamed from: f */
    public C2922m f9228f;

    /* JADX INFO: renamed from: g */
    public C2922m f9229g;

    /* JADX INFO: renamed from: h */
    public C2922m f9230h;

    /* JADX INFO: renamed from: i */
    public final Object f9231i;

    /* JADX INFO: renamed from: j */
    public final boolean f9232j;

    /* JADX INFO: renamed from: k */
    public Object f9233k;

    /* JADX INFO: renamed from: l */
    public int f9234l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2922m(boolean z5) {
        this.f9231i = null;
        this.f9232j = z5;
        this.f9230h = this;
        this.f9229g = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f9231i;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f9233k;
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
        return this.f9231i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9233k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f9231i;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f9233k;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f9232j) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f9233k;
        this.f9233k = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f9231i + "=" + this.f9233k;
    }

    public C2922m(boolean z5, C2922m c2922m, Object obj, C2922m c2922m2, C2922m c2922m3) {
        this.f9226d = c2922m;
        this.f9231i = obj;
        this.f9232j = z5;
        this.f9234l = 1;
        this.f9229g = c2922m2;
        this.f9230h = c2922m3;
        c2922m3.f9229g = this;
        c2922m2.f9230h = this;
    }
}
