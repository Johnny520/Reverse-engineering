package p091g3;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import p018b3.C0171a;

/* JADX INFO: renamed from: g3.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1334t implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1300b0 f4402a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1332r0 f4403b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1332r0 f4404c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4405d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f4406e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1334t(C1300b0 c1300b0, C1332r0 c1332r0, C1332r0 c1332r02, int i9, View view) {
        this.f4402a = c1300b0;
        this.f4403b = c1332r0;
        this.f4404c = c1332r02;
        this.f4405d = i9;
        this.f4406e = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C1300b0 c1300b0 = this.f4402a;
        AbstractC1298a0 abstractC1298a0 = c1300b0.f4355a;
        abstractC1298a0.mo3448e(animatedFraction);
        float fMo3446c = abstractC1298a0.mo3446c();
        PathInterpolator pathInterpolator = C1338x.f4415e;
        int i9 = Build.VERSION.SDK_INT;
        C1332r0 c1332r0 = this.f4403b;
        AbstractC1310g0 c1308f0 = i9 >= 34 ? new C1308f0(c1332r0) : i9 >= 30 ? new C1306e0(c1332r0) : i9 >= 29 ? new C1304d0(c1332r0) : new C1302c0(c1332r0);
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            int i11 = this.f4405d & i10;
            C1324n0 c1324n0 = c1332r0.f4398a;
            if (i11 == 0) {
                c1308f0.mo3461c(i10, c1324n0.mo3501g(i10));
            } else {
                C0171a c0171aMo3501g = c1324n0.mo3501g(i10);
                C0171a c0171aMo3501g2 = this.f4404c.f4398a.mo3501g(i10);
                float f3 = 1.0f - fMo3446c;
                c1308f0.mo3461c(i10, C1332r0.m3557a(c0171aMo3501g, (int) (((double) ((c0171aMo3501g.f445a - c0171aMo3501g2.f445a) * f3)) + 0.5d), (int) (((double) ((c0171aMo3501g.f446b - c0171aMo3501g2.f446b) * f3)) + 0.5d), (int) (((double) ((c0171aMo3501g.f447c - c0171aMo3501g2.f447c) * f3)) + 0.5d), (int) (((double) ((c0171aMo3501g.f448d - c0171aMo3501g2.f448d) * f3)) + 0.5d)));
            }
        }
        C1338x.m3566h(this.f4406e, c1308f0.mo3453b(), Collections.singletonList(c1300b0));
    }
}
