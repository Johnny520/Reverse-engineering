package p257;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import androidx.appcompat.app.ViewOnClickListenerC0086;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.bottomappbar.ViewOnLayoutChangeListenerC3089;
import com.google.android.material.textfield.C3176;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.AbstractC3748;
import com.kongzue.dialogx.interfaces.InterfaceC3745;
import com.kongzue.dialogx.util.C3766;
import com.kongzue.dialogx.util.views.ActivityScreenShotImageView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import p033.AbstractC6325;
import p261.AbstractC8247;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8222 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final RelativeLayout f22683;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final MaxRelativeLayout f22684;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final RelativeLayout f22685;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final DialogXBaseRelativeLayout f22686;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ActivityScreenShotImageView f22687;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C3766 f22688;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f22689;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC3745 f22690;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f22691;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final /* synthetic */ C8226 f22692;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f22693;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Rect f22694;

    public C8222(C8226 c8226, View view) {
        C8226 c82262 = c8226.f22702;
        this.f22692 = c8226;
        this.f22689 = -1.0f;
        int i = 0;
        this.f22694 = new Rect(0, 0, 0, 0);
        this.f22691 = true;
        if (view == null) {
            return;
        }
        c8226.m8060(view);
        ActivityScreenShotImageView activityScreenShotImageView = (ActivityScreenShotImageView) view.findViewById(R.id.img_zoom_activity);
        this.f22687 = activityScreenShotImageView;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view.findViewById(R.id.box_root);
        this.f22686 = dialogXBaseRelativeLayout;
        this.f22685 = (RelativeLayout) view.findViewById(R.id.box_bkg);
        MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) view.findViewById(R.id.bkg);
        this.f22684 = maxRelativeLayout;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.box_custom);
        this.f22683 = relativeLayout;
        activityScreenShotImageView.getClass();
        activityScreenShotImageView.f11609 = c8226;
        view.setBackgroundResource(R.color.black);
        activityScreenShotImageView.setVisibility(0);
        dialogXBaseRelativeLayout.m8086(c82262);
        c8226.m8068().setTranslationZ(0.0f);
        int i2 = 2;
        dialogXBaseRelativeLayout.f11631 = new C8235(this, i2);
        dialogXBaseRelativeLayout.f11632 = new C8231(this);
        C8222 c8222 = c8226.f22709;
        C3766 c3766 = new C3766();
        c3766.f11723 = false;
        c3766.m8104(c82262, c8222);
        this.f22688 = c3766;
        dialogXBaseRelativeLayout.m8087(0.0f);
        dialogXBaseRelativeLayout.post(new RunnableC8223(this, i));
        dialogXBaseRelativeLayout.f11635 = new C8231(this);
        maxRelativeLayout.f11646 = new C8231(this);
        relativeLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC3089(this, i2));
        c8226.f22709 = this;
        m13727();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m13727() {
        GradientDrawable gradientDrawable;
        C8226 c8226 = this.f22692;
        C8226 c82262 = c8226.f22702;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f22686;
        if (dialogXBaseRelativeLayout == null || c8226.m8071() == null) {
            return;
        }
        dialogXBaseRelativeLayout.f11634 = c8226.f11589;
        int[] iArr = c8226.f11583;
        int i = 1;
        dialogXBaseRelativeLayout.m8085(iArr[0], iArr[1], iArr[2], iArr[3]);
        AbstractC6325 abstractC6325 = AbstractC8247.f22824;
        MaxRelativeLayout maxRelativeLayout = this.f22684;
        maxRelativeLayout.m8088(0);
        int i2 = c8226.f11585;
        if (i2 == 0) {
            i2 = 0;
        }
        maxRelativeLayout.m8089(i2);
        maxRelativeLayout.setMinimumWidth(0);
        int i3 = c8226.f11584;
        if (i3 == 0) {
            i3 = 0;
        }
        maxRelativeLayout.setMinimumHeight(i3);
        int i4 = 6;
        if (c8226.f11580) {
            dialogXBaseRelativeLayout.setOnClickListener(new ViewOnClickListenerC0086(this, i4));
        } else {
            dialogXBaseRelativeLayout.setOnClickListener(null);
        }
        if (c8226.f22704 > -1.0f) {
            if ((maxRelativeLayout.getBackground() instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) maxRelativeLayout.getBackground()) != null) {
                float f = c8226.f22704;
                gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
            }
            maxRelativeLayout.setOutlineProvider(new C8219(this, i));
            maxRelativeLayout.setClipToOutline(true);
        }
        AbstractC3748 abstractC3748 = c8226.f22707;
        if (abstractC3748 != null) {
            abstractC3748.bindParent(this.f22683, c82262);
            boolean z = c8226.f22707.getCustomView() instanceof InterfaceC3745;
            AbstractC3748 abstractC37482 = c8226.f22707;
            if (z) {
                this.f22690 = (InterfaceC3745) abstractC37482.getCustomView();
            } else {
                KeyEvent.Callback callbackFindViewWithTag = abstractC37482.getCustomView().findViewWithTag("ScrollController");
                if (callbackFindViewWithTag instanceof InterfaceC3745) {
                    this.f22690 = (InterfaceC3745) callbackFindViewWithTag;
                }
            }
        }
        c8226.m8068().setBackgroundResource(R.color.black);
        this.f22687.setVisibility(0);
        this.f22688.m8104(c82262, this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13728() {
        C8226 c8226 = this.f22692;
        if (c8226.f11580) {
            m13732(this.f22686);
            return;
        }
        long j = c8226.f11586;
        if (j < 0) {
            j = 300;
        }
        MaxRelativeLayout maxRelativeLayout = this.f22684;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(maxRelativeLayout, "y", maxRelativeLayout.getY(), this.f22689);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13729() {
        C8226 c8226;
        AbstractC3748 abstractC3748;
        ViewGroup.LayoutParams layoutParams;
        int height = this.f22683.getHeight();
        if (height == 0 || ((abstractC3748 = (c8226 = this.f22692).f22707) != null && abstractC3748.getCustomView() != null && (layoutParams = c8226.f22707.getCustomView().getLayoutParams()) != null && layoutParams.height == -1)) {
            height = (int) this.f22686.getSafeHeight();
        }
        this.f22693 = height;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float m13730() {
        return Math.max(0.0f, this.f22686.getSafeHeight() - this.f22693);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13731(int i, final int i2, boolean z) {
        this.f22691 = true;
        long j = this.f22692.f11575;
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
                C8222 c8222 = this.f22715;
                c8222.f22684.setY(iIntValue);
                c8222.m13729();
                float safeHeight = c8222.f22686.getSafeHeight() - c8222.f22693;
                if (safeHeight < 0.0f) {
                    safeHeight = 0.0f;
                }
                if (safeHeight != c8222.f22689) {
                    c8222.f22689 = safeHeight;
                    valueAnimator.cancel();
                    c8222.m13731(iIntValue, (int) safeHeight, true);
                } else if (iIntValue >= i2) {
                    c8222.f22691 = false;
                }
            }
        });
        valueAnimatorOfInt.start();
        this.f22684.setVisibility(0);
        if (z) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new C3176(this, 3));
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13732(View view) {
        if (view != null) {
            view.setEnabled(false);
        }
        C8226 c8226 = this.f22692;
        if (c8226.m8071() == null || c8226.f11582) {
            return;
        }
        int i = 2;
        if (c8226.f22705 == null) {
            c8226.f22705 = new C8216(this, i);
        }
        C8216 c8216 = c8226.f22705;
        if (c8216 != null) {
            int i2 = 1;
            c8226.f11582 = true;
            if (c8216 == null) {
                c8226.f22705 = new C8216(this, i);
            }
            c8226.f22705.m13726(c8226.f22702);
            RunnableC8223 runnableC8223 = new RunnableC8223(this, i2);
            long j = c8226.f11586;
            if (j == -1) {
                j = 300;
            }
            AbstractC3737.m8042(j, runnableC8223);
        }
    }
}
