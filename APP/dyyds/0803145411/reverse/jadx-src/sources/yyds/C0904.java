package yyds;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.android.NativeUtil;
import com.bytedance.im.core.model.Message;

/* JADX INFO: renamed from: yyds.ᛴᛸᛲᛶ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0904 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Rect f4119;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2469 f4120;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ View f4121;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ float f4122;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ Message f4123;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ float f4124;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C1557 f4125;

    static {
        NativeUtil.classesInit0(210);
    }

    public /* synthetic */ C0904(C2469 c2469, View view, Message message, C1557 c1557, Rect rect, float f, float f2) {
        this.f4120 = c2469;
        this.f4121 = view;
        this.f4123 = message;
        this.f4125 = c1557;
        this.f4119 = rect;
        this.f4124 = f;
        this.f4122 = f2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final native void onAnimationUpdate(ValueAnimator valueAnimator);
}
