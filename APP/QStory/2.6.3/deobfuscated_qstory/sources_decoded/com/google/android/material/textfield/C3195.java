package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.C0108;
import androidx.appcompat.widget.C0225;
import androidx.compose.ui.graphics.ViewOnAttachStateChangeListenerC1592;
import androidx.compose.ui.text.input.C2019;
import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3057;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.internal.AbstractC3160;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.InterfaceC3152;
import io.ktor.client.plugins.AbstractC3933;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p009.AbstractC6183;
import p175.AbstractC7739;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3195 extends LinearLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C3190 f10759;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public View.OnLongClickListener f10760;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public ImageView.ScaleType f10761;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f10762;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public PorterDuff.Mode f10763;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public ColorStateList f10764;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final LinkedHashSet f10765;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public AccessibilityManager.TouchExplorationStateChangeListener f10766;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final AccessibilityManager f10767;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public EditText f10768;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f10769;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C0225 f10770;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public CharSequence f10771;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public PorterDuff.Mode f10772;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public ColorStateList f10773;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C2019 f10774;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f10775;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public View.OnLongClickListener f10776;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final CheckableImageButton f10777;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final FrameLayout f10778;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final CheckableImageButton f10779;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final TextInputLayout f10780;

    public C3195(TextInputLayout textInputLayout, C0108 c0108) {
        super(textInputLayout.getContext());
        final int i = 0;
        this.f10775 = 0;
        this.f10765 = new LinkedHashSet();
        this.f10759 = new C3190(this);
        C3194 c3194 = new C3194(this);
        this.f10767 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f10780 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f10778 = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM7264 = m7264(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f10779 = checkableImageButtonM7264;
        CheckableImageButton checkableImageButtonM72642 = m7264(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f10777 = checkableImageButtonM72642;
        this.f10774 = new C2019(this, c0108);
        C0225 c0225 = new C0225(getContext(), null);
        this.f10770 = c0225;
        TypedArray typedArray = (TypedArray) c0108.f320;
        if (typedArray.hasValue(38)) {
            this.f10773 = AbstractC7739.m13072(getContext(), c0108, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f10772 = AbstractC3160.m7181(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            m7273(c0108.m390(37));
        }
        checkableImageButtonM7264.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonM7264.setImportantForAccessibility(2);
        checkableImageButtonM7264.setClickable(false);
        checkableImageButtonM7264.setPressable(false);
        checkableImageButtonM7264.setCheckable(false);
        checkableImageButtonM7264.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.f10764 = AbstractC7739.m13072(getContext(), c0108, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f10763 = AbstractC3160.m7181(typedArray.getInt(33, -1), null);
            }
        }
        final int i2 = 1;
        if (typedArray.hasValue(30)) {
            m7268(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27)) {
                m7269(typedArray.getText(27));
            }
            checkableImageButtonM72642.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.f10764 = AbstractC7739.m13072(getContext(), c0108, 55);
            }
            if (typedArray.hasValue(56)) {
                this.f10763 = AbstractC3160.m7181(typedArray.getInt(56, -1), null);
            }
            m7268(typedArray.getBoolean(54, false) ? 1 : 0);
            m7269(typedArray.getText(52));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            C5925.m11310("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.f10762) {
            this.f10762 = dimensionPixelSize;
            checkableImageButtonM72642.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM72642.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonM7264.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM7264.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeM6740 = AbstractC3057.m6740(typedArray.getInt(31, -1));
            this.f10761 = scaleTypeM6740;
            checkableImageButtonM72642.setScaleType(scaleTypeM6740);
            checkableImageButtonM7264.setScaleType(scaleTypeM6740);
        }
        c0225.setVisibility(8);
        c0225.setId(R.id.textinput_suffix_text);
        c0225.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c0225.setAccessibilityLiveRegion(1);
        c0225.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            c0225.setTextColor(c0108.m385(74));
        }
        CharSequence text = typedArray.getText(72);
        this.f10771 = TextUtils.isEmpty(text) ? null : text;
        c0225.setText(text);
        m7267();
        frameLayout.addView(checkableImageButtonM72642);
        addView(c0225);
        addView(frameLayout);
        addView(checkableImageButtonM7264);
        checkableImageButtonM7264.setOnFocusableChangedListener(new InterfaceC3152(this) { // from class: com.google.android.material.textfield.飘花落叶言子楪哲世苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C3195 f10747;

            {
                this.f10747 = this;
            }

            @Override // com.google.android.material.internal.InterfaceC3152
            /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
            public final void mo4483() {
                int i3 = i;
                C3195 c3195 = this.f10747;
                switch (i3) {
                    case 0:
                        CheckableImageButton checkableImageButton = c3195.f10779;
                        AbstractC3057.m6732(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = c3195.f10777;
                        AbstractC3057.m6732(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        checkableImageButtonM72642.setOnFocusableChangedListener(new InterfaceC3152(this) { // from class: com.google.android.material.textfield.飘花落叶言子楪哲世苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C3195 f10747;

            {
                this.f10747 = this;
            }

            @Override // com.google.android.material.internal.InterfaceC3152
            /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
            public final void mo4483() {
                int i3 = i2;
                C3195 c3195 = this.f10747;
                switch (i3) {
                    case 0:
                        CheckableImageButton checkableImageButton = c3195.f10779;
                        AbstractC3057.m6732(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = c3195.f10777;
                        AbstractC3057.m6732(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        textInputLayout.addOnEditTextAttachedListener(c3194);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1592(this, 2));
    }

    public void addOnEndIconChangedListener(InterfaceC3173 interfaceC3173) {
        this.f10765.add(interfaceC3173);
    }

    public void removeOnEndIconChangedListener(InterfaceC3173 interfaceC3173) {
        this.f10765.remove(interfaceC3173);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f10760;
        CheckableImageButton checkableImageButton = this.f10777;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC3057.m6735(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10760 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f10777;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC3057.m6735(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f10776;
        CheckableImageButton checkableImageButton = this.f10779;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC3057.m6735(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10776 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f10779;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC3057.m6735(checkableImageButton, onLongClickListener);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7259(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        AbstractC3192 abstractC3192M7263 = m7263();
        boolean zMo7252 = abstractC3192M7263.mo7252();
        CheckableImageButton checkableImageButton = this.f10777;
        boolean z4 = true;
        if (!zMo7252 || (z3 = checkableImageButton.f10414) == abstractC3192M7263.mo7251()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(abstractC3192M7263 instanceof C3199) || (zIsActivated = checkableImageButton.isActivated()) == ((C3199) abstractC3192M7263).f10796) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            AbstractC3057.m6746(this.f10780, checkableImageButton, this.f10764);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m7260() {
        return this.f10779.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m7261() {
        return this.f10778.getVisibility() == 0 && this.f10777.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m7262() {
        int marginStart;
        if (m7261() || m7260()) {
            CheckableImageButton checkableImageButton = this.f10777;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.f10770.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC3192 m7263() {
        AbstractC3192 c3178;
        int i = this.f10775;
        C2019 c2019 = this.f10774;
        SparseArray sparseArray = (SparseArray) c2019.f5957;
        AbstractC3192 abstractC3192 = (AbstractC3192) sparseArray.get(i);
        if (abstractC3192 != null) {
            return abstractC3192;
        }
        C3195 c3195 = (C3195) c2019.f5956;
        if (i != -1) {
            int i2 = 1;
            if (i == 0) {
                c3178 = new C3178(c3195, i2);
            } else if (i == 1) {
                c3178 = new C3189(c3195, c2019.f5958);
            } else if (i == 2) {
                c3178 = new C3179(c3195);
            } else {
                if (i != 3) {
                    C5925.m11310(AbstractC6183.m11588(i, "Invalid end icon mode: "));
                    return null;
                }
                c3178 = new C3199(c3195);
            }
        } else {
            c3178 = new C3178(c3195, 0);
        }
        sparseArray.append(i, c3178);
        return c3178;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final CheckableImageButton m7264(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (AbstractC7739.m13065(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m7265() {
        TextInputLayout textInputLayout = this.f10780;
        if (textInputLayout.f10634 == null) {
            return;
        }
        this.f10770.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f10634.getPaddingTop(), (m7261() || m7260()) ? 0 : textInputLayout.f10634.getPaddingEnd(), textInputLayout.f10634.getPaddingBottom());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m7266() {
        CheckableImageButton checkableImageButton = this.f10779;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f10780;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f10605.f10711 && textInputLayout.m7211()) ? 0 : 8);
        m7271();
        m7265();
        if (this.f10775 != 0) {
            return;
        }
        textInputLayout.m7203();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m7267() {
        C0225 c0225 = this.f10770;
        int visibility = c0225.getVisibility();
        int i = (this.f10771 == null || this.f10769) ? 8 : 0;
        if (visibility != i) {
            m7263().mo7228(i == 0);
        }
        m7271();
        c0225.setVisibility(i);
        this.f10780.m7203();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m7268(int i) {
        if (this.f10775 == i) {
            return;
        }
        AbstractC3192 abstractC3192M7263 = m7263();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f10766;
        AccessibilityManager accessibilityManager = this.f10767;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.f10766 = null;
        abstractC3192M7263.mo7227();
        this.f10775 = i;
        Iterator it = this.f10765.iterator();
        if (it.hasNext()) {
            throw AbstractC2442.m4578(it);
        }
        m7272(i != 0);
        AbstractC3192 abstractC3192M72632 = m7263();
        int iMo7222 = this.f10774.f5959;
        if (iMo7222 == 0) {
            iMo7222 = abstractC3192M72632.mo7222();
        }
        Drawable drawableM8312 = iMo7222 != 0 ? AbstractC3933.m8312(getContext(), iMo7222) : null;
        CheckableImageButton checkableImageButton = this.f10777;
        checkableImageButton.setImageDrawable(drawableM8312);
        TextInputLayout textInputLayout = this.f10780;
        if (drawableM8312 != null) {
            AbstractC3057.m6742(textInputLayout, checkableImageButton, this.f10764, this.f10763);
            AbstractC3057.m6746(textInputLayout, checkableImageButton, this.f10764);
        }
        checkableImageButton.setCheckable(abstractC3192M72632.mo7252());
        if (!abstractC3192M72632.mo7257(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        abstractC3192M72632.mo7219();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerMo7256 = abstractC3192M72632.mo7256();
        this.f10766 = touchExplorationStateChangeListenerMo7256;
        if (touchExplorationStateChangeListenerMo7256 != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.f10766);
        }
        setEndIconOnClickListener(abstractC3192M72632.mo7220());
        int iMo7223 = abstractC3192M72632.mo7223();
        m7269(iMo7223 != 0 ? getResources().getText(iMo7223) : null);
        EditText editText = this.f10768;
        if (editText != null) {
            abstractC3192M72632.mo7230(editText);
            m7270(abstractC3192M72632);
        }
        AbstractC3057.m6742(textInputLayout, checkableImageButton, this.f10764, this.f10763);
        m7259(true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m7269(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f10777;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            AbstractC3057.m6732(checkableImageButton, charSequence);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m7270(AbstractC3192 abstractC3192) {
        if (this.f10768 == null) {
            return;
        }
        if (abstractC3192.mo7221() != null) {
            this.f10768.setOnFocusChangeListener(abstractC3192.mo7221());
        }
        if (abstractC3192.mo7229() != null) {
            this.f10777.setOnFocusChangeListener(abstractC3192.mo7229());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m7271() {
        this.f10778.setVisibility((this.f10777.getVisibility() != 0 || m7260()) ? 8 : 0);
        setVisibility((m7261() || m7260() || ((this.f10771 == null || this.f10769) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m7272(boolean z) {
        EditText editText;
        if (m7261() != z) {
            CheckableImageButton checkableImageButton = this.f10777;
            if (!z && checkableImageButton.hasFocus() && (editText = this.f10768) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z ? 0 : 8);
            m7271();
            m7265();
            this.f10780.m7203();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m7273(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f10779;
        checkableImageButton.setImageDrawable(drawable);
        m7266();
        AbstractC3057.m6742(this.f10780, checkableImageButton, this.f10773, this.f10772);
    }
}
