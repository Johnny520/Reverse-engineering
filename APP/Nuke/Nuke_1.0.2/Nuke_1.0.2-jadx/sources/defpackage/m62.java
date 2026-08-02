package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m62 implements pc2 {
    public final LinkedHashSet a = new LinkedHashSet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m62(qc2 qc2Var) {
        qc2Var.c("androidx.savedstate.Restarter", this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pc2
    public final Bundle a() {
        Bundle bundleL = tl.l((ow1[]) Arrays.copyOf(new ow1[0], 0));
        List listF0 = du.F0(this.a);
        bundleL.putStringArrayList("classes_to_restore", listF0 instanceof ArrayList ? (ArrayList) listF0 : new ArrayList<>(listF0));
        return bundleL;
    }
}
