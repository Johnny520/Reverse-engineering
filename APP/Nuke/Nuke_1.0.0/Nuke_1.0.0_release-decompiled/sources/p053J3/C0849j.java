package p053J3;

import p117X2.AbstractC1661f;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: J3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0849j {
    public static final int $stable = 8;
    private final C0847h environment;
    private final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public C0849j() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C0849j m1707d(C0849j c0849j, String str, C0847h c0847h, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = c0849j.message;
        }
        if ((i5 & 2) != 0) {
            c0847h = c0849j.environment;
        }
        return c0849j.m1710c(str, c0847h);
    }

    /* JADX INFO: renamed from: a */
    public final String m1708a() {
        return this.message;
    }

    /* JADX INFO: renamed from: b */
    public final C0847h m1709b() {
        return this.environment;
    }

    /* JADX INFO: renamed from: c */
    public final C0849j m1710c(String str, C0847h c0847h) {
        return new C0849j(str, c0847h);
    }

    /* JADX INFO: renamed from: e */
    public final C0847h m1711e() {
        return this.environment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0849j)) {
            return false;
        }
        C0849j c0849j = (C0849j) obj;
        return AbstractC1665j.m2981a(this.message, c0849j.message) && AbstractC1665j.m2981a(this.environment, c0849j.environment);
    }

    /* JADX INFO: renamed from: f */
    public final String m1712f() {
        return this.message;
    }

    public int hashCode() {
        String str = this.message;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C0847h c0847h = this.environment;
        return iHashCode + (c0847h != null ? c0847h.hashCode() : 0);
    }

    public String toString() {
        return "ClientReportRequest(message=" + this.message + ", environment=" + this.environment + ")";
    }

    public C0849j(String str, C0847h c0847h) {
        this.message = str;
        this.environment = c0847h;
    }

    public /* synthetic */ C0849j(String str, C0847h c0847h, int i5, AbstractC1661f abstractC1661f) {
        this((i5 & 1) != 0 ? null : str, (i5 & 2) != 0 ? null : c0847h);
    }
}
