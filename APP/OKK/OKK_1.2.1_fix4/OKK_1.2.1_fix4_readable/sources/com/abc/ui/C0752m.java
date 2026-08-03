package com.abc.ui;

import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: d0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0752m {

    /* JADX INFO: renamed from: a */
    public final String f2622a;

    /* JADX INFO: renamed from: b */
    public final String f2623b;

    /* JADX INFO: renamed from: c */
    public final String f2624c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0275a f2625d;

    public C0752m(String str, String str2, String str3, InterfaceC0275a interfaceC0275a) {
        this.f2622a = str;
        this.f2623b = str2;
        this.f2624c = str3;
        this.f2625d = interfaceC0275a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0752m)) {
            return false;
        }
        C0752m c0752m = (C0752m) obj;
        return AbstractC0307g.m699a(this.f2622a, c0752m.f2622a) && AbstractC0307g.m699a(this.f2623b, c0752m.f2623b) && AbstractC0307g.m699a(this.f2624c, c0752m.f2624c) && AbstractC0307g.m699a(this.f2625d, c0752m.f2625d);
    }

    public final int hashCode() {
        return this.f2625d.hashCode() + ((this.f2624c.hashCode() + ((this.f2623b.hashCode() + (this.f2622a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MenuRow(emoji=" + this.f2622a + ", title=" + this.f2623b + ", subtitle=" + this.f2624c + ", onClick=" + this.f2625d + ")";
    }
}
