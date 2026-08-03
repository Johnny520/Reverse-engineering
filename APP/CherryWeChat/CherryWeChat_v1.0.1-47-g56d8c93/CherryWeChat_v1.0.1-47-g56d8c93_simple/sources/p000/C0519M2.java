package p000;

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

/* JADX INFO: renamed from: M2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0519M2 extends AbstractC0143DD implements Animatable {

    /* JADX INFO: renamed from: b */
    public final C0433K2 f1692b;

    /* JADX INFO: renamed from: c */
    public final Context f1693c;

    /* JADX INFO: renamed from: d */
    public C2437r0 f1694d;

    /* JADX INFO: renamed from: e */
    public ArrayList f1695e;

    /* JADX INFO: renamed from: f */
    public final C0390J2 f1696f;

    public C0519M2(Context r1, int r2) {
        this.f1694d = null;
        this.f1695e = null;
        this.f1696f = new C0390J2(this);
        this.f1693c = r1;
        this.f1692b = new C0433K2();
    }

    @Override // p000.AbstractC0143DD, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme r2) {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L6;
        r0.applyTheme(r2);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable r0 = this.f373a;
        if (r0 != null) goto L5;
        return false;
    L5:
        return r0.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r3) {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L6;
        r0.draw(r3);
        return;
    L6:
        C0433K2 r02 = this.f1692b;
        r02.f1420a.draw(r3);
        if (r02.f1421b.isStarted() == false) goto L10;
        invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L7;
        return r0.getAlpha();
    L7:
        return this.f1692b.f1420a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable r0 = this.f373a;
        if (r0 != null) goto L5;
        int r02 = super.getChangingConfigurations();
        this.f1692b.getClass();
        return r02;
    L5:
        return r0.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L7;
        return r0.getColorFilter();
    L7:
        return this.f1692b.f1420a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f373a == null) goto L6;
        int r2 = 0;
        return new C0476L2(r2, this.f373a.getConstantState());
    L6:
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L7;
        return r0.getIntrinsicHeight();
    L7:
        return this.f1692b.f1420a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L7;
        return r0.getIntrinsicWidth();
    L7:
        return this.f1692b.f1420a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L7;
        return r0.getOpacity();
    L7:
        return this.f1692b.f1420a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources r9, XmlPullParser r10, AttributeSet r11, Resources.Theme r12) {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L6;
        r0.inflate(r9, r10, r11, r12);
        return;
    L6:
        int r02 = r10.getEventType();
        int r1 = r10.getDepth() + 1;
    L7:
        C0433K2 r3 = this.f1692b;
        if (r02 == 1) goto L39;
        if (r10.getDepth() >= r1) goto L14;
        if (r02 == 3) goto L39;
    L14:
        if (r02 != 2) goto L37;
        String r03 = r10.getName();
        if ("animated-vector".equals(r03) == false) goto L25;
        TypedArray r04 = AbstractC0714Qj.m1471B(r9, r12, r11, AbstractC0148Dc.f388e);
        int r4 = r04.getResourceId(0, 0);
        if (r4 == 0) goto L23;
        C0530MD r6 = new C0530MD();
        ThreadLocal r7 = AbstractC0125Cw.f295a;
        r6.f373a = r9.getDrawable(r4, r12);
        new C0487LD(r6.f373a.getConstantState());
        r6.f1731f = false;
        r6.setCallback(this.f1696f);
        C0530MD r42 = r3.f1420a;
        if (r42 == null) goto L22;
        r42.setCallback(null);
    L22:
        r3.f1420a = r6;
    L23:
        r04.recycle();
        goto L37
    L25:
        if ("target".equals(r03) == false) goto L37;
        TypedArray r05 = r9.obtainAttributes(r11, AbstractC0148Dc.f389f);
        String r43 = r05.getString(0);
        int r62 = r05.getResourceId(1, 0);
        if (r62 == 0) goto L36;
        Context r72 = this.f1693c;
        if (r72 == null) goto L34;
        Animator r63 = AnimatorInflater.loadAnimator(r72, r62);
        r63.setTarget(r3.f1420a.f1727b.f1449b.f1364o.get(r43));
        if (r3.f1422c != null) goto L33;
        r3.f1422c = new ArrayList();
        r3.f1423d = new C0521M4(0);
    L33:
        r3.f1422c.add(r63);
        r3.f1423d.put(r63, r43);
        goto L36
    L34:
        r05.recycle();
        throw new IllegalStateException("Context can't be null when inflating animators");
    L36:
        r05.recycle();
    L37:
        r02 = r10.next();
    L39:
        if (r3.f1421b != null) goto L41;
        r3.f1421b = new AnimatorSet();
    L41:
        r3.f1421b.playTogether(r3.f1422c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L7;
        return r0.isAutoMirrored();
    L7:
        return this.f1692b.f1420a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L7;
        return ((AnimatedVectorDrawable) r0).isRunning();
    L7:
        return this.f1692b.f1421b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L7;
        return r0.isStateful();
    L7:
        return this.f1692b.f1420a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L5;
        r0.mutate();
    L5:
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect r2) {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L6;
        r0.setBounds(r2);
        return;
    L6:
        this.f1692b.f1420a.setBounds(r2);
    }

    @Override // p000.AbstractC0143DD, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r2) {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L7;
        return r0.setLevel(r2);
    L7:
        return this.f1692b.f1420a.setLevel(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r2) {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L7;
        return r0.setState(r2);
    L7:
        return this.f1692b.f1420a.setState(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L6;
        r0.setAlpha(r2);
        return;
    L6:
        this.f1692b.f1420a.setAlpha(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean r2) {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L6;
        r0.setAutoMirrored(r2);
        return;
    L6:
        this.f1692b.f1420a.setAutoMirrored(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r2) {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L6;
        r0.setColorFilter(r2);
        return;
    L6:
        this.f1692b.f1420a.setColorFilter(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r2) {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L6;
        AbstractC1406fG.m2715o0(r0, r2);
        return;
    L6:
        this.f1692b.f1420a.setTint(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList r2) {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L6;
        AbstractC1406fG.m2716p0(r0, r2);
        return;
    L6:
        this.f1692b.f1420a.setTintList(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode r2) {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L6;
        AbstractC1406fG.m2717q0(r0, r2);
        return;
    L6:
        this.f1692b.f1420a.setTintMode(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r2, boolean r3) {
        Drawable r0 = this.f373a;
        if (r0 != null) goto L5;
        this.f1692b.f1420a.setVisible(r2, r3);
        return super.setVisible(r2, r3);
    L5:
        return r0.setVisible(r2, r3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L6;
        ((AnimatedVectorDrawable) r0).start();
        return;
    L6:
        C0433K2 r02 = this.f1692b;
        if (r02.f1421b.isStarted() == false) goto L9;
        return;
    L9:
        r02.f1421b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L6;
        ((AnimatedVectorDrawable) r0).stop();
        return;
    L6:
        this.f1692b.f1421b.end();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources r2, XmlPullParser r3, AttributeSet r4) {
        inflate(r2, r3, r4, null);
    }
}
