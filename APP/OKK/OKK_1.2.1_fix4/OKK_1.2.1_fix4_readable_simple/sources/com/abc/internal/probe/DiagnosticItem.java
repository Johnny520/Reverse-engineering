package com.abc.internal.probe;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: b0.n */
/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticItem {

    /* JADX INFO: renamed from: a */
    public final String f1668a;

    /* JADX INFO: renamed from: b */
    public final String f1669b;

    /* JADX INFO: renamed from: c */
    public final DiagnosticLevel f1670c;

    /* JADX INFO: renamed from: d */
    public final String f1671d;

    public DiagnosticItem(String r2, String r3, DiagnosticLevel r4, String r5) {
        AbstractC0307g.m703e(r2, "id");
        AbstractC0307g.m703e(r3, "title");
        AbstractC0307g.m703e(r4, "level");
        AbstractC0307g.m703e(r5, "detail");
        this.f1668a = r2;
        this.f1669b = r3;
        this.f1670c = r4;
        this.f1671d = r5;
    }

    /* JADX INFO: renamed from: a */
    public static DiagnosticItem m1375a(DiagnosticItem r1, String r2, DiagnosticLevel r3, String r4, int r5) {
        if ((r5 & 2) == 0) goto L6;
        r2 = r1.f1669b;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r3 = r1.f1670c;
    L9:
        if ((r5 & 8) == 0) goto L11;
        r4 = r1.f1671d;
    L11:
        String r12 = r1.f1668a;
        AbstractC0307g.m703e(r12, "id");
        AbstractC0307g.m703e(r2, "title");
        AbstractC0307g.m703e(r3, "level");
        AbstractC0307g.m703e(r4, "detail");
        return new DiagnosticItem(r12, r2, r3, r4);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DiagnosticItem) == true) goto L8;
        return false;
    L8:
        DiagnosticItem r52 = (DiagnosticItem) r5;
        String r1 = r52.f1668a;
        if (AbstractC0307g.m699a(this.f1668a, r1) == true) goto L12;
        return false;
    L12:
        if (AbstractC0307g.m699a(this.f1669b, r52.f1669b) == true) goto L15;
        return false;
    L15:
        if (this.f1670c == r52.f1670c) goto L18;
        return false;
    L18:
        if (AbstractC0307g.m699a(this.f1671d, r52.f1671d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f1668a.hashCode() * 31;
        int r1 = (this.f1669b.hashCode() + r02) * 31;
        int r03 = (this.f1670c.hashCode() + r1) * 31;
        return this.f1671d.hashCode() + r03;
    }

    public final String toString() {
        return "ProbeResult(id=" + this.f1668a + ", title=" + this.f1669b + ", level=" + this.f1670c + ", detail=" + this.f1671d + ")";
    }
}
