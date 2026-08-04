package yyds;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛸᛵᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1784 extends AbstractC0145 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static final ConcurrentHashMap.KeySetView f8990;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final ConcurrentHashMap.KeySetView f8991;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static final ConcurrentHashMap.KeySetView f8992;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public static volatile boolean f8993;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final ConcurrentHashMap.KeySetView f8994;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public static final AtomicLong f8995;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public static final Map f8996;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static final Map f8997;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static final Map f8998;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public static final Handler f8999;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public static final Map f9000;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static final Map f9001;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final ConcurrentHashMap.KeySetView f9002;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public static final Map f9003;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public static final Map f9004;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final ConcurrentHashMap.KeySetView f9005;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final ConcurrentHashMap.KeySetView f9006;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public static final C0078 f9007;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final ConcurrentHashMap.KeySetView f9008;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static final Map f9009;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static final Map f9010;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C1784 f9011;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public static final ConcurrentHashMap.KeySetView f9012;

    static {
        AbstractC2328.m4341(-1010364859450222L);
        AbstractC2328.m4341(-1010635442389870L);
        AbstractC2328.m4341(-1010893140427630L);
        AbstractC2328.m4341(-1011155133432686L);
        f9011 = new C1784();
        f9002 = ConcurrentHashMap.newKeySet();
        f8991 = ConcurrentHashMap.newKeySet();
        f8994 = ConcurrentHashMap.newKeySet();
        f9008 = ConcurrentHashMap.newKeySet();
        f9005 = ConcurrentHashMap.newKeySet();
        f9006 = ConcurrentHashMap.newKeySet();
        f8992 = ConcurrentHashMap.newKeySet();
        f8990 = ConcurrentHashMap.newKeySet();
        f8997 = AbstractC0897.m1993();
        f9010 = AbstractC0897.m1993();
        f9001 = AbstractC0897.m1993();
        f8998 = AbstractC0897.m1993();
        f9009 = AbstractC0897.m1993();
        f8996 = AbstractC0897.m1993();
        f9004 = AbstractC0897.m1993();
        f9003 = AbstractC0897.m1993();
        f9000 = AbstractC0897.m1993();
        f8995 = new AtomicLong();
        f9012 = ConcurrentHashMap.newKeySet();
        f8999 = new Handler(Looper.getMainLooper());
        f9007 = new C0078(new C2307(16));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair m3541(View view, EnumC2097 enumC2097) {
        View viewM3544;
        if (enumC2097 == EnumC2097.f10386 && (view instanceof ViewGroup)) {
            C0172 c0172 = new C0172();
            viewM3544 = m3544(c0172, (ViewGroup) view);
            if (viewM3544 == null) {
                viewM3544 = (ImageView) c0172.f997;
            }
            if (viewM3544 == null) {
            }
        } else {
            viewM3544 = view;
        }
        int iM748 = AbstractC0181.m748(36.0f * view.getResources().getDisplayMetrics().density);
        if (iM748 < 1) {
            iM748 = 1;
        }
        Integer numM3550 = m3550(viewM3544, true);
        int iIntValue = (numM3550 == null && (numM3550 = m3550(view, true)) == null) ? iM748 : numM3550.intValue();
        Integer numM35502 = m3550(viewM3544, false);
        if (numM35502 != null) {
            iM748 = numM35502.intValue();
        } else {
            Integer numM35503 = m3550(view, false);
            if (numM35503 != null) {
                iM748 = numM35503.intValue();
            }
        }
        if (iIntValue < 1) {
            iIntValue = 1;
        }
        return new Pair(Integer.valueOf(iIntValue), Integer.valueOf(iM748 >= 1 ? iM748 : 1));
    }

    /* JADX INFO: renamed from: ᛱᲀᲈᛲ, reason: contains not printable characters */
    public static void m3542(Class cls, EnumC2097 enumC2097, String str, String str2) {
        Object c2658;
        Object c26582;
        String name = cls.getName();
        ConcurrentHashMap.KeySetView keySetView = f9002;
        if (keySetView.add(name)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C0025 c0025 = new C0025((C2722) AbstractC1529.m3159(cls, new C1756(3)));
            while (true) {
                if (c0025.hasNext()) {
                    try {
                        c26582 = ((Class) c0025.next()).getDeclaredMethods();
                    } catch (Throwable th) {
                        c26582 = new C2658(th);
                    }
                    Method[] methodArr = new Method[0];
                    if (c26582 instanceof C2658) {
                        c26582 = methodArr;
                    }
                    AbstractC2328.m4341(-1001207989175150L);
                    ArrayList<Method> arrayList = new ArrayList();
                    for (Object obj : (Object[]) c26582) {
                        if (!Modifier.isAbstract(((Method) obj).getModifiers())) {
                            arrayList.add(obj);
                        }
                    }
                    for (Method method : arrayList) {
                        linkedHashMap.putIfAbsent(method.toGenericString(), method);
                    }
                } else {
                    try {
                        break;
                    } catch (Throwable th2) {
                        c2658 = new C2658(th2);
                    }
                }
            }
            c2658 = cls.getMethods();
            Method[] methodArr2 = new Method[0];
            if (c2658 instanceof C2658) {
                c2658 = methodArr2;
            }
            AbstractC2328.m4341(-1001285298586478L);
            ArrayList<Method> arrayList2 = new ArrayList();
            for (Object obj2 : (Object[]) c2658) {
                if (!Modifier.isAbstract(((Method) obj2).getModifiers())) {
                    arrayList2.add(obj2);
                }
            }
            for (Method method2 : arrayList2) {
                linkedHashMap.putIfAbsent(method2.toGenericString(), method2);
            }
            boolean z = false;
            for (Method method3 : new ArrayList(linkedHashMap.values())) {
                Class<?>[] parameterTypes = method3.getParameterTypes();
                boolean z2 = str != null && AbstractC1544.m3188(method3.getName(), str) && Arrays.equals(parameterTypes, new Class[]{ViewGroup.class}) && ViewGroup.class.isAssignableFrom(method3.getReturnType());
                boolean z3 = str2 != null && AbstractC1544.m3188(method3.getName(), str2) && parameterTypes.length == 3 && AbstractC1544.m3188(parameterTypes[1], Context.class) && ViewGroup.class.isAssignableFrom(parameterTypes[2]) && View.class.isAssignableFrom(method3.getReturnType());
                if (z2 || z3) {
                    if (f8991.add(method3.toGenericString())) {
                        f9011.m673(method3, null, new C2001(enumC2097, 5, name));
                    }
                    z = true;
                }
            }
            if (z) {
                return;
            }
            keySetView.remove(name);
            C2336.f11496.m4354(AbstractC2328.m4341(-1001083435123566L) + name + AbstractC2328.m4341(-1001152154600302L));
        }
    }

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public static void m3543(ViewGroup viewGroup) {
        C1628 c1628;
        Map map = f9010;
        AbstractC2328.m4341(-1001740565119854L);
        synchronized (map) {
            C1952 c1952 = (C1952) map.remove(viewGroup);
            if (c1952 != null) {
                f9011.getClass();
                m3564(viewGroup, c1952);
            }
        }
        Map map2 = f9001;
        AbstractC2328.m4341(-1001796399694702L);
        synchronized (map2) {
            WeakReference weakReference = (WeakReference) map2.remove(viewGroup);
            c1628 = weakReference != null ? (C1628) weakReference.get() : null;
        }
        if (c1628 != null) {
            m3546(c1628);
        }
    }

    /* JADX INFO: renamed from: ᛲᲀᛲᛲ, reason: contains not printable characters */
    public static final ImageView m3544(C0172 c0172, ViewGroup viewGroup) {
        ImageView imageViewM3544;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof C1628)) {
                if (childAt instanceof ImageView) {
                    if (c0172.f997 == null) {
                        c0172.f997 = childAt;
                    }
                    ImageView imageView = (ImageView) childAt;
                    if (imageView.getVisibility() == 0) {
                        return imageView;
                    }
                } else if ((childAt instanceof ViewGroup) && (imageViewM3544 = m3544(c0172, (ViewGroup) childAt)) != null) {
                    return imageViewM3544;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public static ImageView m3545(ViewGroup viewGroup, InterfaceC1549 interfaceC1549) {
        ImageView imageViewM3545;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof ImageView) && !(childAt instanceof C1628) && ((Boolean) interfaceC1549.mo371(childAt)).booleanValue()) {
                return (ImageView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (imageViewM3545 = m3545((ViewGroup) childAt, interfaceC1549)) != null) {
                return imageViewM3545;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛳᛴᲇᛶ, reason: contains not printable characters */
    public static void m3546(C1628 c1628) {
        C2535 c2535M3329 = c1628.m3329();
        m3557(c1628);
        ViewOnAttachStateChangeListenerC1310 viewOnAttachStateChangeListenerC1310 = c2535M3329.f12481;
        View view = (View) viewOnAttachStateChangeListenerC1310.f5997.get();
        if (view != null) {
            view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1310);
        }
        ViewTreeObserver viewTreeObserver = viewOnAttachStateChangeListenerC1310.f5996;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(viewOnAttachStateChangeListenerC1310);
        }
        viewOnAttachStateChangeListenerC1310.f5996 = null;
        viewOnAttachStateChangeListenerC1310.m2599();
        View view2 = (View) c2535M3329.f12488.get();
        if (view2 != null) {
            Map map = f8998;
            AbstractC2328.m4341(-1007341202473838L);
            synchronized (map) {
                try {
                    WeakReference weakReference = (WeakReference) map.get(view2);
                    if ((weakReference != null ? (C1628) weakReference.get() : null) == c1628) {
                        map.remove(view2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Map map2 = f9009;
            AbstractC2328.m4341(-1007422806852462L);
            synchronized (map2) {
            }
            Map map3 = f8996;
            AbstractC2328.m4341(-1007508706198382L);
            synchronized (map3) {
            }
        }
        Map map4 = f9001;
        AbstractC2328.m4341(-1007620375348078L);
        synchronized (map4) {
            Iterator it = map4.entrySet().iterator();
            while (it.hasNext()) {
                if (((WeakReference) ((Map.Entry) it.next()).getValue()).get() == c1628) {
                    it.remove();
                }
            }
        }
        ViewParent parent = c1628.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(c1628);
        }
        c1628.setImageDrawable(null);
    }

    /* JADX INFO: renamed from: ᛳᛷᛶᛲ, reason: contains not printable characters */
    public static boolean m3547(EnumC2097 enumC2097) {
        int iOrdinal = enumC2097.ordinal();
        if (iOrdinal == 0) {
            C0561 c0561 = C0561.f2672;
            EnumC0868[] enumC0868Arr = {EnumC0868.f3983, EnumC0868.f3979};
            AbstractC2328.m4341(-544262123586414L);
            for (int i = 0; i < 2; i++) {
                if (C0561.m1408(enumC0868Arr[i])) {
                    return true;
                }
            }
            return false;
        }
        if (iOrdinal != 1) {
            C0188.m801();
            return false;
        }
        C0561 c05612 = C0561.f2672;
        EnumC0868[] enumC0868Arr2 = {EnumC0868.f3977, EnumC0868.f3982};
        AbstractC2328.m4341(-544262123586414L);
        for (int i2 = 0; i2 < 2; i2++) {
            if (C0561.m1408(enumC0868Arr2[i2])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛴᛸᛴᛸ, reason: contains not printable characters */
    public static boolean m3548(View view, ImageView imageView) {
        if (view == imageView) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                AbstractC2328.m4341(-1007646145151854L);
                if (m3548(childAt, imageView)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛴᛸᲁᛵ, reason: contains not printable characters */
    public static void m3549(View view, C1628 c1628) {
        if (!c1628.m3329().f12489 || c1628.getParent() != view.getParent()) {
            c1628.setVisibility(8);
            return;
        }
        Pair pairM3541 = m3541(view, c1628.m3329().f12483);
        int iIntValue = ((Number) pairM3541.component1()).intValue();
        int iIntValue2 = ((Number) pairM3541.component2()).intValue();
        ViewGroup.LayoutParams layoutParams = c1628.getLayoutParams();
        if (layoutParams != null && (layoutParams.width != iIntValue || layoutParams.height != iIntValue2)) {
            layoutParams.width = iIntValue;
            layoutParams.height = iIntValue2;
            c1628.setLayoutParams(layoutParams);
        }
        EnumC2097 enumC2097 = c1628.m3329().f12483;
        EnumC2097 enumC20972 = EnumC2097.f10387;
        if (enumC2097 == enumC20972) {
            Pair pairM35412 = m3541(view, enumC20972);
            int iIntValue3 = ((Number) pairM35412.component1()).intValue();
            int iIntValue4 = ((Number) pairM35412.component2()).intValue();
            int iM748 = AbstractC0181.m748(36.0f * view.getResources().getDisplayMetrics().density);
            if (iM748 < 1) {
                iM748 = 1;
            }
            int i = iIntValue3 - iM748;
            if (i < 0) {
                i = 0;
            }
            int i2 = iIntValue4 - iM748;
            int i3 = i2 >= 0 ? i2 : 0;
            int i4 = i / 2;
            int i5 = i - i4;
            int i6 = i3 / 2;
            int i7 = i3 - i6;
            if (c1628.getPaddingLeft() != i4 || c1628.getPaddingTop() != i6 || c1628.getPaddingRight() != i5 || c1628.getPaddingBottom() != i7) {
                c1628.setPadding(i4, i6, i5, i7);
            }
        } else if (c1628.getPaddingLeft() != 0 || c1628.getPaddingTop() != 0 || c1628.getPaddingRight() != 0 || c1628.getPaddingBottom() != 0) {
            c1628.setPadding(0, 0, 0, 0);
        }
        c1628.setVisibility(view.getVisibility());
        c1628.setAlpha(view.getAlpha());
        c1628.setTranslationX(view.getTranslationX());
        c1628.setTranslationY(view.getTranslationY());
        c1628.setTranslationZ(view.getTranslationZ());
        c1628.setScaleX(view.getScaleX() * c1628.f8312);
        c1628.setScaleY(view.getScaleY() * c1628.f8312);
        c1628.setRotation(view.getRotation());
        c1628.setRotationX(view.getRotationX());
        c1628.setRotationY(view.getRotationY());
        c1628.setElevation(view.getElevation());
        c1628.setLayoutDirection(view.getLayoutDirection());
        c1628.setSelected(view.isSelected());
        c1628.setActivated(view.isActivated());
        int width = view.getWidth();
        Integer numValueOf = Integer.valueOf(width);
        if (width <= 0) {
            numValueOf = null;
        }
        int height = view.getHeight();
        Integer numValueOf2 = height > 0 ? Integer.valueOf(height) : null;
        if (numValueOf != null && c1628.getWidth() > 0) {
            c1628.setPivotX((view.getPivotX() / numValueOf.intValue()) * c1628.getWidth());
        }
        if (numValueOf2 == null || c1628.getHeight() <= 0) {
            return;
        }
        c1628.setPivotY((view.getPivotY() / numValueOf2.intValue()) * c1628.getHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* JADX INFO: renamed from: ᛵᛲᛵᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Integer m3550(View view, boolean z) {
        Integer numValueOf;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            numValueOf = null;
        } else {
            int i = z ? layoutParams.width : layoutParams.height;
            numValueOf = Integer.valueOf(i);
            if (i <= 0) {
            }
        }
        if (numValueOf != null) {
            return numValueOf;
        }
        int measuredWidth = z ? view.getMeasuredWidth() : view.getMeasuredHeight();
        if (measuredWidth > 0) {
            return Integer.valueOf(measuredWidth);
        }
        int width = z ? view.getWidth() : view.getHeight();
        if (width > 0) {
            return Integer.valueOf(width);
        }
        int minimumWidth = z ? view.getMinimumWidth() : view.getMinimumHeight();
        Integer numValueOf2 = Integer.valueOf(minimumWidth);
        if (minimumWidth > 0) {
            return numValueOf2;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛵᲈᲇᛵ, reason: contains not printable characters */
    public static boolean m3551(Float f) {
        return f != null && Math.abs(f.floatValue()) <= Float.MAX_VALUE && f.floatValue() > 0.0f && f.floatValue() < 100000.0f;
    }

    /* JADX INFO: renamed from: ᛶᛴᛱᛲ, reason: contains not printable characters */
    public static void m3552(Iterable iterable, String str, String str2, boolean z) {
        if (iterable != null) {
            for (Object obj : iterable) {
                if (obj != null) {
                    C1784 c1784 = f9011;
                    if (z) {
                        String strM4341 = AbstractC2328.m4341(-1000812852183918L);
                        c1784.getClass();
                        Object objM671 = AbstractC0145.m671(obj, strM4341);
                        if (objM671 != null) {
                            obj = objM671;
                        }
                    }
                    c1784.getClass();
                    EnumC2097 enumC2097M3565 = m3565(obj);
                    if (enumC2097M3565 != null) {
                        m3542(obj.getClass(), enumC2097M3565, str, str2);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᛵᛸᛲ, reason: contains not printable characters */
    public static void m3553(C1628 c1628, String str) {
        C2535 c2535M3329 = c1628.m3329();
        if (AbstractC1544.m3188(c2535M3329.f12479, str)) {
            return;
        }
        m3557(c1628);
        c2535M3329.f12479 = str;
        c2535M3329.f12480 = false;
        c2535M3329.f12490 = null;
        EnumC1796 enumC1796 = EnumC1796.f9062;
        AbstractC2328.m4341(-999580196569966L);
        c2535M3329.f12485 = enumC1796;
        m3560(c1628, false);
        c1628.m3329().f12487 = true;
        c1628.post(new RunnableC2696(c1628, 4, str));
    }

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public static View m3554(ViewGroup viewGroup) {
        if (m3563(viewGroup.getClass(), new C0951(28)) != null && m3545(viewGroup, new C0951(29)) != null) {
            return viewGroup;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof C1628) && (childAt instanceof ViewGroup)) {
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                if (m3563(viewGroup2.getClass(), new C0951(28)) != null && m3545(viewGroup2, new C0951(29)) != null) {
                    return childAt;
                }
                View viewM3554 = m3554(viewGroup2);
                if (viewM3554 != null) {
                    return viewM3554;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    public static C1628 m3555(View view) {
        C1628 c1628;
        Map map = f8998;
        AbstractC2328.m4341(-1007259598095214L);
        synchronized (map) {
            try {
                WeakReference weakReference = (WeakReference) map.get(view);
                c1628 = null;
                C1628 c16282 = weakReference != null ? (C1628) weakReference.get() : null;
                if (c16282 == null || c16282.m3329().f12488.get() != view) {
                    map.remove(view);
                } else {
                    c1628 = c16282;
                }
            } finally {
            }
        }
        return c1628;
    }

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public static Class m3556(Class cls) {
        return cls.equals(Float.TYPE) ? Float.class : cls.equals(Double.TYPE) ? Double.class : cls.equals(Integer.TYPE) ? Integer.class : cls.equals(Long.TYPE) ? Long.class : cls;
    }

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public static void m3557(C1628 c1628) {
        C2535 c2535M3329 = c1628.m3329();
        ValueAnimator valueAnimator = c2535M3329.f12486;
        c2535M3329.f12486 = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c1628.f8312 = 1.0f;
        View view = (View) c2535M3329.f12488.get();
        if (view != null) {
            f9011.getClass();
            m3549(view, c1628);
        }
    }

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public static void m3558(ViewGroup viewGroup, C1628 c1628) {
        ViewGroup viewGroup2 = (ViewGroup) c1628.m3329().f12482.get();
        if (viewGroup2 != null && viewGroup2 != viewGroup) {
            Map map = f9001;
            AbstractC2328.m4341(-1002466414592878L);
            synchronized (map) {
                try {
                    WeakReference weakReference = (WeakReference) map.get(viewGroup2);
                    if ((weakReference != null ? (C1628) weakReference.get() : null) == c1628) {
                        map.remove(viewGroup2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Map map2 = f9010;
            AbstractC2328.m4341(-1002492184396654L);
            synchronized (map2) {
                C1952 c1952 = (C1952) map2.remove(viewGroup2);
                if (c1952 != null) {
                    f9011.getClass();
                    m3564(viewGroup2, c1952);
                }
            }
            Map map3 = f8997;
            AbstractC2328.m4341(-1002548018971502L);
            synchronized (map3) {
                if (map3.get(viewGroup2) == c1628.m3329().f12483) {
                    map3.remove(viewGroup2);
                }
            }
        }
        C2535 c2535M3329 = c1628.m3329();
        WeakReference weakReference2 = new WeakReference(viewGroup);
        c2535M3329.getClass();
        AbstractC2328.m4341(-999545836831598L);
        c2535M3329.f12482 = weakReference2;
        Map map4 = f9001;
        AbstractC2328.m4341(-1002595263611758L);
        synchronized (map4) {
            AbstractC2328.m4341(-1002621033415534L);
            map4.put(viewGroup, new WeakReference(c1628));
        }
        Map map5 = f8997;
        AbstractC2328.m4341(-1002646803219310L);
        synchronized (map5) {
            AbstractC2328.m4341(-1002694047859566L);
            map5.put(viewGroup, c1628.m3329().f12483);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0188  */
    /* JADX INFO: renamed from: ᛸᲀᛷᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0804 m3559(View view, boolean z) {
        Object c2658;
        C0804 c0804;
        Object c26582;
        boolean z2;
        Method method;
        Object c26583;
        Float f;
        Method method2;
        Method method3;
        int i = 0;
        try {
            Method[] methods = view.getClass().getMethods();
            AbstractC2328.m4341(-1003557336286062L);
            int length = methods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method3 = null;
                    break;
                }
                method3 = methods[i2];
                if (AbstractC1544.m3188(method3.getName(), AbstractC2328.m4341(-1003626055762798L)) && method3.getParameterCount() == 0) {
                    break;
                }
                i2++;
            }
            c2658 = method3 == null ? null : method3.invoke(view, null);
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        if (c2658 instanceof C2658) {
            c2658 = null;
        }
        if (c2658 == null) {
            return null;
        }
        Map map = f9009;
        AbstractC2328.m4341(-1003385537594222L);
        synchronized (map) {
            try {
                c0804 = (C0804) map.get(view);
                if ((c0804 != null ? c0804.f3687.get() : null) != c2658) {
                    c0804 = new C0804(new WeakReference(c2658));
                    AbstractC2328.m4341(-1003471436940142L);
                    map.put(view, c0804);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Float f2 = c0804.f3688;
        if (f2 == null) {
            try {
                Method[] methods2 = c2658.getClass().getMethods();
                AbstractC2328.m4341(-1003690480272238L);
                int length2 = methods2.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        method = null;
                        break;
                    }
                    method = methods2[i3];
                    if (AbstractC1544.m3188(method.getName(), AbstractC2328.m4341(-1003759199748974L)) && method.getParameterCount() == 0) {
                        Class<?> returnType = method.getReturnType();
                        AbstractC2328.m4341(-1003810739356526L);
                        if (Number.class.isAssignableFrom(m3556(returnType))) {
                            break;
                        }
                    }
                    i3++;
                }
            } catch (Throwable th3) {
                c26582 = new C2658(th3);
            }
            if (method != null) {
                Object objInvoke = method.invoke(c2658, null);
                Number number = objInvoke instanceof Number ? (Number) objInvoke : null;
                if (number != null) {
                    Float fValueOf = Float.valueOf(number.floatValue());
                    boolean zM3551 = m3551(fValueOf);
                    c26582 = fValueOf;
                    if (!zM3551) {
                    }
                    z2 = c26582 instanceof C2658;
                    Object obj = c26582;
                    if (z2) {
                        obj = null;
                    }
                    f2 = (Float) obj;
                    c0804.f3688 = f2;
                }
            }
            c26582 = null;
            z2 = c26582 instanceof C2658;
            Object obj2 = c26582;
            if (z2) {
            }
            f2 = (Float) obj2;
            c0804.f3688 = f2;
        }
        if (z && !c0804.f3689) {
            c0804.f3689 = true;
            if (f2 == null) {
                try {
                    Method[] methods3 = view.getClass().getMethods();
                    AbstractC2328.m4341(-1003892343735150L);
                    int length3 = methods3.length;
                    while (true) {
                        if (i >= length3) {
                            method2 = null;
                            break;
                        }
                        method2 = methods3[i];
                        if (AbstractC1544.m3188(method2.getName(), AbstractC2328.m4341(-1003961063211886L)) && method2.getParameterCount() == 0) {
                            Class<?> returnType2 = method2.getReturnType();
                            AbstractC2328.m4341(-1004012602819438L);
                            if (Number.class.isAssignableFrom(m3556(returnType2))) {
                                break;
                            }
                        }
                        i++;
                    }
                } catch (Throwable th4) {
                    c26583 = new C2658(th4);
                }
                if (method2 == null) {
                    c26583 = null;
                    f = (Float) (c26583 instanceof C2658 ? null : c26583);
                    if (m3551(f)) {
                        c0804.f3688 = f;
                    }
                } else {
                    Object objInvoke2 = method2.invoke(view, null);
                    Number number2 = objInvoke2 instanceof Number ? (Number) objInvoke2 : null;
                    if (number2 != null) {
                        c26583 = Float.valueOf(number2.floatValue());
                    }
                    f = (Float) (c26583 instanceof C2658 ? null : c26583);
                    if (m3551(f)) {
                    }
                }
            }
        }
        return c0804;
    }

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public static void m3560(C1628 c1628, boolean z) {
        EnumC0868 enumC0868;
        Object c2658;
        C2535 c2535M3329 = c1628.m3329();
        WeakReference weakReference = c2535M3329.f12488;
        ViewOnAttachStateChangeListenerC1310 viewOnAttachStateChangeListenerC1310 = c2535M3329.f12481;
        View view = (View) weakReference.get();
        if (view == null) {
            return;
        }
        Boolean bool = c2535M3329.f12490;
        if (bool == null) {
            c2535M3329.f12489 = false;
            c2535M3329.f12484 = null;
            c1628.setVisibility(8);
            viewOnAttachStateChangeListenerC1310.m2601();
            return;
        }
        int iOrdinal = c2535M3329.f12483.ordinal();
        if (iOrdinal == 0) {
            enumC0868 = bool.booleanValue() ? EnumC0868.f3979 : EnumC0868.f3983;
        } else {
            if (iOrdinal != 1) {
                C0188.m801();
                return;
            }
            enumC0868 = bool.booleanValue() ? EnumC0868.f3982 : EnumC0868.f3977;
        }
        C0561 c0561 = C0561.f2672;
        if (!C0561.m1408(enumC0868)) {
            c2535M3329.f12489 = false;
            c2535M3329.f12484 = null;
            c1628.setImageDrawable(null);
            c1628.setVisibility(8);
            viewOnAttachStateChangeListenerC1310.m2601();
            return;
        }
        if (z || c2535M3329.f12484 != enumC0868 || c1628.getDrawable() == null) {
            try {
                Resources resources = view.getResources();
                AbstractC2328.m4341(-1006825806398318L);
                c2658 = C0561.m1411(resources, enumC0868);
            } catch (Throwable th) {
                c2658 = new C2658(th);
            }
            Throwable thM4249 = C2248.m4249(c2658);
            if (thM4249 != null) {
                C2336.f11496.m4355(AbstractC2328.m4341(-1006903115809646L) + enumC0868, thM4249);
            }
            if (c2658 instanceof C2658) {
                c2658 = null;
            }
            Drawable drawable = (Drawable) c2658;
            if (drawable == null) {
                c2535M3329.f12489 = false;
                c2535M3329.f12484 = null;
                c1628.setImageDrawable(null);
                c1628.setVisibility(8);
                viewOnAttachStateChangeListenerC1310.m2601();
                return;
            }
            c1628.setImageDrawable(drawable);
        }
        c2535M3329.f12484 = enumC0868;
        c2535M3329.f12489 = true;
        m3549(view, c1628);
        viewOnAttachStateChangeListenerC1310.m2601();
    }

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public static ImageView m3561(Object obj, Class cls) {
        Method method;
        Object c2658;
        View view;
        ImageView imageViewM3545;
        Method[] methods = cls.getMethods();
        AbstractC2328.m4341(-1006606763066222L);
        int length = methods.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = methods[i];
            if (method.getParameterCount() == 0 && View.class.isAssignableFrom(method.getReturnType())) {
                break;
            }
            i++;
        }
        if (method == null) {
            view = null;
        } else {
            try {
                Object objInvoke = method.invoke(obj, null);
                c2658 = objInvoke instanceof View ? (View) objInvoke : null;
            } catch (Throwable th) {
                c2658 = new C2658(th);
            }
            if (c2658 instanceof C2658) {
                c2658 = null;
            }
            view = (View) c2658;
        }
        if (view != null) {
            if (view instanceof ImageView) {
                imageViewM3545 = (ImageView) view;
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                ImageView imageViewM35452 = m3545(viewGroup, new C0951(26));
                imageViewM3545 = imageViewM35452 != null ? imageViewM35452 : m3545(viewGroup, new C0951(27));
            } else {
                imageViewM3545 = null;
            }
            if (imageViewM3545 != null) {
                Map map = f8996;
                AbstractC2328.m4341(-1005958223004526L);
                synchronized (map) {
                    AbstractC2328.m4341(-1006069892154222L);
                    map.put(imageViewM3545, new WeakReference(obj));
                }
                return imageViewM3545;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᲀᛸᲈᲁ, reason: contains not printable characters */
    public static void m3562(final C1628 c1628, boolean z, boolean z2, boolean z3, boolean z4) {
        C2535 c2535M3329 = c1628.m3329();
        Boolean bool = c2535M3329.f12490;
        boolean z5 = c2535M3329.f12480;
        boolean zM3188 = AbstractC1544.m3188(bool, Boolean.valueOf(z));
        c2535M3329.f12490 = Boolean.valueOf(z);
        if (z2) {
            c2535M3329.f12480 = true;
        }
        m3560(c1628, z4 || (!zM3188 && c2535M3329.f12484 == null));
        if (!z3 || !z2 || !z5 || c2535M3329.f12487 || bool == null || bool.equals(Boolean.valueOf(z)) || !c2535M3329.f12489) {
            if (c2535M3329.f12489) {
                return;
            }
            m3557(c1628);
            return;
        }
        m3557(c1628);
        final C2535 c2535M33292 = c1628.m3329();
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.82f, 1.0f);
        valueAnimatorOfFloat.setDuration(220L);
        valueAnimatorOfFloat.setInterpolator(new OvershootInterpolator(1.8f));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yyds.ᲈᲁᛲᲁ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AbstractC2328.m4341(-1009926772786030L);
                C2535 c2535 = c2535M33292;
                if (c2535.f12486 != valueAnimatorOfFloat) {
                    return;
                }
                Object animatedValue = valueAnimator.getAnimatedValue();
                AbstractC2328.m4341(-1009939657687918L);
                float fFloatValue = ((Float) animatedValue).floatValue();
                C1628 c16282 = c1628;
                c16282.f8312 = fFloatValue;
                View view = (View) c2535.f12488.get();
                if (view != null) {
                    C1784.f9011.getClass();
                    C1784.m3549(view, c16282);
                }
            }
        });
        valueAnimatorOfFloat.addListener(new C0267(c2535M33292, 1, c1628));
        c2535M33292.f12486 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Method m3563(Class cls, InterfaceC1549 interfaceC1549) {
        while (true) {
            Method method = null;
            if (cls == null || cls.equals(View.class) || cls.equals(Object.class)) {
                break;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            AbstractC2328.m4341(-1007714864628590L);
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Method method2 = declaredMethods[i];
                if (((Boolean) interfaceC1549.mo371(method2)).booleanValue()) {
                    method = method2;
                    break;
                }
                i++;
            }
            if (method != null) {
                return method;
            }
            cls = cls.getSuperclass();
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲈᲀ, reason: contains not printable characters */
    public static void m3564(ViewGroup viewGroup, C1952 c1952) {
        synchronized (c1952) {
            c1952.f9802 = false;
            c1952.f9806 = 0;
        }
        viewGroup.removeOnLayoutChangeListener(c1952.f9804);
        viewGroup.removeOnAttachStateChangeListener(c1952.f9805);
    }

    /* JADX INFO: renamed from: ᲈᛳ */
    public static void m8(final View view, final float f, boolean z) {
        C1628 c1628M3555 = m3555(view);
        if (c1628M3555 == null || c1628M3555.m3329().f12485 == EnumC1796.f9060) {
            return;
        }
        C0804 c0804M3559 = m3559(view, false);
        Float f2 = c0804M3559 != null ? c0804M3559.f3688 : null;
        if (f2 == null) {
            if (z) {
                view.post(new Runnable() { // from class: yyds.ᲇᲇᛸᛲ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1784.f9011.getClass();
                        C1784.m8(view, f, false);
                    }
                });
                return;
            }
            return;
        }
        boolean z2 = f < f2.floatValue() - 0.5f;
        C2535 c2535M3329 = c1628M3555.m3329();
        EnumC1796 enumC1796 = EnumC1796.f9063;
        c2535M3329.getClass();
        AbstractC2328.m4341(-999580196569966L);
        c2535M3329.f12485 = enumC1796;
        m3562(c1628M3555, z2, true, true, false);
    }

    /* JADX INFO: renamed from: ᲈᛳᛵᛴ, reason: contains not printable characters */
    public static EnumC2097 m3565(Object obj) {
        Object objM1375;
        String string;
        String string2;
        int i = AbstractC2293.f11258;
        C2014 c2014M1327 = AbstractC0476.m1327(obj);
        ((C0903) c2014M1327.f10074).f4118 = 2;
        C1189 c1189M3892 = c2014M1327.m3892();
        c1189M3892.m4478();
        c1189M3892.f12003 = AbstractC2328.m4341(-1001362607997806L);
        c1189M3892.m2393();
        C0536 c0536 = (C0536) AbstractC1595.m3281(c1189M3892.mo736());
        if (c0536 == null || (objM1375 = c0536.m1375(new Object[0])) == null || (string = objM1375.toString()) == null || (string2 = AbstractC0473.m1314(string).toString()) == null) {
            return null;
        }
        Locale locale = Locale.ROOT;
        AbstractC2328.m4341(-1001375492899694L);
        String upperCase = string2.toUpperCase(locale);
        AbstractC2328.m4341(-1001396967736174L);
        if (upperCase.equals(AbstractC2328.m4341(-1001469982180206L))) {
            return EnumC2097.f10386;
        }
        if (upperCase.equals(AbstractC2328.m4341(-1001491457016686L))) {
            return EnumC2097.f10387;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public static C1628 m3566(ViewGroup viewGroup, View view, EnumC2097 enumC2097) {
        ViewGroup.LayoutParams layoutParams;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        if (m3547(enumC2097)) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                Pair pairM3541 = m3541(view, enumC2097);
                AbstractC2328.m4341(-924010246996846L);
                C1628 c1628 = new C1628(view.getContext());
                c1628.f8312 = 1.0f;
                c1628.setClickable(false);
                c1628.setLongClickable(false);
                c1628.setFocusable(false);
                c1628.setFocusableInTouchMode(false);
                c1628.setEnabled(false);
                c1628.setImportantForAccessibility(2);
                c1628.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                c1628.setImageTintList(null);
                c1628.clearColorFilter();
                c1628.setVisibility(8);
                c1628.setAlpha(view.getAlpha());
                c1628.setLayoutDirection(view.getLayoutDirection());
                ViewOnAttachStateChangeListenerC1310 viewOnAttachStateChangeListenerC1310 = new ViewOnAttachStateChangeListenerC1310(view, c1628);
                C2535 c2535 = new C2535(new WeakReference(viewGroup), enumC2097, new WeakReference(view), enumC2097 == EnumC2097.f10386 ? Boolean.valueOf(view.isSelected()) : null, viewOnAttachStateChangeListenerC1310);
                AbstractC2328.m4341(-924074671506286L);
                c1628.f8311 = c2535;
                int iIndexOfChild = viewGroup2.indexOfChild(view) + 1;
                int childCount = viewGroup2.getChildCount();
                if (iIndexOfChild > childCount) {
                    iIndexOfChild = childCount;
                }
                int iIntValue = ((Number) pairM3541.getFirst()).intValue();
                int iIntValue2 = ((Number) pairM3541.getSecond()).intValue();
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((FrameLayout.LayoutParams) layoutParams2);
                    layoutParams3.width = iIntValue;
                    layoutParams3.height = iIntValue2;
                    int i = layoutParams3.gravity;
                    layoutParams = layoutParams3;
                    if (i <= 0) {
                        layoutParams3.gravity = 17;
                        layoutParams = layoutParams3;
                    }
                } else if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((LinearLayout.LayoutParams) layoutParams2);
                    layoutParams4.width = iIntValue;
                    layoutParams4.height = iIntValue2;
                    layoutParams = layoutParams4;
                } else if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams((RelativeLayout.LayoutParams) layoutParams2);
                    layoutParams5.width = iIntValue;
                    layoutParams5.height = iIntValue2;
                    layoutParams = layoutParams5;
                } else if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams2);
                    marginLayoutParams.width = iIntValue;
                    marginLayoutParams.height = iIntValue2;
                    layoutParams = marginLayoutParams;
                } else {
                    layoutParams = new ViewGroup.LayoutParams(iIntValue, iIntValue2);
                }
                viewGroup2.addView(c1628, iIndexOfChild, layoutParams);
                c1628.m3329().f12487 = true;
                c1628.post(new RunnableC2696(c1628, 4, null));
                View view2 = (View) viewOnAttachStateChangeListenerC1310.f5997.get();
                if (view2 != null) {
                    view2.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1310);
                    if (view2.isAttachedToWindow() && (viewTreeObserver2 = viewOnAttachStateChangeListenerC1310.f5996) != (viewTreeObserver = view2.getViewTreeObserver())) {
                        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                            viewTreeObserver2.removeOnPreDrawListener(viewOnAttachStateChangeListenerC1310);
                        }
                        viewOnAttachStateChangeListenerC1310.f5996 = viewTreeObserver;
                        viewTreeObserver.addOnPreDrawListener(viewOnAttachStateChangeListenerC1310);
                    }
                    viewOnAttachStateChangeListenerC1310.m2601();
                }
                Map map = f9001;
                AbstractC2328.m4341(-1002741292499822L);
                synchronized (map) {
                    AbstractC2328.m4341(-1002767062303598L);
                    map.put(viewGroup, new WeakReference(c1628));
                }
                Map map2 = f8998;
                AbstractC2328.m4341(-1002792832107374L);
                synchronized (map2) {
                    AbstractC2328.m4341(-1002874436485998L);
                    map2.put(view, new WeakReference(c1628));
                }
                return c1628;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public final void m3567(ViewGroup viewGroup, EnumC2097 enumC2097, boolean z, boolean z2) {
        boolean z3;
        if (!m3547(enumC2097)) {
            m3543(viewGroup);
            return;
        }
        Map map = f9010;
        AbstractC2328.m4341(-1001628895970158L);
        synchronized (map) {
            try {
                C1952 c1952 = (C1952) map.get(viewGroup);
                z3 = false;
                if (c1952 == null) {
                    ViewOnLayoutChangeListenerC0605 viewOnLayoutChangeListenerC0605 = new ViewOnLayoutChangeListenerC0605(0);
                    ViewOnAttachStateChangeListenerC1217 viewOnAttachStateChangeListenerC1217 = new ViewOnAttachStateChangeListenerC1217(0);
                    C1952 c19522 = new C1952(enumC2097, viewOnLayoutChangeListenerC0605, viewOnAttachStateChangeListenerC1217);
                    AbstractC2328.m4341(-1001684730545006L);
                    map.put(viewGroup, c19522);
                    viewGroup.addOnLayoutChangeListener(viewOnLayoutChangeListenerC0605);
                    viewGroup.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1217);
                } else if (c1952.f9803 != enumC2097) {
                    f9011.getClass();
                    m3564(viewGroup, c1952);
                    ViewOnLayoutChangeListenerC0605 viewOnLayoutChangeListenerC06052 = new ViewOnLayoutChangeListenerC0605(0);
                    ViewOnAttachStateChangeListenerC1217 viewOnAttachStateChangeListenerC12172 = new ViewOnAttachStateChangeListenerC1217(0);
                    C1952 c195222 = new C1952(enumC2097, viewOnLayoutChangeListenerC06052, viewOnAttachStateChangeListenerC12172);
                    AbstractC2328.m4341(-1001684730545006L);
                    map.put(viewGroup, c195222);
                    viewGroup.addOnLayoutChangeListener(viewOnLayoutChangeListenerC06052);
                    viewGroup.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC12172);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean zM3569 = m3569(viewGroup, enumC2097, z);
        if (zM3569) {
            AbstractC2328.m4341(-1001573061395310L);
            synchronized (map) {
                try {
                    C1952 c19523 = (C1952) map.get(viewGroup);
                    if (c19523 != null) {
                        c1952 = c19523.f9803 == enumC2097 ? c19523 : null;
                        if (c1952 != null) {
                            synchronized (c1952) {
                                c1952.f9806 = 0;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        if (m3547(enumC2097)) {
            AbstractC2328.m4341(-1001822169498478L);
            synchronized (map) {
                C1952 c19524 = (C1952) map.get(viewGroup);
                if (c19524 != null) {
                    if (c19524.f9803 == enumC2097) {
                        c1952 = c19524;
                    }
                }
            }
            if (c1952 == null) {
                return;
            }
            synchronized (c1952) {
                try {
                    if (z2 || c1952.f9806 <= 0) {
                        c1952.f9806 = 90;
                    }
                    if (!c1952.f9802) {
                        c1952.f9802 = true;
                        z3 = true;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (z3) {
                viewGroup.post(new RunnableC2483(viewGroup, enumC2097, c1952, 1));
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛵᛱ, reason: contains not printable characters */
    public final void m3568(ViewGroup viewGroup, EnumC2097 enumC2097, C1952 c1952) {
        C1952 c19522;
        boolean z;
        int i;
        Map map = f9010;
        AbstractC2328.m4341(-1001878004073326L);
        synchronized (map) {
            c19522 = (C1952) map.get(viewGroup);
        }
        if (c19522 != c1952 || c19522.f9803 != enumC2097 || !m3547(enumC2097)) {
            synchronized (c1952) {
                c1952.f9802 = false;
                c1952.f9806 = 0;
            }
            return;
        }
        if (m3569(viewGroup, enumC2097, false)) {
            synchronized (c1952) {
                c1952.f9802 = false;
                c1952.f9806 = 0;
            }
            return;
        }
        synchronized (c1952) {
            try {
                if (!viewGroup.isAttachedToWindow() || (i = c1952.f9806) <= 0) {
                    c1952.f9802 = false;
                    z = false;
                } else {
                    c1952.f9806 = i - 1;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            viewGroup.postOnAnimation(new RunnableC2483(viewGroup, enumC2097, c1952, 0));
            return;
        }
        if (viewGroup.isAttachedToWindow()) {
            if (f8992.add(enumC2097.name() + ':' + viewGroup.getClass().getName())) {
                C2336.f11496.m4354(AbstractC2328.m4341(-1001933838648174L) + enumC2097 + AbstractC2328.m4341(-1002054097732462L) + viewGroup.getClass().getName() + AbstractC2328.m4341(-1002088457470830L) + viewGroup.getChildCount());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0165 A[PHI: r6
  0x0165: PHI (r6v13 yyds.ᛷᲀᛶᛵ) = (r6v12 yyds.ᛷᲀᛶᛵ), (r6v15 yyds.ᛷᲀᛶᛵ) binds: [B:106:0x0161, B:103:0x015a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᛷᲈᛳᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3569(ViewGroup viewGroup, EnumC2097 enumC2097, boolean z) {
        View viewM3554;
        C1628 c1628;
        C1628 c16282;
        C1628 c1628M3566;
        String str;
        Object obj;
        Long l;
        C2535 c2535M3329;
        int i = 0;
        if (m3547(enumC2097)) {
            int iOrdinal = enumC2097.ordinal();
            if (iOrdinal == 0) {
                viewM3554 = m3554(viewGroup);
            } else {
                if (iOrdinal != 1) {
                    C0188.m801();
                    return false;
                }
                viewM3554 = m3545(viewGroup, new C0951(26));
                if (viewM3554 == null) {
                    viewM3554 = m3545(viewGroup, new C0951(27));
                }
            }
            if (viewM3554 != null) {
                Map map = f9001;
                AbstractC2328.m4341(-1002148587012974L);
                synchronized (map) {
                    WeakReference weakReference = (WeakReference) map.get(viewGroup);
                    c1628 = weakReference != null ? (C1628) weakReference.get() : null;
                }
                if (c1628 != null && c1628.m3329().f12483 == enumC2097 && c1628.m3329().f12488.get() == viewM3554 && c1628.getParent() == viewM3554.getParent()) {
                    m3571(viewM3554, enumC2097);
                    if (enumC2097 != EnumC2097.f10386 || AbstractC1544.m3188(c1628.m3329().f12490, Boolean.valueOf(viewM3554.isSelected()))) {
                        m3560(c1628, z);
                    } else {
                        m3562(c1628, viewM3554.isSelected(), false, false, z);
                    }
                    c1628.m3329().f12481.m2601();
                    return true;
                }
                if (m3547(enumC2097)) {
                    ViewParent parent = viewM3554.getParent();
                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        AbstractC2328.m4341(-1002174356816750L);
                        synchronized (map) {
                            WeakReference weakReference2 = (WeakReference) map.get(viewGroup);
                            c16282 = weakReference2 != null ? (C1628) weakReference2.get() : null;
                        }
                        View view = (c16282 == null || (c2535M3329 = c16282.m3329()) == null) ? null : (View) c2535M3329.f12488.get();
                        if (c16282 != null && (c16282.m3329().f12483 != enumC2097 || view != viewM3554 || c16282.getParent() != viewGroup2)) {
                            m3546(c16282);
                        }
                        AbstractC2328.m4341(-1002200126620526L);
                        synchronized (map) {
                            WeakReference weakReference3 = (WeakReference) map.get(viewGroup);
                            c1628M3566 = weakReference3 != null ? (C1628) weakReference3.get() : null;
                        }
                        if (c1628M3566 == null) {
                            c1628M3566 = m3555(viewM3554);
                            if (c1628M3566 != null) {
                                AbstractC2328.m4341(-1002225896424302L);
                                synchronized (map) {
                                    AbstractC2328.m4341(-1002251666228078L);
                                    map.put(viewGroup, new WeakReference(c1628M3566));
                                }
                            } else {
                                c1628M3566 = null;
                            }
                        }
                        if (c1628M3566 == null) {
                            c1628M3566 = m3566(viewGroup, viewM3554, enumC2097);
                            if (c1628M3566 != null) {
                                m3558(viewGroup, c1628M3566);
                                f9005.add(enumC2097.name() + ':' + viewM3554.getClass().getName());
                                f9006.add(enumC2097.name() + ':' + viewGroup.getClass().getName());
                                m3571(viewM3554, enumC2097);
                                int iOrdinal2 = enumC2097.ordinal();
                                if (iOrdinal2 == 0) {
                                    Map map2 = f9000;
                                    AbstractC2328.m4341(-1002277436031854L);
                                    synchronized (map2) {
                                        str = (String) map2.get(viewM3554);
                                    }
                                    if (str != null) {
                                        f9011.getClass();
                                        m3553(c1628M3566, str);
                                    }
                                    m3562(c1628M3566, viewM3554.isSelected(), false, false, z);
                                    viewM3554.post(new RunnableC2048(viewM3554, i));
                                } else {
                                    if (iOrdinal2 != 1) {
                                        C0188.m801();
                                        return false;
                                    }
                                    Map map3 = f8996;
                                    AbstractC2328.m4341(-1002354745443182L);
                                    synchronized (map3) {
                                        WeakReference weakReference4 = (WeakReference) map3.get(viewM3554);
                                        obj = weakReference4 != null ? weakReference4.get() : null;
                                    }
                                    if (obj != null) {
                                        C1784 c1784 = f9011;
                                        c1784.getClass();
                                        Map map4 = f9003;
                                        AbstractC2328.m4341(-1006675482542958L);
                                        synchronized (map4) {
                                            l = (Long) map4.get(obj);
                                        }
                                        if (l != null) {
                                            String str2 = AbstractC2328.m4341(-1006787151692654L) + l.longValue();
                                            c1784.getClass();
                                            m3553(c1628M3566, str2);
                                        }
                                    }
                                    m3560(c1628M3566, z);
                                }
                                c1628M3566.m3329().f12481.m2601();
                                if (c1628M3566.getParent() == viewGroup2) {
                                    return true;
                                }
                            }
                        } else {
                            if (c1628M3566.m3329().f12483 != enumC2097 || c1628M3566.getParent() != viewGroup2) {
                                c1628M3566 = null;
                            }
                            if (c1628M3566 != null) {
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1628 m3570(ImageView imageView) {
        Object next;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Map map;
        EnumC2097 enumC2097;
        C1628 c1628;
        C1628 c1628M3555 = m3555(imageView);
        if (c1628M3555 != null) {
            return c1628M3555;
        }
        if (m3547(EnumC2097.f10387)) {
            Map map2 = f8997;
            AbstractC2328.m4341(-1006181561303918L);
            synchronized (map2) {
                try {
                    Iterator it = map2.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        Map.Entry entry = (Map.Entry) next;
                        ViewGroup viewGroup3 = (ViewGroup) entry.getKey();
                        if (((EnumC2097) entry.getValue()) == EnumC2097.f10387) {
                            f9011.getClass();
                            if (m3548(viewGroup3, imageView)) {
                                break;
                            }
                        }
                    }
                    Map.Entry entry2 = (Map.Entry) next;
                    viewGroup = entry2 != null ? (ViewGroup) entry2.getKey() : null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (imageView.getParent() instanceof ViewGroup) {
                ViewParent parent = imageView.getParent();
                AbstractC2328.m4341(-1006228805944174L);
                viewGroup2 = (ViewGroup) parent;
            } else {
                viewGroup2 = null;
            }
            if (viewGroup != null) {
                map = f8997;
                AbstractC2328.m4341(-1006486503981934L);
                synchronized (map) {
                    AbstractC2328.m4341(-1006533748622190L);
                    enumC2097 = EnumC2097.f10387;
                    map.put(viewGroup, enumC2097);
                }
                m3567(viewGroup, enumC2097, true, true);
                C1628 c1628M35552 = m3555(imageView);
                if (c1628M35552 != null) {
                    return c1628M35552;
                }
                Map map3 = f9001;
                AbstractC2328.m4341(-1006580993262446L);
                synchronized (map3) {
                    WeakReference weakReference = (WeakReference) map3.get(viewGroup);
                    c1628 = weakReference != null ? (C1628) weakReference.get() : null;
                }
                if (c1628 != null && c1628.m3329().f12488.get() == imageView) {
                    return c1628;
                }
            } else if (viewGroup2 != null) {
                viewGroup = viewGroup2;
                map = f8997;
                AbstractC2328.m4341(-1006486503981934L);
                synchronized (map) {
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᲁᛵᲁᲁ, reason: contains not printable characters */
    public final void m3571(View view, EnumC2097 enumC2097) {
        Object c2658;
        int iOrdinal = enumC2097.ordinal();
        final int i = 0;
        final C1784 c1784 = f9011;
        Object c26582 = C2746.f13459;
        ConcurrentHashMap.KeySetView keySetView = f8994;
        final int i2 = 1;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                C0188.m801();
                return;
            }
            Method methodM3563 = m3563(view.getClass(), new C1756(i));
            if (methodM3563 != null) {
                String str = AbstractC2328.m4341(-1003321113084782L) + methodM3563.toGenericString();
                if (keySetView.add(str)) {
                    try {
                        methodM3563.setAccessible(true);
                        final int i3 = 2;
                        c1784.m674(methodM3563, null, new InterfaceC1549(c1784) { // from class: yyds.ᲇᛲᛴᛱ

                            /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
                            public final /* synthetic */ C1784 f11817;

                            {
                                this.f11817 = c1784;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:109:0x0197  */
                            /* JADX WARN: Removed duplicated region for block: B:127:0x01b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            @Override // yyds.InterfaceC1549
                            /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object mo371(Object obj) {
                                Object next;
                                Object c26583;
                                Object c26584;
                                Field field;
                                String str2;
                                Map map;
                                boolean zM3188;
                                C1628 c1628M3555;
                                Method method;
                                switch (i2) {
                                    case 0:
                                        C2746 c2746 = C2746.f13459;
                                        C1784 c17842 = this.f11817;
                                        C1829 c1829 = (C1829) obj;
                                        AbstractC2328.m4341(-1008741361812334L);
                                        Object obj2 = c1829.f9184;
                                        View view2 = obj2 instanceof View ? (View) obj2 : null;
                                        if (view2 != null) {
                                            Iterator it = c1829.f9185.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    next = it.next();
                                                    if (AbstractC1544.m3188(next != null ? next.getClass().getName() : null, AbstractC2328.m4341(-1008814376256366L))) {
                                                    }
                                                } else {
                                                    next = null;
                                                }
                                            }
                                            if (next != null) {
                                                c17842.getClass();
                                                try {
                                                    Method[] methods = next.getClass().getMethods();
                                                    AbstractC2328.m4341(-1003106364719982L);
                                                    int length = methods.length;
                                                    int i4 = 0;
                                                    while (true) {
                                                        if (i4 < length) {
                                                            method = methods[i4];
                                                            if (!AbstractC1544.m3188(method.getName(), AbstractC2328.m4341(-1003175084196718L)) || method.getParameterCount() != 0 || !AbstractC1544.m3188(method.getReturnType(), String.class)) {
                                                                i4++;
                                                            }
                                                        } else {
                                                            method = null;
                                                        }
                                                    }
                                                    Object objInvoke = method != null ? method.invoke(next, null) : null;
                                                    c26583 = objInvoke instanceof String ? (String) objInvoke : null;
                                                } catch (Throwable th) {
                                                    c26583 = new C2658(th);
                                                }
                                                boolean z = c26583 instanceof C2658;
                                                Object obj3 = c26583;
                                                if (z) {
                                                    obj3 = null;
                                                }
                                                String str3 = (String) obj3;
                                                if (str3 == null) {
                                                    try {
                                                        Class<?> superclass = next.getClass();
                                                        while (true) {
                                                            if (superclass != null && !superclass.equals(Object.class)) {
                                                                Field[] declaredFields = superclass.getDeclaredFields();
                                                                AbstractC2328.m4341(-1003205148967790L);
                                                                int length2 = declaredFields.length;
                                                                int i5 = 0;
                                                                while (true) {
                                                                    if (i5 < length2) {
                                                                        field = declaredFields[i5];
                                                                        if (!AbstractC1544.m3188(field.getName(), AbstractC2328.m4341(-1003303933215598L)) || !AbstractC1544.m3188(field.getType(), String.class)) {
                                                                            i5++;
                                                                        }
                                                                    } else {
                                                                        field = null;
                                                                    }
                                                                }
                                                                if (field != null) {
                                                                    field.setAccessible(true);
                                                                    Object obj4 = field.get(next);
                                                                    if (obj4 instanceof String) {
                                                                        c26584 = (String) obj4;
                                                                    }
                                                                } else {
                                                                    superclass = superclass.getSuperclass();
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        c26584 = null;
                                                    } catch (Throwable th2) {
                                                        c26584 = new C2658(th2);
                                                    }
                                                    boolean z2 = c26584 instanceof C2658;
                                                    Object obj5 = c26584;
                                                    if (z2) {
                                                        obj5 = null;
                                                    }
                                                    str3 = (String) obj5;
                                                }
                                                if (str3 == null) {
                                                    str2 = "@" + System.identityHashCode(next);
                                                    map = C1784.f9000;
                                                    AbstractC2328.m4341(-1003003285504878L);
                                                    synchronized (map) {
                                                        zM3188 = AbstractC1544.m3188((String) map.put(view2, str2), str2);
                                                    }
                                                    if (!zM3188 && (c1628M3555 = C1784.m3555(view2)) != null) {
                                                        C1784 c17843 = C1784.f9011;
                                                        String strConcat = AbstractC2328.m4341(-1003080594916206L).concat(str2);
                                                        c17843.getClass();
                                                        C1784.m3553(c1628M3555, strConcat);
                                                    }
                                                } else {
                                                    str2 = AbstractC0473.m1313(str3) ? null : str3;
                                                    if (str2 == null) {
                                                    }
                                                    map = C1784.f9000;
                                                    AbstractC2328.m4341(-1003003285504878L);
                                                    synchronized (map) {
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        return c2746;
                                    case 1:
                                        C1784 c17844 = this.f11817;
                                        C2746 c27462 = C2746.f13459;
                                        AbstractC2328.m4341(-1009261052855150L);
                                        Object obj6 = ((C1829) obj).f9184;
                                        View view3 = obj6 instanceof View ? (View) obj6 : null;
                                        if (view3 != null) {
                                            c17844.getClass();
                                            C1628 c1628M35552 = C1784.m3555(view3);
                                            if (c1628M35552 != null && c1628M35552.m3329().f12485 != EnumC1796.f9060) {
                                                C1784.m3559(view3, true);
                                            }
                                        }
                                        return c27462;
                                    default:
                                        C1784 c17845 = this.f11817;
                                        C0488 c0488 = (C0488) obj;
                                        C2746 c27463 = C2746.f13459;
                                        AbstractC2328.m4341(-1009316887429998L);
                                        Object obj7 = c0488.f2405;
                                        View view4 = obj7 instanceof View ? (View) obj7 : null;
                                        if (view4 != null) {
                                            Object objM3276 = AbstractC1595.m3276(1, c0488.f2406);
                                            Number number = objM3276 instanceof Number ? (Number) objM3276 : null;
                                            if (number != null) {
                                                float fFloatValue = number.floatValue();
                                                c17845.getClass();
                                                C1784.m8(view4, fFloatValue, true);
                                            }
                                        }
                                        return c27463;
                                }
                            }
                        }, new InterfaceC1549(c1784) { // from class: yyds.ᲇᛲᛴᛱ

                            /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
                            public final /* synthetic */ C1784 f11817;

                            {
                                this.f11817 = c1784;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:109:0x0197  */
                            /* JADX WARN: Removed duplicated region for block: B:127:0x01b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            @Override // yyds.InterfaceC1549
                            /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object mo371(Object obj) {
                                Object next;
                                Object c26583;
                                Object c26584;
                                Field field;
                                String str2;
                                Map map;
                                boolean zM3188;
                                C1628 c1628M3555;
                                Method method;
                                switch (i3) {
                                    case 0:
                                        C2746 c2746 = C2746.f13459;
                                        C1784 c17842 = this.f11817;
                                        C1829 c1829 = (C1829) obj;
                                        AbstractC2328.m4341(-1008741361812334L);
                                        Object obj2 = c1829.f9184;
                                        View view2 = obj2 instanceof View ? (View) obj2 : null;
                                        if (view2 != null) {
                                            Iterator it = c1829.f9185.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    next = it.next();
                                                    if (AbstractC1544.m3188(next != null ? next.getClass().getName() : null, AbstractC2328.m4341(-1008814376256366L))) {
                                                    }
                                                } else {
                                                    next = null;
                                                }
                                            }
                                            if (next != null) {
                                                c17842.getClass();
                                                try {
                                                    Method[] methods = next.getClass().getMethods();
                                                    AbstractC2328.m4341(-1003106364719982L);
                                                    int length = methods.length;
                                                    int i4 = 0;
                                                    while (true) {
                                                        if (i4 < length) {
                                                            method = methods[i4];
                                                            if (!AbstractC1544.m3188(method.getName(), AbstractC2328.m4341(-1003175084196718L)) || method.getParameterCount() != 0 || !AbstractC1544.m3188(method.getReturnType(), String.class)) {
                                                                i4++;
                                                            }
                                                        } else {
                                                            method = null;
                                                        }
                                                    }
                                                    Object objInvoke = method != null ? method.invoke(next, null) : null;
                                                    c26583 = objInvoke instanceof String ? (String) objInvoke : null;
                                                } catch (Throwable th) {
                                                    c26583 = new C2658(th);
                                                }
                                                boolean z = c26583 instanceof C2658;
                                                Object obj3 = c26583;
                                                if (z) {
                                                    obj3 = null;
                                                }
                                                String str3 = (String) obj3;
                                                if (str3 == null) {
                                                    try {
                                                        Class<?> superclass = next.getClass();
                                                        while (true) {
                                                            if (superclass != null && !superclass.equals(Object.class)) {
                                                                Field[] declaredFields = superclass.getDeclaredFields();
                                                                AbstractC2328.m4341(-1003205148967790L);
                                                                int length2 = declaredFields.length;
                                                                int i5 = 0;
                                                                while (true) {
                                                                    if (i5 < length2) {
                                                                        field = declaredFields[i5];
                                                                        if (!AbstractC1544.m3188(field.getName(), AbstractC2328.m4341(-1003303933215598L)) || !AbstractC1544.m3188(field.getType(), String.class)) {
                                                                            i5++;
                                                                        }
                                                                    } else {
                                                                        field = null;
                                                                    }
                                                                }
                                                                if (field != null) {
                                                                    field.setAccessible(true);
                                                                    Object obj4 = field.get(next);
                                                                    if (obj4 instanceof String) {
                                                                        c26584 = (String) obj4;
                                                                    }
                                                                } else {
                                                                    superclass = superclass.getSuperclass();
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        c26584 = null;
                                                    } catch (Throwable th2) {
                                                        c26584 = new C2658(th2);
                                                    }
                                                    boolean z2 = c26584 instanceof C2658;
                                                    Object obj5 = c26584;
                                                    if (z2) {
                                                        obj5 = null;
                                                    }
                                                    str3 = (String) obj5;
                                                }
                                                if (str3 == null) {
                                                    str2 = "@" + System.identityHashCode(next);
                                                    map = C1784.f9000;
                                                    AbstractC2328.m4341(-1003003285504878L);
                                                    synchronized (map) {
                                                        zM3188 = AbstractC1544.m3188((String) map.put(view2, str2), str2);
                                                    }
                                                    if (!zM3188 && (c1628M3555 = C1784.m3555(view2)) != null) {
                                                        C1784 c17843 = C1784.f9011;
                                                        String strConcat = AbstractC2328.m4341(-1003080594916206L).concat(str2);
                                                        c17843.getClass();
                                                        C1784.m3553(c1628M3555, strConcat);
                                                    }
                                                } else {
                                                    str2 = AbstractC0473.m1313(str3) ? null : str3;
                                                    if (str2 == null) {
                                                    }
                                                    map = C1784.f9000;
                                                    AbstractC2328.m4341(-1003003285504878L);
                                                    synchronized (map) {
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        return c2746;
                                    case 1:
                                        C1784 c17844 = this.f11817;
                                        C2746 c27462 = C2746.f13459;
                                        AbstractC2328.m4341(-1009261052855150L);
                                        Object obj6 = ((C1829) obj).f9184;
                                        View view3 = obj6 instanceof View ? (View) obj6 : null;
                                        if (view3 != null) {
                                            c17844.getClass();
                                            C1628 c1628M35552 = C1784.m3555(view3);
                                            if (c1628M35552 != null && c1628M35552.m3329().f12485 != EnumC1796.f9060) {
                                                C1784.m3559(view3, true);
                                            }
                                        }
                                        return c27462;
                                    default:
                                        C1784 c17845 = this.f11817;
                                        C0488 c0488 = (C0488) obj;
                                        C2746 c27463 = C2746.f13459;
                                        AbstractC2328.m4341(-1009316887429998L);
                                        Object obj7 = c0488.f2405;
                                        View view4 = obj7 instanceof View ? (View) obj7 : null;
                                        if (view4 != null) {
                                            Object objM3276 = AbstractC1595.m3276(1, c0488.f2406);
                                            Number number = objM3276 instanceof Number ? (Number) objM3276 : null;
                                            if (number != null) {
                                                float fFloatValue = number.floatValue();
                                                c17845.getClass();
                                                C1784.m8(view4, fFloatValue, true);
                                            }
                                        }
                                        return c27463;
                                }
                            }
                        });
                    } catch (Throwable th) {
                        c26582 = new C2658(th);
                    }
                    if (C2248.m4249(c26582) != null) {
                        keySetView.remove(str);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        ArrayList<Method> arrayList = new ArrayList();
        for (Class<?> superclass = view.getClass(); superclass != null && !superclass.equals(View.class) && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            Method[] declaredMethods = superclass.getDeclaredMethods();
            AbstractC2328.m4341(-1007817943843694L);
            for (Method method : declaredMethods) {
                AbstractC2328.m4341(-1008432124167022L);
                if (AbstractC1544.m3188(method.getReturnType(), Void.TYPE)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC2328.m4341(-1008462188938094L);
                    int length = parameterTypes.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            break;
                        }
                        if (parameterTypes[i4].getName().equals(AbstractC2328.m4341(-1008560973185902L))) {
                            arrayList.add(method);
                            break;
                        }
                        i4++;
                    }
                }
            }
        }
        for (Method method2 : arrayList) {
            String str2 = AbstractC2328.m4341(-1002956040864622L) + method2.toGenericString();
            if (keySetView.add(str2)) {
                try {
                    method2.setAccessible(true);
                    c1784.m688(method2, null, new InterfaceC1549(c1784) { // from class: yyds.ᲇᛲᛴᛱ

                        /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
                        public final /* synthetic */ C1784 f11817;

                        {
                            this.f11817 = c1784;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:109:0x0197  */
                        /* JADX WARN: Removed duplicated region for block: B:127:0x01b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        @Override // yyds.InterfaceC1549
                        /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object mo371(Object obj) {
                            Object next;
                            Object c26583;
                            Object c26584;
                            Field field;
                            String str22;
                            Map map;
                            boolean zM3188;
                            C1628 c1628M3555;
                            Method method3;
                            switch (i) {
                                case 0:
                                    C2746 c2746 = C2746.f13459;
                                    C1784 c17842 = this.f11817;
                                    C1829 c1829 = (C1829) obj;
                                    AbstractC2328.m4341(-1008741361812334L);
                                    Object obj2 = c1829.f9184;
                                    View view2 = obj2 instanceof View ? (View) obj2 : null;
                                    if (view2 != null) {
                                        Iterator it = c1829.f9185.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                next = it.next();
                                                if (AbstractC1544.m3188(next != null ? next.getClass().getName() : null, AbstractC2328.m4341(-1008814376256366L))) {
                                                }
                                            } else {
                                                next = null;
                                            }
                                        }
                                        if (next != null) {
                                            c17842.getClass();
                                            try {
                                                Method[] methods = next.getClass().getMethods();
                                                AbstractC2328.m4341(-1003106364719982L);
                                                int length2 = methods.length;
                                                int i42 = 0;
                                                while (true) {
                                                    if (i42 < length2) {
                                                        method3 = methods[i42];
                                                        if (!AbstractC1544.m3188(method3.getName(), AbstractC2328.m4341(-1003175084196718L)) || method3.getParameterCount() != 0 || !AbstractC1544.m3188(method3.getReturnType(), String.class)) {
                                                            i42++;
                                                        }
                                                    } else {
                                                        method3 = null;
                                                    }
                                                }
                                                Object objInvoke = method3 != null ? method3.invoke(next, null) : null;
                                                c26583 = objInvoke instanceof String ? (String) objInvoke : null;
                                            } catch (Throwable th2) {
                                                c26583 = new C2658(th2);
                                            }
                                            boolean z = c26583 instanceof C2658;
                                            Object obj3 = c26583;
                                            if (z) {
                                                obj3 = null;
                                            }
                                            String str3 = (String) obj3;
                                            if (str3 == null) {
                                                try {
                                                    Class<?> superclass2 = next.getClass();
                                                    while (true) {
                                                        if (superclass2 != null && !superclass2.equals(Object.class)) {
                                                            Field[] declaredFields = superclass2.getDeclaredFields();
                                                            AbstractC2328.m4341(-1003205148967790L);
                                                            int length22 = declaredFields.length;
                                                            int i5 = 0;
                                                            while (true) {
                                                                if (i5 < length22) {
                                                                    field = declaredFields[i5];
                                                                    if (!AbstractC1544.m3188(field.getName(), AbstractC2328.m4341(-1003303933215598L)) || !AbstractC1544.m3188(field.getType(), String.class)) {
                                                                        i5++;
                                                                    }
                                                                } else {
                                                                    field = null;
                                                                }
                                                            }
                                                            if (field != null) {
                                                                field.setAccessible(true);
                                                                Object obj4 = field.get(next);
                                                                if (obj4 instanceof String) {
                                                                    c26584 = (String) obj4;
                                                                }
                                                            } else {
                                                                superclass2 = superclass2.getSuperclass();
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    c26584 = null;
                                                } catch (Throwable th22) {
                                                    c26584 = new C2658(th22);
                                                }
                                                boolean z2 = c26584 instanceof C2658;
                                                Object obj5 = c26584;
                                                if (z2) {
                                                    obj5 = null;
                                                }
                                                str3 = (String) obj5;
                                            }
                                            if (str3 == null) {
                                                str22 = "@" + System.identityHashCode(next);
                                                map = C1784.f9000;
                                                AbstractC2328.m4341(-1003003285504878L);
                                                synchronized (map) {
                                                    zM3188 = AbstractC1544.m3188((String) map.put(view2, str22), str22);
                                                }
                                                if (!zM3188 && (c1628M3555 = C1784.m3555(view2)) != null) {
                                                    C1784 c17843 = C1784.f9011;
                                                    String strConcat = AbstractC2328.m4341(-1003080594916206L).concat(str22);
                                                    c17843.getClass();
                                                    C1784.m3553(c1628M3555, strConcat);
                                                }
                                            } else {
                                                str22 = AbstractC0473.m1313(str3) ? null : str3;
                                                if (str22 == null) {
                                                }
                                                map = C1784.f9000;
                                                AbstractC2328.m4341(-1003003285504878L);
                                                synchronized (map) {
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    return c2746;
                                case 1:
                                    C1784 c17844 = this.f11817;
                                    C2746 c27462 = C2746.f13459;
                                    AbstractC2328.m4341(-1009261052855150L);
                                    Object obj6 = ((C1829) obj).f9184;
                                    View view3 = obj6 instanceof View ? (View) obj6 : null;
                                    if (view3 != null) {
                                        c17844.getClass();
                                        C1628 c1628M35552 = C1784.m3555(view3);
                                        if (c1628M35552 != null && c1628M35552.m3329().f12485 != EnumC1796.f9060) {
                                            C1784.m3559(view3, true);
                                        }
                                    }
                                    return c27462;
                                default:
                                    C1784 c17845 = this.f11817;
                                    C0488 c0488 = (C0488) obj;
                                    C2746 c27463 = C2746.f13459;
                                    AbstractC2328.m4341(-1009316887429998L);
                                    Object obj7 = c0488.f2405;
                                    View view4 = obj7 instanceof View ? (View) obj7 : null;
                                    if (view4 != null) {
                                        Object objM3276 = AbstractC1595.m3276(1, c0488.f2406);
                                        Number number = objM3276 instanceof Number ? (Number) objM3276 : null;
                                        if (number != null) {
                                            float fFloatValue = number.floatValue();
                                            c17845.getClass();
                                            C1784.m8(view4, fFloatValue, true);
                                        }
                                    }
                                    return c27463;
                            }
                        }
                    });
                    c2658 = c26582;
                } catch (Throwable th2) {
                    c2658 = new C2658(th2);
                }
                if (C2248.m4249(c2658) != null) {
                    keySetView.remove(str2);
                }
            }
        }
        Method methodM35632 = m3563(view.getClass(), new C1756(4));
        if (methodM35632 == null) {
            return;
        }
        InterfaceC1549 c1756 = new C1756(5);
        String genericString = methodM35632.toGenericString();
        if (keySetView.add(genericString)) {
            try {
                methodM35632.setAccessible(true);
                m673(methodM35632, null, c1756);
            } catch (Throwable th3) {
                c26582 = new C2658(th3);
            }
            if (C2248.m4249(c26582) != null) {
                keySetView.remove(genericString);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0178  */
    @Override // yyds.AbstractC0145
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo420() {
        Object obj;
        Throwable thM4249;
        Object c2658;
        Object c26582;
        C0757 c0757M2680 = C1329.f6114.m2680();
        String str = c0757M2680 != null ? c0757M2680.f3503 : null;
        C0757 c0757 = (C0757) AbstractC2104.m4019(-641268254933870L, -641384219050862L);
        String str2 = c0757 != null ? c0757.f3503 : null;
        if (str == null && str2 == null) {
            return;
        }
        int i = 2;
        if (!f8993) {
            synchronized (this) {
                if (!f8993) {
                    C0561 c0561 = C0561.f2672;
                    C1756 c1756 = new C1756(i);
                    AbstractC2328.m4341(-544429627310958L);
                    C0561.f2669.add(c1756);
                    f8993 = true;
                }
            }
        }
        Object c26583 = C2746.f13459;
        ConcurrentHashMap.KeySetView keySetView = f9008;
        int i2 = 0;
        try {
            Class<?> cls = Class.forName(AbstractC2328.m4341(-1004094207198062L), false, m678());
            Method[] declaredMethods = Class.forName(AbstractC2328.m4341(-1004351905235822L), false, m678()).getDeclaredMethods();
            AbstractC2328.m4341(-1004613898240878L);
            ArrayList<Method> arrayList = new ArrayList();
            int length = declaredMethods.length;
            int i3 = 0;
            while (i3 < length) {
                Method method = declaredMethods[i3];
                if (!Modifier.isAbstract(method.getModifiers()) && AbstractC1544.m3188(method.getReturnType(), Void.TYPE)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC2328.m4341(-1004716977455982L);
                    int length2 = parameterTypes.length;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        if (cls.isAssignableFrom(parameterTypes[i2])) {
                            arrayList.add(method);
                            break;
                        }
                        i2++;
                    }
                }
                i3++;
                i2 = 0;
            }
            for (Method method2 : arrayList) {
                String genericString = method2.toGenericString();
                if (keySetView.add(genericString)) {
                    try {
                        method2.setAccessible(true);
                        obj = null;
                        try {
                            m688(method2, null, new C1347(cls, this));
                            c26582 = c26583;
                        } catch (Throwable th) {
                            th = th;
                            c26582 = new C2658(th);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = null;
                    }
                    if (C2248.m4249(c26582) != null) {
                        try {
                            keySetView.remove(genericString);
                        } catch (Throwable th3) {
                            th = th3;
                            c26583 = new C2658(th);
                            thM4249 = C2248.m4249(c26583);
                            if (thM4249 != null) {
                            }
                            C1784 c1784 = f9011;
                            C1329 c1329 = C1329.f6114;
                            while (r5.hasNext()) {
                            }
                            m689(EnumC1543.f7489, new C2085(str, 2, str2));
                            m689(EnumC1543.f7822, new C2085(str, 3, str2));
                        }
                    }
                }
            }
            obj = null;
        } catch (Throwable th4) {
            th = th4;
            obj = null;
        }
        thM4249 = C2248.m4249(c26583);
        if (thM4249 != null) {
            C2336.f11496.m4354(AbstractC2328.m4341(-1004815761703790L) + thM4249.getMessage());
        }
        C1784 c17842 = f9011;
        C1329 c13292 = C1329.f6114;
        for (Pair pair : AbstractC2725.m4854(new Pair((C2068) AbstractC2104.m4019(-641753586238318L, -641899615126382L), EnumC2097.f10386), new Pair((C2068) AbstractC2104.m4019(-642118658458478L, -642277572248430L), EnumC2097.f10387))) {
            C2068 c2068 = (C2068) pair.component1();
            EnumC2097 enumC2097 = (EnumC2097) pair.component2();
            if (c2068 != null) {
                String str3 = c2068.f10221;
                try {
                    try {
                        c2658 = Class.forName(str3, false, c17842.m678());
                    } catch (Throwable th5) {
                        th = th5;
                        c2658 = new C2658(th);
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
                Throwable thM42492 = C2248.m4249(c2658);
                if (thM42492 != null) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-1000735542772590L).concat(str3), thM42492);
                }
                if (c2658 instanceof C2658) {
                    c2658 = obj;
                }
                Class cls2 = (Class) c2658;
                if (cls2 != null) {
                    c17842.getClass();
                    m3542(cls2, enumC2097, str, str2);
                }
            }
        }
        m689(EnumC1543.f7489, new C2085(str, 2, str2));
        m689(EnumC1543.f7822, new C2085(str, 3, str2));
    }
}
