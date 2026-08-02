package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sk2 {

    /* JADX INFO: renamed from: a */
    public final List f10179a;

    public sk2(List list) {
        this.f10179a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sk2) && this.f10179a.equals(((sk2) obj).f10179a);
    }

    public final int hashCode() {
        return this.f10179a.hashCode();
    }

    public final String toString() {
        return "ScriptStopAllResult(results=" + this.f10179a + ")";
    }
}
