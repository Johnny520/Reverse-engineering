package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class md3 {

    /* JADX INFO: renamed from: a */
    public final List f6580a;

    /* JADX INFO: renamed from: b */
    public final Map f6581b;

    public md3(List list, Map map) {
        map.getClass();
        this.f6580a = list;
        this.f6581b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md3)) {
            return false;
        }
        md3 md3Var = (md3) obj;
        return this.f6580a.equals(md3Var.f6580a) && t11.m5086l(this.f6581b, md3Var.f6581b);
    }

    public final int hashCode() {
        return this.f6581b.hashCode() + (this.f6580a.hashCode() * 31);
    }

    public final String toString() {
        return "Event(arguments=" + this.f6580a + ", result=" + this.f6581b + ")";
    }
}
