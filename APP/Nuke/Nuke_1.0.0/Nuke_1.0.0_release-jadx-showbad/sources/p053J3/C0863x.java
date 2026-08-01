package p053J3;

import java.util.Map;
import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: J3.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0863x {
    public static final int $stable = 8;
    private final int activeToday;
    private final Map<String, Integer> byIdentityGroup;
    private final Map<String, Integer> byPlatform;
    private final Map<String, Integer> byStatus;
    private final int totalUsers;
    private final int usersWithEnvironment;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0863x(int i5, int i6, int i7, Map<String, Integer> map, Map<String, Integer> map2, Map<String, Integer> map3) {
        AbstractC1665j.m2985e(map, "byStatus");
        AbstractC1665j.m2985e(map2, "byIdentityGroup");
        AbstractC1665j.m2985e(map3, "byPlatform");
        this.totalUsers = i5;
        this.activeToday = i6;
        this.usersWithEnvironment = i7;
        this.byStatus = map;
        this.byIdentityGroup = map2;
        this.byPlatform = map3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: J3.x */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C0863x m1865h(C0863x c0863x, int i5, int i6, int i7, Map map, Map map2, Map map3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i5 = c0863x.totalUsers;
        }
        if ((i8 & 2) != 0) {
            i6 = c0863x.activeToday;
        }
        if ((i8 & 4) != 0) {
            i7 = c0863x.usersWithEnvironment;
        }
        if ((i8 & 8) != 0) {
            map = c0863x.byStatus;
        }
        if ((i8 & 16) != 0) {
            map2 = c0863x.byIdentityGroup;
        }
        if ((i8 & 32) != 0) {
            map3 = c0863x.byPlatform;
        }
        Map map4 = map2;
        Map map5 = map3;
        return c0863x.m1872g(i5, i6, i7, map, map4, map5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m1866a() {
        return this.totalUsers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m1867b() {
        return this.activeToday;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m1868c() {
        return this.usersWithEnvironment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Map<String, Integer> m1869d() {
        return this.byStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final Map<String, Integer> m1870e() {
        return this.byIdentityGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0863x)) {
            return false;
        }
        C0863x c0863x = (C0863x) obj;
        return this.totalUsers == c0863x.totalUsers && this.activeToday == c0863x.activeToday && this.usersWithEnvironment == c0863x.usersWithEnvironment && AbstractC1665j.m2981a(this.byStatus, c0863x.byStatus) && AbstractC1665j.m2981a(this.byIdentityGroup, c0863x.byIdentityGroup) && AbstractC1665j.m2981a(this.byPlatform, c0863x.byPlatform);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final Map<String, Integer> m1871f() {
        return this.byPlatform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final C0863x m1872g(int i5, int i6, int i7, Map<String, Integer> map, Map<String, Integer> map2, Map<String, Integer> map3) {
        AbstractC1665j.m2985e(map, "byStatus");
        AbstractC1665j.m2985e(map2, "byIdentityGroup");
        AbstractC1665j.m2985e(map3, "byPlatform");
        return new C0863x(i5, i6, i7, map, map2, map3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return this.byPlatform.hashCode() + ((this.byIdentityGroup.hashCode() + ((this.byStatus.hashCode() + AbstractC0231b.m391b(this.usersWithEnvironment, AbstractC0231b.m391b(this.activeToday, Integer.hashCode(this.totalUsers) * 31, 31), 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final int m1873i() {
        return this.activeToday;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final Map<String, Integer> m1874j() {
        return this.byIdentityGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final Map<String, Integer> m1875k() {
        return this.byPlatform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final Map<String, Integer> m1876l() {
        return this.byStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final int m1877m() {
        return this.totalUsers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final int m1878n() {
        return this.usersWithEnvironment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "OverviewStats(totalUsers=" + this.totalUsers + ", activeToday=" + this.activeToday + ", usersWithEnvironment=" + this.usersWithEnvironment + ", byStatus=" + this.byStatus + ", byIdentityGroup=" + this.byIdentityGroup + ", byPlatform=" + this.byPlatform + ")";
    }
}
