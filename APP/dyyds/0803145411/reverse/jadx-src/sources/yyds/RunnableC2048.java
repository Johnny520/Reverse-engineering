package yyds;

import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.p000ss.android.ugc.awemes.MainActivity;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲀᛸᛴᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2048 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f10182;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ View f10183;

    public /* synthetic */ RunnableC2048(View view, int i) {
        this.f10182 = i;
        this.f10183 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10182;
        View view = this.f10183;
        switch (i) {
            case 0:
                C1784.f9011.getClass();
                C1628 c1628M3555 = C1784.m3555(view);
                if (c1628M3555 != null) {
                    C1784.m3562(c1628M3555, view.isSelected(), false, false, false);
                }
                break;
            default:
                List list = MainActivity.f451;
                view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                break;
        }
    }
}
