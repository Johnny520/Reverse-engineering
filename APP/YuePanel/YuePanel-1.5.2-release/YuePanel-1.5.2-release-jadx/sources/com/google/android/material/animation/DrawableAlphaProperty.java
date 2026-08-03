package com.google.android.material.animation;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class DrawableAlphaProperty extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> DRAWABLE_ALPHA_COMPAT = new DrawableAlphaProperty();
    private final WeakHashMap<Drawable, Integer> alphaCache;

    private DrawableAlphaProperty() {
        super(Integer.class, "drawableAlphaCompat");
        this.alphaCache = new WeakHashMap<>();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // android.util.Property
    @InterfaceC6490
    public Integer get(@InterfaceC6391 Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
    @Override // android.util.Property
    public void set(@InterfaceC6391 Drawable drawable, @InterfaceC6391 Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
