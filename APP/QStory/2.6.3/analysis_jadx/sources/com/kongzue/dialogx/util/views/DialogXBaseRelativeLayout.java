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
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.InterfaceC3745;
import com.kongzue.dialogx.interfaces.InterfaceC3751;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p034.AbstractC6347;
import p257.C8212;
import p261.AbstractC8247;
import p261.AbstractC8248;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class DialogXBaseRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final /* synthetic */ int f11623 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f11624;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public Rect f11625;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public WeakReference f11626;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public float f11627;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public float f11628;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f11629;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final int[] f11630;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public float f11631;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f11632;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f11633;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C3753 f11634;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean f11635;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public AbstractC6347 f11636;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC3757 f11637;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public WeakReference f11638;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f11639;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public InterfaceC3745 f11640;

    public DialogXBaseRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11639 = true;
        this.f11633 = true;
        this.f11632 = true;
        this.f11635 = false;
        this.f11625 = new Rect();
        this.f11624 = true;
        this.f11630 = new int[4];
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            setForceDarkAllowed(false);
        }
        if (this.f11635) {
            return;
        }
        int i2 = 2;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC8247.f22817);
            this.f11633 = typedArrayObtainStyledAttributes.getBoolean(1, true);
            this.f11639 = typedArrayObtainStyledAttributes.getBoolean(0, true);
            this.f11632 = typedArrayObtainStyledAttributes.getBoolean(2, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f11635 = true;
        }
        if (this.f11633) {
            setFocusable(true);
            setFocusableInTouchMode(true);
        }
        m8074(0.0f);
        if (getParentDialog() != null && getParentDialog().f11593 != DialogX$IMPL_MODE.VIEW) {
            setFitsSystemWindows(true);
        }
        setClipChildren(false);
        setClipToPadding(false);
        setDefaultFocusHighlightEnabled(false);
        C2242 c2242 = new C2242(this, 14);
        C3753 c3753 = new C3753();
        c3753.f11664 = false;
        c3753.f11663 = this;
        c3753.f11662 = c2242;
        c3753.f11661 = getParentDialog();
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c3753.f11663;
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        int paddingStart = dialogXBaseRelativeLayout.getPaddingStart();
        int paddingTop = c3753.f11663.getPaddingTop();
        int paddingEnd = c3753.f11663.getPaddingEnd();
        int paddingBottom = c3753.f11663.getPaddingBottom();
        C3754 c3754 = new C3754();
        c3754.f11671 = paddingStart;
        c3754.f11670 = paddingTop;
        c3754.f11669 = paddingEnd;
        c3754.f11668 = paddingBottom;
        AbstractC2193.m4004(c3753.f11663, new C0679(c3753, i2, c3754));
        if (i >= 30) {
            AbstractC2270.m4242(c3753.f11663, new C3756(c3753, c3754));
        }
        boolean zIsAttachedToWindow = c3753.f11663.isAttachedToWindow();
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = c3753.f11663;
        if (zIsAttachedToWindow) {
            dialogXBaseRelativeLayout2.requestApplyInsets();
        } else {
            dialogXBaseRelativeLayout2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1841(c3753, 3, c3754));
        }
        this.f11634 = c3753;
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
        if (!isAttachedToWindow() || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 4 || !this.f11632 || this.f11637 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        ((AbstractC3738) this.f11638.get()).getClass();
        return this.f11637.mo8083();
    }

    public C3753 getFitSystemBarUtils() {
        return this.f11634;
    }

    public InterfaceC3745 getOnSafeInsetsChangeListener() {
        return this.f11640;
    }

    public AbstractC3738 getParentDialog() {
        WeakReference weakReference = this.f11638;
        if (weakReference == null) {
            return null;
        }
        return (AbstractC3738) weakReference.get();
    }

    public int getRootPaddingBottom() {
        return this.f11630[3];
    }

    public int getRootPaddingLeft() {
        return this.f11630[0];
    }

    public int getRootPaddingRight() {
        return this.f11630[2];
    }

    public int getRootPaddingTop() {
        return this.f11630[1];
    }

    public float getSafeHeight() {
        int measuredHeight = getMeasuredHeight();
        Rect rect = this.f11625;
        return (measuredHeight - rect.bottom) - rect.top;
    }

    public Rect getUnsafePlace() {
        return this.f11625;
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
        if (isInEditMode() || getParentDialog() == null || getParentDialog().m8058() == null) {
            return;
        }
        AbstractC6347 abstractC6347 = this.f11636;
        if (abstractC6347 != null) {
            abstractC6347.mo11934();
        }
        this.f11624 = (getResources().getConfiguration().uiMode & 48) == 16;
        if (this.f11633) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f11624 == ((configuration.uiMode & 48) == 16) || AbstractC8248.f22822 != DialogX$THEME.AUTO || getParentDialog() == null) {
            return;
        }
        getParentDialog().mo8048();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AbstractC6347 abstractC6347 = this.f11636;
        if (abstractC6347 != null) {
            abstractC6347.mo11933();
        }
        C3753 c3753 = this.f11634;
        if (c3753 != null) {
            View viewM8080 = c3753.m8080();
            if (viewM8080 != null && c3753.f11667 != null) {
                viewM8080.getViewTreeObserver().removeOnGlobalLayoutListener(c3753.f11667);
            }
            c3753.f11667 = null;
            c3753.f11662 = null;
            c3753.f11663 = null;
            c3753.f11661 = null;
        }
        this.f11634 = null;
        this.f11640 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f11629 = true;
            this.f11628 = motionEvent.getX();
            this.f11627 = motionEvent.getY();
        } else if (action == 1 && this.f11629 && findFocus() != this && getParentDialog() != null) {
            float fM8049 = getParentDialog().m8049(5.0f);
            if (Math.abs(motionEvent.getX() - this.f11628) <= fM8049 && Math.abs(motionEvent.getY() - this.f11627) <= fM8049) {
                callOnClick();
            }
        }
        if (getParentDialog() instanceof C8212) {
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
        if (getParentDialog() != null && (getParentDialog() instanceof C8212)) {
            return false;
        }
        if (i == 130 && (weakReference = this.f11626) != null && weakReference.get() != null && this.f11626.get() != this) {
            return ((View) this.f11626.get()).requestFocus();
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
        drawable.setAlpha((int) (this.f11631 * 255.0f));
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
    public final void m8071(int i, int i2, int i3, int i4) {
        Objects.toString(getParentDialog());
        AbstractC4922 abstractC4922 = AbstractC8248.f22823;
        getParentDialog();
        if ((getParentDialog() instanceof InterfaceC3751) || (findViewWithTag("DialogXSafetyArea") instanceof MaxRelativeLayout)) {
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
                ((InterfaceC3751) getParentDialog()).getClass();
                if (viewGroup != null) {
                    viewGroup.setPadding(0, 0, 0, i4);
                }
            }
            i4 = 0;
        }
        if (this.f11639) {
            setPadding(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m8072(int i, int i2, int i3, int i4) {
        int[] iArr = this.f11630;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8073(AbstractC3738 abstractC3738) {
        this.f11638 = new WeakReference(abstractC3738);
        if (abstractC3738 != null && abstractC3738.f11593 != DialogX$IMPL_MODE.VIEW) {
            setFitsSystemWindows(true);
        }
        if (this.f11625 != null) {
            Objects.toString(getParentDialog());
            Rect rect = this.f11625;
            m8071(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8074(float f) {
        this.f11631 = f;
        if (getBackground() != null) {
            getBackground().mutate().setAlpha((int) (f * 255.0f));
        }
    }
}
