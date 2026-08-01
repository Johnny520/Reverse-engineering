package p178m1;

/* JADX INFO: renamed from: m1.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4793e implements InterfaceC4805q {

    /* JADX INFO: renamed from: b */
    public final int f14271b;

    public /* synthetic */ C4793e(int i10) {
        this.f14271b = i10;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C4793e m19204a(int i10) {
        return new C4793e(i10);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m19206c(int i10, Object obj) {
        return (obj instanceof C4793e) && i10 == ((C4793e) obj).m19209f();
    }

    /* JADX INFO: renamed from: d */
    public static int m19207d(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: e */
    public static String m19208e(int i10) {
        return "AndroidContentDataType(androidAutofillType=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m19206c(this.f14271b, obj);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int m19209f() {
        return this.f14271b;
    }

    public int hashCode() {
        return m19207d(this.f14271b);
    }

    public String toString() {
        return m19208e(this.f14271b);
    }

    /* JADX INFO: renamed from: b */
    public static int m19205b(int i10) {
        return i10;
    }
}
