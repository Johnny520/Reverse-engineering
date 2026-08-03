package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C1247R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000a.AbstractC0792r;
import p000a.C0283Pa;
import p000a.C0354Ta;
import p000a.C0726n9;

/* JADX INFO: loaded from: classes.dex */
public final class SearchView extends FrameLayout implements CoordinatorLayout.InterfaceC1058b {

    /* JADX INFO: renamed from: a */
    public SearchBar f5822a;

    /* JADX INFO: renamed from: b */
    public int f5823b;

    /* JADX INFO: renamed from: c */
    public EnumC1303c f5824c;

    public static class Behavior extends CoordinatorLayout.AbstractC1059c<SearchView> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
        /* JADX INFO: renamed from: d */
        public final boolean mo2457d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            SearchView searchView = (SearchView) view;
            if (searchView.f5822a != null || !(view2 instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view2);
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.search.SearchView$a */
    public static class C1301a extends AbstractC0792r {
        public static final Parcelable.Creator<C1301a> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        public final String f5825c;

        /* JADX INFO: renamed from: d */
        public final int f5826d;

        /* JADX INFO: renamed from: com.google.android.material.search.SearchView$a$a */
        public class a implements Parcelable.ClassLoaderCreator<C1301a> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C1301a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1301a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C1301a[i];
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C1301a(parcel, null);
            }
        }

        public C1301a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5825c = parcel.readString();
            this.f5826d = parcel.readInt();
        }

        @Override // p000a.AbstractC0792r, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f5825c);
            parcel.writeInt(this.f5826d);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.search.SearchView$b */
    public interface InterfaceC1302b {
        /* JADX INFO: renamed from: a */
        void m3249a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.google.android.material.search.SearchView$c */
    public static final class EnumC1303c {

        /* JADX INFO: renamed from: a */
        public static final EnumC1303c f5827a;

        /* JADX INFO: renamed from: b */
        public static final EnumC1303c f5828b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumC1303c[] f5829c;

        /* JADX INFO: Fake field, exist only in values array */
        EnumC1303c EF0;

        static {
            EnumC1303c enumC1303c = new EnumC1303c("HIDING", 0);
            EnumC1303c enumC1303c2 = new EnumC1303c("HIDDEN", 1);
            f5827a = enumC1303c2;
            EnumC1303c enumC1303c3 = new EnumC1303c("SHOWING", 2);
            EnumC1303c enumC1303c4 = new EnumC1303c("SHOWN", 3);
            f5828b = enumC1303c4;
            f5829c = new EnumC1303c[]{enumC1303c, enumC1303c2, enumC1303c3, enumC1303c4};
        }

        public EnumC1303c() {
            throw null;
        }

        public static EnumC1303c valueOf(String str) {
            return (EnumC1303c) Enum.valueOf(EnumC1303c.class, str);
        }

        public static EnumC1303c[] values() {
            return (EnumC1303c[]) f5829c.clone();
        }
    }

    private Window getActivityWindow() {
        Activity activity;
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            }
            if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f5822a;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(C1247R.dimen.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z) {
        throw null;
    }

    private void setUpBackgroundViewElevationOverlay(float f) {
    }

    private void setUpHeaderLayout(int i) {
        if (i == -1) {
            return;
        }
        LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null, false);
        throw null;
    }

    private void setUpStatusBarSpacer(int i) {
        throw null;
    }

    public C0283Pa getBackHelper() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC1058b
    public CoordinatorLayout.AbstractC1059c<SearchView> getBehavior() {
        return new Behavior();
    }

    public EnumC1303c getCurrentTransitionState() {
        return this.f5824c;
    }

    public int getDefaultNavigationIconResource() {
        return C1247R.drawable.ic_arrow_back_black_24;
    }

    public EditText getEditText() {
        return null;
    }

    public CharSequence getHint() {
        throw null;
    }

    public TextView getSearchPrefix() {
        return null;
    }

    public CharSequence getSearchPrefixText() {
        throw null;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f5823b;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        throw null;
    }

    public Toolbar getToolbar() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0354Ta) {
            C0726n9.m1659A(this, (C0354Ta) background);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f5823b = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1301a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1301a c1301a = (C1301a) parcelable;
        super.onRestoreInstanceState(c1301a.f3119a);
        setText(c1301a.f5825c);
        setVisible(c1301a.f5826d == 0);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        Editable text = getText();
        if (text != null) {
            text.toString();
        }
        throw null;
    }

    public void setAnimatedNavigationIcon(boolean z) {
    }

    public void setAutoShowKeyboard(boolean z) {
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        setUpBackgroundViewElevationOverlay(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHint(CharSequence charSequence) {
        throw null;
    }

    public void setMenuItemsAnimated(boolean z) {
    }

    public void setModalForAccessibility(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            new HashMap(viewGroup.getChildCount());
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) != this) {
                throw null;
            }
        }
    }

    public void setOnMenuItemClickListener(Toolbar.InterfaceC1035h interfaceC1035h) {
        throw null;
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        throw null;
    }

    public void setStatusBarSpacerEnabled(boolean z) {
        setStatusBarSpacerEnabledInternal(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        throw null;
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z) {
        throw null;
    }

    public void setTransitionState(EnumC1303c enumC1303c) {
        if (this.f5824c.equals(enumC1303c)) {
            return;
        }
        if (enumC1303c == EnumC1303c.f5828b) {
            setModalForAccessibility(true);
        } else if (enumC1303c == EnumC1303c.f5827a) {
            setModalForAccessibility(false);
        }
        this.f5824c = enumC1303c;
        Iterator it = new LinkedHashSet((Collection) null).iterator();
        while (it.hasNext()) {
            ((InterfaceC1302b) it.next()).m3249a();
        }
    }

    public void setUseWindowInsetsController(boolean z) {
    }

    public void setVisible(boolean z) {
        throw null;
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f5822a = searchBar;
        throw null;
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
