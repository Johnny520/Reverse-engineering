package p091g3;

import android.os.Build;
import android.view.DisplayCutout;
import p017b2.AbstractC0170b;
import p018b3.C0171a;

/* JADX INFO: renamed from: g3.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1303d {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f4362a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1303d(DisplayCutout displayCutout) {
        this.f4362a = displayCutout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C0171a m3456a() {
        return Build.VERSION.SDK_INT >= 30 ? C0171a.m767c(AbstractC0170b.m759b(this.f4362a)) : C0171a.f444e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1303d.class != obj.getClass()) {
            return false;
        }
        return this.f4362a.equals(((C1303d) obj).f4362a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4362a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DisplayCutoutCompat{" + this.f4362a + "}";
    }
}
