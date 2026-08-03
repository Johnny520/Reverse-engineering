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

    public DiagnosticItem(String str, String str2, DiagnosticLevel diagnosticLevel, String str3) {
        AbstractC0307g.m703e(str, "id");
        AbstractC0307g.m703e(str2, "title");
        AbstractC0307g.m703e(diagnosticLevel, "level");
        AbstractC0307g.m703e(str3, "detail");
        this.f1668a = str;
        this.f1669b = str2;
        this.f1670c = diagnosticLevel;
        this.f1671d = str3;
    }

    /* JADX INFO: renamed from: a */
    public static DiagnosticItem m1375a(DiagnosticItem diagnosticItem, String str, DiagnosticLevel diagnosticLevel, String str2, int i2) {
        if ((i2 & 2) != 0) {
            str = diagnosticItem.f1669b;
        }
        if ((i2 & 4) != 0) {
            diagnosticLevel = diagnosticItem.f1670c;
        }
        if ((i2 & 8) != 0) {
            str2 = diagnosticItem.f1671d;
        }
        String str3 = diagnosticItem.f1668a;
        AbstractC0307g.m703e(str3, "id");
        AbstractC0307g.m703e(str, "title");
        AbstractC0307g.m703e(diagnosticLevel, "level");
        AbstractC0307g.m703e(str2, "detail");
        return new DiagnosticItem(str3, str, diagnosticLevel, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiagnosticItem)) {
            return false;
        }
        DiagnosticItem diagnosticItem = (DiagnosticItem) obj;
        return AbstractC0307g.m699a(this.f1668a, diagnosticItem.f1668a) && AbstractC0307g.m699a(this.f1669b, diagnosticItem.f1669b) && this.f1670c == diagnosticItem.f1670c && AbstractC0307g.m699a(this.f1671d, diagnosticItem.f1671d);
    }

    public final int hashCode() {
        return this.f1671d.hashCode() + ((this.f1670c.hashCode() + ((this.f1669b.hashCode() + (this.f1668a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ProbeResult(id=" + this.f1668a + ", title=" + this.f1669b + ", level=" + this.f1670c + ", detail=" + this.f1671d + ")";
    }
}
