package yyds;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000ss.android.ugc.awemes.MainActivity;

/* JADX INFO: renamed from: yyds.ᛱᲈᛴᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0254 implements Runnable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f1404;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f1405;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ int f1406;

    public /* synthetic */ RunnableC0254(KeyEvent.Callback callback, int i, int i2) {
        this.f1405 = i2;
        this.f1404 = callback;
        this.f1406 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1213 c1213;
        int i = this.f1405;
        int i2 = this.f1406;
        KeyEvent.Callback callback = this.f1404;
        switch (i) {
            case 0:
                AbstractC1924 abstractC1924 = (AbstractC1924) callback;
                abstractC1924.f9707 = false;
                if (i2 != 0) {
                    Log.w("BaseBlurView", "PixelCopy fallback failed: " + i2);
                } else {
                    abstractC1924.m3716(abstractC1924.f9688, abstractC1924.f9691);
                    abstractC1924.invalidate();
                }
                break;
            default:
                MainActivity mainActivity = (MainActivity) callback;
                if (mainActivity.f472 == EnumC0110.f755 && i2 < mainActivity.f475.mo531() && !mainActivity.isFinishing() && !mainActivity.isDestroyed()) {
                    C1213 c12132 = mainActivity.f482;
                    if (c12132 == null) {
                        AbstractC2328.m4341(-273357061391214L);
                        c12132 = null;
                    }
                    AbstractC2551 layoutManager = c12132.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        View viewM205 = linearLayoutManager.m205(0, linearLayoutManager.m4613(), false);
                        int iM4603 = viewM205 == null ? -1 : AbstractC2551.m4603(viewM205);
                        View viewMo187 = linearLayoutManager.mo187(iM4603);
                        if (viewMo187 != null) {
                            int i3 = i2 - iM4603;
                            int iM4598 = AbstractC2551.m4598(viewMo187) + (AbstractC2551.m4596(viewMo187) * i3);
                            C1213 c12133 = mainActivity.f482;
                            if (c12133 == null) {
                                AbstractC2328.m4341(-273412895966062L);
                                c12133 = null;
                            }
                            int paddingLeft = iM4598 - c12133.getPaddingLeft();
                            if (paddingLeft != 0) {
                                int iAbs = (Math.abs(i3) * 120) + 650;
                                int i4 = iAbs > 1500 ? 1500 : iAbs;
                                C1213 c12134 = mainActivity.f482;
                                if (c12134 == null) {
                                    AbstractC2328.m4341(-273468730540910L);
                                    c1213 = null;
                                } else {
                                    c1213 = c12134;
                                }
                                c1213.m2434(paddingLeft, 0, new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f), i4, false);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
