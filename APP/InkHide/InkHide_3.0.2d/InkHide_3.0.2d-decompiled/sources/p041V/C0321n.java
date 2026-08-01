package p041V;

import java.util.Map;

/* JADX INFO: renamed from: V.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0321n implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public C0321n f708a;

    /* JADX INFO: renamed from: b */
    public C0321n f709b;

    /* JADX INFO: renamed from: c */
    public C0321n f710c;

    /* JADX INFO: renamed from: d */
    public C0321n f711d;

    /* JADX INFO: renamed from: e */
    public C0321n f712e;

    /* JADX INFO: renamed from: f */
    public final Object f713f;

    /* JADX INFO: renamed from: g */
    public final boolean f714g;

    /* JADX INFO: renamed from: h */
    public Object f715h;

    /* JADX INFO: renamed from: i */
    public int f716i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0321n(boolean z2) {
        this.f713f = null;
        this.f714g = z2;
        this.f712e = this;
        this.f711d = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f713f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f715h;
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
        return this.f713f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f715h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f713f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f715h;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f714g) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f715h;
        this.f715h = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f713f + "=" + this.f715h;
    }

    public C0321n(boolean z2, C0321n c0321n, Object obj, C0321n c0321n2, C0321n c0321n3) {
        this.f708a = c0321n;
        this.f713f = obj;
        this.f714g = z2;
        this.f716i = 1;
        this.f711d = c0321n2;
        this.f712e = c0321n3;
        c0321n3.f711d = this;
        c0321n2.f712e = this;
    }
}
