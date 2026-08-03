package com.google.android.material.slider;

import Yue.InterfaceC3906;
import Yue.InterfaceC4398;
import Yue.InterfaceC4525;
import Yue.InterfaceC5459;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.material.C1980R;

/* JADX INFO: loaded from: classes.dex */
public class Slider extends BaseSlider<Slider, OnChangeListener, OnSliderTouchListener> {

    public interface OnChangeListener extends BaseOnChangeListener<Slider> {
        /* JADX DEBUG: Method merged with bridge method: onValueChange(Ljava/lang/Object;FZ)V */
        @Override // com.google.android.material.slider.BaseOnChangeListener
        void onValueChange(@InterfaceC6391 Slider slider, float f, boolean z);
    }

    public interface OnSliderTouchListener extends BaseOnSliderTouchListener<Slider> {
        /* JADX DEBUG: Method merged with bridge method: onStartTrackingTouch(Ljava/lang/Object;)V */
        @Override // com.google.android.material.slider.BaseOnSliderTouchListener
        void onStartTrackingTouch(@InterfaceC6391 Slider slider);

        /* JADX DEBUG: Method merged with bridge method: onStopTrackingTouch(Ljava/lang/Object;)V */
        @Override // com.google.android.material.slider.BaseOnSliderTouchListener
        void onStopTrackingTouch(@InterfaceC6391 Slider slider);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Slider(@InterfaceC6391 Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void addOnChangeListener(@InterfaceC6391 BaseOnChangeListener baseOnChangeListener) {
        super.addOnChangeListener(baseOnChangeListener);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void addOnSliderTouchListener(@InterfaceC6391 BaseOnSliderTouchListener baseOnSliderTouchListener) {
        super.addOnSliderTouchListener(baseOnSliderTouchListener);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void clearOnChangeListeners() {
        super.clearOnChangeListeners();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void clearOnSliderTouchListeners() {
        super.clearOnSliderTouchListeners();
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchHoverEvent(@InterfaceC6391 MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(@InterfaceC6391 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    @InterfaceC6391
    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
        return super.getActiveThumbIndex();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
        return super.getFocusedThumbIndex();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @InterfaceC6844
    public /* bridge */ /* synthetic */ int getHaloRadius() {
        return super.getHaloRadius();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @InterfaceC6391
    public /* bridge */ /* synthetic */ ColorStateList getHaloTintList() {
        return super.getHaloTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getLabelBehavior() {
        return super.getLabelBehavior();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getStepSize() {
        return super.getStepSize();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getThumbElevation() {
        return super.getThumbElevation();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @InterfaceC6844
    public /* bridge */ /* synthetic */ int getThumbHeight() {
        return super.getThumbHeight();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @InterfaceC6844
    public /* bridge */ /* synthetic */ int getThumbRadius() {
        return super.getThumbRadius();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getThumbStrokeColor() {
        return super.getThumbStrokeColor();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getThumbStrokeWidth() {
        return super.getThumbStrokeWidth();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @InterfaceC6391
    public /* bridge */ /* synthetic */ ColorStateList getThumbTintList() {
        return super.getThumbTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getThumbTrackGapSize() {
        return super.getThumbTrackGapSize();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @InterfaceC6844
    public /* bridge */ /* synthetic */ int getThumbWidth() {
        return super.getThumbWidth();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @InterfaceC6844
    public /* bridge */ /* synthetic */ int getTickActiveRadius() {
        return super.getTickActiveRadius();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @InterfaceC6391
    public /* bridge */ /* synthetic */ ColorStateList getTickActiveTintList() {
        return super.getTickActiveTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @InterfaceC6844
    public /* bridge */ /* synthetic */ int getTickInactiveRadius() {
        return super.getTickInactiveRadius();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @InterfaceC6391
    public /* bridge */ /* synthetic */ ColorStateList getTickInactiveTintList() {
        return super.getTickInactiveTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @InterfaceC6391
    public /* bridge */ /* synthetic */ ColorStateList getTickTintList() {
        return super.getTickTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @InterfaceC6391
    public /* bridge */ /* synthetic */ ColorStateList getTrackActiveTintList() {
        return super.getTrackActiveTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @InterfaceC6844
    public /* bridge */ /* synthetic */ int getTrackHeight() {
        return super.getTrackHeight();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @InterfaceC6391
    public /* bridge */ /* synthetic */ ColorStateList getTrackInactiveTintList() {
        return super.getTrackInactiveTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackInsideCornerSize() {
        return super.getTrackInsideCornerSize();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @InterfaceC6844
    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
        return super.getTrackSidePadding();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackStopIndicatorSize() {
        return super.getTrackStopIndicatorSize();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @InterfaceC6391
    public /* bridge */ /* synthetic */ ColorStateList getTrackTintList() {
        return super.getTrackTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @InterfaceC6844
    public /* bridge */ /* synthetic */ int getTrackWidth() {
        return super.getTrackWidth();
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getValueFrom() {
        return super.getValueFrom();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getValueTo() {
        return super.getValueTo();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ boolean hasLabelFormatter() {
        return super.hasLabelFormatter();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ boolean isTickVisible() {
        return super.isTickVisible();
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int i, @InterfaceC6391 KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyUp(int i, @InterfaceC6391 KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(@InterfaceC6391 MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public boolean pickActiveThumb() {
        if (getActiveThumbIndex() != -1) {
            return true;
        }
        setActiveThumbIndex(0);
        return true;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void removeOnChangeListener(@InterfaceC6391 BaseOnChangeListener baseOnChangeListener) {
        super.removeOnChangeListener(baseOnChangeListener);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void removeOnSliderTouchListener(@InterfaceC6391 BaseOnSliderTouchListener baseOnSliderTouchListener) {
        super.removeOnSliderTouchListener(baseOnSliderTouchListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawable(@InterfaceC4525 int i) {
        super.setCustomThumbDrawable(i);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i) {
        super.setFocusedThumbIndex(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloRadius(@InterfaceC6844 @InterfaceC5459(from = 0) int i) {
        super.setHaloRadius(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloRadiusResource(@InterfaceC4398 int i) {
        super.setHaloRadiusResource(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloTintList(@InterfaceC6391 ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setLabelBehavior(int i) {
        super.setLabelBehavior(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setLabelFormatter(@InterfaceC6490 LabelFormatter labelFormatter) {
        super.setLabelFormatter(labelFormatter);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setStepSize(float f) {
        super.setStepSize(f);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbElevation(float f) {
        super.setThumbElevation(f);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbElevationResource(@InterfaceC4398 int i) {
        super.setThumbElevationResource(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbHeight(@InterfaceC6844 @InterfaceC5459(from = 0) int i) {
        super.setThumbHeight(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbHeightResource(@InterfaceC4398 int i) {
        super.setThumbHeightResource(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadius(@InterfaceC6844 @InterfaceC5459(from = 0) int i) {
        super.setThumbRadius(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadiusResource(@InterfaceC4398 int i) {
        super.setThumbRadiusResource(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeColor(@InterfaceC6490 ColorStateList colorStateList) {
        super.setThumbStrokeColor(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeColorResource(@InterfaceC3906 int i) {
        super.setThumbStrokeColorResource(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float f) {
        super.setThumbStrokeWidth(f);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeWidthResource(@InterfaceC4398 int i) {
        super.setThumbStrokeWidthResource(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbTintList(@InterfaceC6391 ColorStateList colorStateList) {
        super.setThumbTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbTrackGapSize(@InterfaceC6844 int i) {
        super.setThumbTrackGapSize(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbWidth(@InterfaceC6844 @InterfaceC5459(from = 0) int i) {
        super.setThumbWidth(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbWidthResource(@InterfaceC4398 int i) {
        super.setThumbWidthResource(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickActiveRadius(@InterfaceC6844 @InterfaceC5459(from = 0) int i) {
        super.setTickActiveRadius(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickActiveTintList(@InterfaceC6391 ColorStateList colorStateList) {
        super.setTickActiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickInactiveRadius(@InterfaceC6844 @InterfaceC5459(from = 0) int i) {
        super.setTickInactiveRadius(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickInactiveTintList(@InterfaceC6391 ColorStateList colorStateList) {
        super.setTickInactiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickTintList(@InterfaceC6391 ColorStateList colorStateList) {
        super.setTickTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickVisible(boolean z) {
        super.setTickVisible(z);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackActiveTintList(@InterfaceC6391 ColorStateList colorStateList) {
        super.setTrackActiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackHeight(@InterfaceC6844 @InterfaceC5459(from = 0) int i) {
        super.setTrackHeight(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(@InterfaceC6391 ColorStateList colorStateList) {
        super.setTrackInactiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackInsideCornerSize(@InterfaceC6844 int i) {
        super.setTrackInsideCornerSize(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackStopIndicatorSize(@InterfaceC6844 int i) {
        super.setTrackStopIndicatorSize(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackTintList(@InterfaceC6391 ColorStateList colorStateList) {
        super.setTrackTintList(colorStateList);
    }

    public void setValue(float f) {
        setValues(Float.valueOf(f));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setValueFrom(float f) {
        super.setValueFrom(f);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setValueTo(float f) {
        super.setValueTo(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Slider(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C1980R.attr.sliderStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawable(@InterfaceC6391 Drawable drawable) {
        super.setCustomThumbDrawable(drawable);
    }

    public Slider(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.value});
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setValue(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
