package p000;

import top.anjao2024.xp1whs.MainActivity;

/* JADX INFO: renamed from: ug */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0802ug implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6221d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ MainActivity f6222e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0802ug(MainActivity mainActivity, int i) {
        this.f6221d = i;
        this.f6222e = mainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6221d;
        MainActivity mainActivity = this.f6222e;
        switch (i) {
            case 0:
                AbstractActivityC0246gh.m1244d(mainActivity);
                break;
            default:
                mainActivity.invalidateMenu();
                break;
        }
    }
}
