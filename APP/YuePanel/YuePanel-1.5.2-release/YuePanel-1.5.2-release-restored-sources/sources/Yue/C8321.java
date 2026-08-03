package Yue;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۢۤۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8321 extends ViewGroup {

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static final String f24816 = "ViewPager";

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static final boolean f24817 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static final boolean f24818 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static final int f24819 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static final int f24820 = 600;

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static final int f24821 = 25;

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static final int f24822 = 16;

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static final int f24823 = 400;

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static final int f24827 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static final int f24828 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static final int f24829 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static final int f24830 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static final int f24831 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static final int f24833 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static final int f24834 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static final int f24835 = 2;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f24836;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final ArrayList<C8325> f24837;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final C8325 f24838;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final Rect f24839;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public AbstractC6594 f24840;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f24841;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f24842;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public Parcelable f24843;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public ClassLoader f24844;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public Scroller f24845;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean f24846;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public C8331 f24847;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public int f24848;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public Drawable f24849;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public int f24850;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public int f24851;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public float f24852;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public float f24853;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public int f24854;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public int f24855;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public boolean f24856;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public boolean f24857;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public boolean f24858;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public int f24859;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public boolean f24860;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public boolean f24861;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public int f24862;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public int f24863;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public int f24864;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public float f24865;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public float f24866;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public float f24867;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public float f24868;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public int f24869;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public VelocityTracker f24870;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public int f24871;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public int f24872;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public int f24873;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public int f24874;

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public boolean f24875;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public long f24876;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public EdgeEffect f24877;

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public EdgeEffect f24878;

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public boolean f24879;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public boolean f24880;

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public boolean f24881;

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public int f24882;

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public List<InterfaceC8329> f24883;

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public InterfaceC8329 f24884;

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public InterfaceC8329 f24885;

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public List<InterfaceC8328> f24886;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public InterfaceC8330 f24887;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public int f24888;

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public int f24889;

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public ArrayList<View> f24890;

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public final Runnable f24891;

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public int f24892;

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static final int[] f24824 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static final Comparator<C8325> f24825 = new C1485();

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static final Interpolator f24826 = new InterpolatorC1486();

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static final C8334 f24832 = new C8334();

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۠$ۥ */
    public static class C1485 implements Comparator<C8325> {
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public int compare(C8325 c8325, C8325 c83252) {
            return c8325.f3409 - c83252.f3409;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۠$ۥ۟ */
    public static class InterpolatorC1486 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۠$ۥ۟۟, reason: contains not printable characters */
    public class RunnableC8322 implements Runnable {
        public RunnableC8322() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8321.this.setScrollState(0);
            C8321.this.m27767();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۠$ۥ۟۟۟, reason: contains not printable characters */
    public class C8323 implements InterfaceC6545 {

        /* JADX INFO: renamed from: ۥ */
        public final Rect f3406 = new Rect();

        public C8323() {
        }

        @Override // Yue.InterfaceC6545
        public C8472 onApplyWindowInsets(View view, C8472 c8472) {
            C8472 c8472M27416 = C8273.m27416(view, c8472);
            if (c8472M27416.m28301()) {
                return c8472M27416;
            }
            Rect rect = this.f3406;
            rect.left = c8472M27416.m28291();
            rect.top = c8472M27416.m28293();
            rect.right = c8472M27416.m28292();
            rect.bottom = c8472M27416.m28290();
            int childCount = C8321.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C8472 c8472M27317 = C8273.m27317(C8321.this.getChildAt(i), c8472M27416);
                rect.left = Math.min(c8472M27317.m28291(), rect.left);
                rect.top = Math.min(c8472M27317.m28293(), rect.top);
                rect.right = Math.min(c8472M27317.m28292(), rect.right);
                rect.bottom = Math.min(c8472M27317.m28290(), rect.bottom);
            }
            return c8472M27416.m28304(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۠$ۥ۟۟۟۟, reason: contains not printable characters */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC8324 {
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۠$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class C8325 {

        /* JADX INFO: renamed from: ۥ */
        public Object f3408;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3409;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f24894;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public float f24895;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public float f24896;
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۠$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public class C8327 extends C3024 {
        public C8327() {
        }

        @Override // Yue.C3024
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            AbstractC6594 abstractC6594;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(C8321.class.getName());
            accessibilityEvent.setScrollable(m27785());
            if (accessibilityEvent.getEventType() != 4096 || (abstractC6594 = C8321.this.f24840) == null) {
                return;
            }
            accessibilityEvent.setItemCount(abstractC6594.m20922());
            accessibilityEvent.setFromIndex(C8321.this.f24841);
            accessibilityEvent.setToIndex(C8321.this.f24841);
        }

        @Override // Yue.C3024
        public void onInitializeAccessibilityNodeInfo(View view, C3055 c3055) {
            super.onInitializeAccessibilityNodeInfo(view, c3055);
            c3055.m6057(C8321.class.getName());
            c3055.m6097(m27785());
            if (C8321.this.canScrollHorizontally(1)) {
                c3055.m118(4096);
            }
            if (C8321.this.canScrollHorizontally(-1)) {
                c3055.m118(8192);
            }
        }

        @Override // Yue.C3024
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (i == 4096) {
                if (!C8321.this.canScrollHorizontally(1)) {
                    return false;
                }
                C8321 c8321 = C8321.this;
                c8321.setCurrentItem(c8321.f24841 + 1);
                return true;
            }
            if (i != 8192 || !C8321.this.canScrollHorizontally(-1)) {
                return false;
            }
            C8321 c83212 = C8321.this;
            c83212.setCurrentItem(c83212.f24841 - 1);
            return true;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final boolean m27785() {
            AbstractC6594 abstractC6594 = C8321.this.f24840;
            return abstractC6594 != null && abstractC6594.m20922() > 1;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۠$ۥۣ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC8328 {
        void onAdapterChanged(@InterfaceC6391 C8321 c8321, @InterfaceC6490 AbstractC6594 abstractC6594, @InterfaceC6490 AbstractC6594 abstractC65942);
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۠$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public interface InterfaceC8329 {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, @InterfaceC6844 int i2);

        void onPageSelected(int i);
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۠$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public interface InterfaceC8330 {
        /* JADX INFO: renamed from: ۥ */
        void m4304(@InterfaceC6391 View view, float f);
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۠$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public class C8331 extends DataSetObserver {
        public C8331() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            C8321.this.m27742();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C8321.this.m27742();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۠$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static class C8332 extends AbstractC2967 {
        public static final Parcelable.Creator<C8332> CREATOR = new C1487();

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f24901;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Parcelable f24902;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public ClassLoader f24903;

        /* JADX INFO: renamed from: Yue.ۥۢۤۦ۠$ۥ۟۟۟ۧ$ۥ */
        public static class C1487 implements Parcelable.ClassLoaderCreator<C8332> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
            public C8332 createFromParcel(Parcel parcel) {
                return new C8332(parcel, null);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
            public C8332 createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C8332(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public C8332[] newArray(int i) {
                return new C8332[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8332(@InterfaceC6391 Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f24901 + "}";
        }

        @Override // Yue.AbstractC2967, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f24901);
            parcel.writeParcelable(this.f24902, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C8332(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f24901 = parcel.readInt();
            this.f24902 = parcel.readParcelable(classLoader);
            this.f24903 = classLoader;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۠$ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static class C8333 implements InterfaceC8329 {
        @Override // Yue.C8321.InterfaceC8329
        public void onPageScrollStateChanged(int i) {
        }

        @Override // Yue.C8321.InterfaceC8329
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // Yue.C8321.InterfaceC8329
        public void onPageSelected(int i) {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۠$ۥ۟۟۠, reason: contains not printable characters */
    public static class C8334 implements Comparator<View> {
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C8326 c8326 = (C8326) view.getLayoutParams();
            C8326 c83262 = (C8326) view2.getLayoutParams();
            boolean z = c8326.f3410;
            return z != c83262.f3410 ? z ? 1 : -1 : c8326.f24899 - c83262.f24899;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8321(@InterfaceC6391 Context context) {
        super(context);
        this.f24837 = new ArrayList<>();
        this.f24838 = new C8325();
        this.f24839 = new Rect();
        this.f24842 = -1;
        this.f24843 = null;
        this.f24844 = null;
        this.f24852 = -3.4028235E38f;
        this.f24853 = Float.MAX_VALUE;
        this.f24859 = 1;
        this.f24869 = -1;
        this.f24879 = true;
        this.f24880 = false;
        this.f24891 = new RunnableC8322();
        this.f24892 = 0;
        m27758();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f24857 != z) {
            this.f24857 = z;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static boolean m27734(@InterfaceC6391 View view) {
        return view.getClass().getAnnotation(InterfaceC8324.class) != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C8325 c8325M27755;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (c8325M27755 = m27755(childAt)) != null && c8325M27755.f3409 == this.f24841) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C8325 c8325M27755;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c8325M27755 = m27755(childAt)) != null && c8325M27755.f3409 == this.f24841) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C8326 c8326 = (C8326) layoutParams;
        boolean zM27734 = c8326.f3410 | m27734(view);
        c8326.f3410 = zM27734;
        if (!this.f24856) {
            super.addView(view, i, layoutParams);
        } else {
            if (zM27734) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c8326.f24898 = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.f24840 == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f24852)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.f24853));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C8326) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f24846 = true;
        if (this.f24845.isFinished() || !this.f24845.computeScrollOffset()) {
            m27741(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f24845.getCurrX();
        int currY = this.f24845.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m27765(currX)) {
                this.f24845.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C8273.m27425(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m27751(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C8325 c8325M27755;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c8325M27755 = m27755(childAt)) != null && c8325M27755.f3409 == this.f24841 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC6594 abstractC6594;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC6594 = this.f24840) != null && abstractC6594.m20922() > 1)) {
            if (!this.f24877.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f24852 * width);
                this.f24877.setSize(height, width);
                zDraw = this.f24877.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f24878.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f24853 + 1.0f)) * width2);
                this.f24878.setSize(height2, width2);
                zDraw |= this.f24878.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f24877.finish();
            this.f24878.finish();
        }
        if (zDraw) {
            C8273.m27425(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f24849;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C8326();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @InterfaceC6490
    public AbstractC6594 getAdapter() {
        return this.f24840;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f24889 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C8326) this.f24890.get(i2).getLayoutParams()).f24900;
    }

    public int getCurrentItem() {
        return this.f24841;
    }

    public int getOffscreenPageLimit() {
        return this.f24859;
    }

    public int getPageMargin() {
        return this.f24848;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24879 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f24891);
        Scroller scroller = this.f24845;
        if (scroller != null && !scroller.isFinished()) {
            this.f24845.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.f24848 <= 0 || this.f24849 == null || this.f24837.size() <= 0 || this.f24840 == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f3 = this.f24848 / width;
        int i2 = 0;
        C8325 c8325 = this.f24837.get(0);
        float f4 = c8325.f24896;
        int size = this.f24837.size();
        int i3 = c8325.f3409;
        int i4 = this.f24837.get(size - 1).f3409;
        while (i3 < i4) {
            while (true) {
                i = c8325.f3409;
                if (i3 <= i || i2 >= size) {
                    break;
                }
                i2++;
                c8325 = this.f24837.get(i2);
            }
            if (i3 == i) {
                float f5 = c8325.f24896;
                float f6 = c8325.f24895;
                f = (f5 + f6) * width;
                f4 = f5 + f6 + f3;
            } else {
                float fM20925 = this.f24840.m20925(i3);
                f = (f4 + fM20925) * width;
                f4 += fM20925 + f3;
            }
            if (this.f24848 + f > scrollX) {
                f2 = f3;
                this.f24849.setBounds(Math.round(f), this.f24850, Math.round(this.f24848 + f), this.f24851);
                this.f24849.draw(canvas);
            } else {
                f2 = f3;
            }
            if (f > scrollX + r2) {
                return;
            }
            i3++;
            f3 = f2;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m27774();
            return false;
        }
        if (action != 0) {
            if (this.f24860) {
                return true;
            }
            if (this.f24861) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f24867 = x;
            this.f24865 = x;
            float y = motionEvent.getY();
            this.f24868 = y;
            this.f24866 = y;
            this.f24869 = motionEvent.getPointerId(0);
            this.f24861 = false;
            this.f24846 = true;
            this.f24845.computeScrollOffset();
            if (this.f24892 != 2 || Math.abs(this.f24845.getFinalX() - this.f24845.getCurrX()) <= this.f24874) {
                m27741(false);
                this.f24860 = false;
            } else {
                this.f24845.abortAnimation();
                this.f24858 = false;
                m27767();
                this.f24860 = true;
                m27773(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f24869;
            if (i != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.f24865;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.f24868);
                if (f != 0.0f && !m27760(this.f24865, f) && m27739(this, false, (int) f, (int) x2, (int) y2)) {
                    this.f24865 = x2;
                    this.f24866 = y2;
                    this.f24861 = true;
                    return false;
                }
                int i2 = this.f24864;
                if (fAbs > i2 && fAbs * 0.5f > fAbs2) {
                    this.f24860 = true;
                    m27773(true);
                    setScrollState(1);
                    float f2 = this.f24867;
                    float f3 = this.f24864;
                    this.f24865 = f > 0.0f ? f2 + f3 : f2 - f3;
                    this.f24866 = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i2) {
                    this.f24861 = true;
                }
                if (this.f24860 && m27766(x2)) {
                    C8273.m27425(this);
                }
            }
        } else if (action == 6) {
            m27762(motionEvent);
        }
        if (this.f24870 == null) {
            this.f24870 = VelocityTracker.obtain();
        }
        this.f24870.addMovement(motionEvent);
        return this.f24860;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        C8325 c8325M27755;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C8326 c8326 = (C8326) childAt.getLayoutParams();
                if (c8326.f3410) {
                    int i9 = c8326.f3411;
                    int i10 = i9 & 7;
                    int i11 = i9 & 112;
                    if (i10 != 1) {
                        if (i10 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i10 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i11 == 16) {
                            if (i11 == 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i11 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i12 = paddingLeft + scrollX;
                            childAt.layout(i12, paddingTop, childAt.getMeasuredWidth() + i12, paddingTop + childAt.getMeasuredHeight());
                            i7++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i13 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i13;
                        int i122 = paddingLeft + scrollX;
                        childAt.layout(i122, paddingTop, childAt.getMeasuredWidth() + i122, paddingTop + childAt.getMeasuredHeight());
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i14 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i14;
                    if (i11 == 16) {
                    }
                    int i132 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i132;
                    int i1222 = paddingLeft + scrollX;
                    childAt.layout(i1222, paddingTop, childAt.getMeasuredWidth() + i1222, paddingTop + childAt.getMeasuredHeight());
                    i7++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i15 = (i5 - paddingLeft) - paddingRight;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                C8326 c83262 = (C8326) childAt2.getLayoutParams();
                if (!c83262.f3410 && (c8325M27755 = m27755(childAt2)) != null) {
                    float f = i15;
                    int i17 = ((int) (c8325M27755.f24896 * f)) + paddingLeft;
                    if (c83262.f24898) {
                        c83262.f24898 = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c83262.f24897), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i17, paddingTop, childAt2.getMeasuredWidth() + i17, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f24850 = paddingTop;
        this.f24851 = i6 - paddingBottom;
        this.f24882 = i7;
        if (this.f24879) {
            z2 = false;
            m27775(this.f24841, false, 0, false);
        } else {
            z2 = false;
        }
        this.f24879 = z2;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C8326 c8326;
        C8326 c83262;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f24863 = Math.min(measuredWidth / 10, this.f24862);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (c83262 = (C8326) childAt.getLayoutParams()) != null && c83262.f3410) {
                int i6 = c83262.f3411;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) c83262).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) c83262).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        this.f24854 = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f24855 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f24856 = true;
        m27767();
        this.f24856 = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c8326 = (C8326) childAt2.getLayoutParams()) == null || !c8326.f3410)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c8326.f24897), 1073741824), this.f24855);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        C8325 c8325M27755;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c8325M27755 = m27755(childAt)) != null && c8325M27755.f3409 == this.f24841 && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C8332)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C8332 c8332 = (C8332) parcelable;
        super.onRestoreInstanceState(c8332.getSuperState());
        AbstractC6594 abstractC6594 = this.f24840;
        if (abstractC6594 != null) {
            abstractC6594.mo15690(c8332.f24902, c8332.f24903);
            m27777(c8332.f24901, false, true);
        } else {
            this.f24842 = c8332.f24901;
            this.f24843 = c8332.f24902;
            this.f24844 = c8332.f24903;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C8332 c8332 = new C8332(super.onSaveInstanceState());
        c8332.f24901 = this.f24841;
        AbstractC6594 abstractC6594 = this.f24840;
        if (abstractC6594 != null) {
            c8332.f24902 = abstractC6594.mo15691();
        }
        return c8332;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f24848;
            m27769(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC6594 abstractC6594;
        if (this.f24875) {
            return true;
        }
        boolean zM27774 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC6594 = this.f24840) == null || abstractC6594.m20922() == 0) {
            return false;
        }
        if (this.f24870 == null) {
            this.f24870 = VelocityTracker.obtain();
        }
        this.f24870.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f24845.abortAnimation();
            this.f24858 = false;
            m27767();
            float x = motionEvent.getX();
            this.f24867 = x;
            this.f24865 = x;
            float y = motionEvent.getY();
            this.f24868 = y;
            this.f24866 = y;
            this.f24869 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f24865 = motionEvent.getX(actionIndex);
                        this.f24869 = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        m27762(motionEvent);
                        this.f24865 = motionEvent.getX(motionEvent.findPointerIndex(this.f24869));
                    }
                } else if (this.f24860) {
                    m27775(this.f24841, true, 0, false);
                    zM27774 = m27774();
                }
            } else if (!this.f24860) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f24869);
                if (iFindPointerIndex == -1) {
                    zM27774 = m27774();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x2 - this.f24865);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.f24866);
                    if (fAbs > this.f24864 && fAbs > fAbs2) {
                        this.f24860 = true;
                        m27773(true);
                        float f = this.f24867;
                        this.f24865 = x2 - f > 0.0f ? f + this.f24864 : f - this.f24864;
                        this.f24866 = y2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f24860) {
                    }
                }
            } else if (this.f24860) {
                zM27774 = m27766(motionEvent.getX(motionEvent.findPointerIndex(this.f24869)));
            }
        } else if (this.f24860) {
            VelocityTracker velocityTracker = this.f24870;
            velocityTracker.computeCurrentVelocity(1000, this.f24872);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f24869);
            this.f24858 = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C8325 c8325M27756 = m27756();
            float f2 = clientWidth;
            m27778(m27743(c8325M27756.f3409, ((scrollX / f2) - c8325M27756.f24896) / (c8325M27756.f24895 + (this.f24848 / f2)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f24869)) - this.f24867)), true, true, xVelocity);
            zM27774 = m27774();
        }
        if (zM27774) {
            C8273.m27425(this);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f24856) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(@InterfaceC6490 AbstractC6594 abstractC6594) {
        AbstractC6594 abstractC65942 = this.f24840;
        if (abstractC65942 != null) {
            abstractC65942.m20930(null);
            this.f24840.mo15693(this);
            for (int i = 0; i < this.f24837.size(); i++) {
                C8325 c8325 = this.f24837.get(i);
                this.f24840.mo1900(this, c8325.f3409, c8325.f3408);
            }
            this.f24840.mo15687(this);
            this.f24837.clear();
            m27770();
            this.f24841 = 0;
            scrollTo(0, 0);
        }
        AbstractC6594 abstractC65943 = this.f24840;
        this.f24840 = abstractC6594;
        this.f24836 = 0;
        if (abstractC6594 != null) {
            if (this.f24847 == null) {
                this.f24847 = new C8331();
            }
            this.f24840.m20930(this.f24847);
            this.f24858 = false;
            boolean z = this.f24879;
            this.f24879 = true;
            this.f24836 = this.f24840.m20922();
            if (this.f24842 >= 0) {
                this.f24840.mo15690(this.f24843, this.f24844);
                m27777(this.f24842, false, true);
                this.f24842 = -1;
                this.f24843 = null;
                this.f24844 = null;
            } else if (z) {
                requestLayout();
            } else {
                m27767();
            }
        }
        List<InterfaceC8328> list = this.f24886;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f24886.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f24886.get(i2).onAdapterChanged(this, abstractC65943, abstractC6594);
        }
    }

    public void setCurrentItem(int i) {
        this.f24858 = false;
        m27777(i, !this.f24879, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w(f24816, "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f24859) {
            this.f24859 = i;
            m27767();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC8329 interfaceC8329) {
        this.f24884 = interfaceC8329;
    }

    public void setPageMargin(int i) {
        int i2 = this.f24848;
        this.f24848 = i;
        int width = getWidth();
        m27769(width, width, i, i2);
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPageMarginDrawable(@InterfaceC6490 Drawable drawable) {
        this.f24849 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.f24892 == i) {
            return;
        }
        this.f24892 = i;
        if (this.f24887 != null) {
            m27748(i != 0);
        }
        m27746(i);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f24849;
    }

    /* JADX INFO: renamed from: ۥ */
    public C8325 m4301(int i, int i2) {
        C8325 c8325 = new C8325();
        c8325.f3409 = i;
        c8325.f3408 = this.f24840.mo15688(this, i);
        c8325.f24895 = this.f24840.m20925(i);
        if (i2 < 0 || i2 >= this.f24837.size()) {
            this.f24837.add(c8325);
        } else {
            this.f24837.add(i2, c8325);
        }
        return c8325;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m4302(@InterfaceC6391 InterfaceC8328 interfaceC8328) {
        if (this.f24886 == null) {
            this.f24886 = new ArrayList();
        }
        this.f24886.add(interfaceC8328);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m27735(@InterfaceC6391 InterfaceC8329 interfaceC8329) {
        if (this.f24883 == null) {
            this.f24883 = new ArrayList();
        }
        this.f24883.add(interfaceC8329);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m27736(int i) {
        boolean zM27763;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            for (ViewParent parent = viewFindFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                if (parent == this) {
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(viewFindFocus.getClass().getSimpleName());
            for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                sb.append(" => ");
                sb.append(parent2.getClass().getSimpleName());
            }
            Log.e(f24816, "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            zM27763 = (i == 17 || i == 1) ? m27763() : (i == 66 || i == 2) ? m27764() : false;
        } else if (i == 17) {
            zM27763 = (viewFindFocus == null || m27753(this.f24839, viewFindNextFocus).left < m27753(this.f24839, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : m27763();
        } else if (i == 66) {
            zM27763 = (viewFindFocus == null || m27753(this.f24839, viewFindNextFocus).left > m27753(this.f24839, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : m27764();
        }
        if (zM27763) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zM27763;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m27737() {
        if (this.f24860) {
            return false;
        }
        this.f24875 = true;
        setScrollState(1);
        this.f24865 = 0.0f;
        this.f24867 = 0.0f;
        VelocityTracker velocityTracker = this.f24870;
        if (velocityTracker == null) {
            this.f24870 = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f24870.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.f24876 = jUptimeMillis;
        return true;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:16:0x0039 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:27:0x0078 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:31:0x0086 */
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m27738(C8325 c8325, int i, C8325 c83252) {
        int i2;
        int i3;
        C8325 c83253;
        C8325 c83254;
        int iM20922 = this.f24840.m20922();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.f24848 / clientWidth : 0.0f;
        if (c83252 != null) {
            int i4 = c83252.f3409;
            int i5 = c8325.f3409;
            if (i4 < i5) {
                float fM20925 = c83252.f24896 + c83252.f24895 + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= c8325.f3409 && i7 < this.f24837.size()) {
                    C8325 c83255 = this.f24837.get(i7);
                    while (true) {
                        c83254 = c83255;
                        if (i6 <= c83254.f3409 || i7 >= this.f24837.size() - 1) {
                            break;
                        }
                        i7++;
                        c83255 = this.f24837.get(i7);
                    }
                    while (i6 < c83254.f3409) {
                        fM20925 += this.f24840.m20925(i6) + f;
                        i6++;
                    }
                    c83254.f24896 = fM20925;
                    fM20925 += c83254.f24895 + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.f24837.size() - 1;
                float fM209252 = c83252.f24896;
                while (true) {
                    i4--;
                    if (i4 < c8325.f3409 || size < 0) {
                        break;
                    }
                    C8325 c83256 = this.f24837.get(size);
                    while (true) {
                        c83253 = c83256;
                        if (i4 >= c83253.f3409 || size <= 0) {
                            break;
                        }
                        size--;
                        c83256 = this.f24837.get(size);
                    }
                    while (i4 > c83253.f3409) {
                        fM209252 -= this.f24840.m20925(i4) + f;
                        i4--;
                    }
                    fM209252 -= c83253.f24895 + f;
                    c83253.f24896 = fM209252;
                }
            }
        }
        int size2 = this.f24837.size();
        float fM209253 = c8325.f24896;
        int i8 = c8325.f3409;
        int i9 = i8 - 1;
        this.f24852 = i8 == 0 ? fM209253 : -3.4028235E38f;
        int i10 = iM20922 - 1;
        this.f24853 = i8 == i10 ? (c8325.f24895 + fM209253) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            C8325 c83257 = this.f24837.get(i11);
            while (true) {
                i3 = c83257.f3409;
                if (i9 <= i3) {
                    break;
                }
                fM209253 -= this.f24840.m20925(i9) + f;
                i9--;
            }
            fM209253 -= c83257.f24895 + f;
            c83257.f24896 = fM209253;
            if (i3 == 0) {
                this.f24852 = fM209253;
            }
            i11--;
            i9--;
        }
        float fM209254 = c8325.f24896 + c8325.f24895 + f;
        int i12 = c8325.f3409 + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C8325 c83258 = this.f24837.get(i13);
            while (true) {
                i2 = c83258.f3409;
                if (i12 >= i2) {
                    break;
                }
                fM209254 += this.f24840.m20925(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.f24853 = (c83258.f24895 + fM209254) - 1.0f;
            }
            c83258.f24896 = fM209254;
            fM209254 += c83258.f24895 + f;
            i13++;
            i12++;
        }
        this.f24880 = false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m27739(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && m27739(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m27740() {
        List<InterfaceC8329> list = this.f24883;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m27741(boolean z) {
        boolean z2 = this.f24892 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f24845.isFinished()) {
                this.f24845.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f24845.getCurrX();
                int currY = this.f24845.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m27765(currX);
                    }
                }
            }
        }
        this.f24858 = false;
        for (int i = 0; i < this.f24837.size(); i++) {
            C8325 c8325 = this.f24837.get(i);
            if (c8325.f24894) {
                c8325.f24894 = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                C8273.m27427(this, this.f24891);
            } else {
                this.f24891.run();
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m27742() {
        int iM20922 = this.f24840.m20922();
        this.f24836 = iM20922;
        boolean z = this.f24837.size() < (this.f24859 * 2) + 1 && this.f24837.size() < iM20922;
        int iMax = this.f24841;
        int i = 0;
        boolean z2 = false;
        while (i < this.f24837.size()) {
            C8325 c8325 = this.f24837.get(i);
            int iM20923 = this.f24840.m20923(c8325.f3408);
            if (iM20923 != -1) {
                if (iM20923 == -2) {
                    this.f24837.remove(i);
                    i--;
                    if (!z2) {
                        this.f24840.mo15693(this);
                        z2 = true;
                    }
                    this.f24840.mo1900(this, c8325.f3409, c8325.f3408);
                    int i2 = this.f24841;
                    if (i2 == c8325.f3409) {
                        iMax = Math.max(0, Math.min(i2, iM20922 - 1));
                    }
                } else {
                    int i3 = c8325.f3409;
                    if (i3 != iM20923) {
                        if (i3 == this.f24841) {
                            iMax = iM20923;
                        }
                        c8325.f3409 = iM20923;
                    }
                }
                z = true;
            }
            i++;
        }
        if (z2) {
            this.f24840.mo15687(this);
        }
        Collections.sort(this.f24837, f24825);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                C8326 c8326 = (C8326) getChildAt(i4).getLayoutParams();
                if (!c8326.f3410) {
                    c8326.f24897 = 0.0f;
                }
            }
            m27777(iMax, false, true);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final int m27743(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f24873 || Math.abs(i2) <= this.f24871) {
            i += (int) (f + (i >= this.f24841 ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f24837.size() <= 0) {
            return i;
        }
        return Math.max(this.f24837.get(0).f3409, Math.min(i, this.f24837.get(r4.size() - 1).f3409));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m27744(int i, float f, int i2) {
        InterfaceC8329 interfaceC8329 = this.f24884;
        if (interfaceC8329 != null) {
            interfaceC8329.onPageScrolled(i, f, i2);
        }
        List<InterfaceC8329> list = this.f24883;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC8329 interfaceC83292 = this.f24883.get(i3);
                if (interfaceC83292 != null) {
                    interfaceC83292.onPageScrolled(i, f, i2);
                }
            }
        }
        InterfaceC8329 interfaceC83293 = this.f24885;
        if (interfaceC83293 != null) {
            interfaceC83293.onPageScrolled(i, f, i2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m27745(int i) {
        InterfaceC8329 interfaceC8329 = this.f24884;
        if (interfaceC8329 != null) {
            interfaceC8329.onPageSelected(i);
        }
        List<InterfaceC8329> list = this.f24883;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC8329 interfaceC83292 = this.f24883.get(i2);
                if (interfaceC83292 != null) {
                    interfaceC83292.onPageSelected(i);
                }
            }
        }
        InterfaceC8329 interfaceC83293 = this.f24885;
        if (interfaceC83293 != null) {
            interfaceC83293.onPageSelected(i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m27746(int i) {
        InterfaceC8329 interfaceC8329 = this.f24884;
        if (interfaceC8329 != null) {
            interfaceC8329.onPageScrollStateChanged(i);
        }
        List<InterfaceC8329> list = this.f24883;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC8329 interfaceC83292 = this.f24883.get(i2);
                if (interfaceC83292 != null) {
                    interfaceC83292.onPageScrollStateChanged(i);
                }
            }
        }
        InterfaceC8329 interfaceC83293 = this.f24885;
        if (interfaceC83293 != null) {
            interfaceC83293.onPageScrollStateChanged(i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public float m27747(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m27748(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.f24888 : 0, null);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m27749() {
        this.f24860 = false;
        this.f24861 = false;
        VelocityTracker velocityTracker = this.f24870;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f24870 = null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m27750() {
        if (!this.f24875) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f24840 != null) {
            VelocityTracker velocityTracker = this.f24870;
            velocityTracker.computeCurrentVelocity(1000, this.f24872);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f24869);
            this.f24858 = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C8325 c8325M27756 = m27756();
            m27778(m27743(c8325M27756.f3409, ((scrollX / clientWidth) - c8325M27756.f24896) / c8325M27756.f24895, xVelocity, (int) (this.f24865 - this.f24867)), true, true, xVelocity);
        }
        m27749();
        this.f24875 = false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public boolean m27751(@InterfaceC6391 KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? m27763() : m27736(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? m27764() : m27736(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m27736(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return m27736(1);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m27752(float f) {
        if (!this.f24875) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f24840 == null) {
            return;
        }
        this.f24865 += f;
        float scrollX = getScrollX() - f;
        float clientWidth = getClientWidth();
        float f2 = this.f24852 * clientWidth;
        float f3 = this.f24853 * clientWidth;
        C8325 c8325 = this.f24837.get(0);
        C8325 c83252 = this.f24837.get(r4.size() - 1);
        if (c8325.f3409 != 0) {
            f2 = c8325.f24896 * clientWidth;
        }
        if (c83252.f3409 != this.f24840.m20922() - 1) {
            f3 = c83252.f24896 * clientWidth;
        }
        if (scrollX < f2) {
            scrollX = f2;
        } else if (scrollX > f3) {
            scrollX = f3;
        }
        int i = (int) scrollX;
        this.f24865 += scrollX - i;
        scrollTo(i, getScrollY());
        m27765(i);
        MotionEvent motionEventObtain = MotionEvent.obtain(this.f24876, SystemClock.uptimeMillis(), 2, this.f24865, 0.0f, 0);
        this.f24870.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final Rect m27753(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public C8325 m27754(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return m27755(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public C8325 m27755(View view) {
        for (int i = 0; i < this.f24837.size(); i++) {
            C8325 c8325 = this.f24837.get(i);
            if (this.f24840.mo15689(view, c8325.f3408)) {
                return c8325;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final C8325 m27756() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.f24848 / clientWidth : 0.0f;
        int i2 = 0;
        boolean z = true;
        C8325 c8325 = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (i2 < this.f24837.size()) {
            C8325 c83252 = this.f24837.get(i2);
            if (!z && c83252.f3409 != (i = i3 + 1)) {
                c83252 = this.f24838;
                c83252.f24896 = f + f3 + f2;
                c83252.f3409 = i;
                c83252.f24895 = this.f24840.m20925(i);
                i2--;
            }
            C8325 c83253 = c83252;
            f = c83253.f24896;
            float f4 = c83253.f24895 + f + f2;
            if (!z && scrollX < f) {
                return c8325;
            }
            if (scrollX < f4 || i2 == this.f24837.size() - 1) {
                return c83253;
            }
            int i4 = c83253.f3409;
            float f5 = c83253.f24895;
            i2++;
            z = false;
            i3 = i4;
            f3 = f5;
            c8325 = c83253;
        }
        return c8325;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public C8325 m27757(int i) {
        for (int i2 = 0; i2 < this.f24837.size(); i2++) {
            C8325 c8325 = this.f24837.get(i2);
            if (c8325.f3409 == i) {
                return c8325;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void m27758() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f24845 = new Scroller(context, f24826);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f24864 = viewConfiguration.getScaledPagingTouchSlop();
        this.f24871 = (int) (400.0f * f);
        this.f24872 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f24877 = new EdgeEffect(context);
        this.f24878 = new EdgeEffect(context);
        this.f24873 = (int) (25.0f * f);
        this.f24874 = (int) (2.0f * f);
        this.f24862 = (int) (f * 16.0f);
        C8273.m27439(this, new C8327());
        if (C8273.m27351(this) == 0) {
            C8273.m27457(this, 1);
        }
        C8273.m27468(this, new C8323());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean m27759() {
        return this.f24875;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final boolean m27760(float f, float f2) {
        return (f < ((float) this.f24863) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f24863)) && f2 < 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    @InterfaceC3647
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m27761(int i, float f, int i2) {
        int iMax;
        int width;
        int left;
        if (this.f24882 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                C8326 c8326 = (C8326) childAt.getLayoutParams();
                if (c8326.f3410) {
                    int i4 = c8326.f3411 & 7;
                    if (i4 != 1) {
                        if (i4 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i4 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i5 = iMax;
                    width = paddingLeft;
                    paddingLeft = i5;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = width;
                }
            }
        }
        m27744(i, f, i2);
        if (this.f24887 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i6 = 0; i6 < childCount2; i6++) {
                View childAt2 = getChildAt(i6);
                if (!((C8326) childAt2.getLayoutParams()).f3410) {
                    this.f24887.m4304(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.f24881 = true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m27762(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f24869) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f24865 = motionEvent.getX(i);
            this.f24869 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f24870;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public boolean m27763() {
        int i = this.f24841;
        if (i <= 0) {
            return false;
        }
        m27776(i - 1, true);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public boolean m27764() {
        AbstractC6594 abstractC6594 = this.f24840;
        if (abstractC6594 == null || this.f24841 >= abstractC6594.m20922() - 1) {
            return false;
        }
        m27776(this.f24841 + 1, true);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final boolean m27765(int i) {
        if (this.f24837.size() == 0) {
            if (this.f24879) {
                return false;
            }
            this.f24881 = false;
            m27761(0, 0.0f, 0);
            if (this.f24881) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C8325 c8325M27756 = m27756();
        int clientWidth = getClientWidth();
        int i2 = this.f24848;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = c8325M27756.f3409;
        float f2 = ((i / f) - c8325M27756.f24896) / (c8325M27756.f24895 + (i2 / f));
        this.f24881 = false;
        m27761(i4, f2, (int) (i3 * f2));
        if (this.f24881) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final boolean m27766(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f24865 - f;
        this.f24865 = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.f24852 * clientWidth;
        float f4 = this.f24853 * clientWidth;
        boolean z3 = false;
        C8325 c8325 = this.f24837.get(0);
        ArrayList<C8325> arrayList = this.f24837;
        C8325 c83252 = arrayList.get(arrayList.size() - 1);
        if (c8325.f3409 != 0) {
            f3 = c8325.f24896 * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c83252.f3409 != this.f24840.m20922() - 1) {
            f4 = c83252.f24896 * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f24877.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f24878.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f24865 += scrollX - i;
        scrollTo(i, getScrollY());
        m27765(i);
        return z3;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public void m27767() {
        m27768(this.f24841);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb A[PHI: r7 r10 r15
  0x00cb: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:64:0x00ef, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:64:0x00ef, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:64:0x00ef, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m27768(int i) {
        C8325 c8325M27757;
        String hexString;
        C8325 c8325M4301;
        C8325 c8325M27755;
        C8325 c8325;
        int i2 = this.f24841;
        if (i2 != i) {
            c8325M27757 = m27757(i2);
            this.f24841 = i;
        } else {
            c8325M27757 = null;
        }
        if (this.f24840 == null) {
            m27784();
            return;
        }
        if (this.f24858) {
            m27784();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.f24840.mo15693(this);
        int i3 = this.f24859;
        int iMax = Math.max(0, this.f24841 - i3);
        int iM20922 = this.f24840.m20922();
        int iMin = Math.min(iM20922 - 1, this.f24841 + i3);
        if (iM20922 != this.f24836) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f24836 + ", found: " + iM20922 + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f24840.getClass());
        }
        int i4 = 0;
        while (true) {
            if (i4 >= this.f24837.size()) {
                break;
            }
            c8325M4301 = this.f24837.get(i4);
            int i5 = c8325M4301.f3409;
            int i6 = this.f24841;
            if (i5 >= i6) {
                if (i5 != i6) {
                    break;
                }
            } else {
                i4++;
            }
        }
        if (c8325M4301 == null && iM20922 > 0) {
            c8325M4301 = m4301(this.f24841, i4);
        }
        if (c8325M4301 != null) {
            int i7 = i4 - 1;
            C8325 c83252 = i7 >= 0 ? this.f24837.get(i7) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - c8325M4301.f24895) + (getPaddingLeft() / clientWidth);
            float f = 0.0f;
            for (int i8 = this.f24841 - 1; i8 >= 0; i8--) {
                if (f >= paddingLeft && i8 < iMax) {
                    if (c83252 == null) {
                        break;
                    }
                    if (i8 == c83252.f3409 && !c83252.f24894) {
                        this.f24837.remove(i7);
                        this.f24840.mo1900(this, i8, c83252.f3408);
                        i7--;
                        i4--;
                        if (i7 >= 0) {
                            c8325 = this.f24837.get(i7);
                        }
                        c83252 = c8325;
                    }
                } else if (c83252 == null || i8 != c83252.f3409) {
                    f += m4301(i8, i7 + 1).f24895;
                    i4++;
                    c8325 = i7 >= 0 ? this.f24837.get(i7) : null;
                    c83252 = c8325;
                } else {
                    f += c83252.f24895;
                    i7--;
                    if (i7 >= 0) {
                        c8325 = this.f24837.get(i7);
                    }
                    c83252 = c8325;
                }
            }
            float f2 = c8325M4301.f24895;
            int i9 = i4 + 1;
            if (f2 < 2.0f) {
                C8325 c83253 = i9 < this.f24837.size() ? this.f24837.get(i9) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i10 = this.f24841;
                while (true) {
                    i10++;
                    if (i10 >= iM20922) {
                        break;
                    }
                    if (f2 >= paddingRight && i10 > iMin) {
                        if (c83253 == null) {
                            break;
                        }
                        if (i10 == c83253.f3409 && !c83253.f24894) {
                            this.f24837.remove(i9);
                            this.f24840.mo1900(this, i10, c83253.f3408);
                            if (i9 < this.f24837.size()) {
                                c83253 = this.f24837.get(i9);
                            }
                        }
                    } else if (c83253 == null || i10 != c83253.f3409) {
                        C8325 c8325M43012 = m4301(i10, i9);
                        i9++;
                        f2 += c8325M43012.f24895;
                        c83253 = i9 < this.f24837.size() ? this.f24837.get(i9) : null;
                    } else {
                        f2 += c83253.f24895;
                        i9++;
                        if (i9 < this.f24837.size()) {
                            c83253 = this.f24837.get(i9);
                        }
                    }
                }
            }
            m27738(c8325M4301, i4, c8325M27757);
            this.f24840.mo15692(this, this.f24841, c8325M4301.f3408);
        }
        this.f24840.mo15687(this);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C8326 c8326 = (C8326) childAt.getLayoutParams();
            c8326.f24900 = i11;
            if (!c8326.f3410 && c8326.f24897 == 0.0f && (c8325M27755 = m27755(childAt)) != null) {
                c8326.f24897 = c8325M27755.f24895;
                c8326.f24899 = c8325M27755.f3409;
            }
        }
        m27784();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            C8325 c8325M27754 = viewFindFocus != null ? m27754(viewFindFocus) : null;
            if (c8325M27754 == null || c8325M27754.f3409 != this.f24841) {
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt2 = getChildAt(i12);
                    C8325 c8325M277552 = m27755(childAt2);
                    if (c8325M277552 != null && c8325M277552.f3409 == this.f24841 && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public final void m27769(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.f24837.isEmpty()) {
            if (!this.f24845.isFinished()) {
                this.f24845.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        C8325 c8325M27757 = m27757(this.f24841);
        int iMin = (int) ((c8325M27757 != null ? Math.min(c8325M27757.f24896, this.f24853) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            m27741(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public final void m27770() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C8326) getChildAt(i).getLayoutParams()).f3410) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public void m27771(@InterfaceC6391 InterfaceC8328 interfaceC8328) {
        List<InterfaceC8328> list = this.f24886;
        if (list != null) {
            list.remove(interfaceC8328);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public void m27772(@InterfaceC6391 InterfaceC8329 interfaceC8329) {
        List<InterfaceC8329> list = this.f24883;
        if (list != null) {
            list.remove(interfaceC8329);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final void m27773(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final boolean m27774() {
        this.f24869 = -1;
        m27749();
        this.f24877.onRelease();
        this.f24878.onRelease();
        return this.f24877.isFinished() || this.f24878.isFinished();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final void m27775(int i, boolean z, int i2, boolean z2) {
        C8325 c8325M27757 = m27757(i);
        int clientWidth = c8325M27757 != null ? (int) (getClientWidth() * Math.max(this.f24852, Math.min(c8325M27757.f24896, this.f24853))) : 0;
        if (z) {
            m27783(clientWidth, 0, i2);
            if (z2) {
                m27745(i);
                return;
            }
            return;
        }
        if (z2) {
            m27745(i);
        }
        m27741(false);
        scrollTo(clientWidth, 0);
        m27765(clientWidth);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public void m27776(int i, boolean z) {
        this.f24858 = false;
        m27777(i, z, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public void m27777(int i, boolean z, boolean z2) {
        m27778(i, z, z2, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void m27778(int i, boolean z, boolean z2, int i2) {
        AbstractC6594 abstractC6594 = this.f24840;
        if (abstractC6594 == null || abstractC6594.m20922() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.f24841 == i && this.f24837.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f24840.m20922()) {
            i = this.f24840.m20922() - 1;
        }
        int i3 = this.f24859;
        int i4 = this.f24841;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.f24837.size(); i5++) {
                this.f24837.get(i5).f24894 = true;
            }
        }
        boolean z3 = this.f24841 != i;
        if (!this.f24879) {
            m27768(i);
            m27775(i, z, i2, z3);
        } else {
            this.f24841 = i;
            if (z3) {
                m27745(i);
            }
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public InterfaceC8329 m27779(InterfaceC8329 interfaceC8329) {
        InterfaceC8329 interfaceC83292 = this.f24885;
        this.f24885 = interfaceC8329;
        return interfaceC83292;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m27780(boolean z, @InterfaceC6490 InterfaceC8330 interfaceC8330) {
        m27781(z, interfaceC8330, 2);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m27781(boolean z, @InterfaceC6490 InterfaceC8330 interfaceC8330, int i) {
        boolean z2 = interfaceC8330 != null;
        boolean z3 = z2 != (this.f24887 != null);
        this.f24887 = interfaceC8330;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.f24889 = z ? 2 : 1;
            this.f24888 = i;
        } else {
            this.f24889 = 0;
        }
        if (z3) {
            m27767();
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m27782(int i, int i2) {
        m27783(i, i2, 0);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m27783(int i, int i2, int i3) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f24845;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.f24846 ? this.f24845.getCurrX() : this.f24845.getStartX();
            this.f24845.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            m27741(false);
            m27767();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i7;
        float fM27747 = f2 + (m27747(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f)) * f2);
        int iAbs = Math.abs(i3);
        int iMin = Math.min(iAbs > 0 ? Math.round(Math.abs(fM27747 / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i5) / ((f * this.f24840.m20925(this.f24841)) + this.f24848)) + 1.0f) * 100.0f), 600);
        this.f24846 = false;
        this.f24845.startScroll(i4, scrollY, i5, i6, iMin);
        C8273.m27425(this);
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public final void m27784() {
        if (this.f24889 != 0) {
            ArrayList<View> arrayList = this.f24890;
            if (arrayList == null) {
                this.f24890 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f24890.add(getChildAt(i));
            }
            Collections.sort(this.f24890, f24832);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۠$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C8326 extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: ۥ */
        public boolean f3410;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3411;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public float f24897;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f24898;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f24899;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f24900;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8326() {
            super(-1, -1);
            this.f24897 = 0.0f;
        }

        public C8326(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f24897 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8321.f24824);
            this.f3411 = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C8326(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(@InterfaceC4525 int i) {
        setPageMarginDrawable(C4187.m12065(getContext(), i));
    }

    public C8321(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24837 = new ArrayList<>();
        this.f24838 = new C8325();
        this.f24839 = new Rect();
        this.f24842 = -1;
        this.f24843 = null;
        this.f24844 = null;
        this.f24852 = -3.4028235E38f;
        this.f24853 = Float.MAX_VALUE;
        this.f24859 = 1;
        this.f24869 = -1;
        this.f24879 = true;
        this.f24880 = false;
        this.f24891 = new RunnableC8322();
        this.f24892 = 0;
        m27758();
    }
}
