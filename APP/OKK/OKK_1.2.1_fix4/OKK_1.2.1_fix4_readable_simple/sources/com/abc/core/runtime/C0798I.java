package com.abc.core.runtime;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: f0.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0798I {

    /* JADX INFO: renamed from: a */
    public final View f2898a;

    /* JADX INFO: renamed from: b */
    public final EditText f2899b;

    public C0798I(LinearLayout r1, EditText r2) {
        this.f2898a = r1;
        this.f2899b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0798I) == true) goto L8;
        return false;
    L8:
        C0798I r52 = (C0798I) r5;
        View r1 = r52.f2898a;
        if (AbstractC0307g.m699a(this.f2898a, r1) == true) goto L12;
        return false;
    L12:
        if (AbstractC0307g.m699a(this.f2899b, r52.f2899b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f2898a.hashCode() * 31;
        return this.f2899b.hashCode() + r02;
    }

    public final String toString() {
        return "Field(root=" + this.f2898a + ", input=" + this.f2899b + ")";
    }
}
