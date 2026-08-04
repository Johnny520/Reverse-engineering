package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import androidx.activity.C0033;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import yyds.AbstractC0158;
import yyds.AbstractC0598;
import yyds.AbstractC1529;
import yyds.AbstractC1640;
import yyds.AbstractC1655;
import yyds.AbstractC2709;
import yyds.C0052;
import yyds.C0571;
import yyds.C0763;
import yyds.C1059;
import yyds.C1536;
import yyds.C2133;
import yyds.C2173;
import yyds.C2542;
import yyds.C2610;
import yyds.C2693;
import yyds.C2748;
import yyds.InterfaceC0108;
import yyds.InterfaceC0687;
import yyds.InterfaceC2605;
import yyds.InterfaceC2671;
import yyds.ViewOnAttachStateChangeListenerC0762;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class DialogXBaseRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public static final /* synthetic */ int f416 = 0;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public float f417;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final Rect f418;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public boolean f419;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public AbstractC0598 f420;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f421;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public float f422;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public float f423;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public Rect f424;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public WeakReference f425;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f426;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final int[] f427;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public C2173 f428;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public boolean f429;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public InterfaceC2605 f430;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public boolean f431;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public WeakReference f432;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public C2748 f433;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f434;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean f435;

    public DialogXBaseRelativeLayout(Context context) {
        super(context);
        this.f435 = true;
        this.f421 = true;
        this.f434 = true;
        this.f418 = new Rect();
        this.f429 = false;
        this.f424 = new Rect();
        this.f431 = true;
        this.f427 = new int[4];
        m296(null);
    }

    private void setBackPressedDispatcher(boolean z) {
        if (!z) {
            C2748 c2748 = this.f433;
            if (c2748 != null) {
                Iterator it = c2748.f7378.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0108) it.next()).cancel();
                }
                return;
            }
            return;
        }
        InterfaceC2671 interfaceC2671 = (InterfaceC2671) AbstractC1529.m3161(AbstractC1529.m3164(AbstractC1529.m3159(this, C1536.f7380), C1536.f7381));
        if (interfaceC2671 == null) {
            return;
        }
        C0033 c0033Mo15 = interfaceC2671.mo15();
        C2748 c27482 = new C2748(this, interfaceC2671);
        this.f433 = c27482;
        c0033Mo15.m21(interfaceC2671, c27482);
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
        if (isAttachedToWindow() && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4 && this.f434) {
            if (m295()) {
                return true;
            }
            AbstractC0041 parentDialog = getParentDialog();
            InterfaceC2605 interfaceC2605 = this.f430;
            if (interfaceC2605 != null && parentDialog != null) {
                interfaceC2605.mo380();
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public C2173 getFitSystemBarUtils() {
        return this.f428;
    }

    public InterfaceC0687 getOnSafeInsetsChangeListener() {
        return null;
    }

    public AbstractC0041 getParentDialog() {
        WeakReference weakReference = this.f432;
        if (weakReference == null) {
            return null;
        }
        return (AbstractC0041) weakReference.get();
    }

    public int getRootPaddingBottom() {
        return this.f427[3];
    }

    public int getRootPaddingLeft() {
        return this.f427[0];
    }

    public int getRootPaddingRight() {
        return this.f427[2];
    }

    public int getRootPaddingTop() {
        return this.f427[1];
    }

    public float getSafeHeight() {
        int measuredHeight = getMeasuredHeight();
        Rect rect = this.f424;
        return (measuredHeight - rect.bottom) - rect.top;
    }

    public Rect getUnsafePlace() {
        return this.f424;
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
        setBackPressedDispatcher(true);
        if (isInEditMode() || getParentDialog() == null || getParentDialog().m282() == null) {
            return;
        }
        AbstractC0598 abstractC0598 = this.f420;
        if (abstractC0598 != null) {
            abstractC0598.mo1489();
        }
        this.f431 = (getResources().getConfiguration().uiMode & 48) == 16;
        if (this.f421) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f431 == ((configuration.uiMode & 48) == 16) || AbstractC1655.f8453 != 3 || getParentDialog() == null) {
            return;
        }
        getParentDialog().mo288();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AbstractC0598 abstractC0598 = this.f420;
        if (abstractC0598 != null) {
            abstractC0598.mo1490();
        }
        C2173 c2173 = this.f428;
        if (c2173 != null) {
            View viewM4142 = c2173.m4142();
            if (viewM4142 != null && c2173.f10648 != null) {
                viewM4142.getViewTreeObserver().removeOnGlobalLayoutListener(c2173.f10648);
            }
            c2173.f10648 = null;
            c2173.f10653 = null;
            c2173.f10651 = null;
            c2173.f10655 = null;
        }
        setBackPressedDispatcher(false);
        this.f428 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f419 = true;
            this.f417 = motionEvent.getX();
            this.f423 = motionEvent.getY();
        } else if (action == 1 && this.f419 && findFocus() != this && getParentDialog() != null) {
            float fM275 = getParentDialog().m275(5.0f);
            if (Math.abs(motionEvent.getX() - this.f417) <= fM275 && Math.abs(motionEvent.getY() - this.f423) <= fM275) {
                callOnClick();
            }
        }
        getParentDialog();
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
        if (getParentDialog() != null) {
            getParentDialog();
        }
        if (i == 130 && (weakReference = this.f425) != null && weakReference.get() != null && this.f425.get() != this) {
            return ((View) this.f425.get()).requestFocus();
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
        drawable.setAlpha((int) (this.f422 * 255.0f));
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

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m294(AbstractC0041 abstractC0041) {
        this.f432 = new WeakReference(abstractC0041);
        if (abstractC0041 != null && abstractC0041.f409 != 1) {
            setFitsSystemWindows(true);
        }
        if (this.f424 != null) {
            Objects.toString(getParentDialog());
            Rect rect = this.f424;
            m298(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (m297() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (m297() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m295() {
        View viewFindFocus;
        View rootView;
        InputMethodManager inputMethodManager;
        getParentDialog();
        if (getRootWindowInsets() == null) {
            if (!this.f426) {
            }
            viewFindFocus = findFocus();
            viewFindFocus = viewFindFocus != null ? rootView.findFocus() : rootView.findFocus();
            if (viewFindFocus != null) {
            }
            inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
            }
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            if (this.f421) {
            }
            this.f426 = false;
            return true;
        }
        C2610 c2610 = C2693.m4783(null, getRootWindowInsets()).f13242;
        boolean z = c2610.mo2803(8) && c2610.mo2800(8).f9416 > 0;
        this.f426 = z;
        if (!z) {
        }
        viewFindFocus = findFocus();
        if ((viewFindFocus != null || viewFindFocus == this) && (rootView = getRootView()) != null) {
        }
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = viewFindFocus != null ? this : viewFindFocus;
        inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(dialogXBaseRelativeLayout.getWindowToken(), 2);
        }
        if (viewFindFocus != null && viewFindFocus != this) {
            viewFindFocus.clearFocus();
        }
        if (this.f421) {
            requestFocus();
        }
        this.f426 = false;
        return true;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m296(AttributeSet attributeSet) {
        boolean z = false;
        setForceDarkAllowed(false);
        if (this.f429) {
            return;
        }
        int i = 2;
        int i2 = 1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0158.f969);
            this.f421 = typedArrayObtainStyledAttributes.getBoolean(1, true);
            this.f435 = typedArrayObtainStyledAttributes.getBoolean(0, true);
            this.f434 = typedArrayObtainStyledAttributes.getBoolean(2, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f429 = true;
        }
        if (this.f421) {
            setFocusable(true);
            setFocusableInTouchMode(true);
        }
        m299(0.0f);
        if (getParentDialog() != null && getParentDialog().f409 != 1) {
            setFitsSystemWindows(true);
        }
        setClipChildren(false);
        setClipToPadding(false);
        setDefaultFocusHighlightEnabled(false);
        C0052 c0052 = new C0052(16, this);
        C2173 c2173 = new C2173();
        c2173.f10650 = false;
        c2173.f10651 = this;
        c2173.f10653 = c0052;
        c2173.f10655 = getParentDialog();
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c2173.f10651;
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        int paddingStart = dialogXBaseRelativeLayout.getPaddingStart();
        int paddingTop = c2173.f10651.getPaddingTop();
        int paddingEnd = c2173.f10651.getPaddingEnd();
        int paddingBottom = c2173.f10651.getPaddingBottom();
        C2542 c2542 = new C2542();
        c2542.f12524 = paddingStart;
        c2542.f12525 = paddingTop;
        c2542.f12526 = paddingEnd;
        c2542.f12527 = paddingBottom;
        AbstractC2709.m4820(c2173.f10651, new C0571(c2173, i, c2542));
        c2173.f10651.setWindowInsetsAnimationCallback(new C1059(new C2133(24, c2173, c2542, z)));
        boolean zIsAttachedToWindow = c2173.f10651.isAttachedToWindow();
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = c2173.f10651;
        if (zIsAttachedToWindow) {
            dialogXBaseRelativeLayout2.requestApplyInsets();
        } else {
            dialogXBaseRelativeLayout2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0762(c2173, i2, c2542));
        }
        this.f428 = c2173;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean m297() {
        View rootView = getRootView();
        if (rootView == null) {
            return false;
        }
        Rect rect = this.f418;
        rootView.getWindowVisibleDisplayFrame(rect);
        int height = rootView.getHeight();
        return height > 0 && height - rect.height() > Math.max((int) (((float) height) * 0.15f), (int) (getResources().getDisplayMetrics().density * 80.0f));
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m298(int i, int i2, int i3, int i4) {
        Objects.toString(getParentDialog());
        WeakReference weakReference = AbstractC1655.f8450;
        getParentDialog();
        if ((getParentDialog() instanceof C0763) || (findViewWithTag("DialogXSafetyArea") instanceof MaxRelativeLayout)) {
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
                ((C0763) getParentDialog()).getClass();
                if (viewGroup != null) {
                    viewGroup.setPadding(0, 0, 0, i4);
                }
            }
            i4 = 0;
        }
        if (this.f435) {
            setPadding(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m299(float f) {
        this.f422 = f;
        if (getBackground() != null) {
            getBackground().mutate().setAlpha((int) (f * 255.0f));
        }
    }

    public DialogXBaseRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f435 = true;
        this.f421 = true;
        this.f434 = true;
        this.f418 = new Rect();
        this.f429 = false;
        this.f424 = new Rect();
        this.f431 = true;
        this.f427 = new int[4];
        m296(attributeSet);
    }
}
