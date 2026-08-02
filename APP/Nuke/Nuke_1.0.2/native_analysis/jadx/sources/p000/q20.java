package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q20 {

    /* JADX INFO: renamed from: a */
    public final Class f8705a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f8706b;

    public q20(Class cls, ArrayList arrayList) {
        this.f8705a = cls;
        this.f8706b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q20)) {
            return false;
        }
        q20 q20Var = (q20) obj;
        return t11.m5086l(this.f8705a, q20Var.f8705a) && this.f8706b.equals(q20Var.f8706b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f8706b.hashCode() + (this.f8705a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CreateInstanceConstructorCacheKey(targetClass=" + this.f8705a + ", parameterTypes=" + this.f8706b + ", isPublic=true)";
    }
}
