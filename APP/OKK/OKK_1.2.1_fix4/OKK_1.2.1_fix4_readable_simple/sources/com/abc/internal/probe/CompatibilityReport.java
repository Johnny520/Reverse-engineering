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

    public CompatibilityReport(String r1, long r2, EnumC0568r r4, String r5) {
        this.f1684a = r1;
        this.f1685b = r2;
        this.f1686c = r4;
        this.f1687d = r5;
        List r12 = AbstractC0425j.m1019X0(AbstractC0425j.m1016U0(AbstractC0425j.m1022a1(r1).toString(), "v"), new char[]{'.', '-', '_', ' '});
        ArrayList r22 = new ArrayList();
        Iterator r13 = r12.iterator();
    L4:
        if (r13.hasNext() == false) goto L8;
        Integer r3 = AbstractC0432q.m1026A0((String) r13.next());
        if (r3 == null) goto L4;
        r22.add(r3);
        goto L4
    L8:
        int r14 = 0;
        Integer r32 = (Integer) AbstractC0181l.m545q0(r22, 0);
        if (r32 == null) goto L11;
        int r33 = r32.intValue();
    L12:
        Integer r34 = Integer.valueOf(r33);
        Integer r42 = (Integer) AbstractC0181l.m545q0(r22, 1);
        if (r42 == null) goto L15;
        int r43 = r42.intValue();
    L16:
        Integer r44 = Integer.valueOf(r43);
        Integer r23 = (Integer) AbstractC0181l.m545q0(r22, 2);
        if (r23 == null) goto L19;
        r14 = r23.intValue();
    L19:
        Integer r15 = Integer.valueOf(r14);
        this.f1688e = r34.intValue();
        this.f1689f = r44.intValue();
        this.f1690g = r15.intValue();
        return;
    L15:
        r43 = 0;
        goto L16
    L11:
        r33 = 0;
        goto L12
    }

    /* JADX INFO: renamed from: a */
    public final String m1383a() {
        String r02 = this.f1686c.name();
        int r1 = this.f1688e;
        int r4 = this.f1690g;
        if (r1 != 8) goto L10;
        if (this.f1689f != 0) goto L10;
        if (69 > r4) goto L10;
        if (r4 >= 77) goto L10;
        String r12 = "主适配";
    L19:
        return this.f1684a + " (" + this.f1685b + ") " + r02 + " · " + r12;
    L10:
        if (67 > r4) goto L13;
        if (r4 >= 69) goto L13;
        r12 = "可能可用（偏低）";
    L13:
        if (77 <= r4) goto L15;
    L17:
        r12 = "未验证";
        goto L19
    L15:
        if (r4 >= 79) goto L17;
        r12 = "可能可用（偏高）";
        goto L19
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof CompatibilityReport) == true) goto L8;
        return false;
    L8:
        CompatibilityReport r82 = (CompatibilityReport) r8;
        String r1 = r82.f1684a;
        if (AbstractC0307g.m699a(this.f1684a, r1) == true) goto L12;
        return false;
    L12:
        if (this.f1685b == r82.f1685b) goto L15;
        return false;
    L15:
        if (this.f1686c == r82.f1686c) goto L18;
        return false;
    L18:
        if (AbstractC0307g.m699a(this.f1687d, r82.f1687d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f1684a.hashCode() * 31;
        int r1 = (Long.hashCode(this.f1685b) + r02) * 31;
        int r03 = (this.f1686c.hashCode() + r1) * 31;
        return this.f1687d.hashCode() + r03;
    }

    public final String toString() {
        return "WeChatVersion(versionName=" + this.f1684a + ", versionCode=" + this.f1685b + ", channel=" + this.f1686c + ", packageName=" + this.f1687d + ")";
    }
}
