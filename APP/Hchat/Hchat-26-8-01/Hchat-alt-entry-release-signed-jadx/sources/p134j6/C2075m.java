package p134j6;

import bsh.C0353j;
import java.util.Map;

/* JADX INFO: renamed from: j6.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2075m implements Map.Entry {

    /* JADX INFO: renamed from: g */
    public C2075m f6962g;

    /* JADX INFO: renamed from: h */
    public C2075m f6963h;

    /* JADX INFO: renamed from: i */
    public C2075m f6964i;

    /* JADX INFO: renamed from: j */
    public C2075m f6965j;

    /* JADX INFO: renamed from: k */
    public C2075m f6966k;

    /* JADX INFO: renamed from: l */
    public final Object f6967l;

    /* JADX INFO: renamed from: m */
    public final boolean f6968m;

    /* JADX INFO: renamed from: n */
    public Object f6969n;

    /* JADX INFO: renamed from: o */
    public int f6970o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2075m(boolean z9, C2075m c2075m, Object obj, C2075m c2075m2, C2075m c2075m3) {
        this.f6962g = c2075m;
        this.f6967l = obj;
        this.f6968m = z9;
        this.f6970o = 1;
        this.f6965j = c2075m2;
        this.f6966k = c2075m3;
        c2075m3.f6965j = this;
        c2075m2.f6966k = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f6967l;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f6969n;
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
        return this.f6967l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f6969n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f6967l;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f6969n;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f6968m) {
            C0353j.m1305c("value == null");
            return null;
        }
        Object obj2 = this.f6969n;
        this.f6969n = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f6967l + "=" + this.f6969n;
    }

    public C2075m(boolean z9) {
        this.f6967l = null;
        this.f6968m = z9;
        this.f6966k = this;
        this.f6965j = this;
    }
}
