package com.google.android.material.timepicker;

import android.R;
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
import androidx.compose.p001ui.graphics.layer.C2356;
import androidx.core.view.AbstractC3103;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p140.C8242;
import p178.AbstractC8482;
import p191.AbstractC8568;
import p215.C8692;
import p215.C8696;
import p215.C8699;
import p330.AbstractC9490;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends AbstractC4048 implements InterfaceC4045 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final String[] f11150;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public float f11151;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final int f11152;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final int f11153;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final int f11154;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final int f11155;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final int[] f11156;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final float[] f11157;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final Rect f11158;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final RectF f11159;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final C4039 f11160;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final SparseArray f11161;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final Rect f11162;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final ClockHandView f11163;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public InterfaceC4037 f11164;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final ColorStateList f11165;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11162 = new Rect();
        this.f11159 = new RectF();
        this.f11158 = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f11161 = sparseArray;
        this.f11157 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC9490.f24769, C0328R.attr.materialClockStyle, C0328R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        int i = 1;
        ColorStateList colorStateListM13632 = AbstractC8568.m13632(context, typedArrayObtainStyledAttributes, 1);
        this.f11165 = colorStateListM13632;
        LayoutInflater.from(context).inflate(C0328R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C0328R.id.material_clock_hand);
        this.f11163 = clockHandView;
        this.f11153 = resources.getDimensionPixelSize(C0328R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListM13632.getColorForState(new int[]{R.attr.state_selected}, colorStateListM13632.getDefaultColor());
        this.f11156 = new int[]{colorForState, colorForState, colorStateListM13632.getDefaultColor()};
        clockHandView.addOnRotateListener(this);
        int defaultColor = AbstractC8482.m13478(context, C0328R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListM136322 = AbstractC8568.m13632(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListM136322 != null ? colorStateListM136322.getDefaultColor() : defaultColor);
        typedArrayObtainStyledAttributes.recycle();
        setOutlineProvider(new C2356(4));
        setFocusable(true);
        setClipToOutline(true);
        this.f11160 = new C4039(i, this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f11150 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.f11150.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.f11150.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(C0328R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.f11150[i2]);
                textView.setTag(C0328R.id.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(C0328R.id.material_clock_level, Integer.valueOf(i3));
                z = i3 > 1 ? true : z;
                AbstractC3103.m4804(textView, this.f11160);
                textView.setTextColor(this.f11165);
            }
        }
        ClockHandView clockHandView2 = this.f11163;
        if (clockHandView2.f11177 && !z) {
            clockHandView2.f11167 = 1;
        }
        clockHandView2.f11177 = z;
        clockHandView2.invalidate();
        this.f11152 = resources.getDimensionPixelSize(C0328R.dimen.material_time_picker_minimum_screen_height);
        this.f11155 = resources.getDimensionPixelSize(C0328R.dimen.material_time_picker_minimum_screen_width);
        this.f11154 = resources.getDimensionPixelSize(C0328R.dimen.material_clock_size);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C8242.m13202(1, this.f11150.length, 1).f20444);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int iIntValue;
        int length;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f11161;
            if (i2 >= sparseArray.size()) {
                iIntValue = -1;
                break;
            }
            TextView textView = (TextView) sparseArray.valueAt(i2);
            if (textView.isSelected()) {
                iIntValue = ((Integer) textView.getTag(C0328R.id.material_value_index)).intValue();
                break;
            }
            i2++;
        }
        if (!isShown() || iIntValue == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i != 66) {
            String[] strArr = this.f11150;
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
            ClockHandView clockHandView = this.f11163;
            if (i3 != clockHandView.f11167) {
                clockHandView.f11167 = i3;
                clockHandView.invalidate();
            }
            clockHandView.m7842((length % 12) * 30.0f);
            m7839();
            return true;
        }
        InterfaceC4037 interfaceC4037 = this.f11164;
        if (interfaceC4037 != null) {
            ((C4047) interfaceC4037).f11192.f11186.isChecked();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m7839();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f11154 / Math.max(Math.max(this.f11152 / displayMetrics.heightPixels, this.f11155 / displayMetrics.widthPixels), 1.0f));
        if (View.MeasureSpec.getMode(i) != 0) {
            iMax = Math.min(iMax, View.MeasureSpec.getSize(i));
        }
        if (View.MeasureSpec.getMode(i2) != 0) {
            iMax = Math.min(iMax, View.MeasureSpec.getSize(i2));
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        ClockHandView clockHandView = this.f11163;
        int i3 = ((iMax / 2) - clockHandView.f11172) - this.f11153;
        int i4 = this.f11194;
        if (i3 != i4 && i3 != i4) {
            this.f11194 = i3;
            mo7840();
            clockHandView.f11168 = this.f11194;
            clockHandView.invalidate();
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public void setOnEnterKeyPressedListener(InterfaceC4037 interfaceC4037) {
        this.f11164 = interfaceC4037;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m7839() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.f11163.f11176;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f11161;
            int size = sparseArray.size();
            rect = this.f11162;
            rectF = this.f11159;
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
                textView3.getLineBounds(0, this.f11158);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f11156, this.f11157, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // com.google.android.material.timepicker.AbstractC4048
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo7840() {
        C8692 c8692 = new C8692();
        c8692.m13780(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != C0328R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(C0328R.id.material_clock_level);
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
            int iRound = this.f11194;
            if (iIntValue == 2) {
                iRound = Math.round(iRound * 0.66f);
            }
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                Integer numValueOf = Integer.valueOf(id);
                HashMap map2 = c8692.f21877;
                if (!map2.containsKey(numValueOf)) {
                    map2.put(Integer.valueOf(id), new C8699());
                }
                C8696 c8696 = ((C8699) map2.get(Integer.valueOf(id))).f21985;
                c8696.f21910 = C0328R.id.circle_center;
                c8696.f21909 = iRound;
                c8696.f21908 = size;
                size += 360.0f / list.size();
            }
        }
        c8692.m13781(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f11161;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i3)).setVisibility(0);
            i3++;
        }
    }
}
