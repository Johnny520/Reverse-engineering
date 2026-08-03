package com.google.android.material.animation;

import Yue.InterfaceC6391;
import android.util.Property;
import android.view.ViewGroup;
import com.google.android.material.C1980R;

/* JADX INFO: loaded from: classes.dex */
public class ChildrenAlphaProperty extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> CHILDREN_ALPHA = new ChildrenAlphaProperty("childrenAlpha");

    private ChildrenAlphaProperty(String str) {
        super(Float.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // android.util.Property
    @InterfaceC6391
    public Float get(@InterfaceC6391 ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(C1980R.id.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
    @Override // android.util.Property
    public void set(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 Float f) {
        float fFloatValue = f.floatValue();
        viewGroup.setTag(C1980R.id.mtrl_internal_children_alpha_tag, f);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(fFloatValue);
        }
    }
}
