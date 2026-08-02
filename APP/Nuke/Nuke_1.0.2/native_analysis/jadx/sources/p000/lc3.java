package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lc3 implements nc3 {

    /* JADX INFO: renamed from: a */
    public final List f6062a;

    public lc3(List list) {
        this.f6062a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lc3) && this.f6062a.equals(((lc3) obj).f6062a);
    }

    public final int hashCode() {
        return this.f6062a.hashCode();
    }

    public final String toString() {
        return "Loaded(contacts=" + this.f6062a + ")";
    }
}
