package com.youth.banner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.AbstractC1166o;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import com.youth.banner.adapter.BannerAdapter;
import com.youth.banner.config.BannerConfig;
import com.youth.banner.config.IndicatorConfig;
import com.youth.banner.indicator.Indicator;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.listener.OnPageChangeListener;
import com.youth.banner.transformer.MZScaleInTransformer;
import com.youth.banner.transformer.ScaleInTransformer;
import com.youth.banner.util.BannerLifecycleObserver;
import com.youth.banner.util.BannerLifecycleObserverAdapter;
import com.youth.banner.util.BannerUtils;
import com.youth.banner.util.ScrollSpeedManger;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.List;
import p000.AbstractC1516hv;
import p000.AbstractC2251mv;
import p000.InterfaceC1061Yn;

/* JADX INFO: loaded from: classes.dex */
public class Banner<T, BA extends BannerAdapter<T, ? extends AbstractC1166o>> extends FrameLayout implements BannerLifecycleObserver {
    public static final int HORIZONTAL = 0;
    public static final int INVALID_VALUE = -1;
    public static final int VERTICAL = 1;
    private int indicatorGravity;
    private int indicatorHeight;
    private int indicatorMargin;
    private int indicatorMarginBottom;
    private int indicatorMarginLeft;
    private int indicatorMarginRight;
    private int indicatorMarginTop;
    private int indicatorRadius;
    private int indicatorSpace;
    private boolean isIntercept;
    private BA mAdapter;
    private final AbstractC1516hv mAdapterDataObserver;
    private float mBannerRadius;
    private CompositePageTransformer mCompositePageTransformer;
    private Paint mImagePaint;
    private Indicator mIndicator;
    private boolean mIsAutoLoop;
    private boolean mIsInfiniteLoop;
    private boolean mIsViewPager2Drag;
    private AutoLoopTask mLoopTask;
    private long mLoopTime;
    private OnPageChangeListener mOnPageChangeListener;
    private int mOrientation;
    private Banner<T, BA>.BannerOnPageChangeCallback mPageChangeCallback;
    private boolean mRoundBottomLeft;
    private boolean mRoundBottomRight;
    private Paint mRoundPaint;
    private boolean mRoundTopLeft;
    private boolean mRoundTopRight;
    private int mScrollTime;
    private int mStartPosition;
    private float mStartX;
    private float mStartY;
    private int mTouchSlop;
    private ViewPager2 mViewPager2;
    private int normalColor;
    private int normalWidth;
    private int selectedColor;
    private int selectedWidth;

    public static class AutoLoopTask implements Runnable {
        private final WeakReference<Banner> reference;

        public AutoLoopTask(Banner r2) {
            this.reference = new WeakReference(r2);
        }

        @Override // java.lang.Runnable
        public void run() {
            Banner r0 = this.reference.get();
            if (r0 != null) goto L5;
            return;
        L5:
            if (Banner.access$200(r0) == false) goto L12;
            int r1 = r0.getItemCount();
            if (r1 == 0) goto L13;
            r0.setCurrentItem((r0.getCurrentItem() + 1) % r1);
            r0.postDelayed(Banner.access$300(r0), Banner.access$400(r0));
            return;
        L13:
            return;
        }
    }

    public class BannerOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {
        private boolean isScrolled;
        private int mTempPosition;
        final /* synthetic */ Banner this$0;

        public BannerOnPageChangeCallback(Banner r1) {
            this.this$0 = r1;
            this.mTempPosition = -1;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int r5) {
            if (r5 != 1) goto L5;
        L18:
            this.isScrolled = true;
        L20:
            if (Banner.access$000(this.this$0) == null) goto L23;
            Banner.access$000(this.this$0).onPageScrollStateChanged(r5);
        L23:
            if (this.this$0.getIndicator() == null) goto L26;
            this.this$0.getIndicator().onPageScrollStateChanged(r5);
            return;
        L26:
            return;
        L5:
            if (r5 == 2) goto L18;
            if (r5 != 0) goto L20;
            this.isScrolled = false;
            if (this.mTempPosition == (-1)) goto L20;
            if (Banner.access$100(this.this$0) == false) goto L20;
            int r2 = this.mTempPosition;
            if (r2 != 0) goto L16;
            Banner r0 = this.this$0;
            r0.setCurrentItem(r0.getRealCount(), false);
            goto L20
        L16:
            if (r2 != (this.this$0.getItemCount() - 1)) goto L20;
            this.this$0.setCurrentItem(1, false);
            goto L20
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int r3, float r4, int r5) {
            int r32 = BannerUtils.getRealPosition(this.this$0.isInfiniteLoop(), r3, this.this$0.getRealCount());
            if (Banner.access$000(this.this$0) == null) goto L8;
            if (r32 != (this.this$0.getCurrentItem() - 1)) goto L8;
            Banner.access$000(this.this$0).onPageScrolled(r32, r4, r5);
        L8:
            if (this.this$0.getIndicator() != null) goto L10;
            return;
        L10:
            if (r32 != (this.this$0.getCurrentItem() - 1)) goto L14;
            this.this$0.getIndicator().onPageScrolled(r32, r4, r5);
            return;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int r3) {
            if (this.isScrolled == false) goto L11;
            this.mTempPosition = r3;
            int r32 = BannerUtils.getRealPosition(this.this$0.isInfiniteLoop(), r3, this.this$0.getRealCount());
            if (Banner.access$000(this.this$0) == null) goto L8;
            Banner.access$000(this.this$0).onPageSelected(r32);
        L8:
            if (this.this$0.getIndicator() == null) goto L12;
            this.this$0.getIndicator().onPageSelected(r32);
            return;
        L12:
            return;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Orientation {
    }

    public Banner(Context r2) {
        this(r2, null);
    }

    public static /* synthetic */ OnPageChangeListener access$000(Banner r0) {
        return r0.mOnPageChangeListener;
    }

    public static /* synthetic */ boolean access$100(Banner r0) {
        return r0.mIsInfiniteLoop;
    }

    public static /* synthetic */ boolean access$200(Banner r0) {
        return r0.mIsAutoLoop;
    }

    public static /* synthetic */ AutoLoopTask access$300(Banner r0) {
        return r0.mLoopTask;
    }

    public static /* synthetic */ long access$400(Banner r2) {
        return r2.mLoopTime;
    }

    private void drawBottomLeft(Canvas r8) {
        int r0 = getHeight();
        Path r1 = new Path();
        float r02 = r0;
        r1.moveTo(0.0f, r02 - this.mBannerRadius);
        r1.lineTo(0.0f, r02);
        r1.lineTo(this.mBannerRadius, r02);
        float r4 = this.mBannerRadius;
        r1.arcTo(new RectF(0.0f, r02 - (r4 * 2.0f), r4 * 2.0f, r02), 90.0f, 90.0f);
        r1.close();
        r8.drawPath(r1, this.mRoundPaint);
    }

    private void drawBottomRight(Canvas r8) {
        int r0 = getHeight();
        int r1 = getWidth();
        Path r2 = new Path();
        float r12 = r1;
        float r02 = r0;
        r2.moveTo(r12 - this.mBannerRadius, r02);
        r2.lineTo(r12, r02);
        r2.lineTo(r12, r02 - this.mBannerRadius);
        float r4 = this.mBannerRadius;
        r2.arcTo(new RectF(r12 - (r4 * 2.0f), r02 - (r4 * 2.0f), r12, r02), 0.0f, 90.0f);
        r2.close();
        r8.drawPath(r2, this.mRoundPaint);
    }

    private void drawTopLeft(Canvas r7) {
        Path r0 = new Path();
        r0.moveTo(0.0f, this.mBannerRadius);
        r0.lineTo(0.0f, 0.0f);
        r0.lineTo(this.mBannerRadius, 0.0f);
        float r3 = this.mBannerRadius;
        r0.arcTo(new RectF(0.0f, 0.0f, r3 * 2.0f, r3 * 2.0f), -90.0f, -90.0f);
        r0.close();
        r7.drawPath(r0, this.mRoundPaint);
    }

    private void drawTopRight(Canvas r8) {
        int r0 = getWidth();
        Path r1 = new Path();
        float r02 = r0;
        r1.moveTo(r02 - this.mBannerRadius, 0.0f);
        r1.lineTo(r02, 0.0f);
        r1.lineTo(r02, this.mBannerRadius);
        float r4 = this.mBannerRadius;
        r1.arcTo(new RectF(r02 - (r4 * 2.0f), 0.0f, r02, r4 * 2.0f), 0.0f, -90.0f);
        r1.close();
        r8.drawPath(r1, this.mRoundPaint);
    }

    private void init(Context r4) {
        this.mTouchSlop = ViewConfiguration.get(r4).getScaledTouchSlop() / 2;
        this.mCompositePageTransformer = new CompositePageTransformer();
        this.mPageChangeCallback = new BannerOnPageChangeCallback(this);
        this.mLoopTask = new AutoLoopTask(this);
        ViewPager2 r0 = new ViewPager2(r4);
        this.mViewPager2 = r0;
        r0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.mViewPager2.setOffscreenPageLimit(2);
        this.mViewPager2.registerOnPageChangeCallback(this.mPageChangeCallback);
        this.mViewPager2.setPageTransformer(this.mCompositePageTransformer);
        ScrollSpeedManger.reflectLayoutManager(this);
        addView(this.mViewPager2);
        Paint r42 = new Paint();
        this.mRoundPaint = r42;
        r42.setColor(-1);
        this.mRoundPaint.setAntiAlias(true);
        this.mRoundPaint.setStyle(Paint.Style.FILL);
        this.mRoundPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Paint r43 = new Paint();
        this.mImagePaint = r43;
        r43.setXfermode(null);
    }

    private void initIndicator() {
        if (getIndicator() != null) goto L5;
        return;
    L5:
        if (getAdapter() != null) goto L8;
        return;
    L8:
        if (getIndicator().getIndicatorConfig().isAttachToBanner() == false) goto L10;
        removeIndicator();
        addView(getIndicator().getIndicatorView());
    L10:
        initIndicatorAttr();
        setIndicatorPageChange();
    }

    private void initIndicatorAttr() {
        int r0 = this.indicatorMargin;
        if (r0 == 0) goto L5;
        setIndicatorMargins(new IndicatorConfig.Margins(r0));
    L14:
        int r02 = this.indicatorSpace;
        if (r02 <= 0) goto L17;
        setIndicatorSpace(r02);
    L17:
        int r03 = this.indicatorGravity;
        if (r03 == 1) goto L20;
        setIndicatorGravity(r03);
    L20:
        int r04 = this.normalWidth;
        if (r04 <= 0) goto L23;
        setIndicatorNormalWidth(r04);
    L23:
        int r05 = this.selectedWidth;
        if (r05 <= 0) goto L26;
        setIndicatorSelectedWidth(r05);
    L26:
        int r06 = this.indicatorHeight;
        if (r06 <= 0) goto L29;
        setIndicatorHeight(r06);
    L29:
        int r07 = this.indicatorRadius;
        if (r07 <= 0) goto L32;
        setIndicatorRadius(r07);
    L32:
        setIndicatorNormalColor(this.normalColor);
        setIndicatorSelectedColor(this.selectedColor);
        return;
    L5:
        int r08 = this.indicatorMarginLeft;
        if (r08 == 0) goto L8;
    L13:
        setIndicatorMargins(new IndicatorConfig.Margins(r08, this.indicatorMarginTop, this.indicatorMarginRight, this.indicatorMarginBottom));
        goto L14
    L8:
        if (this.indicatorMarginTop != 0) goto L13;
        if (this.indicatorMarginRight != 0) goto L13;
        if (this.indicatorMarginBottom == 0) goto L14;
        goto L13
    }

    private void initTypedArray(Context r4, AttributeSet r5) {
        if (r5 == null) goto L4;
        TypedArray r42 = r4.obtainStyledAttributes(r5, C1288R.styleable.Banner);
        this.mBannerRadius = r42.getDimensionPixelSize(C1288R.styleable.Banner_banner_radius, 0);
        this.mLoopTime = r42.getInt(C1288R.styleable.Banner_banner_loop_time, BannerConfig.LOOP_TIME);
        this.mIsAutoLoop = r42.getBoolean(C1288R.styleable.Banner_banner_auto_loop, true);
        this.mIsInfiniteLoop = r42.getBoolean(C1288R.styleable.Banner_banner_infinite_loop, true);
        this.normalWidth = r42.getDimensionPixelSize(C1288R.styleable.Banner_banner_indicator_normal_width, BannerConfig.INDICATOR_NORMAL_WIDTH);
        this.selectedWidth = r42.getDimensionPixelSize(C1288R.styleable.Banner_banner_indicator_selected_width, BannerConfig.INDICATOR_SELECTED_WIDTH);
        this.normalColor = r42.getColor(C1288R.styleable.Banner_banner_indicator_normal_color, BannerConfig.INDICATOR_NORMAL_COLOR);
        this.selectedColor = r42.getColor(C1288R.styleable.Banner_banner_indicator_selected_color, BannerConfig.INDICATOR_SELECTED_COLOR);
        this.indicatorGravity = r42.getInt(C1288R.styleable.Banner_banner_indicator_gravity, 1);
        this.indicatorSpace = r42.getDimensionPixelSize(C1288R.styleable.Banner_banner_indicator_space, 0);
        this.indicatorMargin = r42.getDimensionPixelSize(C1288R.styleable.Banner_banner_indicator_margin, 0);
        this.indicatorMarginLeft = r42.getDimensionPixelSize(C1288R.styleable.Banner_banner_indicator_marginLeft, 0);
        this.indicatorMarginTop = r42.getDimensionPixelSize(C1288R.styleable.Banner_banner_indicator_marginTop, 0);
        this.indicatorMarginRight = r42.getDimensionPixelSize(C1288R.styleable.Banner_banner_indicator_marginRight, 0);
        this.indicatorMarginBottom = r42.getDimensionPixelSize(C1288R.styleable.Banner_banner_indicator_marginBottom, 0);
        this.indicatorHeight = r42.getDimensionPixelSize(C1288R.styleable.Banner_banner_indicator_height, BannerConfig.INDICATOR_HEIGHT);
        this.indicatorRadius = r42.getDimensionPixelSize(C1288R.styleable.Banner_banner_indicator_radius, BannerConfig.INDICATOR_RADIUS);
        this.mOrientation = r42.getInt(C1288R.styleable.Banner_banner_orientation, 0);
        this.mRoundTopLeft = r42.getBoolean(C1288R.styleable.Banner_banner_round_top_left, false);
        this.mRoundTopRight = r42.getBoolean(C1288R.styleable.Banner_banner_round_top_right, false);
        this.mRoundBottomLeft = r42.getBoolean(C1288R.styleable.Banner_banner_round_bottom_left, false);
        this.mRoundBottomRight = r42.getBoolean(C1288R.styleable.Banner_banner_round_bottom_right, false);
        r42.recycle();
    L4:
        setOrientation(this.mOrientation);
        setInfiniteLoop();
    }

    private void setInfiniteLoop() {
        int r1 = 0;
        if (isInfiniteLoop() == true) goto L6;
        isAutoLoop(false);
    L6:
        if (isInfiniteLoop() == false) goto L8;
        r1 = this.mStartPosition;
    L8:
        setStartPosition(r1);
    }

    private void setRecyclerViewPadding(int r1) {
        setRecyclerViewPadding(r1, r1);
    }

    public Banner addBannerLifecycleObserver(InterfaceC1061Yn r3) {
        if (r3 == null) goto L4;
        r3.getLifecycle().mo1555a(new BannerLifecycleObserverAdapter(r3, this));
    L4:
        return this;
    }

    public Banner addItemDecoration(AbstractC2251mv r2) {
        getViewPager2().addItemDecoration(r2);
        return this;
    }

    public Banner addOnPageChangeListener(OnPageChangeListener r1) {
        this.mOnPageChangeListener = r1;
        return this;
    }

    public Banner addPageTransformer(ViewPager2.PageTransformer r2) {
        this.mCompositePageTransformer.addTransformer(r2);
        return this;
    }

    public void destroy() {
        if (getViewPager2() != null) goto L5;
    L7:
        stop();
        return;
    L5:
        if (this.mPageChangeCallback == null) goto L7;
        getViewPager2().unregisterOnPageChangeCallback(this.mPageChangeCallback);
        this.mPageChangeCallback = null;
        goto L7
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas r5) {
        if (this.mBannerRadius <= 0.0f) goto L28;
        r5.saveLayer(new RectF(0.0f, 0.0f, r5.getWidth(), r5.getHeight()), this.mImagePaint, 31);
        super.dispatchDraw(r5);
        if (this.mRoundTopRight == true) goto L15;
        if (this.mRoundTopLeft == true) goto L15;
        if (this.mRoundBottomRight == true) goto L15;
        if (this.mRoundBottomLeft == true) goto L15;
        drawTopLeft(r5);
        drawTopRight(r5);
        drawBottomLeft(r5);
        drawBottomRight(r5);
        r5.restore();
        return;
    L15:
        if (this.mRoundTopLeft == false) goto L18;
        drawTopLeft(r5);
    L18:
        if (this.mRoundTopRight == false) goto L21;
        drawTopRight(r5);
    L21:
        if (this.mRoundBottomLeft == false) goto L24;
        drawBottomLeft(r5);
    L24:
        if (this.mRoundBottomRight == false) goto L26;
        drawBottomRight(r5);
    L26:
        r5.restore();
        return;
    L28:
        super.dispatchDraw(r5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent r3) {
        if (getViewPager2().isUserInputEnabled() == false) goto L5;
        int r0 = r3.getActionMasked();
        if (r0 != 1) goto L9;
    L15:
        start();
    L17:
        return super.dispatchTouchEvent(r3);
    L9:
        if (r0 == 3) goto L15;
        if (r0 == 4) goto L15;
        if (r0 != 0) goto L17;
        stop();
        goto L17
    L5:
        return super.dispatchTouchEvent(r3);
    }

    public BannerAdapter getAdapter() {
        return this.mAdapter;
    }

    public int getCurrentItem() {
        return getViewPager2().getCurrentItem();
    }

    public Indicator getIndicator() {
        return this.mIndicator;
    }

    public IndicatorConfig getIndicatorConfig() {
        if (getIndicator() != null) goto L5;
        return null;
    L5:
        return getIndicator().getIndicatorConfig();
    }

    public int getItemCount() {
        if (getAdapter() != null) goto L5;
        return 0;
    L5:
        return getAdapter().getItemCount();
    }

    public int getRealCount() {
        if (getAdapter() != null) goto L5;
        return 0;
    L5:
        return getAdapter().getRealCount();
    }

    public int getScrollTime() {
        return this.mScrollTime;
    }

    public int getStartPosition() {
        return this.mStartPosition;
    }

    public ViewPager2 getViewPager2() {
        return this.mViewPager2;
    }

    public Banner isAutoLoop(boolean r1) {
        this.mIsAutoLoop = r1;
        return this;
    }

    public boolean isInfiniteLoop() {
        return this.mIsInfiniteLoop;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        start();
    }

    @Override // com.youth.banner.util.BannerLifecycleObserver
    public void onDestroy(InterfaceC1061Yn r1) {
        destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stop();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent r6) {
        if (getViewPager2().isUserInputEnabled() == false) goto L38;
        if (this.isIntercept == false) goto L38;
        int r0 = r6.getAction();
        boolean r1 = true;
        if (r0 != 0) goto L10;
        this.mStartX = r6.getX();
        this.mStartY = r6.getY();
        getParent().requestDisallowInterceptTouchEvent(true);
    L36:
        return super.onInterceptTouchEvent(r6);
    L10:
        if (r0 != 1) goto L12;
    L33:
        getParent().requestDisallowInterceptTouchEvent(false);
        goto L36
    L12:
        if (r0 != 2) goto L14;
        float r02 = r6.getX();
        float r3 = r6.getY();
        float r03 = Math.abs(r02 - this.mStartX);
        float r32 = Math.abs(r3 - this.mStartY);
        if (getViewPager2().getOrientation() != 0) goto L26;
        if (r03 > this.mTouchSlop) goto L21;
    L23:
        r1 = false;
    L24:
        this.mIsViewPager2Drag = r1;
    L32:
        getParent().requestDisallowInterceptTouchEvent(this.mIsViewPager2Drag);
        goto L36
    L21:
        if (r03 <= r32) goto L23;
    L26:
        if (r32 > this.mTouchSlop) goto L28;
    L30:
        r1 = false;
    L31:
        this.mIsViewPager2Drag = r1;
        goto L32
    L28:
        if (r32 <= r03) goto L30;
    L14:
        if (r0 == 3) goto L33;
    L38:
        return super.onInterceptTouchEvent(r6);
    }

    @Override // com.youth.banner.util.BannerLifecycleObserver
    public void onStart(InterfaceC1061Yn r1) {
        start();
    }

    @Override // com.youth.banner.util.BannerLifecycleObserver
    public void onStop(InterfaceC1061Yn r1) {
        stop();
    }

    public Banner removeIndicator() {
        if (getIndicator() == null) goto L5;
        removeView(getIndicator().getIndicatorView());
    L5:
        return this;
    }

    public Banner removeTransformer(ViewPager2.PageTransformer r2) {
        this.mCompositePageTransformer.removeTransformer(r2);
        return this;
    }

    public Banner setAdapter(BA r4) {
        if (r4 == null) goto L9;
        this.mAdapter = r4;
        if (isInfiniteLoop() == true) goto L6;
        getAdapter().setIncreaseCount(0);
    L6:
        getAdapter().registerAdapterDataObserver(this.mAdapterDataObserver);
        this.mViewPager2.setAdapter(r4);
        setCurrentItem(this.mStartPosition, false);
        initIndicator();
        return this;
    L9:
        throw new NullPointerException(getContext().getString(C1288R.string.banner_adapter_null_error));
    }

    public Banner setBannerGalleryEffect(int r2, int r3) {
        return setBannerGalleryEffect(r2, r3, 0.85f);
    }

    public Banner setBannerGalleryMZ(int r2) {
        return setBannerGalleryMZ(r2, 0.88f);
    }

    public Banner setBannerRound(float r1) {
        this.mBannerRadius = r1;
        return this;
    }

    public Banner setBannerRound2(float r1) {
        BannerUtils.setBannerRound(this, r1);
        return this;
    }

    public Banner setCurrentItem(int r2) {
        return setCurrentItem(r2, true);
    }

    public Banner setDatas(List<T> r2) {
        if (getAdapter() == null) goto L5;
        getAdapter().setDatas(r2);
        setCurrentItem(this.mStartPosition, false);
        setIndicatorPageChange();
        start();
    L5:
        return this;
    }

    public Banner setIndicator(Indicator r2) {
        return setIndicator(r2, true);
    }

    public Banner setIndicatorGravity(int r2) {
        if (getIndicatorConfig() != null) goto L5;
    L7:
        return this;
    L5:
        if (getIndicatorConfig().isAttachToBanner() == false) goto L7;
        getIndicatorConfig().setGravity(r2);
        getIndicator().getIndicatorView().postInvalidate();
        goto L7
    }

    public Banner setIndicatorHeight(int r2) {
        if (getIndicatorConfig() == null) goto L5;
        getIndicatorConfig().setHeight(r2);
    L5:
        return this;
    }

    public Banner setIndicatorMargins(IndicatorConfig.Margins r2) {
        if (getIndicatorConfig() != null) goto L5;
    L7:
        return this;
    L5:
        if (getIndicatorConfig().isAttachToBanner() == false) goto L7;
        getIndicatorConfig().setMargins(r2);
        getIndicator().getIndicatorView().requestLayout();
        goto L7
    }

    public Banner setIndicatorNormalColor(int r2) {
        if (getIndicatorConfig() == null) goto L5;
        getIndicatorConfig().setNormalColor(r2);
    L5:
        return this;
    }

    public Banner setIndicatorNormalColorRes(int r2) {
        setIndicatorNormalColor(getContext().getColor(r2));
        return this;
    }

    public Banner setIndicatorNormalWidth(int r2) {
        if (getIndicatorConfig() == null) goto L5;
        getIndicatorConfig().setNormalWidth(r2);
    L5:
        return this;
    }

    public Banner setIndicatorPageChange() {
        if (getIndicator() == null) goto L5;
        int r0 = BannerUtils.getRealPosition(isInfiniteLoop(), getCurrentItem(), getRealCount());
        getIndicator().onPageChanged(getRealCount(), r0);
    L5:
        return this;
    }

    public Banner setIndicatorRadius(int r2) {
        if (getIndicatorConfig() == null) goto L5;
        getIndicatorConfig().setRadius(r2);
    L5:
        return this;
    }

    public Banner setIndicatorSelectedColor(int r2) {
        if (getIndicatorConfig() == null) goto L5;
        getIndicatorConfig().setSelectedColor(r2);
    L5:
        return this;
    }

    public Banner setIndicatorSelectedColorRes(int r2) {
        setIndicatorSelectedColor(getContext().getColor(r2));
        return this;
    }

    public Banner setIndicatorSelectedWidth(int r2) {
        if (getIndicatorConfig() == null) goto L5;
        getIndicatorConfig().setSelectedWidth(r2);
    L5:
        return this;
    }

    public Banner setIndicatorSpace(int r2) {
        if (getIndicatorConfig() == null) goto L5;
        getIndicatorConfig().setIndicatorSpace(r2);
    L5:
        return this;
    }

    public Banner setIndicatorWidth(int r2, int r3) {
        if (getIndicatorConfig() == null) goto L5;
        getIndicatorConfig().setNormalWidth(r2);
        getIndicatorConfig().setSelectedWidth(r3);
    L5:
        return this;
    }

    public Banner setIntercept(boolean r1) {
        this.isIntercept = r1;
        return this;
    }

    public Banner setLoopTime(long r1) {
        this.mLoopTime = r1;
        return this;
    }

    public Banner setOnBannerListener(OnBannerListener<T> r2) {
        if (getAdapter() == null) goto L5;
        getAdapter().setOnBannerListener(r2);
    L5:
        return this;
    }

    public Banner setOrientation(int r2) {
        getViewPager2().setOrientation(r2);
        return this;
    }

    public Banner setPageTransformer(ViewPager2.PageTransformer r2) {
        getViewPager2().setPageTransformer(r2);
        return this;
    }

    public Banner setScrollTime(int r1) {
        this.mScrollTime = r1;
        return this;
    }

    public Banner setStartPosition(int r1) {
        this.mStartPosition = r1;
        return this;
    }

    public Banner setTouchSlop(int r1) {
        this.mTouchSlop = r1;
        return this;
    }

    public Banner setUserInputEnabled(boolean r2) {
        getViewPager2().setUserInputEnabled(r2);
        return this;
    }

    public Banner start() {
        if (this.mIsAutoLoop == false) goto L5;
        stop();
        postDelayed(this.mLoopTask, this.mLoopTime);
    L5:
        return this;
    }

    public Banner stop() {
        if (this.mIsAutoLoop == false) goto L5;
        removeCallbacks(this.mLoopTask);
    L5:
        return this;
    }

    public Banner(Context r2, AttributeSet r3) {
        this(r2, r3, 0);
    }

    private void setRecyclerViewPadding(int r5, int r6) {
        RecyclerView r0 = (RecyclerView) getViewPager2().getChildAt(0);
        if (getViewPager2().getOrientation() != 1) goto L5;
        r0.setPadding(this.mViewPager2.getPaddingLeft(), r5, this.mViewPager2.getPaddingRight(), r6);
    L6:
        r0.setClipToPadding(false);
        return;
    L5:
        r0.setPadding(r5, this.mViewPager2.getPaddingTop(), r6, this.mViewPager2.getPaddingBottom());
        goto L6
    }

    public Banner addItemDecoration(AbstractC2251mv r2, int r3) {
        getViewPager2().addItemDecoration(r2, r3);
        return this;
    }

    public Banner setBannerGalleryEffect(int r2, int r3, int r4) {
        return setBannerGalleryEffect(r2, r3, r4, 0.85f);
    }

    public Banner setBannerGalleryMZ(int r2, float r3) {
        if (r3 < 1.0f) goto L5;
    L7:
        setRecyclerViewPadding(BannerUtils.dp2px(r2));
        return this;
    L5:
        if (r3 <= 0.0f) goto L7;
        addPageTransformer(new MZScaleInTransformer(r3));
        goto L7
    }

    public Banner setCurrentItem(int r2, boolean r3) {
        getViewPager2().setCurrentItem(r2, r3);
        return this;
    }

    public Banner setIndicator(Indicator r2, boolean r3) {
        removeIndicator();
        r2.getIndicatorConfig().setAttachToBanner(r3);
        this.mIndicator = r2;
        initIndicator();
        return this;
    }

    public Banner(Context r3, AttributeSet r4, int r5) {
        super(r3, r4, r5);
        this.mIsInfiniteLoop = true;
        this.mIsAutoLoop = true;
        this.mLoopTime = 3000;
        this.mScrollTime = BannerConfig.SCROLL_TIME;
        this.mStartPosition = 1;
        this.mBannerRadius = 0.0f;
        this.normalWidth = BannerConfig.INDICATOR_NORMAL_WIDTH;
        this.selectedWidth = BannerConfig.INDICATOR_SELECTED_WIDTH;
        this.normalColor = BannerConfig.INDICATOR_NORMAL_COLOR;
        this.selectedColor = BannerConfig.INDICATOR_SELECTED_COLOR;
        this.indicatorGravity = 1;
        this.indicatorHeight = BannerConfig.INDICATOR_HEIGHT;
        this.indicatorRadius = BannerConfig.INDICATOR_RADIUS;
        this.mOrientation = 0;
        this.isIntercept = true;
        this.mAdapterDataObserver = new C12871(this);
        init(r3);
        initTypedArray(r3, r4);
    }

    public Banner setBannerGalleryEffect(int r1, int r2, float r3) {
        return setBannerGalleryEffect(r1, r1, r2, r3);
    }

    public Banner setBannerGalleryEffect(int r3, int r4, int r5, float r6) {
        if (r5 <= 0) goto L5;
        addPageTransformer(new MarginPageTransformer(BannerUtils.dp2px(r5)));
    L5:
        if (r6 < 1.0f) goto L7;
    L9:
        int r62 = 0;
        if (r3 <= 0) goto L12;
        int r32 = BannerUtils.dp2px(r3 + r5);
    L13:
        if (r4 <= 0) goto L15;
        r62 = BannerUtils.dp2px(r4 + r5);
    L15:
        setRecyclerViewPadding(r32, r62);
        return this;
    L12:
        r32 = 0;
        goto L13
    L7:
        if (r6 <= 0.0f) goto L9;
        addPageTransformer(new ScaleInTransformer(r6));
        goto L9
    }

    public Banner setAdapter(BA r1, boolean r2) {
        this.mIsInfiniteLoop = r2;
        setInfiniteLoop();
        setAdapter(r1);
        return this;
    }
}
