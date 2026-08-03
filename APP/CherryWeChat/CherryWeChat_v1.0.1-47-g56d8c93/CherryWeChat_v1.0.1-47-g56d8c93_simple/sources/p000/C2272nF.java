package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: renamed from: nF */
/* JADX INFO: loaded from: classes.dex */
public final class C2272nF implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2538tF f7994a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0489LF f7995b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0489LF f7996c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7997d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f7998e;

    public C2272nF(C2538tF r1, C0489LF r2, C0489LF r3, int r4, View r5) {
        this.f7994a = r1;
        this.f7995b = r2;
        this.f7996c = r3;
        this.f7997d = r4;
        this.f7998e = r5;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator r15) {
        float r152 = r15.getAnimatedFraction();
        C2538tF r0 = this.f7994a;
        AbstractC2495sF r1 = r0.f8846a;
        r1.mo4896d(r152);
        C0489LF r153 = this.f7995b;
        C0317HF r2 = r153.f1602a;
        float r12 = r1.mo4894b();
        PathInterpolator r3 = C2358pF.f8245e;
        int r32 = Build.VERSION.SDK_INT;
        if (r32 < 34) goto L6;
        AbstractC2796zF r33 = new C2753yF(r153);
    L15:
        int r154 = 1;
    L17:
        if (r154 > 512) goto L23;
        if ((this.f7997d & r154) != 0) goto L21;
        r33.mo5234c(r154, r2.mo14g(r154));
    L22:
        r154 = r154 << 1;
        goto L17
    L21:
        C2765yl r4 = r2.mo14g(r154);
        float r7 = 1.0f - r12;
        r33.mo5234c(r154, C0489LF.m938e(r4, (int) (((double) ((r4.f9405a - this.f7996c.f1602a.mo14g(r154).f9405a) * r7)) + 0.5d), (int) (((double) ((r4.f9406b - r5.f9406b) * r7)) + 0.5d), (int) (((double) ((r4.f9407c - r5.f9407c) * r7)) + 0.5d), (int) (((double) ((r4.f9408d - r5.f9408d) * r7)) + 0.5d)));
        goto L22
    L23:
        C2358pF.m4776g(this.f7998e, r33.mo5084b(), Collections.singletonList(r0));
        return;
    L6:
        if (r32 < 31) goto L9;
        r33 = new C2710xF(r153);
        goto L15
    L9:
        if (r32 < 30) goto L12;
        r33 = new C2667wF(r153);
        goto L15
    L12:
        if (r32 < 29) goto L14;
        r33 = new C2624vF(r153);
        goto L15
    L14:
        r33 = new C2581uF(r153);
        goto L15
    }
}
