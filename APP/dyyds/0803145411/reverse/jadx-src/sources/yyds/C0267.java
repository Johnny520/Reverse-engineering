package yyds;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᛲᛱᛳᛶ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0267 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1464;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f1465;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ Object f1466;

    static {
        NativeUtil.classesInit0(8);
    }

    public /* synthetic */ C0267(Object obj, int i, Object obj2) {
        this.f1464 = i;
        this.f1465 = obj;
        this.f1466 = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final native void onAnimationEnd(Animator animator);
}
