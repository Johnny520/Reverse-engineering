package p053J3;

import java.util.List;
import p117X2.AbstractC1661f;
import p117X2.AbstractC1665j;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: J3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0845f<T> {
    public static final int $stable = 8;
    private final String code;
    private final T data;
    private final List<C0844e> issues;
    private final String message;
    private final boolean success;

    public C0845f(boolean z5, T t5, String str, String str2, List<C0844e> list) {
        this.success = z5;
        this.data = t5;
        this.code = str;
        this.message = str2;
        this.issues = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C0845f m1587g(C0845f c0845f, boolean z5, Object obj, String str, String str2, List list, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            z5 = c0845f.success;
        }
        if ((i5 & 2) != 0) {
            obj = c0845f.data;
        }
        if ((i5 & 4) != 0) {
            str = c0845f.code;
        }
        if ((i5 & 8) != 0) {
            str2 = c0845f.message;
        }
        if ((i5 & 16) != 0) {
            list = c0845f.issues;
        }
        List list2 = list;
        String str3 = str;
        return c0845f.m1593f(z5, obj, str3, str2, list2);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1588a() {
        return this.success;
    }

    /* JADX INFO: renamed from: b */
    public final T m1589b() {
        return this.data;
    }

    /* JADX INFO: renamed from: c */
    public final String m1590c() {
        return this.code;
    }

    /* JADX INFO: renamed from: d */
    public final String m1591d() {
        return this.message;
    }

    /* JADX INFO: renamed from: e */
    public final List<C0844e> m1592e() {
        return this.issues;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0845f)) {
            return false;
        }
        C0845f c0845f = (C0845f) obj;
        return this.success == c0845f.success && AbstractC1665j.m2981a(this.data, c0845f.data) && AbstractC1665j.m2981a(this.code, c0845f.code) && AbstractC1665j.m2981a(this.message, c0845f.message) && AbstractC1665j.m2981a(this.issues, c0845f.issues);
    }

    /* JADX INFO: renamed from: f */
    public final C0845f<T> m1593f(boolean z5, T t5, String str, String str2, List<C0844e> list) {
        return new C0845f<>(z5, t5, str, str2, list);
    }

    /* JADX INFO: renamed from: h */
    public final String m1594h() {
        return this.code;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        T t5 = this.data;
        int iHashCode2 = (iHashCode + (t5 == null ? 0 : t5.hashCode())) * 31;
        String str = this.code;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<C0844e> list = this.issues;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final T m1595i() {
        return this.data;
    }

    /* JADX INFO: renamed from: j */
    public final List<C0844e> m1596j() {
        return this.issues;
    }

    /* JADX INFO: renamed from: k */
    public final String m1597k() {
        return this.message;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1598l() {
        return this.success;
    }

    public String toString() {
        boolean z5 = this.success;
        T t5 = this.data;
        String str = this.code;
        String str2 = this.message;
        List<C0844e> list = this.issues;
        StringBuilder sb = new StringBuilder("ApiResponse(success=");
        sb.append(z5);
        sb.append(", data=");
        sb.append(t5);
        sb.append(", code=");
        AbstractC3202a.m5468c(sb, str, ", message=", str2, ", issues=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C0845f(boolean z5, Object obj, String str, String str2, List list, int i5, AbstractC1661f abstractC1661f) {
        this(z5, (i5 & 2) != 0 ? null : obj, (i5 & 4) != 0 ? null : str, (i5 & 8) != 0 ? null : str2, (i5 & 16) != 0 ? null : list);
    }
}
