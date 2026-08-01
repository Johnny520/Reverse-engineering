package p223q1;

import android.content.Intent;
import java.util.Objects;

/* JADX INFO: renamed from: q1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2908b {

    /* JADX INFO: renamed from: a */
    public final Integer f9195a;

    /* JADX INFO: renamed from: b */
    public final Object f9196b;

    public C2908b(Integer num, Intent intent) {
        this.f9195a = num;
        this.f9196b = intent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2908b)) {
            return false;
        }
        C2908b c2908b = (C2908b) obj;
        return c2908b.f9195a.equals(this.f9195a) && Objects.equals(c2908b.f9196b, this.f9196b);
    }

    public final int hashCode() {
        int iHashCode = this.f9195a.hashCode();
        Object obj = this.f9196b;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Pair{" + this.f9195a + " " + this.f9196b + "}";
    }
}
