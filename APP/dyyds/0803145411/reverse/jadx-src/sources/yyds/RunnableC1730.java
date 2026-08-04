package yyds;

import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.p000ss.android.ugc.awemes.MainActivity;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛸᛳᛱᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1730 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f8758;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ MainActivity f8759;

    public /* synthetic */ RunnableC1730(MainActivity mainActivity, int i) {
        this.f8758 = i;
        this.f8759 = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f8758;
        View view = null;
        MainActivity mainActivity = this.f8759;
        switch (i) {
            case 0:
                View view2 = mainActivity.f462;
                if (view2 == null) {
                    AbstractC2328.m4341(-272485183030126L);
                } else {
                    view = view2;
                }
                view.animate().scaleX(1.12f).scaleY(1.12f).setDuration(1800L).withEndAction(new RunnableC1730(mainActivity, 2)).start();
                break;
            case 1:
                List list = MainActivity.f451;
                mainActivity.m323(false);
                break;
            case 2:
                View view3 = mainActivity.f462;
                if (view3 == null) {
                    AbstractC2328.m4341(-272446528324462L);
                } else {
                    view = view3;
                }
                view.animate().scaleX(0.92f).scaleY(0.92f).setDuration(1800L).withEndAction(new RunnableC1730(mainActivity, 6)).start();
                break;
            case 3:
                List list2 = MainActivity.f451;
                mainActivity.m340();
                break;
            case 4:
                View view4 = mainActivity.f462;
                if (view4 == null) {
                    AbstractC2328.m4341(-272034211464046L);
                } else {
                    view = view4;
                }
                view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(new OvershootInterpolator(2.2f)).start();
                break;
            case 5:
                List list3 = MainActivity.f451;
                mainActivity.m337();
                C1213 c1213 = mainActivity.f482;
                if (c1213 == null) {
                    AbstractC2328.m4341(-272223190025070L);
                    c1213 = null;
                }
                c1213.post(new RunnableC1730(mainActivity, 7));
                C1213 c12132 = mainActivity.f482;
                if (c12132 == null) {
                    AbstractC2328.m4341(-272279024599918L);
                    c12132 = null;
                }
                c12132.setScaleX(0.96f);
                C1213 c12133 = mainActivity.f482;
                if (c12133 == null) {
                    AbstractC2328.m4341(-272334859174766L);
                    c12133 = null;
                }
                c12133.setScaleY(0.96f);
                C1213 c12134 = mainActivity.f482;
                if (c12134 == null) {
                    AbstractC2328.m4341(-272390693749614L);
                } else {
                    view = c12134;
                }
                view.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(new OvershootInterpolator(0.6f)).withEndAction(new RunnableC1730(mainActivity, 8)).start();
                break;
            case 6:
                if (mainActivity.f473 && !mainActivity.isFinishing() && !mainActivity.isDestroyed()) {
                    mainActivity.m310();
                    break;
                }
                break;
            case 7:
                if (mainActivity.f472 != EnumC0110.f755) {
                    mainActivity.m314();
                } else {
                    mainActivity.m340();
                }
                break;
            case 8:
                C1213 c12135 = mainActivity.f482;
                if (c12135 == null) {
                    AbstractC2328.m4341(-272111520875374L);
                    c12135 = null;
                }
                c12135.setScaleX(1.0f);
                C1213 c12136 = mainActivity.f482;
                if (c12136 == null) {
                    AbstractC2328.m4341(-272167355450222L);
                } else {
                    view = c12136;
                }
                view.setScaleY(1.0f);
                break;
            case 9:
                if (mainActivity.f472 != EnumC0110.f755) {
                    mainActivity.m314();
                } else {
                    mainActivity.m340();
                }
                break;
            default:
                if (mainActivity.f472 != EnumC0110.f755) {
                    mainActivity.m314();
                } else {
                    mainActivity.m340();
                }
                break;
        }
    }
}
