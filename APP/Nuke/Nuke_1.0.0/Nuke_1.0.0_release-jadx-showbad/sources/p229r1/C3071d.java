package p229r1;

import android.os.Build;
import android.view.DisplayCutout;
import java.util.Objects;
import p059L0.AbstractC0956b;
import p205n1.C2688b;

/* JADX INFO: renamed from: r1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3071d {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f9783a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3071d(DisplayCutout displayCutout) {
        this.f9783a = displayCutout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C2688b m5395a() {
        return Build.VERSION.SDK_INT >= 30 ? C2688b.m4668c(AbstractC0956b.m1965c(this.f9783a)) : C2688b.f8571e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3071d.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f9783a, ((C3071d) obj).f9783a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9783a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DisplayCutoutCompat{" + this.f9783a + "}";
    }
}
