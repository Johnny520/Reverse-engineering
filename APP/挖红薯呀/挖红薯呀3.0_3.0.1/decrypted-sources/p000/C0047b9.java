package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: b9 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0047b9 implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: d */
    public int f450d;

    /* JADX INFO: renamed from: e */
    public int f451e = -1;

    /* JADX INFO: renamed from: f */
    public boolean f452f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0121d9 f453g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0047b9(C0121d9 c0121d9) {
        this.f453g = c0121d9;
        this.f450d = c0121d9.f4120f - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f452f) {
            C0921xc.m5134o("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f451e;
            C0121d9 c0121d9 = this.f453g;
            if (p30.m3002l(key, c0121d9.m2622e(i)) && p30.m3002l(entry.getValue(), c0121d9.m2625h(this.f451e))) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f452f) {
            return this.f453g.m2622e(this.f451e);
        }
        C0921xc.m5134o("This container does not support retaining Map.Entry objects");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f452f) {
            return this.f453g.m2625h(this.f451e);
        }
        C0921xc.m5134o("This container does not support retaining Map.Entry objects");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f451e < this.f450d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f452f) {
            C0921xc.m5134o("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.f451e;
        C0121d9 c0121d9 = this.f453g;
        Object objM2622e = c0121d9.m2622e(i);
        Object objM2625h = c0121d9.m2625h(this.f451e);
        return (objM2622e == null ? 0 : objM2622e.hashCode()) ^ (objM2625h != null ? objM2625h.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C0921xc.m5132m();
            return null;
        }
        this.f451e++;
        this.f452f = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f452f) {
            throw new IllegalStateException();
        }
        this.f453g.m2623f(this.f451e);
        this.f451e--;
        this.f450d--;
        this.f452f = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f452f) {
            return this.f453g.m2624g(this.f451e, obj);
        }
        C0921xc.m5134o("This container does not support retaining Map.Entry objects");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
