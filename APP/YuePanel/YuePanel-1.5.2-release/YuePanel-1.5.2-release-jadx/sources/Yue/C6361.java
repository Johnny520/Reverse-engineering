package Yue;

import android.animation.ValueAnimator;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۡۢۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6361 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C6362 f2037;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ float f2038;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ int[] f16125;

    static {
        NativeUtil.classesInit0(907);
    }

    public /* synthetic */ C6361(C6362 c6362, float f, int[] iArr) {
        this.f2037 = c6362;
        this.f2038 = f;
        this.f16125 = iArr;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final native void onAnimationUpdate(ValueAnimator valueAnimator);
}
