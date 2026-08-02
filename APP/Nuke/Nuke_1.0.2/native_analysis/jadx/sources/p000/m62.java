package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m62 implements pc2 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f6488a = new LinkedHashSet();

    public m62(qc2 qc2Var) {
        qc2Var.m4135c("androidx.savedstate.Restarter", this);
    }

    @Override // p000.pc2
    /* JADX INFO: renamed from: a */
    public final Bundle mo3037a() {
        Bundle bundleM5313l = AbstractC0738tl.m5313l((ow1[]) Arrays.copyOf(new ow1[0], 0));
        List listM1148F0 = AbstractC0142du.m1148F0(this.f6488a);
        bundleM5313l.putStringArrayList("classes_to_restore", listM1148F0 instanceof ArrayList ? (ArrayList) listM1148F0 : new ArrayList<>(listM1148F0));
        return bundleM5313l;
    }
}
