package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;

/* JADX INFO: renamed from: j3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2082j3 {

    /* JADX INFO: renamed from: a */
    public ColorStateList f7338a;

    /* JADX INFO: renamed from: b */
    public PorterDuff.Mode f7339b;

    /* JADX INFO: renamed from: c */
    public boolean f7340c;

    /* JADX INFO: renamed from: d */
    public boolean f7341d;

    /* JADX INFO: renamed from: e */
    public boolean f7342e;

    /* JADX INFO: renamed from: f */
    public final TextView f7343f;

    public /* synthetic */ C2082j3(TextView r2) {
        this.f7338a = null;
        this.f7339b = null;
        this.f7340c = false;
        this.f7341d = false;
        this.f7343f = r2;
    }

    /* JADX INFO: renamed from: a */
    public void m4246a() {
        CompoundButton r0 = (CompoundButton) this.f7343f;
        Drawable r1 = r0.getButtonDrawable();
        if (r1 != null) goto L5;
        return;
    L5:
        if (this.f7340c == false) goto L7;
    L8:
        Drawable r12 = r1.mutate();
        if (this.f7340c == false) goto L12;
        r12.setTintList(this.f7338a);
    L12:
        if (this.f7341d == false) goto L15;
        r12.setTintMode(this.f7339b);
    L15:
        if (r12.isStateful() == false) goto L17;
        r12.setState(r0.getDrawableState());
    L17:
        r0.setButtonDrawable(r12);
        return;
    L7:
        if (this.f7341d == true) goto L8;
    }

    /* JADX INFO: renamed from: b */
    public void m4247b() {
        C1525i3 r0 = (C1525i3) this.f7343f;
        Drawable r1 = r0.getCheckMarkDrawable();
        if (r1 != null) goto L5;
        return;
    L5:
        if (this.f7340c == false) goto L7;
    L8:
        Drawable r12 = r1.mutate();
        if (this.f7340c == false) goto L12;
        r12.setTintList(this.f7338a);
    L12:
        if (this.f7341d == false) goto L15;
        r12.setTintMode(this.f7339b);
    L15:
        if (r12.isStateful() == false) goto L17;
        r12.setState(r0.getDrawableState());
    L17:
        r0.setCheckMarkDrawable(r12);
        return;
    L7:
        if (this.f7341d == true) goto L8;
    }

    /* JADX INFO: renamed from: c */
    public void m4248c(AttributeSet r9, int r10) {
        CompoundButton r1 = (CompoundButton) this.f7343f;
        Context r0 = r1.getContext();
        int[] r3 = AbstractC0982Wu.f3078m;
        C2656w4 r7 = C2656w4.m5186A(r0, r9, r3, r10);
        TypedArray r02 = (TypedArray) r7.f9196b;
        AbstractC2185lE.m4398k(r1, r1.getContext(), r3, r9, (TypedArray) r7.f9196b, r10);
    L9:
        th = move-exception;
        r7.m5195E();
        throw th;
    L4:
        if (r02.hasValue(1) == false) goto L12;
        int r92 = r02.getResourceId(1, 0);     // Catch: Throwable -> L9
        if (r92 == 0) goto L12;
        r1.setButtonDrawable(AbstractC1406fG.m2695U(r1.getContext(), r92));     // Catch: Throwable -> L9 Resources.NotFoundException -> L26
    L17:
        if (r02.hasValue(2) == false) goto L20;
        r1.setButtonTintList(r7.m5209p(2));     // Catch: Throwable -> L9
    L20:
        if (r02.hasValue(3) == false) goto L22;
        r1.setButtonTintMode(AbstractC0107Ce.m161c(r02.getInt(3, -1), null));     // Catch: Throwable -> L9
    L22:
        r7.m5195E();
        return;
    L12:
        if (r02.hasValue(0) == false) goto L17;
        int r93 = r02.getResourceId(0, 0);     // Catch: Throwable -> L9
        if (r93 == 0) goto L17;
        r1.setButtonDrawable(AbstractC1406fG.m2695U(r1.getContext(), r93));     // Catch: Throwable -> L9
        goto L17
    }
}
