package p257;

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
import androidx.appcompat.app.ViewOnClickListenerC0086;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.bottomappbar.ViewOnLayoutChangeListenerC3090;
import com.google.android.material.textfield.C3177;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.InterfaceC3746;
import com.kongzue.dialogx.util.C3767;
import com.kongzue.dialogx.util.views.ActivityScreenShotImageView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p261.AbstractC8248;
import p323.C8707;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8223 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final RelativeLayout f22682;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final MaxRelativeLayout f22683;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final RelativeLayout f22684;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final DialogXBaseRelativeLayout f22685;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ActivityScreenShotImageView f22686;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C3767 f22687;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC3746 f22689;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final /* synthetic */ C8227 f22691;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f22692;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f22688 = -1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Rect f22693 = new Rect(0, 0, 0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f22690 = true;

    public C8223(C8227 c8227, View view) {
        this.f22691 = c8227;
        int i = 0;
        if (view == null) {
            return;
        }
        c8227.m8047(view);
        C8227 c82272 = c8227.f22701;
        ActivityScreenShotImageView activityScreenShotImageView = (ActivityScreenShotImageView) view.findViewById(R.id.img_zoom_activity);
        this.f22686 = activityScreenShotImageView;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view.findViewById(R.id.box_root);
        this.f22685 = dialogXBaseRelativeLayout;
        this.f22684 = (RelativeLayout) view.findViewById(R.id.box_bkg);
        MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) view.findViewById(R.id.bkg);
        this.f22683 = maxRelativeLayout;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.box_custom);
        this.f22682 = relativeLayout;
        activityScreenShotImageView.getClass();
        activityScreenShotImageView.f11614 = c8227;
        view.setBackgroundResource(R.color.black);
        activityScreenShotImageView.setVisibility(0);
        dialogXBaseRelativeLayout.m8073(c82272);
        c8227.m8055().setTranslationZ(0.0f);
        int i2 = 2;
        dialogXBaseRelativeLayout.f11636 = new C8236(this, i2);
        dialogXBaseRelativeLayout.f11637 = new C8232(this);
        C8223 c8223 = c8227.f22708;
        C3767 c3767 = new C3767();
        c3767.f11728 = false;
        c3767.m8091(c82272, c8223);
        this.f22687 = c3767;
        dialogXBaseRelativeLayout.m8074(0.0f);
        dialogXBaseRelativeLayout.post(new RunnableC8224(this, i));
        dialogXBaseRelativeLayout.f11640 = new C8232(this);
        maxRelativeLayout.f11651 = new C8232(this);
        relativeLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC3090(this, i2));
        c8227.f22708 = this;
        m13744();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m13744() {
        GradientDrawable gradientDrawable;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f22685;
        if (dialogXBaseRelativeLayout != null) {
            C8227 c8227 = this.f22691;
            Activity activityM8058 = c8227.m8058();
            C8227 c82272 = c8227.f22701;
            if (activityM8058 == null) {
                return;
            }
            dialogXBaseRelativeLayout.f11639 = c8227.f11594;
            int[] iArr = c8227.f11588;
            int i = 1;
            dialogXBaseRelativeLayout.m8072(iArr[0], iArr[1], iArr[2], iArr[3]);
            AbstractC4922 abstractC4922 = AbstractC8248.f22823;
            MaxRelativeLayout maxRelativeLayout = this.f22683;
            maxRelativeLayout.m8075(0);
            int i2 = c8227.f11590;
            if (i2 == 0) {
                i2 = 0;
            }
            maxRelativeLayout.m8076(i2);
            maxRelativeLayout.setMinimumWidth(0);
            int i3 = c8227.f11589;
            if (i3 == 0) {
                i3 = 0;
            }
            maxRelativeLayout.setMinimumHeight(i3);
            int i4 = 6;
            if (c8227.f11585) {
                dialogXBaseRelativeLayout.setOnClickListener(new ViewOnClickListenerC0086(this, i4));
            } else {
                dialogXBaseRelativeLayout.setOnClickListener(null);
            }
            if (c8227.f22703 > -1.0f) {
                if ((maxRelativeLayout.getBackground() instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) maxRelativeLayout.getBackground()) != null) {
                    float f = c8227.f22703;
                    gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
                }
                maxRelativeLayout.setOutlineProvider(new C8220(this, i));
                maxRelativeLayout.setClipToOutline(true);
            }
            C8707 c8707 = c8227.f22706;
            if (c8707 != null) {
                c8707.bindParent(this.f22682, c82272);
                boolean z = c8227.f22706.getCustomView() instanceof InterfaceC3746;
                C8707 c87072 = c8227.f22706;
                if (z) {
                    this.f22689 = (InterfaceC3746) c87072.getCustomView();
                } else {
                    KeyEvent.Callback callbackFindViewWithTag = c87072.getCustomView().findViewWithTag("ScrollController");
                    if (callbackFindViewWithTag instanceof InterfaceC3746) {
                        this.f22689 = (InterfaceC3746) callbackFindViewWithTag;
                    }
                }
            }
            c8227.m8055().setBackgroundResource(R.color.black);
            this.f22686.setVisibility(0);
            this.f22687.m8091(c82272, this);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13745() {
        C8227 c8227 = this.f22691;
        if (c8227.f11585) {
            m13749(this.f22685);
            return;
        }
        long j = c8227.f11591;
        if (j < 0) {
            j = 300;
        }
        MaxRelativeLayout maxRelativeLayout = this.f22683;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(maxRelativeLayout, "y", maxRelativeLayout.getY(), this.f22688);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13746() {
        C8227 c8227;
        C8707 c8707;
        ViewGroup.LayoutParams layoutParams;
        int height = this.f22682.getHeight();
        if (height == 0 || ((c8707 = (c8227 = this.f22691).f22706) != null && c8707.getCustomView() != null && (layoutParams = c8227.f22706.getCustomView().getLayoutParams()) != null && layoutParams.height == -1)) {
            height = (int) this.f22685.getSafeHeight();
        }
        this.f22692 = height;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float m13747() {
        return Math.max(0.0f, this.f22685.getSafeHeight() - this.f22692);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13748(int i, final int i2, boolean z) {
        this.f22690 = true;
        long j = this.f22691.f11580;
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
                C8223 c8223 = this.f22714;
                c8223.f22683.setY(iIntValue);
                c8223.m13746();
                float safeHeight = c8223.f22685.getSafeHeight() - c8223.f22692;
                if (safeHeight < 0.0f) {
                    safeHeight = 0.0f;
                }
                if (safeHeight != c8223.f22688) {
                    c8223.f22688 = safeHeight;
                    valueAnimator.cancel();
                    c8223.m13748(iIntValue, (int) safeHeight, true);
                } else if (iIntValue >= i2) {
                    c8223.f22690 = false;
                }
            }
        });
        valueAnimatorOfInt.start();
        this.f22683.setVisibility(0);
        if (z) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new C3177(this, 3));
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13749(View view) {
        C8227 c8227 = this.f22691;
        c8227.getClass();
        if (view != null) {
            view.setEnabled(false);
        }
        if (c8227.m8058() == null || c8227.f11587) {
            return;
        }
        int i = 2;
        if (c8227.f22704 == null) {
            c8227.f22704 = new C8217(this, i);
        }
        C8217 c8217 = c8227.f22704;
        if (c8217 != null) {
            int i2 = 1;
            c8227.f11587 = true;
            if (c8217 == null) {
                c8227.f22704 = new C8217(this, i);
            }
            c8227.f22704.m13743(c8227.f22701);
            RunnableC8224 runnableC8224 = new RunnableC8224(this, i2);
            long j = c8227.f11591;
            if (j == -1) {
                j = 300;
            }
            AbstractC3738.m8029(j, runnableC8224);
        }
    }
}
