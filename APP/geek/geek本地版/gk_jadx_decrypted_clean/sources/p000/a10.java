package p000;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class a10 {

    /* JADX INFO: renamed from: a */
    public final Resources f10a;

    /* JADX INFO: renamed from: b */
    public final Resources.Theme f11b;

    public a10(Resources resources, Resources.Theme theme) {
        this.f10a = resources;
        this.f11b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a10.class == obj.getClass()) {
            a10 a10Var = (a10) obj;
            if (this.f10a.equals(a10Var.f10a) && AbstractC0612pw.m2131a(this.f11b, a10Var.f11b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0612pw.m2132b(this.f10a, this.f11b);
    }
}
