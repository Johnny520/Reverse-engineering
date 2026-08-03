package Yue;

import Yue.C3024;
import Yue.C3055;
import Yue.C6989;
import Yue.C8439;
import Yue.C8472;
import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import com.google.android.material.color.utilities.Contrast;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Yue.ۥۢۤۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class C8273 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f3376 = "ViewCompat";

    /* JADX INFO: renamed from: ۥ۟ */
    @Deprecated
    public static final int f3377 = 0;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Deprecated
    public static final int f24670 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Deprecated
    public static final int f24671 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f24672 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f24673 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f24674 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f24675 = 4;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f24676 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @Deprecated
    public static final int f24677 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @Deprecated
    public static final int f24678 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    @Deprecated
    public static final int f24679 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    @Deprecated
    public static final int f24680 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f24681 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f24682 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f24683 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    @Deprecated
    public static final int f24684 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    @Deprecated
    public static final int f24685 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    @Deprecated
    public static final int f24686 = 2;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Deprecated
    public static final int f24687 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Deprecated
    public static final int f24688 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Deprecated
    public static final int f24689 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Deprecated
    public static final int f24690 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Deprecated
    public static final int f24691 = 16777215;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Deprecated
    public static final int f24692 = -16777216;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @Deprecated
    public static final int f24693 = 16;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    @Deprecated
    public static final int f24694 = 16777216;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f24695 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int f24696 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int f24697 = 2;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f24698 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f24699 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f24700 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f24701 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int f24702 = 4;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int f24703 = 8;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final int f24704 = 16;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final int f24705 = 32;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static Method f24706;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static Method f24707;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static boolean f24708;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static WeakHashMap<View, String> f24709;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static WeakHashMap<View, C8357> f24710;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static Method f24711;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static Field f24712;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static boolean f24713;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static ThreadLocal<Rect> f24714;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final int[] f24715 = {C6989.C6992.f2614, C6989.C6992.f21009, C6989.C6992.f21020, C6989.C6992.f21031, C6989.C6992.f21034, C6989.C6992.f21035, C6989.C6992.f21036, C6989.C6992.f21037, C6989.C6992.f21038, C6989.C6992.f21039, C6989.C6992.f21010, C6989.C6992.f21011, C6989.C6992.f21012, C6989.C6992.f21013, C6989.C6992.f21014, C6989.C6992.f21015, C6989.C6992.f21016, C6989.C6992.f21017, C6989.C6992.f21018, C6989.C6992.f21019, C6989.C6992.f21021, C6989.C6992.f21022, C6989.C6992.f21023, C6989.C6992.f21024, C6989.C6992.f21025, C6989.C6992.f21026, C6989.C6992.f21027, C6989.C6992.f21028, C6989.C6992.f21029, C6989.C6992.f21030, C6989.C6992.f21032, C6989.C6992.f21033};

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final InterfaceC6558 f24716 = new InterfaceC6558() { // from class: Yue.ۥۢۤۤۥ
        @Override // Yue.InterfaceC6558
        public final C4152 onReceiveContent(C4152 c4152) {
            return C8273.m27412(c4152);
        }
    };

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final ViewTreeObserverOnGlobalLayoutListenerC8276 f24717 = new ViewTreeObserverOnGlobalLayoutListenerC8276();

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥ */
    public class C1470 extends AbstractC8277<Boolean> {
        public C1470(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(Landroid/view/View;)Ljava/lang/Object; */
        @Override // Yue.C8273.AbstractC8277
        @InterfaceC7113(28)
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Boolean mo27503(@InterfaceC6391 View view) {
            return Boolean.valueOf(C8283.m27569(view));
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟(Landroid/view/View;Ljava/lang/Object;)V */
        @Override // Yue.C8273.AbstractC8277
        @InterfaceC7113(28)
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo27504(@InterfaceC6391 View view, Boolean bool) {
            C8283.m27575(view, bool.booleanValue());
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // Yue.C8273.AbstractC8277
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public boolean mo27505(Boolean bool, Boolean bool2) {
            return !m4249(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥ۟ */
    public class C1471 extends AbstractC8277<CharSequence> {
        public C1471(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(Landroid/view/View;)Ljava/lang/Object; */
        @Override // Yue.C8273.AbstractC8277
        @InterfaceC7113(28)
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public CharSequence mo27503(View view) {
            return C8283.m4262(view);
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟(Landroid/view/View;Ljava/lang/Object;)V */
        @Override // Yue.C8273.AbstractC8277
        @InterfaceC7113(28)
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo27504(View view, CharSequence charSequence) {
            C8283.m27573(view, charSequence);
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // Yue.C8273.AbstractC8277
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public boolean mo27505(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥ۟۟, reason: contains not printable characters */
    public class C8274 extends AbstractC8277<CharSequence> {
        public C8274(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(Landroid/view/View;)Ljava/lang/Object; */
        @Override // Yue.C8273.AbstractC8277
        @InterfaceC7113(30)
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public CharSequence mo27503(View view) {
            return C8285.m4266(view);
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟(Landroid/view/View;Ljava/lang/Object;)V */
        @Override // Yue.C8273.AbstractC8277
        @InterfaceC7113(30)
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo27504(View view, CharSequence charSequence) {
            C8285.m27583(view, charSequence);
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // Yue.C8273.AbstractC8277
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public boolean mo27505(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥ۟۟۟, reason: contains not printable characters */
    public class C8275 extends AbstractC8277<Boolean> {
        public C8275(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(Landroid/view/View;)Ljava/lang/Object; */
        @Override // Yue.C8273.AbstractC8277
        @InterfaceC7113(28)
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Boolean mo27503(View view) {
            return Boolean.valueOf(C8283.m27568(view));
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟(Landroid/view/View;Ljava/lang/Object;)V */
        @Override // Yue.C8273.AbstractC8277
        @InterfaceC7113(28)
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo27504(View view, Boolean bool) {
            C8283.m27572(view, bool.booleanValue());
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // Yue.C8273.AbstractC8277
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public boolean mo27505(Boolean bool, Boolean bool2) {
            return !m4249(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class ViewTreeObserverOnGlobalLayoutListenerC8276 implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final WeakHashMap<View, Boolean> f24718 = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator<Map.Entry<View, Boolean>> it = this.f24718.entrySet().iterator();
                while (it.hasNext()) {
                    m4248(it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m27518(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4247(View view) {
            this.f24718.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                m27518(view);
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final void m4248(Map.Entry<View, Boolean> entry) {
            View key = entry.getKey();
            boolean zBooleanValue = entry.getValue().booleanValue();
            boolean z = key.isShown() && key.getWindowVisibility() == 0;
            if (zBooleanValue != z) {
                C8273.m27413(key, z ? 16 : 32);
                entry.setValue(Boolean.valueOf(z));
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m27518(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m27519(View view) {
            this.f24718.remove(view);
            view.removeOnAttachStateChangeListener(this);
            m27520(view);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m27520(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static abstract class AbstractC8277<T> {

        /* JADX INFO: renamed from: ۥ */
        public final int f3378;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Class<T> f3379;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f24719;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final int f24720;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AbstractC8277(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        /* JADX INFO: renamed from: ۥ */
        public boolean m4249(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean m4250() {
            return Build.VERSION.SDK_INT >= this.f24719;
        }

        /* JADX INFO: renamed from: ۥ۟۟ */
        public abstract T mo27503(View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public abstract void mo27504(View view, T t);

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public T m27521(View view) {
            if (m4250()) {
                return mo27503(view);
            }
            T t = (T) view.getTag(this.f3378);
            if (this.f3379.isInstance(t)) {
                return t;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void m27522(View view, T t) {
            if (m4250()) {
                mo27504(view, t);
            } else if (mo27505(m27521(view), t)) {
                C8273.m27330(view);
                view.setTag(this.f3378, t);
                C8273.m27413(view, this.f24720);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo27505(T t, T t2) {
            return !t2.equals(t);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public AbstractC8277(int i, Class<T> cls, int i2, int i3) {
            this.f3378 = i;
            this.f3379 = cls;
            this.f24720 = i2;
            this.f24719 = i3;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC7113(20)
    public static class C8278 {
        private C8278() {
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static WindowInsets m4251(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static WindowInsets m4252(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m27523(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC7113(21)
    public static class C8279 {

        /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥ۟۟۟ۢ$ۥ */
        public class ViewOnApplyWindowInsetsListenerC1472 implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: ۥ */
            public C8472 f3380 = null;

            /* JADX INFO: renamed from: ۥ۟ */
            public final /* synthetic */ View f3381;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC6545 f24721;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public ViewOnApplyWindowInsetsListenerC1472(View view, InterfaceC6545 interfaceC6545) {
                this.f3381 = view;
                this.f24721 = interfaceC6545;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C8472 c8472M28277 = C8472.m28277(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C8279.m4253(windowInsets, this.f3381);
                    if (c8472M28277.equals(this.f3380)) {
                        return this.f24721.onApplyWindowInsets(view, c8472M28277).m28310();
                    }
                }
                this.f3380 = c8472M28277;
                C8472 c8472OnApplyWindowInsets = this.f24721.onApplyWindowInsets(view, c8472M28277);
                if (i >= 30) {
                    return c8472OnApplyWindowInsets.m28310();
                }
                C8273.m27433(view);
                return c8472OnApplyWindowInsets.m28310();
            }
        }

        private C8279() {
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m4253(@InterfaceC6391 WindowInsets windowInsets, @InterfaceC6391 View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C6989.C6992.f21076);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static C8472 m4254(@InterfaceC6391 View view, @InterfaceC6391 C8472 c8472, @InterfaceC6391 Rect rect) {
            WindowInsets windowInsetsM28310 = c8472.m28310();
            if (windowInsetsM28310 != null) {
                return C8472.m28277(view.computeSystemWindowInsets(windowInsetsM28310, rect), view);
            }
            rect.setEmpty();
            return c8472;
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m27524(@InterfaceC6391 View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static boolean m27525(@InterfaceC6391 View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static boolean m27526(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static boolean m27527(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static ColorStateList m27528(View view) {
            return view.getBackgroundTintList();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static PorterDuff.Mode m27529(View view) {
            return view.getBackgroundTintMode();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static float m27530(View view) {
            return view.getElevation();
        }

        @InterfaceC4482
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static C8472 m27531(@InterfaceC6391 View view) {
            return C8472.C1542.m4465(view);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static String m27532(View view) {
            return view.getTransitionName();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static float m27533(View view) {
            return view.getTranslationZ();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static float m27534(@InterfaceC6391 View view) {
            return view.getZ();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static boolean m27535(View view) {
            return view.hasNestedScrollingParent();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static boolean m27536(View view) {
            return view.isImportantForAccessibility();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static boolean m27537(View view) {
            return view.isNestedScrollingEnabled();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static void m27538(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static void m27539(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static void m27540(View view, float f) {
            view.setElevation(f);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static void m27541(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static void m27542(@InterfaceC6391 View view, @InterfaceC6490 InterfaceC6545 interfaceC6545) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C6989.C6992.f21068, interfaceC6545);
            }
            if (interfaceC6545 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C6989.C6992.f21076));
            } else {
                view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC1472(view, interfaceC6545));
            }
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static void m27543(View view, String str) {
            view.setTransitionName(str);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static void m27544(View view, float f) {
            view.setTranslationZ(f);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static void m27545(@InterfaceC6391 View view, float f) {
            view.setZ(f);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static boolean m27546(View view, int i) {
            return view.startNestedScroll(i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static void m27547(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(23)
    public static class C8280 {
        private C8280() {
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        public static C8472 m4255(@InterfaceC6391 View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C8472 c8472M28276 = C8472.m28276(rootWindowInsets);
            c8472M28276.m28308(c8472M28276);
            c8472M28276.m28279(view.getRootView());
            return c8472M28276;
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static int m4256(@InterfaceC6391 View view) {
            return view.getScrollIndicators();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m27548(@InterfaceC6391 View view, int i) {
            view.setScrollIndicators(i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m27549(@InterfaceC6391 View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC7113(24)
    public static class C8281 {
        private C8281() {
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m4257(@InterfaceC6391 View view) {
            view.cancelDragAndDrop();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m4258(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m27550(View view) {
            view.dispatchStartTemporaryDetach();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m27551(@InterfaceC6391 View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static boolean m27552(@InterfaceC6391 View view, @InterfaceC6490 ClipData clipData, @InterfaceC6391 View.DragShadowBuilder dragShadowBuilder, @InterfaceC6490 Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static void m27553(@InterfaceC6391 View view, @InterfaceC6391 View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC7113(26)
    public static class C8282 {
        private C8282() {
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m4259(@InterfaceC6391 View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static AutofillId m4260(View view) {
            return view.getAutofillId();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static int m27554(View view) {
            return view.getImportantForAutofill();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static int m27555(@InterfaceC6391 View view) {
            return view.getNextClusterForwardId();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static boolean m27556(@InterfaceC6391 View view) {
            return view.hasExplicitFocusable();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static boolean m27557(@InterfaceC6391 View view) {
            return view.isFocusedByDefault();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static boolean m27558(View view) {
            return view.isImportantForAutofill();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static boolean m27559(@InterfaceC6391 View view) {
            return view.isKeyboardNavigationCluster();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static View m27560(@InterfaceC6391 View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static boolean m27561(@InterfaceC6391 View view) {
            return view.restoreDefaultFocus();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static void m27562(@InterfaceC6391 View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static void m27563(@InterfaceC6391 View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static void m27564(View view, int i) {
            view.setImportantForAutofill(i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static void m27565(@InterfaceC6391 View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static void m27566(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static void m27567(@InterfaceC6391 View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    @InterfaceC7113(28)
    public static class C8283 {
        private C8283() {
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m4261(@InterfaceC6391 View view, @InterfaceC6391 final InterfaceC8292 interfaceC8292) {
            C7467 c7467 = (C7467) view.getTag(C6989.C6992.f21075);
            if (c7467 == null) {
                c7467 = new C7467();
                view.setTag(C6989.C6992.f21075, c7467);
            }
            Objects.requireNonNull(interfaceC8292);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: Yue.ۥۢۤۤۧ
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return interfaceC8292.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            c7467.put(interfaceC8292, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static CharSequence m4262(View view) {
            return view.getAccessibilityPaneTitle();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m27568(View view) {
            return view.isAccessibilityHeading();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static boolean m27569(View view) {
            return view.isScreenReaderFocusable();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static void m27570(@InterfaceC6391 View view, @InterfaceC6391 InterfaceC8292 interfaceC8292) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            C7467 c7467 = (C7467) view.getTag(C6989.C6992.f21075);
            if (c7467 == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c7467.get(interfaceC8292)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static <T> T m27571(View view, int i) {
            return (T) view.requireViewById(i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static void m27572(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static void m27573(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static void m27574(View view, C3502 c3502) {
            view.setAutofillId(c3502 == null ? null : c3502.m560());
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static void m27575(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥ۟۟۟ۧ, reason: contains not printable characters */
    @InterfaceC7113(29)
    public static class C8284 {
        private C8284() {
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static View.AccessibilityDelegate m4263(View view) {
            return view.getAccessibilityDelegate();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static ContentCaptureSession m4264(View view) {
            return view.getContentCaptureSession();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static List<Rect> m27576(View view) {
            return view.getSystemGestureExclusionRects();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m27577(@InterfaceC6391 View view, @InterfaceC6391 Context context, @InterfaceC6391 int[] iArr, @InterfaceC6490 AttributeSet attributeSet, @InterfaceC6391 TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static void m27578(View view, C4148 c4148) {
            view.setContentCaptureSession(c4148 == null ? null : c4148.m12017());
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static void m27579(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥ۟۟۟ۨ, reason: contains not printable characters */
    @InterfaceC7113(30)
    public static class C8285 {
        private C8285() {
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m4265(View view) {
            return view.getImportantForContentCapture();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static CharSequence m4266(View view) {
            return view.getStateDescription();
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static C8514 m27580(@InterfaceC6391 View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return C8514.m28363(windowInsetsController);
            }
            return null;
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static boolean m27581(View view) {
            return view.isImportantForContentCapture();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static void m27582(View view, int i) {
            view.setImportantForContentCapture(i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static void m27583(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥ۟۟۠, reason: contains not printable characters */
    @InterfaceC7113(31)
    public static final class C8286 {
        private C8286() {
        }

        @InterfaceC4482
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        public static String[] m4267(@InterfaceC6391 View view) {
            return view.getReceiveContentMimeTypes();
        }

        @InterfaceC4482
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟ */
        public static C4152 m4268(@InterfaceC6391 View view, @InterfaceC6391 C4152 c4152) {
            ContentInfo contentInfoM12032 = c4152.m12032();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM12032);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoM12032 ? c4152 : C4152.m12025(contentInfoPerformReceiveContent);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m27584(@InterfaceC6391 View view, @InterfaceC6490 String[] strArr, @InterfaceC6490 InterfaceC6557 interfaceC6557) {
            if (interfaceC6557 == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC8291(interfaceC6557));
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥ۟۟۠۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8287 {
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥ۟۟۠۠, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8288 {
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥ۟۟۠ۡ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8289 {
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥ۟۟۠ۢ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8290 {
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC7113(31)
    public static final class OnReceiveContentListenerC8291 implements OnReceiveContentListener {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6391
        public final InterfaceC6557 f3382;

        public OnReceiveContentListenerC8291(@InterfaceC6391 InterfaceC6557 interfaceC6557) {
            this.f3382 = interfaceC6557;
        }

        @InterfaceC6490
        public ContentInfo onReceiveContent(@InterfaceC6391 View view, @InterfaceC6391 ContentInfo contentInfo) {
            C4152 c4152M12025 = C4152.m12025(contentInfo);
            C4152 c4152Mo3019 = this.f3382.mo3019(view, c4152M12025);
            if (c4152Mo3019 == null) {
                return null;
            }
            return c4152Mo3019 == c4152M12025 ? contentInfo : c4152Mo3019.m12032();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥ۟۟۠ۤ, reason: contains not printable characters */
    public interface InterfaceC8292 {
        boolean onUnhandledKeyEvent(@InterfaceC6391 View view, @InterfaceC6391 KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8293 {
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8294 {
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۦ$ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static class C8295 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final ArrayList<WeakReference<View>> f24722 = new ArrayList<>();

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6490
        public WeakHashMap<View, Boolean> f3383 = null;

        /* JADX INFO: renamed from: ۥ۟ */
        public SparseArray<WeakReference<View>> f3384 = null;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public WeakReference<KeyEvent> f24723 = null;

        /* JADX INFO: renamed from: ۥ */
        public static C8295 m4269(View view) {
            C8295 c8295 = (C8295) view.getTag(C6989.C6992.f21074);
            if (c8295 != null) {
                return c8295;
            }
            C8295 c82952 = new C8295();
            view.setTag(C6989.C6992.f21074, c82952);
            return c82952;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static void m27585(View view) {
            ArrayList<WeakReference<View>> arrayList = f24722;
            synchronized (arrayList) {
                try {
                    Iterator<WeakReference<View>> it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next().get() == view) {
                            return;
                        }
                    }
                    f24722.add(new WeakReference<>(view));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static void m27586(View view) {
            synchronized (f24722) {
                int i = 0;
                while (true) {
                    try {
                        ArrayList<WeakReference<View>> arrayList = f24722;
                        if (i >= arrayList.size()) {
                            return;
                        }
                        if (arrayList.get(i).get() == view) {
                            arrayList.remove(i);
                            return;
                        }
                        i++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m4270(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m27591();
            }
            View viewM27587 = m27587(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewM27587 != null && !KeyEvent.isModifierKey(keyCode)) {
                    m27588().put(keyCode, new WeakReference<>(viewM27587));
                }
            }
            return viewM27587 != null;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final View m27587(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f3383;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewM27587 = m27587(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewM27587 != null) {
                            return viewM27587;
                        }
                    }
                }
                if (m27589(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final SparseArray<WeakReference<View>> m27588() {
            if (this.f3384 == null) {
                this.f3384 = new SparseArray<>();
            }
            return this.f3384;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final boolean m27589(@InterfaceC6391 View view, @InterfaceC6391 KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C6989.C6992.f21075);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((InterfaceC8292) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean m27590(KeyEvent keyEvent) {
            WeakReference<View> weakReferenceValueAt;
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f24723;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f24723 = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> sparseArrayM27588 = m27588();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayM27588.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReferenceValueAt = null;
            } else {
                weakReferenceValueAt = sparseArrayM27588.valueAt(iIndexOfKey);
                sparseArrayM27588.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayM27588.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && view.isAttachedToWindow()) {
                m27589(view, keyEvent);
            }
            return true;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final void m27591() {
            WeakHashMap<View, Boolean> weakHashMap = this.f3383;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f24722;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f3383 == null) {
                        this.f3383 = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f24722;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f3383.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f3383.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Deprecated
    public C8273() {
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static AbstractC8277<Boolean> m4246() {
        return new C8275(C6989.C6992.f21066, Boolean.class, 28);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int m27304(@InterfaceC6391 View view, @InterfaceC6391 CharSequence charSequence, @InterfaceC6391 InterfaceC3070 interfaceC3070) {
        int iM27341 = m27341(view, charSequence);
        if (iM27341 != -1) {
            m27305(view, new C3055.C0034(iM27341, charSequence, interfaceC3070));
        }
        return iM27341;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m27305(@InterfaceC6391 View view, @InterfaceC6391 C3055.C0034 c0034) {
        m27330(view);
        m27430(c0034.m121(), view);
        m27338(view).add(c0034);
        m27413(view, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m27306(@InterfaceC6391 View view, @InterfaceC6391 Collection<View> collection, int i) {
        C8282.m4259(view, collection, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m27307(@InterfaceC6391 View view, @InterfaceC6391 InterfaceC8292 interfaceC8292) {
        if (Build.VERSION.SDK_INT >= 28) {
            C8283.m4261(view, interfaceC8292);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(C6989.C6992.f21075);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(C6989.C6992.f21075, arrayList);
        }
        arrayList.add(interfaceC8292);
        if (arrayList.size() == 1) {
            C8295.m27585(view);
        }
    }

    @InterfaceC6391
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static C8357 m27308(@InterfaceC6391 View view) {
        if (f24710 == null) {
            f24710 = new WeakHashMap<>();
        }
        C8357 c8357 = f24710.get(view);
        if (c8357 != null) {
            return c8357;
        }
        C8357 c83572 = new C8357(view);
        f24710.put(view, c83572);
        return c83572;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m27309() {
        try {
            f24706 = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", null);
            f24707 = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", null);
        } catch (NoSuchMethodException e) {
            Log.e(f3376, "Couldn't find method", e);
        }
        f24708 = true;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m27310(View view, int i) {
        return view.canScrollHorizontally(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m27311(View view, int i) {
        return view.canScrollVertically(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m27312(@InterfaceC6391 View view) {
        C8281.m4257(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static int m27313(int i, int i2) {
        return View.combineMeasuredStates(i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static void m27314(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m27501(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m27501((View) parent);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static void m27315(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m27501(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m27501((View) parent);
            }
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static C8472 m27316(@InterfaceC6391 View view, @InterfaceC6391 C8472 c8472, @InterfaceC6391 Rect rect) {
        return C8279.m4254(view, c8472, rect);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static C8472 m27317(@InterfaceC6391 View view, @InterfaceC6391 C8472 c8472) {
        WindowInsets windowInsetsM28310 = c8472.m28310();
        if (windowInsetsM28310 != null) {
            WindowInsets windowInsetsM4251 = C8278.m4251(view, windowInsetsM28310);
            if (!windowInsetsM4251.equals(windowInsetsM28310)) {
                return C8472.m28277(windowInsetsM4251, view);
            }
        }
        return c8472;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static void m27318(@InterfaceC6391 View view) {
        C8281.m4258(view);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static boolean m27319(@InterfaceC6391 View view, float f, float f2, boolean z) {
        return C8279.m27524(view, f, f2, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static boolean m27320(@InterfaceC6391 View view, float f, float f2) {
        return C8279.m27525(view, f, f2);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static boolean m27321(@InterfaceC6391 View view, int i, int i2, @InterfaceC6490 int[] iArr, @InterfaceC6490 int[] iArr2) {
        return C8279.m27526(view, i, i2, iArr, iArr2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static boolean m27322(@InterfaceC6391 View view, int i, int i2, @InterfaceC6490 int[] iArr, @InterfaceC6490 int[] iArr2, int i3) {
        if (view instanceof InterfaceC6363) {
            return ((InterfaceC6363) view).dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
        }
        if (i3 == 0) {
            return m27321(view, i, i2, iArr, iArr2);
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static void m27323(@InterfaceC6391 View view, int i, int i2, int i3, int i4, @InterfaceC6490 int[] iArr, int i5, @InterfaceC6391 int[] iArr2) {
        if (view instanceof InterfaceC6364) {
            ((InterfaceC6364) view).dispatchNestedScroll(i, i2, i3, i4, iArr, i5, iArr2);
        } else {
            m27325(view, i, i2, i3, i4, iArr, i5);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static boolean m27324(@InterfaceC6391 View view, int i, int i2, int i3, int i4, @InterfaceC6490 int[] iArr) {
        return C8279.m27527(view, i, i2, i3, i4, iArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static boolean m27325(@InterfaceC6391 View view, int i, int i2, int i3, int i4, @InterfaceC6490 int[] iArr, int i5) {
        if (view instanceof InterfaceC6363) {
            return ((InterfaceC6363) view).dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
        }
        if (i5 == 0) {
            return m27324(view, i, i2, i3, i4, iArr);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static void m27326(@InterfaceC6391 View view) {
        C8281.m27550(view);
    }

    @InterfaceC8086
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static boolean m27327(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C8295.m4269(view).m4270(view, keyEvent);
    }

    @InterfaceC8086
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static boolean m27328(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C8295.m4269(view).m27590(keyEvent);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static void m27329(@InterfaceC6391 View view) {
        m27330(view);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static void m27330(@InterfaceC6391 View view) {
        C3024 c3024M27332 = m27332(view);
        if (c3024M27332 == null) {
            c3024M27332 = new C3024();
        }
        m27439(view, c3024M27332);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static int m27331() {
        return View.generateViewId();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static C3024 m27332(@InterfaceC6391 View view) {
        View.AccessibilityDelegate accessibilityDelegateM27333 = m27333(view);
        if (accessibilityDelegateM27333 == null) {
            return null;
        }
        return accessibilityDelegateM27333 instanceof C3024.C0029 ? ((C3024.C0029) accessibilityDelegateM27333).f40 : new C3024(accessibilityDelegateM27333);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static View.AccessibilityDelegate m27333(@InterfaceC6391 View view) {
        return Build.VERSION.SDK_INT >= 29 ? C8284.m4263(view) : m27334(view);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static View.AccessibilityDelegate m27334(@InterfaceC6391 View view) {
        if (f24713) {
            return null;
        }
        if (f24712 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f24712 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f24713 = true;
                return null;
            }
        }
        try {
            Object obj = f24712.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f24713 = true;
            return null;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static int m27335(@InterfaceC6391 View view) {
        return view.getAccessibilityLiveRegion();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static C3067 m27336(@InterfaceC6391 View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = view.getAccessibilityNodeProvider();
        if (accessibilityNodeProvider != null) {
            return new C3067(accessibilityNodeProvider);
        }
        return null;
    }

    @InterfaceC6490
    @InterfaceC8086
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static CharSequence m27337(@InterfaceC6391 View view) {
        return m27420().m27521(view);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static List<C3055.C0034> m27338(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C6989.C6992.f21064);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(C6989.C6992.f21064, arrayList2);
        return arrayList2;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static float m27339(View view) {
        return view.getAlpha();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static C3502 m27340(@InterfaceC6391 View view) {
        return C3502.m559(C8282.m4260(view));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static int m27341(View view, @InterfaceC6391 CharSequence charSequence) {
        List<C3055.C0034> listM27338 = m27338(view);
        for (int i = 0; i < listM27338.size(); i++) {
            if (TextUtils.equals(charSequence, listM27338.get(i).m6117())) {
                return listM27338.get(i).m121();
            }
        }
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[] iArr = f24715;
            if (i3 >= iArr.length || i2 != -1) {
                break;
            }
            int i4 = iArr[i3];
            boolean z = true;
            for (int i5 = 0; i5 < listM27338.size(); i5++) {
                z &= listM27338.get(i5).m121() != i4;
            }
            if (z) {
                i2 = i4;
            }
            i3++;
        }
        return i2;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static ColorStateList m27342(@InterfaceC6391 View view) {
        return C8279.m27528(view);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static PorterDuff.Mode m27343(@InterfaceC6391 View view) {
        return C8279.m27529(view);
    }

    @InterfaceC6490
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static Rect m27344(@InterfaceC6391 View view) {
        return view.getClipBounds();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static C4148 m27345(@InterfaceC6391 View view) {
        ContentCaptureSession contentCaptureSessionM4264;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSessionM4264 = C8284.m4264(view)) == null) {
            return null;
        }
        return C4148.m12013(contentCaptureSessionM4264, view);
    }

    @InterfaceC6490
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static Display m27346(@InterfaceC6391 View view) {
        return view.getDisplay();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static float m27347(@InterfaceC6391 View view) {
        return C8279.m27530(view);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static Rect m27348() {
        if (f24714 == null) {
            f24714 = new ThreadLocal<>();
        }
        Rect rect = f24714.get();
        if (rect == null) {
            rect = new Rect();
            f24714.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static InterfaceC6558 m27349(@InterfaceC6391 View view) {
        return view instanceof InterfaceC6558 ? (InterfaceC6558) view : f24716;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m27350(@InterfaceC6391 View view) {
        return view.getFitsSystemWindows();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static int m27351(@InterfaceC6391 View view) {
        return view.getImportantForAccessibility();
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static int m27352(@InterfaceC6391 View view) {
        return C8282.m27554(view);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static int m27353(@InterfaceC6391 View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C8285.m4265(view);
        }
        return 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static int m27354(@InterfaceC6391 View view) {
        return view.getLabelFor();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static int m27355(View view) {
        return view.getLayerType();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static int m27356(@InterfaceC6391 View view) {
        return view.getLayoutDirection();
    }

    @InterfaceC6490
    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static Matrix m27357(View view) {
        return view.getMatrix();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static int m27358(View view) {
        return view.getMeasuredHeightAndState();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static int m27359(View view) {
        return view.getMeasuredState();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static int m27360(View view) {
        return view.getMeasuredWidthAndState();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static int m27361(@InterfaceC6391 View view) {
        return view.getMinimumHeight();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static int m27362(@InterfaceC6391 View view) {
        return view.getMinimumWidth();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static int m27363(@InterfaceC6391 View view) {
        return C8282.m27555(view);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static String[] m27364(@InterfaceC6391 View view) {
        return Build.VERSION.SDK_INT >= 31 ? C8286.m4267(view) : (String[]) view.getTag(C6989.C6992.f21070);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static int m27365(View view) {
        return view.getOverScrollMode();
    }

    @InterfaceC6844
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static int m27366(@InterfaceC6391 View view) {
        return view.getPaddingEnd();
    }

    @InterfaceC6844
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static int m27367(@InterfaceC6391 View view) {
        return view.getPaddingStart();
    }

    @InterfaceC6490
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static ViewParent m27368(@InterfaceC6391 View view) {
        return view.getParentForAccessibility();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static float m27369(View view) {
        return view.getPivotX();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static float m27370(View view) {
        return view.getPivotY();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static C8472 m27371(@InterfaceC6391 View view) {
        return C8280.m4255(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static float m27372(View view) {
        return view.getRotation();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static float m27373(View view) {
        return view.getRotationX();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static float m27374(View view) {
        return view.getRotationY();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static float m27375(View view) {
        return view.getScaleX();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static float m27376(View view) {
        return view.getScaleY();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static int m27377(@InterfaceC6391 View view) {
        return C8280.m4256(view);
    }

    @InterfaceC6490
    @InterfaceC8086
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static CharSequence m27378(@InterfaceC6391 View view) {
        return m27498().m27521(view);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static List<Rect> m27379(@InterfaceC6391 View view) {
        return Build.VERSION.SDK_INT >= 29 ? C8284.m27576(view) : Collections.emptyList();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static String m27380(@InterfaceC6391 View view) {
        return C8279.m27532(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static float m27381(View view) {
        return view.getTranslationX();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static float m27382(View view) {
        return view.getTranslationY();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static float m27383(@InterfaceC6391 View view) {
        return C8279.m27533(view);
    }

    @InterfaceC6490
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static C8514 m27384(@InterfaceC6391 View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C8285.m27580(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return C8436.m4422(window, view);
                }
                return null;
            }
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static int m27385(@InterfaceC6391 View view) {
        return view.getWindowSystemUiVisibility();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static float m27386(View view) {
        return view.getX();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static float m27387(View view) {
        return view.getY();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static float m27388(@InterfaceC6391 View view) {
        return C8279.m27534(view);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static boolean m27389(@InterfaceC6391 View view) {
        return m27333(view) != null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static boolean m27390(@InterfaceC6391 View view) {
        return C8282.m27556(view);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static boolean m27391(@InterfaceC6391 View view) {
        return C8279.m27535(view);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static boolean m27392(@InterfaceC6391 View view, int i) {
        if (view instanceof InterfaceC6363) {
            ((InterfaceC6363) view).hasNestedScrollingParent(i);
            return false;
        }
        if (i == 0) {
            return m27391(view);
        }
        return false;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static boolean m27393(@InterfaceC6391 View view) {
        return view.hasOnClickListeners();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static boolean m27394(@InterfaceC6391 View view) {
        return view.hasOverlappingRendering();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static boolean m27395(@InterfaceC6391 View view) {
        return view.hasTransientState();
    }

    @InterfaceC8086
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static boolean m27396(@InterfaceC6391 View view) {
        Boolean boolM27521 = m4246().m27521(view);
        return boolM27521 != null && boolM27521.booleanValue();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static boolean m27397(@InterfaceC6391 View view) {
        return view.isAttachedToWindow();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static boolean m27398(@InterfaceC6391 View view) {
        return C8282.m27557(view);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static boolean m27399(@InterfaceC6391 View view) {
        return C8279.m27536(view);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static boolean m27400(@InterfaceC6391 View view) {
        return C8282.m27558(view);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static boolean m27401(@InterfaceC6391 View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C8285.m27581(view);
        }
        return false;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static boolean m27402(@InterfaceC6391 View view) {
        return view.isInLayout();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static boolean m27403(@InterfaceC6391 View view) {
        return C8282.m27559(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static boolean m27404(@InterfaceC6391 View view) {
        return view.isLaidOut();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static boolean m27405(@InterfaceC6391 View view) {
        return view.isLayoutDirectionResolved();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static boolean m27406(@InterfaceC6391 View view) {
        return C8279.m27537(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static boolean m27407(View view) {
        return view.isOpaque();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public static boolean m27408(@InterfaceC6391 View view) {
        return view.isPaddingRelative();
    }

    @InterfaceC8086
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static boolean m27409(@InterfaceC6391 View view) {
        Boolean boolM27521 = m27438().m27521(view);
        return boolM27521 != null && boolM27521.booleanValue();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static void m27410(View view) {
        view.jumpDrawablesToCurrentState();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public static View m27411(@InterfaceC6391 View view, @InterfaceC6490 View view2, int i) {
        return C8282.m27560(view, view2, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public static /* synthetic */ C4152 m27412(C4152 c4152) {
        return c4152;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public static void m27413(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m27337(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(m27337(view));
                    m27458(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(m27337(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e(f3376, view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public static void m27414(@InterfaceC6391 View view, int i) {
        view.offsetLeftAndRight(i);
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static void m27415(@InterfaceC6391 View view, int i) {
        view.offsetTopAndBottom(i);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public static C8472 m27416(@InterfaceC6391 View view, @InterfaceC6391 C8472 c8472) {
        WindowInsets windowInsetsM28310 = c8472.m28310();
        if (windowInsetsM28310 != null) {
            WindowInsets windowInsetsM4252 = C8278.m4252(view, windowInsetsM28310);
            if (!windowInsetsM4252.equals(windowInsetsM28310)) {
                return C8472.m28277(windowInsetsM4252, view);
            }
        }
        return c8472;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public static void m27417(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public static void m27418(@InterfaceC6391 View view, @InterfaceC6391 C3055 c3055) {
        view.onInitializeAccessibilityNodeInfo(c3055.m6116());
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public static void m27419(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public static AbstractC8277<CharSequence> m27420() {
        return new C1471(C6989.C6992.f21067, CharSequence.class, 8, 28);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static boolean m27421(@InterfaceC6391 View view, int i, @InterfaceC6490 Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public static boolean m27422(@InterfaceC6391 View view, int i) {
        int iM2011 = C5250.m2011(i);
        if (iM2011 == -1) {
            return false;
        }
        return view.performHapticFeedback(iM2011);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public static boolean m27423(@InterfaceC6391 View view, int i, int i2) {
        int iM2011 = C5250.m2011(i);
        if (iM2011 == -1) {
            return false;
        }
        return view.performHapticFeedback(iM2011, i2);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public static C4152 m27424(@InterfaceC6391 View view, @InterfaceC6391 C4152 c4152) {
        if (Log.isLoggable(f3376, 3)) {
            Log.d(f3376, "performReceiveContent: " + c4152 + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C8286.m4268(view, c4152);
        }
        InterfaceC6557 interfaceC6557 = (InterfaceC6557) view.getTag(C6989.C6992.f21069);
        if (interfaceC6557 == null) {
            return m27349(view).onReceiveContent(c4152);
        }
        C4152 c4152Mo3019 = interfaceC6557.mo3019(view, c4152);
        if (c4152Mo3019 == null) {
            return null;
        }
        return m27349(view).onReceiveContent(c4152Mo3019);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public static void m27425(@InterfaceC6391 View view) {
        view.postInvalidateOnAnimation();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public static void m27426(@InterfaceC6391 View view, int i, int i2, int i3, int i4) {
        view.postInvalidateOnAnimation(i, i2, i3, i4);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public static void m27427(@InterfaceC6391 View view, @InterfaceC6391 Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @SuppressLint({"LambdaLast"})
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public static void m27428(@InterfaceC6391 View view, @InterfaceC6391 Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public static void m27429(@InterfaceC6391 View view, int i) {
        m27430(i, view);
        m27413(view, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public static void m27430(int i, View view) {
        List<C3055.C0034> listM27338 = m27338(view);
        for (int i2 = 0; i2 < listM27338.size(); i2++) {
            if (listM27338.get(i2).m121() == i) {
                listM27338.remove(i2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public static void m27431(@InterfaceC6391 View view, @InterfaceC6391 InterfaceC8292 interfaceC8292) {
        if (Build.VERSION.SDK_INT >= 28) {
            C8283.m27570(view, interfaceC8292);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(C6989.C6992.f21075);
        if (arrayList != null) {
            arrayList.remove(interfaceC8292);
            if (arrayList.size() == 0) {
                C8295.m27586(view);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static void m27432(@InterfaceC6391 View view, @InterfaceC6391 C3055.C0034 c0034, @InterfaceC6490 CharSequence charSequence, @InterfaceC6490 InterfaceC3070 interfaceC3070) {
        if (interfaceC3070 == null && charSequence == null) {
            m27429(view, c0034.m121());
        } else {
            m27305(view, c0034.m120(charSequence, interfaceC3070));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    public static void m27433(@InterfaceC6391 View view) {
        C8278.m27523(view);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۠۠ۥ, reason: contains not printable characters */
    public static <T extends View> T m27434(@InterfaceC6391 View view, @InterfaceC5411 int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) C8283.m27571(view, i);
        }
        T t = (T) view.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠۠ۦ, reason: contains not printable characters */
    public static int m27435(int i, int i2, int i3) {
        return View.resolveSizeAndState(i, i2, i3);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۧ, reason: contains not printable characters */
    public static boolean m27436(@InterfaceC6391 View view) {
        return C8282.m27561(view);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۨ, reason: contains not printable characters */
    public static void m27437(@InterfaceC6391 View view, @InterfaceC6391 @SuppressLint({"ContextFirst"}) Context context, @InterfaceC6391 int[] iArr, @InterfaceC6490 AttributeSet attributeSet, @InterfaceC6391 TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C8284.m27577(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ, reason: contains not printable characters */
    public static AbstractC8277<Boolean> m27438() {
        return new C1470(C6989.C6992.f21071, Boolean.class, 28);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ۟, reason: contains not printable characters */
    public static void m27439(@InterfaceC6391 View view, @InterfaceC6490 C3024 c3024) {
        if (c3024 == null && (m27333(view) instanceof C3024.C0029)) {
            c3024 = new C3024();
        }
        m27458(view);
        view.setAccessibilityDelegate(c3024 == null ? null : c3024.getBridge());
    }

    @InterfaceC8086
    /* JADX INFO: renamed from: ۥ۟۠ۡ۠, reason: contains not printable characters */
    public static void m27440(@InterfaceC6391 View view, boolean z) {
        m4246().m27522(view, Boolean.valueOf(z));
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠ۡۡ, reason: contains not printable characters */
    public static void m27441(@InterfaceC6391 View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    @InterfaceC8086
    /* JADX INFO: renamed from: ۥ۟۠ۡۢ, reason: contains not printable characters */
    public static void m27442(@InterfaceC6391 View view, @InterfaceC6490 CharSequence charSequence) {
        m27420().m27522(view, charSequence);
        if (charSequence != null) {
            f24717.m4247(view);
        } else {
            f24717.m27519(view);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static void m27443(View view, boolean z) {
        view.setActivated(z);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠ۡۤ, reason: contains not printable characters */
    public static void m27444(View view, @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f) {
        view.setAlpha(f);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۥ, reason: contains not printable characters */
    public static void m27445(@InterfaceC6391 View view, @InterfaceC6490 String... strArr) {
        C8282.m27562(view, strArr);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۦ, reason: contains not printable characters */
    public static void m27446(@InterfaceC6391 View view, @InterfaceC6490 C3502 c3502) {
        if (Build.VERSION.SDK_INT >= 28) {
            C8283.m27574(view, c3502);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠ۡۧ, reason: contains not printable characters */
    public static void m27447(@InterfaceC6391 View view, @InterfaceC6490 Drawable drawable) {
        view.setBackground(drawable);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۨ, reason: contains not printable characters */
    public static void m27448(@InterfaceC6391 View view, @InterfaceC6490 ColorStateList colorStateList) {
        C8279.m27538(view, colorStateList);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ, reason: contains not printable characters */
    public static void m27449(@InterfaceC6391 View view, @InterfaceC6490 PorterDuff.Mode mode) {
        C8279.m27539(view, mode);
    }

    @SuppressLint({"BanUncheckedReflection"})
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠ۢ۟, reason: contains not printable characters */
    public static void m27450(ViewGroup viewGroup, boolean z) {
        if (f24711 == null) {
            try {
                f24711 = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e) {
                Log.e(f3376, "Unable to find childrenDrawingOrderEnabled", e);
            }
            f24711.setAccessible(true);
        }
        try {
            f24711.invoke(viewGroup, Boolean.valueOf(z));
        } catch (IllegalAccessException e2) {
            Log.e(f3376, "Unable to invoke childrenDrawingOrderEnabled", e2);
        } catch (IllegalArgumentException e3) {
            Log.e(f3376, "Unable to invoke childrenDrawingOrderEnabled", e3);
        } catch (InvocationTargetException e4) {
            Log.e(f3376, "Unable to invoke childrenDrawingOrderEnabled", e4);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠ۢ۠, reason: contains not printable characters */
    public static void m27451(@InterfaceC6391 View view, @InterfaceC6490 Rect rect) {
        view.setClipBounds(rect);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۡ, reason: contains not printable characters */
    public static void m27452(@InterfaceC6391 View view, @InterfaceC6490 C4148 c4148) {
        if (Build.VERSION.SDK_INT >= 29) {
            C8284.m27578(view, c4148);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۢ, reason: contains not printable characters */
    public static void m27453(@InterfaceC6391 View view, float f) {
        C8279.m27540(view, f);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public static void m27454(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۤ, reason: contains not printable characters */
    public static void m27455(@InterfaceC6391 View view, boolean z) {
        C8282.m27563(view, z);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠ۢۥ, reason: contains not printable characters */
    public static void m27456(@InterfaceC6391 View view, boolean z) {
        view.setHasTransientState(z);
    }

    @InterfaceC8086
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠ۢۦ, reason: contains not printable characters */
    public static void m27457(@InterfaceC6391 View view, int i) {
        view.setImportantForAccessibility(i);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۧ, reason: contains not printable characters */
    public static void m27458(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۨ, reason: contains not printable characters */
    public static void m27459(@InterfaceC6391 View view, int i) {
        C8282.m27564(view, i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static void m27460(@InterfaceC6391 View view, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            C8285.m27582(view, i);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static void m27461(@InterfaceC6391 View view, boolean z) {
        C8282.m27565(view, z);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static void m27462(@InterfaceC6391 View view, @InterfaceC5411 int i) {
        view.setLabelFor(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static void m27463(@InterfaceC6391 View view, @InterfaceC6490 Paint paint) {
        view.setLayerPaint(paint);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public static void m27464(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣۣ۟۠, reason: contains not printable characters */
    public static void m27465(@InterfaceC6391 View view, int i) {
        view.setLayoutDirection(i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public static void m27466(@InterfaceC6391 View view, boolean z) {
        C8279.m27541(view, z);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۥ, reason: contains not printable characters */
    public static void m27467(@InterfaceC6391 View view, int i) {
        C8282.m27566(view, i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۦ, reason: contains not printable characters */
    public static void m27468(@InterfaceC6391 View view, @InterfaceC6490 InterfaceC6545 interfaceC6545) {
        C8279.m27542(view, interfaceC6545);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۧ, reason: contains not printable characters */
    public static void m27469(@InterfaceC6391 View view, @InterfaceC6490 String[] strArr, @InterfaceC6490 InterfaceC6557 interfaceC6557) {
        if (Build.VERSION.SDK_INT >= 31) {
            C8286.m27584(view, strArr, interfaceC6557);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z = false;
        if (interfaceC6557 != null) {
            C6740.m3227(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (strArr[i].startsWith(InterfaceC5949.f14892)) {
                    z = true;
                    break;
                }
                i++;
            }
            C6740.m3227(!z, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(C6989.C6992.f21070, strArr);
        view.setTag(C6989.C6992.f21069, interfaceC6557);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۠ۨ, reason: contains not printable characters */
    public static void m27470(View view, int i) {
        view.setOverScrollMode(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠ۤ, reason: contains not printable characters */
    public static void m27471(@InterfaceC6391 View view, @InterfaceC6844 int i, @InterfaceC6844 int i2, @InterfaceC6844 int i3, @InterfaceC6844 int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠ۤ۟, reason: contains not printable characters */
    public static void m27472(View view, float f) {
        view.setPivotX(f);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠ۤ۠, reason: contains not printable characters */
    public static void m27473(View view, float f) {
        view.setPivotY(f);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۡ, reason: contains not printable characters */
    public static void m27474(@InterfaceC6391 View view, @InterfaceC6490 C6699 c6699) {
        C8281.m27551(view, (PointerIcon) (c6699 != null ? c6699.m3179() : null));
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠ۤۢ, reason: contains not printable characters */
    public static void m27475(View view, float f) {
        view.setRotation(f);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public static void m27476(View view, float f) {
        view.setRotationX(f);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠ۤۤ, reason: contains not printable characters */
    public static void m27477(View view, float f) {
        view.setRotationY(f);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠ۤۥ, reason: contains not printable characters */
    public static void m27478(View view, boolean z) {
        view.setSaveFromParentEnabled(z);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠ۤۦ, reason: contains not printable characters */
    public static void m27479(View view, float f) {
        view.setScaleX(f);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠ۤۧ, reason: contains not printable characters */
    public static void m27480(View view, float f) {
        view.setScaleY(f);
    }

    @InterfaceC8086
    /* JADX INFO: renamed from: ۥ۟۠ۤۨ, reason: contains not printable characters */
    public static void m27481(@InterfaceC6391 View view, boolean z) {
        m27438().m27522(view, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥ, reason: contains not printable characters */
    public static void m27482(@InterfaceC6391 View view, int i) {
        C8280.m27548(view, i);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥ۟, reason: contains not printable characters */
    public static void m27483(@InterfaceC6391 View view, int i, int i2) {
        C8280.m27549(view, i, i2);
    }

    @InterfaceC8086
    /* JADX INFO: renamed from: ۥ۟۠ۥ۠, reason: contains not printable characters */
    public static void m27484(@InterfaceC6391 View view, @InterfaceC6490 CharSequence charSequence) {
        m27498().m27522(view, charSequence);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۡ, reason: contains not printable characters */
    public static void m27485(@InterfaceC6391 View view, @InterfaceC6391 List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            C8284.m27579(view, list);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۢ, reason: contains not printable characters */
    public static void m27486(@InterfaceC6391 View view, @InterfaceC6490 CharSequence charSequence) {
        C8282.m27567(view, charSequence);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۣ, reason: contains not printable characters */
    public static void m27487(@InterfaceC6391 View view, @InterfaceC6490 String str) {
        C8279.m27543(view, str);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠ۥۤ, reason: contains not printable characters */
    public static void m27488(View view, float f) {
        view.setTranslationX(f);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠ۥۥ, reason: contains not printable characters */
    public static void m27489(View view, float f) {
        view.setTranslationY(f);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۦ, reason: contains not printable characters */
    public static void m27490(@InterfaceC6391 View view, float f) {
        C8279.m27544(view, f);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۧ, reason: contains not printable characters */
    public static void m27491(@InterfaceC6391 View view, @InterfaceC6490 C8439.AbstractC1537 abstractC1537) {
        C8439.m28224(view, abstractC1537);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠ۥۨ, reason: contains not printable characters */
    public static void m27492(View view, float f) {
        view.setX(f);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠ۦ, reason: contains not printable characters */
    public static void m27493(View view, float f) {
        view.setY(f);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦ۟, reason: contains not printable characters */
    public static void m27494(@InterfaceC6391 View view, float f) {
        C8279.m27545(view, f);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦ۠, reason: contains not printable characters */
    public static boolean m27495(@InterfaceC6391 View view, @InterfaceC6490 ClipData clipData, @InterfaceC6391 View.DragShadowBuilder dragShadowBuilder, @InterfaceC6490 Object obj, int i) {
        return C8281.m27552(view, clipData, dragShadowBuilder, obj, i);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۡ, reason: contains not printable characters */
    public static boolean m27496(@InterfaceC6391 View view, int i) {
        return C8279.m27546(view, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۠ۦۢ, reason: contains not printable characters */
    public static boolean m27497(@InterfaceC6391 View view, int i, int i2) {
        if (view instanceof InterfaceC6363) {
            return ((InterfaceC6363) view).startNestedScroll(i, i2);
        }
        if (i2 == 0) {
            return m27496(view, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۣ, reason: contains not printable characters */
    public static AbstractC8277<CharSequence> m27498() {
        return new C8274(C6989.C6992.f21072, CharSequence.class, 64, 30);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۤ, reason: contains not printable characters */
    public static void m27499(@InterfaceC6391 View view) {
        C8279.m27547(view);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۠ۦۥ, reason: contains not printable characters */
    public static void m27500(@InterfaceC6391 View view, int i) {
        if (view instanceof InterfaceC6363) {
            ((InterfaceC6363) view).stopNestedScroll(i);
        } else if (i == 0) {
            m27499(view);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۦ, reason: contains not printable characters */
    public static void m27501(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۧ, reason: contains not printable characters */
    public static void m27502(@InterfaceC6391 View view, @InterfaceC6391 View.DragShadowBuilder dragShadowBuilder) {
        C8281.m27553(view, dragShadowBuilder);
    }
}
