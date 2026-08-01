package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class c90 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public int f929a;

    /* JADX INFO: renamed from: b */
    public b90 f930b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f931c;

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode f932d;

    /* JADX INFO: renamed from: e */
    public boolean f933e;

    /* JADX INFO: renamed from: f */
    public Bitmap f934f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f935g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f936h;

    /* JADX INFO: renamed from: i */
    public int f937i;

    /* JADX INFO: renamed from: j */
    public boolean f938j;

    /* JADX INFO: renamed from: k */
    public boolean f939k;

    /* JADX INFO: renamed from: l */
    public Paint f940l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f929a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e90(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e90(this);
    }
}
