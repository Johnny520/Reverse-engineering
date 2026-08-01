package p053J3;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1661f;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: J3.E */
/* JADX INFO: loaded from: classes.dex */
public final class C0836E {
    public static final int $stable = 0;
    private final String identityGroup;
    private final String message;
    private final String status;
    private final String title;

    public C0836E() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C0836E m1520f(C0836E c0836e, String str, String str2, String str3, String str4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = c0836e.status;
        }
        if ((i5 & 2) != 0) {
            str2 = c0836e.identityGroup;
        }
        if ((i5 & 4) != 0) {
            str3 = c0836e.title;
        }
        if ((i5 & 8) != 0) {
            str4 = c0836e.message;
        }
        return c0836e.m1525e(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: a */
    public final String m1521a() {
        return this.status;
    }

    /* JADX INFO: renamed from: b */
    public final String m1522b() {
        return this.identityGroup;
    }

    /* JADX INFO: renamed from: c */
    public final String m1523c() {
        return this.title;
    }

    /* JADX INFO: renamed from: d */
    public final String m1524d() {
        return this.message;
    }

    /* JADX INFO: renamed from: e */
    public final C0836E m1525e(String str, String str2, String str3, String str4) {
        return new C0836E(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0836E)) {
            return false;
        }
        C0836E c0836e = (C0836E) obj;
        return AbstractC1665j.m2981a(this.status, c0836e.status) && AbstractC1665j.m2981a(this.identityGroup, c0836e.identityGroup) && AbstractC1665j.m2981a(this.title, c0836e.title) && AbstractC1665j.m2981a(this.message, c0836e.message);
    }

    /* JADX INFO: renamed from: g */
    public final String m1526g() {
        return this.identityGroup;
    }

    /* JADX INFO: renamed from: h */
    public final String m1527h() {
        return this.message;
    }

    public int hashCode() {
        String str = this.status;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.identityGroup;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.message;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final String m1528i() {
        return this.status;
    }

    /* JADX INFO: renamed from: j */
    public final String m1529j() {
        return this.title;
    }

    public String toString() {
        String str = this.status;
        String str2 = this.identityGroup;
        String str3 = this.title;
        String str4 = this.message;
        StringBuilder sbM405p = AbstractC0231b.m405p("UpdateClientUserRequest(status=", str, ", identityGroup=", str2, ", title=");
        sbM405p.append(str3);
        sbM405p.append(", message=");
        sbM405p.append(str4);
        sbM405p.append(")");
        return sbM405p.toString();
    }

    public C0836E(String str, String str2, String str3, String str4) {
        this.status = str;
        this.identityGroup = str2;
        this.title = str3;
        this.message = str4;
    }

    public /* synthetic */ C0836E(String str, String str2, String str3, String str4, int i5, AbstractC1661f abstractC1661f) {
        this((i5 & 1) != 0 ? null : str, (i5 & 2) != 0 ? null : str2, (i5 & 4) != 0 ? null : str3, (i5 & 8) != 0 ? null : str4);
    }
}
