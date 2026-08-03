package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends android.view.ViewGroup implements Yue.InterfaceC4120 {
    private static final java.lang.String TAG = "Toolbar";
    private androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353 mActionMenuPresenterCallback;
    private android.window.OnBackInvokedCallback mBackInvokedCallback;
    private boolean mBackInvokedCallbackEnabled;
    private android.window.OnBackInvokedDispatcher mBackInvokedDispatcher;
    int mButtonGravity;
    android.widget.ImageButton mCollapseButtonView;
    private java.lang.CharSequence mCollapseDescription;
    private android.graphics.drawable.Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private Yue.C5442 mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    android.view.View mExpandedActionView;
    private androidx.appcompat.widget.Toolbar.C7405 mExpandedMenuPresenter;
    private int mGravity;
    private final java.util.ArrayList<android.view.View> mHiddenViews;
    private android.widget.ImageView mLogoView;
    private int mMaxButtonHeight;
    androidx.appcompat.view.menu.C7343.InterfaceC7344 mMenuBuilderCallback;
    final Yue.C4123 mMenuHostHelper;
    androidx.appcompat.widget.ActionMenuView mMenuView;
    private final androidx.appcompat.widget.ActionMenuView.InterfaceC7372 mMenuViewItemClickListener;
    private android.widget.ImageButton mNavButtonView;
    androidx.appcompat.widget.Toolbar.InterfaceC7407 mOnMenuItemClickListener;
    private androidx.appcompat.widget.C7411 mOuterActionMenuPresenter;
    private android.content.Context mPopupContext;
    private int mPopupTheme;
    private java.util.ArrayList<android.view.MenuItem> mProvidedMenuItems;
    private final java.lang.Runnable mShowOverflowMenuRunnable;
    private java.lang.CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private android.content.res.ColorStateList mSubtitleTextColor;
    private android.widget.TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final java.util.ArrayList<android.view.View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private java.lang.CharSequence mTitleText;
    private int mTitleTextAppearance;
    private android.content.res.ColorStateList mTitleTextColor;
    private android.widget.TextView mTitleTextView;
    private androidx.appcompat.widget.C7445 mWrapper;

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$ۥ, reason: contains not printable characters */
    public class C7400 implements androidx.appcompat.widget.ActionMenuView.InterfaceC7372 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.Toolbar f25736;

        public C7400(androidx.appcompat.widget.Toolbar r1) {
                r0 = this;
                r0.f25736 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC7372
        public boolean onMenuItemClick(android.view.MenuItem r2) {
                r1 = this;
                androidx.appcompat.widget.Toolbar r0 = r1.f25736
                Yue.ۥۡ۠ۦۢ r0 = r0.mMenuHostHelper
                boolean r0 = r0.m16166(r2)
                if (r0 == 0) goto Lc
                r2 = 1
                return r2
            Lc:
                androidx.appcompat.widget.Toolbar r0 = r1.f25736
                androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۢ r0 = r0.mOnMenuItemClickListener
                if (r0 == 0) goto L17
                boolean r2 = r0.onMenuItemClick(r2)
                return r2
            L17:
                r2 = 0
                return r2
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$ۥ۟, reason: contains not printable characters */
    public class RunnableC7401 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.Toolbar f25737;

        public RunnableC7401(androidx.appcompat.widget.Toolbar r1) {
                r0 = this;
                r0.f25737 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.appcompat.widget.Toolbar r0 = r1.f25737
                r0.showOverflowMenu()
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$ۥ۟۟, reason: contains not printable characters */
    public class C7402 implements androidx.appcompat.view.menu.C7343.InterfaceC7344 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.Toolbar f25738;

        public C7402(androidx.appcompat.widget.Toolbar r1) {
                r0 = this;
                r0.f25738 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.C7343.InterfaceC7344
        public boolean onMenuItemSelected(@Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r2, @Yue.InterfaceC4410 android.view.MenuItem r3) {
                r1 = this;
                androidx.appcompat.widget.Toolbar r0 = r1.f25738
                androidx.appcompat.view.menu.ۥ۟۟۟۟$ۥ r0 = r0.mMenuBuilderCallback
                if (r0 == 0) goto Le
                boolean r2 = r0.onMenuItemSelected(r2, r3)
                if (r2 == 0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
                return r2
        }

        @Override // androidx.appcompat.view.menu.C7343.InterfaceC7344
        public void onMenuModeChange(@Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r2) {
                r1 = this;
                androidx.appcompat.widget.Toolbar r0 = r1.f25738
                androidx.appcompat.widget.ActionMenuView r0 = r0.mMenuView
                boolean r0 = r0.m28291()
                if (r0 != 0) goto L11
                androidx.appcompat.widget.Toolbar r0 = r1.f25738
                Yue.ۥۡ۠ۦۢ r0 = r0.mMenuHostHelper
                r0.m16167(r2)
            L11:
                androidx.appcompat.widget.Toolbar r0 = r1.f25738
                androidx.appcompat.view.menu.ۥ۟۟۟۟$ۥ r0 = r0.mMenuBuilderCallback
                if (r0 == 0) goto L1a
                r0.onMenuModeChange(r2)
            L1a:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$ۥ۟۟۟, reason: contains not printable characters */
    public class ViewOnClickListenerC7403 implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.Toolbar f25739;

        public ViewOnClickListenerC7403(androidx.appcompat.widget.Toolbar r1) {
                r0 = this;
                r0.f25739 = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                androidx.appcompat.widget.Toolbar r1 = r0.f25739
                r1.collapseActionView()
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(33)
    public static class C7404 {
        public C7404() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.window.OnBackInvokedDispatcher m28401(@Yue.InterfaceC4410 android.view.View r0) {
                android.window.OnBackInvokedDispatcher r0 = r0.findOnBackInvokedDispatcher()
                return r0
        }

        @Yue.InterfaceC4410
        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.window.OnBackInvokedCallback m28402(@Yue.InterfaceC4410 java.lang.Runnable r1) {
                java.util.Objects.requireNonNull(r1)
                Yue.ۥۢۡۨ r0 = new Yue.ۥۢۡۨ
                r0.<init>(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m28403(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4410 java.lang.Object r2) {
                android.window.OnBackInvokedDispatcher r1 = (android.window.OnBackInvokedDispatcher) r1
                r0 = 1000000(0xf4240, float:1.401298E-39)
                android.window.OnBackInvokedCallback r2 = (android.window.OnBackInvokedCallback) r2
                r1.registerOnBackInvokedCallback(r0, r2)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m28404(@Yue.InterfaceC4410 java.lang.Object r0, @Yue.InterfaceC4410 java.lang.Object r1) {
                android.window.OnBackInvokedDispatcher r0 = (android.window.OnBackInvokedDispatcher) r0
                android.window.OnBackInvokedCallback r1 = (android.window.OnBackInvokedCallback) r1
                r0.unregisterOnBackInvokedCallback(r1)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$ۥ۟۟۟۠, reason: contains not printable characters */
    public class C7405 implements androidx.appcompat.view.menu.InterfaceC7352 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public androidx.appcompat.view.menu.C7343 f25740;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public androidx.appcompat.view.menu.C7348 f25741;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.Toolbar f25742;

        public C7405(androidx.appcompat.widget.Toolbar r1) {
                r0 = this;
                r0.f25742 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.InterfaceC7352
        public boolean collapseItemActionView(androidx.appcompat.view.menu.C7343 r2, androidx.appcompat.view.menu.C7348 r3) {
                r1 = this;
                androidx.appcompat.widget.Toolbar r2 = r1.f25742
                android.view.View r2 = r2.mExpandedActionView
                boolean r0 = r2 instanceof Yue.InterfaceC1203
                if (r0 == 0) goto Ld
                Yue.ۥ۟ۥۡ r2 = (Yue.InterfaceC1203) r2
                r2.mo6174()
            Ld:
                androidx.appcompat.widget.Toolbar r2 = r1.f25742
                android.view.View r0 = r2.mExpandedActionView
                r2.removeView(r0)
                androidx.appcompat.widget.Toolbar r2 = r1.f25742
                android.widget.ImageButton r0 = r2.mCollapseButtonView
                r2.removeView(r0)
                androidx.appcompat.widget.Toolbar r2 = r1.f25742
                r0 = 0
                r2.mExpandedActionView = r0
                r2.addChildrenForExpandedActionView()
                r1.f25741 = r0
                androidx.appcompat.widget.Toolbar r2 = r1.f25742
                r2.requestLayout()
                r2 = 0
                r3.m28231(r2)
                androidx.appcompat.widget.Toolbar r2 = r1.f25742
                r2.updateBackInvokedCallbackState()
                r2 = 1
                return r2
        }

        @Override // androidx.appcompat.view.menu.InterfaceC7352
        public boolean expandItemActionView(androidx.appcompat.view.menu.C7343 r4, androidx.appcompat.view.menu.C7348 r5) {
                r3 = this;
                androidx.appcompat.widget.Toolbar r4 = r3.f25742
                r4.ensureCollapseButtonView()
                androidx.appcompat.widget.Toolbar r4 = r3.f25742
                android.widget.ImageButton r4 = r4.mCollapseButtonView
                android.view.ViewParent r4 = r4.getParent()
                androidx.appcompat.widget.Toolbar r0 = r3.f25742
                if (r4 == r0) goto L23
                boolean r1 = r4 instanceof android.view.ViewGroup
                if (r1 == 0) goto L1c
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                android.widget.ImageButton r0 = r0.mCollapseButtonView
                r4.removeView(r0)
            L1c:
                androidx.appcompat.widget.Toolbar r4 = r3.f25742
                android.widget.ImageButton r0 = r4.mCollapseButtonView
                r4.addView(r0)
            L23:
                androidx.appcompat.widget.Toolbar r4 = r3.f25742
                android.view.View r0 = r5.getActionView()
                r4.mExpandedActionView = r0
                r3.f25741 = r5
                androidx.appcompat.widget.Toolbar r4 = r3.f25742
                android.view.View r4 = r4.mExpandedActionView
                android.view.ViewParent r4 = r4.getParent()
                androidx.appcompat.widget.Toolbar r0 = r3.f25742
                if (r4 == r0) goto L65
                boolean r1 = r4 instanceof android.view.ViewGroup
                if (r1 == 0) goto L44
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                android.view.View r0 = r0.mExpandedActionView
                r4.removeView(r0)
            L44:
                androidx.appcompat.widget.Toolbar r4 = r3.f25742
                androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r4 = r4.generateDefaultLayoutParams()
                androidx.appcompat.widget.Toolbar r0 = r3.f25742
                int r1 = r0.mButtonGravity
                r1 = r1 & 112(0x70, float:1.57E-43)
                r2 = 8388611(0x800003, float:1.1754948E-38)
                r1 = r1 | r2
                r4.f25109 = r1
                r1 = 2
                r4.f25746 = r1
                android.view.View r0 = r0.mExpandedActionView
                r0.setLayoutParams(r4)
                androidx.appcompat.widget.Toolbar r4 = r3.f25742
                android.view.View r0 = r4.mExpandedActionView
                r4.addView(r0)
            L65:
                androidx.appcompat.widget.Toolbar r4 = r3.f25742
                r4.removeChildrenForExpandedActionView()
                androidx.appcompat.widget.Toolbar r4 = r3.f25742
                r4.requestLayout()
                r4 = 1
                r5.m28231(r4)
                androidx.appcompat.widget.Toolbar r5 = r3.f25742
                android.view.View r5 = r5.mExpandedActionView
                boolean r0 = r5 instanceof Yue.InterfaceC1203
                if (r0 == 0) goto L80
                Yue.ۥ۟ۥۡ r5 = (Yue.InterfaceC1203) r5
                r5.mo6173()
            L80:
                androidx.appcompat.widget.Toolbar r5 = r3.f25742
                r5.updateBackInvokedCallbackState()
                return r4
        }

        @Override // androidx.appcompat.view.menu.InterfaceC7352
        public boolean flagActionItems() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.view.menu.InterfaceC7352
        public int getId() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.view.menu.InterfaceC7352
        public androidx.appcompat.view.menu.InterfaceC7354 getMenuView(android.view.ViewGroup r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // androidx.appcompat.view.menu.InterfaceC7352
        public void initForMenu(android.content.Context r2, androidx.appcompat.view.menu.C7343 r3) {
                r1 = this;
                androidx.appcompat.view.menu.ۥ۟۟۟۟ r2 = r1.f25740
                if (r2 == 0) goto Lb
                androidx.appcompat.view.menu.ۥ۟۟۟ۢ r0 = r1.f25741
                if (r0 == 0) goto Lb
                r2.collapseItemActionView(r0)
            Lb:
                r1.f25740 = r3
                return
        }

        @Override // androidx.appcompat.view.menu.InterfaceC7352
        public void onCloseMenu(androidx.appcompat.view.menu.C7343 r1, boolean r2) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.view.menu.InterfaceC7352
        public void onRestoreInstanceState(android.os.Parcelable r1) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.view.menu.InterfaceC7352
        public android.os.Parcelable onSaveInstanceState() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.view.menu.InterfaceC7352
        public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuC7359 r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // androidx.appcompat.view.menu.InterfaceC7352
        public void setCallback(androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353 r1) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.view.menu.InterfaceC7352
        public void updateMenuView(boolean r4) {
                r3 = this;
                androidx.appcompat.view.menu.ۥ۟۟۟ۢ r4 = r3.f25741
                if (r4 == 0) goto L24
                androidx.appcompat.view.menu.ۥ۟۟۟۟ r4 = r3.f25740
                if (r4 == 0) goto L1d
                int r4 = r4.size()
                r0 = 0
            Ld:
                if (r0 >= r4) goto L1d
                androidx.appcompat.view.menu.ۥ۟۟۟۟ r1 = r3.f25740
                android.view.MenuItem r1 = r1.getItem(r0)
                androidx.appcompat.view.menu.ۥ۟۟۟ۢ r2 = r3.f25741
                if (r1 != r2) goto L1a
                goto L24
            L1a:
                int r0 = r0 + 1
                goto Ld
            L1d:
                androidx.appcompat.view.menu.ۥ۟۟۟۟ r4 = r3.f25740
                androidx.appcompat.view.menu.ۥ۟۟۟ۢ r0 = r3.f25741
                r3.collapseItemActionView(r4, r0)
            L24:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C7406 extends androidx.appcompat.app.AbstractC7267.C7269 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final int f25743 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final int f25744 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f25745 = 2;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f25746;

        public C7406(int r3) {
                r2 = this;
                r0 = -2
                r1 = -1
                r2.<init>(r0, r1, r3)
                return
        }

        public C7406(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f25746 = r1
                r1 = 8388627(0x800013, float:1.175497E-38)
                r0.f25109 = r1
                return
        }

        public C7406(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f25746 = r1
                r0.f25109 = r3
                return
        }

        public C7406(@Yue.InterfaceC4410 android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f25746 = r1
                return
        }

        public C7406(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.f25746 = r1
                return
        }

        public C7406(android.view.ViewGroup.MarginLayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.f25746 = r0
                r1.m28405(r2)
                return
        }

        public C7406(androidx.appcompat.app.AbstractC7267.C7269 r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.f25746 = r1
                return
        }

        public C7406(androidx.appcompat.widget.Toolbar.C7406 r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.f25746 = r0
                int r2 = r2.f25746
                r1.f25746 = r2
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m28405(android.view.ViewGroup.MarginLayoutParams r2) {
                r1 = this;
                int r0 = r2.leftMargin
                r1.leftMargin = r0
                int r0 = r2.topMargin
                r1.topMargin = r0
                int r0 = r2.rightMargin
                r1.rightMargin = r0
                int r2 = r2.bottomMargin
                r1.bottomMargin = r2
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public interface InterfaceC7407 {
        boolean onMenuItemClick(android.view.MenuItem r1);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$ۥۣ۟۟۟, reason: contains not printable characters */
    public static class C7408 extends Yue.AbstractC0025 {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.Toolbar.C7408> CREATOR = null;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f25747;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public boolean f25748;

        /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$ۥۣ۟۟۟$ۥ, reason: contains not printable characters */
        public class C7409 implements android.os.Parcelable.ClassLoaderCreator<androidx.appcompat.widget.Toolbar.C7408> {
            public C7409() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    androidx.appcompat.widget.Toolbar$ۥۣ۟۟۟ r1 = r0.m28406(r1)
                    return r1
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ androidx.appcompat.widget.Toolbar.C7408 createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                    r0 = this;
                    androidx.appcompat.widget.Toolbar$ۥۣ۟۟۟ r1 = r0.m28407(r1, r2)
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    androidx.appcompat.widget.Toolbar$ۥۣ۟۟۟[] r1 = r0.m28408(r1)
                    return r1
            }

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public androidx.appcompat.widget.Toolbar.C7408 m28406(android.os.Parcel r3) {
                    r2 = this;
                    androidx.appcompat.widget.Toolbar$ۥۣ۟۟۟ r0 = new androidx.appcompat.widget.Toolbar$ۥۣ۟۟۟
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public androidx.appcompat.widget.Toolbar.C7408 m28407(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    androidx.appcompat.widget.Toolbar$ۥۣ۟۟۟ r0 = new androidx.appcompat.widget.Toolbar$ۥۣ۟۟۟
                    r0.<init>(r2, r3)
                    return r0
            }

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public androidx.appcompat.widget.Toolbar.C7408[] m28408(int r1) {
                    r0 = this;
                    androidx.appcompat.widget.Toolbar$ۥۣ۟۟۟[] r1 = new androidx.appcompat.widget.Toolbar.C7408[r1]
                    return r1
            }
        }

        static {
                androidx.appcompat.widget.Toolbar$ۥۣ۟۟۟$ۥ r0 = new androidx.appcompat.widget.Toolbar$ۥۣ۟۟۟$ۥ
                r0.<init>()
                androidx.appcompat.widget.Toolbar.C7408.CREATOR = r0
                return
        }

        public C7408(android.os.Parcel r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public C7408(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                int r2 = r1.readInt()
                r0.f25747 = r2
                int r1 = r1.readInt()
                if (r1 == 0) goto L11
                r1 = 1
                goto L12
            L11:
                r1 = 0
            L12:
                r0.f25748 = r1
                return
        }

        public C7408(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC0025, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.f25747
                r1.writeInt(r2)
                boolean r2 = r0.f25748
                r1.writeInt(r2)
                return
        }
    }

    public Toolbar(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public Toolbar(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            int r0 = Yue.C5058.C5060.f16806
            r1.<init>(r2, r3, r0)
            return
    }

    public Toolbar(@Yue.InterfaceC4410 android.content.Context r11, @Yue.InterfaceC4544 android.util.AttributeSet r12, int r13) {
            r10 = this;
            r10.<init>(r11, r12, r13)
            r0 = 8388627(0x800013, float:1.175497E-38)
            r10.mGravity = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.mTempViews = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.mHiddenViews = r0
            r0 = 2
            int[] r0 = new int[r0]
            r10.mTempMargins = r0
            Yue.ۥۡ۠ۦۢ r0 = new Yue.ۥۡ۠ۦۢ
            Yue.ۥۢۡۧۨ r1 = new Yue.ۥۢۡۧۨ
            r1.<init>(r10)
            r0.<init>(r1)
            r10.mMenuHostHelper = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.mProvidedMenuItems = r0
            androidx.appcompat.widget.Toolbar$ۥ r0 = new androidx.appcompat.widget.Toolbar$ۥ
            r0.<init>(r10)
            r10.mMenuViewItemClickListener = r0
            androidx.appcompat.widget.Toolbar$ۥ۟ r0 = new androidx.appcompat.widget.Toolbar$ۥ۟
            r0.<init>(r10)
            r10.mShowOverflowMenuRunnable = r0
            android.content.Context r0 = r10.getContext()
            int[] r1 = Yue.C5058.C5071.f17970
            r2 = 0
            Yue.ۥۢۡۥۦ r0 = Yue.C6264.m23339(r0, r12, r1, r13, r2)
            int[] r5 = Yue.C5058.C5071.f17970
            android.content.res.TypedArray r7 = r0.m23367()
            r9 = 0
            r3 = r10
            r4 = r11
            r6 = r12
            r8 = r13
            Yue.C6794.m26221(r3, r4, r5, r6, r7, r8, r9)
            int r11 = Yue.C5058.C5071.f17999
            int r11 = r0.m23360(r11, r2)
            r10.mTitleTextAppearance = r11
            int r11 = Yue.C5058.C5071.f17990
            int r11 = r0.m23360(r11, r2)
            r10.mSubtitleTextAppearance = r11
            int r11 = Yue.C5058.C5071.f17971
            int r12 = r10.mGravity
            int r11 = r0.m23355(r11, r12)
            r10.mGravity = r11
            int r11 = Yue.C5058.C5071.f17973
            r12 = 48
            int r11 = r0.m23355(r11, r12)
            r10.mButtonGravity = r11
            int r11 = Yue.C5058.C5071.f17993
            int r11 = r0.m23345(r11, r2)
            int r12 = Yue.C5058.C5071.f17998
            boolean r12 = r0.m23368(r12)
            if (r12 == 0) goto L8d
            int r12 = Yue.C5058.C5071.f17998
            int r11 = r0.m23345(r12, r11)
        L8d:
            r10.mTitleMarginBottom = r11
            r10.mTitleMarginTop = r11
            r10.mTitleMarginEnd = r11
            r10.mTitleMarginStart = r11
            int r11 = Yue.C5058.C5071.f17996
            r12 = -1
            int r11 = r0.m23345(r11, r12)
            if (r11 < 0) goto La0
            r10.mTitleMarginStart = r11
        La0:
            int r11 = Yue.C5058.C5071.f17995
            int r11 = r0.m23345(r11, r12)
            if (r11 < 0) goto Laa
            r10.mTitleMarginEnd = r11
        Laa:
            int r11 = Yue.C5058.C5071.f17997
            int r11 = r0.m23345(r11, r12)
            if (r11 < 0) goto Lb4
            r10.mTitleMarginTop = r11
        Lb4:
            int r11 = Yue.C5058.C5071.f17994
            int r11 = r0.m23345(r11, r12)
            if (r11 < 0) goto Lbe
            r10.mTitleMarginBottom = r11
        Lbe:
            int r11 = Yue.C5058.C5071.f17984
            int r11 = r0.m23346(r11, r12)
            r10.mMaxButtonHeight = r11
            int r11 = Yue.C5058.C5071.f17980
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            int r11 = r0.m23345(r11, r12)
            int r13 = Yue.C5058.C5071.f17976
            int r13 = r0.m23345(r13, r12)
            int r1 = Yue.C5058.C5071.f17978
            int r1 = r0.m23346(r1, r2)
            int r3 = Yue.C5058.C5071.f17979
            int r3 = r0.m23346(r3, r2)
            r10.m28381()
            Yue.ۥۡۧ۠ۧ r4 = r10.mContentInsets
            r4.m20537(r1, r3)
            if (r11 != r12) goto Lec
            if (r13 == r12) goto Lf1
        Lec:
            Yue.ۥۡۧ۠ۧ r1 = r10.mContentInsets
            r1.m20539(r11, r13)
        Lf1:
            int r11 = Yue.C5058.C5071.f17981
            int r11 = r0.m23345(r11, r12)
            r10.mContentInsetStartWithNavigation = r11
            int r11 = Yue.C5058.C5071.f17977
            int r11 = r0.m23345(r11, r12)
            r10.mContentInsetEndWithActions = r11
            int r11 = Yue.C5058.C5071.f17975
            android.graphics.drawable.Drawable r11 = r0.m23347(r11)
            r10.mCollapseIcon = r11
            int r11 = Yue.C5058.C5071.f17974
            java.lang.CharSequence r11 = r0.m23363(r11)
            r10.mCollapseDescription = r11
            int r11 = Yue.C5058.C5071.f17992
            java.lang.CharSequence r11 = r0.m23363(r11)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L120
            r10.setTitle(r11)
        L120:
            int r11 = Yue.C5058.C5071.f17989
            java.lang.CharSequence r11 = r0.m23363(r11)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L12f
            r10.setSubtitle(r11)
        L12f:
            android.content.Context r11 = r10.getContext()
            r10.mPopupContext = r11
            int r11 = Yue.C5058.C5071.f17988
            int r11 = r0.m23360(r11, r2)
            r10.setPopupTheme(r11)
            int r11 = Yue.C5058.C5071.f17987
            android.graphics.drawable.Drawable r11 = r0.m23347(r11)
            if (r11 == 0) goto L149
            r10.setNavigationIcon(r11)
        L149:
            int r11 = Yue.C5058.C5071.f17986
            java.lang.CharSequence r11 = r0.m23363(r11)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L158
            r10.setNavigationContentDescription(r11)
        L158:
            int r11 = Yue.C5058.C5071.f17982
            android.graphics.drawable.Drawable r11 = r0.m23347(r11)
            if (r11 == 0) goto L163
            r10.setLogo(r11)
        L163:
            int r11 = Yue.C5058.C5071.f17983
            java.lang.CharSequence r11 = r0.m23363(r11)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L172
            r10.setLogoDescription(r11)
        L172:
            int r11 = Yue.C5058.C5071.f18000
            boolean r11 = r0.m23368(r11)
            if (r11 == 0) goto L183
            int r11 = Yue.C5058.C5071.f18000
            android.content.res.ColorStateList r11 = r0.m23343(r11)
            r10.setTitleTextColor(r11)
        L183:
            int r11 = Yue.C5058.C5071.f17991
            boolean r11 = r0.m23368(r11)
            if (r11 == 0) goto L194
            int r11 = Yue.C5058.C5071.f17991
            android.content.res.ColorStateList r11 = r0.m23343(r11)
            r10.setSubtitleTextColor(r11)
        L194:
            int r11 = Yue.C5058.C5071.f17985
            boolean r11 = r0.m23368(r11)
            if (r11 == 0) goto L1a5
            int r11 = Yue.C5058.C5071.f17985
            int r11 = r0.m23360(r11, r2)
            r10.inflateMenu(r11)
        L1a5:
            r0.m23371()
            return
    }

    private java.util.ArrayList<android.view.MenuItem> getCurrentMenuItems() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.Menu r1 = r4.getMenu()
            r2 = 0
        La:
            int r3 = r1.size()
            if (r2 >= r3) goto L1a
            android.view.MenuItem r3 = r1.getItem(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto La
        L1a:
            return r0
    }

    private android.view.MenuInflater getMenuInflater() {
            r2 = this;
            Yue.ۥۢ۠ۥۢ r0 = new Yue.ۥۢ۠ۥۢ
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            return r0
    }

    public void addChildrenForExpandedActionView() {
            r2 = this;
            java.util.ArrayList<android.view.View> r0 = r2.mHiddenViews
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L18
            java.util.ArrayList<android.view.View> r1 = r2.mHiddenViews
            java.lang.Object r1 = r1.get(r0)
            android.view.View r1 = (android.view.View) r1
            r2.addView(r1)
            int r0 = r0 + (-1)
            goto L8
        L18:
            java.util.ArrayList<android.view.View> r0 = r2.mHiddenViews
            r0.clear()
            return
    }

    @Override // Yue.InterfaceC4120
    @Yue.InterfaceC3875
    public void addMenuProvider(@Yue.InterfaceC4410 Yue.InterfaceC4143 r2) {
            r1 = this;
            Yue.ۥۡ۠ۦۢ r0 = r1.mMenuHostHelper
            r0.m16159(r2)
            return
    }

    @Override // Yue.InterfaceC4120
    @Yue.InterfaceC3875
    public void addMenuProvider(@Yue.InterfaceC4410 Yue.InterfaceC4143 r2, @Yue.InterfaceC4410 androidx.lifecycle.LifecycleOwner r3) {
            r1 = this;
            Yue.ۥۡ۠ۦۢ r0 = r1.mMenuHostHelper
            r0.m16160(r2, r3)
            return
    }

    @Override // Yue.InterfaceC4120
    @Yue.InterfaceC3875
    @android.annotation.SuppressLint({"LambdaLast"})
    public void addMenuProvider(@Yue.InterfaceC4410 Yue.InterfaceC4143 r2, @Yue.InterfaceC4410 androidx.lifecycle.LifecycleOwner r3, @Yue.InterfaceC4410 androidx.lifecycle.Lifecycle.State r4) {
            r1 = this;
            Yue.ۥۡ۠ۦۢ r0 = r1.mMenuHostHelper
            r0.m16161(r2, r3, r4)
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public boolean canShowOverflowMenu() {
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L12
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            if (r0 == 0) goto L12
            boolean r0 = r0.m28292()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = super.checkLayoutParams(r2)
            if (r0 == 0) goto Lc
            boolean r2 = r2 instanceof androidx.appcompat.widget.Toolbar.C7406
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    public void collapseActionView() {
            r1 = this;
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟۠ r0 = r1.mExpandedMenuPresenter
            if (r0 != 0) goto L6
            r0 = 0
            goto L8
        L6:
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r0 = r0.f25741
        L8:
            if (r0 == 0) goto Ld
            r0.collapseActionView()
        Ld:
            return
    }

    public void dismissPopupMenus() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            if (r0 == 0) goto L7
            r0.m28283()
        L7:
            return
    }

    public void ensureCollapseButtonView() {
            r4 = this;
            android.widget.ImageButton r0 = r4.mCollapseButtonView
            if (r0 != 0) goto L3e
            Yue.ۥ۟ۡۢ۟ r0 = new Yue.ۥ۟ۡۢ۟
            android.content.Context r1 = r4.getContext()
            r2 = 0
            int r3 = Yue.C5058.C5060.f16805
            r0.<init>(r1, r2, r3)
            r4.mCollapseButtonView = r0
            android.graphics.drawable.Drawable r1 = r4.mCollapseIcon
            r0.setImageDrawable(r1)
            android.widget.ImageButton r0 = r4.mCollapseButtonView
            java.lang.CharSequence r1 = r4.mCollapseDescription
            r0.setContentDescription(r1)
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r0 = r4.generateDefaultLayoutParams()
            int r1 = r4.mButtonGravity
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 8388611(0x800003, float:1.1754948E-38)
            r1 = r1 | r2
            r0.f25109 = r1
            r1 = 2
            r0.f25746 = r1
            android.widget.ImageButton r1 = r4.mCollapseButtonView
            r1.setLayoutParams(r0)
            android.widget.ImageButton r0 = r4.mCollapseButtonView
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ r1 = new androidx.appcompat.widget.Toolbar$ۥ۟۟۟
            r1.<init>(r4)
            r0.setOnClickListener(r1)
        L3e:
            return
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.Toolbar.C7406 generateDefaultLayoutParams() {
            r2 = this;
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r0 = new androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.Toolbar.C7406 generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r0 = new androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.Toolbar.C7406 generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.appcompat.widget.Toolbar.C7406
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r0 = new androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r2 = (androidx.appcompat.widget.Toolbar.C7406) r2
            r0.<init>(r2)
            return r0
        Lc:
            boolean r0 = r2 instanceof androidx.appcompat.app.AbstractC7267.C7269
            if (r0 == 0) goto L18
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r0 = new androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ
            androidx.appcompat.app.ۥ$ۥ۟ r2 = (androidx.appcompat.app.AbstractC7267.C7269) r2
            r0.<init>(r2)
            return r0
        L18:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L24
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r0 = new androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        L24:
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r0 = new androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ
            r0.<init>(r2)
            return r0
    }

    @Yue.InterfaceC4544
    public java.lang.CharSequence getCollapseContentDescription() {
            r1 = this;
            android.widget.ImageButton r0 = r1.mCollapseButtonView
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getContentDescription()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Yue.InterfaceC4544
    public android.graphics.drawable.Drawable getCollapseIcon() {
            r1 = this;
            android.widget.ImageButton r0 = r1.mCollapseButtonView
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public int getContentInsetEnd() {
            r1 = this;
            Yue.ۥۡۧ۠ۧ r0 = r1.mContentInsets
            if (r0 == 0) goto L9
            int r0 = r0.m20533()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public int getContentInsetEndWithActions() {
            r2 = this;
            int r0 = r2.mContentInsetEndWithActions
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            goto Lb
        L7:
            int r0 = r2.getContentInsetEnd()
        Lb:
            return r0
    }

    public int getContentInsetLeft() {
            r1 = this;
            Yue.ۥۡۧ۠ۧ r0 = r1.mContentInsets
            if (r0 == 0) goto L9
            int r0 = r0.m20534()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public int getContentInsetRight() {
            r1 = this;
            Yue.ۥۡۧ۠ۧ r0 = r1.mContentInsets
            if (r0 == 0) goto L9
            int r0 = r0.m20535()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public int getContentInsetStart() {
            r1 = this;
            Yue.ۥۡۧ۠ۧ r0 = r1.mContentInsets
            if (r0 == 0) goto L9
            int r0 = r0.m20536()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public int getContentInsetStartWithNavigation() {
            r2 = this;
            int r0 = r2.mContentInsetStartWithNavigation
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            goto Lb
        L7:
            int r0 = r2.getContentInsetStart()
        Lb:
            return r0
    }

    public int getCurrentContentInsetEnd() {
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.mMenuView
            if (r0 == 0) goto L20
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r0.m28294()
            if (r0 == 0) goto L20
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L20
            int r0 = r3.getContentInsetEnd()
            int r1 = r3.mContentInsetEndWithActions
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.max(r0, r1)
            goto L24
        L20:
            int r0 = r3.getContentInsetEnd()
        L24:
            return r0
    }

    public int getCurrentContentInsetLeft() {
            r2 = this;
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto Lc
            int r0 = r2.getCurrentContentInsetEnd()
            goto L10
        Lc:
            int r0 = r2.getCurrentContentInsetStart()
        L10:
            return r0
    }

    public int getCurrentContentInsetRight() {
            r2 = this;
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto Lc
            int r0 = r2.getCurrentContentInsetStart()
            goto L10
        Lc:
            int r0 = r2.getCurrentContentInsetEnd()
        L10:
            return r0
    }

    public int getCurrentContentInsetStart() {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.getNavigationIcon()
            if (r0 == 0) goto L16
            int r0 = r3.getContentInsetStart()
            int r1 = r3.mContentInsetStartWithNavigation
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.max(r0, r1)
            goto L1a
        L16:
            int r0 = r3.getContentInsetStart()
        L1a:
            return r0
    }

    public android.graphics.drawable.Drawable getLogo() {
            r1 = this;
            android.widget.ImageView r0 = r1.mLogoView
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public java.lang.CharSequence getLogoDescription() {
            r1 = this;
            android.widget.ImageView r0 = r1.mLogoView
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getContentDescription()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public android.view.Menu getMenu() {
            r1 = this;
            r1.m28383()
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            android.view.Menu r0 = r0.getMenu()
            return r0
    }

    @Yue.InterfaceC6959
    @Yue.InterfaceC4544
    public android.view.View getNavButtonView() {
            r1 = this;
            android.widget.ImageButton r0 = r1.mNavButtonView
            return r0
    }

    @Yue.InterfaceC4544
    public java.lang.CharSequence getNavigationContentDescription() {
            r1 = this;
            android.widget.ImageButton r0 = r1.mNavButtonView
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getContentDescription()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Yue.InterfaceC4544
    public android.graphics.drawable.Drawable getNavigationIcon() {
            r1 = this;
            android.widget.ImageButton r0 = r1.mNavButtonView
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public androidx.appcompat.widget.C7411 getOuterActionMenuPresenter() {
            r1 = this;
            androidx.appcompat.widget.ۥ r0 = r1.mOuterActionMenuPresenter
            return r0
    }

    @Yue.InterfaceC4544
    public android.graphics.drawable.Drawable getOverflowIcon() {
            r1 = this;
            r1.m28383()
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            android.graphics.drawable.Drawable r0 = r0.getOverflowIcon()
            return r0
    }

    public android.content.Context getPopupContext() {
            r1 = this;
            android.content.Context r0 = r1.mPopupContext
            return r0
    }

    @Yue.InterfaceC6018
    public int getPopupTheme() {
            r1 = this;
            int r0 = r1.mPopupTheme
            return r0
    }

    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mSubtitleText
            return r0
    }

    @Yue.InterfaceC6959
    @Yue.InterfaceC4544
    public final android.widget.TextView getSubtitleTextView() {
            r1 = this;
            android.widget.TextView r0 = r1.mSubtitleTextView
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mTitleText
            return r0
    }

    public int getTitleMarginBottom() {
            r1 = this;
            int r0 = r1.mTitleMarginBottom
            return r0
    }

    public int getTitleMarginEnd() {
            r1 = this;
            int r0 = r1.mTitleMarginEnd
            return r0
    }

    public int getTitleMarginStart() {
            r1 = this;
            int r0 = r1.mTitleMarginStart
            return r0
    }

    public int getTitleMarginTop() {
            r1 = this;
            int r0 = r1.mTitleMarginTop
            return r0
    }

    @Yue.InterfaceC6959
    @Yue.InterfaceC4544
    public final android.widget.TextView getTitleTextView() {
            r1 = this;
            android.widget.TextView r0 = r1.mTitleTextView
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public Yue.InterfaceC1763 getWrapper() {
            r2 = this;
            androidx.appcompat.widget.ۥ۟۟۟ۡ r0 = r2.mWrapper
            if (r0 != 0) goto Lc
            androidx.appcompat.widget.ۥ۟۟۟ۡ r0 = new androidx.appcompat.widget.ۥ۟۟۟ۡ
            r1 = 1
            r0.<init>(r2, r1)
            r2.mWrapper = r0
        Lc:
            androidx.appcompat.widget.ۥ۟۟۟ۡ r0 = r2.mWrapper
            return r0
    }

    public boolean hasExpandedActionView() {
            r1 = this;
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟۠ r0 = r1.mExpandedMenuPresenter
            if (r0 == 0) goto La
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r0 = r0.f25741
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public boolean hideOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            if (r0 == 0) goto Lc
            boolean r0 = r0.m28289()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public void inflateMenu(@Yue.InterfaceC4144 int r3) {
            r2 = this;
            android.view.MenuInflater r0 = r2.getMenuInflater()
            android.view.Menu r1 = r2.getMenu()
            r0.inflate(r3, r1)
            return
    }

    @Override // Yue.InterfaceC4120
    @Yue.InterfaceC3875
    public void invalidateMenu() {
            r3 = this;
            java.util.ArrayList<android.view.MenuItem> r0 = r3.mProvidedMenuItems
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            android.view.Menu r2 = r3.getMenu()
            int r1 = r1.getItemId()
            r2.removeItem(r1)
            goto L6
        L1e:
            r3.m28397()
            return
    }

    public boolean isBackInvokedCallbackEnabled() {
            r1 = this;
            boolean r0 = r1.mBackInvokedCallbackEnabled
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public boolean isOverflowMenuShowPending() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            if (r0 == 0) goto Lc
            boolean r0 = r0.m28290()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public boolean isOverflowMenuShowing() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            if (r0 == 0) goto Lc
            boolean r0 = r0.m28291()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public boolean isTitleTruncated() {
            r5 = this;
            android.widget.TextView r0 = r5.mTitleTextView
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.text.Layout r0 = r0.getLayout()
            if (r0 != 0) goto Ld
            return r1
        Ld:
            int r2 = r0.getLineCount()
            r3 = r1
        L12:
            if (r3 >= r2) goto L1f
            int r4 = r0.getEllipsisCount(r3)
            if (r4 <= 0) goto L1c
            r0 = 1
            return r0
        L1c:
            int r3 = r3 + 1
            goto L12
        L1f:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            r0.updateBackInvokedCallbackState()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            java.lang.Runnable r0 = r1.mShowOverflowMenuRunnable
            r1.removeCallbacks(r0)
            r1.updateBackInvokedCallbackState()
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Lb
            r5.mEatingHover = r1
        Lb:
            boolean r3 = r5.mEatingHover
            r4 = 1
            if (r3 != 0) goto L1a
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1a
            if (r6 != 0) goto L1a
            r5.mEatingHover = r4
        L1a:
            r6 = 10
            if (r0 == r6) goto L21
            r6 = 3
            if (r0 != r6) goto L23
        L21:
            r5.mEatingHover = r1
        L23:
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
            r19 = this;
            r0 = r19
            int r1 = r19.getLayoutDirection()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto Lc
            r1 = r3
            goto Ld
        Lc:
            r1 = r2
        Ld:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.mTempMargins
            r11[r3] = r2
            r11[r2] = r2
            int r12 = Yue.C6794.m26145(r19)
            if (r12 < 0) goto L3a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L3b
        L3a:
            r12 = r2
        L3b:
            android.widget.ImageButton r13 = r0.mNavButtonView
            boolean r13 = r0.m28400(r13)
            if (r13 == 0) goto L56
            if (r1 == 0) goto L4e
            android.widget.ImageButton r13 = r0.mNavButtonView
            int r13 = r0.m28394(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L58
        L4e:
            android.widget.ImageButton r13 = r0.mNavButtonView
            int r13 = r0.m28393(r13, r6, r11, r12)
        L54:
            r14 = r10
            goto L58
        L56:
            r13 = r6
            goto L54
        L58:
            android.widget.ImageButton r15 = r0.mCollapseButtonView
            boolean r15 = r0.m28400(r15)
            if (r15 == 0) goto L6f
            if (r1 == 0) goto L69
            android.widget.ImageButton r15 = r0.mCollapseButtonView
            int r14 = r0.m28394(r15, r14, r11, r12)
            goto L6f
        L69:
            android.widget.ImageButton r15 = r0.mCollapseButtonView
            int r13 = r0.m28393(r15, r13, r11, r12)
        L6f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.mMenuView
            boolean r15 = r0.m28400(r15)
            if (r15 == 0) goto L86
            if (r1 == 0) goto L80
            androidx.appcompat.widget.ActionMenuView r15 = r0.mMenuView
            int r13 = r0.m28393(r15, r13, r11, r12)
            goto L86
        L80:
            androidx.appcompat.widget.ActionMenuView r15 = r0.mMenuView
            int r14 = r0.m28394(r15, r14, r11, r12)
        L86:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r3 = r15 - r13
            int r3 = java.lang.Math.max(r2, r3)
            r11[r2] = r3
            int r3 = r10 - r14
            int r3 = r16 - r3
            int r3 = java.lang.Math.max(r2, r3)
            r17 = 1
            r11[r17] = r3
            int r3 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.mExpandedActionView
            boolean r13 = r0.m28400(r13)
            if (r13 == 0) goto Lc3
            if (r1 == 0) goto Lbd
            android.view.View r13 = r0.mExpandedActionView
            int r10 = r0.m28394(r13, r10, r11, r12)
            goto Lc3
        Lbd:
            android.view.View r13 = r0.mExpandedActionView
            int r3 = r0.m28393(r13, r3, r11, r12)
        Lc3:
            android.widget.ImageView r13 = r0.mLogoView
            boolean r13 = r0.m28400(r13)
            if (r13 == 0) goto Lda
            if (r1 == 0) goto Ld4
            android.widget.ImageView r13 = r0.mLogoView
            int r10 = r0.m28394(r13, r10, r11, r12)
            goto Lda
        Ld4:
            android.widget.ImageView r13 = r0.mLogoView
            int r3 = r0.m28393(r13, r3, r11, r12)
        Lda:
            android.widget.TextView r13 = r0.mTitleTextView
            boolean r13 = r0.m28400(r13)
            android.widget.TextView r14 = r0.mSubtitleTextView
            boolean r14 = r0.m28400(r14)
            if (r13 == 0) goto Lff
            android.widget.TextView r15 = r0.mTitleTextView
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r15 = (androidx.appcompat.widget.Toolbar.C7406) r15
            int r2 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.mTitleTextView
            int r7 = r7.getMeasuredHeight()
            int r2 = r2 + r7
            int r7 = r15.bottomMargin
            int r2 = r2 + r7
            goto L102
        Lff:
            r23 = r7
            r2 = 0
        L102:
            if (r14 == 0) goto L11c
            android.widget.TextView r7 = r0.mSubtitleTextView
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r7 = (androidx.appcompat.widget.Toolbar.C7406) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.mSubtitleTextView
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r2 = r2 + r15
            goto L11e
        L11c:
            r16 = r4
        L11e:
            if (r13 != 0) goto L12a
            if (r14 == 0) goto L123
            goto L12a
        L123:
            r18 = r6
            r22 = r12
        L127:
            r2 = 0
            goto L291
        L12a:
            if (r13 == 0) goto L12f
            android.widget.TextView r4 = r0.mTitleTextView
            goto L131
        L12f:
            android.widget.TextView r4 = r0.mSubtitleTextView
        L131:
            if (r14 == 0) goto L136
            android.widget.TextView r7 = r0.mSubtitleTextView
            goto L138
        L136:
            android.widget.TextView r7 = r0.mTitleTextView
        L138:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r4 = (androidx.appcompat.widget.Toolbar.C7406) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r7 = (androidx.appcompat.widget.Toolbar.C7406) r7
            if (r13 == 0) goto L14e
            android.widget.TextView r15 = r0.mTitleTextView
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L158
        L14e:
            if (r14 == 0) goto L15b
            android.widget.TextView r15 = r0.mSubtitleTextView
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L15b
        L158:
            r17 = 1
            goto L15d
        L15b:
            r17 = 0
        L15d:
            int r15 = r0.mGravity
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L1a5
            r6 = 80
            if (r15 == r6) goto L197
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r2
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.mTitleMarginTop
            r24 = r3
            int r3 = r15 + r12
            if (r6 >= r3) goto L180
            int r6 = r15 + r12
            goto L195
        L180:
            int r5 = r5 - r9
            int r5 = r5 - r2
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.mTitleMarginBottom
            int r2 = r2 + r3
            if (r5 >= r2) goto L195
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L195:
            int r8 = r8 + r6
            goto L1b4
        L197:
            r24 = r3
            r22 = r12
            int r5 = r5 - r9
            int r3 = r7.bottomMargin
            int r5 = r5 - r3
            int r3 = r0.mTitleMarginBottom
            int r5 = r5 - r3
            int r8 = r5 - r2
            goto L1b4
        L1a5:
            r24 = r3
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.mTitleMarginTop
            int r8 = r2 + r3
        L1b4:
            if (r1 == 0) goto L227
            if (r17 == 0) goto L1bc
            int r1 = r0.mTitleMarginStart
        L1ba:
            r2 = 1
            goto L1be
        L1bc:
            r1 = 0
            goto L1ba
        L1be:
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L1f4
            android.widget.TextView r1 = r0.mTitleTextView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r1 = (androidx.appcompat.widget.Toolbar.C7406) r1
            android.widget.TextView r2 = r0.mTitleTextView
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.mTitleTextView
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.mTitleTextView
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.mTitleMarginEnd
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L1f5
        L1f4:
            r2 = r10
        L1f5:
            if (r14 == 0) goto L21b
            android.widget.TextView r1 = r0.mSubtitleTextView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r1 = (androidx.appcompat.widget.Toolbar.C7406) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.mSubtitleTextView
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.mSubtitleTextView
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.mSubtitleTextView
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.mTitleMarginEnd
            int r1 = r10 - r1
            goto L21c
        L21b:
            r1 = r10
        L21c:
            if (r17 == 0) goto L223
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L223:
            r3 = r24
            goto L127
        L227:
            if (r17 == 0) goto L22e
            int r2 = r0.mTitleMarginStart
            r1 = r2
        L22c:
            r2 = 0
            goto L230
        L22e:
            r1 = 0
            goto L22c
        L230:
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r24 + r3
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L265
            android.widget.TextView r1 = r0.mTitleTextView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r1 = (androidx.appcompat.widget.Toolbar.C7406) r1
            android.widget.TextView r4 = r0.mTitleTextView
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r3
            android.widget.TextView r5 = r0.mTitleTextView
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.mTitleTextView
            r6.layout(r3, r8, r4, r5)
            int r6 = r0.mTitleMarginEnd
            int r4 = r4 + r6
            int r1 = r1.bottomMargin
            int r8 = r5 + r1
            goto L266
        L265:
            r4 = r3
        L266:
            if (r14 == 0) goto L28a
            android.widget.TextView r1 = r0.mSubtitleTextView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r1 = (androidx.appcompat.widget.Toolbar.C7406) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.mSubtitleTextView
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            android.widget.TextView r5 = r0.mSubtitleTextView
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.mSubtitleTextView
            r6.layout(r3, r8, r1, r5)
            int r5 = r0.mTitleMarginEnd
            int r1 = r1 + r5
            goto L28b
        L28a:
            r1 = r3
        L28b:
            if (r17 == 0) goto L291
            int r3 = java.lang.Math.max(r4, r1)
        L291:
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            r4 = 3
            r0.m28379(r1, r4)
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            int r1 = r1.size()
            r4 = r3
            r3 = r2
        L29f:
            if (r3 >= r1) goto L2b2
            java.util.ArrayList<android.view.View> r5 = r0.mTempViews
            java.lang.Object r5 = r5.get(r3)
            android.view.View r5 = (android.view.View) r5
            r12 = r22
            int r4 = r0.m28393(r5, r4, r11, r12)
            int r3 = r3 + 1
            goto L29f
        L2b2:
            r12 = r22
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            r3 = 5
            r0.m28379(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            int r1 = r1.size()
            r3 = r2
        L2c1:
            if (r3 >= r1) goto L2d2
            java.util.ArrayList<android.view.View> r5 = r0.mTempViews
            java.lang.Object r5 = r5.get(r3)
            android.view.View r5 = (android.view.View) r5
            int r10 = r0.m28394(r5, r10, r11, r12)
            int r3 = r3 + 1
            goto L2c1
        L2d2:
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            r3 = 1
            r0.m28379(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            int r1 = r0.m28391(r1, r11)
            int r3 = r16 - r18
            int r3 = r3 - r23
            int r3 = r3 / 2
            int r6 = r18 + r3
            int r3 = r1 / 2
            int r6 = r6 - r3
            int r1 = r1 + r6
            if (r6 >= r4) goto L2ed
            goto L2f4
        L2ed:
            if (r1 <= r10) goto L2f3
            int r1 = r1 - r10
            int r4 = r6 - r1
            goto L2f4
        L2f3:
            r4 = r6
        L2f4:
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            int r1 = r1.size()
        L2fa:
            if (r2 >= r1) goto L30b
            java.util.ArrayList<android.view.View> r3 = r0.mTempViews
            java.lang.Object r3 = r3.get(r2)
            android.view.View r3 = (android.view.View) r3
            int r4 = r0.m28393(r3, r4, r11, r12)
            int r2 = r2 + 1
            goto L2fa
        L30b:
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            r1.clear()
            return
    }

    @Override // android.view.View
    public void onMeasure(int r17, int r18) {
            r16 = this;
            r7 = r16
            int[] r8 = r7.mTempMargins
            boolean r9 = Yue.C6928.m26811(r16)
            r10 = 0
            r11 = r9 ^ 1
            android.widget.ImageButton r0 = r7.mNavButtonView
            boolean r0 = r7.m28400(r0)
            r12 = 0
            if (r0 == 0) goto L4e
            android.widget.ImageButton r1 = r7.mNavButtonView
            r5 = 0
            int r6 = r7.mMaxButtonHeight
            r0 = r16
            r2 = r17
            r3 = r12
            r4 = r18
            r0.m28396(r1, r2, r3, r4, r5, r6)
            android.widget.ImageButton r0 = r7.mNavButtonView
            int r0 = r0.getMeasuredWidth()
            android.widget.ImageButton r1 = r7.mNavButtonView
            int r1 = r7.m28389(r1)
            int r0 = r0 + r1
            android.widget.ImageButton r1 = r7.mNavButtonView
            int r1 = r1.getMeasuredHeight()
            android.widget.ImageButton r2 = r7.mNavButtonView
            int r2 = r7.m28390(r2)
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r10, r1)
            android.widget.ImageButton r2 = r7.mNavButtonView
            int r2 = r2.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r10, r2)
            r13 = r1
            r14 = r2
            goto L51
        L4e:
            r0 = r10
            r13 = r0
            r14 = r13
        L51:
            android.widget.ImageButton r1 = r7.mCollapseButtonView
            boolean r1 = r7.m28400(r1)
            if (r1 == 0) goto L90
            android.widget.ImageButton r1 = r7.mCollapseButtonView
            r5 = 0
            int r6 = r7.mMaxButtonHeight
            r0 = r16
            r2 = r17
            r3 = r12
            r4 = r18
            r0.m28396(r1, r2, r3, r4, r5, r6)
            android.widget.ImageButton r0 = r7.mCollapseButtonView
            int r0 = r0.getMeasuredWidth()
            android.widget.ImageButton r1 = r7.mCollapseButtonView
            int r1 = r7.m28389(r1)
            int r0 = r0 + r1
            android.widget.ImageButton r1 = r7.mCollapseButtonView
            int r1 = r1.getMeasuredHeight()
            android.widget.ImageButton r2 = r7.mCollapseButtonView
            int r2 = r7.m28390(r2)
            int r1 = r1 + r2
            int r13 = java.lang.Math.max(r13, r1)
            android.widget.ImageButton r1 = r7.mCollapseButtonView
            int r1 = r1.getMeasuredState()
            int r14 = android.view.View.combineMeasuredStates(r14, r1)
        L90:
            int r1 = r16.getCurrentContentInsetStart()
            int r12 = java.lang.Math.max(r1, r0)
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r10, r1)
            r8[r9] = r0
            androidx.appcompat.widget.ActionMenuView r0 = r7.mMenuView
            boolean r0 = r7.m28400(r0)
            if (r0 == 0) goto Ldf
            androidx.appcompat.widget.ActionMenuView r1 = r7.mMenuView
            r5 = 0
            int r6 = r7.mMaxButtonHeight
            r0 = r16
            r2 = r17
            r3 = r12
            r4 = r18
            r0.m28396(r1, r2, r3, r4, r5, r6)
            androidx.appcompat.widget.ActionMenuView r0 = r7.mMenuView
            int r0 = r0.getMeasuredWidth()
            androidx.appcompat.widget.ActionMenuView r1 = r7.mMenuView
            int r1 = r7.m28389(r1)
            int r0 = r0 + r1
            androidx.appcompat.widget.ActionMenuView r1 = r7.mMenuView
            int r1 = r1.getMeasuredHeight()
            androidx.appcompat.widget.ActionMenuView r2 = r7.mMenuView
            int r2 = r7.m28390(r2)
            int r1 = r1 + r2
            int r13 = java.lang.Math.max(r13, r1)
            androidx.appcompat.widget.ActionMenuView r1 = r7.mMenuView
            int r1 = r1.getMeasuredState()
            int r14 = android.view.View.combineMeasuredStates(r14, r1)
            goto Le0
        Ldf:
            r0 = r10
        Le0:
            int r1 = r16.getCurrentContentInsetEnd()
            int r2 = java.lang.Math.max(r1, r0)
            int r12 = r12 + r2
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r10, r1)
            r8[r11] = r0
            android.view.View r0 = r7.mExpandedActionView
            boolean r0 = r7.m28400(r0)
            if (r0 == 0) goto L123
            android.view.View r1 = r7.mExpandedActionView
            r5 = 0
            r0 = r16
            r2 = r17
            r3 = r12
            r4 = r18
            r6 = r8
            int r0 = r0.m28395(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + r0
            android.view.View r0 = r7.mExpandedActionView
            int r0 = r0.getMeasuredHeight()
            android.view.View r1 = r7.mExpandedActionView
            int r1 = r7.m28390(r1)
            int r0 = r0 + r1
            int r13 = java.lang.Math.max(r13, r0)
            android.view.View r0 = r7.mExpandedActionView
            int r0 = r0.getMeasuredState()
            int r14 = android.view.View.combineMeasuredStates(r14, r0)
        L123:
            android.widget.ImageView r0 = r7.mLogoView
            boolean r0 = r7.m28400(r0)
            if (r0 == 0) goto L156
            android.widget.ImageView r1 = r7.mLogoView
            r5 = 0
            r0 = r16
            r2 = r17
            r3 = r12
            r4 = r18
            r6 = r8
            int r0 = r0.m28395(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + r0
            android.widget.ImageView r0 = r7.mLogoView
            int r0 = r0.getMeasuredHeight()
            android.widget.ImageView r1 = r7.mLogoView
            int r1 = r7.m28390(r1)
            int r0 = r0 + r1
            int r13 = java.lang.Math.max(r13, r0)
            android.widget.ImageView r0 = r7.mLogoView
            int r0 = r0.getMeasuredState()
            int r14 = android.view.View.combineMeasuredStates(r14, r0)
        L156:
            int r9 = r16.getChildCount()
            r11 = r10
        L15b:
            if (r11 >= r9) goto L19b
            android.view.View r15 = r7.getChildAt(r11)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r0 = (androidx.appcompat.widget.Toolbar.C7406) r0
            int r0 = r0.f25746
            if (r0 != 0) goto L198
            boolean r0 = r7.m28400(r15)
            if (r0 != 0) goto L172
            goto L198
        L172:
            r5 = 0
            r0 = r16
            r1 = r15
            r2 = r17
            r3 = r12
            r4 = r18
            r6 = r8
            int r0 = r0.m28395(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + r0
            int r0 = r15.getMeasuredHeight()
            int r1 = r7.m28390(r15)
            int r0 = r0 + r1
            int r0 = java.lang.Math.max(r13, r0)
            int r1 = r15.getMeasuredState()
            int r1 = android.view.View.combineMeasuredStates(r14, r1)
            r13 = r0
            r14 = r1
        L198:
            int r11 = r11 + 1
            goto L15b
        L19b:
            int r0 = r7.mTitleMarginTop
            int r1 = r7.mTitleMarginBottom
            int r9 = r0 + r1
            int r0 = r7.mTitleMarginStart
            int r1 = r7.mTitleMarginEnd
            int r11 = r0 + r1
            android.widget.TextView r0 = r7.mTitleTextView
            boolean r0 = r7.m28400(r0)
            if (r0 == 0) goto L1e6
            android.widget.TextView r1 = r7.mTitleTextView
            int r3 = r12 + r11
            r0 = r16
            r2 = r17
            r4 = r18
            r5 = r9
            r6 = r8
            r0.m28395(r1, r2, r3, r4, r5, r6)
            android.widget.TextView r0 = r7.mTitleTextView
            int r0 = r0.getMeasuredWidth()
            android.widget.TextView r1 = r7.mTitleTextView
            int r1 = r7.m28389(r1)
            int r0 = r0 + r1
            android.widget.TextView r1 = r7.mTitleTextView
            int r1 = r1.getMeasuredHeight()
            android.widget.TextView r2 = r7.mTitleTextView
            int r2 = r7.m28390(r2)
            int r1 = r1 + r2
            android.widget.TextView r2 = r7.mTitleTextView
            int r2 = r2.getMeasuredState()
            int r14 = android.view.View.combineMeasuredStates(r14, r2)
            r15 = r1
            r6 = r14
            r14 = r0
            goto L1e9
        L1e6:
            r15 = r10
            r6 = r14
            r14 = r15
        L1e9:
            android.widget.TextView r0 = r7.mSubtitleTextView
            boolean r0 = r7.m28400(r0)
            if (r0 == 0) goto L220
            android.widget.TextView r1 = r7.mSubtitleTextView
            int r3 = r12 + r11
            int r5 = r15 + r9
            r0 = r16
            r2 = r17
            r4 = r18
            r9 = r6
            r6 = r8
            int r0 = r0.m28395(r1, r2, r3, r4, r5, r6)
            int r14 = java.lang.Math.max(r14, r0)
            android.widget.TextView r0 = r7.mSubtitleTextView
            int r0 = r0.getMeasuredHeight()
            android.widget.TextView r1 = r7.mSubtitleTextView
            int r1 = r7.m28390(r1)
            int r0 = r0 + r1
            int r15 = r15 + r0
            android.widget.TextView r0 = r7.mSubtitleTextView
            int r0 = r0.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r9, r0)
            goto L221
        L220:
            r9 = r6
        L221:
            int r12 = r12 + r14
            int r0 = java.lang.Math.max(r13, r15)
            int r1 = r16.getPaddingLeft()
            int r2 = r16.getPaddingRight()
            int r1 = r1 + r2
            int r12 = r12 + r1
            int r1 = r16.getPaddingTop()
            int r2 = r16.getPaddingBottom()
            int r1 = r1 + r2
            int r0 = r0 + r1
            int r1 = r16.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r12, r1)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r6
            r3 = r17
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            int r2 = r16.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r6 << 16
            r3 = r18
            int r0 = android.view.View.resolveSizeAndState(r0, r3, r2)
            boolean r2 = r16.m28399()
            if (r2 == 0) goto L262
            goto L263
        L262:
            r10 = r0
        L263:
            r7.setMeasuredDimension(r1, r10)
            return
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r4) {
            r3 = this;
            boolean r0 = r4 instanceof androidx.appcompat.widget.Toolbar.C7408
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r4)
            return
        L8:
            androidx.appcompat.widget.Toolbar$ۥۣ۟۟۟ r4 = (androidx.appcompat.widget.Toolbar.C7408) r4
            android.os.Parcelable r0 = r4.getSuperState()
            super.onRestoreInstanceState(r0)
            androidx.appcompat.widget.ActionMenuView r0 = r3.mMenuView
            if (r0 == 0) goto L1a
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r0.m28294()
            goto L1b
        L1a:
            r0 = 0
        L1b:
            int r1 = r4.f25747
            if (r1 == 0) goto L2e
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟۠ r2 = r3.mExpandedMenuPresenter
            if (r2 == 0) goto L2e
            if (r0 == 0) goto L2e
            android.view.MenuItem r0 = r0.findItem(r1)
            if (r0 == 0) goto L2e
            r0.expandActionView()
        L2e:
            boolean r4 = r4.f25748
            if (r4 == 0) goto L35
            r3.m28398()
        L35:
            return
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int r3) {
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            r2.m28381()
            Yue.ۥۡۧ۠ۧ r0 = r2.mContentInsets
            r1 = 1
            if (r3 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            r0.m20538(r1)
            return
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            androidx.appcompat.widget.Toolbar$ۥۣ۟۟۟ r0 = new androidx.appcompat.widget.Toolbar$ۥۣ۟۟۟
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟۠ r1 = r2.mExpandedMenuPresenter
            if (r1 == 0) goto L17
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r1 = r1.f25741
            if (r1 == 0) goto L17
            int r1 = r1.getItemId()
            r0.f25747 = r1
        L17:
            boolean r1 = r2.isOverflowMenuShowing()
            r0.f25748 = r1
            return r0
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L9
            r4.mEatingTouch = r1
        L9:
            boolean r2 = r4.mEatingTouch
            r3 = 1
            if (r2 != 0) goto L18
            boolean r5 = super.onTouchEvent(r5)
            if (r0 != 0) goto L18
            if (r5 != 0) goto L18
            r4.mEatingTouch = r3
        L18:
            if (r0 == r3) goto L1d
            r5 = 3
            if (r0 != r5) goto L1f
        L1d:
            r4.mEatingTouch = r1
        L1f:
            return r3
    }

    public void removeChildrenForExpandedActionView() {
            r4 = this;
            int r0 = r4.getChildCount()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L26
            android.view.View r1 = r4.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r2 = (androidx.appcompat.widget.Toolbar.C7406) r2
            int r2 = r2.f25746
            r3 = 2
            if (r2 == r3) goto L23
            androidx.appcompat.widget.ActionMenuView r2 = r4.mMenuView
            if (r1 == r2) goto L23
            r4.removeViewAt(r0)
            java.util.ArrayList<android.view.View> r2 = r4.mHiddenViews
            r2.add(r1)
        L23:
            int r0 = r0 + (-1)
            goto L6
        L26:
            return
    }

    @Override // Yue.InterfaceC4120
    @Yue.InterfaceC3875
    public void removeMenuProvider(@Yue.InterfaceC4410 Yue.InterfaceC4143 r2) {
            r1 = this;
            Yue.ۥۡ۠ۦۢ r0 = r1.mMenuHostHelper
            r0.m16168(r2)
            return
    }

    public void setBackInvokedCallbackEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.mBackInvokedCallbackEnabled
            if (r0 == r2) goto L9
            r1.mBackInvokedCallbackEnabled = r2
            r1.updateBackInvokedCallbackState()
        L9:
            return
    }

    public void setCollapseContentDescription(@Yue.InterfaceC5971 int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setCollapseContentDescription(r2)
            return
    }

    public void setCollapseContentDescription(@Yue.InterfaceC4544 java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L9
            r1.ensureCollapseButtonView()
        L9:
            android.widget.ImageButton r0 = r1.mCollapseButtonView
            if (r0 == 0) goto L10
            r0.setContentDescription(r2)
        L10:
            return
    }

    public void setCollapseIcon(@Yue.InterfaceC2004 int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = Yue.C0479.m1737(r0, r2)
            r1.setCollapseIcon(r2)
            return
    }

    public void setCollapseIcon(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            r1.ensureCollapseButtonView()
            android.widget.ImageButton r0 = r1.mCollapseButtonView
            r0.setImageDrawable(r2)
            goto L14
        Lb:
            android.widget.ImageButton r2 = r1.mCollapseButtonView
            if (r2 == 0) goto L14
            android.graphics.drawable.Drawable r0 = r1.mCollapseIcon
            r2.setImageDrawable(r0)
        L14:
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setCollapsible(boolean r1) {
            r0 = this;
            r0.mCollapsible = r1
            r0.requestLayout()
            return
    }

    public void setContentInsetEndWithActions(int r2) {
            r1 = this;
            if (r2 >= 0) goto L4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L4:
            int r0 = r1.mContentInsetEndWithActions
            if (r2 == r0) goto L13
            r1.mContentInsetEndWithActions = r2
            android.graphics.drawable.Drawable r2 = r1.getNavigationIcon()
            if (r2 == 0) goto L13
            r1.requestLayout()
        L13:
            return
    }

    public void setContentInsetStartWithNavigation(int r2) {
            r1 = this;
            if (r2 >= 0) goto L4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L4:
            int r0 = r1.mContentInsetStartWithNavigation
            if (r2 == r0) goto L13
            r1.mContentInsetStartWithNavigation = r2
            android.graphics.drawable.Drawable r2 = r1.getNavigationIcon()
            if (r2 == 0) goto L13
            r1.requestLayout()
        L13:
            return
    }

    public void setContentInsetsAbsolute(int r2, int r3) {
            r1 = this;
            r1.m28381()
            Yue.ۥۡۧ۠ۧ r0 = r1.mContentInsets
            r0.m20537(r2, r3)
            return
    }

    public void setContentInsetsRelative(int r2, int r3) {
            r1 = this;
            r1.m28381()
            Yue.ۥۡۧ۠ۧ r0 = r1.mContentInsets
            r0.m20539(r2, r3)
            return
    }

    public void setLogo(@Yue.InterfaceC2004 int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = Yue.C0479.m1737(r0, r2)
            r1.setLogo(r2)
            return
    }

    public void setLogo(android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 == 0) goto L14
            r2.m28382()
            android.widget.ImageView r0 = r2.mLogoView
            boolean r0 = r2.m28392(r0)
            if (r0 != 0) goto L2a
            android.widget.ImageView r0 = r2.mLogoView
            r1 = 1
            r2.m28380(r0, r1)
            goto L2a
        L14:
            android.widget.ImageView r0 = r2.mLogoView
            if (r0 == 0) goto L2a
            boolean r0 = r2.m28392(r0)
            if (r0 == 0) goto L2a
            android.widget.ImageView r0 = r2.mLogoView
            r2.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r2.mHiddenViews
            android.widget.ImageView r1 = r2.mLogoView
            r0.remove(r1)
        L2a:
            android.widget.ImageView r0 = r2.mLogoView
            if (r0 == 0) goto L31
            r0.setImageDrawable(r3)
        L31:
            return
    }

    public void setLogoDescription(@Yue.InterfaceC5971 int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.setLogoDescription(r2)
            return
    }

    public void setLogoDescription(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L9
            r1.m28382()
        L9:
            android.widget.ImageView r0 = r1.mLogoView
            if (r0 == 0) goto L10
            r0.setContentDescription(r2)
        L10:
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public void setMenu(androidx.appcompat.view.menu.C7343 r4, androidx.appcompat.widget.C7411 r5) {
            r3 = this;
            if (r4 != 0) goto L7
            androidx.appcompat.widget.ActionMenuView r0 = r3.mMenuView
            if (r0 != 0) goto L7
            return
        L7:
            r3.m28384()
            androidx.appcompat.widget.ActionMenuView r0 = r3.mMenuView
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r0.m28294()
            if (r0 != r4) goto L13
            return
        L13:
            if (r0 == 0) goto L1f
            androidx.appcompat.widget.ۥ r1 = r3.mOuterActionMenuPresenter
            r0.removeMenuPresenter(r1)
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟۠ r1 = r3.mExpandedMenuPresenter
            r0.removeMenuPresenter(r1)
        L1f:
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟۠ r0 = r3.mExpandedMenuPresenter
            if (r0 != 0) goto L2a
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟۠ r0 = new androidx.appcompat.widget.Toolbar$ۥ۟۟۟۠
            r0.<init>(r3)
            r3.mExpandedMenuPresenter = r0
        L2a:
            r0 = 1
            r5.m28427(r0)
            if (r4 == 0) goto L3d
            android.content.Context r0 = r3.mPopupContext
            r4.addMenuPresenter(r5, r0)
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟۠ r0 = r3.mExpandedMenuPresenter
            android.content.Context r1 = r3.mPopupContext
            r4.addMenuPresenter(r0, r1)
            goto L52
        L3d:
            android.content.Context r4 = r3.mPopupContext
            r1 = 0
            r5.initForMenu(r4, r1)
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟۠ r4 = r3.mExpandedMenuPresenter
            android.content.Context r2 = r3.mPopupContext
            r4.initForMenu(r2, r1)
            r5.updateMenuView(r0)
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟۠ r4 = r3.mExpandedMenuPresenter
            r4.updateMenuView(r0)
        L52:
            androidx.appcompat.widget.ActionMenuView r4 = r3.mMenuView
            int r0 = r3.mPopupTheme
            r4.setPopupTheme(r0)
            androidx.appcompat.widget.ActionMenuView r4 = r3.mMenuView
            r4.setPresenter(r5)
            r3.mOuterActionMenuPresenter = r5
            r3.updateBackInvokedCallbackState()
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setMenuCallbacks(androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353 r2, androidx.appcompat.view.menu.C7343.InterfaceC7344 r3) {
            r1 = this;
            r1.mActionMenuPresenterCallback = r2
            r1.mMenuBuilderCallback = r3
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            if (r0 == 0) goto Lb
            r0.m28295(r2, r3)
        Lb:
            return
    }

    public void setNavigationContentDescription(@Yue.InterfaceC5971 int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setNavigationContentDescription(r2)
            return
    }

    public void setNavigationContentDescription(@Yue.InterfaceC4544 java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L9
            r1.m28385()
        L9:
            android.widget.ImageButton r0 = r1.mNavButtonView
            if (r0 == 0) goto L15
            r0.setContentDescription(r2)
            android.widget.ImageButton r0 = r1.mNavButtonView
            Yue.C6374.m23531(r0, r2)
        L15:
            return
    }

    public void setNavigationIcon(@Yue.InterfaceC2004 int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = Yue.C0479.m1737(r0, r2)
            r1.setNavigationIcon(r2)
            return
    }

    public void setNavigationIcon(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 == 0) goto L14
            r2.m28385()
            android.widget.ImageButton r0 = r2.mNavButtonView
            boolean r0 = r2.m28392(r0)
            if (r0 != 0) goto L2a
            android.widget.ImageButton r0 = r2.mNavButtonView
            r1 = 1
            r2.m28380(r0, r1)
            goto L2a
        L14:
            android.widget.ImageButton r0 = r2.mNavButtonView
            if (r0 == 0) goto L2a
            boolean r0 = r2.m28392(r0)
            if (r0 == 0) goto L2a
            android.widget.ImageButton r0 = r2.mNavButtonView
            r2.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r2.mHiddenViews
            android.widget.ImageButton r1 = r2.mNavButtonView
            r0.remove(r1)
        L2a:
            android.widget.ImageButton r0 = r2.mNavButtonView
            if (r0 == 0) goto L31
            r0.setImageDrawable(r3)
        L31:
            return
    }

    public void setNavigationOnClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            r1.m28385()
            android.widget.ImageButton r0 = r1.mNavButtonView
            r0.setOnClickListener(r2)
            return
    }

    public void setOnMenuItemClickListener(androidx.appcompat.widget.Toolbar.InterfaceC7407 r1) {
            r0 = this;
            r0.mOnMenuItemClickListener = r1
            return
    }

    public void setOverflowIcon(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.m28383()
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            r0.setOverflowIcon(r2)
            return
    }

    public void setPopupTheme(@Yue.InterfaceC6018 int r3) {
            r2 = this;
            int r0 = r2.mPopupTheme
            if (r0 == r3) goto L1a
            r2.mPopupTheme = r3
            if (r3 != 0) goto Lf
            android.content.Context r3 = r2.getContext()
            r2.mPopupContext = r3
            goto L1a
        Lf:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            r2.mPopupContext = r0
        L1a:
            return
    }

    public void setSubtitle(@Yue.InterfaceC5971 int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.setSubtitle(r2)
            return
    }

    public void setSubtitle(java.lang.CharSequence r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L40
            android.widget.TextView r0 = r3.mSubtitleTextView
            if (r0 != 0) goto L31
            android.content.Context r0 = r3.getContext()
            Yue.ۥ۟ۡۤ r1 = new Yue.ۥ۟ۡۤ
            r1.<init>(r0)
            r3.mSubtitleTextView = r1
            r1.setSingleLine()
            android.widget.TextView r1 = r3.mSubtitleTextView
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r2)
            int r1 = r3.mSubtitleTextAppearance
            if (r1 == 0) goto L28
            android.widget.TextView r2 = r3.mSubtitleTextView
            r2.setTextAppearance(r0, r1)
        L28:
            android.content.res.ColorStateList r0 = r3.mSubtitleTextColor
            if (r0 == 0) goto L31
            android.widget.TextView r1 = r3.mSubtitleTextView
            r1.setTextColor(r0)
        L31:
            android.widget.TextView r0 = r3.mSubtitleTextView
            boolean r0 = r3.m28392(r0)
            if (r0 != 0) goto L56
            android.widget.TextView r0 = r3.mSubtitleTextView
            r1 = 1
            r3.m28380(r0, r1)
            goto L56
        L40:
            android.widget.TextView r0 = r3.mSubtitleTextView
            if (r0 == 0) goto L56
            boolean r0 = r3.m28392(r0)
            if (r0 == 0) goto L56
            android.widget.TextView r0 = r3.mSubtitleTextView
            r3.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r3.mHiddenViews
            android.widget.TextView r1 = r3.mSubtitleTextView
            r0.remove(r1)
        L56:
            android.widget.TextView r0 = r3.mSubtitleTextView
            if (r0 == 0) goto L5d
            r0.setText(r4)
        L5d:
            r3.mSubtitleText = r4
            return
    }

    public void setSubtitleTextAppearance(android.content.Context r2, @Yue.InterfaceC6018 int r3) {
            r1 = this;
            r1.mSubtitleTextAppearance = r3
            android.widget.TextView r0 = r1.mSubtitleTextView
            if (r0 == 0) goto L9
            r0.setTextAppearance(r2, r3)
        L9:
            return
    }

    public void setSubtitleTextColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setSubtitleTextColor(r1)
            return
    }

    public void setSubtitleTextColor(@Yue.InterfaceC4410 android.content.res.ColorStateList r2) {
            r1 = this;
            r1.mSubtitleTextColor = r2
            android.widget.TextView r0 = r1.mSubtitleTextView
            if (r0 == 0) goto L9
            r0.setTextColor(r2)
        L9:
            return
    }

    public void setTitle(@Yue.InterfaceC5971 int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.setTitle(r2)
            return
    }

    public void setTitle(java.lang.CharSequence r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L40
            android.widget.TextView r0 = r3.mTitleTextView
            if (r0 != 0) goto L31
            android.content.Context r0 = r3.getContext()
            Yue.ۥ۟ۡۤ r1 = new Yue.ۥ۟ۡۤ
            r1.<init>(r0)
            r3.mTitleTextView = r1
            r1.setSingleLine()
            android.widget.TextView r1 = r3.mTitleTextView
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r2)
            int r1 = r3.mTitleTextAppearance
            if (r1 == 0) goto L28
            android.widget.TextView r2 = r3.mTitleTextView
            r2.setTextAppearance(r0, r1)
        L28:
            android.content.res.ColorStateList r0 = r3.mTitleTextColor
            if (r0 == 0) goto L31
            android.widget.TextView r1 = r3.mTitleTextView
            r1.setTextColor(r0)
        L31:
            android.widget.TextView r0 = r3.mTitleTextView
            boolean r0 = r3.m28392(r0)
            if (r0 != 0) goto L56
            android.widget.TextView r0 = r3.mTitleTextView
            r1 = 1
            r3.m28380(r0, r1)
            goto L56
        L40:
            android.widget.TextView r0 = r3.mTitleTextView
            if (r0 == 0) goto L56
            boolean r0 = r3.m28392(r0)
            if (r0 == 0) goto L56
            android.widget.TextView r0 = r3.mTitleTextView
            r3.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r3.mHiddenViews
            android.widget.TextView r1 = r3.mTitleTextView
            r0.remove(r1)
        L56:
            android.widget.TextView r0 = r3.mTitleTextView
            if (r0 == 0) goto L5d
            r0.setText(r4)
        L5d:
            r3.mTitleText = r4
            return
    }

    public void setTitleMargin(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.mTitleMarginStart = r1
            r0.mTitleMarginTop = r2
            r0.mTitleMarginEnd = r3
            r0.mTitleMarginBottom = r4
            r0.requestLayout()
            return
    }

    public void setTitleMarginBottom(int r1) {
            r0 = this;
            r0.mTitleMarginBottom = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginEnd(int r1) {
            r0 = this;
            r0.mTitleMarginEnd = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginStart(int r1) {
            r0 = this;
            r0.mTitleMarginStart = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginTop(int r1) {
            r0 = this;
            r0.mTitleMarginTop = r1
            r0.requestLayout()
            return
    }

    public void setTitleTextAppearance(android.content.Context r2, @Yue.InterfaceC6018 int r3) {
            r1 = this;
            r1.mTitleTextAppearance = r3
            android.widget.TextView r0 = r1.mTitleTextView
            if (r0 == 0) goto L9
            r0.setTextAppearance(r2, r3)
        L9:
            return
    }

    public void setTitleTextColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setTitleTextColor(r1)
            return
    }

    public void setTitleTextColor(@Yue.InterfaceC4410 android.content.res.ColorStateList r2) {
            r1 = this;
            r1.mTitleTextColor = r2
            android.widget.TextView r0 = r1.mTitleTextView
            if (r0 == 0) goto L9
            r0.setTextColor(r2)
        L9:
            return
    }

    public boolean showOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            if (r0 == 0) goto Lc
            boolean r0 = r0.m28296()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public void updateBackInvokedCallbackState() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L4a
            android.window.OnBackInvokedDispatcher r0 = androidx.appcompat.widget.Toolbar.C7404.m28401(r3)
            boolean r1 = r3.hasExpandedActionView()
            if (r1 == 0) goto L1e
            if (r0 == 0) goto L1e
            boolean r1 = r3.isAttachedToWindow()
            if (r1 == 0) goto L1e
            boolean r1 = r3.mBackInvokedCallbackEnabled
            if (r1 == 0) goto L1e
            r1 = 1
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r1 == 0) goto L3c
            android.window.OnBackInvokedDispatcher r2 = r3.mBackInvokedDispatcher
            if (r2 != 0) goto L3c
            android.window.OnBackInvokedCallback r1 = r3.mBackInvokedCallback
            if (r1 != 0) goto L34
            Yue.ۥۢۡۧۧ r1 = new Yue.ۥۢۡۧۧ
            r1.<init>(r3)
            android.window.OnBackInvokedCallback r1 = androidx.appcompat.widget.Toolbar.C7404.m28402(r1)
            r3.mBackInvokedCallback = r1
        L34:
            android.window.OnBackInvokedCallback r1 = r3.mBackInvokedCallback
            androidx.appcompat.widget.Toolbar.C7404.m28403(r0, r1)
            r3.mBackInvokedDispatcher = r0
            goto L4a
        L3c:
            if (r1 != 0) goto L4a
            android.window.OnBackInvokedDispatcher r0 = r3.mBackInvokedDispatcher
            if (r0 == 0) goto L4a
            android.window.OnBackInvokedCallback r1 = r3.mBackInvokedCallback
            androidx.appcompat.widget.Toolbar.C7404.m28404(r0, r1)
            r0 = 0
            r3.mBackInvokedDispatcher = r0
        L4a:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m28379(java.util.List<android.view.View> r6, int r7) {
            r5 = this;
            int r0 = r5.getLayoutDirection()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            int r3 = r5.getChildCount()
            int r4 = r5.getLayoutDirection()
            int r7 = Yue.C2911.m12423(r7, r4)
            r6.clear()
            if (r0 == 0) goto L41
            int r3 = r3 - r2
        L1d:
            if (r3 < 0) goto L65
            android.view.View r0 = r5.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r1 = (androidx.appcompat.widget.Toolbar.C7406) r1
            int r2 = r1.f25746
            if (r2 != 0) goto L3e
            boolean r2 = r5.m28400(r0)
            if (r2 == 0) goto L3e
            int r1 = r1.f25109
            int r1 = r5.m28386(r1)
            if (r1 != r7) goto L3e
            r6.add(r0)
        L3e:
            int r3 = r3 + (-1)
            goto L1d
        L41:
            if (r1 >= r3) goto L65
            android.view.View r0 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r2 = (androidx.appcompat.widget.Toolbar.C7406) r2
            int r4 = r2.f25746
            if (r4 != 0) goto L62
            boolean r4 = r5.m28400(r0)
            if (r4 == 0) goto L62
            int r2 = r2.f25109
            int r2 = r5.m28386(r2)
            if (r2 != r7) goto L62
            r6.add(r0)
        L62:
            int r1 = r1 + 1
            goto L41
        L65:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m28380(android.view.View r3, boolean r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r0 = r2.generateDefaultLayoutParams()
            goto L18
        Lb:
            boolean r1 = r2.checkLayoutParams(r0)
            if (r1 != 0) goto L16
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r0 = r2.generateLayoutParams(r0)
            goto L18
        L16:
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r0 = (androidx.appcompat.widget.Toolbar.C7406) r0
        L18:
            r1 = 1
            r0.f25746 = r1
            if (r4 == 0) goto L2a
            android.view.View r4 = r2.mExpandedActionView
            if (r4 == 0) goto L2a
            r3.setLayoutParams(r0)
            java.util.ArrayList<android.view.View> r4 = r2.mHiddenViews
            r4.add(r3)
            goto L2d
        L2a:
            r2.addView(r3, r0)
        L2d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m28381() {
            r1 = this;
            Yue.ۥۡۧ۠ۧ r0 = r1.mContentInsets
            if (r0 != 0) goto Lb
            Yue.ۥۡۧ۠ۧ r0 = new Yue.ۥۡۧ۠ۧ
            r0.<init>()
            r1.mContentInsets = r0
        Lb:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m28382() {
            r2 = this;
            android.widget.ImageView r0 = r2.mLogoView
            if (r0 != 0) goto Lf
            Yue.ۥ۟ۡۢۢ r0 = new Yue.ۥ۟ۡۢۢ
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.mLogoView = r0
        Lf:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m28383() {
            r3 = this;
            r3.m28384()
            androidx.appcompat.widget.ActionMenuView r0 = r3.mMenuView
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r0.m28294()
            if (r0 != 0) goto L2e
            androidx.appcompat.widget.ActionMenuView r0 = r3.mMenuView
            android.view.Menu r0 = r0.getMenu()
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = (androidx.appcompat.view.menu.C7343) r0
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟۠ r1 = r3.mExpandedMenuPresenter
            if (r1 != 0) goto L1e
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟۠ r1 = new androidx.appcompat.widget.Toolbar$ۥ۟۟۟۠
            r1.<init>(r3)
            r3.mExpandedMenuPresenter = r1
        L1e:
            androidx.appcompat.widget.ActionMenuView r1 = r3.mMenuView
            r2 = 1
            r1.setExpandedActionViewsExclusive(r2)
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟۠ r1 = r3.mExpandedMenuPresenter
            android.content.Context r2 = r3.mPopupContext
            r0.addMenuPresenter(r1, r2)
            r3.updateBackInvokedCallbackState()
        L2e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m28384() {
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.mMenuView
            if (r0 != 0) goto L40
            androidx.appcompat.widget.ActionMenuView r0 = new androidx.appcompat.widget.ActionMenuView
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.mMenuView = r0
            int r1 = r3.mPopupTheme
            r0.setPopupTheme(r1)
            androidx.appcompat.widget.ActionMenuView r0 = r3.mMenuView
            androidx.appcompat.widget.ActionMenuView$ۥ۟۟۟۟ r1 = r3.mMenuViewItemClickListener
            r0.setOnMenuItemClickListener(r1)
            androidx.appcompat.widget.ActionMenuView r0 = r3.mMenuView
            androidx.appcompat.view.menu.ۥ۟۟۟ۤ$ۥ r1 = r3.mActionMenuPresenterCallback
            androidx.appcompat.widget.Toolbar$ۥ۟۟ r2 = new androidx.appcompat.widget.Toolbar$ۥ۟۟
            r2.<init>(r3)
            r0.m28295(r1, r2)
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r0 = r3.generateDefaultLayoutParams()
            int r1 = r3.mButtonGravity
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 8388613(0x800005, float:1.175495E-38)
            r1 = r1 | r2
            r0.f25109 = r1
            androidx.appcompat.widget.ActionMenuView r1 = r3.mMenuView
            r1.setLayoutParams(r0)
            androidx.appcompat.widget.ActionMenuView r0 = r3.mMenuView
            r1 = 0
            r3.m28380(r0, r1)
        L40:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m28385() {
            r4 = this;
            android.widget.ImageButton r0 = r4.mNavButtonView
            if (r0 != 0) goto L25
            Yue.ۥ۟ۡۢ۟ r0 = new Yue.ۥ۟ۡۢ۟
            android.content.Context r1 = r4.getContext()
            r2 = 0
            int r3 = Yue.C5058.C5060.f16805
            r0.<init>(r1, r2, r3)
            r4.mNavButtonView = r0
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r0 = r4.generateDefaultLayoutParams()
            int r1 = r4.mButtonGravity
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 8388611(0x800003, float:1.1754948E-38)
            r1 = r1 | r2
            r0.f25109 = r1
            android.widget.ImageButton r1 = r4.mNavButtonView
            r1.setLayoutParams(r0)
        L25:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int m28386(int r5) {
            r4 = this;
            int r0 = r4.getLayoutDirection()
            int r5 = Yue.C2911.m12423(r5, r0)
            r5 = r5 & 7
            r1 = 1
            if (r5 == r1) goto L17
            r2 = 3
            if (r5 == r2) goto L17
            r3 = 5
            if (r5 == r3) goto L17
            if (r0 != r1) goto L16
            r2 = r3
        L16:
            return r2
        L17:
            return r5
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final int m28387(android.view.View r7, int r8) {
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r0 = (androidx.appcompat.widget.Toolbar.C7406) r0
            int r7 = r7.getMeasuredHeight()
            r1 = 0
            if (r8 <= 0) goto L12
            int r8 = r7 - r8
            int r8 = r8 / 2
            goto L13
        L12:
            r8 = r1
        L13:
            int r2 = r0.f25109
            int r2 = r6.m28388(r2)
            r3 = 48
            if (r2 == r3) goto L58
            r3 = 80
            if (r2 == r3) goto L49
            int r8 = r6.getPaddingTop()
            int r2 = r6.getPaddingBottom()
            int r3 = r6.getHeight()
            int r4 = r3 - r8
            int r4 = r4 - r2
            int r4 = r4 - r7
            int r4 = r4 / 2
            int r5 = r0.topMargin
            if (r4 >= r5) goto L39
            r4 = r5
            goto L47
        L39:
            int r3 = r3 - r2
            int r3 = r3 - r7
            int r3 = r3 - r4
            int r3 = r3 - r8
            int r7 = r0.bottomMargin
            if (r3 >= r7) goto L47
            int r7 = r7 - r3
            int r4 = r4 - r7
            int r4 = java.lang.Math.max(r1, r4)
        L47:
            int r8 = r8 + r4
            return r8
        L49:
            int r1 = r6.getHeight()
            int r2 = r6.getPaddingBottom()
            int r1 = r1 - r2
            int r1 = r1 - r7
            int r7 = r0.bottomMargin
            int r1 = r1 - r7
            int r1 = r1 - r8
            return r1
        L58:
            int r7 = r6.getPaddingTop()
            int r7 = r7 - r8
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final int m28388(int r2) {
            r1 = this;
            r2 = r2 & 112(0x70, float:1.57E-43)
            r0 = 16
            if (r2 == r0) goto L12
            r0 = 48
            if (r2 == r0) goto L12
            r0 = 80
            if (r2 == r0) goto L12
            int r2 = r1.mGravity
            r2 = r2 & 112(0x70, float:1.57E-43)
        L12:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final int m28389(android.view.View r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r0 = r2.getMarginStart()
            int r2 = r2.getMarginEnd()
            int r0 = r0 + r2
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final int m28390(android.view.View r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r0 = r2.topMargin
            int r2 = r2.bottomMargin
            int r0 = r0 + r2
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final int m28391(java.util.List<android.view.View> r9, int[] r10) {
            r8 = this;
            r0 = 0
            r1 = r10[r0]
            r2 = 1
            r10 = r10[r2]
            int r2 = r9.size()
            r3 = r0
            r4 = r3
        Lc:
            if (r3 >= r2) goto L3e
            java.lang.Object r5 = r9.get(r3)
            android.view.View r5 = (android.view.View) r5
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r6 = (androidx.appcompat.widget.Toolbar.C7406) r6
            int r7 = r6.leftMargin
            int r7 = r7 - r1
            int r1 = r6.rightMargin
            int r1 = r1 - r10
            int r10 = java.lang.Math.max(r0, r7)
            int r6 = java.lang.Math.max(r0, r1)
            int r7 = -r7
            int r7 = java.lang.Math.max(r0, r7)
            int r1 = -r1
            int r1 = java.lang.Math.max(r0, r1)
            int r5 = r5.getMeasuredWidth()
            int r10 = r10 + r5
            int r10 = r10 + r6
            int r4 = r4 + r10
            int r3 = r3 + 1
            r10 = r1
            r1 = r7
            goto Lc
        L3e:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final boolean m28392(android.view.View r2) {
            r1 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == r1) goto L11
            java.util.ArrayList<android.view.View> r0 = r1.mHiddenViews
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final int m28393(android.view.View r5, int r6, int[] r7, int r8) {
            r4 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r0 = (androidx.appcompat.widget.Toolbar.C7406) r0
            int r1 = r0.leftMargin
            r2 = 0
            r3 = r7[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r6 = r6 + r3
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r7[r2] = r1
            int r7 = r4.m28387(r5, r8)
            int r8 = r5.getMeasuredWidth()
            int r1 = r6 + r8
            int r2 = r5.getMeasuredHeight()
            int r2 = r2 + r7
            r5.layout(r6, r7, r1, r2)
            int r5 = r0.rightMargin
            int r8 = r8 + r5
            int r6 = r6 + r8
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final int m28394(android.view.View r6, int r7, int[] r8, int r9) {
            r5 = this;
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ r0 = (androidx.appcompat.widget.Toolbar.C7406) r0
            int r1 = r0.rightMargin
            r2 = 1
            r3 = r8[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r7 = r7 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r8[r2] = r1
            int r8 = r5.m28387(r6, r9)
            int r9 = r6.getMeasuredWidth()
            int r1 = r7 - r9
            int r2 = r6.getMeasuredHeight()
            int r2 = r2 + r8
            r6.layout(r1, r8, r7, r2)
            int r6 = r0.leftMargin
            int r9 = r9 + r6
            int r7 = r7 - r9
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final int m28395(android.view.View r8, int r9, int r10, int r11, int r12, int[] r13) {
            r7 = this;
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r0.leftMargin
            r2 = 0
            r3 = r13[r2]
            int r1 = r1 - r3
            int r3 = r0.rightMargin
            r4 = 1
            r5 = r13[r4]
            int r3 = r3 - r5
            int r5 = java.lang.Math.max(r2, r1)
            int r6 = java.lang.Math.max(r2, r3)
            int r5 = r5 + r6
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r13[r2] = r1
            int r1 = -r3
            int r1 = java.lang.Math.max(r2, r1)
            r13[r4] = r1
            int r13 = r7.getPaddingLeft()
            int r1 = r7.getPaddingRight()
            int r13 = r13 + r1
            int r13 = r13 + r5
            int r13 = r13 + r10
            int r10 = r0.width
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r9, r13, r10)
            int r10 = r7.getPaddingTop()
            int r13 = r7.getPaddingBottom()
            int r10 = r10 + r13
            int r13 = r0.topMargin
            int r10 = r10 + r13
            int r13 = r0.bottomMargin
            int r10 = r10 + r13
            int r10 = r10 + r12
            int r12 = r0.height
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r11, r10, r12)
            r8.measure(r9, r10)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r5
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m28396(android.view.View r4, int r5, int r6, int r7, int r8, int r9) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r3.getPaddingLeft()
            int r2 = r3.getPaddingRight()
            int r1 = r1 + r2
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            int r1 = r1 + r6
            int r6 = r0.width
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r1, r6)
            int r6 = r3.getPaddingTop()
            int r1 = r3.getPaddingBottom()
            int r6 = r6 + r1
            int r1 = r0.topMargin
            int r6 = r6 + r1
            int r1 = r0.bottomMargin
            int r6 = r6 + r1
            int r6 = r6 + r8
            int r8 = r0.height
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r7, r6, r8)
            int r7 = android.view.View.MeasureSpec.getMode(r6)
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 == r8) goto L4a
            if (r9 < 0) goto L4a
            if (r7 == 0) goto L46
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r9 = java.lang.Math.min(r6, r9)
        L46:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r8)
        L4a:
            r4.measure(r5, r6)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m28397() {
            r4 = this;
            android.view.Menu r0 = r4.getMenu()
            java.util.ArrayList r1 = r4.getCurrentMenuItems()
            Yue.ۥۡ۠ۦۢ r2 = r4.mMenuHostHelper
            android.view.MenuInflater r3 = r4.getMenuInflater()
            r2.m16164(r0, r3)
            java.util.ArrayList r0 = r4.getCurrentMenuItems()
            r0.removeAll(r1)
            r4.mProvidedMenuItems = r0
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m28398() {
            r1 = this;
            java.lang.Runnable r0 = r1.mShowOverflowMenuRunnable
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.mShowOverflowMenuRunnable
            r1.post(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean m28399() {
            r5 = this;
            boolean r0 = r5.mCollapsible
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r5.getChildCount()
            r2 = r1
        Lb:
            if (r2 >= r0) goto L27
            android.view.View r3 = r5.getChildAt(r2)
            boolean r4 = r5.m28400(r3)
            if (r4 == 0) goto L24
            int r4 = r3.getMeasuredWidth()
            if (r4 <= 0) goto L24
            int r3 = r3.getMeasuredHeight()
            if (r3 <= 0) goto L24
            return r1
        L24:
            int r2 = r2 + 1
            goto Lb
        L27:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean m28400(android.view.View r2) {
            r1 = this;
            if (r2 == 0) goto L12
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != r1) goto L12
            int r2 = r2.getVisibility()
            r0 = 8
            if (r2 == r0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }
}
