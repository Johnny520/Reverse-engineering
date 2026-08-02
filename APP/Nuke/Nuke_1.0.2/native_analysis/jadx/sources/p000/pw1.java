package p000;

import android.content.Intent;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pw1 {

    /* JADX INFO: renamed from: a */
    public final Integer f8621a;

    /* JADX INFO: renamed from: b */
    public final Object f8622b;

    public pw1(Integer num, Intent intent) {
        this.f8621a = num;
        this.f8622b = intent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pw1)) {
            return false;
        }
        pw1 pw1Var = (pw1) obj;
        return pw1Var.f8621a.equals(this.f8621a) && Objects.equals(pw1Var.f8622b, this.f8622b);
    }

    public final int hashCode() {
        int iHashCode = this.f8621a.hashCode();
        Object obj = this.f8622b;
        return (obj == null ? 0 : obj.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f8621a + " " + this.f8622b + "}";
    }
}
