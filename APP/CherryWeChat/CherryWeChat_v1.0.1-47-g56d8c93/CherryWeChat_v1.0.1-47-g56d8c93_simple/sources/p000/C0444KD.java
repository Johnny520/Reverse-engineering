package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: KD */
/* JADX INFO: loaded from: classes.dex */
public final class C0444KD extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public int f1448a;

    /* JADX INFO: renamed from: b */
    public C0401JD f1449b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f1450c;

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode f1451d;

    /* JADX INFO: renamed from: e */
    public boolean f1452e;

    /* JADX INFO: renamed from: f */
    public Bitmap f1453f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f1454g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f1455h;

    /* JADX INFO: renamed from: i */
    public int f1456i;

    /* JADX INFO: renamed from: j */
    public boolean f1457j;

    /* JADX INFO: renamed from: k */
    public boolean f1458k;

    /* JADX INFO: renamed from: l */
    public Paint f1459l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f1448a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0530MD(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources r1) {
        return new C0530MD(this);
    }
}
