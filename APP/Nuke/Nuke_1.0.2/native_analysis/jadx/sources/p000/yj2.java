package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yj2 {

    /* JADX INFO: renamed from: a */
    public final List f13492a;

    public yj2(List list) {
        this.f13492a = list;
    }

    /* JADX INFO: renamed from: a */
    public final List m6286a() {
        return this.f13492a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yj2) && this.f13492a.equals(((yj2) obj).f13492a);
    }

    public final int hashCode() {
        return this.f13492a.hashCode();
    }

    public final String toString() {
        return "ScriptRuntimeSnapshot(scripts=" + this.f13492a + ")";
    }
}
