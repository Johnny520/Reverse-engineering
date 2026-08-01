package p083q;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: renamed from: q.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0797k {

    /* JADX INFO: renamed from: a */
    public final Resources f2652a;

    /* JADX INFO: renamed from: b */
    public final Resources.Theme f2653b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0797k(Resources resources, Resources.Theme theme) {
        this.f2652a = resources;
        this.f2653b = theme;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0797k.class == obj.getClass()) {
            C0797k c0797k = (C0797k) obj;
            if (this.f2652a.equals(c0797k.f2652a) && Objects.equals(this.f2653b, c0797k.f2653b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Objects.hash(this.f2652a, this.f2653b);
    }
}
