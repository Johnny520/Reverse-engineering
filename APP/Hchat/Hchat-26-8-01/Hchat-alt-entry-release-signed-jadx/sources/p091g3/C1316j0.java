package p091g3;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: renamed from: g3.j0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C1316j0 extends C1314i0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1316j0(C1332r0 c1332r0, WindowInsets windowInsets) {
        super(c1332r0, windowInsets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    /* JADX INFO: renamed from: a */
    public C1332r0 mo3517a() {
        return C1332r0.m3558c(this.f4376c.consumeDisplayCutout(), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1312h0, p091g3.C1324n0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1316j0)) {
            return false;
        }
        C1316j0 c1316j0 = (C1316j0) obj;
        return Objects.equals(this.f4376c, c1316j0.f4376c) && Objects.equals(this.f4380g, c1316j0.f4380g) && C1312h0.m3494C(this.f4381h, c1316j0.f4381h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    /* JADX INFO: renamed from: f */
    public C1303d mo3518f() {
        DisplayCutout displayCutout = this.f4376c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C1303d(displayCutout);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    public int hashCode() {
        return this.f4376c.hashCode();
    }

    public C1316j0(C1332r0 c1332r0, C1316j0 c1316j0) {
        super(c1332r0, c1316j0);
    }
}
