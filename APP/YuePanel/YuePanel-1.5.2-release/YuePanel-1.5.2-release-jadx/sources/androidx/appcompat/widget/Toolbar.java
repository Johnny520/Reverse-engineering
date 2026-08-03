package androidx.appcompat.widget;

import Yue.AbstractC2967;
import Yue.C3311;
import Yue.C3314;
import Yue.C3323;
import Yue.C3343;
import Yue.C5194;
import Yue.C6154;
import Yue.C6898;
import Yue.C7188;
import Yue.C7683;
import Yue.C7837;
import Yue.C7939;
import Yue.C8273;
import Yue.C8370;
import Yue.InterfaceC3875;
import Yue.InterfaceC3897;
import Yue.InterfaceC4330;
import Yue.InterfaceC4482;
import Yue.InterfaceC4525;
import Yue.InterfaceC5922;
import Yue.InterfaceC6151;
import Yue.InterfaceC6165;
import Yue.InterfaceC6166;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import Yue.InterfaceC7613;
import Yue.InterfaceC7651;
import Yue.InterfaceC8392;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AbstractC1583;
import androidx.appcompat.view.menu.C8694;
import androidx.appcompat.view.menu.C8697;
import androidx.appcompat.view.menu.InterfaceC8699;
import androidx.appcompat.view.menu.InterfaceC8700;
import androidx.appcompat.view.menu.SubMenuC8702;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC6151 {
    private static final String TAG = "Toolbar";
    private InterfaceC8699.InterfaceC1607 mActionMenuPresenterCallback;
    private OnBackInvokedCallback mBackInvokedCallback;
    private boolean mBackInvokedCallbackEnabled;
    private OnBackInvokedDispatcher mBackInvokedDispatcher;
    int mButtonGravity;
    ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private C7188 mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private C8733 mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    C8694.InterfaceC1603 mMenuBuilderCallback;
    final C6154 mMenuHostHelper;
    ActionMenuView mMenuView;
    private final ActionMenuView.InterfaceC8709 mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    InterfaceC8735 mOnMenuItemClickListener;
    private C1628 mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private ArrayList<MenuItem> mProvidedMenuItems;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private ColorStateList mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private ColorStateList mTitleTextColor;
    private TextView mTitleTextView;
    private C8762 mWrapper;

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$ۥ */
    public class C1624 implements ActionMenuView.InterfaceC8709 {
        public C1624() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC8709
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.mMenuHostHelper.m18964(menuItem)) {
                return true;
            }
            InterfaceC8735 interfaceC8735 = Toolbar.this.mOnMenuItemClickListener;
            if (interfaceC8735 != null) {
                return interfaceC8735.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$ۥ۟ */
    public class RunnableC1625 implements Runnable {
        public RunnableC1625() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.showOverflowMenu();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$ۥ۟۟, reason: contains not printable characters */
    public class C8730 implements C8694.InterfaceC1603 {
        public C8730() {
        }

        @Override // androidx.appcompat.view.menu.C8694.InterfaceC1603
        public boolean onMenuItemSelected(@InterfaceC6391 C8694 c8694, @InterfaceC6391 MenuItem menuItem) {
            C8694.InterfaceC1603 interfaceC1603 = Toolbar.this.mMenuBuilderCallback;
            return interfaceC1603 != null && interfaceC1603.onMenuItemSelected(c8694, menuItem);
        }

        @Override // androidx.appcompat.view.menu.C8694.InterfaceC1603
        public void onMenuModeChange(@InterfaceC6391 C8694 c8694) {
            if (!Toolbar.this.mMenuView.m29097()) {
                Toolbar.this.mMenuHostHelper.m18965(c8694);
            }
            C8694.InterfaceC1603 interfaceC1603 = Toolbar.this.mMenuBuilderCallback;
            if (interfaceC1603 != null) {
                interfaceC1603.onMenuModeChange(c8694);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$ۥ۟۟۟, reason: contains not printable characters */
    public class ViewOnClickListenerC8731 implements View.OnClickListener {
        public ViewOnClickListenerC8731() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.collapseActionView();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(33)
    public static class C8732 {
        @InterfaceC4482
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        public static OnBackInvokedDispatcher m4682(@InterfaceC6391 View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @InterfaceC6391
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static OnBackInvokedCallback m4683(@InterfaceC6391 final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: Yue.ۥۢۡۨ
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m29182(@InterfaceC6391 Object obj, @InterfaceC6391 Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m29183(@InterfaceC6391 Object obj, @InterfaceC6391 Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$ۥ۟۟۟۠, reason: contains not printable characters */
    public class C8733 implements InterfaceC8699 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public C8694 f26314;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public C8697 f26315;

        public C8733() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC8699
        public boolean collapseItemActionView(C8694 c8694, C8697 c8697) {
            KeyEvent.Callback callback = Toolbar.this.mExpandedActionView;
            if (callback instanceof InterfaceC3875) {
                ((InterfaceC3875) callback).mo10705();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.mExpandedActionView);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.mCollapseButtonView);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.mExpandedActionView = null;
            toolbar3.addChildrenForExpandedActionView();
            this.f26315 = null;
            Toolbar.this.requestLayout();
            c8697.m29041(false);
            Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC8699
        public boolean expandItemActionView(C8694 c8694, C8697 c8697) {
            Toolbar.this.ensureCollapseButtonView();
            ViewParent parent = Toolbar.this.mCollapseButtonView.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.mCollapseButtonView);
            }
            Toolbar.this.mExpandedActionView = c8697.getActionView();
            this.f26315 = c8697;
            ViewParent parent2 = Toolbar.this.mExpandedActionView.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.mExpandedActionView);
                }
                C8734 c8734GenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                c8734GenerateDefaultLayoutParams.f3618 = (toolbar4.mButtonGravity & 112) | C5194.f1338;
                c8734GenerateDefaultLayoutParams.f3665 = 2;
                toolbar4.mExpandedActionView.setLayoutParams(c8734GenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.mExpandedActionView);
            }
            Toolbar.this.removeChildrenForExpandedActionView();
            Toolbar.this.requestLayout();
            c8697.m29041(true);
            KeyEvent.Callback callback = Toolbar.this.mExpandedActionView;
            if (callback instanceof InterfaceC3875) {
                ((InterfaceC3875) callback).mo912();
            }
            Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC8699
        public boolean flagActionItems() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC8699
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC8699
        public InterfaceC8700 getMenuView(ViewGroup viewGroup) {
            return null;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC8699
        public void initForMenu(Context context, C8694 c8694) {
            C8697 c8697;
            C8694 c86942 = this.f26314;
            if (c86942 != null && (c8697 = this.f26315) != null) {
                c86942.collapseItemActionView(c8697);
            }
            this.f26314 = c8694;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC8699
        public void onCloseMenu(C8694 c8694, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC8699
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC8699
        public Parcelable onSaveInstanceState() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC8699
        public boolean onSubMenuSelected(SubMenuC8702 subMenuC8702) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC8699
        public void setCallback(InterfaceC8699.InterfaceC1607 interfaceC1607) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC8699
        public void updateMenuView(boolean z) {
            if (this.f26315 != null) {
                C8694 c8694 = this.f26314;
                if (c8694 != null) {
                    int size = c8694.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f26314.getItem(i) == this.f26315) {
                            return;
                        }
                    }
                }
                collapseItemActionView(this.f26314, this.f26315);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public interface InterfaceC8735 {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$ۥۣ۟۟۟, reason: contains not printable characters */
    public static class C8736 extends AbstractC2967 {
        public static final Parcelable.Creator<C8736> CREATOR = new C1626();

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f26320;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public boolean f26321;

        /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$ۥۣ۟۟۟$ۥ */
        public class C1626 implements Parcelable.ClassLoaderCreator<C8736> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
            public C8736 createFromParcel(Parcel parcel) {
                return new C8736(parcel, null);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
            public C8736 createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C8736(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public C8736[] newArray(int i) {
                return new C8736[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8736(Parcel parcel) {
            this(parcel, null);
        }

        @Override // Yue.AbstractC2967, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f26320);
            parcel.writeInt(this.f26321 ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C8736(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f26320 = parcel.readInt();
            this.f26321 = parcel.readInt() != 0;
        }

        public C8736(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Toolbar(@InterfaceC6391 Context context) {
        this(context, null);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C7683(getContext());
    }

    public void addChildrenForExpandedActionView() {
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            addView(this.mHiddenViews.get(size));
        }
        this.mHiddenViews.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC6151
    @InterfaceC5922
    public void addMenuProvider(@InterfaceC6391 InterfaceC6165 interfaceC6165) {
        this.mMenuHostHelper.m18957(interfaceC6165);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.mMenuView) != null && actionMenuView.m29098();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C8734);
    }

    public void collapseActionView() {
        C8733 c8733 = this.mExpandedMenuPresenter;
        C8697 c8697 = c8733 == null ? null : c8733.f26315;
        if (c8697 != null) {
            c8697.collapseActionView();
        }
    }

    public void dismissPopupMenus() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.m29089();
        }
    }

    public void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            C3311 c3311 = new C3311(getContext(), null, C6898.C1110.f18603);
            this.mCollapseButtonView = c3311;
            c3311.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            C8734 c8734GenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c8734GenerateDefaultLayoutParams.f3618 = (this.mButtonGravity & 112) | C5194.f1338;
            c8734GenerateDefaultLayoutParams.f3665 = 2;
            this.mCollapseButtonView.setLayoutParams(c8734GenerateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new ViewOnClickListenerC8731());
        }
    }

    @InterfaceC6490
    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @InterfaceC6490
    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C7188 c7188 = this.mContentInsets;
        if (c7188 != null) {
            return c7188.m3479();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.mContentInsetEndWithActions;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C7188 c7188 = this.mContentInsets;
        if (c7188 != null) {
            return c7188.m3480();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C7188 c7188 = this.mContentInsets;
        if (c7188 != null) {
            return c7188.m22516();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C7188 c7188 = this.mContentInsets;
        if (c7188 != null) {
            return c7188.m22517();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.mContentInsetStartWithNavigation;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C8694 c8694M29100;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (c8694M29100 = actionMenuView.m29100()) == null || !c8694M29100.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m29164();
        return this.mMenuView.getMenu();
    }

    @InterfaceC8392
    @InterfaceC6490
    public View getNavButtonView() {
        return this.mNavButtonView;
    }

    @InterfaceC6490
    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @InterfaceC6490
    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public C1628 getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    @InterfaceC6490
    public Drawable getOverflowIcon() {
        m29164();
        return this.mMenuView.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.mPopupContext;
    }

    @InterfaceC7651
    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    @InterfaceC8392
    @InterfaceC6490
    public final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    @InterfaceC8392
    @InterfaceC6490
    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public InterfaceC4330 getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new C8762(this, true);
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        C8733 c8733 = this.mExpandedMenuPresenter;
        return (c8733 == null || c8733.f26315 == null) ? false : true;
    }

    public boolean hideOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.m29095();
    }

    public void inflateMenu(@InterfaceC6166 int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    @Override // Yue.InterfaceC6151
    @InterfaceC5922
    public void invalidateMenu() {
        Iterator<MenuItem> it = this.mProvidedMenuItems.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        m29178();
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.mBackInvokedCallbackEnabled;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowMenuShowPending() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.m29096();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.m29097();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBackInvokedCallbackState();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
        updateBackInvokedCallbackState();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02a1 A[LOOP:0: B:106:0x029f->B:107:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c3 A[LOOP:1: B:109:0x02c1->B:110:0x02c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02fc A[LOOP:2: B:118:0x02fa->B:119:0x02fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM29174;
        int iM29175;
        boolean zM29181;
        boolean zM291812;
        int i5;
        int measuredHeight;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int paddingTop;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int size;
        int iM291742;
        int i16;
        int size2;
        int i17;
        int i18;
        int size3;
        boolean z2 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i19 = width - paddingRight;
        int[] iArr = this.mTempMargins;
        iArr[1] = 0;
        iArr[0] = 0;
        int iM27361 = C8273.m27361(this);
        int iMin = iM27361 >= 0 ? Math.min(iM27361, i4 - i2) : 0;
        if (!m29181(this.mNavButtonView)) {
            iM29174 = paddingLeft;
        } else {
            if (z2) {
                iM29175 = m29175(this.mNavButtonView, i19, iArr, iMin);
                iM29174 = paddingLeft;
                if (m29181(this.mCollapseButtonView)) {
                    if (z2) {
                        iM29175 = m29175(this.mCollapseButtonView, iM29175, iArr, iMin);
                    } else {
                        iM29174 = m29174(this.mCollapseButtonView, iM29174, iArr, iMin);
                    }
                }
                if (m29181(this.mMenuView)) {
                    if (z2) {
                        iM29174 = m29174(this.mMenuView, iM29174, iArr, iMin);
                    } else {
                        iM29175 = m29175(this.mMenuView, iM29175, iArr, iMin);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - iM29174);
                iArr[1] = Math.max(0, currentContentInsetRight - (i19 - iM29175));
                int iMax = Math.max(iM29174, currentContentInsetLeft);
                int iMin2 = Math.min(iM29175, i19 - currentContentInsetRight);
                if (m29181(this.mExpandedActionView)) {
                    if (z2) {
                        iMin2 = m29175(this.mExpandedActionView, iMin2, iArr, iMin);
                    } else {
                        iMax = m29174(this.mExpandedActionView, iMax, iArr, iMin);
                    }
                }
                if (m29181(this.mLogoView)) {
                    if (z2) {
                        iMin2 = m29175(this.mLogoView, iMin2, iArr, iMin);
                    } else {
                        iMax = m29174(this.mLogoView, iMax, iArr, iMin);
                    }
                }
                zM29181 = m29181(this.mTitleTextView);
                zM291812 = m29181(this.mSubtitleTextView);
                if (zM29181) {
                    i5 = paddingRight;
                    measuredHeight = 0;
                } else {
                    C8734 c8734 = (C8734) this.mTitleTextView.getLayoutParams();
                    i5 = paddingRight;
                    measuredHeight = ((ViewGroup.MarginLayoutParams) c8734).topMargin + this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c8734).bottomMargin;
                }
                if (zM291812) {
                    i6 = width;
                } else {
                    C8734 c87342 = (C8734) this.mSubtitleTextView.getLayoutParams();
                    i6 = width;
                    measuredHeight += ((ViewGroup.MarginLayoutParams) c87342).topMargin + this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c87342).bottomMargin;
                }
                if (!zM29181 || zM291812) {
                    TextView textView = !zM29181 ? this.mTitleTextView : this.mSubtitleTextView;
                    TextView textView2 = !zM291812 ? this.mSubtitleTextView : this.mTitleTextView;
                    C8734 c87343 = (C8734) textView.getLayoutParams();
                    C8734 c87344 = (C8734) textView2.getLayoutParams();
                    boolean z3 = (zM29181 && this.mTitleTextView.getMeasuredWidth() > 0) || (zM291812 && this.mSubtitleTextView.getMeasuredWidth() > 0);
                    i7 = this.mGravity & 112;
                    i8 = paddingLeft;
                    if (i7 == 48) {
                        i9 = iMax;
                        i10 = iMin;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c87343).topMargin + this.mTitleMarginTop;
                    } else if (i7 != 80) {
                        int iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                        int i20 = ((ViewGroup.MarginLayoutParams) c87343).topMargin;
                        i10 = iMin;
                        int i21 = this.mTitleMarginTop;
                        i9 = iMax;
                        if (iMax2 < i20 + i21) {
                            iMax2 = i20 + i21;
                        } else {
                            int i22 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                            int i23 = ((ViewGroup.MarginLayoutParams) c87343).bottomMargin;
                            int i24 = this.mTitleMarginBottom;
                            if (i22 < i23 + i24) {
                                iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c87344).bottomMargin + i24) - i22));
                            }
                        }
                        paddingTop = paddingTop2 + iMax2;
                    } else {
                        i9 = iMax;
                        i10 = iMin;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c87344).bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
                    }
                    if (!z2) {
                        i11 = 0;
                        int i25 = (z3 ? this.mTitleMarginStart : 0) - iArr[0];
                        iMax = i9 + Math.max(0, i25);
                        iArr[0] = Math.max(0, -i25);
                        if (zM29181) {
                            C8734 c87345 = (C8734) this.mTitleTextView.getLayoutParams();
                            int measuredWidth = this.mTitleTextView.getMeasuredWidth() + iMax;
                            int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                            this.mTitleTextView.layout(iMax, paddingTop, measuredWidth, measuredHeight2);
                            i12 = measuredWidth + this.mTitleMarginEnd;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c87345).bottomMargin;
                        } else {
                            i12 = iMax;
                        }
                        if (zM291812) {
                            int i26 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C8734) this.mSubtitleTextView.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.mSubtitleTextView.getMeasuredWidth() + iMax;
                            this.mSubtitleTextView.layout(iMax, i26, measuredWidth2, this.mSubtitleTextView.getMeasuredHeight() + i26);
                            i13 = measuredWidth2 + this.mTitleMarginEnd;
                        } else {
                            i13 = iMax;
                        }
                        if (z3) {
                            iMax = Math.max(i12, i13);
                        }
                        m4680(this.mTempViews, 3);
                        size = this.mTempViews.size();
                        iM291742 = iMax;
                        for (i16 = i11; i16 < size; i16++) {
                            iM291742 = m29174(this.mTempViews.get(i16), iM291742, iArr, i10);
                        }
                        int i27 = i10;
                        m4680(this.mTempViews, 5);
                        size2 = this.mTempViews.size();
                        for (i17 = i11; i17 < size2; i17++) {
                            iMin2 = m29175(this.mTempViews.get(i17), iMin2, iArr, i27);
                        }
                        m4680(this.mTempViews, 1);
                        int iM29172 = m29172(this.mTempViews, iArr);
                        i18 = (i8 + (((i6 - i8) - i5) / 2)) - (iM29172 / 2);
                        int i28 = iM29172 + i18;
                        if (i18 >= iM291742) {
                            iM291742 = i28 > iMin2 ? i18 - (i28 - iMin2) : i18;
                        }
                        size3 = this.mTempViews.size();
                        while (i11 < size3) {
                            iM291742 = m29174(this.mTempViews.get(i11), iM291742, iArr, i27);
                            i11++;
                        }
                        this.mTempViews.clear();
                    }
                    int i29 = (z3 ? this.mTitleMarginStart : 0) - iArr[1];
                    iMin2 -= Math.max(0, i29);
                    iArr[1] = Math.max(0, -i29);
                    if (zM29181) {
                        C8734 c87346 = (C8734) this.mTitleTextView.getLayoutParams();
                        int measuredWidth3 = iMin2 - this.mTitleTextView.getMeasuredWidth();
                        int measuredHeight3 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(measuredWidth3, paddingTop, iMin2, measuredHeight3);
                        i14 = measuredWidth3 - this.mTitleMarginEnd;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c87346).bottomMargin;
                    } else {
                        i14 = iMin2;
                    }
                    if (zM291812) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C8734) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        this.mSubtitleTextView.layout(iMin2 - this.mSubtitleTextView.getMeasuredWidth(), i30, iMin2, this.mSubtitleTextView.getMeasuredHeight() + i30);
                        i15 = iMin2 - this.mTitleMarginEnd;
                    } else {
                        i15 = iMin2;
                    }
                    if (z3) {
                        iMin2 = Math.min(i14, i15);
                    }
                    iMax = i9;
                } else {
                    i8 = paddingLeft;
                    i10 = iMin;
                }
                i11 = 0;
                m4680(this.mTempViews, 3);
                size = this.mTempViews.size();
                iM291742 = iMax;
                while (i16 < size) {
                }
                int i272 = i10;
                m4680(this.mTempViews, 5);
                size2 = this.mTempViews.size();
                while (i17 < size2) {
                }
                m4680(this.mTempViews, 1);
                int iM291722 = m29172(this.mTempViews, iArr);
                i18 = (i8 + (((i6 - i8) - i5) / 2)) - (iM291722 / 2);
                int i282 = iM291722 + i18;
                if (i18 >= iM291742) {
                }
                size3 = this.mTempViews.size();
                while (i11 < size3) {
                }
                this.mTempViews.clear();
            }
            iM29174 = m29174(this.mNavButtonView, paddingLeft, iArr, iMin);
        }
        iM29175 = i19;
        if (m29181(this.mCollapseButtonView)) {
        }
        if (m29181(this.mMenuView)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM29174);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i19 - iM29175));
        int iMax3 = Math.max(iM29174, currentContentInsetLeft2);
        int iMin22 = Math.min(iM29175, i19 - currentContentInsetRight2);
        if (m29181(this.mExpandedActionView)) {
        }
        if (m29181(this.mLogoView)) {
        }
        zM29181 = m29181(this.mTitleTextView);
        zM291812 = m29181(this.mSubtitleTextView);
        if (zM29181) {
        }
        if (zM291812) {
        }
        if (zM29181) {
            if (!zM29181) {
            }
            if (!zM291812) {
            }
            C8734 c873432 = (C8734) textView.getLayoutParams();
            C8734 c873442 = (C8734) textView2.getLayoutParams();
            if (zM29181) {
                i7 = this.mGravity & 112;
                i8 = paddingLeft;
                if (i7 == 48) {
                }
                if (!z2) {
                }
            } else {
                i7 = this.mGravity & 112;
                i8 = paddingLeft;
                if (i7 == 48) {
                }
                if (!z2) {
                }
            }
        }
        m4680(this.mTempViews, 3);
        size = this.mTempViews.size();
        iM291742 = iMax3;
        while (i16 < size) {
        }
        int i2722 = i10;
        m4680(this.mTempViews, 5);
        size2 = this.mTempViews.size();
        while (i17 < size2) {
        }
        m4680(this.mTempViews, 1);
        int iM2917222 = m29172(this.mTempViews, iArr);
        i18 = (i8 + (((i6 - i8) - i5) / 2)) - (iM2917222 / 2);
        int i2822 = iM2917222 + i18;
        if (i18 >= iM291742) {
        }
        size3 = this.mTempViews.size();
        while (i11 < size3) {
        }
        this.mTempViews.clear();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.mTempMargins;
        boolean zM4344 = C8370.m4344(this);
        int i3 = !zM4344 ? 1 : 0;
        if (m29181(this.mNavButtonView)) {
            m29177(this.mNavButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            measuredWidth = this.mNavButtonView.getMeasuredWidth() + m29170(this.mNavButtonView);
            iMax = Math.max(0, this.mNavButtonView.getMeasuredHeight() + m29171(this.mNavButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m29181(this.mCollapseButtonView)) {
            m29177(this.mCollapseButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            measuredWidth = this.mCollapseButtonView.getMeasuredWidth() + m29170(this.mCollapseButtonView);
            iMax = Math.max(iMax, this.mCollapseButtonView.getMeasuredHeight() + m29171(this.mCollapseButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr[zM4344 ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (m29181(this.mMenuView)) {
            m29177(this.mMenuView, i, iMax3, i2, 0, this.mMaxButtonHeight);
            measuredWidth2 = this.mMenuView.getMeasuredWidth() + m29170(this.mMenuView);
            iMax = Math.max(iMax, this.mMenuView.getMeasuredHeight() + m29171(this.mMenuView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mMenuView.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i3] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (m29181(this.mExpandedActionView)) {
            iMax4 += m29176(this.mExpandedActionView, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.mExpandedActionView.getMeasuredHeight() + m29171(this.mExpandedActionView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mExpandedActionView.getMeasuredState());
        }
        if (m29181(this.mLogoView)) {
            iMax4 += m29176(this.mLogoView, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.mLogoView.getMeasuredHeight() + m29171(this.mLogoView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((C8734) childAt.getLayoutParams()).f3665 == 0 && m29181(childAt)) {
                iMax4 += m29176(childAt, i, iMax4, i2, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + m29171(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i6 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (m29181(this.mTitleTextView)) {
            m29176(this.mTitleTextView, i, iMax4 + i6, i2, i5, iArr);
            int measuredWidth3 = this.mTitleTextView.getMeasuredWidth() + m29170(this.mTitleTextView);
            measuredHeight = this.mTitleTextView.getMeasuredHeight() + m29171(this.mTitleTextView);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.mTitleTextView.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            measuredHeight = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m29181(this.mSubtitleTextView)) {
            iMax2 = Math.max(iMax2, m29176(this.mSubtitleTextView, i, iMax4 + i6, i2, measuredHeight + i5, iArr));
            measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + m29171(this.mSubtitleTextView);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.mSubtitleTextView.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), m29180() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C8736)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C8736 c8736 = (C8736) parcelable;
        super.onRestoreInstanceState(c8736.getSuperState());
        ActionMenuView actionMenuView = this.mMenuView;
        C8694 c8694M29100 = actionMenuView != null ? actionMenuView.m29100() : null;
        int i = c8736.f26320;
        if (i != 0 && this.mExpandedMenuPresenter != null && c8694M29100 != null && (menuItemFindItem = c8694M29100.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c8736.f26321) {
            m29179();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m29162();
        this.mContentInsets.m22519(i == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C8697 c8697;
        C8736 c8736 = new C8736(super.onSaveInstanceState());
        C8733 c8733 = this.mExpandedMenuPresenter;
        if (c8733 != null && (c8697 = c8733.f26315) != null) {
            c8736.f26320 = c8697.getItemId();
        }
        c8736.f26321 = isOverflowMenuShowing();
        return c8736;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    public void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C8734) childAt.getLayoutParams()).f3665 != 2 && childAt != this.mMenuView) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    @Override // Yue.InterfaceC6151
    @InterfaceC5922
    public void removeMenuProvider(@InterfaceC6391 InterfaceC6165 interfaceC6165) {
        this.mMenuHostHelper.m18966(interfaceC6165);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.mBackInvokedCallbackEnabled != z) {
            this.mBackInvokedCallbackEnabled = z;
            updateBackInvokedCallbackState();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCollapseContentDescription(@InterfaceC7613 int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCollapseIcon(@InterfaceC4525 int i) {
        setCollapseIcon(C3323.m396(getContext(), i));
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setCollapsible(boolean z) {
        this.mCollapsible = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        m29162();
        this.mContentInsets.m22518(i, i2);
    }

    public void setContentInsetsRelative(int i, int i2) {
        m29162();
        this.mContentInsets.m22520(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLogo(@InterfaceC4525 int i) {
        setLogo(C3323.m396(getContext(), i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLogoDescription(@InterfaceC7613 int i) {
        setLogoDescription(getContext().getText(i));
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public void setMenu(C8694 c8694, C1628 c1628) {
        if (c8694 == null && this.mMenuView == null) {
            return;
        }
        m29165();
        C8694 c8694M29100 = this.mMenuView.m29100();
        if (c8694M29100 == c8694) {
            return;
        }
        if (c8694M29100 != null) {
            c8694M29100.removeMenuPresenter(this.mOuterActionMenuPresenter);
            c8694M29100.removeMenuPresenter(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new C8733();
        }
        c1628.m29201(true);
        if (c8694 != null) {
            c8694.addMenuPresenter(c1628, this.mPopupContext);
            c8694.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            c1628.initForMenu(this.mPopupContext, null);
            this.mExpandedMenuPresenter.initForMenu(this.mPopupContext, null);
            c1628.updateMenuView(true);
            this.mExpandedMenuPresenter.updateMenuView(true);
        }
        this.mMenuView.setPopupTheme(this.mPopupTheme);
        this.mMenuView.setPresenter(c1628);
        this.mOuterActionMenuPresenter = c1628;
        updateBackInvokedCallbackState();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(InterfaceC8699.InterfaceC1607 interfaceC1607, C8694.InterfaceC1603 interfaceC1603) {
        this.mActionMenuPresenterCallback = interfaceC1607;
        this.mMenuBuilderCallback = interfaceC1603;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.m29101(interfaceC1607, interfaceC1603);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setNavigationContentDescription(@InterfaceC7613 int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setNavigationIcon(@InterfaceC4525 int i) {
        setNavigationIcon(C3323.m396(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m29166();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC8735 interfaceC8735) {
        this.mOnMenuItemClickListener = interfaceC8735;
    }

    public void setOverflowIcon(@InterfaceC6490 Drawable drawable) {
        m29164();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@InterfaceC7651 int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSubtitle(@InterfaceC7613 int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextAppearance(Context context, @InterfaceC7651 int i) {
        this.mSubtitleTextAppearance = i;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSubtitleTextColor(@InterfaceC3897 int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitle(@InterfaceC7613 int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.mTitleMarginStart = i;
        this.mTitleMarginTop = i2;
        this.mTitleMarginEnd = i3;
        this.mTitleMarginBottom = i4;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.mTitleMarginBottom = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.mTitleMarginEnd = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.mTitleMarginStart = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.mTitleMarginTop = i;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, @InterfaceC7651 int i) {
        this.mTitleTextAppearance = i;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitleTextColor(@InterfaceC3897 int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public boolean showOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.m29102();
    }

    public void updateBackInvokedCallbackState() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM4682 = C8732.m4682(this);
            boolean z = hasExpandedActionView() && onBackInvokedDispatcherM4682 != null && isAttachedToWindow() && this.mBackInvokedCallbackEnabled;
            if (z && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = C8732.m4683(new Runnable() { // from class: Yue.ۥۢۡۧۧ
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f23615.collapseActionView();
                        }
                    });
                }
                C8732.m29182(onBackInvokedDispatcherM4682, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = onBackInvokedDispatcherM4682;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.mBackInvokedDispatcher) == null) {
                return;
            }
            C8732.m29183(onBackInvokedDispatcher, this.mBackInvokedCallback);
            this.mBackInvokedDispatcher = null;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m4680(List<View> list, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iM15901 = C5194.m15901(i, getLayoutDirection());
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C8734 c8734 = (C8734) childAt.getLayoutParams();
                if (c8734.f3665 == 0 && m29181(childAt) && m29167(c8734.f3618) == iM15901) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            C8734 c87342 = (C8734) childAt2.getLayoutParams();
            if (c87342.f3665 == 0 && m29181(childAt2) && m29167(c87342.f3618) == iM15901) {
                list.add(childAt2);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m4681(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C8734 c8734GenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C8734) layoutParams;
        c8734GenerateDefaultLayoutParams.f3665 = 1;
        if (!z || this.mExpandedActionView == null) {
            addView(view, c8734GenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(c8734GenerateDefaultLayoutParams);
            this.mHiddenViews.add(view);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m29162() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new C7188();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m29163() {
        if (this.mLogoView == null) {
            this.mLogoView = new C3314(getContext());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m29164() {
        m29165();
        if (this.mMenuView.m29100() == null) {
            C8694 c8694 = (C8694) this.mMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new C8733();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            c8694.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m29165() {
        if (this.mMenuView == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.mMenuView = actionMenuView;
            actionMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            this.mMenuView.m29101(this.mActionMenuPresenterCallback, new C8730());
            C8734 c8734GenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c8734GenerateDefaultLayoutParams.f3618 = (this.mButtonGravity & 112) | 8388613;
            this.mMenuView.setLayoutParams(c8734GenerateDefaultLayoutParams);
            m4681(this.mMenuView, false);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m29166() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new C3311(getContext(), null, C6898.C1110.f18603);
            C8734 c8734GenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c8734GenerateDefaultLayoutParams.f3618 = (this.mButtonGravity & 112) | C5194.f1338;
            this.mNavButtonView.setLayoutParams(c8734GenerateDefaultLayoutParams);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int m29167(int i) {
        int layoutDirection = getLayoutDirection();
        int iM15901 = C5194.m15901(i, layoutDirection) & 7;
        return (iM15901 == 1 || iM15901 == 3 || iM15901 == 5) ? iM15901 : layoutDirection == 1 ? 5 : 3;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final int m29168(View view, int i) {
        C8734 c8734 = (C8734) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int iM29169 = m29169(c8734.f3618);
        if (iM29169 == 48) {
            return getPaddingTop() - i2;
        }
        if (iM29169 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c8734).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i3 = ((ViewGroup.MarginLayoutParams) c8734).topMargin;
        if (iMax < i3) {
            iMax = i3;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i5 = ((ViewGroup.MarginLayoutParams) c8734).bottomMargin;
            if (i4 < i5) {
                iMax = Math.max(0, iMax - (i5 - i4));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final int m29169(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.mGravity & 112;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final int m29170(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final int m29171(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final int m29172(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int measuredWidth = 0;
        while (i3 < size) {
            View view = list.get(i3);
            C8734 c8734 = (C8734) view.getLayoutParams();
            int i4 = ((ViewGroup.MarginLayoutParams) c8734).leftMargin - i;
            int i5 = ((ViewGroup.MarginLayoutParams) c8734).rightMargin - i2;
            int iMax = Math.max(0, i4);
            int iMax2 = Math.max(0, i5);
            int iMax3 = Math.max(0, -i4);
            int iMax4 = Math.max(0, -i5);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i3++;
            i2 = iMax4;
            i = iMax3;
        }
        return measuredWidth;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final boolean m29173(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final int m29174(View view, int i, int[] iArr, int i2) {
        C8734 c8734 = (C8734) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c8734).leftMargin - iArr[0];
        int iMax = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int iM29168 = m29168(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM29168, iMax + measuredWidth, view.getMeasuredHeight() + iM29168);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) c8734).rightMargin;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final int m29175(View view, int i, int[] iArr, int i2) {
        C8734 c8734 = (C8734) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c8734).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM29168 = m29168(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM29168, iMax, view.getMeasuredHeight() + iM29168);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c8734).leftMargin);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final int m29176(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m29177(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m29178() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.mMenuHostHelper.m18962(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.mProvidedMenuItems = currentMenuItems2;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m29179() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean m29180() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m29181(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean m29181(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C8734 extends AbstractC1583.C8639 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final int f26317 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final int f26318 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f26319 = 2;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3665;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8734(@InterfaceC6391 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3665 = 0;
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4684(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C8734(int i, int i2) {
            super(i, i2);
            this.f3665 = 0;
            this.f3618 = 8388627;
        }

        public C8734(int i, int i2, int i3) {
            super(i, i2);
            this.f3665 = 0;
            this.f3618 = i3;
        }

        public C8734(int i) {
            this(-2, -1, i);
        }

        public C8734(C8734 c8734) {
            super((AbstractC1583.C8639) c8734);
            this.f3665 = 0;
            this.f3665 = c8734.f3665;
        }

        public C8734(AbstractC1583.C8639 c8639) {
            super(c8639);
            this.f3665 = 0;
        }

        public C8734(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3665 = 0;
            m4684(marginLayoutParams);
        }

        public C8734(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3665 = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Toolbar(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C6898.C1110.f18604);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC6151
    @InterfaceC5922
    public void addMenuProvider(@InterfaceC6391 InterfaceC6165 interfaceC6165, @InterfaceC6391 LifecycleOwner lifecycleOwner) {
        this.mMenuHostHelper.m18958(interfaceC6165, lifecycleOwner);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    public C8734 generateDefaultLayoutParams() {
        return new C8734(-2, -2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setCollapseContentDescription(@InterfaceC6490 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setCollapseIcon(@InterfaceC6490 Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.mCollapseButtonView;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.mCollapseIcon);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m29163();
            if (!m29173(this.mLogoView)) {
                m4681(this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && m29173(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m29163();
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setNavigationContentDescription(@InterfaceC6490 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m29166();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            C7939.m3953(this.mNavButtonView, charSequence);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setNavigationIcon(@InterfaceC6490 Drawable drawable) {
        if (drawable != null) {
            m29166();
            if (!m29173(this.mNavButtonView)) {
                m4681(this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && m29173(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && m29173(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        } else {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                C3343 c3343 = new C3343(context);
                this.mSubtitleTextView = c3343;
                c3343.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mSubtitleTextAppearance;
                if (i != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!m29173(this.mSubtitleTextView)) {
                m4681(this.mSubtitleTextView, true);
            }
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setSubtitleTextColor(@InterfaceC6391 ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mTitleTextView;
            if (textView != null && m29173(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        } else {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                C3343 c3343 = new C3343(context);
                this.mTitleTextView = c3343;
                c3343.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mTitleTextAppearance;
                if (i != 0) {
                    this.mTitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!m29173(this.mTitleTextView)) {
                m4681(this.mTitleTextView, true);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setTitleTextColor(@InterfaceC6391 ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public Toolbar(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList<>();
        this.mHiddenViews = new ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new C6154(new Runnable() { // from class: Yue.ۥۢۡۧۨ
            @Override // java.lang.Runnable
            public final void run() {
                this.f23616.invalidateMenu();
            }
        });
        this.mProvidedMenuItems = new ArrayList<>();
        this.mMenuViewItemClickListener = new C1624();
        this.mShowOverflowMenuRunnable = new RunnableC1625();
        C7837 c7837M24869 = C7837.m24869(getContext(), attributeSet, C6898.C6909.f19746, i, 0);
        C8273.m27437(this, context, C6898.C6909.f19746, attributeSet, c7837M24869.m24895(), i, 0);
        this.mTitleTextAppearance = c7837M24869.m24888(C6898.C6909.f19775, 0);
        this.mSubtitleTextAppearance = c7837M24869.m24888(C6898.C6909.f19766, 0);
        this.mGravity = c7837M24869.m24883(C6898.C6909.f19747, this.mGravity);
        this.mButtonGravity = c7837M24869.m24883(C6898.C6909.f19749, 48);
        int iM24873 = c7837M24869.m24873(C6898.C6909.f19769, 0);
        iM24873 = c7837M24869.m24896(C6898.C6909.f19774) ? c7837M24869.m24873(C6898.C6909.f19774, iM24873) : iM24873;
        this.mTitleMarginBottom = iM24873;
        this.mTitleMarginTop = iM24873;
        this.mTitleMarginEnd = iM24873;
        this.mTitleMarginStart = iM24873;
        int iM248732 = c7837M24869.m24873(C6898.C6909.f19772, -1);
        if (iM248732 >= 0) {
            this.mTitleMarginStart = iM248732;
        }
        int iM248733 = c7837M24869.m24873(C6898.C6909.f19771, -1);
        if (iM248733 >= 0) {
            this.mTitleMarginEnd = iM248733;
        }
        int iM248734 = c7837M24869.m24873(C6898.C6909.f19773, -1);
        if (iM248734 >= 0) {
            this.mTitleMarginTop = iM248734;
        }
        int iM248735 = c7837M24869.m24873(C6898.C6909.f19770, -1);
        if (iM248735 >= 0) {
            this.mTitleMarginBottom = iM248735;
        }
        this.mMaxButtonHeight = c7837M24869.m24874(C6898.C6909.f19760, -1);
        int iM248736 = c7837M24869.m24873(C6898.C6909.f19756, Integer.MIN_VALUE);
        int iM248737 = c7837M24869.m24873(C6898.C6909.f19752, Integer.MIN_VALUE);
        int iM24874 = c7837M24869.m24874(C6898.C6909.f19754, 0);
        int iM248742 = c7837M24869.m24874(C6898.C6909.f19755, 0);
        m29162();
        this.mContentInsets.m22518(iM24874, iM248742);
        if (iM248736 != Integer.MIN_VALUE || iM248737 != Integer.MIN_VALUE) {
            this.mContentInsets.m22520(iM248736, iM248737);
        }
        this.mContentInsetStartWithNavigation = c7837M24869.m24873(C6898.C6909.f19757, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = c7837M24869.m24873(C6898.C6909.f19753, Integer.MIN_VALUE);
        this.mCollapseIcon = c7837M24869.m24875(C6898.C6909.f19751);
        this.mCollapseDescription = c7837M24869.m24891(C6898.C6909.f19750);
        CharSequence charSequenceM24891 = c7837M24869.m24891(C6898.C6909.f19768);
        if (!TextUtils.isEmpty(charSequenceM24891)) {
            setTitle(charSequenceM24891);
        }
        CharSequence charSequenceM248912 = c7837M24869.m24891(C6898.C6909.f19765);
        if (!TextUtils.isEmpty(charSequenceM248912)) {
            setSubtitle(charSequenceM248912);
        }
        this.mPopupContext = getContext();
        setPopupTheme(c7837M24869.m24888(C6898.C6909.f19764, 0));
        Drawable drawableM24875 = c7837M24869.m24875(C6898.C6909.f19763);
        if (drawableM24875 != null) {
            setNavigationIcon(drawableM24875);
        }
        CharSequence charSequenceM248913 = c7837M24869.m24891(C6898.C6909.f19762);
        if (!TextUtils.isEmpty(charSequenceM248913)) {
            setNavigationContentDescription(charSequenceM248913);
        }
        Drawable drawableM248752 = c7837M24869.m24875(C6898.C6909.f19758);
        if (drawableM248752 != null) {
            setLogo(drawableM248752);
        }
        CharSequence charSequenceM248914 = c7837M24869.m24891(C6898.C6909.f19759);
        if (!TextUtils.isEmpty(charSequenceM248914)) {
            setLogoDescription(charSequenceM248914);
        }
        if (c7837M24869.m24896(C6898.C6909.f19776)) {
            setTitleTextColor(c7837M24869.m24871(C6898.C6909.f19776));
        }
        if (c7837M24869.m24896(C6898.C6909.f19767)) {
            setSubtitleTextColor(c7837M24869.m24871(C6898.C6909.f19767));
        }
        if (c7837M24869.m24896(C6898.C6909.f19761)) {
            inflateMenu(c7837M24869.m24888(C6898.C6909.f19761, 0));
        }
        c7837M24869.m24899();
    }

    @Override // Yue.InterfaceC6151
    @InterfaceC5922
    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@InterfaceC6391 InterfaceC6165 interfaceC6165, @InterfaceC6391 LifecycleOwner lifecycleOwner, @InterfaceC6391 Lifecycle.State state) {
        this.mMenuHostHelper.m18959(interfaceC6165, lifecycleOwner, state);
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    public C8734 generateLayoutParams(AttributeSet attributeSet) {
        return new C8734(getContext(), attributeSet);
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    public C8734 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C8734) {
            return new C8734((C8734) layoutParams);
        }
        if (layoutParams instanceof AbstractC1583.C8639) {
            return new C8734((AbstractC1583.C8639) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C8734((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C8734(layoutParams);
    }
}
