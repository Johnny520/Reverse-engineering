package p261x0;

/* JADX INFO: renamed from: x0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3444a {

    /* JADX INFO: renamed from: a */
    public final int f10761a;

    public /* synthetic */ C3444a(int i5) {
        this.f10761a = i5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3444a) {
            return this.f10761a == ((C3444a) obj).f10761a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10761a);
    }

    public final String toString() {
        int i5 = this.f10761a;
        return i5 == 1 ? "Touch" : i5 == 2 ? "Keyboard" : "Error";
    }
}
