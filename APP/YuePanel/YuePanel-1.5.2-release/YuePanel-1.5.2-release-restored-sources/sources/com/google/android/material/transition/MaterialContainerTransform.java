package com.google.android.material.transition;

import Yue.AbstractC6623;
import Yue.AbstractC7956;
import Yue.C3372;
import Yue.C5445;
import Yue.C6740;
import Yue.C7995;
import Yue.C8273;
import Yue.InterfaceC3897;
import Yue.InterfaceC4885;
import Yue.InterfaceC5411;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import Yue.InterfaceC7651;
import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.material.C1980R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialContainerTransform extends AbstractC7956 {
    private static final ProgressThresholdsGroup DEFAULT_RETURN_THRESHOLDS;
    private static final ProgressThresholdsGroup DEFAULT_RETURN_THRESHOLDS_ARC;
    private static final float ELEVATION_NOT_SET = -1.0f;
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    private static final String TAG = "MaterialContainerTransform";
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;
    private boolean appliedThemeValues;

    @InterfaceC3897
    private int containerColor;
    private boolean drawDebugEnabled;

    @InterfaceC5411
    private int drawingViewId;
    private boolean elevationShadowEnabled;

    @InterfaceC3897
    private int endContainerColor;
    private float endElevation;

    @InterfaceC6490
    private ShapeAppearanceModel endShapeAppearanceModel;

    @InterfaceC6490
    private View endView;

    @InterfaceC5411
    private int endViewId;
    private int fadeMode;

    @InterfaceC6490
    private ProgressThresholds fadeProgressThresholds;
    private int fitMode;
    private boolean holdAtEndEnabled;
    private boolean pathMotionCustom;

    @InterfaceC6490
    private ProgressThresholds scaleMaskProgressThresholds;

    @InterfaceC6490
    private ProgressThresholds scaleProgressThresholds;

    @InterfaceC3897
    private int scrimColor;

    @InterfaceC6490
    private ProgressThresholds shapeMaskProgressThresholds;

    @InterfaceC3897
    private int startContainerColor;
    private float startElevation;

    @InterfaceC6490
    private ShapeAppearanceModel startShapeAppearanceModel;

    @InterfaceC6490
    private View startView;

    @InterfaceC5411
    private int startViewId;
    private int transitionDirection;
    private static final String PROP_BOUNDS = "materialContainerTransition:bounds";
    private static final String PROP_SHAPE_APPEARANCE = "materialContainerTransition:shapeAppearance";
    private static final String[] TRANSITION_PROPS = {PROP_BOUNDS, PROP_SHAPE_APPEARANCE};
    private static final ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS = new ProgressThresholdsGroup(new ProgressThresholds(0.0f, 0.25f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.75f));
    private static final ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS_ARC = new ProgressThresholdsGroup(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f));

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FadeMode {
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FitMode {
    }

    public static class ProgressThresholds {

        @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN)
        private final float end;

        @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN)
        private final float start;

        public ProgressThresholds(@InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f, @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f2) {
            this.start = f;
            this.end = f2;
        }

        @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN)
        public float getEnd() {
            return this.end;
        }

        @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN)
        public float getStart() {
            return this.start;
        }
    }

    public static class ProgressThresholdsGroup {

        @InterfaceC6391
        private final ProgressThresholds fade;

        @InterfaceC6391
        private final ProgressThresholds scale;

        @InterfaceC6391
        private final ProgressThresholds scaleMask;

        @InterfaceC6391
        private final ProgressThresholds shapeMask;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private ProgressThresholdsGroup(@InterfaceC6391 ProgressThresholds progressThresholds, @InterfaceC6391 ProgressThresholds progressThresholds2, @InterfaceC6391 ProgressThresholds progressThresholds3, @InterfaceC6391 ProgressThresholds progressThresholds4) {
            this.fade = progressThresholds;
            this.scale = progressThresholds2;
            this.scaleMask = progressThresholds3;
            this.shapeMask = progressThresholds4;
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TransitionDirection {
    }

    public static final class TransitionDrawable extends Drawable {
        private static final int COMPAT_SHADOW_COLOR = -7829368;
        private static final int SHADOW_COLOR = 754974720;
        private static final float SHADOW_DX_MULTIPLIER_ADJUSTMENT = 0.3f;
        private static final float SHADOW_DY_MULTIPLIER_ADJUSTMENT = 1.5f;
        private final MaterialShapeDrawable compatShadowDrawable;
        private final Paint containerPaint;
        private float currentElevation;
        private float currentElevationDy;
        private final RectF currentEndBounds;
        private final RectF currentEndBoundsMasked;
        private RectF currentMaskBounds;
        private final RectF currentStartBounds;
        private final RectF currentStartBoundsMasked;
        private final Paint debugPaint;
        private final Path debugPath;
        private final float displayHeight;
        private final float displayWidth;
        private final boolean drawDebugEnabled;
        private final boolean elevationShadowEnabled;
        private final RectF endBounds;
        private final Paint endContainerPaint;
        private final float endElevation;
        private final ShapeAppearanceModel endShapeAppearanceModel;
        private final View endView;
        private final boolean entering;
        private final FadeModeEvaluator fadeModeEvaluator;
        private FadeModeResult fadeModeResult;
        private final FitModeEvaluator fitModeEvaluator;
        private FitModeResult fitModeResult;
        private final MaskEvaluator maskEvaluator;
        private final float motionPathLength;
        private final PathMeasure motionPathMeasure;
        private final float[] motionPathPosition;
        private float progress;
        private final ProgressThresholdsGroup progressThresholds;
        private final Paint scrimPaint;
        private final Paint shadowPaint;
        private final RectF startBounds;
        private final Paint startContainerPaint;
        private final float startElevation;
        private final ShapeAppearanceModel startShapeAppearanceModel;
        private final View startView;

        private static float calculateElevationDxMultiplier(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * SHADOW_DX_MULTIPLIER_ADJUSTMENT;
        }

        private static float calculateElevationDyMultiplier(RectF rectF, float f) {
            return (rectF.centerY() / f) * 1.5f;
        }

        private void drawDebugCumulativePath(Canvas canvas, RectF rectF, Path path, @InterfaceC3897 int i) {
            PointF motionPathPoint = getMotionPathPoint(rectF);
            if (this.progress == 0.0f) {
                path.reset();
                path.moveTo(motionPathPoint.x, motionPathPoint.y);
            } else {
                path.lineTo(motionPathPoint.x, motionPathPoint.y);
                this.debugPaint.setColor(i);
                canvas.drawPath(path, this.debugPaint);
            }
        }

        private void drawDebugRect(Canvas canvas, RectF rectF, @InterfaceC3897 int i) {
            this.debugPaint.setColor(i);
            canvas.drawRect(rectF, this.debugPaint);
        }

        private void drawElevationShadow(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.maskEvaluator.getPath(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                drawElevationShadowWithPaintShadowLayer(canvas);
            } else {
                drawElevationShadowWithMaterialShapeDrawable(canvas);
            }
            canvas.restore();
        }

        private void drawElevationShadowWithMaterialShapeDrawable(Canvas canvas) {
            MaterialShapeDrawable materialShapeDrawable = this.compatShadowDrawable;
            RectF rectF = this.currentMaskBounds;
            materialShapeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.compatShadowDrawable.setElevation(this.currentElevation);
            this.compatShadowDrawable.setShadowVerticalOffset((int) this.currentElevationDy);
            this.compatShadowDrawable.setShapeAppearanceModel(this.maskEvaluator.getCurrentShapeAppearanceModel());
            this.compatShadowDrawable.draw(canvas);
        }

        private void drawElevationShadowWithPaintShadowLayer(Canvas canvas) {
            ShapeAppearanceModel currentShapeAppearanceModel = this.maskEvaluator.getCurrentShapeAppearanceModel();
            if (!currentShapeAppearanceModel.isRoundRect(this.currentMaskBounds)) {
                canvas.drawPath(this.maskEvaluator.getPath(), this.shadowPaint);
            } else {
                float cornerSize = currentShapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.currentMaskBounds);
                canvas.drawRoundRect(this.currentMaskBounds, cornerSize, cornerSize, this.shadowPaint);
            }
        }

        private void drawEndView(Canvas canvas) {
            maybeDrawContainerColor(canvas, this.endContainerPaint);
            Rect bounds = getBounds();
            RectF rectF = this.currentEndBounds;
            TransitionUtils.transform(canvas, bounds, rectF.left, rectF.top, this.fitModeResult.endScale, this.fadeModeResult.endAlpha, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.transition.MaterialContainerTransform.TransitionDrawable.2
                @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
                public void run(Canvas canvas2) {
                    TransitionDrawable.this.endView.draw(canvas2);
                }
            });
        }

        private void drawStartView(Canvas canvas) {
            maybeDrawContainerColor(canvas, this.startContainerPaint);
            Rect bounds = getBounds();
            RectF rectF = this.currentStartBounds;
            TransitionUtils.transform(canvas, bounds, rectF.left, rectF.top, this.fitModeResult.startScale, this.fadeModeResult.startAlpha, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.transition.MaterialContainerTransform.TransitionDrawable.1
                @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
                public void run(Canvas canvas2) {
                    TransitionDrawable.this.startView.draw(canvas2);
                }
            });
        }

        private static PointF getMotionPathPoint(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        private void maybeDrawContainerColor(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgress(float f) {
            if (this.progress != f) {
                updateProgress(f);
            }
        }

        private void updateProgress(float f) {
            float f2;
            float f3;
            this.progress = f;
            this.scrimPaint.setAlpha((int) (this.entering ? TransitionUtils.lerp(0.0f, 255.0f, f) : TransitionUtils.lerp(255.0f, 0.0f, f)));
            this.motionPathMeasure.getPosTan(this.motionPathLength * f, this.motionPathPosition, null);
            float[] fArr = this.motionPathPosition;
            float f4 = fArr[0];
            float f5 = fArr[1];
            if (f > 1.0f || f < 0.0f) {
                if (f > 1.0f) {
                    f3 = (f - 1.0f) / 0.00999999f;
                    f2 = 0.99f;
                } else {
                    f2 = 0.01f;
                    f3 = (f / 0.01f) * (-1.0f);
                }
                this.motionPathMeasure.getPosTan(this.motionPathLength * f2, fArr, null);
                float[] fArr2 = this.motionPathPosition;
                f4 += (f4 - fArr2[0]) * f3;
                f5 += (f5 - fArr2[1]) * f3;
            }
            float f6 = f4;
            float f7 = f5;
            FitModeResult fitModeResultEvaluate = this.fitModeEvaluator.evaluate(f, ((Float) C6740.m21415(Float.valueOf(this.progressThresholds.scale.start))).floatValue(), ((Float) C6740.m21415(Float.valueOf(this.progressThresholds.scale.end))).floatValue(), this.startBounds.width(), this.startBounds.height(), this.endBounds.width(), this.endBounds.height());
            this.fitModeResult = fitModeResultEvaluate;
            RectF rectF = this.currentStartBounds;
            float f8 = fitModeResultEvaluate.currentStartWidth;
            rectF.set(f6 - (f8 / 2.0f), f7, (f8 / 2.0f) + f6, fitModeResultEvaluate.currentStartHeight + f7);
            RectF rectF2 = this.currentEndBounds;
            FitModeResult fitModeResult = this.fitModeResult;
            float f9 = fitModeResult.currentEndWidth;
            rectF2.set(f6 - (f9 / 2.0f), f7, f6 + (f9 / 2.0f), fitModeResult.currentEndHeight + f7);
            this.currentStartBoundsMasked.set(this.currentStartBounds);
            this.currentEndBoundsMasked.set(this.currentEndBounds);
            float fFloatValue = ((Float) C6740.m21415(Float.valueOf(this.progressThresholds.scaleMask.start))).floatValue();
            float fFloatValue2 = ((Float) C6740.m21415(Float.valueOf(this.progressThresholds.scaleMask.end))).floatValue();
            boolean zShouldMaskStartBounds = this.fitModeEvaluator.shouldMaskStartBounds(this.fitModeResult);
            RectF rectF3 = zShouldMaskStartBounds ? this.currentStartBoundsMasked : this.currentEndBoundsMasked;
            float fLerp = TransitionUtils.lerp(0.0f, 1.0f, fFloatValue, fFloatValue2, f);
            if (!zShouldMaskStartBounds) {
                fLerp = 1.0f - fLerp;
            }
            this.fitModeEvaluator.applyMask(rectF3, fLerp, this.fitModeResult);
            this.currentMaskBounds = new RectF(Math.min(this.currentStartBoundsMasked.left, this.currentEndBoundsMasked.left), Math.min(this.currentStartBoundsMasked.top, this.currentEndBoundsMasked.top), Math.max(this.currentStartBoundsMasked.right, this.currentEndBoundsMasked.right), Math.max(this.currentStartBoundsMasked.bottom, this.currentEndBoundsMasked.bottom));
            this.maskEvaluator.evaluate(f, this.startShapeAppearanceModel, this.endShapeAppearanceModel, this.currentStartBounds, this.currentStartBoundsMasked, this.currentEndBoundsMasked, this.progressThresholds.shapeMask);
            this.currentElevation = TransitionUtils.lerp(this.startElevation, this.endElevation, f);
            float fCalculateElevationDxMultiplier = calculateElevationDxMultiplier(this.currentMaskBounds, this.displayWidth);
            float fCalculateElevationDyMultiplier = calculateElevationDyMultiplier(this.currentMaskBounds, this.displayHeight);
            float f10 = this.currentElevation;
            float f11 = (int) (fCalculateElevationDyMultiplier * f10);
            this.currentElevationDy = f11;
            this.shadowPaint.setShadowLayer(f10, (int) (fCalculateElevationDxMultiplier * f10), f11, SHADOW_COLOR);
            this.fadeModeResult = this.fadeModeEvaluator.evaluate(f, ((Float) C6740.m21415(Float.valueOf(this.progressThresholds.fade.start))).floatValue(), ((Float) C6740.m21415(Float.valueOf(this.progressThresholds.fade.end))).floatValue(), 0.35f);
            if (this.startContainerPaint.getColor() != 0) {
                this.startContainerPaint.setAlpha(this.fadeModeResult.startAlpha);
            }
            if (this.endContainerPaint.getColor() != 0) {
                this.endContainerPaint.setAlpha(this.fadeModeResult.endAlpha);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@InterfaceC6391 Canvas canvas) {
            if (this.scrimPaint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.scrimPaint);
            }
            int iSave = this.drawDebugEnabled ? canvas.save() : -1;
            if (this.elevationShadowEnabled && this.currentElevation > 0.0f) {
                drawElevationShadow(canvas);
            }
            this.maskEvaluator.clip(canvas);
            maybeDrawContainerColor(canvas, this.containerPaint);
            if (this.fadeModeResult.endOnTop) {
                drawStartView(canvas);
                drawEndView(canvas);
            } else {
                drawEndView(canvas);
                drawStartView(canvas);
            }
            if (this.drawDebugEnabled) {
                canvas.restoreToCount(iSave);
                drawDebugCumulativePath(canvas, this.currentStartBounds, this.debugPath, -65281);
                drawDebugRect(canvas, this.currentStartBoundsMasked, C5445.f13388);
                drawDebugRect(canvas, this.currentStartBounds, -16711936);
                drawDebugRect(canvas, this.currentEndBoundsMasked, -16711681);
                drawDebugRect(canvas, this.currentEndBounds, -16776961);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@InterfaceC6490 ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private TransitionDrawable(AbstractC6623 abstractC6623, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f2, @InterfaceC3897 int i, @InterfaceC3897 int i2, @InterfaceC3897 int i3, int i4, boolean z, boolean z2, FadeModeEvaluator fadeModeEvaluator, FitModeEvaluator fitModeEvaluator, ProgressThresholdsGroup progressThresholdsGroup, boolean z3) {
            Paint paint = new Paint();
            this.containerPaint = paint;
            Paint paint2 = new Paint();
            this.startContainerPaint = paint2;
            Paint paint3 = new Paint();
            this.endContainerPaint = paint3;
            this.shadowPaint = new Paint();
            Paint paint4 = new Paint();
            this.scrimPaint = paint4;
            this.maskEvaluator = new MaskEvaluator();
            this.motionPathPosition = new float[]{rectF.centerX(), rectF.top};
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.compatShadowDrawable = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.debugPaint = paint5;
            this.debugPath = new Path();
            this.startView = view;
            this.startBounds = rectF;
            this.startShapeAppearanceModel = shapeAppearanceModel;
            this.startElevation = f;
            this.endView = view2;
            this.endBounds = rectF2;
            this.endShapeAppearanceModel = shapeAppearanceModel2;
            this.endElevation = f2;
            this.entering = z;
            this.elevationShadowEnabled = z2;
            this.fadeModeEvaluator = fadeModeEvaluator;
            this.fitModeEvaluator = fitModeEvaluator;
            this.progressThresholds = progressThresholdsGroup;
            this.drawDebugEnabled = z3;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.displayWidth = r12.widthPixels;
            this.displayHeight = r12.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(0));
            materialShapeDrawable.setShadowCompatibilityMode(2);
            materialShapeDrawable.setShadowBitmapDrawingEnable(false);
            materialShapeDrawable.setShadowColor(COMPAT_SHADOW_COLOR);
            RectF rectF3 = new RectF(rectF);
            this.currentStartBounds = rectF3;
            this.currentStartBoundsMasked = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.currentEndBounds = rectF4;
            this.currentEndBoundsMasked = new RectF(rectF4);
            PointF motionPathPoint = getMotionPathPoint(rectF);
            PointF motionPathPoint2 = getMotionPathPoint(rectF2);
            PathMeasure pathMeasure = new PathMeasure(abstractC6623.getPath(motionPathPoint.x, motionPathPoint.y, motionPathPoint2.x, motionPathPoint2.y), false);
            this.motionPathMeasure = pathMeasure;
            this.motionPathLength = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(TransitionUtils.createColorShader(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            updateProgress(0.0f);
        }
    }

    static {
        DEFAULT_RETURN_THRESHOLDS = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.3f, 0.9f));
        DEFAULT_RETURN_THRESHOLDS_ARC = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.2f, 0.9f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialContainerTransform() {
        this.drawDebugEnabled = false;
        this.holdAtEndEnabled = false;
        this.pathMotionCustom = false;
        this.appliedThemeValues = false;
        this.drawingViewId = R.id.content;
        this.startViewId = -1;
        this.endViewId = -1;
        this.containerColor = 0;
        this.startContainerColor = 0;
        this.endContainerColor = 0;
        this.scrimColor = 1375731712;
        this.transitionDirection = 0;
        this.fadeMode = 0;
        this.fitMode = 0;
        this.elevationShadowEnabled = Build.VERSION.SDK_INT >= 28;
        this.startElevation = -1.0f;
        this.endElevation = -1.0f;
    }

    private ProgressThresholdsGroup buildThresholdsGroup(boolean z) {
        AbstractC6623 pathMotion = getPathMotion();
        return ((pathMotion instanceof C3372) || (pathMotion instanceof MaterialArcMotion)) ? getThresholdsOrDefault(z, DEFAULT_ENTER_THRESHOLDS_ARC, DEFAULT_RETURN_THRESHOLDS_ARC) : getThresholdsOrDefault(z, DEFAULT_ENTER_THRESHOLDS, DEFAULT_RETURN_THRESHOLDS);
    }

    private static RectF calculateDrawableBounds(View view, @InterfaceC6490 View view2, float f, float f2) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        RectF locationOnScreen = TransitionUtils.getLocationOnScreen(view2);
        locationOnScreen.offset(f, f2);
        return locationOnScreen;
    }

    private static ShapeAppearanceModel captureShapeAppearance(@InterfaceC6391 View view, @InterfaceC6391 RectF rectF, @InterfaceC6490 ShapeAppearanceModel shapeAppearanceModel) {
        return TransitionUtils.convertToRelativeCornerSizes(getShapeAppearance(view, shapeAppearanceModel), rectF);
    }

    private static void captureValues(@InterfaceC6391 C7995 c7995, @InterfaceC6490 View view, @InterfaceC5411 int i, @InterfaceC6490 ShapeAppearanceModel shapeAppearanceModel) {
        if (i != -1) {
            c7995.f3178 = TransitionUtils.findDescendantOrAncestorById(c7995.f3178, i);
        } else if (view != null) {
            c7995.f3178 = view;
        } else if (c7995.f3178.getTag(C1980R.id.mtrl_motion_snapshot_view) instanceof View) {
            View view2 = (View) c7995.f3178.getTag(C1980R.id.mtrl_motion_snapshot_view);
            c7995.f3178.setTag(C1980R.id.mtrl_motion_snapshot_view, null);
            c7995.f3178 = view2;
        }
        View view3 = c7995.f3178;
        if (!C8273.m27404(view3) && view3.getWidth() == 0 && view3.getHeight() == 0) {
            return;
        }
        RectF relativeBounds = view3.getParent() == null ? TransitionUtils.getRelativeBounds(view3) : TransitionUtils.getLocationOnScreen(view3);
        c7995.f3177.put(PROP_BOUNDS, relativeBounds);
        c7995.f3177.put(PROP_SHAPE_APPEARANCE, captureShapeAppearance(view3, relativeBounds, shapeAppearanceModel));
    }

    private static float getElevationOrDefault(float f, View view) {
        return f != -1.0f ? f : C8273.m27347(view);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    private static ShapeAppearanceModel getShapeAppearance(@InterfaceC6391 View view, @InterfaceC6490 ShapeAppearanceModel shapeAppearanceModel) {
        if (shapeAppearanceModel != null) {
            return shapeAppearanceModel;
        }
        if (view.getTag(C1980R.id.mtrl_motion_snapshot_view) instanceof ShapeAppearanceModel) {
            return (ShapeAppearanceModel) view.getTag(C1980R.id.mtrl_motion_snapshot_view);
        }
        Context context = view.getContext();
        int transitionShapeAppearanceResId = getTransitionShapeAppearanceResId(context);
        return transitionShapeAppearanceResId != -1 ? ShapeAppearanceModel.builder(context, transitionShapeAppearanceResId, 0).build() : view instanceof Shapeable ? ((Shapeable) view).getShapeAppearanceModel() : ShapeAppearanceModel.builder().build();
    }

    private ProgressThresholdsGroup getThresholdsOrDefault(boolean z, ProgressThresholdsGroup progressThresholdsGroup, ProgressThresholdsGroup progressThresholdsGroup2) {
        if (!z) {
            progressThresholdsGroup = progressThresholdsGroup2;
        }
        return new ProgressThresholdsGroup((ProgressThresholds) TransitionUtils.defaultIfNull(this.fadeProgressThresholds, progressThresholdsGroup.fade), (ProgressThresholds) TransitionUtils.defaultIfNull(this.scaleProgressThresholds, progressThresholdsGroup.scale), (ProgressThresholds) TransitionUtils.defaultIfNull(this.scaleMaskProgressThresholds, progressThresholdsGroup.scaleMask), (ProgressThresholds) TransitionUtils.defaultIfNull(this.shapeMaskProgressThresholds, progressThresholdsGroup.shapeMask));
    }

    @InterfaceC7651
    private static int getTransitionShapeAppearanceResId(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{C1980R.attr.transitionShapeAppearance});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private boolean isEntering(@InterfaceC6391 RectF rectF, @InterfaceC6391 RectF rectF2) {
        int i = this.transitionDirection;
        if (i == 0) {
            return TransitionUtils.calculateArea(rectF2) > TransitionUtils.calculateArea(rectF);
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid transition direction: " + this.transitionDirection);
    }

    private void maybeApplyThemeValues(Context context, boolean z) {
        TransitionUtils.maybeApplyThemeInterpolator(this, context, C1980R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        TransitionUtils.maybeApplyThemeDuration(this, context, z ? C1980R.attr.motionDurationLong2 : C1980R.attr.motionDurationMedium4);
        if (this.pathMotionCustom) {
            return;
        }
        TransitionUtils.maybeApplyThemePath(this, context, C1980R.attr.motionPath);
    }

    @Override // Yue.AbstractC7956
    public void captureEndValues(@InterfaceC6391 C7995 c7995) {
        captureValues(c7995, this.endView, this.endViewId, this.endShapeAppearanceModel);
    }

    @Override // Yue.AbstractC7956
    public void captureStartValues(@InterfaceC6391 C7995 c7995) {
        captureValues(c7995, this.startView, this.startViewId, this.startShapeAppearanceModel);
    }

    @Override // Yue.AbstractC7956
    @InterfaceC6490
    public Animator createAnimator(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6490 C7995 c7995, @InterfaceC6490 C7995 c79952) {
        final View viewFindAncestorById;
        View view;
        if (c7995 != null && c79952 != null) {
            RectF rectF = (RectF) c7995.f3177.get(PROP_BOUNDS);
            ShapeAppearanceModel shapeAppearanceModel = (ShapeAppearanceModel) c7995.f3177.get(PROP_SHAPE_APPEARANCE);
            if (rectF != null && shapeAppearanceModel != null) {
                RectF rectF2 = (RectF) c79952.f3177.get(PROP_BOUNDS);
                ShapeAppearanceModel shapeAppearanceModel2 = (ShapeAppearanceModel) c79952.f3177.get(PROP_SHAPE_APPEARANCE);
                if (rectF2 == null || shapeAppearanceModel2 == null) {
                    Log.w(TAG, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                    return null;
                }
                final View view2 = c7995.f3178;
                final View view3 = c79952.f3178;
                View view4 = view3.getParent() != null ? view3 : view2;
                if (this.drawingViewId == view4.getId()) {
                    viewFindAncestorById = (View) view4.getParent();
                    view = view4;
                } else {
                    viewFindAncestorById = TransitionUtils.findAncestorById(view4, this.drawingViewId);
                    view = null;
                }
                RectF locationOnScreen = TransitionUtils.getLocationOnScreen(viewFindAncestorById);
                float f = -locationOnScreen.left;
                float f2 = -locationOnScreen.top;
                RectF rectFCalculateDrawableBounds = calculateDrawableBounds(viewFindAncestorById, view, f, f2);
                rectF.offset(f, f2);
                rectF2.offset(f, f2);
                boolean zIsEntering = isEntering(rectF, rectF2);
                if (!this.appliedThemeValues) {
                    maybeApplyThemeValues(view4.getContext(), zIsEntering);
                }
                final TransitionDrawable transitionDrawable = new TransitionDrawable(getPathMotion(), view2, rectF, shapeAppearanceModel, getElevationOrDefault(this.startElevation, view2), view3, rectF2, shapeAppearanceModel2, getElevationOrDefault(this.endElevation, view3), this.containerColor, this.startContainerColor, this.endContainerColor, this.scrimColor, zIsEntering, this.elevationShadowEnabled, FadeModeEvaluators.get(this.fadeMode, zIsEntering), FitModeEvaluators.get(this.fitMode, zIsEntering, rectF, rectF2), buildThresholdsGroup(zIsEntering), this.drawDebugEnabled);
                transitionDrawable.setBounds(Math.round(rectFCalculateDrawableBounds.left), Math.round(rectFCalculateDrawableBounds.top), Math.round(rectFCalculateDrawableBounds.right), Math.round(rectFCalculateDrawableBounds.bottom));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transition.MaterialContainerTransform.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        transitionDrawable.setProgress(valueAnimator.getAnimatedFraction());
                    }
                });
                addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.MaterialContainerTransform.2
                    @Override // com.google.android.material.transition.TransitionListenerAdapter, Yue.AbstractC7956.InterfaceC7964
                    public void onTransitionEnd(@InterfaceC6391 AbstractC7956 abstractC7956) {
                        MaterialContainerTransform.this.removeListener(this);
                        if (MaterialContainerTransform.this.holdAtEndEnabled) {
                            return;
                        }
                        view2.setAlpha(1.0f);
                        view3.setAlpha(1.0f);
                        ViewUtils.getOverlay(viewFindAncestorById).remove(transitionDrawable);
                    }

                    @Override // com.google.android.material.transition.TransitionListenerAdapter, Yue.AbstractC7956.InterfaceC7964
                    public void onTransitionStart(@InterfaceC6391 AbstractC7956 abstractC7956) {
                        ViewUtils.getOverlay(viewFindAncestorById).add(transitionDrawable);
                        view2.setAlpha(0.0f);
                        view3.setAlpha(0.0f);
                    }
                });
                return valueAnimatorOfFloat;
            }
            Log.w(TAG, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    @InterfaceC3897
    public int getContainerColor() {
        return this.containerColor;
    }

    @InterfaceC5411
    public int getDrawingViewId() {
        return this.drawingViewId;
    }

    @InterfaceC3897
    public int getEndContainerColor() {
        return this.endContainerColor;
    }

    public float getEndElevation() {
        return this.endElevation;
    }

    @InterfaceC6490
    public ShapeAppearanceModel getEndShapeAppearanceModel() {
        return this.endShapeAppearanceModel;
    }

    @InterfaceC6490
    public View getEndView() {
        return this.endView;
    }

    @InterfaceC5411
    public int getEndViewId() {
        return this.endViewId;
    }

    public int getFadeMode() {
        return this.fadeMode;
    }

    @InterfaceC6490
    public ProgressThresholds getFadeProgressThresholds() {
        return this.fadeProgressThresholds;
    }

    public int getFitMode() {
        return this.fitMode;
    }

    @InterfaceC6490
    public ProgressThresholds getScaleMaskProgressThresholds() {
        return this.scaleMaskProgressThresholds;
    }

    @InterfaceC6490
    public ProgressThresholds getScaleProgressThresholds() {
        return this.scaleProgressThresholds;
    }

    @InterfaceC3897
    public int getScrimColor() {
        return this.scrimColor;
    }

    @InterfaceC6490
    public ProgressThresholds getShapeMaskProgressThresholds() {
        return this.shapeMaskProgressThresholds;
    }

    @InterfaceC3897
    public int getStartContainerColor() {
        return this.startContainerColor;
    }

    public float getStartElevation() {
        return this.startElevation;
    }

    @InterfaceC6490
    public ShapeAppearanceModel getStartShapeAppearanceModel() {
        return this.startShapeAppearanceModel;
    }

    @InterfaceC6490
    public View getStartView() {
        return this.startView;
    }

    @InterfaceC5411
    public int getStartViewId() {
        return this.startViewId;
    }

    public int getTransitionDirection() {
        return this.transitionDirection;
    }

    @Override // Yue.AbstractC7956
    @InterfaceC6490
    public String[] getTransitionProperties() {
        return TRANSITION_PROPS;
    }

    public boolean isDrawDebugEnabled() {
        return this.drawDebugEnabled;
    }

    public boolean isElevationShadowEnabled() {
        return this.elevationShadowEnabled;
    }

    public boolean isHoldAtEndEnabled() {
        return this.holdAtEndEnabled;
    }

    public void setAllContainerColors(@InterfaceC3897 int i) {
        this.containerColor = i;
        this.startContainerColor = i;
        this.endContainerColor = i;
    }

    public void setContainerColor(@InterfaceC3897 int i) {
        this.containerColor = i;
    }

    public void setDrawDebugEnabled(boolean z) {
        this.drawDebugEnabled = z;
    }

    public void setDrawingViewId(@InterfaceC5411 int i) {
        this.drawingViewId = i;
    }

    public void setElevationShadowEnabled(boolean z) {
        this.elevationShadowEnabled = z;
    }

    public void setEndContainerColor(@InterfaceC3897 int i) {
        this.endContainerColor = i;
    }

    public void setEndElevation(float f) {
        this.endElevation = f;
    }

    public void setEndShapeAppearanceModel(@InterfaceC6490 ShapeAppearanceModel shapeAppearanceModel) {
        this.endShapeAppearanceModel = shapeAppearanceModel;
    }

    public void setEndView(@InterfaceC6490 View view) {
        this.endView = view;
    }

    public void setEndViewId(@InterfaceC5411 int i) {
        this.endViewId = i;
    }

    public void setFadeMode(int i) {
        this.fadeMode = i;
    }

    public void setFadeProgressThresholds(@InterfaceC6490 ProgressThresholds progressThresholds) {
        this.fadeProgressThresholds = progressThresholds;
    }

    public void setFitMode(int i) {
        this.fitMode = i;
    }

    public void setHoldAtEndEnabled(boolean z) {
        this.holdAtEndEnabled = z;
    }

    @Override // Yue.AbstractC7956
    public void setPathMotion(@InterfaceC6490 AbstractC6623 abstractC6623) {
        super.setPathMotion(abstractC6623);
        this.pathMotionCustom = true;
    }

    public void setScaleMaskProgressThresholds(@InterfaceC6490 ProgressThresholds progressThresholds) {
        this.scaleMaskProgressThresholds = progressThresholds;
    }

    public void setScaleProgressThresholds(@InterfaceC6490 ProgressThresholds progressThresholds) {
        this.scaleProgressThresholds = progressThresholds;
    }

    public void setScrimColor(@InterfaceC3897 int i) {
        this.scrimColor = i;
    }

    public void setShapeMaskProgressThresholds(@InterfaceC6490 ProgressThresholds progressThresholds) {
        this.shapeMaskProgressThresholds = progressThresholds;
    }

    public void setStartContainerColor(@InterfaceC3897 int i) {
        this.startContainerColor = i;
    }

    public void setStartElevation(float f) {
        this.startElevation = f;
    }

    public void setStartShapeAppearanceModel(@InterfaceC6490 ShapeAppearanceModel shapeAppearanceModel) {
        this.startShapeAppearanceModel = shapeAppearanceModel;
    }

    public void setStartView(@InterfaceC6490 View view) {
        this.startView = view;
    }

    public void setStartViewId(@InterfaceC5411 int i) {
        this.startViewId = i;
    }

    public void setTransitionDirection(int i) {
        this.transitionDirection = i;
    }

    public MaterialContainerTransform(@InterfaceC6391 Context context, boolean z) {
        this.drawDebugEnabled = false;
        this.holdAtEndEnabled = false;
        this.pathMotionCustom = false;
        this.appliedThemeValues = false;
        this.drawingViewId = R.id.content;
        this.startViewId = -1;
        this.endViewId = -1;
        this.containerColor = 0;
        this.startContainerColor = 0;
        this.endContainerColor = 0;
        this.scrimColor = 1375731712;
        this.transitionDirection = 0;
        this.fadeMode = 0;
        this.fitMode = 0;
        this.elevationShadowEnabled = Build.VERSION.SDK_INT >= 28;
        this.startElevation = -1.0f;
        this.endElevation = -1.0f;
        maybeApplyThemeValues(context, z);
        this.appliedThemeValues = true;
    }
}
