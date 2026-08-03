package Yue;

import Yue.InterfaceC3219;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3235 extends AbstractC8161 implements InterfaceC3219 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final String f4967 = "AnimatedVDCompat";

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final String f4968 = "animated-vector";

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final String f4969 = "target";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final boolean f4970 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public C3236 f4971;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Context f4972;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public ArgbEvaluator f4973;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public C3237 f4974;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public Animator.AnimatorListener f4975;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public ArrayList<InterfaceC3219.AbstractC0084> f4976;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final Drawable.Callback f4977;

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۦ$ۥ */
    public class C0088 implements Drawable.Callback {
        public C0088() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C3235.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C3235.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C3235.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۦ$ۥ۟ */
    public class C0089 extends AnimatorListenerAdapter {
        public C0089() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(C3235.this.f4976);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC3219.AbstractC0084) arrayList.get(i)).onAnimationEnd(C3235.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(C3235.this.f4976);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC3219.AbstractC0084) arrayList.get(i)).onAnimationStart(C3235.this);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۦ$ۥ۟۟, reason: contains not printable characters */
    public static class C3236 extends Drawable.ConstantState {

        /* JADX INFO: renamed from: ۥ */
        public int f151;

        /* JADX INFO: renamed from: ۥ۟ */
        public C8162 f152;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public AnimatorSet f4979;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public ArrayList<Animator> f4980;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public C3394<Animator, String> f4981;

        public C3236(Context context, C3236 c3236, Drawable.Callback callback, Resources resources) {
            if (c3236 != null) {
                this.f151 = c3236.f151;
                C8162 c8162 = c3236.f152;
                if (c8162 != null) {
                    Drawable.ConstantState constantState = c8162.getConstantState();
                    if (resources != null) {
                        this.f152 = (C8162) constantState.newDrawable(resources);
                    } else {
                        this.f152 = (C8162) constantState.newDrawable();
                    }
                    C8162 c81622 = (C8162) this.f152.mutate();
                    this.f152 = c81622;
                    c81622.setCallback(callback);
                    this.f152.setBounds(c3236.f152.getBounds());
                    this.f152.m26921(false);
                }
                ArrayList<Animator> arrayList = c3236.f4980;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f4980 = new ArrayList<>(size);
                    this.f4981 = new C3394<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = c3236.f4980.get(i);
                        Animator animatorClone = animator.clone();
                        String str = c3236.f4981.get(animator);
                        animatorClone.setTarget(this.f152.m26917(str));
                        this.f4980.add(animatorClone);
                        this.f4981.put(animatorClone, str);
                    }
                    m316();
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f151;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        /* JADX INFO: renamed from: ۥ */
        public void m316() {
            if (this.f4979 == null) {
                this.f4979 = new AnimatorSet();
            }
            this.f4979.playTogether(this.f4980);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3235() {
        this(null, null, null);
    }

    /* JADX INFO: renamed from: ۥ */
    public static void m314(Drawable drawable) {
        if (drawable instanceof Animatable) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public static C3235 m315(@InterfaceC6391 Context context, @InterfaceC4525 int i) {
        C3235 c3235 = new C3235(context);
        Drawable drawableM22275 = C7130.m22275(context.getResources(), i, context.getTheme());
        c3235.f24186 = drawableM22275;
        drawableM22275.setCallback(c3235.f4977);
        c3235.f4974 = new C3237(c3235.f24186.getConstantState());
        return c3235;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C3235 m6612(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C3235 c3235 = new C3235(context);
        c3235.inflate(resources, xmlPullParser, attributeSet, theme);
        return c3235;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m6613(Drawable drawable, InterfaceC3219.AbstractC0084 abstractC0084) {
        if (drawable == null || abstractC0084 == null || !(drawable instanceof Animatable)) {
            return;
        }
        m6614((AnimatedVectorDrawable) drawable, abstractC0084);
    }

    @InterfaceC7113(23)
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m6614(@InterfaceC6391 AnimatedVectorDrawable animatedVectorDrawable, @InterfaceC6391 InterfaceC3219.AbstractC0084 abstractC0084) {
        animatedVectorDrawable.registerAnimationCallback(abstractC0084.getPlatformCallback());
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m6615(Drawable drawable, InterfaceC3219.AbstractC0084 abstractC0084) {
        if (drawable == null || abstractC0084 == null || !(drawable instanceof Animatable)) {
            return false;
        }
        return m6616((AnimatedVectorDrawable) drawable, abstractC0084);
    }

    @InterfaceC7113(23)
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m6616(AnimatedVectorDrawable animatedVectorDrawable, InterfaceC3219.AbstractC0084 abstractC0084) {
        return animatedVectorDrawable.unregisterAnimationCallback(abstractC0084.getPlatformCallback());
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            C4520.m1446(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            return C4520.m1447(drawable);
        }
        return false;
    }

    @Override // Yue.InterfaceC3219
    public void clearAnimationCallbacks() {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        m6617();
        ArrayList<InterfaceC3219.AbstractC0084> arrayList = this.f4976;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f4971.f152.draw(canvas);
        if (this.f4971.f4979.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f24186;
        return drawable != null ? C4520.m13225(drawable) : this.f4971.f152.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f24186;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f4971.f151;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f24186;
        return drawable != null ? C4520.m13226(drawable) : this.f4971.f152.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f24186 != null) {
            return new C3237(this.f24186.getConstantState());
        }
        return null;
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f24186;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f4971.f152.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f24186;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f4971.f152.getIntrinsicWidth();
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f24186;
        return drawable != null ? drawable.getOpacity() : this.f4971.f152.getOpacity();
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            C4520.m13228(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (f4968.equals(name)) {
                    TypedArray typedArrayM25330 = C8021.m25330(resources, theme, attributeSet, C3213.f4904);
                    int resourceId = typedArrayM25330.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C8162 c8162M4189 = C8162.m4189(resources, resourceId, theme);
                        c8162M4189.m26921(false);
                        c8162M4189.setCallback(this.f4977);
                        C8162 c8162 = this.f4971.f152;
                        if (c8162 != null) {
                            c8162.setCallback(null);
                        }
                        this.f4971.f152 = c8162M4189;
                    }
                    typedArrayM25330.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, C3213.f4906);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f4972;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        m6618(string, C3246.m6637(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f4971.m316();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f24186;
        return drawable != null ? C4520.m13229(drawable) : this.f4971.f152.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f24186;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f4971.f4979.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f24186;
        return drawable != null ? drawable.isStateful() : this.f4971.f152.isStateful();
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4971.f152.setBounds(rect);
        }
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f24186;
        return drawable != null ? drawable.setLevel(i) : this.f4971.f152.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f24186;
        return drawable != null ? drawable.setState(iArr) : this.f4971.f152.setState(iArr);
    }

    @Override // Yue.InterfaceC3219
    public void registerAnimationCallback(@InterfaceC6391 InterfaceC3219.AbstractC0084 abstractC0084) {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            m6614((AnimatedVectorDrawable) drawable, abstractC0084);
            return;
        }
        if (abstractC0084 == null) {
            return;
        }
        if (this.f4976 == null) {
            this.f4976 = new ArrayList<>();
        }
        if (this.f4976.contains(abstractC0084)) {
            return;
        }
        this.f4976.add(abstractC0084);
        if (this.f4975 == null) {
            this.f4975 = new C0089();
        }
        this.f4971.f4979.addListener(this.f4975);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f4971.f152.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            C4520.m13231(drawable, z);
        } else {
            this.f4971.f152.setAutoMirrored(z);
        }
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC7833
    public void setTint(int i) {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            C4520.m13235(drawable, i);
        } else {
            this.f4971.f152.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC7833
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            C4520.m13236(drawable, colorStateList);
        } else {
            this.f4971.f152.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC7833
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            C4520.m13237(drawable, mode);
        } else {
            this.f4971.f152.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f4971.f152.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f4971.f4979.isStarted()) {
                return;
            }
            this.f4971.f4979.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4971.f4979.end();
        }
    }

    @Override // Yue.InterfaceC3219
    public boolean unregisterAnimationCallback(@InterfaceC6391 InterfaceC3219.AbstractC0084 abstractC0084) {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            m6616((AnimatedVectorDrawable) drawable, abstractC0084);
        }
        ArrayList<InterfaceC3219.AbstractC0084> arrayList = this.f4976;
        if (arrayList == null || abstractC0084 == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(abstractC0084);
        if (this.f4976.size() == 0) {
            m6617();
        }
        return zRemove;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m6617() {
        Animator.AnimatorListener animatorListener = this.f4975;
        if (animatorListener != null) {
            this.f4971.f4979.removeListener(animatorListener);
            this.f4975 = null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m6618(String str, Animator animator) {
        animator.setTarget(this.f4971.f152.m26917(str));
        C3236 c3236 = this.f4971;
        if (c3236.f4980 == null) {
            c3236.f4980 = new ArrayList<>();
            this.f4971.f4981 = new C3394<>();
        }
        this.f4971.f4980.add(animator);
        this.f4971.f4981.put(animator, str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m6619(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m6619(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f4973 == null) {
                    this.f4973 = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f4973);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3235(@InterfaceC6490 Context context) {
        this(context, null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4971.f152.setColorFilter(colorFilter);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۦ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(24)
    public static class C3237 extends Drawable.ConstantState {

        /* JADX INFO: renamed from: ۥ */
        public final Drawable.ConstantState f153;

        public C3237(Drawable.ConstantState constantState) {
            this.f153 = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f153.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f153.getChangingConfigurations();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C3235 c3235 = new C3235();
            Drawable drawableNewDrawable = this.f153.newDrawable();
            c3235.f24186 = drawableNewDrawable;
            drawableNewDrawable.setCallback(c3235.f4977);
            return c3235;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C3235 c3235 = new C3235();
            Drawable drawableNewDrawable = this.f153.newDrawable(resources);
            c3235.f24186 = drawableNewDrawable;
            drawableNewDrawable.setCallback(c3235.f4977);
            return c3235;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C3235 c3235 = new C3235();
            Drawable drawableNewDrawable = this.f153.newDrawable(resources, theme);
            c3235.f24186 = drawableNewDrawable;
            drawableNewDrawable.setCallback(c3235.f4977);
            return c3235;
        }
    }

    public C3235(@InterfaceC6490 Context context, @InterfaceC6490 C3236 c3236, @InterfaceC6490 Resources resources) {
        this.f4973 = null;
        this.f4975 = null;
        this.f4976 = null;
        C0088 c0088 = new C0088();
        this.f4977 = c0088;
        this.f4972 = context;
        if (c3236 != null) {
            this.f4971 = c3236;
        } else {
            this.f4971 = new C3236(context, c3236, c0088, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
