package p000;

import android.view.View;

/* JADX INFO: renamed from: xz */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0944xz implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7466a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ m00 f7467b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC0944xz(m00 m00Var, int i) {
        this.f7466a = i;
        this.f7467b = m00Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f7466a;
        m00 m00Var = this.f7467b;
        switch (i) {
            case 0:
                m00.m2195W2(m00Var, view);
                break;
            case 1:
                m00.m2199X2(m00Var, view);
                break;
            case 2:
                m00.m2115C2(m00Var, view);
                break;
            default:
                m00.m2119D2(m00Var, view);
                break;
        }
    }
}
