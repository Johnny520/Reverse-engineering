package com.google.android.material.circularreveal;

import Yue.InterfaceC3897;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.math.MathUtils;

/* JADX INFO: loaded from: classes.dex */
public interface CircularRevealWidget extends CircularRevealHelper.Delegate {

    public static class CircularRevealEvaluator implements TypeEvaluator<RevealInfo> {
        public static final TypeEvaluator<RevealInfo> CIRCULAR_REVEAL = new CircularRevealEvaluator();
        private final RevealInfo revealInfo = new RevealInfo();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.animation.TypeEvaluator
        @InterfaceC6391
        public RevealInfo evaluate(float f, @InterfaceC6391 RevealInfo revealInfo, @InterfaceC6391 RevealInfo revealInfo2) {
            this.revealInfo.set(MathUtils.lerp(revealInfo.centerX, revealInfo2.centerX, f), MathUtils.lerp(revealInfo.centerY, revealInfo2.centerY, f), MathUtils.lerp(revealInfo.radius, revealInfo2.radius, f));
            return this.revealInfo;
        }
    }

    public static class CircularRevealProperty extends Property<CircularRevealWidget, RevealInfo> {
        public static final Property<CircularRevealWidget, RevealInfo> CIRCULAR_REVEAL = new CircularRevealProperty("circularReveal");

        private CircularRevealProperty(String str) {
            super(RevealInfo.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        @InterfaceC6490
        public RevealInfo get(@InterfaceC6391 CircularRevealWidget circularRevealWidget) {
            return circularRevealWidget.getRevealInfo();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        public void set(@InterfaceC6391 CircularRevealWidget circularRevealWidget, @InterfaceC6490 RevealInfo revealInfo) {
            circularRevealWidget.setRevealInfo(revealInfo);
        }
    }

    public static class CircularRevealScrimColorProperty extends Property<CircularRevealWidget, Integer> {
        public static final Property<CircularRevealWidget, Integer> CIRCULAR_REVEAL_SCRIM_COLOR = new CircularRevealScrimColorProperty("circularRevealScrimColor");

        private CircularRevealScrimColorProperty(String str) {
            super(Integer.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        @InterfaceC6391
        public Integer get(@InterfaceC6391 CircularRevealWidget circularRevealWidget) {
            return Integer.valueOf(circularRevealWidget.getCircularRevealScrimColor());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        public void set(@InterfaceC6391 CircularRevealWidget circularRevealWidget, @InterfaceC6391 Integer num) {
            circularRevealWidget.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class RevealInfo {
        public static final float INVALID_RADIUS = Float.MAX_VALUE;
        public float centerX;
        public float centerY;
        public float radius;

        public boolean isInvalid() {
            return this.radius == Float.MAX_VALUE;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void set(float f, float f2, float f3) {
            this.centerX = f;
            this.centerY = f2;
            this.radius = f3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private RevealInfo() {
        }

        public RevealInfo(float f, float f2, float f3) {
            this.centerX = f;
            this.centerY = f2;
            this.radius = f3;
        }

        public void set(@InterfaceC6391 RevealInfo revealInfo) {
            set(revealInfo.centerX, revealInfo.centerY, revealInfo.radius);
        }

        public RevealInfo(@InterfaceC6391 RevealInfo revealInfo) {
            this(revealInfo.centerX, revealInfo.centerY, revealInfo.radius);
        }
    }

    void buildCircularRevealCache();

    void destroyCircularRevealCache();

    void draw(Canvas canvas);

    @InterfaceC6490
    Drawable getCircularRevealOverlayDrawable();

    @InterfaceC3897
    int getCircularRevealScrimColor();

    @InterfaceC6490
    RevealInfo getRevealInfo();

    boolean isOpaque();

    void setCircularRevealOverlayDrawable(@InterfaceC6490 Drawable drawable);

    void setCircularRevealScrimColor(@InterfaceC3897 int i);

    void setRevealInfo(@InterfaceC6490 RevealInfo revealInfo);
}
