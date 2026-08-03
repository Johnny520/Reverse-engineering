package p000a;

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
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.C0543dg;
import p000a.C0787qd;
import p000a.C0893w5;

/* JADX INFO: renamed from: a.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0850u0 extends AbstractC0524cg implements Animatable {

    /* JADX INFO: renamed from: b */
    public final b f3328b;

    /* JADX INFO: renamed from: c */
    public final Context f3329c;

    /* JADX INFO: renamed from: d */
    public C0869v0 f3330d;

    /* JADX INFO: renamed from: e */
    public ArrayList<AbstractC0831t0> f3331e;

    /* JADX INFO: renamed from: f */
    public final a f3332f;

    /* JADX INFO: renamed from: a.u0$a */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            C0850u0.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C0850u0.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C0850u0.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: a.u0$b */
    public static class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public C0543dg f3334a;

        /* JADX INFO: renamed from: b */
        public AnimatorSet f3335b;

        /* JADX INFO: renamed from: c */
        public ArrayList<Animator> f3336c;

        /* JADX INFO: renamed from: d */
        public C0166J1<Animator, String> f3337d;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0850u0(Context context) {
        this.f3330d = null;
        this.f3331e = null;
        this.f3332f = new a();
        this.f3329c = context;
        this.f3328b = new b();
    }

    @Override // p000a.AbstractC0524cg, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            C0893w5.a.m2169a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            return C0893w5.a.m2170b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f3328b;
        bVar.f3334a.draw(canvas);
        if (bVar.f3335b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f1914a;
        return drawable != null ? drawable.getAlpha() : this.f3328b.f3334a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f3328b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f1914a;
        return drawable != null ? C0893w5.a.m2171c(drawable) : this.f3328b.f3334a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f1914a != null) {
            return new c(this.f1914a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f1914a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3328b.f3334a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f1914a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3328b.f3334a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f1914a;
        return drawable != null ? drawable.getOpacity() : this.f3328b.f3334a.getOpacity();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        if (r3.f3335b != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        r3.f3335b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        r3.f3335b.playTogether(r3.f3336c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            C0893w5.a.m2172d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            b bVar = this.f3328b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM594c = C0216Lf.m594c(resources, theme, attributeSet, C0774q0.f3061e);
                    int resourceId = typedArrayM594c.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0543dg c0543dg = new C0543dg();
                        ThreadLocal<TypedValue> threadLocal = C0787qd.f3107a;
                        c0543dg.f1914a = C0787qd.a.m1839a(resources, resourceId, theme);
                        new C0543dg.h(c0543dg.f1914a.getConstantState());
                        c0543dg.f1961f = false;
                        c0543dg.setCallback(this.f3332f);
                        C0543dg c0543dg2 = bVar.f3334a;
                        if (c0543dg2 != null) {
                            c0543dg2.setCallback(null);
                        }
                        bVar.f3334a = c0543dg;
                    }
                    typedArrayM594c.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, C0774q0.f3062f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3329c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(bVar.f3334a.f1957b.f2007b.f2005o.getOrDefault(string, null));
                        if (bVar.f3336c == null) {
                            bVar.f3336c = new ArrayList<>();
                            bVar.f3337d = new C0166J1<>();
                        }
                        bVar.f3336c.add(animatorLoadAnimator);
                        bVar.f3337d.put(animatorLoadAnimator, string);
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
        Drawable drawable = this.f1914a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3328b.f3334a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f1914a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3328b.f3335b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f1914a;
        return drawable != null ? drawable.isStateful() : this.f3328b.f3334a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3328b.f3334a.setBounds(rect);
        }
    }

    @Override // p000a.AbstractC0524cg, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f1914a;
        return drawable != null ? drawable.setLevel(i) : this.f3328b.f3334a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1914a;
        return drawable != null ? drawable.setState(iArr) : this.f3328b.f3334a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3328b.f3334a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f3328b.f3334a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3328b.f3334a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            C0893w5.m2168a(drawable, i);
        } else {
            this.f3328b.f3334a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            C0893w5.a.m2176h(drawable, colorStateList);
        } else {
            this.f3328b.f3334a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            C0893w5.a.m2177i(drawable, mode);
        } else {
            this.f3328b.f3334a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f3328b.f3334a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f3328b;
        if (bVar.f3335b.isStarted()) {
            return;
        }
        bVar.f3335b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3328b.f3335b.end();
        }
    }

    /* JADX INFO: renamed from: a.u0$c */
    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Drawable.ConstantState f3338a;

        public c(Drawable.ConstantState constantState) {
            this.f3338a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f3338a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f3338a.getChangingConfigurations();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            C0850u0 c0850u0 = new C0850u0();
            Drawable drawableNewDrawable = this.f3338a.newDrawable();
            c0850u0.f1914a = drawableNewDrawable;
            drawableNewDrawable.setCallback(c0850u0.f3332f);
            return c0850u0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            C0850u0 c0850u0 = new C0850u0();
            Drawable drawableNewDrawable = this.f3338a.newDrawable(resources);
            c0850u0.f1914a = drawableNewDrawable;
            drawableNewDrawable.setCallback(c0850u0.f3332f);
            return c0850u0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0850u0 c0850u0 = new C0850u0();
            Drawable drawableNewDrawable = this.f3338a.newDrawable(resources, theme);
            c0850u0.f1914a = drawableNewDrawable;
            drawableNewDrawable.setCallback(c0850u0.f3332f);
            return c0850u0;
        }
    }

    public C0850u0() {
        this(null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
