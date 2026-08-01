package p000;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class h10 {

    /* JADX INFO: renamed from: a */
    public final Resources f2090a;

    /* JADX INFO: renamed from: b */
    public final Resources.Theme f2091b;

    public h10(Resources resources, Resources.Theme theme) {
        this.f2090a = resources;
        this.f2091b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h10.class == obj.getClass()) {
            h10 h10Var = (h10) obj;
            if (this.f2090a.equals(h10Var.f2090a) && AbstractC0908xw.m2709a(this.f2091b, h10Var.f2091b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0908xw.m2710b(this.f2090a, this.f2091b);
    }
}
