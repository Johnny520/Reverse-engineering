package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h42 {

    /* JADX INFO: renamed from: a */
    public final Class f3813a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f3814b;

    /* JADX INFO: renamed from: c */
    public final ClassLoader f3815c;

    public h42(Class cls, List list, ClassLoader classLoader) {
        this.f3813a = cls;
        this.f3814b = new ArrayList(list);
        this.f3815c = classLoader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h42.class != obj.getClass()) {
            return false;
        }
        h42 h42Var = (h42) obj;
        return this.f3813a == h42Var.f3813a && this.f3814b.equals(h42Var.f3814b) && this.f3815c == h42Var.f3815c;
    }

    public final int hashCode() {
        return this.f3815c.hashCode() + this.f3814b.hashCode() + this.f3813a.hashCode();
    }
}
