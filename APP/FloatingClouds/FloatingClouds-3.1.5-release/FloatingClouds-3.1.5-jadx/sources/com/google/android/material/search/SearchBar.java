package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0998f;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C1247R;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;
import p000a.AbstractC0792r;
import p000a.C0181Jg;
import p000a.C0726n9;
import p000a.C0866ug;
import p000a.C0884vf;

/* JADX INFO: loaded from: classes.dex */
public final class SearchBar extends Toolbar {

    /* JADX INFO: renamed from: U */
    public Drawable f5817U;

    /* JADX INFO: renamed from: V */
    public int f5818V;

    /* JADX INFO: renamed from: W */
    public boolean f5819W;

    /* JADX INFO: renamed from: com.google.android.material.search.SearchBar$a */
    public static class C1300a extends AbstractC0792r {
        public static final Parcelable.Creator<C1300a> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        public String f5821c;

        /* JADX INFO: renamed from: com.google.android.material.search.SearchBar$a$a */
        public class a implements Parcelable.ClassLoaderCreator<C1300a> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C1300a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1300a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C1300a[i];
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C1300a(parcel, null);
            }
        }

        public C1300a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5821c = parcel.readString();
        }

        @Override // p000a.AbstractC0792r, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f5821c);
        }
    }

    private void setNavigationIconDecorative(boolean z) {
        ImageButton imageButtonM2107a = C0884vf.m2107a(this);
        if (imageButtonM2107a == null) {
            return;
        }
        boolean z2 = !z;
        imageButtonM2107a.setClickable(z2);
        imageButtonM2107a.setFocusable(z2);
        Drawable background = imageButtonM2107a.getBackground();
        if (background != null) {
            this.f5817U = background;
        }
        imageButtonM2107a.setBackgroundDrawable(z ? null : this.f5817U);
        m3248w();
    }

    public View getCenterView() {
        return null;
    }

    public float getCompatElevation() {
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        return C0866ug.d.m2017i(this);
    }

    public float getCornerSize() {
        throw null;
    }

    public int getDefaultMarginVerticalResource() {
        return C1247R.dimen.m3_searchbar_margin_vertical;
    }

    public int getDefaultNavigationIconResource() {
        return C1247R.drawable.ic_search_black_24;
    }

    public CharSequence getHint() {
        throw null;
    }

    public int getMenuResId() {
        return this.f5818V;
    }

    public int getStrokeColor() {
        throw null;
    }

    public float getStrokeWidth() {
        throw null;
    }

    public CharSequence getText() {
        throw null;
    }

    public TextView getTextView() {
        return null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* JADX INFO: renamed from: m */
    public final void mo2382m(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof C0998f;
        if (z) {
            ((C0998f) menu).m2338w();
        }
        super.mo2382m(i);
        this.f5818V = i;
        if (z) {
            ((C0998f) menu).m2337v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0726n9.m1659A(this, null);
        throw null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        accessibilityNodeInfo.setHintText(getHint());
        accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m3248w();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1300a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1300a c1300a = (C1300a) parcelable;
        super.onRestoreInstanceState(c1300a.f3119a);
        setText(c1300a.f5821c);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1300a c1300a = new C1300a(super.onSaveInstanceState());
        CharSequence text = getText();
        c1300a.f5821c = text == null ? null : text.toString();
        return c1300a;
    }

    public void setCenterView(View view) {
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
        this.f5819W = z;
        if (getLayoutParams() instanceof AppBarLayout.C1251c) {
            AppBarLayout.C1251c c1251c = (AppBarLayout.C1251c) getLayoutParams();
            if (this.f5819W) {
                if (c1251c.f5369a == 0) {
                    c1251c.f5369a = 53;
                }
            } else if (c1251c.f5369a == 53) {
                c1251c.f5369a = 0;
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHint(CharSequence charSequence) {
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
        throw null;
    }

    public void setStrokeColor(int i) {
        if (getStrokeColor() == i) {
            return;
        }
        ColorStateList.valueOf(i);
        throw null;
    }

    public void setStrokeWidth(float f) {
        if (getStrokeWidth() != f) {
            throw null;
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setText(CharSequence charSequence) {
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: w */
    public final void m3248w() {
        ActionMenuView actionMenuView;
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        int right = 0;
        boolean z = getLayoutDirection() == 1;
        ImageButton imageButtonM2107a = C0884vf.m2107a(this);
        int width = (imageButtonM2107a == null || !imageButtonM2107a.isClickable()) ? 0 : z ? getWidth() - imageButtonM2107a.getLeft() : imageButtonM2107a.getRight();
        int i = 0;
        while (true) {
            if (i >= getChildCount()) {
                actionMenuView = null;
                break;
            }
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                actionMenuView = (ActionMenuView) childAt;
                break;
            }
            i++;
        }
        if (actionMenuView != null) {
            right = z ? actionMenuView.getRight() : getWidth() - actionMenuView.getLeft();
        }
        float f = -(z ? right : width);
        if (!z) {
            width = right;
        }
        setHandwritingBoundsOffsets(f, 0.0f, -width, 0.0f);
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* JADX INFO: renamed from: g */
        public boolean f5820g;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ScrollingViewBehavior() {
            this.f5820g = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
        /* JADX INFO: renamed from: d */
        public final boolean mo2457d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            super.mo2457d(coordinatorLayout, view, view2);
            if (!this.f5820g && (view2 instanceof AppBarLayout)) {
                this.f5820g = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(0.0f);
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5820g = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setHint(int i) {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setText(int i) {
        throw null;
    }
}
