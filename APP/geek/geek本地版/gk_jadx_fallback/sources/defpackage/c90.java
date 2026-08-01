package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c90 extends android.graphics.drawable.Drawable.ConstantState {
    public int a;
    public defpackage.b90 b;
    public android.content.res.ColorStateList c;
    public android.graphics.PorterDuff.Mode d;
    public boolean e;
    public android.graphics.Bitmap f;
    public android.content.res.ColorStateList g;
    public android.graphics.PorterDuff.Mode h;
    public int i;
    public boolean j;
    public boolean k;
    public android.graphics.Paint l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
            r1 = this;
            e90 r0 = new e90
            r0.<init>(r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r1) {
            r0 = this;
            e90 r1 = new e90
            r1.<init>(r0)
            return r1
    }
}
