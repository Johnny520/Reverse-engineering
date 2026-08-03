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

    public C0798I(LinearLayout linearLayout, EditText editText) {
        this.f2898a = linearLayout;
        this.f2899b = editText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0798I)) {
            return false;
        }
        C0798I c0798i = (C0798I) obj;
        return AbstractC0307g.m699a(this.f2898a, c0798i.f2898a) && AbstractC0307g.m699a(this.f2899b, c0798i.f2899b);
    }

    public final int hashCode() {
        return this.f2899b.hashCode() + (this.f2898a.hashCode() * 31);
    }

    public final String toString() {
        return "Field(root=" + this.f2898a + ", input=" + this.f2899b + ")";
    }
}
