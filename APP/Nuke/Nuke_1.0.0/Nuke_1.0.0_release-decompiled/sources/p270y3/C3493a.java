package p270y3;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: y3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3493a {

    /* JADX INFO: renamed from: a */
    public final String f10890a;

    /* JADX INFO: renamed from: b */
    public final String f10891b;

    public C3493a(String str, String str2) {
        this.f10890a = str;
        this.f10891b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3493a)) {
            return false;
        }
        C3493a c3493a = (C3493a) obj;
        return AbstractC1665j.m2981a(this.f10890a, c3493a.f10890a) && AbstractC1665j.m2981a(this.f10891b, c3493a.f10891b);
    }

    public final int hashCode() {
        return this.f10891b.hashCode() + (this.f10890a.hashCode() * 31);
    }

    public final String toString() {
        return "ModuleScope(name=" + this.f10890a + ", range=" + this.f10891b + ")";
    }
}
