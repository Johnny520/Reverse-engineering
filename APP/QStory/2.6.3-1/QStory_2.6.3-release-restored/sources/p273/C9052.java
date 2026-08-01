package p273;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import androidx.appcompat.app.ViewOnClickListenerC0933;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.bottomappbar.ViewOnLayoutChangeListenerC3922;
import com.google.android.material.textfield.C4009;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.InterfaceC4578;
import com.kongzue.dialogx.util.C4599;
import com.kongzue.dialogx.util.views.ActivityScreenShotImageView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p277.AbstractC9077;
import p339.C9536;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9052 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final RelativeLayout f23027;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final MaxRelativeLayout f23028;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final RelativeLayout f23029;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final DialogXBaseRelativeLayout f23030;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ActivityScreenShotImageView f23031;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C4599 f23032;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC4578 f23034;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final /* synthetic */ C9056 f23036;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f23037;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f23033 = -1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Rect f23038 = new Rect(0, 0, 0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f23035 = true;

    public C9052(C9056 c9056, View view) {
        this.f23036 = c9056;
        int i = 0;
        if (view == null) {
            return;
        }
        c9056.m8606(view);
        C9056 c90562 = c9056.f23046;
        ActivityScreenShotImageView activityScreenShotImageView = (ActivityScreenShotImageView) view.findViewById(C0328R.id.img_zoom_activity);
        this.f23031 = activityScreenShotImageView;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view.findViewById(C0328R.id.box_root);
        this.f23030 = dialogXBaseRelativeLayout;
        this.f23029 = (RelativeLayout) view.findViewById(C0328R.id.box_bkg);
        MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) view.findViewById(C0328R.id.bkg);
        this.f23028 = maxRelativeLayout;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C0328R.id.box_custom);
        this.f23027 = relativeLayout;
        activityScreenShotImageView.getClass();
        activityScreenShotImageView.f11959 = c9056;
        view.setBackgroundResource(C0328R.color.black);
        activityScreenShotImageView.setVisibility(0);
        dialogXBaseRelativeLayout.m8632(c90562);
        c9056.m8614().setTranslationZ(0.0f);
        int i2 = 2;
        dialogXBaseRelativeLayout.f11981 = new C9065(this, i2);
        dialogXBaseRelativeLayout.f11982 = new C9061(this);
        C9052 c9052 = c9056.f23053;
        C4599 c4599 = new C4599();
        c4599.f12073 = false;
        c4599.m8650(c90562, c9052);
        this.f23032 = c4599;
        dialogXBaseRelativeLayout.m8633(0.0f);
        dialogXBaseRelativeLayout.post(new RunnableC9053(this, i));
        dialogXBaseRelativeLayout.f11985 = new C9061(this);
        maxRelativeLayout.f11996 = new C9061(this);
        relativeLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC3922(this, i2));
        c9056.f23053 = this;
        m14303();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m14303() {
        GradientDrawable gradientDrawable;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f23030;
        if (dialogXBaseRelativeLayout != null) {
            C9056 c9056 = this.f23036;
            Activity activityM8617 = c9056.m8617();
            C9056 c90562 = c9056.f23046;
            if (activityM8617 == null) {
                return;
            }
            dialogXBaseRelativeLayout.f11984 = c9056.f11939;
            int[] iArr = c9056.f11933;
            int i = 1;
            dialogXBaseRelativeLayout.m8631(iArr[0], iArr[1], iArr[2], iArr[3]);
            AbstractC5754 abstractC5754 = AbstractC9077.f23168;
            MaxRelativeLayout maxRelativeLayout = this.f23028;
            maxRelativeLayout.m8634(0);
            int i2 = c9056.f11935;
            if (i2 == 0) {
                i2 = 0;
            }
            maxRelativeLayout.m8635(i2);
            maxRelativeLayout.setMinimumWidth(0);
            int i3 = c9056.f11934;
            if (i3 == 0) {
                i3 = 0;
            }
            maxRelativeLayout.setMinimumHeight(i3);
            int i4 = 6;
            if (c9056.f11930) {
                dialogXBaseRelativeLayout.setOnClickListener(new ViewOnClickListenerC0933(this, i4));
            } else {
                dialogXBaseRelativeLayout.setOnClickListener(null);
            }
            if (c9056.f23048 > -1.0f) {
                if ((maxRelativeLayout.getBackground() instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) maxRelativeLayout.getBackground()) != null) {
                    float f = c9056.f23048;
                    gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
                }
                maxRelativeLayout.setOutlineProvider(new C9049(this, i));
                maxRelativeLayout.setClipToOutline(true);
            }
            C9536 c9536 = c9056.f23051;
            if (c9536 != null) {
                c9536.bindParent(this.f23027, c90562);
                boolean z = c9056.f23051.getCustomView() instanceof InterfaceC4578;
                C9536 c95362 = c9056.f23051;
                if (z) {
                    this.f23034 = (InterfaceC4578) c95362.getCustomView();
                } else {
                    KeyEvent.Callback callbackFindViewWithTag = c95362.getCustomView().findViewWithTag("ScrollController");
                    if (callbackFindViewWithTag instanceof InterfaceC4578) {
                        this.f23034 = (InterfaceC4578) callbackFindViewWithTag;
                    }
                }
            }
            c9056.m8614().setBackgroundResource(C0328R.color.black);
            this.f23031.setVisibility(0);
            this.f23032.m8650(c90562, this);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m14304() {
        C9056 c9056 = this.f23036;
        if (c9056.f11930) {
            m14308(this.f23030);
            return;
        }
        long j = c9056.f11936;
        if (j < 0) {
            j = 300;
        }
        MaxRelativeLayout maxRelativeLayout = this.f23028;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(maxRelativeLayout, "y", maxRelativeLayout.getY(), this.f23033);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14305() {
        C9056 c9056;
        C9536 c9536;
        ViewGroup.LayoutParams layoutParams;
        int height = this.f23027.getHeight();
        if (height == 0 || ((c9536 = (c9056 = this.f23036).f23051) != null && c9536.getCustomView() != null && (layoutParams = c9056.f23051.getCustomView().getLayoutParams()) != null && layoutParams.height == -1)) {
            height = (int) this.f23030.getSafeHeight();
        }
        this.f23037 = height;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float m14306() {
        return Math.max(0.0f, this.f23030.getSafeHeight() - this.f23037);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14307(int i, final int i2, boolean z) {
        this.f23035 = true;
        long j = this.f23036.f11925;
        if (j < 0) {
            j = 300;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪哲兰世苏
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C9052 c9052 = this.f23059;
                c9052.f23028.setY(iIntValue);
                c9052.m14305();
                float safeHeight = c9052.f23030.getSafeHeight() - c9052.f23037;
                if (safeHeight < 0.0f) {
                    safeHeight = 0.0f;
                }
                if (safeHeight != c9052.f23033) {
                    c9052.f23033 = safeHeight;
                    valueAnimator.cancel();
                    c9052.m14307(iIntValue, (int) safeHeight, true);
                } else if (iIntValue >= i2) {
                    c9052.f23035 = false;
                }
            }
        });
        valueAnimatorOfInt.start();
        this.f23028.setVisibility(0);
        if (z) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new C4009(this, 3));
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14308(View view) {
        C9056 c9056 = this.f23036;
        c9056.getClass();
        if (view != null) {
            view.setEnabled(false);
        }
        if (c9056.m8617() == null || c9056.f11932) {
            return;
        }
        int i = 2;
        if (c9056.f23049 == null) {
            c9056.f23049 = new C9046(this, i);
        }
        C9046 c9046 = c9056.f23049;
        if (c9046 != null) {
            int i2 = 1;
            c9056.f11932 = true;
            if (c9046 == null) {
                c9056.f23049 = new C9046(this, i);
            }
            c9056.f23049.m14302(c9056.f23046);
            RunnableC9053 runnableC9053 = new RunnableC9053(this, i2);
            long j = c9056.f11936;
            if (j == -1) {
                j = 300;
            }
            AbstractC4570.m8588(j, runnableC9053);
        }
    }
}
