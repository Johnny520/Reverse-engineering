package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import androidx.compose.foundation.lazy.layout.C0679;
import androidx.compose.ui.platform.ViewOnAttachStateChangeListenerC1841;
import androidx.core.view.AbstractC2193;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2242;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.DialogX$IMPL_MODE;
import com.kongzue.dialogx.DialogX$THEME;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.InterfaceC3744;
import com.kongzue.dialogx.interfaces.InterfaceC3750;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import p033.AbstractC6325;
import p251.AbstractC8174;
import p257.C8211;
import p261.AbstractC8246;
import p261.AbstractC8247;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class DialogXBaseRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final /* synthetic */ int f11618 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f11619;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public Rect f11620;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public WeakReference f11621;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public float f11622;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public float f11623;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f11624;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final int[] f11625;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public float f11626;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f11627;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f11628;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C3752 f11629;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean f11630;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public AbstractC8174 f11631;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC3756 f11632;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public WeakReference f11633;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f11634;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public InterfaceC3744 f11635;

    public DialogXBaseRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11634 = true;
        this.f11628 = true;
        this.f11627 = true;
        this.f11630 = false;
        this.f11620 = new Rect();
        this.f11619 = true;
        this.f11625 = new int[4];
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            setForceDarkAllowed(false);
        }
        if (this.f11630) {
            return;
        }
        int i2 = 2;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC8246.f22818);
            this.f11628 = typedArrayObtainStyledAttributes.getBoolean(1, true);
            this.f11634 = typedArrayObtainStyledAttributes.getBoolean(0, true);
            this.f11627 = typedArrayObtainStyledAttributes.getBoolean(2, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f11630 = true;
        }
        if (this.f11628) {
            setFocusable(true);
            setFocusableInTouchMode(true);
        }
        m8087(0.0f);
        if (getParentDialog() != null && getParentDialog().f11588 != DialogX$IMPL_MODE.VIEW) {
            setFitsSystemWindows(true);
        }
        setClipChildren(false);
        setClipToPadding(false);
        setDefaultFocusHighlightEnabled(false);
        C2242 c2242 = new C2242(this, 14);
        C3752 c3752 = new C3752();
        c3752.f11659 = false;
        c3752.f11658 = this;
        c3752.f11657 = c2242;
        c3752.f11656 = getParentDialog();
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c3752.f11658;
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        int paddingStart = dialogXBaseRelativeLayout.getPaddingStart();
        int paddingTop = c3752.f11658.getPaddingTop();
        int paddingEnd = c3752.f11658.getPaddingEnd();
        int paddingBottom = c3752.f11658.getPaddingBottom();
        C3753 c3753 = new C3753();
        c3753.f11666 = paddingStart;
        c3753.f11665 = paddingTop;
        c3753.f11664 = paddingEnd;
        c3753.f11663 = paddingBottom;
        AbstractC2193.m3994(c3752.f11658, new C0679(c3752, i2, c3753));
        if (i >= 30) {
            AbstractC2270.m4232(c3752.f11658, new C3755(c3752, c3753));
        }
        boolean zIsAttachedToWindow = c3752.f11658.isAttachedToWindow();
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = c3752.f11658;
        if (zIsAttachedToWindow) {
            dialogXBaseRelativeLayout2.requestApplyInsets();
        } else {
            dialogXBaseRelativeLayout2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1841(c3752, 3, c3753));
        }
        this.f11629 = c3752;
    }

    @Override // android.view.View
    public final boolean callOnClick() {
        if (isEnabled()) {
            return super.callOnClick();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        if (!isAttachedToWindow() || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 4 || !this.f11627 || this.f11632 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        ((AbstractC3737) this.f11633.get()).getClass();
        return this.f11632.mo8096();
    }

    public C3752 getFitSystemBarUtils() {
        return this.f11629;
    }

    public InterfaceC3744 getOnSafeInsetsChangeListener() {
        return this.f11635;
    }

    public AbstractC3737 getParentDialog() {
        WeakReference weakReference = this.f11633;
        if (weakReference == null) {
            return null;
        }
        return (AbstractC3737) weakReference.get();
    }

    public int getRootPaddingBottom() {
        return this.f11625[3];
    }

    public int getRootPaddingLeft() {
        return this.f11625[0];
    }

    public int getRootPaddingRight() {
        return this.f11625[2];
    }

    public int getRootPaddingTop() {
        return this.f11625[1];
    }

    public float getSafeHeight() {
        int measuredHeight = getMeasuredHeight();
        Rect rect = this.f11620;
        return (measuredHeight - rect.bottom) - rect.top;
    }

    public Rect getUnsafePlace() {
        return this.f11620;
    }

    public int getUseAreaHeight() {
        return getHeight() - getRootPaddingBottom();
    }

    public int getUseAreaWidth() {
        return getWidth() - getRootPaddingRight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || getParentDialog() == null || getParentDialog().m8071() == null) {
            return;
        }
        AbstractC8174 abstractC8174 = this.f11631;
        if (abstractC8174 != null) {
            abstractC8174.mo13626();
        }
        this.f11619 = (getResources().getConfiguration().uiMode & 48) == 16;
        if (this.f11628) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f11619 == ((configuration.uiMode & 48) == 16) || AbstractC8247.f22823 != DialogX$THEME.AUTO || getParentDialog() == null) {
            return;
        }
        getParentDialog().mo8061();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AbstractC8174 abstractC8174 = this.f11631;
        if (abstractC8174 != null) {
            abstractC8174.mo13627();
        }
        C3752 c3752 = this.f11629;
        if (c3752 != null) {
            View viewM8093 = c3752.m8093();
            if (viewM8093 != null && c3752.f11662 != null) {
                viewM8093.getViewTreeObserver().removeOnGlobalLayoutListener(c3752.f11662);
            }
            c3752.f11662 = null;
            c3752.f11657 = null;
            c3752.f11658 = null;
            c3752.f11656 = null;
        }
        this.f11629 = null;
        this.f11635 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f11624 = true;
            this.f11623 = motionEvent.getX();
            this.f11622 = motionEvent.getY();
        } else if (action == 1 && this.f11624 && findFocus() != this && getParentDialog() != null) {
            float fM8062 = getParentDialog().m8062(5.0f);
            if (Math.abs(motionEvent.getX() - this.f11623) <= fM8062 && Math.abs(motionEvent.getY() - this.f11622) <= fM8062) {
                callOnClick();
            }
        }
        if (getParentDialog() instanceof C8211) {
            return super.onTouchEvent(motionEvent);
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 2);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled()) {
            return super.performClick();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        WeakReference weakReference;
        if (getParentDialog() != null && (getParentDialog() instanceof C8211)) {
            return false;
        }
        if (i == 130 && (weakReference = this.f11621) != null && weakReference.get() != null && this.f11621.get() != this) {
            return ((View) this.f11621.get()).requestFocus();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || viewFindFocus == this) {
            return super.requestFocus(i, rect);
        }
        viewFindFocus.requestFocus();
        return true;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        drawable.setAlpha((int) (this.f11626 * 255.0f));
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        setBackground(new ColorDrawable(i));
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i == 8 && getAlpha() == 0.0f) {
            setAlpha(0.01f);
        }
        super.setVisibility(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m8084(int i, int i2, int i3, int i4) {
        Objects.toString(getParentDialog());
        AbstractC6325 abstractC6325 = AbstractC8247.f22824;
        getParentDialog();
        if ((getParentDialog() instanceof InterfaceC3750) || (findViewWithTag("DialogXSafetyArea") instanceof MaxRelativeLayout)) {
            View viewFindViewWithTag = findViewWithTag("DialogXSafetyArea");
            if (viewFindViewWithTag instanceof MaxRelativeLayout) {
                int dialogXSafetyMode = ((MaxRelativeLayout) viewFindViewWithTag).getDialogXSafetyMode();
                boolean z = (dialogXSafetyMode & 1) != 0;
                boolean z2 = (dialogXSafetyMode & 2) != 0;
                boolean z3 = (dialogXSafetyMode & 4) != 0;
                boolean z4 = (dialogXSafetyMode & 8) != 0;
                viewFindViewWithTag.toString();
                viewFindViewWithTag.setPadding(z2 ? i : 0, z ? i2 : 0, z4 ? i3 : 0, z3 ? i4 : 0);
                if (z) {
                    i2 = 0;
                }
                if (z2) {
                    i = 0;
                }
                if (z4) {
                    i3 = 0;
                }
                if (z3) {
                }
            } else {
                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.bkg);
                ((InterfaceC3750) getParentDialog()).getClass();
                if (viewGroup != null) {
                    viewGroup.setPadding(0, 0, 0, i4);
                }
            }
            i4 = 0;
        }
        if (this.f11634) {
            setPadding(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m8085(int i, int i2, int i3, int i4) {
        int[] iArr = this.f11625;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8086(AbstractC3737 abstractC3737) {
        this.f11633 = new WeakReference(abstractC3737);
        if (abstractC3737 != null && abstractC3737.f11588 != DialogX$IMPL_MODE.VIEW) {
            setFitsSystemWindows(true);
        }
        if (this.f11620 != null) {
            Objects.toString(getParentDialog());
            Rect rect = this.f11620;
            m8084(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8087(float f) {
        this.f11626 = f;
        if (getBackground() != null) {
            getBackground().mutate().setAlpha((int) (f * 255.0f));
        }
    }
}
