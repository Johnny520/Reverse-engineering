package com.google.android.material.appbar;

import Yue.C4187;
import Yue.C4520;
import Yue.C6132;
import Yue.C6499;
import Yue.C6898;
import Yue.C8273;
import Yue.C8472;
import Yue.InterfaceC3897;
import Yue.InterfaceC4525;
import Yue.InterfaceC4885;
import Yue.InterfaceC5459;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6545;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import Yue.InterfaceC7651;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.C1980R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    private static final int DEFAULT_SCRIM_ANIMATION_DURATION = 600;
    private static final int DEF_STYLE_RES = C1980R.style.Widget_Design_CollapsingToolbar;
    public static final int TITLE_COLLAPSE_MODE_FADE = 1;
    public static final int TITLE_COLLAPSE_MODE_SCALE = 0;

    @InterfaceC6391
    final CollapsingTextHelper collapsingTextHelper;
    private boolean collapsingTitleEnabled;

    @InterfaceC6490
    private Drawable contentScrim;
    int currentOffset;
    private boolean drawCollapsingTitle;
    private View dummyView;

    @InterfaceC6391
    final ElevationOverlayProvider elevationOverlayProvider;
    private int expandedMarginBottom;
    private int expandedMarginEnd;
    private int expandedMarginStart;
    private int expandedMarginTop;
    private int extraMultilineHeight;
    private boolean extraMultilineHeightEnabled;
    private boolean forceApplySystemWindowInsetTop;

    @InterfaceC6490
    C8472 lastInsets;
    private AppBarLayout.OnOffsetChangedListener onOffsetChangedListener;
    private boolean refreshToolbar;
    private int scrimAlpha;
    private long scrimAnimationDuration;
    private final TimeInterpolator scrimAnimationFadeInInterpolator;
    private final TimeInterpolator scrimAnimationFadeOutInterpolator;
    private ValueAnimator scrimAnimator;
    private int scrimVisibleHeightTrigger;
    private boolean scrimsAreShown;

    @InterfaceC6490
    Drawable statusBarScrim;
    private int titleCollapseMode;
    private final Rect tmpRect;

    @InterfaceC6490
    private ViewGroup toolbar;

    @InterfaceC6490
    private View toolbarDirectChild;
    private int toolbarId;
    private int topInsetApplied;

    public class OffsetUpdateListener implements AppBarLayout.OnOffsetChangedListener {
        public OffsetUpdateListener() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.currentOffset = i;
            C8472 c8472 = collapsingToolbarLayout.lastInsets;
            int iM28293 = c8472 != null ? c8472.m28293() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ViewOffsetHelper viewOffsetHelper = CollapsingToolbarLayout.getViewOffsetHelper(childAt);
                int i3 = layoutParams.collapseMode;
                if (i3 == 1) {
                    viewOffsetHelper.setTopAndBottomOffset(C6132.m18838(-i, 0, CollapsingToolbarLayout.this.getMaxOffsetForPinChild(childAt)));
                } else if (i3 == 2) {
                    viewOffsetHelper.setTopAndBottomOffset(Math.round((-i) * layoutParams.parallaxMult));
                }
            }
            CollapsingToolbarLayout.this.updateScrimVisibility();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.statusBarScrim != null && iM28293 > 0) {
                C8273.m27425(collapsingToolbarLayout2);
            }
            int height = (CollapsingToolbarLayout.this.getHeight() - C8273.m27361(CollapsingToolbarLayout.this)) - iM28293;
            float f = height;
            CollapsingToolbarLayout.this.collapsingTextHelper.setFadeModeStartFraction(Math.min(1.0f, (r0 - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.collapsingTextHelper.setCurrentOffsetY(collapsingToolbarLayout3.currentOffset + height);
            CollapsingToolbarLayout.this.collapsingTextHelper.setExpansionFraction(Math.abs(i) / f);
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @InterfaceC7113(23)
    public interface StaticLayoutBuilderConfigurer extends com.google.android.material.internal.StaticLayoutBuilderConfigurer {
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TitleCollapseMode {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CollapsingToolbarLayout(@InterfaceC6391 Context context) {
        this(context, null);
    }

    private void animateScrim(int i) {
        ensureToolbar();
        ValueAnimator valueAnimator = this.scrimAnimator;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.scrimAnimator = valueAnimator2;
            valueAnimator2.setInterpolator(i > this.scrimAlpha ? this.scrimAnimationFadeInInterpolator : this.scrimAnimationFadeOutInterpolator);
            this.scrimAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@InterfaceC6391 ValueAnimator valueAnimator3) {
                    CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                }
            });
        } else if (valueAnimator.isRunning()) {
            this.scrimAnimator.cancel();
        }
        this.scrimAnimator.setDuration(this.scrimAnimationDuration);
        this.scrimAnimator.setIntValues(this.scrimAlpha, i);
        this.scrimAnimator.start();
    }

    private TextUtils.TruncateAt convertEllipsizeToTruncateAt(int i) {
        return i != 0 ? i != 1 ? i != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START;
    }

    private void disableLiftOnScrollIfNeeded(AppBarLayout appBarLayout) {
        if (isTitleCollapseFadeMode()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    private void ensureToolbar() {
        if (this.refreshToolbar) {
            ViewGroup viewGroup = null;
            this.toolbar = null;
            this.toolbarDirectChild = null;
            int i = this.toolbarId;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.toolbar = viewGroup2;
                if (viewGroup2 != null) {
                    this.toolbarDirectChild = findDirectChild(viewGroup2);
                }
            }
            if (this.toolbar == null) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i2);
                    if (isToolbar(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                    i2++;
                }
                this.toolbar = viewGroup;
            }
            updateDummyView();
            this.refreshToolbar = false;
        }
    }

    @InterfaceC6391
    private View findDirectChild(@InterfaceC6391 View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    @InterfaceC3897
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList colorStateListOrNull = MaterialColors.getColorStateListOrNull(getContext(), C1980R.attr.colorSurfaceContainer);
        if (colorStateListOrNull != null) {
            return colorStateListOrNull.getDefaultColor();
        }
        return this.elevationOverlayProvider.compositeOverlayWithThemeSurfaceColorIfNeeded(getResources().getDimension(C1980R.dimen.design_appbar_elevation));
    }

    private static int getHeightWithMargins(@InterfaceC6391 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private static CharSequence getToolbarTitle(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    @InterfaceC6391
    public static ViewOffsetHelper getViewOffsetHelper(@InterfaceC6391 View view) {
        ViewOffsetHelper viewOffsetHelper = (ViewOffsetHelper) view.getTag(C1980R.id.view_offset_helper);
        if (viewOffsetHelper != null) {
            return viewOffsetHelper;
        }
        ViewOffsetHelper viewOffsetHelper2 = new ViewOffsetHelper(view);
        view.setTag(C1980R.id.view_offset_helper, viewOffsetHelper2);
        return viewOffsetHelper2;
    }

    private boolean isTitleCollapseFadeMode() {
        return this.titleCollapseMode == 1;
    }

    private static boolean isToolbar(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    private boolean isToolbarChild(View view) {
        View view2 = this.toolbarDirectChild;
        if (view2 == null || view2 == this) {
            if (view != this.toolbar) {
                return false;
            }
        } else if (view != view2) {
            return false;
        }
        return true;
    }

    private void updateCollapsedBounds(boolean z) {
        int titleMarginStart;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        View view = this.toolbarDirectChild;
        if (view == null) {
            view = this.toolbar;
        }
        int maxOffsetForPinChild = getMaxOffsetForPinChild(view);
        DescendantOffsetUtils.getDescendantRect(this, this.dummyView, this.tmpRect);
        ViewGroup viewGroup = this.toolbar;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            titleMarginStart = toolbar.getTitleMarginStart();
            titleMarginEnd = toolbar.getTitleMarginEnd();
            titleMarginTop = toolbar.getTitleMarginTop();
            titleMarginBottom = toolbar.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            titleMarginStart = toolbar2.getTitleMarginStart();
            titleMarginEnd = toolbar2.getTitleMarginEnd();
            titleMarginTop = toolbar2.getTitleMarginTop();
            titleMarginBottom = toolbar2.getTitleMarginBottom();
        } else {
            titleMarginStart = 0;
            titleMarginBottom = 0;
            titleMarginEnd = 0;
            titleMarginTop = 0;
        }
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        Rect rect = this.tmpRect;
        int i = rect.left + (z ? titleMarginEnd : titleMarginStart);
        int i2 = rect.top + maxOffsetForPinChild + titleMarginTop;
        int i3 = rect.right;
        if (!z) {
            titleMarginStart = titleMarginEnd;
        }
        collapsingTextHelper.setCollapsedBounds(i, i2, i3 - titleMarginStart, (rect.bottom + maxOffsetForPinChild) - titleMarginBottom);
    }

    private void updateContentDescriptionFromTitle() {
        setContentDescription(getTitle());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void updateContentScrimBounds(@InterfaceC6391 Drawable drawable, int i, int i2) {
        updateContentScrimBounds(drawable, this.toolbar, i, i2);
    }

    private void updateDummyView() {
        View view;
        if (!this.collapsingTitleEnabled && (view = this.dummyView) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.dummyView);
            }
        }
        if (!this.collapsingTitleEnabled || this.toolbar == null) {
            return;
        }
        if (this.dummyView == null) {
            this.dummyView = new View(getContext());
        }
        if (this.dummyView.getParent() == null) {
            this.toolbar.addView(this.dummyView, -1, -1);
        }
    }

    private void updateTextBounds(int i, int i2, int i3, int i4, boolean z) {
        View view;
        if (!this.collapsingTitleEnabled || (view = this.dummyView) == null) {
            return;
        }
        boolean z2 = C8273.m27397(view) && this.dummyView.getVisibility() == 0;
        this.drawCollapsingTitle = z2;
        if (z2 || z) {
            boolean z3 = C8273.m27356(this) == 1;
            updateCollapsedBounds(z3);
            this.collapsingTextHelper.setExpandedBounds(z3 ? this.expandedMarginEnd : this.expandedMarginStart, this.tmpRect.top + this.expandedMarginTop, (i3 - i) - (z3 ? this.expandedMarginStart : this.expandedMarginEnd), (i4 - i2) - this.expandedMarginBottom);
            this.collapsingTextHelper.recalculate(z);
        }
    }

    private void updateTitleFromToolbarIfNeeded() {
        if (this.toolbar != null && this.collapsingTitleEnabled && TextUtils.isEmpty(this.collapsingTextHelper.getText())) {
            setTitle(getToolbarTitle(this.toolbar));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void draw(@InterfaceC6391 Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        ensureToolbar();
        if (this.toolbar == null && (drawable = this.contentScrim) != null && this.scrimAlpha > 0) {
            drawable.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
        }
        if (this.collapsingTitleEnabled && this.drawCollapsingTitle) {
            if (this.toolbar == null || this.contentScrim == null || this.scrimAlpha <= 0 || !isTitleCollapseFadeMode() || this.collapsingTextHelper.getExpansionFraction() >= this.collapsingTextHelper.getFadeModeThresholdFraction()) {
                this.collapsingTextHelper.draw(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.contentScrim.getBounds(), Region.Op.DIFFERENCE);
                this.collapsingTextHelper.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.statusBarScrim == null || this.scrimAlpha <= 0) {
            return;
        }
        C8472 c8472 = this.lastInsets;
        int iM28293 = c8472 != null ? c8472.m28293() : 0;
        if (iM28293 > 0) {
            this.statusBarScrim.setBounds(0, -this.currentOffset, getWidth(), iM28293 - this.currentOffset);
            this.statusBarScrim.mutate().setAlpha(this.scrimAlpha);
            this.statusBarScrim.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.contentScrim == null || this.scrimAlpha <= 0 || !isToolbarChild(view)) {
            z = false;
        } else {
            updateContentScrimBounds(this.contentScrim, view, getWidth(), getHeight());
            this.contentScrim.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarScrim;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        if (collapsingTextHelper != null) {
            state |= collapsingTextHelper.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public int getCollapsedTitleGravity() {
        return this.collapsingTextHelper.getCollapsedTextGravity();
    }

    public float getCollapsedTitleTextSize() {
        return this.collapsingTextHelper.getCollapsedTextSize();
    }

    @InterfaceC6391
    public Typeface getCollapsedTitleTypeface() {
        return this.collapsingTextHelper.getCollapsedTypeface();
    }

    @InterfaceC6490
    public Drawable getContentScrim() {
        return this.contentScrim;
    }

    public int getExpandedTitleGravity() {
        return this.collapsingTextHelper.getExpandedTextGravity();
    }

    public int getExpandedTitleMarginBottom() {
        return this.expandedMarginBottom;
    }

    public int getExpandedTitleMarginEnd() {
        return this.expandedMarginEnd;
    }

    public int getExpandedTitleMarginStart() {
        return this.expandedMarginStart;
    }

    public int getExpandedTitleMarginTop() {
        return this.expandedMarginTop;
    }

    public float getExpandedTitleTextSize() {
        return this.collapsingTextHelper.getExpandedTextSize();
    }

    @InterfaceC6391
    public Typeface getExpandedTitleTypeface() {
        return this.collapsingTextHelper.getExpandedTypeface();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @InterfaceC7113(23)
    public int getHyphenationFrequency() {
        return this.collapsingTextHelper.getHyphenationFrequency();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public int getLineCount() {
        return this.collapsingTextHelper.getLineCount();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @InterfaceC7113(23)
    public float getLineSpacingAdd() {
        return this.collapsingTextHelper.getLineSpacingAdd();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @InterfaceC7113(23)
    public float getLineSpacingMultiplier() {
        return this.collapsingTextHelper.getLineSpacingMultiplier();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.collapsingTextHelper.getMaxLines();
    }

    public final int getMaxOffsetForPinChild(@InterfaceC6391 View view) {
        return ((getHeight() - getViewOffsetHelper(view).getLayoutTop()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    public int getScrimAlpha() {
        return this.scrimAlpha;
    }

    public long getScrimAnimationDuration() {
        return this.scrimAnimationDuration;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.scrimVisibleHeightTrigger;
        if (i >= 0) {
            return i + this.topInsetApplied + this.extraMultilineHeight;
        }
        C8472 c8472 = this.lastInsets;
        int iM28293 = c8472 != null ? c8472.m28293() : 0;
        int iM27361 = C8273.m27361(this);
        return iM27361 > 0 ? Math.min((iM27361 * 2) + iM28293, getHeight()) : getHeight() / 3;
    }

    @InterfaceC6490
    public Drawable getStatusBarScrim() {
        return this.statusBarScrim;
    }

    @InterfaceC6490
    public CharSequence getTitle() {
        if (this.collapsingTitleEnabled) {
            return this.collapsingTextHelper.getText();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.titleCollapseMode;
    }

    @InterfaceC6490
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.collapsingTextHelper.getPositionInterpolator();
    }

    @InterfaceC6391
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.collapsingTextHelper.getTitleTextEllipsize();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public boolean isExtraMultilineHeightEnabled() {
        return this.extraMultilineHeightEnabled;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public boolean isForceApplySystemWindowInsetTop() {
        return this.forceApplySystemWindowInsetTop;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.collapsingTextHelper.isRtlTextDirectionHeuristicsEnabled();
    }

    public boolean isTitleEnabled() {
        return this.collapsingTitleEnabled;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            disableLiftOnScrollIfNeeded(appBarLayout);
            C8273.m27454(this, C8273.m27350(appBarLayout));
            if (this.onOffsetChangedListener == null) {
                this.onOffsetChangedListener = new OffsetUpdateListener();
            }
            appBarLayout.addOnOffsetChangedListener(this.onOffsetChangedListener);
            C8273.m27433(this);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(@InterfaceC6391 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.collapsingTextHelper.maybeUpdateFontWeightAdjustment(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.OnOffsetChangedListener onOffsetChangedListener = this.onOffsetChangedListener;
        if (onOffsetChangedListener != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).removeOnOffsetChangedListener(onOffsetChangedListener);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C8472 c8472 = this.lastInsets;
        if (c8472 != null) {
            int iM28293 = c8472.m28293();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!C8273.m27350(childAt) && childAt.getTop() < iM28293) {
                    C8273.m27415(childAt, iM28293);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            getViewOffsetHelper(getChildAt(i6)).onViewLayout();
        }
        updateTextBounds(i, i2, i3, i4, false);
        updateTitleFromToolbarIfNeeded();
        updateScrimVisibility();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            getViewOffsetHelper(getChildAt(i7)).applyOffsets();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        ensureToolbar();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C8472 c8472 = this.lastInsets;
        int iM28293 = c8472 != null ? c8472.m28293() : 0;
        if ((mode == 0 || this.forceApplySystemWindowInsetTop) && iM28293 > 0) {
            this.topInsetApplied = iM28293;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iM28293, 1073741824));
        }
        if (this.extraMultilineHeightEnabled && this.collapsingTextHelper.getMaxLines() > 1) {
            updateTitleFromToolbarIfNeeded();
            updateTextBounds(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int expandedLineCount = this.collapsingTextHelper.getExpandedLineCount();
            if (expandedLineCount > 1) {
                this.extraMultilineHeight = Math.round(this.collapsingTextHelper.getExpandedTextFullHeight()) * (expandedLineCount - 1);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.extraMultilineHeight, 1073741824));
            }
        }
        ViewGroup viewGroup = this.toolbar;
        if (viewGroup != null) {
            View view = this.toolbarDirectChild;
            if (view == null || view == this) {
                setMinimumHeight(getHeightWithMargins(viewGroup));
            } else {
                setMinimumHeight(getHeightWithMargins(view));
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.contentScrim;
        if (drawable != null) {
            updateContentScrimBounds(drawable, i, i2);
        }
    }

    public C8472 onWindowInsetChanged(@InterfaceC6391 C8472 c8472) {
        C8472 c84722 = C8273.m27350(this) ? c8472 : null;
        if (!C6499.m2995(this.lastInsets, c84722)) {
            this.lastInsets = c84722;
            requestLayout();
        }
        return c8472.m28278();
    }

    public void setCollapsedTitleGravity(int i) {
        this.collapsingTextHelper.setCollapsedTextGravity(i);
    }

    public void setCollapsedTitleTextAppearance(@InterfaceC7651 int i) {
        this.collapsingTextHelper.setCollapsedTextAppearance(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCollapsedTitleTextColor(@InterfaceC3897 int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextSize(float f) {
        this.collapsingTextHelper.setCollapsedTextSize(f);
    }

    public void setCollapsedTitleTypeface(@InterfaceC6490 Typeface typeface) {
        this.collapsingTextHelper.setCollapsedTypeface(typeface);
    }

    public void setContentScrim(@InterfaceC6490 Drawable drawable) {
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.contentScrim = drawableMutate;
            if (drawableMutate != null) {
                updateContentScrimBounds(drawableMutate, getWidth(), getHeight());
                this.contentScrim.setCallback(this);
                this.contentScrim.setAlpha(this.scrimAlpha);
            }
            C8273.m27425(this);
        }
    }

    public void setContentScrimColor(@InterfaceC3897 int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(@InterfaceC4525 int i) {
        setContentScrim(C4187.m12065(getContext(), i));
    }

    public void setExpandedTitleColor(@InterfaceC3897 int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.collapsingTextHelper.setExpandedTextGravity(i);
    }

    public void setExpandedTitleMargin(int i, int i2, int i3, int i4) {
        this.expandedMarginStart = i;
        this.expandedMarginTop = i2;
        this.expandedMarginEnd = i3;
        this.expandedMarginBottom = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.expandedMarginBottom = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.expandedMarginEnd = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.expandedMarginStart = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.expandedMarginTop = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@InterfaceC7651 int i) {
        this.collapsingTextHelper.setExpandedTextAppearance(i);
    }

    public void setExpandedTitleTextColor(@InterfaceC6391 ColorStateList colorStateList) {
        this.collapsingTextHelper.setExpandedTextColor(colorStateList);
    }

    public void setExpandedTitleTextSize(float f) {
        this.collapsingTextHelper.setExpandedTextSize(f);
    }

    public void setExpandedTitleTypeface(@InterfaceC6490 Typeface typeface) {
        this.collapsingTextHelper.setExpandedTypeface(typeface);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public void setExtraMultilineHeightEnabled(boolean z) {
        this.extraMultilineHeightEnabled = z;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.forceApplySystemWindowInsetTop = z;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @InterfaceC7113(23)
    public void setHyphenationFrequency(int i) {
        this.collapsingTextHelper.setHyphenationFrequency(i);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @InterfaceC7113(23)
    public void setLineSpacingAdd(float f) {
        this.collapsingTextHelper.setLineSpacingAdd(f);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @InterfaceC7113(23)
    public void setLineSpacingMultiplier(@InterfaceC4885(from = 0.0d) float f) {
        this.collapsingTextHelper.setLineSpacingMultiplier(f);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public void setMaxLines(int i) {
        this.collapsingTextHelper.setMaxLines(i);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.collapsingTextHelper.setRtlTextDirectionHeuristicsEnabled(z);
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.scrimAlpha) {
            if (this.contentScrim != null && (viewGroup = this.toolbar) != null) {
                C8273.m27425(viewGroup);
            }
            this.scrimAlpha = i;
            C8273.m27425(this);
        }
    }

    public void setScrimAnimationDuration(@InterfaceC5459(from = 0) long j) {
        this.scrimAnimationDuration = j;
    }

    public void setScrimVisibleHeightTrigger(@InterfaceC5459(from = 0) int i) {
        if (this.scrimVisibleHeightTrigger != i) {
            this.scrimVisibleHeightTrigger = i;
            updateScrimVisibility();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setScrimsShown(boolean z) {
        setScrimsShown(z, C8273.m27404(this) && !isInEditMode());
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @InterfaceC7113(23)
    public void setStaticLayoutBuilderConfigurer(@InterfaceC6490 StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        this.collapsingTextHelper.setStaticLayoutBuilderConfigurer(staticLayoutBuilderConfigurer);
    }

    public void setStatusBarScrim(@InterfaceC6490 Drawable drawable) {
        Drawable drawable2 = this.statusBarScrim;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.statusBarScrim = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.statusBarScrim.setState(getDrawableState());
                }
                C4520.m13234(this.statusBarScrim, C8273.m27356(this));
                this.statusBarScrim.setVisible(getVisibility() == 0, false);
                this.statusBarScrim.setCallback(this);
                this.statusBarScrim.setAlpha(this.scrimAlpha);
            }
            C8273.m27425(this);
        }
    }

    public void setStatusBarScrimColor(@InterfaceC3897 int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(@InterfaceC4525 int i) {
        setStatusBarScrim(C4187.m12065(getContext(), i));
    }

    public void setTitle(@InterfaceC6490 CharSequence charSequence) {
        this.collapsingTextHelper.setText(charSequence);
        updateContentDescriptionFromTitle();
    }

    public void setTitleCollapseMode(int i) {
        this.titleCollapseMode = i;
        boolean zIsTitleCollapseFadeMode = isTitleCollapseFadeMode();
        this.collapsingTextHelper.setFadeModeEnabled(zIsTitleCollapseFadeMode);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            disableLiftOnScrollIfNeeded((AppBarLayout) parent);
        }
        if (zIsTitleCollapseFadeMode && this.contentScrim == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(@InterfaceC6391 TextUtils.TruncateAt truncateAt) {
        this.collapsingTextHelper.setTitleTextEllipsize(truncateAt);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.collapsingTitleEnabled) {
            this.collapsingTitleEnabled = z;
            updateContentDescriptionFromTitle();
            updateDummyView();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@InterfaceC6490 TimeInterpolator timeInterpolator) {
        this.collapsingTextHelper.setPositionInterpolator(timeInterpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.statusBarScrim;
        if (drawable != null && drawable.isVisible() != z) {
            this.statusBarScrim.setVisible(z, false);
        }
        Drawable drawable2 = this.contentScrim;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.contentScrim.setVisible(z, false);
    }

    public final void updateScrimVisibility() {
        if (this.contentScrim == null && this.statusBarScrim == null) {
            return;
        }
        setScrimsShown(getHeight() + this.currentOffset < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public boolean verifyDrawable(@InterfaceC6391 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.contentScrim || drawable == this.statusBarScrim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CollapsingToolbarLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C1980R.attr.collapsingToolbarLayoutStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private void updateContentScrimBounds(@InterfaceC6391 Drawable drawable, @InterfaceC6490 View view, int i, int i2) {
        if (isTitleCollapseFadeMode() && view != null && this.collapsingTitleEnabled) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setCollapsedTitleTextColor(@InterfaceC6391 ColorStateList colorStateList) {
        this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setScrimsShown(boolean z, boolean z2) {
        if (this.scrimsAreShown != z) {
            if (z2) {
                animateScrim(z ? 255 : 0);
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.scrimsAreShown = z;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CollapsingToolbarLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.refreshToolbar = true;
        this.tmpRect = new Rect();
        this.scrimVisibleHeightTrigger = -1;
        this.topInsetApplied = 0;
        this.extraMultilineHeight = 0;
        Context context2 = getContext();
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.collapsingTextHelper = collapsingTextHelper;
        collapsingTextHelper.setTextSizeInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
        collapsingTextHelper.setRtlTextDirectionHeuristicsEnabled(false);
        this.elevationOverlayProvider = new ElevationOverlayProvider(context2);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C1980R.styleable.CollapsingToolbarLayout, i, i2, new int[0]);
        collapsingTextHelper.setExpandedTextGravity(typedArrayObtainStyledAttributes.getInt(C1980R.styleable.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        collapsingTextHelper.setCollapsedTextGravity(typedArrayObtainStyledAttributes.getInt(C1980R.styleable.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.expandedMarginBottom = dimensionPixelSize;
        this.expandedMarginEnd = dimensionPixelSize;
        this.expandedMarginTop = dimensionPixelSize;
        this.expandedMarginStart = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.expandedMarginStart = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.expandedMarginEnd = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.expandedMarginTop = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.expandedMarginBottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.collapsingTitleEnabled = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(typedArrayObtainStyledAttributes.getText(C1980R.styleable.CollapsingToolbarLayout_title));
        collapsingTextHelper.setExpandedTextAppearance(C1980R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        collapsingTextHelper.setCollapsedTextAppearance(C6898.C6908.f19244);
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            collapsingTextHelper.setExpandedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            collapsingTextHelper.setCollapsedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.CollapsingToolbarLayout_titleTextEllipsize)) {
            setTitleEllipsize(convertEllipsizeToTruncateAt(typedArrayObtainStyledAttributes.getInt(C1980R.styleable.CollapsingToolbarLayout_titleTextEllipsize, -1)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.CollapsingToolbarLayout_expandedTitleTextColor)) {
            collapsingTextHelper.setExpandedTextColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C1980R.styleable.CollapsingToolbarLayout_expandedTitleTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.CollapsingToolbarLayout_collapsedTitleTextColor)) {
            collapsingTextHelper.setCollapsedTextColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C1980R.styleable.CollapsingToolbarLayout_collapsedTitleTextColor));
        }
        this.scrimVisibleHeightTrigger = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.CollapsingToolbarLayout_maxLines)) {
            collapsingTextHelper.setMaxLines(typedArrayObtainStyledAttributes.getInt(C1980R.styleable.CollapsingToolbarLayout_maxLines, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.CollapsingToolbarLayout_titlePositionInterpolator)) {
            collapsingTextHelper.setPositionInterpolator(android.view.animation.AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.CollapsingToolbarLayout_titlePositionInterpolator, 0)));
        }
        this.scrimAnimationDuration = typedArrayObtainStyledAttributes.getInt(C1980R.styleable.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        this.scrimAnimationFadeInInterpolator = MotionUtils.resolveThemeInterpolator(context2, C1980R.attr.motionEasingStandardInterpolator, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        this.scrimAnimationFadeOutInterpolator = MotionUtils.resolveThemeInterpolator(context2, C1980R.attr.motionEasingStandardInterpolator, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(C1980R.styleable.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(C1980R.styleable.CollapsingToolbarLayout_statusBarScrim));
        setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(C1980R.styleable.CollapsingToolbarLayout_titleCollapseMode, 0));
        this.toolbarId = typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.CollapsingToolbarLayout_toolbarId, -1);
        this.forceApplySystemWindowInsetTop = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
        this.extraMultilineHeightEnabled = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        C8273.m27468(this, new InterfaceC6545() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.1
            @Override // Yue.InterfaceC6545
            public C8472 onApplyWindowInsets(View view, @InterfaceC6391 C8472 c8472) {
                return CollapsingToolbarLayout.this.onWindowInsetChanged(c8472);
            }
        });
    }

    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/widget/FrameLayout$LayoutParams; */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {
        public static final int COLLAPSE_MODE_OFF = 0;
        public static final int COLLAPSE_MODE_PARALLAX = 2;
        public static final int COLLAPSE_MODE_PIN = 1;
        private static final float DEFAULT_PARALLAX_MULTIPLIER = 0.5f;
        int collapseMode;
        float parallaxMult;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1980R.styleable.CollapsingToolbarLayout_Layout);
            this.collapseMode = typedArrayObtainStyledAttributes.getInt(C1980R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            setParallaxMultiplier(typedArrayObtainStyledAttributes.getFloat(C1980R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            typedArrayObtainStyledAttributes.recycle();
        }

        public int getCollapseMode() {
            return this.collapseMode;
        }

        public float getParallaxMultiplier() {
            return this.parallaxMult;
        }

        public void setCollapseMode(int i) {
            this.collapseMode = i;
        }

        public void setParallaxMultiplier(float f) {
            this.parallaxMult = f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2, i3);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(@InterfaceC6391 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(@InterfaceC6391 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        @InterfaceC7113(19)
        public LayoutParams(@InterfaceC6391 FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        @InterfaceC7113(19)
        public LayoutParams(@InterfaceC6391 LayoutParams layoutParams) {
            super((FrameLayout.LayoutParams) layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
            this.collapseMode = layoutParams.collapseMode;
            this.parallaxMult = layoutParams.parallaxMult;
        }
    }
}
