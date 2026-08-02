package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gy2 extends fy2 {

    /* JADX INFO: renamed from: j */
    public final Runnable f3743j;

    public gy2(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.f3743j = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3743j.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f3743j;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(p40.m3740x(runnable));
        sb.append(", ");
        sb.append(this.f3197h);
        sb.append(", ");
        return hk1.m2210i(sb, this.f3198i ? "Blocking" : "Non-blocking", ']');
    }
}
