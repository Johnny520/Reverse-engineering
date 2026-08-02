package p000;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ng1 {

    /* JADX INFO: renamed from: a */
    public final RunnableC0633qv f7149a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f7150b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public final HashMap f7151c = new HashMap();

    public ng1(RunnableC0633qv runnableC0633qv) {
        this.f7149a = runnableC0633qv;
    }

    /* JADX INFO: renamed from: a */
    public final void m3307a() {
        this.f7150b.remove((Object) null);
        mg1 mg1Var = (mg1) this.f7151c.remove(null);
        if (mg1Var != null) {
            mg1Var.f6638a.mo506b(mg1Var.f6639b);
            mg1Var.f6639b = null;
        }
        this.f7149a.run();
    }
}
