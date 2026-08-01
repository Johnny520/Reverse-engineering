package p201m3;

import p011B4.AbstractC0231b;
import p160f3.AbstractC2162v;

/* JADX INFO: renamed from: m3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2613j extends AbstractRunnableC2612i {

    /* JADX INFO: renamed from: f */
    public final Runnable f8310f;

    public C2613j(Runnable runnable, long j5, boolean z5) {
        super(j5, z5);
        this.f8310f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8310f.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f8310f;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC2162v.m3987i(runnable));
        sb.append(", ");
        sb.append(this.f8308d);
        sb.append(", ");
        return AbstractC0231b.m402m(sb, this.f8309e ? "Blocking" : "Non-blocking", ']');
    }
}
