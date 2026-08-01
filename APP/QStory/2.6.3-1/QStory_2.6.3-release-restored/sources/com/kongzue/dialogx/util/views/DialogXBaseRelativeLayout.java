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
import androidx.compose.foundation.lazy.layout.C1520;
import androidx.compose.p001ui.platform.ViewOnAttachStateChangeListenerC2676;
import androidx.core.view.AbstractC3026;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3075;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.DialogX$IMPL_MODE;
import com.kongzue.dialogx.DialogX$THEME;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.InterfaceC4577;
import com.kongzue.dialogx.interfaces.InterfaceC4583;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p050.AbstractC7176;
import p273.C9041;
import p277.AbstractC9076;
import p277.AbstractC9077;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class DialogXBaseRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final /* synthetic */ int f11968 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f11969;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public Rect f11970;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public WeakReference f11971;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public float f11972;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public float f11973;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f11974;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final int[] f11975;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public float f11976;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f11977;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f11978;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C4585 f11979;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean f11980;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public AbstractC7176 f11981;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC4589 f11982;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public WeakReference f11983;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f11984;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public InterfaceC4577 f11985;

    public DialogXBaseRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11984 = true;
        this.f11978 = true;
        this.f11977 = true;
        this.f11980 = false;
        this.f11970 = new Rect();
        this.f11969 = true;
        this.f11975 = new int[4];
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            setForceDarkAllowed(false);
        }
        if (this.f11980) {
            return;
        }
        int i2 = 2;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC9076.f23162);
            this.f11978 = typedArrayObtainStyledAttributes.getBoolean(1, true);
            this.f11984 = typedArrayObtainStyledAttributes.getBoolean(0, true);
            this.f11977 = typedArrayObtainStyledAttributes.getBoolean(2, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f11980 = true;
        }
        if (this.f11978) {
            setFocusable(true);
            setFocusableInTouchMode(true);
        }
        m8633(0.0f);
        if (getParentDialog() != null && getParentDialog().f11938 != DialogX$IMPL_MODE.VIEW) {
            setFitsSystemWindows(true);
        }
        setClipChildren(false);
        setClipToPadding(false);
        setDefaultFocusHighlightEnabled(false);
        C3075 c3075 = new C3075(this, 14);
        C4585 c4585 = new C4585();
        c4585.f12009 = false;
        c4585.f12008 = this;
        c4585.f12007 = c3075;
        c4585.f12006 = getParentDialog();
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c4585.f12008;
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        int paddingStart = dialogXBaseRelativeLayout.getPaddingStart();
        int paddingTop = c4585.f12008.getPaddingTop();
        int paddingEnd = c4585.f12008.getPaddingEnd();
        int paddingBottom = c4585.f12008.getPaddingBottom();
        C4586 c4586 = new C4586();
        c4586.f12016 = paddingStart;
        c4586.f12015 = paddingTop;
        c4586.f12014 = paddingEnd;
        c4586.f12013 = paddingBottom;
        AbstractC3026.m4564(c4585.f12008, new C1520(c4585, i2, c4586));
        if (i >= 30) {
            AbstractC3103.m4802(c4585.f12008, new C4588(c4585, c4586));
        }
        boolean zIsAttachedToWindow = c4585.f12008.isAttachedToWindow();
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = c4585.f12008;
        if (zIsAttachedToWindow) {
            dialogXBaseRelativeLayout2.requestApplyInsets();
        } else {
            dialogXBaseRelativeLayout2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2676(c4585, 3, c4586));
        }
        this.f11979 = c4585;
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
        if (!isAttachedToWindow() || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 4 || !this.f11977 || this.f11982 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        ((AbstractC4570) this.f11983.get()).getClass();
        return this.f11982.mo8642();
    }

    public C4585 getFitSystemBarUtils() {
        return this.f11979;
    }

    public InterfaceC4577 getOnSafeInsetsChangeListener() {
        return this.f11985;
    }

    public AbstractC4570 getParentDialog() {
        WeakReference weakReference = this.f11983;
        if (weakReference == null) {
            return null;
        }
        return (AbstractC4570) weakReference.get();
    }

    public int getRootPaddingBottom() {
        return this.f11975[3];
    }

    public int getRootPaddingLeft() {
        return this.f11975[0];
    }

    public int getRootPaddingRight() {
        return this.f11975[2];
    }

    public int getRootPaddingTop() {
        return this.f11975[1];
    }

    public float getSafeHeight() {
        int measuredHeight = getMeasuredHeight();
        Rect rect = this.f11970;
        return (measuredHeight - rect.bottom) - rect.top;
    }

    public Rect getUnsafePlace() {
        return this.f11970;
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
        if (isInEditMode() || getParentDialog() == null || getParentDialog().m8617() == null) {
            return;
        }
        AbstractC7176 abstractC7176 = this.f11981;
        if (abstractC7176 != null) {
            abstractC7176.mo12493();
        }
        this.f11969 = (getResources().getConfiguration().uiMode & 48) == 16;
        if (this.f11978) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f11969 == ((configuration.uiMode & 48) == 16) || AbstractC9077.f23167 != DialogX$THEME.AUTO || getParentDialog() == null) {
            return;
        }
        getParentDialog().mo8607();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AbstractC7176 abstractC7176 = this.f11981;
        if (abstractC7176 != null) {
            abstractC7176.mo12492();
        }
        C4585 c4585 = this.f11979;
        if (c4585 != null) {
            View viewM8639 = c4585.m8639();
            if (viewM8639 != null && c4585.f12012 != null) {
                viewM8639.getViewTreeObserver().removeOnGlobalLayoutListener(c4585.f12012);
            }
            c4585.f12012 = null;
            c4585.f12007 = null;
            c4585.f12008 = null;
            c4585.f12006 = null;
        }
        this.f11979 = null;
        this.f11985 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f11974 = true;
            this.f11973 = motionEvent.getX();
            this.f11972 = motionEvent.getY();
        } else if (action == 1 && this.f11974 && findFocus() != this && getParentDialog() != null) {
            float fM8608 = getParentDialog().m8608(5.0f);
            if (Math.abs(motionEvent.getX() - this.f11973) <= fM8608 && Math.abs(motionEvent.getY() - this.f11972) <= fM8608) {
                callOnClick();
            }
        }
        if (getParentDialog() instanceof C9041) {
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
        if (getParentDialog() != null && (getParentDialog() instanceof C9041)) {
            return false;
        }
        if (i == 130 && (weakReference = this.f11971) != null && weakReference.get() != null && this.f11971.get() != this) {
            return ((View) this.f11971.get()).requestFocus();
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
        drawable.setAlpha((int) (this.f11976 * 255.0f));
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
    public final void m8630(int i, int i2, int i3, int i4) {
        Objects.toString(getParentDialog());
        AbstractC5754 abstractC5754 = AbstractC9077.f23168;
        getParentDialog();
        if ((getParentDialog() instanceof InterfaceC4583) || (findViewWithTag("DialogXSafetyArea") instanceof MaxRelativeLayout)) {
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
                ViewGroup viewGroup = (ViewGroup) findViewById(C0328R.id.bkg);
                ((InterfaceC4583) getParentDialog()).getClass();
                if (viewGroup != null) {
                    viewGroup.setPadding(0, 0, 0, i4);
                }
            }
            i4 = 0;
        }
        if (this.f11984) {
            setPadding(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m8631(int i, int i2, int i3, int i4) {
        int[] iArr = this.f11975;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8632(AbstractC4570 abstractC4570) {
        this.f11983 = new WeakReference(abstractC4570);
        if (abstractC4570 != null && abstractC4570.f11938 != DialogX$IMPL_MODE.VIEW) {
            setFitsSystemWindows(true);
        }
        if (this.f11970 != null) {
            Objects.toString(getParentDialog());
            Rect rect = this.f11970;
            m8630(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8633(float f) {
        this.f11976 = f;
        if (getBackground() != null) {
            getBackground().mutate().setAlpha((int) (f * 255.0f));
        }
    }
}
