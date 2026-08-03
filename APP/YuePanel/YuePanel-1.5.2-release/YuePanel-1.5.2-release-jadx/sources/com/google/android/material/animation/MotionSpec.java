package com.google.android.material.animation;

import Yue.C6193;
import Yue.C7467;
import Yue.InterfaceC3258;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7662;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MotionSpec {
    private static final String TAG = "MotionSpec";
    private final C7467<String, MotionTiming> timings = new C7467<>();
    private final C7467<String, PropertyValuesHolder[]> propertyValues = new C7467<>();

    private static void addInfoFromAnimator(@InterfaceC6391 MotionSpec motionSpec, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            motionSpec.setPropertyValues(objectAnimator.getPropertyName(), objectAnimator.getValues());
            motionSpec.setTiming(objectAnimator.getPropertyName(), MotionTiming.createFromAnimator(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    @InterfaceC6391
    private PropertyValuesHolder[] clonePropertyValuesHolder(@InterfaceC6391 PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    @InterfaceC6490
    public static MotionSpec createFromAttribute(@InterfaceC6391 Context context, @InterfaceC6391 TypedArray typedArray, @InterfaceC7662 int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return createFromResource(context, resourceId);
    }

    @InterfaceC6490
    public static MotionSpec createFromResource(@InterfaceC6391 Context context, @InterfaceC3258 int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return createSpecFromAnimators(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return createSpecFromAnimators(arrayList);
        } catch (Exception e) {
            Log.w(TAG, "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    @InterfaceC6391
    private static MotionSpec createSpecFromAnimators(@InterfaceC6391 List<Animator> list) {
        MotionSpec motionSpec = new MotionSpec();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            addInfoFromAnimator(motionSpec, list.get(i));
        }
        return motionSpec;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MotionSpec) {
            return this.timings.equals(((MotionSpec) obj).timings);
        }
        return false;
    }

    @InterfaceC6391
    public <T> ObjectAnimator getAnimator(@InterfaceC6391 String str, @InterfaceC6391 T t, @InterfaceC6391 Property<T, ?> property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, getPropertyValues(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        getTiming(str).apply(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    @InterfaceC6391
    public PropertyValuesHolder[] getPropertyValues(String str) {
        if (hasPropertyValues(str)) {
            return clonePropertyValuesHolder(this.propertyValues.get(str));
        }
        throw new IllegalArgumentException();
    }

    public MotionTiming getTiming(String str) {
        if (hasTiming(str)) {
            return this.timings.get(str);
        }
        throw new IllegalArgumentException();
    }

    public long getTotalDuration() {
        int size = this.timings.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            MotionTiming motionTimingValueAt = this.timings.valueAt(i);
            jMax = Math.max(jMax, motionTimingValueAt.getDelay() + motionTimingValueAt.getDuration());
        }
        return jMax;
    }

    public boolean hasPropertyValues(String str) {
        return this.propertyValues.get(str) != null;
    }

    public boolean hasTiming(String str) {
        return this.timings.get(str) != null;
    }

    public int hashCode() {
        return this.timings.hashCode();
    }

    public void setPropertyValues(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.propertyValues.put(str, propertyValuesHolderArr);
    }

    public void setTiming(String str, @InterfaceC6490 MotionTiming motionTiming) {
        this.timings.put(str, motionTiming);
    }

    @InterfaceC6391
    public String toString() {
        return '\n' + getClass().getName() + C6193.f1884 + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.timings + "}\n";
    }
}
