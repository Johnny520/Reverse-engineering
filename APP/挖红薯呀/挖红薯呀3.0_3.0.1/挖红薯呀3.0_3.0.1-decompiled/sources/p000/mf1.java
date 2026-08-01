package p000;

import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mf1 implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3946a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lf1 f3947b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ mf1(lf1 lf1Var, int i) {
        this.f3946a = i;
        this.f3947b = lf1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = this.f3946a;
        lf1 lf1Var = this.f3947b;
        switch (i) {
            case 0:
                of1.f4554b.mo2701b(lf1Var);
                break;
            default:
                of1.f4554b.mo2701b(lf1Var);
                break;
        }
    }
}
