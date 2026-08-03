package p001;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.BounceInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: ۟.v8 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public final class C0430v8 extends FrameLayout {

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public static final /* synthetic */ int f1829 = 0;

    /* JADX INFO: renamed from: ۥ */
    public final InterfaceC0208f3<C0433vb> f1156;

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean f1157;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean f1830;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final boolean f1831;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public float f1832;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public float f1833;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public int f1834;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public int f1835;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public int f1836;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0430v8(Activity activity, InterfaceC0208f3 interfaceC0208f3) {
        super(activity);
        "mContext";
        this.f1156 = interfaceC0208f3;
        int iM1038 = (int) C0167c4.m1038(1, 40.0f);
        int i = AbstractAlertDialogC0471ya.f1882;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setCornerRadius(iM1038 / 2);
        gradientDrawable.setColor(i);
        setBackground(gradientDrawable);
        setLayoutParams(new ViewGroup.LayoutParams(iM1038, iM1038));
        TextView textView = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        textView.setTextSize(18.0f);
        textView.setText("猪");
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextColor(-16777216);
        addView(textView);
        setOnClickListener(new ViewOnClickListenerC0358q1(7, this));
        setX(getContext().getResources().getDisplayMetrics().widthPixels - iM1038);
        setY((int) TypedValue.applyDimension(1, 200.0f, Resources.getSystem().getDisplayMetrics()));
        setId(4660);
        this.f1157 = true;
        this.f1830 = true;
        this.f1831 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C0237h4.m1090("event", motionEvent);
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public final InterfaceC0208f3<C0433vb> getClickCallback() {
        return this.f1156;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        BounceInterpolator bounceInterpolator;
        C0237h4.m1090("ev", motionEvent);
        if (this.f1831) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2 && rawX >= 0.0f && rawX <= this.f1834) {
                        if (rawY >= this.f1836 && rawY <= this.f1835 + r0) {
                            float f = rawX - this.f1832;
                            float f2 = rawY - this.f1833;
                            if (!this.f1157) {
                                this.f1157 = Math.sqrt((double) ((f2 * f2) + (f * f))) >= 2.0d;
                            }
                            float x = getX() + f;
                            float y = getY() + f2;
                            float width = this.f1834 - getWidth();
                            float height = this.f1835 - getHeight();
                            float fMin = x < 0.0f ? 0.0f : Math.min(x, width);
                            float fMin2 = y >= 0.0f ? Math.min(y, height) : 0.0f;
                            setX(fMin);
                            setY(fMin2);
                            this.f1832 = rawX;
                            this.f1833 = rawY;
                        }
                    }
                } else if (this.f1830 && this.f1157) {
                    int i = this.f1834;
                    if (this.f1832 <= (i >> 1)) {
                        this.f1832 = 0.0f;
                        viewPropertyAnimatorAnimate = animate();
                        bounceInterpolator = new BounceInterpolator();
                    } else {
                        this.f1832 = i - getWidth();
                        viewPropertyAnimatorAnimate = animate();
                        bounceInterpolator = new BounceInterpolator();
                    }
                    viewPropertyAnimatorAnimate.setInterpolator(bounceInterpolator).setDuration(500L).x(this.f1832).start();
                }
            } else {
                this.f1157 = false;
                this.f1832 = rawX;
                this.f1833 = rawY;
                ViewParent parent = getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    int[] iArr = new int[2];
                    viewGroup.getLocationInWindow(iArr);
                    this.f1835 = viewGroup.getMeasuredHeight();
                    this.f1834 = viewGroup.getMeasuredWidth();
                    this.f1836 = iArr[1];
                }
            }
        }
        boolean z = this.f1157;
        return z ? z : super.onTouchEvent(motionEvent);
    }
}
