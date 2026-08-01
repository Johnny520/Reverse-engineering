package p000;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ye0 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7614d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ SharedPreferences f7615e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ye0(SharedPreferences sharedPreferences, int i) {
        this.f7614d = i;
        this.f7615e = sharedPreferences;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f7614d;
        SharedPreferences sharedPreferences = this.f7615e;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (i) {
            case 0:
                return vf0.m4642l2(sharedPreferences, zBooleanValue);
            case 1:
                return vf0.m4597c2(sharedPreferences, zBooleanValue);
            case 2:
                return vf0.m4652n2(sharedPreferences, zBooleanValue);
            case 3:
                return vf0.m4627i2(sharedPreferences, zBooleanValue);
            case 4:
                return vf0.m4607e2(sharedPreferences, zBooleanValue);
            case 5:
                return vf0.m4617g2(sharedPreferences, zBooleanValue);
            case 6:
                return vf0.m4558T1(sharedPreferences, zBooleanValue);
            case 7:
                return vf0.m4562U1(sharedPreferences, zBooleanValue);
            default:
                return vf0.m4566V1(sharedPreferences, zBooleanValue);
        }
    }
}
