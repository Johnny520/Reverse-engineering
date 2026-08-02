package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u62 implements w62 {

    /* JADX INFO: renamed from: a */
    public final List f11118a;

    public u62(List list) {
        this.f11118a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u62) && this.f11118a.equals(((u62) obj).f11118a);
    }

    public final int hashCode() {
        return this.f11118a.hashCode();
    }

    public final String toString() {
        return "Loaded(contacts=" + this.f11118a + ")";
    }
}
