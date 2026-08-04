package yyds;

/* JADX INFO: renamed from: yyds.ᛵᛵᛳᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1091 implements InterfaceC2289 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ThreadLocal f5042;

    public C1091(ThreadLocal threadLocal) {
        this.f5042 = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1091) && AbstractC1544.m3188(this.f5042, ((C1091) obj).f5042);
    }

    public final int hashCode() {
        return this.f5042.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f5042 + ')';
    }
}
