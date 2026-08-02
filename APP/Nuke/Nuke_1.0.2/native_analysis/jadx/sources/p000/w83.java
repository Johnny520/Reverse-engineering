package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w83 implements jh1 {

    /* JADX INFO: renamed from: b */
    public static final Set f12406b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a */
    public final jh1 f12407a;

    public w83(jh1 jh1Var) {
        this.f12407a = jh1Var;
    }

    @Override // p000.jh1
    /* JADX INFO: renamed from: a */
    public final boolean mo235a(Object obj) {
        return f12406b.contains(((Uri) obj).getScheme());
    }

    @Override // p000.jh1
    /* JADX INFO: renamed from: b */
    public final ih1 mo236b(Object obj, int i, int i2, ov1 ov1Var) {
        return this.f12407a.mo236b(new cq0(((Uri) obj).toString()), i, i2, ov1Var);
    }
}
