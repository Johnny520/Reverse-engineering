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

    public C0752m(String r1, String r2, String r3, InterfaceC0275a r4) {
        this.f2622a = r1;
        this.f2623b = r2;
        this.f2624c = r3;
        this.f2625d = r4;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0752m) == true) goto L8;
        return false;
    L8:
        C0752m r52 = (C0752m) r5;
        String r1 = r52.f2622a;
        if (AbstractC0307g.m699a(this.f2622a, r1) == true) goto L12;
        return false;
    L12:
        if (AbstractC0307g.m699a(this.f2623b, r52.f2623b) == true) goto L15;
        return false;
    L15:
        if (AbstractC0307g.m699a(this.f2624c, r52.f2624c) == true) goto L18;
        return false;
    L18:
        if (AbstractC0307g.m699a(this.f2625d, r52.f2625d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f2622a.hashCode() * 31;
        int r1 = (this.f2623b.hashCode() + r02) * 31;
        int r03 = (this.f2624c.hashCode() + r1) * 31;
        return this.f2625d.hashCode() + r03;
    }

    public final String toString() {
        return "MenuRow(emoji=" + this.f2622a + ", title=" + this.f2623b + ", subtitle=" + this.f2624c + ", onClick=" + this.f2625d + ")";
    }
}
