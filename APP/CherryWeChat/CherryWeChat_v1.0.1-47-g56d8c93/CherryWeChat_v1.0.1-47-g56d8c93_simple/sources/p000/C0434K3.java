package p000;

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

/* JADX INFO: renamed from: K3 */
/* JADX INFO: loaded from: classes.dex */
public class C0434K3 extends ImageButton {

    /* JADX INFO: renamed from: a */
    public final C1349e3 f1424a;

    /* JADX INFO: renamed from: b */
    public final C0477L3 f1425b;

    /* JADX INFO: renamed from: c */
    public boolean f1426c;

    public C0434K3(Context r1, AttributeSet r2, int r3) {
        AbstractC1533iB.m2903a(r1);
        super(r1, r2, r3);
        this.f1426c = false;
        AbstractC1042YA.m1987a(getContext(), this);
        C1349e3 r12 = new C1349e3(this);
        this.f1424a = r12;
        r12.m2603d(r2, r3);
        C0477L3 r13 = new C0477L3(this);
        this.f1425b = r13;
        r13.m936e(r2, r3);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1349e3 r0 = this.f1424a;
        if (r0 == null) goto L5;
        r0.m2600a();
    L5:
        C0477L3 r02 = this.f1425b;
        if (r02 == null) goto L9;
        r02.m933a();
        return;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1349e3 r0 = this.f1424a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.m2601b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1349e3 r0 = this.f1424a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.m2602c();
    }

    public ColorStateList getSupportImageTintList() {
        C0477L3 r1 = this.f1425b;
        if (r1 == null) goto L8;
        C2090jB r12 = (C2090jB) r1.f1576d;
        if (r12 != null) goto L7;
        return null;
    L7:
        return r12.f7358a;
    L8:
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0477L3 r1 = this.f1425b;
        if (r1 == null) goto L8;
        C2090jB r12 = (C2090jB) r1.f1576d;
        if (r12 != null) goto L7;
        return null;
    L7:
        return r12.f7359b;
    L8:
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if ((((ImageView) this.f1425b.f1575c).getBackground() instanceof RippleDrawable) == false) goto L5;
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
        C1349e3 r12 = this.f1424a;
        if (r12 == null) goto L6;
        r12.m2604e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C1349e3 r0 = this.f1424a;
        if (r0 == null) goto L6;
        r0.m2605f(r2);
        return;
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap r1) {
        super.setImageBitmap(r1);
        C0477L3 r12 = this.f1425b;
        if (r12 == null) goto L6;
        r12.m933a();
        return;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable r3) {
        C0477L3 r0 = this.f1425b;
        if (r0 == null) goto L8;
        if (r3 == null) goto L8;
        if (this.f1426c == true) goto L8;
        r0.f1574b = r3.getLevel();
    L8:
        super.setImageDrawable(r3);
        if (r0 == null) goto L16;
        r0.m933a();
        if (this.f1426c == true) goto L17;
        ImageView r32 = (ImageView) r0.f1575c;
        if (r32.getDrawable() == null) goto L18;
        r32.getDrawable().setLevel(r0.f1574b);
        return;
    L18:
        return;
    L17:
        return;
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int r1) {
        super.setImageLevel(r1);
        this.f1426c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r4) {
        C0477L3 r0 = this.f1425b;
        ImageView r1 = (ImageView) r0.f1575c;
        if (r4 == 0) goto L8;
        Drawable r42 = AbstractC1406fG.m2695U(r1.getContext(), r4);
        if (r42 == null) goto L7;
        AbstractC0107Ce.m159a(r42);
    L7:
        r1.setImageDrawable(r42);
    L9:
        r0.m933a();
        return;
    L8:
        r1.setImageDrawable(null);
        goto L9
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri r1) {
        super.setImageURI(r1);
        C0477L3 r12 = this.f1425b;
        if (r12 == null) goto L6;
        r12.m933a();
        return;
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        C1349e3 r0 = this.f1424a;
        if (r0 == null) goto L6;
        r0.m2607h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        C1349e3 r0 = this.f1424a;
        if (r0 == null) goto L6;
        r0.m2608i(r2);
        return;
    }

    public void setSupportImageTintList(ColorStateList r3) {
        C0477L3 r0 = this.f1425b;
        if (r0 != null) goto L5;
        return;
    L5:
        if (((C2090jB) r0.f1576d) != null) goto L7;
        r0.f1576d = new C2090jB();
    L7:
        C2090jB r1 = (C2090jB) r0.f1576d;
        r1.f7358a = r3;
        r1.f7361d = true;
        r0.m933a();
    }

    public void setSupportImageTintMode(PorterDuff.Mode r3) {
        C0477L3 r0 = this.f1425b;
        if (r0 != null) goto L5;
        return;
    L5:
        if (((C2090jB) r0.f1576d) != null) goto L7;
        r0.f1576d = new C2090jB();
    L7:
        C2090jB r1 = (C2090jB) r0.f1576d;
        r1.f7359b = r3;
        r1.f7360c = true;
        r0.m933a();
    }
}
