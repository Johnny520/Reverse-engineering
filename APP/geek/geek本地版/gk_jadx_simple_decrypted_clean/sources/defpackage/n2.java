package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class n2 extends v80 implements Animatable {
    public final l2 b;
    public final Context c;
    public y0 d;
    public ArrayList e;
    public final k2 f;

    public n2(Context r1, int r2) {
        this.d = null;
        this.e = null;
        this.f = new k2(this);
        this.c = r1;
        this.b = new l2();
    }

    @Override // defpackage.v80, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme r2) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        ch.a(r0, r2);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable r0 = this.a;
        if (r0 != null) goto L5;
        return false;
    L5:
        return ch.b(r0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r3) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        r0.draw(r3);
        return;
    L6:
        l2 r02 = this.b;
        r02.a.draw(r3);
        if (r02.b.isStarted() == false) goto L10;
        invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return bh.a(r0);
    L7:
        return this.b.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable r0 = this.a;
        if (r0 != null) goto L5;
        int r02 = super.getChangingConfigurations();
        this.b.getClass();
        return r02;
    L5:
        return r0.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return ch.c(r0);
    L7:
        return this.b.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.a != null) goto L5;
        return null;
    L5:
        return new m2(this.a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return r0.getIntrinsicHeight();
    L7:
        return this.b.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return r0.getIntrinsicWidth();
    L7:
        return this.b.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return r0.getOpacity();
    L7:
        return this.b.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources r10, XmlPullParser r11, AttributeSet r12, Resources.Theme r13) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        ch.d(r0, r10, r11, r12, r13);
        return;
    L6:
        int r02 = r11.getEventType();
        int r1 = r11.getDepth() + 1;
    L7:
        l2 r3 = this.b;
        if (r02 == 1) goto L39;
        if (r11.getDepth() >= r1) goto L14;
        if (r02 == 3) goto L39;
    L14:
        if (r02 != 2) goto L37;
        String r03 = r11.getName();
        if ("animated-vector".equals(r03) == false) goto L25;
        TypedArray r04 = zt.H(r10, r13, r12, ff.e);
        int r4 = r04.getResourceId(0, 0);
        if (r4 == 0) goto L23;
        e90 r7 = new e90();
        ThreadLocal r8 = c10.a;
        r7.a = x00.a(r10, r4, r13);
        new d90(r7.a.getConstantState());
        r7.f = false;
        r7.setCallback(this.f);
        e90 r42 = r3.a;
        if (r42 == null) goto L22;
        r42.setCallback(null);
    L22:
        r3.a = r7;
    L23:
        r04.recycle();
        goto L37
    L25:
        if ("target".equals(r03) == false) goto L37;
        TypedArray r05 = r10.obtainAttributes(r12, ff.f);
        String r43 = r05.getString(0);
        int r6 = r05.getResourceId(1, 0);
        if (r6 == 0) goto L36;
        Context r72 = this.c;
        if (r72 == null) goto L34;
        Animator r62 = AnimatorInflater.loadAnimator(r72, r6);
        r62.setTarget(r3.a.b.b.o.getOrDefault(r43, null));
        if (r3.c != null) goto L33;
        r3.c = new ArrayList();
        r3.d = new n6();
    L33:
        r3.c.add(r62);
        r3.d.put(r62, r43);
        goto L36
    L34:
        r05.recycle();
        throw new IllegalStateException("Context can't be null when inflating animators");
    L36:
        r05.recycle();
    L37:
        r02 = r11.next();
    L39:
        if (r3.b != null) goto L41;
        r3.b = new AnimatorSet();
    L41:
        r3.b.playTogether(r3.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return bh.d(r0);
    L7:
        return this.b.a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return ((AnimatedVectorDrawable) r0).isRunning();
    L7:
        return this.b.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return r0.isStateful();
    L7:
        return this.b.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable r0 = this.a;
        if (r0 == null) goto L5;
        r0.mutate();
    L5:
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect r2) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        r0.setBounds(r2);
        return;
    L6:
        this.b.a.setBounds(r2);
    }

    @Override // defpackage.v80, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r2) {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return r0.setLevel(r2);
    L7:
        return this.b.a.setLevel(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r2) {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return r0.setState(r2);
    L7:
        return this.b.a.setState(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        r0.setAlpha(r2);
        return;
    L6:
        this.b.a.setAlpha(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean r2) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        bh.e(r0, r2);
        return;
    L6:
        this.b.a.setAutoMirrored(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r2) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        r0.setColorFilter(r2);
        return;
    L6:
        this.b.a.setColorFilter(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r2) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        a80.E(r0, r2);
        return;
    L6:
        this.b.a.setTint(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList r2) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        a80.F(r0, r2);
        return;
    L6:
        this.b.a.setTintList(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode r2) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        a80.G(r0, r2);
        return;
    L6:
        this.b.a.setTintMode(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r2, boolean r3) {
        Drawable r0 = this.a;
        if (r0 != null) goto L5;
        this.b.a.setVisible(r2, r3);
        return super.setVisible(r2, r3);
    L5:
        return r0.setVisible(r2, r3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        ((AnimatedVectorDrawable) r0).start();
        return;
    L6:
        l2 r02 = this.b;
        if (r02.b.isStarted() == false) goto L9;
        return;
    L9:
        r02.b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        ((AnimatedVectorDrawable) r0).stop();
        return;
    L6:
        this.b.b.end();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources r2, XmlPullParser r3, AttributeSet r4) {
        inflate(r2, r3, r4, null);
    }
}
