package p055e;

import androidx.lifecycle.C0113r;
import androidx.lifecycle.InterfaceC0111p;
import java.util.Map;

/* JADX INFO: renamed from: e.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0798c implements Map.Entry {

    /* JADX INFO: renamed from: g */
    public final Object f2391g;

    /* JADX INFO: renamed from: h */
    public final C0113r f2392h;

    /* JADX INFO: renamed from: i */
    public C0798c f2393i;

    /* JADX INFO: renamed from: j */
    public C0798c f2394j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0798c(InterfaceC0111p interfaceC0111p, C0113r c0113r) {
        this.f2391g = interfaceC0111p;
        this.f2392h = c0113r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0798c)) {
            return false;
        }
        C0798c c0798c = (C0798c) obj;
        return this.f2391g.equals(c0798c.f2391g) && this.f2392h.equals(c0798c.f2392h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2391g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2392h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f2391g.hashCode() ^ this.f2392h.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f2391g + "=" + this.f2392h;
    }
}
