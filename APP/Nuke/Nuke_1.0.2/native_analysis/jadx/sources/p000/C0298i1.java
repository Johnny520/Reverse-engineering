package p000;

import java.util.List;

/* JADX INFO: renamed from: i1 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0298i1 implements InterfaceC0333j1 {

    /* JADX INFO: renamed from: a */
    public final List f4207a;

    public C0298i1(List list) {
        this.f4207a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0298i1) && this.f4207a.equals(((C0298i1) obj).f4207a);
    }

    public final int hashCode() {
        return this.f4207a.hashCode();
    }

    public final String toString() {
        return "Ok(models=" + this.f4207a + ")";
    }
}
