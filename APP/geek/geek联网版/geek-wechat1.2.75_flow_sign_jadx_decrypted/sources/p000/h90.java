package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class h90 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public int f2143a;

    /* JADX INFO: renamed from: b */
    public g90 f2144b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f2145c;

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode f2146d;

    /* JADX INFO: renamed from: e */
    public boolean f2147e;

    /* JADX INFO: renamed from: f */
    public Bitmap f2148f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f2149g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f2150h;

    /* JADX INFO: renamed from: i */
    public int f2151i;

    /* JADX INFO: renamed from: j */
    public boolean f2152j;

    /* JADX INFO: renamed from: k */
    public boolean f2153k;

    /* JADX INFO: renamed from: l */
    public Paint f2154l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f2143a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new j90(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new j90(this);
    }
}
