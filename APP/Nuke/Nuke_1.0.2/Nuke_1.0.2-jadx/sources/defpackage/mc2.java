package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mc2 implements pc2 {
    public final qc2 a;
    public boolean b;
    public Bundle c;
    public final hx2 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mc2(qc2 qc2Var, dw dwVar) {
        qc2Var.getClass();
        this.a = qc2Var;
        this.d = new hx2(new rv(dwVar, 5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pc2
    public final Bundle a() {
        Bundle bundleL = tl.l((ow1[]) Arrays.copyOf(new ow1[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleL.putAll(bundle);
        }
        for (Map.Entry entry : ((nc2) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((uv) ((jc2) entry.getValue()).a.e).a();
            if (!bundleA.isEmpty()) {
                str.getClass();
                bundleL.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleA = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleL = tl.l((ow1[]) Arrays.copyOf(new ow1[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleL.putAll(bundle);
        }
        if (bundleA != null) {
            bundleL.putAll(bundleA);
        }
        this.c = bundleL;
        this.b = true;
    }
}
