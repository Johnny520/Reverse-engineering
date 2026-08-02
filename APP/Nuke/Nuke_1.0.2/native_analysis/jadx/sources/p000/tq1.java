package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tq1 {

    /* JADX INFO: renamed from: a */
    public final List f10899a;

    /* JADX INFO: renamed from: b */
    public final boolean f10900b;

    /* JADX INFO: renamed from: c */
    public final String f10901c;

    public tq1(List list, boolean z, String str) {
        list.getClass();
        this.f10899a = list;
        this.f10900b = z;
        this.f10901c = str;
    }

    /* JADX INFO: renamed from: a */
    public static tq1 m5377a(tq1 tq1Var, ArrayList arrayList, boolean z, String str, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = tq1Var.f10899a;
        }
        if ((i & 2) != 0) {
            z = tq1Var.f10900b;
        }
        if ((i & 4) != 0) {
            str = tq1Var.f10901c;
        }
        tq1Var.getClass();
        list.getClass();
        return new tq1(list, z, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq1)) {
            return false;
        }
        tq1 tq1Var = (tq1) obj;
        return t11.m5086l(this.f10899a, tq1Var.f10899a) && this.f10900b == tq1Var.f10900b && t11.m5086l(this.f10901c, tq1Var.f10901c);
    }

    public final int hashCode() {
        int iM2205d = hk1.m2205d(this.f10899a.hashCode() * 31, 31, this.f10900b);
        String str = this.f10901c;
        return iM2205d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NukeScriptServiceState(scripts=");
        sb.append(this.f10899a);
        sb.append(", isLoading=");
        sb.append(this.f10900b);
        sb.append(", error=");
        return hk1.m2211j(sb, this.f10901c, ")");
    }
}
