package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w8 extends android.util.Property {
    public android.graphics.Rect a;

    @Override // android.util.Property
    public final java.lang.Object get(java.lang.Object r3) {
            r2 = this;
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            android.graphics.Rect r0 = r2.a
            r3.copyBounds(r0)
            android.graphics.PointF r3 = new android.graphics.PointF
            int r1 = r0.left
            float r1 = (float) r1
            int r0 = r0.top
            float r0 = (float) r0
            r3.<init>(r1, r0)
            return r3
    }

    @Override // android.util.Property
    public final void set(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            android.graphics.PointF r4 = (android.graphics.PointF) r4
            android.graphics.Rect r0 = r2.a
            r3.copyBounds(r0)
            float r1 = r4.x
            int r1 = java.lang.Math.round(r1)
            float r4 = r4.y
            int r4 = java.lang.Math.round(r4)
            r0.offsetTo(r1, r4)
            r3.setBounds(r0)
            return
    }
}
