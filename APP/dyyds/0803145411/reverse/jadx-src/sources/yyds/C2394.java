package yyds;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᲇᛲᛲᛱ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C2394 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2469 f11808;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ View f11809;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ C1557 f11810;

    static {
        NativeUtil.classesInit0(142);
    }

    public C2394(C2469 c2469, View view, C1557 c1557) {
        this.f11808 = c2469;
        this.f11809 = view;
        this.f11810 = c1557;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final native void onAnimationEnd(Animator animator);
}
