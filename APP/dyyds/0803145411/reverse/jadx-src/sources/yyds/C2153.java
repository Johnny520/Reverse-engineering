package yyds;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᲁᛱᛴᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2153 extends AbstractC0145 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final ConcurrentHashMap.KeySetView f10610;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final ConcurrentHashMap.KeySetView f10611;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final ConcurrentHashMap.KeySetView f10612;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static volatile boolean f10613;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final Map f10614;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C2153 f10615;

    static {
        AbstractC2328.m4341(-820836542612334L);
        f10615 = new C2153();
        f10612 = ConcurrentHashMap.newKeySet();
        f10610 = ConcurrentHashMap.newKeySet();
        f10611 = ConcurrentHashMap.newKeySet();
        f10614 = AbstractC0897.m1993();
    }

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public static void m4104(ViewGroup viewGroup, C2617 c2617, boolean z) {
        C2617 c26172;
        Map map = f10614;
        AbstractC2328.m4341(-819255994647406L);
        synchronized (map) {
            c26172 = (C2617) map.get(viewGroup);
        }
        if (c26172 != c2617) {
            return;
        }
        if (!m4119(c2617.f12865)) {
            m4113(viewGroup, c2617);
            return;
        }
        if (!c2617.f12864) {
            viewGroup.addOnLayoutChangeListener(c2617.f12866);
            viewGroup.addOnAttachStateChangeListener(c2617.f12868);
            c2617.f12864 = true;
        }
        int iOrdinal = m4106(viewGroup, c2617, z).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (!c2617.f12867 && c2617.f12864 && viewGroup.isAttachedToWindow()) {
                    c2617.f12867 = true;
                    int i = c2617.f12869 + 1;
                    c2617.f12869 = i;
                    WeakReference weakReference = new WeakReference(viewGroup);
                    C0947 c0947 = new C0947();
                    c0947.f4410 = 60;
                    viewGroup.postOnAnimation(new RunnableC1498(weakReference, i, c2617, c0947));
                    return;
                }
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                C0188.m801();
                return;
            }
        }
        c2617.f12869++;
        c2617.f12867 = false;
    }

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public static void m4105(Class cls, EnumC0868 enumC0868, String str, String str2) {
        Object c2658;
        Object c26582;
        String name = cls.getName();
        ConcurrentHashMap.KeySetView keySetView = f10612;
        if (keySetView.add(name)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C0025 c0025 = new C0025((C2722) AbstractC1529.m3159(cls, new C1756(7)));
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
                    AbstractC2328.m4341(-818830792885102L);
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
            AbstractC2328.m4341(-818908102296430L);
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
                boolean z2 = str != null && AbstractC1544.m3188(method3.getName(), str) && Arrays.equals(method3.getParameterTypes(), new Class[]{ViewGroup.class}) && ViewGroup.class.isAssignableFrom(method3.getReturnType());
                Class<?>[] parameterTypes = method3.getParameterTypes();
                boolean z3 = str2 != null && AbstractC1544.m3188(method3.getName(), str2) && parameterTypes.length == 3 && AbstractC1544.m3188(parameterTypes[1], Context.class) && ViewGroup.class.isAssignableFrom(parameterTypes[2]) && View.class.isAssignableFrom(method3.getReturnType());
                if (z2 || z3) {
                    if (f10610.add(method3.toGenericString())) {
                        f10615.m673(method3, null, new C2001(enumC0868, 6, name));
                    }
                    z = true;
                }
            }
            if (z) {
                return;
            }
            keySetView.remove(name);
            C2336.f11496.m4354(AbstractC2328.m4341(-818714828768110L) + name + AbstractC2328.m4341(-818774958310254L));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b1 A[PHI: r3
  0x01b1: PHI (r3v19 android.widget.ImageView) = (r3v8 android.widget.ImageView), (r3v12 android.widget.ImageView), (r3v16 android.widget.ImageView) binds: [B:94:0x01af, B:106:0x01d7, B:116:0x01f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᛱᲀᲈᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static EnumC2163 m4106(ViewGroup viewGroup, C2617 c2617, boolean z) {
        C1692 c1692;
        ImageView imageView;
        ViewGroup viewGroup2;
        C2153 c2153;
        long j;
        Object next;
        Object next2;
        Object next3;
        ImageView imageView2;
        String strM4341;
        Object c2658;
        boolean zM1301;
        Object next4;
        Object c26582;
        Drawable drawable;
        C1874 c1874;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        EnumC0868 enumC0868 = c2617.f12865;
        if (!m4119(enumC0868)) {
            m4113(viewGroup, c2617);
            return EnumC2163.f10627;
        }
        C1692 c1692M4114 = m4114(viewGroup);
        long j2 = -1000546564211566L;
        if (c1692M4114 == null) {
            c1692 = c1692M4114;
        } else {
            C1874 c18742 = c1692M4114.f8622;
            if (c18742 == null) {
                AbstractC2328.m4341(-1000546564211566L);
                c18742 = null;
            }
            if (c18742.f9426 != enumC0868) {
                m4109(c1692M4114);
                c1692 = null;
            }
        }
        if (c1692 == null) {
            imageView = null;
        } else {
            C1874 c18743 = c1692.f8622;
            if (c18743 == null) {
                AbstractC2328.m4341(-1000546564211566L);
                c18743 = null;
            }
            if (c18743 != null) {
                imageView = (ImageView) c18743.f9427.get();
            }
        }
        if (imageView == null) {
            String str = c2617.f12870;
            ArrayList arrayList = new ArrayList();
            viewGroup2 = viewGroup;
            m4117(viewGroup2, arrayList);
            if (arrayList.isEmpty()) {
                j = -1000546564211566L;
                imageView2 = null;
            } else {
                if (str != null) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next4 = null;
                            break;
                        }
                        next4 = it.next();
                        if (((ImageView) next4).getClass().getName().equals(str)) {
                            break;
                        }
                    }
                    ImageView imageView3 = (ImageView) next4;
                    if (imageView3 != null) {
                        j = -1000546564211566L;
                        imageView2 = imageView3;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    c2153 = f10615;
                    if (!zHasNext) {
                        break;
                    }
                    long j3 = j2;
                    Object next5 = it2.next();
                    ImageView imageView4 = (ImageView) next5;
                    c2153.getClass();
                    int iOrdinal = enumC0868.ordinal();
                    if (iOrdinal == 2) {
                        strM4341 = AbstractC2328.m4341(-819509397717870L);
                    } else if (iOrdinal != 5) {
                        zM1301 = false;
                        if (zM1301) {
                            arrayList2.add(next5);
                        }
                        j2 = j3;
                    } else {
                        strM4341 = AbstractC2328.m4341(-819543757456238L);
                    }
                    String name = imageView4.getClass().getName();
                    AbstractC2328.m4341(-819569527260014L);
                    Locale locale = Locale.ROOT;
                    AbstractC2328.m4341(-819625361834862L);
                    String lowerCase = name.toLowerCase(locale);
                    AbstractC2328.m4341(-819646836671342L);
                    if (AbstractC0473.m1301(lowerCase, strM4341, false)) {
                        zM1301 = true;
                        if (zM1301) {
                        }
                        j2 = j3;
                    } else {
                        try {
                            if (imageView4.getId() == -1) {
                                try {
                                    c2658 = AbstractC2328.m4341(-819719851115374L);
                                } catch (Throwable th) {
                                    th = th;
                                    c2658 = new C2658(th);
                                }
                            } else {
                                String resourceEntryName = imageView4.getResources().getResourceEntryName(imageView4.getId());
                                AbstractC2328.m4341(-819724146082670L);
                                AbstractC2328.m4341(-819835815232366L);
                                c2658 = resourceEntryName.toLowerCase(locale);
                                AbstractC2328.m4341(-819857290068846L);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        Object objM4341 = AbstractC2328.m4341(-819930304512878L);
                        if (c2658 instanceof C2658) {
                            c2658 = objM4341;
                        }
                        zM1301 = AbstractC0473.m1301((String) c2658, strM4341, false);
                        if (zM1301) {
                        }
                        j2 = j3;
                    }
                }
                j = j2;
                Iterator it3 = arrayList2.iterator();
                if (it3.hasNext()) {
                    next = it3.next();
                    if (it3.hasNext()) {
                        int iM4108 = m4108((ImageView) next);
                        do {
                            Object next6 = it3.next();
                            int iM41082 = m4108((ImageView) next6);
                            if (iM4108 < iM41082) {
                                next = next6;
                                iM4108 = iM41082;
                            }
                        } while (it3.hasNext());
                    }
                } else {
                    next = null;
                }
                ImageView imageView5 = (ImageView) next;
                if (imageView5 != null) {
                    imageView2 = imageView5;
                    if (imageView2 == null) {
                        return EnumC2163.f10631;
                    }
                } else {
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it4.next();
                        ImageView imageView6 = (ImageView) next2;
                        c2153.getClass();
                        if (m4120(imageView6) && m4115(imageView6)) {
                            break;
                        }
                    }
                    imageView5 = (ImageView) next2;
                    if (imageView5 == null) {
                        Iterator it5 = arrayList.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it5.next();
                            if (m4115((ImageView) next3)) {
                                break;
                            }
                        }
                        imageView5 = (ImageView) next3;
                        if (imageView5 == null) {
                            imageView2 = (ImageView) AbstractC1595.m3280(arrayList);
                        }
                        if (imageView2 == null) {
                        }
                    }
                }
            }
            if (imageView2 == null) {
            }
        } else {
            imageView2 = imageView.getParent() == c1692.getParent() ? imageView : null;
            if (imageView2 != null) {
                viewGroup2 = viewGroup;
                j = -1000546564211566L;
            }
        }
        ImageView imageView7 = imageView2;
        if (c2617.f12870 == null) {
            c2617.f12870 = imageView7.getClass().getName();
        }
        ViewParent parent = imageView7.getParent();
        ViewGroup viewGroup3 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup3 == null) {
            return EnumC2163.f10631;
        }
        if (c1692 != null && (c1692.getParent() != viewGroup3 || imageView != imageView7)) {
            m4109(c1692);
            c1692 = null;
        }
        if (c1692 == null || z) {
            try {
                C0561 c0561 = C0561.f2672;
                Resources resources = viewGroup2.getResources();
                AbstractC2328.m4341(-819371958764398L);
                c26582 = C0561.m1411(resources, enumC0868);
            } catch (Throwable th3) {
                c26582 = new C2658(th3);
            }
            Throwable thM4249 = C2248.m4249(c26582);
            if (thM4249 != null) {
                C2336.f11496.m4355(AbstractC2328.m4341(-819449268175726L) + enumC0868, thM4249);
            }
            if (c26582 instanceof C2658) {
                c26582 = null;
            }
            drawable = (Drawable) c26582;
        } else {
            drawable = null;
        }
        if ((c1692 == null || z) && drawable == null) {
            if (c1692 != null) {
                m4109(c1692);
            }
            return EnumC2163.f10630;
        }
        if (c1692 == null) {
            AbstractC2328.m4341(-1000507909505902L);
            C1692 c16922 = new C1692(imageView7.getContext());
            c16922.setClickable(false);
            c16922.setLongClickable(false);
            c16922.setFocusable(false);
            c16922.setFocusableInTouchMode(false);
            c16922.setEnabled(false);
            c16922.setImportantForAccessibility(2);
            c16922.setScaleType(imageView7.getScaleType());
            c16922.setAdjustViewBounds(imageView7.getAdjustViewBounds());
            c16922.setLayoutDirection(imageView7.getLayoutDirection());
            c16922.setAlpha(1.0f);
            c16922.setVisibility(imageView7.getVisibility());
            c16922.setImageDrawable(drawable);
            C1874 c18744 = new C1874(enumC0868, new WeakReference(imageView7), imageView7.getImageAlpha());
            AbstractC2328.m4341(-1000572334015342L);
            c16922.f8622 = c18744;
            ViewOnAttachStateChangeListenerC1310 viewOnAttachStateChangeListenerC1310 = new ViewOnAttachStateChangeListenerC1310(imageView7, c16922, c18744);
            c18744.f9429 = viewOnAttachStateChangeListenerC1310;
            int iIndexOfChild = viewGroup3.indexOfChild(imageView7) + 1;
            int childCount = viewGroup3.getChildCount();
            if (iIndexOfChild > childCount) {
                iIndexOfChild = childCount;
            }
            ViewGroup.LayoutParams layoutParams = imageView7.getLayoutParams();
            AbstractC2328.m4341(-819281764451182L);
            viewGroup3.addView(c16922, iIndexOfChild, layoutParams instanceof FrameLayout.LayoutParams ? new FrameLayout.LayoutParams((FrameLayout.LayoutParams) layoutParams) : layoutParams instanceof LinearLayout.LayoutParams ? new LinearLayout.LayoutParams((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof RelativeLayout.LayoutParams ? new RelativeLayout.LayoutParams((RelativeLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new ViewGroup.LayoutParams(layoutParams));
            m4110(imageView7, c16922, c18744);
            ImageView imageView8 = (ImageView) viewOnAttachStateChangeListenerC1310.f5997.get();
            if (imageView8 != null) {
                imageView8.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1310);
                viewOnAttachStateChangeListenerC1310.m2600();
                if (imageView8.isAttachedToWindow() && (viewTreeObserver2 = viewOnAttachStateChangeListenerC1310.f5996) != (viewTreeObserver = imageView8.getViewTreeObserver())) {
                    if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                        viewTreeObserver2.removeOnPreDrawListener(viewOnAttachStateChangeListenerC1310);
                    }
                    viewOnAttachStateChangeListenerC1310.f5996 = viewTreeObserver;
                    viewTreeObserver.addOnPreDrawListener(viewOnAttachStateChangeListenerC1310);
                }
            }
            f10611.add(enumC0868.name() + ':' + imageView7.getClass().getName());
        } else {
            C1874 c18745 = c1692.f8622;
            if (c18745 != null) {
                c1874 = c18745;
            } else {
                AbstractC2328.m4341(j);
                c1874 = null;
            }
            m4110(imageView7, c1692, c1874);
            int iIndexOfChild2 = viewGroup3.indexOfChild(imageView7) + 1;
            if (iIndexOfChild2 > 0 && viewGroup3.indexOfChild(c1692) != iIndexOfChild2) {
                ViewGroup.LayoutParams layoutParams2 = c1692.getLayoutParams();
                viewGroup3.removeView(c1692);
                int childCount2 = viewGroup3.getChildCount();
                if (iIndexOfChild2 > childCount2) {
                    iIndexOfChild2 = childCount2;
                }
                viewGroup3.addView(c1692, iIndexOfChild2, layoutParams2);
            }
            if (drawable != null) {
                c1692.setImageDrawable(drawable);
            }
        }
        return EnumC2163.f10629;
    }

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public static void m4107(Iterable iterable, String str, String str2, boolean z) {
        if (iterable != null) {
            for (Object obj : iterable) {
                if (obj != null) {
                    C2153 c2153 = f10615;
                    if (z) {
                        String strM4341 = AbstractC2328.m4341(-818444245828462L);
                        c2153.getClass();
                        Object objM671 = AbstractC0145.m671(obj, strM4341);
                        if (objM671 != null) {
                            obj = objM671;
                        }
                    }
                    c2153.getClass();
                    EnumC0868 enumC0868M4112 = m4112(obj);
                    if (enumC0868M4112 != null) {
                        m4105(obj.getClass(), enumC0868M4112, str, str2);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᲀᛲᛲ, reason: contains not printable characters */
    public static int m4108(ImageView imageView) {
        int i = m4120(imageView) ? 4 : 0;
        if (m4115(imageView)) {
            i += 3;
        }
        ViewParent parent = imageView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        return (viewGroup == null || viewGroup.indexOfChild(imageView) != 0) ? i : i + 1;
    }

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public static void m4109(C1692 c1692) {
        C1874 c1874 = c1692.f8622;
        if (c1874 == null) {
            AbstractC2328.m4341(-1000546564211566L);
            c1874 = null;
        }
        ViewOnAttachStateChangeListenerC1310 viewOnAttachStateChangeListenerC1310 = c1874.f9429;
        if (viewOnAttachStateChangeListenerC1310 != null) {
            ImageView imageView = (ImageView) viewOnAttachStateChangeListenerC1310.f5997.get();
            if (imageView != null) {
                imageView.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1310);
            }
            ViewTreeObserver viewTreeObserver = viewOnAttachStateChangeListenerC1310.f5996;
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(viewOnAttachStateChangeListenerC1310);
            }
            viewOnAttachStateChangeListenerC1310.f5996 = null;
        }
        ImageView imageView2 = (ImageView) c1874.f9427.get();
        if (imageView2 != null) {
            int imageAlpha = imageView2.getImageAlpha();
            if (imageAlpha == 0) {
                imageAlpha = c1874.f9428;
            }
            imageView2.setImageAlpha(imageAlpha);
        }
        ViewParent parent = c1692.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(c1692);
        }
    }

    /* JADX INFO: renamed from: ᛶᛴᛱᛲ, reason: contains not printable characters */
    public static void m4110(ImageView imageView, C1692 c1692, C1874 c1874) {
        int imageAlpha = imageView.getImageAlpha();
        if (imageAlpha != 0) {
            c1874.f9428 = imageAlpha;
        }
        c1692.setImageAlpha(c1874.f9428);
        if (imageView.getImageAlpha() != 0) {
            imageView.setImageAlpha(0);
        }
        c1692.setAlpha(imageView.getAlpha());
        c1692.setVisibility(imageView.getVisibility());
        c1692.setTranslationX(imageView.getTranslationX());
        c1692.setTranslationY(imageView.getTranslationY());
        c1692.setTranslationZ(imageView.getTranslationZ());
        c1692.setElevation(imageView.getElevation());
        c1692.setScaleX(imageView.getScaleX());
        c1692.setScaleY(imageView.getScaleY());
        c1692.setRotation(imageView.getRotation());
        c1692.setRotationX(imageView.getRotationX());
        c1692.setRotationY(imageView.getRotationY());
        c1692.setPivotX(imageView.getPivotX());
        c1692.setPivotY(imageView.getPivotY());
        c1692.setCameraDistance(imageView.getCameraDistance());
        c1692.setLayoutDirection(imageView.getLayoutDirection());
        c1692.setScaleType(imageView.getScaleType());
        c1692.setAdjustViewBounds(imageView.getAdjustViewBounds());
        c1692.setImageMatrix(imageView.getImageMatrix());
        c1692.setClipBounds(imageView.getClipBounds());
        c1692.setClipToOutline(imageView.getClipToOutline());
        c1692.setOutlineProvider(imageView.getOutlineProvider());
        c1692.setSelected(imageView.isSelected());
        c1692.setActivated(imageView.isActivated());
        if (c1692.getPaddingLeft() == imageView.getPaddingLeft() && c1692.getPaddingTop() == imageView.getPaddingTop() && c1692.getPaddingRight() == imageView.getPaddingRight() && c1692.getPaddingBottom() == imageView.getPaddingBottom()) {
            return;
        }
        c1692.setPadding(imageView.getPaddingLeft(), imageView.getPaddingTop(), imageView.getPaddingRight(), imageView.getPaddingBottom());
    }

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public static void m4111(EnumC0868 enumC0868) {
        ArrayList<ViewGroup> arrayList;
        AbstractC2328.m4341(-818328281711470L);
        Map map = f10614;
        AbstractC2328.m4341(-818349756547950L);
        synchronized (map) {
            Set<Map.Entry> setEntrySet = map.entrySet();
            arrayList = new ArrayList();
            for (Map.Entry entry : setEntrySet) {
                ViewGroup viewGroup = (ViewGroup) entry.getKey();
                if (((C2617) entry.getValue()).f12865 != enumC0868) {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    arrayList.add(viewGroup);
                }
            }
        }
        for (ViewGroup viewGroup2 : arrayList) {
            viewGroup2.post(new RunnableC2696(viewGroup2, 5, enumC0868));
        }
    }

    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    public static EnumC0868 m4112(Object obj) {
        Object objM1375;
        String string;
        String string2;
        int i = AbstractC2293.f11258;
        C2014 c2014M1327 = AbstractC0476.m1327(obj);
        ((C0903) c2014M1327.f10074).f4118 = 2;
        C1189 c1189M3892 = c2014M1327.m3892();
        c1189M3892.m4478();
        c1189M3892.f12003 = AbstractC2328.m4341(-818985411707758L);
        c1189M3892.m2393();
        C0536 c0536 = (C0536) AbstractC1595.m3281(c1189M3892.mo736());
        if (c0536 == null || (objM1375 = c0536.m1375(new Object[0])) == null || (string = objM1375.toString()) == null || (string2 = AbstractC0473.m1314(string).toString()) == null) {
            return null;
        }
        Locale locale = Locale.ROOT;
        AbstractC2328.m4341(-818998296609646L);
        String upperCase = string2.toUpperCase(locale);
        AbstractC2328.m4341(-819019771446126L);
        if (upperCase.equals(AbstractC2328.m4341(-819092785890158L))) {
            return EnumC0868.f3975;
        }
        if (upperCase.equals(AbstractC2328.m4341(-819127145628526L))) {
            return EnumC0868.f3980;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public static void m4113(ViewGroup viewGroup, C2617 c2617) {
        c2617.f12869++;
        c2617.f12867 = false;
        if (c2617.f12864) {
            viewGroup.removeOnLayoutChangeListener(c2617.f12866);
            viewGroup.removeOnAttachStateChangeListener(c2617.f12868);
            c2617.f12864 = false;
        }
        ArrayList arrayList = new ArrayList();
        m4118(viewGroup, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m4109((C1692) it.next());
        }
    }

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public static C1692 m4114(ViewGroup viewGroup) {
        C1692 c1692M4114;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof C1692) {
                return (C1692) childAt;
            }
            if ((childAt instanceof ViewGroup) && (c1692M4114 = m4114((ViewGroup) childAt)) != null) {
                return c1692M4114;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m4115(ImageView imageView) {
        int iIntValue;
        int iIntValue2;
        float f = imageView.getResources().getDisplayMetrics().density;
        float f2 = 40.0f * f;
        float f3 = f * 2.5f;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            int i = layoutParams.width;
            Integer numValueOf = Integer.valueOf(i);
            if (i <= 0) {
                numValueOf = null;
            }
            iIntValue = numValueOf != null ? numValueOf.intValue() : imageView.getWidth();
        }
        if (layoutParams != null) {
            int i2 = layoutParams.height;
            Integer numValueOf2 = i2 > 0 ? Integer.valueOf(i2) : null;
            iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : imageView.getHeight();
        }
        return iIntValue > 0 && iIntValue2 > 0 && Math.abs(((float) iIntValue) - f2) <= f3 && Math.abs(((float) iIntValue2) - f2) <= f3;
    }

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public static void m4116(ViewGroup viewGroup, EnumC0868 enumC0868) {
        C2617 c2617;
        Map map = f10614;
        AbstractC2328.m4341(-819152915432302L);
        synchronized (map) {
            c2617 = (C2617) map.get(viewGroup);
        }
        if (c2617 != null && c2617.f12865 != enumC0868) {
            m4113(viewGroup, c2617);
            c2617.f12870 = null;
            AbstractC2328.m4341(-819178685236078L);
            synchronized (map) {
                if (map.get(viewGroup) == c2617) {
                    map.remove(viewGroup);
                }
            }
            c2617 = null;
        }
        if (c2617 == null) {
            C2617 c26172 = new C2617(enumC0868, new ViewOnLayoutChangeListenerC0605(1), new ViewOnAttachStateChangeListenerC1217(1));
            AbstractC2328.m4341(-819204455039854L);
            synchronized (map) {
                AbstractC2328.m4341(-819230224843630L);
                map.put(viewGroup, c26172);
            }
            c2617 = c26172;
        }
        if (m4119(enumC0868)) {
            m4104(viewGroup, c2617, true);
        } else {
            m4113(viewGroup, c2617);
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public static void m4117(ViewGroup viewGroup, ArrayList arrayList) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof ImageView) && !(childAt instanceof C1692)) {
                arrayList.add(childAt);
            }
            if (childAt instanceof ViewGroup) {
                m4117((ViewGroup) childAt, arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public static void m4118(ViewGroup viewGroup, ArrayList arrayList) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof C1692) {
                arrayList.add(childAt);
            } else if (childAt instanceof ViewGroup) {
                m4118((ViewGroup) childAt, arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public static boolean m4119(EnumC0868 enumC0868) {
        Object c2658;
        try {
            C0561 c0561 = C0561.f2672;
            c2658 = Boolean.valueOf(C0561.m1408(enumC0868));
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-819934599480174L) + enumC0868, thM4249);
        }
        Boolean bool = Boolean.FALSE;
        if (c2658 instanceof C2658) {
            c2658 = bool;
        }
        return ((Boolean) c2658).booleanValue();
    }

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public static boolean m4120(ImageView imageView) {
        ViewParent parent = imageView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (viewGroup.getChildAt(i) instanceof ViewStub) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // yyds.AbstractC0145
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo420() {
        Object c2658;
        C0757 c0757M2680 = C1329.f6114.m2680();
        String str = c0757M2680 != null ? c0757M2680.f3503 : null;
        C0757 c0757 = (C0757) AbstractC2104.m4019(-641268254933870L, -641384219050862L);
        String str2 = c0757 != null ? c0757.f3503 : null;
        if (str == null && str2 == null) {
            return;
        }
        if (!f10613) {
            synchronized (this) {
                if (!f10613) {
                    C0561 c0561 = C0561.f2672;
                    C1756 c1756 = new C1756(6);
                    AbstractC2328.m4341(-544429627310958L);
                    C0561.f2669.add(c1756);
                    f10613 = true;
                }
            }
        }
        C2153 c2153 = f10615;
        for (Pair pair : AbstractC2725.m4854(new Pair((C2068) AbstractC2104.m4019(-641929679897454L, -642088593687406L), EnumC0868.f3975), new Pair((C2068) AbstractC2104.m4019(-642307637019502L, -642457960874862L), EnumC0868.f3980))) {
            C2068 c2068 = (C2068) pair.component1();
            EnumC0868 enumC0868 = (EnumC0868) pair.component2();
            if (c2068 != null) {
                String str3 = c2068.f10221;
                try {
                    c2658 = Class.forName(str3, false, c2153.m678());
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                Throwable thM4249 = C2248.m4249(c2658);
                if (thM4249 != null) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-818375526351726L).concat(str3), thM4249);
                }
                if (c2658 instanceof C2658) {
                    c2658 = null;
                }
                Class cls = (Class) c2658;
                if (cls != null) {
                    c2153.getClass();
                    m4105(cls, enumC0868, str, str2);
                }
            }
        }
        m689(EnumC1543.f7489, new C2085(str, 4, str2));
        m689(EnumC1543.f7822, new C2085(str, 5, str2));
    }
}
