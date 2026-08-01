package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xe0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7336a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f7337b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vt0 f7338c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ SharedPreferences f7339d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ xe0(Context context, vt0 vt0Var, SharedPreferences sharedPreferences, int i) {
        this.f7336a = i;
        this.f7337b = context;
        this.f7338c = vt0Var;
        this.f7339d = sharedPreferences;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f7336a;
        SharedPreferences sharedPreferences = this.f7339d;
        vt0 vt0Var = this.f7338c;
        Context context = this.f7337b;
        switch (i) {
            case 0:
                vf0.m4487C3(context, vt0Var, sharedPreferences, view);
                break;
            case 1:
                vf0.m4698w3(context, vt0Var, sharedPreferences, view);
                break;
            default:
                vf0.m4539O2(context, vt0Var, sharedPreferences, view);
                break;
        }
    }
}
