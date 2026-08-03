package vg;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;
import ng.AbstractC3015m;
import p263rg.C3805b;

/* JADX INFO: renamed from: vg.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4555d {

    /* JADX INFO: renamed from: a */
    public static final List f15023a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        try {
            f15023a = AbstractC3015m.m6418b0(AbstractC3015m.m6408R(Arrays.asList(new C3805b()).iterator()));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
