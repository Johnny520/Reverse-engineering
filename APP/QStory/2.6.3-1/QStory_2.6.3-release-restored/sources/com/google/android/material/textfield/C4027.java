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
import androidx.appcompat.app.C0955;
import androidx.appcompat.widget.C1072;
import androidx.compose.p001ui.graphics.ViewOnAttachStateChangeListenerC2427;
import androidx.compose.p001ui.text.input.C2853;
import androidx.profileinstaller.AbstractC3275;
import com.bumptech.glide.AbstractC3889;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.internal.AbstractC3992;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.InterfaceC3984;
import io.ktor.client.plugins.AbstractC4765;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p025.AbstractC7012;
import p191.AbstractC8568;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4027 extends LinearLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C4022 f11104;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public View.OnLongClickListener f11105;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public ImageView.ScaleType f11106;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f11107;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public PorterDuff.Mode f11108;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public ColorStateList f11109;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final LinkedHashSet f11110;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public AccessibilityManager.TouchExplorationStateChangeListener f11111;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final AccessibilityManager f11112;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public EditText f11113;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f11114;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C1072 f11115;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public CharSequence f11116;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public PorterDuff.Mode f11117;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public ColorStateList f11118;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C2853 f11119;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f11120;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public View.OnLongClickListener f11121;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final CheckableImageButton f11122;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final FrameLayout f11123;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final CheckableImageButton f11124;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final TextInputLayout f11125;

    public C4027(TextInputLayout textInputLayout, C0955 c0955) {
        super(textInputLayout.getContext());
        final int i = 0;
        this.f11120 = 0;
        this.f11110 = new LinkedHashSet();
        this.f11104 = new C4022(this);
        C4026 c4026 = new C4026(this);
        this.f11112 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f11125 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f11123 = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM7823 = m7823(this, layoutInflaterFrom, C0328R.id.text_input_error_icon);
        this.f11124 = checkableImageButtonM7823;
        CheckableImageButton checkableImageButtonM78232 = m7823(frameLayout, layoutInflaterFrom, C0328R.id.text_input_end_icon);
        this.f11122 = checkableImageButtonM78232;
        this.f11119 = new C2853(this, c0955);
        C1072 c1072 = new C1072(getContext(), null);
        this.f11115 = c1072;
        TypedArray typedArray = (TypedArray) c0955.f665;
        if (typedArray.hasValue(38)) {
            this.f11118 = AbstractC8568.m13631(getContext(), c0955, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f11117 = AbstractC3992.m7740(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            m7832(c0955.m950(37));
        }
        checkableImageButtonM7823.setContentDescription(getResources().getText(C0328R.string.error_icon_content_description));
        checkableImageButtonM7823.setImportantForAccessibility(2);
        checkableImageButtonM7823.setClickable(false);
        checkableImageButtonM7823.setPressable(false);
        checkableImageButtonM7823.setCheckable(false);
        checkableImageButtonM7823.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.f11109 = AbstractC8568.m13631(getContext(), c0955, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f11108 = AbstractC3992.m7740(typedArray.getInt(33, -1), null);
            }
        }
        final int i2 = 1;
        if (typedArray.hasValue(30)) {
            m7827(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27)) {
                m7828(typedArray.getText(27));
            }
            checkableImageButtonM78232.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.f11109 = AbstractC8568.m13631(getContext(), c0955, 55);
            }
            if (typedArray.hasValue(56)) {
                this.f11108 = AbstractC3992.m7740(typedArray.getInt(56, -1), null);
            }
            m7827(typedArray.getBoolean(54, false) ? 1 : 0);
            m7828(typedArray.getText(52));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(C0328R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            C6755.m11869("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.f11107) {
            this.f11107 = dimensionPixelSize;
            checkableImageButtonM78232.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM78232.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonM7823.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM7823.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeM7300 = AbstractC3889.m7300(typedArray.getInt(31, -1));
            this.f11106 = scaleTypeM7300;
            checkableImageButtonM78232.setScaleType(scaleTypeM7300);
            checkableImageButtonM7823.setScaleType(scaleTypeM7300);
        }
        c1072.setVisibility(8);
        c1072.setId(C0328R.id.textinput_suffix_text);
        c1072.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c1072.setAccessibilityLiveRegion(1);
        c1072.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            c1072.setTextColor(c0955.m945(74));
        }
        CharSequence text = typedArray.getText(72);
        this.f11116 = TextUtils.isEmpty(text) ? null : text;
        c1072.setText(text);
        m7826();
        frameLayout.addView(checkableImageButtonM78232);
        addView(c1072);
        addView(frameLayout);
        addView(checkableImageButtonM7823);
        checkableImageButtonM7823.setOnFocusableChangedListener(new InterfaceC3984(this) { // from class: com.google.android.material.textfield.飘花落叶言子楪哲世苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4027 f11092;

            {
                this.f11092 = this;
            }

            @Override // com.google.android.material.internal.InterfaceC3984
            /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
            public final void mo5043() {
                int i3 = i;
                C4027 c4027 = this.f11092;
                switch (i3) {
                    case 0:
                        CheckableImageButton checkableImageButton = c4027.f11124;
                        AbstractC3889.m7292(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = c4027.f11122;
                        AbstractC3889.m7292(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        checkableImageButtonM78232.setOnFocusableChangedListener(new InterfaceC3984(this) { // from class: com.google.android.material.textfield.飘花落叶言子楪哲世苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4027 f11092;

            {
                this.f11092 = this;
            }

            @Override // com.google.android.material.internal.InterfaceC3984
            /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
            public final void mo5043() {
                int i3 = i2;
                C4027 c4027 = this.f11092;
                switch (i3) {
                    case 0:
                        CheckableImageButton checkableImageButton = c4027.f11124;
                        AbstractC3889.m7292(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = c4027.f11122;
                        AbstractC3889.m7292(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        textInputLayout.addOnEditTextAttachedListener(c4026);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2427(this, 2));
    }

    public void addOnEndIconChangedListener(InterfaceC4005 interfaceC4005) {
        this.f11110.add(interfaceC4005);
    }

    public void removeOnEndIconChangedListener(InterfaceC4005 interfaceC4005) {
        this.f11110.remove(interfaceC4005);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f11105;
        CheckableImageButton checkableImageButton = this.f11122;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC3889.m7295(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f11105 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f11122;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC3889.m7295(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f11121;
        CheckableImageButton checkableImageButton = this.f11124;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC3889.m7295(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f11121 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f11124;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC3889.m7295(checkableImageButton, onLongClickListener);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7818(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        AbstractC4024 abstractC4024M7822 = m7822();
        boolean zMo7811 = abstractC4024M7822.mo7811();
        CheckableImageButton checkableImageButton = this.f11122;
        boolean z4 = true;
        if (!zMo7811 || (z3 = checkableImageButton.f10759) == abstractC4024M7822.mo7810()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(abstractC4024M7822 instanceof C4031) || (zIsActivated = checkableImageButton.isActivated()) == ((C4031) abstractC4024M7822).f11141) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            AbstractC3889.m7306(this.f11125, checkableImageButton, this.f11109);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m7819() {
        return this.f11124.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m7820() {
        return this.f11123.getVisibility() == 0 && this.f11122.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m7821() {
        int marginStart;
        if (m7820() || m7819()) {
            CheckableImageButton checkableImageButton = this.f11122;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.f11115.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC4024 m7822() {
        AbstractC4024 c4010;
        int i = this.f11120;
        C2853 c2853 = this.f11119;
        SparseArray sparseArray = (SparseArray) c2853.f6302;
        AbstractC4024 abstractC4024 = (AbstractC4024) sparseArray.get(i);
        if (abstractC4024 != null) {
            return abstractC4024;
        }
        C4027 c4027 = (C4027) c2853.f6301;
        if (i != -1) {
            int i2 = 1;
            if (i == 0) {
                c4010 = new C4010(c4027, i2);
            } else if (i == 1) {
                c4010 = new C4021(c4027, c2853.f6303);
            } else if (i == 2) {
                c4010 = new C4011(c4027);
            } else {
                if (i != 3) {
                    C6755.m11869(AbstractC7012.m12147(i, "Invalid end icon mode: "));
                    return null;
                }
                c4010 = new C4031(c4027);
            }
        } else {
            c4010 = new C4010(c4027, 0);
        }
        sparseArray.append(i, c4010);
        return c4010;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final CheckableImageButton m7823(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(C0328R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (AbstractC8568.m13624(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m7824() {
        TextInputLayout textInputLayout = this.f11125;
        if (textInputLayout.f10979 == null) {
            return;
        }
        this.f11115.setPaddingRelative(getContext().getResources().getDimensionPixelSize(C0328R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f10979.getPaddingTop(), (m7820() || m7819()) ? 0 : textInputLayout.f10979.getPaddingEnd(), textInputLayout.f10979.getPaddingBottom());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m7825() {
        CheckableImageButton checkableImageButton = this.f11124;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f11125;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f10950.f11056 && textInputLayout.m7770()) ? 0 : 8);
        m7830();
        m7824();
        if (this.f11120 != 0) {
            return;
        }
        textInputLayout.m7762();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m7826() {
        C1072 c1072 = this.f11115;
        int visibility = c1072.getVisibility();
        int i = (this.f11116 == null || this.f11114) ? 8 : 0;
        if (visibility != i) {
            m7822().mo7787(i == 0);
        }
        m7830();
        c1072.setVisibility(i);
        this.f11125.m7762();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m7827(int i) {
        if (this.f11120 == i) {
            return;
        }
        AbstractC4024 abstractC4024M7822 = m7822();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f11111;
        AccessibilityManager accessibilityManager = this.f11112;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.f11111 = null;
        abstractC4024M7822.mo7786();
        this.f11120 = i;
        Iterator it = this.f11110.iterator();
        if (it.hasNext()) {
            throw AbstractC3275.m5138(it);
        }
        m7831(i != 0);
        AbstractC4024 abstractC4024M78222 = m7822();
        int iMo7781 = this.f11119.f6304;
        if (iMo7781 == 0) {
            iMo7781 = abstractC4024M78222.mo7781();
        }
        Drawable drawableM8871 = iMo7781 != 0 ? AbstractC4765.m8871(getContext(), iMo7781) : null;
        CheckableImageButton checkableImageButton = this.f11122;
        checkableImageButton.setImageDrawable(drawableM8871);
        TextInputLayout textInputLayout = this.f11125;
        if (drawableM8871 != null) {
            AbstractC3889.m7302(textInputLayout, checkableImageButton, this.f11109, this.f11108);
            AbstractC3889.m7306(textInputLayout, checkableImageButton, this.f11109);
        }
        checkableImageButton.setCheckable(abstractC4024M78222.mo7811());
        if (!abstractC4024M78222.mo7816(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        abstractC4024M78222.mo7778();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerMo7815 = abstractC4024M78222.mo7815();
        this.f11111 = touchExplorationStateChangeListenerMo7815;
        if (touchExplorationStateChangeListenerMo7815 != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.f11111);
        }
        setEndIconOnClickListener(abstractC4024M78222.mo7779());
        int iMo7782 = abstractC4024M78222.mo7782();
        m7828(iMo7782 != 0 ? getResources().getText(iMo7782) : null);
        EditText editText = this.f11113;
        if (editText != null) {
            abstractC4024M78222.mo7789(editText);
            m7829(abstractC4024M78222);
        }
        AbstractC3889.m7302(textInputLayout, checkableImageButton, this.f11109, this.f11108);
        m7818(true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m7828(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f11122;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            AbstractC3889.m7292(checkableImageButton, charSequence);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m7829(AbstractC4024 abstractC4024) {
        if (this.f11113 == null) {
            return;
        }
        if (abstractC4024.mo7780() != null) {
            this.f11113.setOnFocusChangeListener(abstractC4024.mo7780());
        }
        if (abstractC4024.mo7788() != null) {
            this.f11122.setOnFocusChangeListener(abstractC4024.mo7788());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m7830() {
        this.f11123.setVisibility((this.f11122.getVisibility() != 0 || m7819()) ? 8 : 0);
        setVisibility((m7820() || m7819() || ((this.f11116 == null || this.f11114) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m7831(boolean z) {
        EditText editText;
        if (m7820() != z) {
            CheckableImageButton checkableImageButton = this.f11122;
            if (!z && checkableImageButton.hasFocus() && (editText = this.f11113) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z ? 0 : 8);
            m7830();
            m7824();
            this.f11125.m7762();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m7832(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f11124;
        checkableImageButton.setImageDrawable(drawable);
        m7825();
        AbstractC3889.m7302(this.f11125, checkableImageButton, this.f11118, this.f11117);
    }
}
