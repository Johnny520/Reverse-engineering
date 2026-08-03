package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
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
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: M2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0519M2 extends AbstractC0143DD implements Animatable {

    /* JADX INFO: renamed from: c */
    public final Context f1693c;

    /* JADX INFO: renamed from: d */
    public C2437r0 f1694d = null;

    /* JADX INFO: renamed from: e */
    public ArrayList f1695e = null;

    /* JADX INFO: renamed from: f */
    public final C0390J2 f1696f = new C0390J2(this);

    /* JADX INFO: renamed from: b */
    public final C0433K2 f1692b = new C0433K2();

    public C0519M2(Context context, int i) {
        this.f1693c = context;
    }

    @Override // p000.AbstractC0143DD, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0433K2 c0433k2 = this.f1692b;
        c0433k2.f1420a.draw(canvas);
        if (c0433k2.f1421b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f373a;
        return drawable != null ? drawable.getAlpha() : this.f1692b.f1420a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f1692b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f373a;
        return drawable != null ? drawable.getColorFilter() : this.f1692b.f1420a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f373a == null) {
            return null;
        }
        return new C0476L2(0, this.f373a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f373a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f1692b.f1420a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f373a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f1692b.f1420a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f373a;
        return drawable != null ? drawable.getOpacity() : this.f1692b.f1420a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        if (r3.f1421b != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        r3.f1421b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        r3.f1421b.playTogether(r3.f1422c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            C0433K2 c0433k2 = this.f1692b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM1471B = AbstractC0714Qj.m1471B(resources, theme, attributeSet, AbstractC0148Dc.f388e);
                    int resourceId = typedArrayM1471B.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0530MD c0530md = new C0530MD();
                        ThreadLocal threadLocal = AbstractC0125Cw.f295a;
                        c0530md.f373a = resources.getDrawable(resourceId, theme);
                        new C0487LD(c0530md.f373a.getConstantState());
                        c0530md.f1731f = false;
                        c0530md.setCallback(this.f1696f);
                        C0530MD c0530md2 = c0433k2.f1420a;
                        if (c0530md2 != null) {
                            c0530md2.setCallback(null);
                        }
                        c0433k2.f1420a = c0530md;
                    }
                    typedArrayM1471B.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AbstractC0148Dc.f389f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f1693c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(c0433k2.f1420a.f1727b.f1449b.f1364o.get(string));
                        if (c0433k2.f1422c == null) {
                            c0433k2.f1422c = new ArrayList();
                            c0433k2.f1423d = new C0521M4(0);
                        }
                        c0433k2.f1422c.add(animatorLoadAnimator);
                        c0433k2.f1423d.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f373a;
        return drawable != null ? drawable.isAutoMirrored() : this.f1692b.f1420a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f373a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f1692b.f1421b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f373a;
        return drawable != null ? drawable.isStateful() : this.f1692b.f1420a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f1692b.f1420a.setBounds(rect);
        }
    }

    @Override // p000.AbstractC0143DD, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f373a;
        return drawable != null ? drawable.setLevel(i) : this.f1692b.f1420a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f373a;
        return drawable != null ? drawable.setState(iArr) : this.f1692b.f1420a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f1692b.f1420a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f1692b.f1420a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1692b.f1420a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            AbstractC1406fG.m2715o0(drawable, i);
        } else {
            this.f1692b.f1420a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            AbstractC1406fG.m2716p0(drawable, colorStateList);
        } else {
            this.f1692b.f1420a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            AbstractC1406fG.m2717q0(drawable, mode);
        } else {
            this.f1692b.f1420a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f1692b.f1420a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0433K2 c0433k2 = this.f1692b;
        if (c0433k2.f1421b.isStarted()) {
            return;
        }
        c0433k2.f1421b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f1692b.f1421b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
