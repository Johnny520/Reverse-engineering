package p000;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s20 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f9877a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof s20) {
            return t11.m5086l(this.f9877a, ((s20) obj).f9877a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9877a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f9877a + ")";
    }
}
