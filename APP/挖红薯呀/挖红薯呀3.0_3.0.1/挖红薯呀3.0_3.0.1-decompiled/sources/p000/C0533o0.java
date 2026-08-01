package p000;

/* JADX INFO: renamed from: o0 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0533o0 {

    /* JADX INFO: renamed from: a */
    public final String f4377a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0188ex f4378b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0533o0(String str, InterfaceC0188ex interfaceC0188ex) {
        this.f4377a = str;
        this.f4378b = interfaceC0188ex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0533o0)) {
            return false;
        }
        C0533o0 c0533o0 = (C0533o0) obj;
        return p30.m3002l(this.f4377a, c0533o0.f4377a) && p30.m3002l(this.f4378b, c0533o0.f4378b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f4377a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC0188ex interfaceC0188ex = this.f4378b;
        return iHashCode + (interfaceC0188ex != null ? interfaceC0188ex.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AccessibilityAction(label=" + this.f4377a + ", action=" + this.f4378b + ')';
    }
}
