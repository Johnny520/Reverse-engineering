package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i33 implements k33 {

    /* JADX INFO: renamed from: a */
    public final List f4256a;

    public i33(List list) {
        this.f4256a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i33) && this.f4256a.equals(((i33) obj).f4256a);
    }

    public final int hashCode() {
        return this.f4256a.hashCode();
    }

    public final String toString() {
        return "Loaded(contacts=" + this.f4256a + ")";
    }
}
