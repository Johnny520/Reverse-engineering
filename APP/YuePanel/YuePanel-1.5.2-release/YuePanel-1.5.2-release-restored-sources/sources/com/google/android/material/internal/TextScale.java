package com.google.android.material.internal;

import Yue.AbstractC7956;
import Yue.C7995;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class TextScale extends AbstractC7956 {
    private static final String PROPNAME_SCALE = "android:textscale:scale";

    private void captureValues(@InterfaceC6391 C7995 c7995) {
        View view = c7995.f3178;
        if (view instanceof TextView) {
            c7995.f3177.put(PROPNAME_SCALE, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // Yue.AbstractC7956
    public void captureEndValues(@InterfaceC6391 C7995 c7995) {
        captureValues(c7995);
    }

    @Override // Yue.AbstractC7956
    public void captureStartValues(@InterfaceC6391 C7995 c7995) {
        captureValues(c7995);
    }

    @Override // Yue.AbstractC7956
    public Animator createAnimator(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6490 C7995 c7995, @InterfaceC6490 C7995 c79952) {
        if (c7995 == null || c79952 == null || !(c7995.f3178 instanceof TextView)) {
            return null;
        }
        View view = c79952.f3178;
        if (!(view instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) view;
        Map<String, Object> map = c7995.f3177;
        Map<String, Object> map2 = c79952.f3177;
        float fFloatValue = map.get(PROPNAME_SCALE) != null ? ((Float) map.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        float fFloatValue2 = map2.get(PROPNAME_SCALE) != null ? ((Float) map2.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.internal.TextScale.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@InterfaceC6391 ValueAnimator valueAnimator) {
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(fFloatValue3);
                textView.setScaleY(fFloatValue3);
            }
        });
        return valueAnimatorOfFloat;
    }
}
