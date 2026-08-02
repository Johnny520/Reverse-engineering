package p000;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class su0 {

    /* JADX INFO: renamed from: a */
    public final Constructor f10371a;

    /* JADX INFO: renamed from: b */
    public final Object[] f10372b;

    /* JADX INFO: renamed from: c */
    public final int f10373c;

    public su0(Constructor constructor, Object[] objArr, int i) {
        this.f10371a = constructor;
        this.f10372b = objArr;
        this.f10373c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su0)) {
            return false;
        }
        su0 su0Var = (su0) obj;
        return this.f10371a.equals(su0Var.f10371a) && this.f10372b.equals(su0Var.f10372b) && this.f10373c == su0Var.f10373c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10373c) + ((Arrays.hashCode(this.f10372b) + (this.f10371a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ScoredConstructor(constructor=" + this.f10371a + ", arguments=" + Arrays.toString(this.f10372b) + ", score=" + this.f10373c + ")";
    }
}
