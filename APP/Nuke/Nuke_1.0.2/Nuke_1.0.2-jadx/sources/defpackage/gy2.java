package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gy2 extends fy2 {
    public final Runnable j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gy2(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.j = runnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        this.j.run();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.j;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(p40.x(runnable));
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        return hk1.i(sb, this.i ? "Blocking" : "Non-blocking", ']');
    }
}
