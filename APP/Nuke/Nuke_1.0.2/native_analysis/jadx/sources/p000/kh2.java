package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kh2 {

    /* JADX INFO: renamed from: e */
    public static final List f5575e = AbstractC0179eu.m1434O("*");

    /* JADX INFO: renamed from: a */
    public final boolean f5576a;

    /* JADX INFO: renamed from: b */
    public final boolean f5577b;

    /* JADX INFO: renamed from: c */
    public final List f5578c;

    /* JADX INFO: renamed from: d */
    public final String f5579d;

    public kh2(boolean z, boolean z2, List list, String str) {
        list.getClass();
        this.f5576a = z;
        this.f5577b = z2;
        this.f5578c = list;
        this.f5579d = str;
        if (!z && !z2) {
            C0676s.m4651j("Host permission must enable reflect or hook.");
            throw null;
        }
        if (list.isEmpty()) {
            C0676s.m4651j("Host permission classes must not be empty.");
            throw null;
        }
        if (list.size() > 256) {
            C0676s.m4651j("Host permission declares too many class patterns.");
            throw null;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (pv2.m4006s0((String) it.next())) {
                    C0676s.m4651j("Host permission class patterns must not be blank.");
                    throw null;
                }
            }
        }
        String str2 = this.f5579d;
        if (str2 != null && pv2.m4006s0(str2)) {
            C0676s.m4651j("Host permission reason must not be blank.");
            throw null;
        }
        String str3 = this.f5579d;
        if (str3 == null || str3.length() <= 512) {
            return;
        }
        C0676s.m4651j("Host permission reason is too long.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh2)) {
            return false;
        }
        kh2 kh2Var = (kh2) obj;
        return this.f5576a == kh2Var.f5576a && this.f5577b == kh2Var.f5577b && t11.m5086l(this.f5578c, kh2Var.f5578c) && t11.m5086l(this.f5579d, kh2Var.f5579d);
    }

    public final int hashCode() {
        int iHashCode = (this.f5578c.hashCode() + hk1.m2205d(Boolean.hashCode(this.f5576a) * 31, 31, this.f5577b)) * 31;
        String str = this.f5579d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ScriptHostPermission(reflect=" + this.f5576a + ", hook=" + this.f5577b + ", classes=" + this.f5578c + ", reason=" + this.f5579d + ")";
    }
}
