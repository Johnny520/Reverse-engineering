package yyds;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.android.app.CustomRecyclerView;

/* JADX INFO: renamed from: yyds.ᛸᛶᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1809 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final CustomRecyclerView f9116;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public boolean f9117 = true;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public boolean f9118;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final InterpolatorC1945 f9115 = new InterpolatorC1945(1);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final InterpolatorC1945 f9114 = new InterpolatorC1945(0);

    public C1809(CustomRecyclerView customRecyclerView) {
        this.f9116 = customRecyclerView;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m3585(View view, View view2) {
        if (this.f9117) {
            return;
        }
        this.f9117 = true;
        ViewPropertyAnimator duration = view.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        InterpolatorC1945 interpolatorC1945 = f9115;
        duration.setInterpolator(interpolatorC1945).start();
        view2.animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(interpolatorC1945).start();
    }
}
