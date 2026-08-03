package p091g3;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import p014b.C0126e;
import p099h.Hchat.R;
import p191n3.InterpolatorC2892a;

/* JADX INFO: renamed from: g3.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1338x extends AbstractC1298a0 {

    /* JADX INFO: renamed from: e */
    public static final PathInterpolator f4415e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f */
    public static final InterpolatorC2892a f4416f = new InterpolatorC2892a();

    /* JADX INFO: renamed from: g */
    public static final DecelerateInterpolator f4417g = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: h */
    public static final AccelerateInterpolator f4418h = new AccelerateInterpolator(1.5f);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m3564f(View view, C1300b0 c1300b0) {
        AbstractC1333s abstractC1333sM3568j = m3568j(view);
        if (abstractC1333sM3568j != null) {
            abstractC1333sM3568j.mo3560a(c1300b0);
            if (abstractC1333sM3568j.f4400h == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                m3564f(viewGroup.getChildAt(i9), c1300b0);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m3565g(View view, C1300b0 c1300b0, C1332r0 c1332r0, boolean z9) {
        AbstractC1333s abstractC1333sM3568j = m3568j(view);
        if (abstractC1333sM3568j != null) {
            abstractC1333sM3568j.f4401i = c1332r0;
            if (!z9) {
                abstractC1333sM3568j.mo3561b();
                z9 = abstractC1333sM3568j.f4400h == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                m3565g(viewGroup.getChildAt(i9), c1300b0, c1332r0, z9);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m3566h(View view, C1332r0 c1332r0, List list) {
        AbstractC1333s abstractC1333sM3568j = m3568j(view);
        if (abstractC1333sM3568j != null) {
            c1332r0 = abstractC1333sM3568j.mo3562d(c1332r0, list);
            if (abstractC1333sM3568j.f4400h == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                m3566h(viewGroup.getChildAt(i9), c1332r0, list);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m3567i(View view, C1300b0 c1300b0, C0126e c0126e) {
        AbstractC1333s abstractC1333sM3568j = m3568j(view);
        if (abstractC1333sM3568j != null) {
            abstractC1333sM3568j.mo3563e(c1300b0, c0126e);
            if (abstractC1333sM3568j.f4400h == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                m3567i(viewGroup.getChildAt(i9), c1300b0, c0126e);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static AbstractC1333s m3568j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC1337w) {
            return ((ViewOnApplyWindowInsetsListenerC1337w) tag).f4413a;
        }
        return null;
    }
}
