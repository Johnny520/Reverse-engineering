package com.abc.internal.probe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p009E0.AbstractC0181l;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0432q;

/* JADX INFO: renamed from: b0.s */
/* JADX INFO: loaded from: classes.dex */
public final class CompatibilityReport {

    /* JADX INFO: renamed from: h */
    public static volatile CompatibilityReport f1683h;

    /* JADX INFO: renamed from: a */
    public final String f1684a;

    /* JADX INFO: renamed from: b */
    public final long f1685b;

    /* JADX INFO: renamed from: c */
    public final EnumC0568r f1686c;

    /* JADX INFO: renamed from: d */
    public final String f1687d;

    /* JADX INFO: renamed from: e */
    public final int f1688e;

    /* JADX INFO: renamed from: f */
    public final int f1689f;

    /* JADX INFO: renamed from: g */
    public final int f1690g;

    public CompatibilityReport(String str, long j2, EnumC0568r enumC0568r, String str2) {
        this.f1684a = str;
        this.f1685b = j2;
        this.f1686c = enumC0568r;
        this.f1687d = str2;
        List listM1019X0 = AbstractC0425j.m1019X0(AbstractC0425j.m1016U0(AbstractC0425j.m1022a1(str).toString(), "v"), new char[]{'.', '-', '_', ' '});
        ArrayList arrayList = new ArrayList();
        Iterator it = listM1019X0.iterator();
        while (it.hasNext()) {
            Integer numM1026A0 = AbstractC0432q.m1026A0((String) it.next());
            if (numM1026A0 != null) {
                arrayList.add(numM1026A0);
            }
        }
        Integer num = (Integer) AbstractC0181l.m545q0(arrayList, 0);
        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 0);
        Integer num2 = (Integer) AbstractC0181l.m545q0(arrayList, 1);
        Integer numValueOf2 = Integer.valueOf(num2 != null ? num2.intValue() : 0);
        Integer num3 = (Integer) AbstractC0181l.m545q0(arrayList, 2);
        Integer numValueOf3 = Integer.valueOf(num3 != null ? num3.intValue() : 0);
        this.f1688e = numValueOf.intValue();
        this.f1689f = numValueOf2.intValue();
        this.f1690g = numValueOf3.intValue();
    }

    /* JADX INFO: renamed from: a */
    public final String m1383a() {
        String strName = this.f1686c.name();
        int i2 = this.f1688e;
        int i3 = this.f1690g;
        return this.f1684a + " (" + this.f1685b + ") " + strName + " · " + ((i2 != 8 || this.f1689f != 0 || 69 > i3 || i3 >= 77) ? (67 > i3 || i3 >= 69) ? (77 > i3 || i3 >= 79) ? "未验证" : "可能可用（偏高）" : "可能可用（偏低）" : "主适配");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompatibilityReport)) {
            return false;
        }
        CompatibilityReport compatibilityReport = (CompatibilityReport) obj;
        return AbstractC0307g.m699a(this.f1684a, compatibilityReport.f1684a) && this.f1685b == compatibilityReport.f1685b && this.f1686c == compatibilityReport.f1686c && AbstractC0307g.m699a(this.f1687d, compatibilityReport.f1687d);
    }

    public final int hashCode() {
        return this.f1687d.hashCode() + ((this.f1686c.hashCode() + ((Long.hashCode(this.f1685b) + (this.f1684a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WeChatVersion(versionName=" + this.f1684a + ", versionCode=" + this.f1685b + ", channel=" + this.f1686c + ", packageName=" + this.f1687d + ")";
    }
}
