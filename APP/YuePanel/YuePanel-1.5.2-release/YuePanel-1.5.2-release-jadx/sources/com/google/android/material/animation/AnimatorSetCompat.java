package com.google.android.material.animation;

import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class AnimatorSetCompat {
    public static void playTogether(@InterfaceC6391 AnimatorSet animatorSet, @InterfaceC6391 List<Animator> list) {
        int size = list.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            jMax = Math.max(jMax, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        list.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(list);
    }
}
