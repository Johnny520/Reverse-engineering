package p000;

/* JADX INFO: renamed from: ip */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0327ip implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2599d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ DialogC0402kp f2600e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0327ip(DialogC0402kp dialogC0402kp, int i) {
        this.f2599d = i;
        this.f2600e = dialogC0402kp;
    }

    /* JADX DEBUG: Class process forced to load method for inline: m00.F(kp):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2599d;
        DialogC0402kp dialogC0402kp = this.f2600e;
        switch (i) {
            case 0:
                DialogC0402kp.m1952k(dialogC0402kp);
                break;
            case 1:
                m00.m2247h3(dialogC0402kp);
                break;
            default:
                m00.m2139I2(dialogC0402kp);
                break;
        }
    }
}
