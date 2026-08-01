package p053J3;

import java.util.List;
import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: J3.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0853n {
    public static final int $stable = 8;
    private final List<C0852m> items;
    private final int page;
    private final int pageSize;
    private final int total;
    private final int totalPages;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0853n(List<C0852m> list, int i5, int i6, int i7, int i8) {
        AbstractC1665j.m2985e(list, "items");
        this.items = list;
        this.page = i5;
        this.pageSize = i6;
        this.total = i7;
        this.totalPages = i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: J3.n */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C0853n m1763g(C0853n c0853n, List list, int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            list = c0853n.items;
        }
        if ((i9 & 2) != 0) {
            i5 = c0853n.page;
        }
        if ((i9 & 4) != 0) {
            i6 = c0853n.pageSize;
        }
        if ((i9 & 8) != 0) {
            i7 = c0853n.total;
        }
        if ((i9 & 16) != 0) {
            i8 = c0853n.totalPages;
        }
        int i10 = i8;
        int i11 = i6;
        return c0853n.m1769f(list, i5, i11, i7, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final List<C0852m> m1764a() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m1765b() {
        return this.page;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m1766c() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m1767d() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m1768e() {
        return this.totalPages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0853n)) {
            return false;
        }
        C0853n c0853n = (C0853n) obj;
        return AbstractC1665j.m2981a(this.items, c0853n.items) && this.page == c0853n.page && this.pageSize == c0853n.pageSize && this.total == c0853n.total && this.totalPages == c0853n.totalPages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final C0853n m1769f(List<C0852m> list, int i5, int i6, int i7, int i8) {
        AbstractC1665j.m2985e(list, "items");
        return new C0853n(list, i5, i6, i7, i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final List<C0852m> m1770h() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Integer.hashCode(this.totalPages) + AbstractC0231b.m391b(this.total, AbstractC0231b.m391b(this.pageSize, AbstractC0231b.m391b(this.page, this.items.hashCode() * 31, 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final int m1771i() {
        return this.page;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final int m1772j() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final int m1773k() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final int m1774l() {
        return this.totalPages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "ClientUsersPage(items=" + this.items + ", page=" + this.page + ", pageSize=" + this.pageSize + ", total=" + this.total + ", totalPages=" + this.totalPages + ")";
    }
}
