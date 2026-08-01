package p277t2;

/* JADX INFO: renamed from: t2.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8065d {

    /* JADX INFO: renamed from: a */
    public final int f26932a;

    /* JADX INFO: renamed from: b */
    public final int f26933b;

    public C8065d(int i10, int i11) {
        this.f26932a = i10;
        this.f26933b = i11;
    }

    /* JADX INFO: renamed from: a */
    public final int m31059a() {
        return this.f26933b;
    }

    /* JADX INFO: renamed from: b */
    public final int m31060b() {
        return this.f26932a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8065d)) {
            return false;
        }
        C8065d c8065d = (C8065d) obj;
        return this.f26932a == c8065d.f26932a && this.f26933b == c8065d.f26933b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f26932a) * 31) + Integer.hashCode(this.f26933b);
    }

    public String toString() {
        return "CollectionInfo(rowCount=" + this.f26932a + ", columnCount=" + this.f26933b + ')';
    }
}
