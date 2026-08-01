package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.compose.ui.graphics.layer.C1521;
import androidx.core.view.AbstractC2270;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p124.C7412;
import p162.AbstractC7652;
import p199.C7862;
import p199.C7866;
import p199.C7869;
import p253.AbstractC8189;
import p314.AbstractC8669;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends AbstractC3215 implements InterfaceC3212 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final String[] f10800;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public float f10801;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final int f10802;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final int f10803;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final int f10804;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final int f10805;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final int[] f10806;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final float[] f10807;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final Rect f10808;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final RectF f10809;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final C3206 f10810;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final SparseArray f10811;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final Rect f10812;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final ClockHandView f10813;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public InterfaceC3204 f10814;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final ColorStateList f10815;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10812 = new Rect();
        this.f10809 = new RectF();
        this.f10808 = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f10811 = sparseArray;
        this.f10807 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8669.f24433, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        int i = 1;
        ColorStateList colorStateListM13678 = AbstractC8189.m13678(context, typedArrayObtainStyledAttributes, 1);
        this.f10815 = colorStateListM13678;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f10813 = clockHandView;
        this.f10803 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListM13678.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListM13678.getDefaultColor());
        this.f10806 = new int[]{colorForState, colorForState, colorStateListM13678.getDefaultColor()};
        clockHandView.addOnRotateListener(this);
        int defaultColor = AbstractC7652.m12890(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListM136782 = AbstractC8189.m13678(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListM136782 != null ? colorStateListM136782.getDefaultColor() : defaultColor);
        typedArrayObtainStyledAttributes.recycle();
        setOutlineProvider(new C1521(4));
        setFocusable(true);
        setClipToOutline(true);
        this.f10810 = new C3206(i, this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f10800 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.f10800.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.f10800.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.f10800[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i3));
                z = i3 > 1 ? true : z;
                AbstractC2270.m4234(textView, this.f10810);
                textView.setTextColor(this.f10815);
            }
        }
        ClockHandView clockHandView2 = this.f10813;
        if (clockHandView2.f10827 && !z) {
            clockHandView2.f10817 = 1;
        }
        clockHandView2.f10827 = z;
        clockHandView2.invalidate();
        this.f10802 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f10805 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f10804 = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C7412.m12616(1, this.f10800.length, 1).f20104);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int iIntValue;
        int length;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f10811;
            if (i2 >= sparseArray.size()) {
                iIntValue = -1;
                break;
            }
            TextView textView = (TextView) sparseArray.valueAt(i2);
            if (textView.isSelected()) {
                iIntValue = ((Integer) textView.getTag(R.id.material_value_index)).intValue();
                break;
            }
            i2++;
        }
        if (!isShown() || iIntValue == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i != 66) {
            String[] strArr = this.f10800;
            switch (i) {
                case 19:
                case 22:
                    length = (iIntValue + 1) % strArr.length;
                    break;
                case 20:
                case 21:
                    length = ((iIntValue - 1) + strArr.length) % strArr.length;
                    break;
                case 23:
                    break;
                default:
                    return super.onKeyDown(i, keyEvent);
            }
            if (length == iIntValue) {
                return super.onKeyDown(i, keyEvent);
            }
            int i3 = (length / 12) + 1;
            ClockHandView clockHandView = this.f10813;
            if (i3 != clockHandView.f10817) {
                clockHandView.f10817 = i3;
                clockHandView.invalidate();
            }
            clockHandView.m7296((length % 12) * 30.0f);
            m7293();
            return true;
        }
        InterfaceC3204 interfaceC3204 = this.f10814;
        if (interfaceC3204 != null) {
            ((C3214) interfaceC3204).f10842.f10836.isChecked();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m7293();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f10804 / Math.max(Math.max(this.f10802 / displayMetrics.heightPixels, this.f10805 / displayMetrics.widthPixels), 1.0f));
        if (View.MeasureSpec.getMode(i) != 0) {
            iMax = Math.min(iMax, View.MeasureSpec.getSize(i));
        }
        if (View.MeasureSpec.getMode(i2) != 0) {
            iMax = Math.min(iMax, View.MeasureSpec.getSize(i2));
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        ClockHandView clockHandView = this.f10813;
        int i3 = ((iMax / 2) - clockHandView.f10822) - this.f10803;
        int i4 = this.f10844;
        if (i3 != i4 && i3 != i4) {
            this.f10844 = i3;
            mo7294();
            clockHandView.f10818 = this.f10844;
            clockHandView.invalidate();
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public void setOnEnterKeyPressedListener(InterfaceC3204 interfaceC3204) {
        this.f10814 = interfaceC3204;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m7293() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.f10813.f10826;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f10811;
            int size = sparseArray.size();
            rect = this.f10812;
            rectF = this.f10809;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f10808);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f10806, this.f10807, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // com.google.android.material.timepicker.AbstractC3215
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo7294() {
        C7862 c7862 = new C7862();
        c7862.m13193(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iRound = this.f10844;
            if (iIntValue == 2) {
                iRound = Math.round(iRound * 0.66f);
            }
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                Integer numValueOf = Integer.valueOf(id);
                HashMap map2 = c7862.f21535;
                if (!map2.containsKey(numValueOf)) {
                    map2.put(Integer.valueOf(id), new C7869());
                }
                C7866 c7866 = ((C7869) map2.get(Integer.valueOf(id))).f21643;
                c7866.f21568 = R.id.circle_center;
                c7866.f21567 = iRound;
                c7866.f21566 = size;
                size += 360.0f / list.size();
            }
        }
        c7862.m13194(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f10811;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i3)).setVisibility(0);
            i3++;
        }
    }
}
