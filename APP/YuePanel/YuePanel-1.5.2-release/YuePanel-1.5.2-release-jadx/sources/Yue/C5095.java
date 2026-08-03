package Yue;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.fragment.app.AbstractC8885;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C5095 extends TabHost implements TabHost.OnTabChangeListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final ArrayList<C5097> f12068;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public FrameLayout f12069;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Context f12070;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public FragmentManager f12071;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f12072;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public TabHost.OnTabChangeListener f12073;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public C5097 f12074;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f12075;

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۢ$ۥ */
    public static class C0639 implements TabHost.TabContentFactory {

        /* JADX INFO: renamed from: ۥ */
        public final Context f1268;

        public C0639(Context context) {
            this.f1268 = context;
        }

        @Override // android.widget.TabHost.TabContentFactory
        public View createTabContent(String str) {
            View view = new View(this.f1268);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۢ$ۥ۟ */
    public static class C0640 extends View.BaseSavedState {
        public static final Parcelable.Creator<C0640> CREATOR = new C5096();

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public String f12076;

        /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۢ$ۥ۟$ۥ, reason: contains not printable characters */
        public class C5096 implements Parcelable.Creator<C0640> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
            public C0640 createFromParcel(Parcel parcel) {
                return new C0640(parcel);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
            public C0640[] newArray(int i) {
                return new C0640[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0640(Parcelable parcelable) {
            super(parcelable);
        }

        @InterfaceC6391
        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f12076 + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f12076);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0640(Parcel parcel) {
            super(parcel);
            this.f12076 = parcel.readString();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۢ$ۥ۟۟, reason: contains not printable characters */
    public static final class C5097 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6391
        public final String f1269;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6391
        public final Class<?> f1270;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6490
        public final Bundle f12077;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Fragment f12078;

        public C5097(@InterfaceC6391 String str, @InterfaceC6391 Class<?> cls, @InterfaceC6490 Bundle bundle) {
            this.f1269 = str;
            this.f1270 = cls;
            this.f12077 = bundle;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public C5095(@InterfaceC6391 Context context) {
        super(context, null);
        this.f12068 = new ArrayList<>();
        m15733(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f12068.size();
        AbstractC8885 abstractC8885M29749 = null;
        for (int i = 0; i < size; i++) {
            C5097 c5097 = this.f12068.get(i);
            Fragment fragmentM29796 = this.f12071.m29796(c5097.f1269);
            c5097.f12078 = fragmentM29796;
            if (fragmentM29796 != null && !fragmentM29796.isDetached()) {
                if (c5097.f1269.equals(currentTabTag)) {
                    this.f12074 = c5097;
                } else {
                    if (abstractC8885M29749 == null) {
                        abstractC8885M29749 = this.f12071.m29749();
                    }
                    abstractC8885M29749.mo29908(c5097.f12078);
                }
            }
        }
        this.f12075 = true;
        AbstractC8885 abstractC8885M1914 = m1914(currentTabTag, abstractC8885M29749);
        if (abstractC8885M1914 != null) {
            abstractC8885M1914.mo29904();
            this.f12071.m29792();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12075 = false;
    }

    @Override // android.view.View
    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof C0640)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0640 c0640 = (C0640) parcelable;
        super.onRestoreInstanceState(c0640.getSuperState());
        setCurrentTabByTag(c0640.f12076);
    }

    @Override // android.view.View
    @InterfaceC6391
    @Deprecated
    public Parcelable onSaveInstanceState() {
        C0640 c0640 = new C0640(super.onSaveInstanceState());
        c0640.f12076 = getCurrentTabTag();
        return c0640;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(@InterfaceC6490 String str) {
        AbstractC8885 abstractC8885M1914;
        if (this.f12075 && (abstractC8885M1914 = m1914(str, null)) != null) {
            abstractC8885M1914.mo29904();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f12073;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(@InterfaceC6490 TabHost.OnTabChangeListener onTabChangeListener) {
        this.f12073 = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ */
    public void m1913(@InterfaceC6391 TabHost.TabSpec tabSpec, @InterfaceC6391 Class<?> cls, @InterfaceC6490 Bundle bundle) {
        tabSpec.setContent(new C0639(this.f12070));
        String tag = tabSpec.getTag();
        C5097 c5097 = new C5097(tag, cls, bundle);
        if (this.f12075) {
            Fragment fragmentM29796 = this.f12071.m29796(tag);
            c5097.f12078 = fragmentM29796;
            if (fragmentM29796 != null && !fragmentM29796.isDetached()) {
                AbstractC8885 abstractC8885M29749 = this.f12071.m29749();
                abstractC8885M29749.mo29908(c5097.f12078);
                abstractC8885M29749.mo29904();
            }
        }
        this.f12068.add(c5097);
        addTab(tabSpec);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public final AbstractC8885 m1914(@InterfaceC6490 String str, @InterfaceC6490 AbstractC8885 abstractC8885) {
        Fragment fragment;
        C5097 c5097M15732 = m15732(str);
        if (this.f12074 != c5097M15732) {
            if (abstractC8885 == null) {
                abstractC8885 = this.f12071.m29749();
            }
            C5097 c5097 = this.f12074;
            if (c5097 != null && (fragment = c5097.f12078) != null) {
                abstractC8885.mo29908(fragment);
            }
            if (c5097M15732 != null) {
                Fragment fragment2 = c5097M15732.f12078;
                if (fragment2 == null) {
                    Fragment fragmentMo4815 = this.f12071.m29809().mo4815(this.f12070.getClassLoader(), c5097M15732.f1270.getName());
                    c5097M15732.f12078 = fragmentMo4815;
                    fragmentMo4815.setArguments(c5097M15732.f12077);
                    abstractC8885.m30041(this.f12072, c5097M15732.f12078, c5097M15732.f1269);
                } else {
                    abstractC8885.m30050(fragment2);
                }
            }
            this.f12074 = c5097M15732;
        }
        return abstractC8885;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m15730() {
        if (this.f12069 == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f12072);
            this.f12069 = frameLayout;
            if (frameLayout != null) {
                return;
            }
            throw new IllegalStateException("No tab content FrameLayout found for id " + this.f12072);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m15731(Context context) {
        if (findViewById(R.id.tabs) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(R.id.tabs);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.tabcontent);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f12069 = frameLayout2;
            frameLayout2.setId(this.f12072);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final C5097 m15732(String str) {
        int size = this.f12068.size();
        for (int i = 0; i < size; i++) {
            C5097 c5097 = this.f12068.get(i);
            if (c5097.f1269.equals(str)) {
                return c5097;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m15733(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.f12072 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m15734(@InterfaceC6391 Context context, @InterfaceC6391 FragmentManager fragmentManager) {
        m15731(context);
        super.setup();
        this.f12070 = context;
        this.f12071 = fragmentManager;
        m15730();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m15735(@InterfaceC6391 Context context, @InterfaceC6391 FragmentManager fragmentManager, int i) {
        m15731(context);
        super.setup();
        this.f12070 = context;
        this.f12071 = fragmentManager;
        this.f12072 = i;
        m15730();
        this.f12069.setId(i);
        if (getId() == -1) {
            setId(R.id.tabhost);
        }
    }

    @Deprecated
    public C5095(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12068 = new ArrayList<>();
        m15733(context, attributeSet);
    }
}
