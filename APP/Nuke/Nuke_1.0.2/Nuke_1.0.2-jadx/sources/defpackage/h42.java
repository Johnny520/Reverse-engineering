package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h42 {
    public final Class a;
    public final ArrayList b;
    public final ClassLoader c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h42(Class cls, List list, ClassLoader classLoader) {
        this.a = cls;
        this.b = new ArrayList(list);
        this.c = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h42.class != obj.getClass()) {
            return false;
        }
        h42 h42Var = (h42) obj;
        return this.a == h42Var.a && this.b.equals(h42Var.b) && this.c == h42Var.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.c.hashCode() + this.b.hashCode() + this.a.hashCode();
    }
}
