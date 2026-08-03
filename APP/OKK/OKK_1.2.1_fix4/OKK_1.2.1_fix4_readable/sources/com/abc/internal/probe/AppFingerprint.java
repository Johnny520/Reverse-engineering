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

    public AppFingerprint(String str, String str2, long j2, List list, boolean z2) {
        AbstractC0307g.m703e(str, "fingerprint");
        AbstractC0307g.m703e(str2, "wechatSummary");
        this.f1638a = str;
        this.f1639b = str2;
        this.f1640c = j2;
        this.f1641d = list;
        this.f1642e = z2;
    }

    /* JADX INFO: renamed from: a */
    public final DiagnosticItem m1357a(String str) {
        Object next;
        Iterator it = this.f1641d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC0307g.m699a(((DiagnosticItem) next).f1668a, str)) {
                break;
            }
        }
        return (DiagnosticItem) next;
    }

    /* JADX INFO: renamed from: b */
    public final int m1358b() {
        List list = this.f1641d;
        int i2 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((DiagnosticItem) it.next()).f1670c == DiagnosticLevel.f1666c && (i2 = i2 + 1) < 0) {
                    AbstractC0182m.m557i0();
                    throw null;
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public final int m1359c() {
        List list = this.f1641d;
        int i2 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((DiagnosticItem) it.next()).f1670c == DiagnosticLevel.f1664a && (i2 = i2 + 1) < 0) {
                    AbstractC0182m.m557i0();
                    throw null;
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: d */
    public final int m1360d() {
        List list = this.f1641d;
        int i2 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((DiagnosticItem) it.next()).f1670c == DiagnosticLevel.f1665b && (i2 = i2 + 1) < 0) {
                    AbstractC0182m.m557i0();
                    throw null;
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: e */
    public final String m1361e() {
        return "ok=" + m1359c() + " partial=" + m1360d() + " fail=" + m1358b() + " total=" + this.f1641d.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppFingerprint)) {
            return false;
        }
        AppFingerprint appFingerprint = (AppFingerprint) obj;
        return AbstractC0307g.m699a(this.f1638a, appFingerprint.f1638a) && AbstractC0307g.m699a(this.f1639b, appFingerprint.f1639b) && this.f1640c == appFingerprint.f1640c && AbstractC0307g.m699a(this.f1641d, appFingerprint.f1641d) && this.f1642e == appFingerprint.f1642e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1642e) + ((this.f1641d.hashCode() + ((Long.hashCode(this.f1640c) + ((this.f1639b.hashCode() + (this.f1638a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CompatReport(fingerprint=" + this.f1638a + ", wechatSummary=" + this.f1639b + ", atMs=" + this.f1640c + ", results=" + this.f1641d + ", shouldShowDialog=" + this.f1642e + ")";
    }
}
