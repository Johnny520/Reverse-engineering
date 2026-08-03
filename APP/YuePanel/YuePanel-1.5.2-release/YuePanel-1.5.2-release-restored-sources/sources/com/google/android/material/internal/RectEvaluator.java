package com.google.android.material.internal;

import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class RectEvaluator implements TypeEvaluator<Rect> {
    private final Rect rect;

    public RectEvaluator(@InterfaceC6391 Rect rect) {
        this.rect = rect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f, @InterfaceC6391 Rect rect, @InterfaceC6391 Rect rect2) {
        this.rect.set(rect.left + ((int) ((rect2.left - r0) * f)), rect.top + ((int) ((rect2.top - r1) * f)), rect.right + ((int) ((rect2.right - r2) * f)), rect.bottom + ((int) ((rect2.bottom - r6) * f)));
        return this.rect;
    }
}
