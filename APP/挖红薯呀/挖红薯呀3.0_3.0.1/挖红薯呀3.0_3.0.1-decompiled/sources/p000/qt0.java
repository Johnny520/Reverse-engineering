package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class qt0 implements jx0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f5221a = new LinkedHashSet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qt0(kx0 kx0Var) {
        kx0Var.m1962c("androidx.savedstate.Restarter", this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.jx0
    /* JADX INFO: renamed from: a */
    public final Bundle mo1264a() {
        Bundle bundleM1922h = AbstractC0398kl.m1922h((uo0[]) Arrays.copyOf(new uo0[0], 0));
        List listM5253W = AbstractC0960ye.m5253W(this.f5221a);
        bundleM1922h.putStringArrayList("classes_to_restore", listM5253W instanceof ArrayList ? (ArrayList) listM5253W : new ArrayList<>(listM5253W));
        return bundleM1922h;
    }
}
