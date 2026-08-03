package p000a;

/* JADX INFO: renamed from: a.X4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0420X4 {

    /* JADX INFO: renamed from: a */
    public final String f1585a;

    public C0420X4(String str) {
        C0631i9.m1482e(str, "descriptor");
        this.f1585a = C0608h5.m1444a(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0420X4)) {
            return false;
        }
        return C0631i9.m1478a(this.f1585a, ((C0420X4) obj).f1585a);
    }

    public final int hashCode() {
        return this.f1585a.hashCode();
    }

    public final String toString() {
        return C0608h5.m1445b(this.f1585a);
    }
}
