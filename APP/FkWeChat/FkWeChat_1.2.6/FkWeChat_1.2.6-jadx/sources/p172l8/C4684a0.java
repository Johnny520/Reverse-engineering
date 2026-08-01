package p172l8;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: l8.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4684a0 implements Comparable {

    /* JADX INFO: renamed from: r */
    public static final a f13888r = new a(null);

    /* JADX INFO: renamed from: q */
    public final int f13889q;

    public /* synthetic */ C4684a0(int i10) {
        this.f13889q = i10;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C4684a0 m18702a(int i10) {
        return new C4684a0(i10);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m18704g(int i10, Object obj) {
        return (obj instanceof C4684a0) && i10 == ((C4684a0) obj).m18707j();
    }

    /* JADX INFO: renamed from: h */
    public static int m18705h(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: i */
    public static String m18706i(int i10) {
        return String.valueOf(((long) i10) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC4704k0.m18783a(m18707j(), ((C4684a0) obj).m18707j());
    }

    public boolean equals(Object obj) {
        return m18704g(this.f13889q, obj);
    }

    public int hashCode() {
        return m18705h(this.f13889q);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int m18707j() {
        return this.f13889q;
    }

    public String toString() {
        return m18706i(this.f13889q);
    }

    /* JADX INFO: renamed from: l8.a0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m18703c(int i10) {
        return i10;
    }
}
