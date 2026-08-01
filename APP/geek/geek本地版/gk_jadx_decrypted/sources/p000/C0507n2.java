package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: n2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0507n2 extends v80 implements Animatable {

    /* JADX INFO: renamed from: c */
    public final Context f3307c;

    /* JADX INFO: renamed from: d */
    public C0913y0 f3308d = null;

    /* JADX INFO: renamed from: e */
    public ArrayList f3309e = null;

    /* JADX INFO: renamed from: f */
    public final C0396k2 f3310f = new C0396k2(this);

    /* JADX INFO: renamed from: b */
    public final C0433l2 f3306b = new C0433l2();

    public C0507n2(Context context, int i) {
        this.f3307c = context;
    }

    @Override // p000.v80, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            AbstractC0104ch.m681a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            return AbstractC0104ch.m682b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0433l2 c0433l2 = this.f3306b;
        c0433l2.f2992a.draw(canvas);
        if (c0433l2.f2993b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f4819a;
        return drawable != null ? AbstractC0068bh.m555a(drawable) : this.f3306b.f2992a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f3306b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f4819a;
        return drawable != null ? AbstractC0104ch.m683c(drawable) : this.f3306b.f2992a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f4819a != null) {
            return new C0470m2(this.f4819a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f4819a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3306b.f2992a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f4819a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3306b.f2992a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4819a;
        return drawable != null ? drawable.getOpacity() : this.f3306b.f2992a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        if (r3.f2993b != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        r3.f2993b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        r3.f2993b.playTogether(r3.f2994c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r10, org.xmlpull.v1.XmlPullParser r11, android.util.AttributeSet r12, android.content.res.Resources.Theme r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0507n2.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f4819a;
        return drawable != null ? AbstractC0068bh.m558d(drawable) : this.f3306b.f2992a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f4819a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3306b.f2993b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f4819a;
        return drawable != null ? drawable.isStateful() : this.f3306b.f2992a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3306b.f2992a.setBounds(rect);
        }
    }

    @Override // p000.v80, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f4819a;
        return drawable != null ? drawable.setLevel(i) : this.f3306b.f2992a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4819a;
        return drawable != null ? drawable.setState(iArr) : this.f3306b.f2992a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3306b.f2992a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            AbstractC0068bh.m559e(drawable, z);
        } else {
            this.f3306b.f2992a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3306b.f2992a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            a80.m31E(drawable, i);
        } else {
            this.f3306b.f2992a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            a80.m32F(drawable, colorStateList);
        } else {
            this.f3306b.f2992a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            a80.m33G(drawable, mode);
        } else {
            this.f3306b.f2992a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f3306b.f2992a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0433l2 c0433l2 = this.f3306b;
        if (c0433l2.f2993b.isStarted()) {
            return;
        }
        c0433l2.f2993b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3306b.f2993b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
