package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class df0 {

    /* JADX INFO: renamed from: a */
    public final yq2 f2015a;

    /* JADX INFO: renamed from: b */
    public final Executor f2016b;

    public df0(yq2 yq2Var, Executor executor) {
        this.f2015a = yq2Var;
        this.f2016b = executor;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof df0) && this.f2015a == ((df0) obj).f2015a;
    }

    public final int hashCode() {
        return this.f2015a.hashCode();
    }
}
