package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5428<T> {

    /* JADX INFO: renamed from: ۥ */
    public final int f1503;

    /* JADX INFO: renamed from: ۥ۟ */
    public final T f1504;

    public C5428(int i, T t) {
        this.f1503 = i;
        this.f1504 = t;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Yue.ۥ۠ۥۡۤ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ C5428 m16912(C5428 c5428, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = c5428.f1503;
        }
        if ((i2 & 2) != 0) {
            obj = c5428.f1504;
        }
        return c5428.m16913(i, obj);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5428)) {
            return false;
        }
        C5428 c5428 = (C5428) obj;
        return this.f1503 == c5428.f1503 && C5499.m17094(this.f1504, c5428.f1504);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f1503) * 31;
        T t = this.f1504;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    @InterfaceC6399
    public String toString() {
        return "IndexedValue(index=" + this.f1503 + ", value=" + this.f1504 + ')';
    }

    /* JADX INFO: renamed from: ۥ */
    public final int m2199() {
        return this.f1503;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final T m2200() {
        return this.f1504;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C5428<T> m16913(int i, T t) {
        return new C5428<>(i, t);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m16914() {
        return this.f1503;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final T m16915() {
        return this.f1504;
    }
}
