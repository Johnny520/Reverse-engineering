package p053J3;

import p117X2.AbstractC1661f;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: J3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0844e {
    public static final int $stable = 0;
    private final String message;
    private final String path;

    public C0844e(String str, String str2) {
        AbstractC1665j.m2985e(str2, "message");
        this.path = str;
        this.message = str2;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C0844e m1581d(C0844e c0844e, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = c0844e.path;
        }
        if ((i5 & 2) != 0) {
            str2 = c0844e.message;
        }
        return c0844e.m1584c(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final String m1582a() {
        return this.path;
    }

    /* JADX INFO: renamed from: b */
    public final String m1583b() {
        return this.message;
    }

    /* JADX INFO: renamed from: c */
    public final C0844e m1584c(String str, String str2) {
        AbstractC1665j.m2985e(str2, "message");
        return new C0844e(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public final String m1585e() {
        return this.message;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0844e)) {
            return false;
        }
        C0844e c0844e = (C0844e) obj;
        return AbstractC1665j.m2981a(this.path, c0844e.path) && AbstractC1665j.m2981a(this.message, c0844e.message);
    }

    /* JADX INFO: renamed from: f */
    public final String m1586f() {
        return this.path;
    }

    public int hashCode() {
        String str = this.path;
        return this.message.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "ApiIssue(path=" + this.path + ", message=" + this.message + ")";
    }

    public /* synthetic */ C0844e(String str, String str2, int i5, AbstractC1661f abstractC1661f) {
        this((i5 & 1) != 0 ? null : str, str2);
    }
}
