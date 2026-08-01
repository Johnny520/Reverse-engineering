package p053J3;

import p117X2.AbstractC1661f;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: J3.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0835D {
    public static final int $stable = 0;
    private final String identityGroup;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public C0835D() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C0835D m1514d(C0835D c0835d, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = c0835d.identityGroup;
        }
        if ((i5 & 2) != 0) {
            str2 = c0835d.title;
        }
        return c0835d.m1517c(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final String m1515a() {
        return this.identityGroup;
    }

    /* JADX INFO: renamed from: b */
    public final String m1516b() {
        return this.title;
    }

    /* JADX INFO: renamed from: c */
    public final C0835D m1517c(String str, String str2) {
        return new C0835D(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public final String m1518e() {
        return this.identityGroup;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0835D)) {
            return false;
        }
        C0835D c0835d = (C0835D) obj;
        return AbstractC1665j.m2981a(this.identityGroup, c0835d.identityGroup) && AbstractC1665j.m2981a(this.title, c0835d.title);
    }

    /* JADX INFO: renamed from: f */
    public final String m1519f() {
        return this.title;
    }

    public int hashCode() {
        String str = this.identityGroup;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "UpdateClientUserProfileRequest(identityGroup=" + this.identityGroup + ", title=" + this.title + ")";
    }

    public C0835D(String str, String str2) {
        this.identityGroup = str;
        this.title = str2;
    }

    public /* synthetic */ C0835D(String str, String str2, int i5, AbstractC1661f abstractC1661f) {
        this((i5 & 1) != 0 ? null : str, (i5 & 2) != 0 ? null : str2);
    }
}
