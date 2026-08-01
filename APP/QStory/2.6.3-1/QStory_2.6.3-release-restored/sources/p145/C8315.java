package p145;

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
import androidx.appcompat.widget.C1035;
import androidx.collection.C1104;
import java.io.IOException;
import java.util.ArrayList;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p177.AbstractC8471;
import p177.AbstractC8475;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8315 extends AbstractC8326 implements Animatable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Context f20626;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C1035 f20623 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ArrayList f20622 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C8318 f20624 = new C8318(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C8317 f20625 = new C8317();

    public C8315(Context context) {
        this.f20626 = context;
    }

    @Override // p145.AbstractC8326, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C8317 c8317 = this.f20625;
        c8317.f20632.draw(canvas);
        if (c8317.f20631.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f20679;
        return drawable != null ? drawable.getAlpha() : this.f20625.f20632.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f20625.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f20679;
        return drawable != null ? drawable.getColorFilter() : this.f20625.f20632.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f20679 != null) {
            return new C8316(this.f20679.getConstantState(), 0);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f20679;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f20625.f20632.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f20679;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f20625.f20632.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f20679;
        return drawable != null ? drawable.getOpacity() : this.f20625.f20632.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        if (r3.f20631 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
    
        r3.f20631 = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        r3.f20631.playTogether(r3.f20630);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            C8317 c8317 = this.f20625;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM13463 = AbstractC8471.m13463(resources, theme, attributeSet, AbstractC8320.f20636);
                    int resourceId = typedArrayM13463.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C8324 c8324 = new C8324();
                        ThreadLocal threadLocal = AbstractC8475.f21101;
                        c8324.f20679 = resources.getDrawable(resourceId, theme);
                        new C8323(c8324.f20679.getConstantState());
                        c8324.f20675 = false;
                        c8324.setCallback(this.f20624);
                        C8324 c83242 = c8317.f20632;
                        if (c83242 != null) {
                            c83242.setCallback(null);
                        }
                        c8317.f20632 = c8324;
                    }
                    typedArrayM13463.recycle();
                } else if (TypeProxy.INSTANCE_FIELD.equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AbstractC8320.f20635);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f20626;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            C6755.m11870("Context can't be null when inflating animators");
                            return;
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(c8317.f20632.f20677.f20645.f20662.get(string));
                        if (c8317.f20630 == null) {
                            c8317.f20630 = new ArrayList();
                            c8317.f20629 = new C1104(0);
                        }
                        c8317.f20630.add(animatorLoadAnimator);
                        c8317.f20629.put(animatorLoadAnimator, string);
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
        Drawable drawable = this.f20679;
        return drawable != null ? drawable.isAutoMirrored() : this.f20625.f20632.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f20679;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f20625.f20631.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f20679;
        return drawable != null ? drawable.isStateful() : this.f20625.f20632.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f20625.f20632.setBounds(rect);
        }
    }

    @Override // p145.AbstractC8326, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f20679;
        return drawable != null ? drawable.setLevel(i) : this.f20625.f20632.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f20679;
        return drawable != null ? drawable.setState(iArr) : this.f20625.f20632.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f20625.f20632.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f20625.f20632.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f20625.f20632.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.f20625.f20632.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f20625.f20632.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f20625.f20632.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f20625.f20632.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C8317 c8317 = this.f20625;
        if (c8317.f20631.isStarted()) {
            return;
        }
        c8317.f20631.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f20625.f20631.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
