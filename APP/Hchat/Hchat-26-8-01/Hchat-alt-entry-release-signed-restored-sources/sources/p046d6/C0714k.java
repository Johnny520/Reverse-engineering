package p046d6;

import java.util.Map;

/* JADX INFO: renamed from: d6.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0714k implements Map.Entry {

    /* JADX INFO: renamed from: g */
    public final C0712i f2148g;

    /* JADX INFO: renamed from: h */
    public final Short f2149h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0714k(C0712i c0712i, Short sh2) {
        this.f2148g = c0712i;
        this.f2149h = sh2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2148g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2149h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
