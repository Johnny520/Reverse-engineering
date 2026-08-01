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
import com.bumptech.glide.AbstractC3054;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.internal.AbstractC3159;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.InterfaceC3151;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p007.AbstractC6136;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3194 extends LinearLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C3189 f10754;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public View.OnLongClickListener f10755;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public ImageView.ScaleType f10756;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f10757;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public PorterDuff.Mode f10758;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public ColorStateList f10759;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final LinkedHashSet f10760;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public AccessibilityManager.TouchExplorationStateChangeListener f10761;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final AccessibilityManager f10762;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public EditText f10763;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f10764;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C0225 f10765;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public CharSequence f10766;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public PorterDuff.Mode f10767;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public ColorStateList f10768;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C2019 f10769;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f10770;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public View.OnLongClickListener f10771;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final CheckableImageButton f10772;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final FrameLayout f10773;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final CheckableImageButton f10774;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final TextInputLayout f10775;

    public C3194(TextInputLayout textInputLayout, C0108 c0108) {
        super(textInputLayout.getContext());
        final int i = 0;
        this.f10770 = 0;
        this.f10760 = new LinkedHashSet();
        this.f10754 = new C3189(this);
        C3193 c3193 = new C3193(this);
        this.f10762 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f10775 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f10773 = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM7277 = m7277(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f10774 = checkableImageButtonM7277;
        CheckableImageButton checkableImageButtonM72772 = m7277(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f10772 = checkableImageButtonM72772;
        this.f10769 = new C2019(this, c0108);
        C0225 c0225 = new C0225(getContext(), null);
        this.f10765 = c0225;
        TypedArray typedArray = (TypedArray) c0108.f320;
        if (typedArray.hasValue(38)) {
            this.f10768 = AbstractC8189.m13682(getContext(), c0108, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f10767 = AbstractC3159.m7194(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            m7286(c0108.m389(37));
        }
        checkableImageButtonM7277.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonM7277.setImportantForAccessibility(2);
        checkableImageButtonM7277.setClickable(false);
        checkableImageButtonM7277.setPressable(false);
        checkableImageButtonM7277.setCheckable(false);
        checkableImageButtonM7277.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.f10759 = AbstractC8189.m13682(getContext(), c0108, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f10758 = AbstractC3159.m7194(typedArray.getInt(33, -1), null);
            }
        }
        final int i2 = 1;
        if (typedArray.hasValue(30)) {
            m7281(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27)) {
                m7282(typedArray.getText(27));
            }
            checkableImageButtonM72772.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.f10759 = AbstractC8189.m13682(getContext(), c0108, 55);
            }
            if (typedArray.hasValue(56)) {
                this.f10758 = AbstractC3159.m7194(typedArray.getInt(56, -1), null);
            }
            m7281(typedArray.getBoolean(54, false) ? 1 : 0);
            m7282(typedArray.getText(52));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            C5919.m11249("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.f10757) {
            this.f10757 = dimensionPixelSize;
            checkableImageButtonM72772.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM72772.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonM7277.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM7277.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeM6613 = AbstractC3054.m6613(typedArray.getInt(31, -1));
            this.f10756 = scaleTypeM6613;
            checkableImageButtonM72772.setScaleType(scaleTypeM6613);
            checkableImageButtonM7277.setScaleType(scaleTypeM6613);
        }
        c0225.setVisibility(8);
        c0225.setId(R.id.textinput_suffix_text);
        c0225.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c0225.setAccessibilityLiveRegion(1);
        c0225.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            c0225.setTextColor(c0108.m384(74));
        }
        CharSequence text = typedArray.getText(72);
        this.f10766 = TextUtils.isEmpty(text) ? null : text;
        c0225.setText(text);
        m7280();
        frameLayout.addView(checkableImageButtonM72772);
        addView(c0225);
        addView(frameLayout);
        addView(checkableImageButtonM7277);
        checkableImageButtonM7277.setOnFocusableChangedListener(new InterfaceC3151(this) { // from class: com.google.android.material.textfield.飘花落叶言子楪哲世苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C3194 f10742;

            {
                this.f10742 = this;
            }

            @Override // com.google.android.material.internal.InterfaceC3151
            /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
            public final void mo4473() {
                int i3 = i;
                C3194 c3194 = this.f10742;
                switch (i3) {
                    case 0:
                        CheckableImageButton checkableImageButton = c3194.f10774;
                        AbstractC3054.m6578(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = c3194.f10772;
                        AbstractC3054.m6578(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        checkableImageButtonM72772.setOnFocusableChangedListener(new InterfaceC3151(this) { // from class: com.google.android.material.textfield.飘花落叶言子楪哲世苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C3194 f10742;

            {
                this.f10742 = this;
            }

            @Override // com.google.android.material.internal.InterfaceC3151
            /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
            public final void mo4473() {
                int i3 = i2;
                C3194 c3194 = this.f10742;
                switch (i3) {
                    case 0:
                        CheckableImageButton checkableImageButton = c3194.f10774;
                        AbstractC3054.m6578(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = c3194.f10772;
                        AbstractC3054.m6578(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        textInputLayout.addOnEditTextAttachedListener(c3193);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1592(this, 2));
    }

    public void addOnEndIconChangedListener(InterfaceC3172 interfaceC3172) {
        this.f10760.add(interfaceC3172);
    }

    public void removeOnEndIconChangedListener(InterfaceC3172 interfaceC3172) {
        this.f10760.remove(interfaceC3172);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f10755;
        CheckableImageButton checkableImageButton = this.f10772;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC3054.m6594(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10755 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f10772;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC3054.m6594(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f10771;
        CheckableImageButton checkableImageButton = this.f10774;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC3054.m6594(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10771 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f10774;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC3054.m6594(checkableImageButton, onLongClickListener);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7272(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        AbstractC3191 abstractC3191M7276 = m7276();
        boolean zMo7265 = abstractC3191M7276.mo7265();
        CheckableImageButton checkableImageButton = this.f10772;
        boolean z4 = true;
        if (!zMo7265 || (z3 = checkableImageButton.f10409) == abstractC3191M7276.mo7264()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(abstractC3191M7276 instanceof C3198) || (zIsActivated = checkableImageButton.isActivated()) == ((C3198) abstractC3191M7276).f10791) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            AbstractC3054.m6588(this.f10775, checkableImageButton, this.f10759);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m7273() {
        return this.f10774.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m7274() {
        return this.f10773.getVisibility() == 0 && this.f10772.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m7275() {
        int marginStart;
        if (m7274() || m7273()) {
            CheckableImageButton checkableImageButton = this.f10772;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.f10765.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC3191 m7276() {
        AbstractC3191 c3177;
        int i = this.f10770;
        C2019 c2019 = this.f10769;
        SparseArray sparseArray = (SparseArray) c2019.f5956;
        AbstractC3191 abstractC3191 = (AbstractC3191) sparseArray.get(i);
        if (abstractC3191 != null) {
            return abstractC3191;
        }
        C3194 c3194 = (C3194) c2019.f5955;
        if (i != -1) {
            int i2 = 1;
            if (i == 0) {
                c3177 = new C3177(c3194, i2);
            } else if (i == 1) {
                c3177 = new C3188(c3194, c2019.f5957);
            } else if (i == 2) {
                c3177 = new C3178(c3194);
            } else {
                if (i != 3) {
                    C5919.m11249(AbstractC6136.m11556(i, "Invalid end icon mode: "));
                    return null;
                }
                c3177 = new C3198(c3194);
            }
        } else {
            c3177 = new C3177(c3194, 0);
        }
        sparseArray.append(i, c3177);
        return c3177;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final CheckableImageButton m7277(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (AbstractC8189.m13674(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m7278() {
        TextInputLayout textInputLayout = this.f10775;
        if (textInputLayout.f10629 == null) {
            return;
        }
        this.f10765.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f10629.getPaddingTop(), (m7274() || m7273()) ? 0 : textInputLayout.f10629.getPaddingEnd(), textInputLayout.f10629.getPaddingBottom());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m7279() {
        CheckableImageButton checkableImageButton = this.f10774;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f10775;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f10600.f10706 && textInputLayout.m7224()) ? 0 : 8);
        m7284();
        m7278();
        if (this.f10770 != 0) {
            return;
        }
        textInputLayout.m7216();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m7280() {
        C0225 c0225 = this.f10765;
        int visibility = c0225.getVisibility();
        int i = (this.f10766 == null || this.f10764) ? 8 : 0;
        if (visibility != i) {
            m7276().mo7241(i == 0);
        }
        m7284();
        c0225.setVisibility(i);
        this.f10775.m7216();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m7281(int i) {
        if (this.f10770 == i) {
            return;
        }
        AbstractC3191 abstractC3191M7276 = m7276();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f10761;
        AccessibilityManager accessibilityManager = this.f10762;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.f10761 = null;
        abstractC3191M7276.mo7240();
        this.f10770 = i;
        Iterator it = this.f10760.iterator();
        if (it.hasNext()) {
            throw AbstractC2442.m4568(it);
        }
        m7285(i != 0);
        AbstractC3191 abstractC3191M72762 = m7276();
        int iMo7235 = this.f10769.f5958;
        if (iMo7235 == 0) {
            iMo7235 = abstractC3191M72762.mo7235();
        }
        Drawable drawableM6607 = iMo7235 != 0 ? AbstractC3054.m6607(getContext(), iMo7235) : null;
        CheckableImageButton checkableImageButton = this.f10772;
        checkableImageButton.setImageDrawable(drawableM6607);
        TextInputLayout textInputLayout = this.f10775;
        if (drawableM6607 != null) {
            AbstractC3054.m6597(textInputLayout, checkableImageButton, this.f10759, this.f10758);
            AbstractC3054.m6588(textInputLayout, checkableImageButton, this.f10759);
        }
        checkableImageButton.setCheckable(abstractC3191M72762.mo7265());
        if (!abstractC3191M72762.mo7270(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        abstractC3191M72762.mo7232();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerMo7269 = abstractC3191M72762.mo7269();
        this.f10761 = touchExplorationStateChangeListenerMo7269;
        if (touchExplorationStateChangeListenerMo7269 != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.f10761);
        }
        setEndIconOnClickListener(abstractC3191M72762.mo7233());
        int iMo7236 = abstractC3191M72762.mo7236();
        m7282(iMo7236 != 0 ? getResources().getText(iMo7236) : null);
        EditText editText = this.f10763;
        if (editText != null) {
            abstractC3191M72762.mo7243(editText);
            m7283(abstractC3191M72762);
        }
        AbstractC3054.m6597(textInputLayout, checkableImageButton, this.f10759, this.f10758);
        m7272(true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m7282(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f10772;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            AbstractC3054.m6578(checkableImageButton, charSequence);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m7283(AbstractC3191 abstractC3191) {
        if (this.f10763 == null) {
            return;
        }
        if (abstractC3191.mo7234() != null) {
            this.f10763.setOnFocusChangeListener(abstractC3191.mo7234());
        }
        if (abstractC3191.mo7242() != null) {
            this.f10772.setOnFocusChangeListener(abstractC3191.mo7242());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m7284() {
        this.f10773.setVisibility((this.f10772.getVisibility() != 0 || m7273()) ? 8 : 0);
        setVisibility((m7274() || m7273() || ((this.f10766 == null || this.f10764) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m7285(boolean z) {
        EditText editText;
        if (m7274() != z) {
            CheckableImageButton checkableImageButton = this.f10772;
            if (!z && checkableImageButton.hasFocus() && (editText = this.f10763) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z ? 0 : 8);
            m7284();
            m7278();
            this.f10775.m7216();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m7286(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f10774;
        checkableImageButton.setImageDrawable(drawable);
        m7279();
        AbstractC3054.m6597(this.f10775, checkableImageButton, this.f10768, this.f10767);
    }
}
