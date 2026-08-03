package com.abc.internal.probe;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p009E0.AbstractC0182m;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: b0.a */
/* JADX INFO: loaded from: classes.dex */
public final class AppFingerprint {

    /* JADX INFO: renamed from: a */
    public final String f1638a;

    /* JADX INFO: renamed from: b */
    public final String f1639b;

    /* JADX INFO: renamed from: c */
    public final long f1640c;

    /* JADX INFO: renamed from: d */
    public final List f1641d;

    /* JADX INFO: renamed from: e */
    public final boolean f1642e;

    public AppFingerprint(String r2, String r3, long r4, List r6, boolean r7) {
        AbstractC0307g.m703e(r2, "fingerprint");
        AbstractC0307g.m703e(r3, "wechatSummary");
        this.f1638a = r2;
        this.f1639b = r3;
        this.f1640c = r4;
        this.f1641d = r6;
        this.f1642e = r7;
    }

    /* JADX INFO: renamed from: a */
    public final DiagnosticItem m1357a(String r4) {
        Iterator r02 = this.f1641d.iterator();
    L4:
        if (r02.hasNext() == false) goto L8;
        Object r1 = r02.next();
        if (AbstractC0307g.m699a(((DiagnosticItem) r1).f1668a, r4) == false) goto L4;
    L10:
        return (DiagnosticItem) r1;
    L8:
        r1 = null;
        goto L10
    }

    /* JADX INFO: renamed from: b */
    public final int m1358b() {
        List r02 = this.f1641d;
        int r2 = 0;
        if ((r02 instanceof Collection) == true) goto L5;
    L7:
        Iterator r03 = r02.iterator();
    L9:
        if (r03.hasNext() == false) goto L17;
        if (((DiagnosticItem) r03.next()).f1670c != DiagnosticLevel.f1666c) goto L9;
        r2 = r2 + 1;
        if (r2 >= 0) goto L9;
        AbstractC0182m.m557i0();
        throw null;
    L17:
        return r2;
    L5:
        if (r02.isEmpty() == false) goto L7;
        goto L7
    }

    /* JADX INFO: renamed from: c */
    public final int m1359c() {
        List r02 = this.f1641d;
        int r2 = 0;
        if ((r02 instanceof Collection) == true) goto L5;
    L7:
        Iterator r03 = r02.iterator();
    L9:
        if (r03.hasNext() == false) goto L17;
        if (((DiagnosticItem) r03.next()).f1670c != DiagnosticLevel.f1664a) goto L9;
        r2 = r2 + 1;
        if (r2 >= 0) goto L9;
        AbstractC0182m.m557i0();
        throw null;
    L17:
        return r2;
    L5:
        if (r02.isEmpty() == false) goto L7;
        goto L7
    }

    /* JADX INFO: renamed from: d */
    public final int m1360d() {
        List r02 = this.f1641d;
        int r2 = 0;
        if ((r02 instanceof Collection) == true) goto L5;
    L7:
        Iterator r03 = r02.iterator();
    L9:
        if (r03.hasNext() == false) goto L17;
        if (((DiagnosticItem) r03.next()).f1670c != DiagnosticLevel.f1665b) goto L9;
        r2 = r2 + 1;
        if (r2 >= 0) goto L9;
        AbstractC0182m.m557i0();
        throw null;
    L17:
        return r2;
    L5:
        if (r02.isEmpty() == false) goto L7;
        goto L7
    }

    /* JADX INFO: renamed from: e */
    public final String m1361e() {
        return "ok=" + m1359c() + " partial=" + m1360d() + " fail=" + m1358b() + " total=" + this.f1641d.size();
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof AppFingerprint) == true) goto L8;
        return false;
    L8:
        AppFingerprint r82 = (AppFingerprint) r8;
        String r1 = r82.f1638a;
        if (AbstractC0307g.m699a(this.f1638a, r1) == true) goto L12;
        return false;
    L12:
        if (AbstractC0307g.m699a(this.f1639b, r82.f1639b) == true) goto L15;
        return false;
    L15:
        if (this.f1640c == r82.f1640c) goto L18;
        return false;
    L18:
        if (AbstractC0307g.m699a(this.f1641d, r82.f1641d) == true) goto L21;
        return false;
    L21:
        if (this.f1642e == r82.f1642e) goto L23;
        return false;
    L23:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f1638a.hashCode() * 31;
        int r1 = (this.f1639b.hashCode() + r02) * 31;
        int r03 = (Long.hashCode(this.f1640c) + r1) * 31;
        int r12 = (this.f1641d.hashCode() + r03) * 31;
        return Boolean.hashCode(this.f1642e) + r12;
    }

    public final String toString() {
        return "CompatReport(fingerprint=" + this.f1638a + ", wechatSummary=" + this.f1639b + ", atMs=" + this.f1640c + ", results=" + this.f1641d + ", shouldShowDialog=" + this.f1642e + ")";
    }
}
