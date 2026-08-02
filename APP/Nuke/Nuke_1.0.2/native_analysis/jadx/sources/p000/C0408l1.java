package p000;

import java.util.List;

/* JADX INFO: renamed from: l1 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0408l1 implements InterfaceC0482n1 {

    /* JADX INFO: renamed from: a */
    public final List f5868a;

    public C0408l1(List list) {
        this.f5868a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0408l1) && this.f5868a.equals(((C0408l1) obj).f5868a);
    }

    public final int hashCode() {
        return this.f5868a.hashCode();
    }

    public final String toString() {
        return "Loaded(models=" + this.f5868a + ")";
    }
}
