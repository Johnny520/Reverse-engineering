package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class y3 extends ImageButton {
    public final v2 a;
    public final z3 b;
    public boolean c;

    public y3(Context r1, AttributeSet r2, int r3) {
        x60.a(r1);
        super(r1, r2, r3);
        this.c = false;
        r60.a(this, getContext());
        v2 r12 = new v2(this);
        this.a = r12;
        r12.d(r2, r3);
        z3 r13 = new z3(this);
        this.b = r13;
        r13.d(r2, r3);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        v2 r0 = this.a;
        if (r0 == null) goto L5;
        r0.a();
    L5:
        z3 r02 = this.b;
        if (r02 == null) goto L9;
        r02.a();
        return;
    }

    public ColorStateList getSupportBackgroundTintList() {
        v2 r0 = this.a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        v2 r0 = this.a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.c();
    }

    public ColorStateList getSupportImageTintList() {
        z3 r1 = this.b;
        if (r1 == null) goto L8;
        y60 r12 = (y60) r1.c;
        if (r12 != null) goto L7;
        return null;
    L7:
        return r12.a;
    L8:
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        z3 r1 = this.b;
        if (r1 == null) goto L8;
        y60 r12 = (y60) r1.c;
        if (r12 != null) goto L7;
        return null;
    L7:
        return r12.b;
    L8:
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if ((((ImageView) this.b.b).getBackground() instanceof RippleDrawable) == false) goto L5;
        return false;
    L5:
        if (super.hasOverlappingRendering() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        v2 r12 = this.a;
        if (r12 == null) goto L6;
        r12.e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        v2 r0 = this.a;
        if (r0 == null) goto L6;
        r0.f(r2);
        return;
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap r1) {
        super.setImageBitmap(r1);
        z3 r12 = this.b;
        if (r12 == null) goto L6;
        r12.a();
        return;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable r3) {
        z3 r0 = this.b;
        if (r0 == null) goto L8;
        if (r3 == null) goto L8;
        if (this.c == true) goto L8;
        r0.a = r3.getLevel();
    L8:
        super.setImageDrawable(r3);
        if (r0 == null) goto L16;
        r0.a();
        if (this.c == true) goto L17;
        ImageView r32 = (ImageView) r0.b;
        if (r32.getDrawable() == null) goto L18;
        r32.getDrawable().setLevel(r0.a);
        return;
    L18:
        return;
    L17:
        return;
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int r1) {
        super.setImageLevel(r1);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r4) {
        z3 r0 = this.b;
        ImageView r1 = (ImageView) r0.b;
        if (r4 == 0) goto L8;
        Drawable r42 = ff.r(r1.getContext(), r4);
        if (r42 == null) goto L7;
        eh.a(r42);
    L7:
        r1.setImageDrawable(r42);
    L9:
        r0.a();
        return;
    L8:
        r1.setImageDrawable(null);
        goto L9
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri r1) {
        super.setImageURI(r1);
        z3 r12 = this.b;
        if (r12 == null) goto L6;
        r12.a();
        return;
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        v2 r0 = this.a;
        if (r0 == null) goto L6;
        r0.h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        v2 r0 = this.a;
        if (r0 == null) goto L6;
        r0.i(r2);
        return;
    }

    public void setSupportImageTintList(ColorStateList r3) {
        z3 r0 = this.b;
        if (r0 != null) goto L5;
        return;
    L5:
        if (((y60) r0.c) != null) goto L7;
        r0.c = new y60();
    L7:
        y60 r1 = (y60) r0.c;
        r1.a = r3;
        r1.d = true;
        r0.a();
    }

    public void setSupportImageTintMode(PorterDuff.Mode r3) {
        z3 r0 = this.b;
        if (r0 != null) goto L5;
        return;
    L5:
        if (((y60) r0.c) != null) goto L7;
        r0.c = new y60();
    L7:
        y60 r1 = (y60) r0.c;
        r1.b = r3;
        r1.c = true;
        r0.a();
    }
}
