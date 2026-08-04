package yyds;

import android.animation.ValueAnimator;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᛱᛴᛱᛸ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0102 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f723;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ C1557 f724;

    static {
        NativeUtil.classesInit0(117);
    }

    public /* synthetic */ C0102(C1557 c1557, int i) {
        this.f723 = i;
        this.f724 = c1557;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final native void onAnimationUpdate(ValueAnimator valueAnimator);
}
