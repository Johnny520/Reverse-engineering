package p000;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ve0 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6664d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vt0 f6665e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SharedPreferences f6666f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ve0(vt0 vt0Var, SharedPreferences sharedPreferences, int i) {
        this.f6664d = i;
        this.f6665e = vt0Var;
        this.f6666f = sharedPreferences;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f6664d;
        SharedPreferences sharedPreferences = this.f6666f;
        vt0 vt0Var = this.f6665e;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (i) {
            case 0:
                return vf0.m4515I2(vt0Var, sharedPreferences, zBooleanValue);
            case 1:
                return vf0.m4563U2(vt0Var, sharedPreferences, zBooleanValue);
            default:
                return vf0.m4668q3(vt0Var, sharedPreferences, zBooleanValue);
        }
    }
}
