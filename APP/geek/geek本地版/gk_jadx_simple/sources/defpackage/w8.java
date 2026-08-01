package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
public final class w8 extends Property {
    public Rect a;

    @Override // android.util.Property
    public final Object get(Object r3) {
        ((Drawable) r3).copyBounds(this.a);
        return new PointF(r0.left, r0.top);
    }

    @Override // android.util.Property
    public final void set(Object r3, Object r4) {
        Drawable r32 = (Drawable) r3;
        PointF r42 = (PointF) r4;
        Rect r0 = this.a;
        r32.copyBounds(r0);
        r0.offsetTo(Math.round(r42.x), Math.round(r42.y));
        r32.setBounds(r0);
    }
}
