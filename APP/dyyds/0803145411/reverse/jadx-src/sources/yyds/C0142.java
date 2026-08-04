package yyds;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: yyds.ᛱᛶᛳᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0142 extends AbstractC0145 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static final ConcurrentHashMap f859;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final Map f860;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static final ConcurrentHashMap.KeySetView f861;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public static volatile Field f862;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final Map f863;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public static volatile Method f864;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public static final ThreadLocal f865;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static final ConcurrentHashMap.KeySetView f866;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static final C0670 f867;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public static volatile Field f868;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public static volatile Method f869;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static final C2668 f870;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final Map f871;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public static volatile Method f872;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public static final ThreadLocal f873;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final Map f874;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final Map f875;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public static volatile boolean f876;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final Map f877;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static final Handler f878;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static final LruCache f879;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C0142 f880;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public static volatile C1278 f881;

    static {
        AbstractC2328.m4341(-832390004638574L);
        AbstractC2328.m4341(-832574688232302L);
        AbstractC2328.m4341(-832755076858734L);
        f880 = new C0142();
        f871 = AbstractC0897.m1993();
        f860 = AbstractC0897.m1993();
        f863 = AbstractC0897.m1993();
        f877 = AbstractC0897.m1993();
        f874 = AbstractC0897.m1993();
        f875 = AbstractC0897.m1993();
        f861 = ConcurrentHashMap.newKeySet();
        f859 = new ConcurrentHashMap();
        f866 = ConcurrentHashMap.newKeySet();
        f879 = new LruCache(128);
        f870 = new C2668();
        f867 = new C0670();
        f878 = new Handler(Looper.getMainLooper());
        f865 = new ThreadLocal();
        f873 = new ThreadLocal();
        Collections.synchronizedMap(new WeakHashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b5  */
    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m631(C0142 c0142, Object obj, C2503 c2503, C1278 c1278, String str, Object obj2, Object obj3, int i) {
        Object c2658;
        String strM4341;
        Object c26582;
        long j;
        int i2;
        ViewGroup viewGroup;
        String str2;
        ImageView imageView;
        ViewGroup viewGroup2;
        int size;
        ConcurrentHashMap.KeySetView keySetView;
        ViewGroup viewGroup3;
        C1606 c1606M655;
        Object c26583;
        Object c26584;
        Object obj4 = (i & 16) != 0 ? null : obj2;
        Object obj5 = (i & 32) != 0 ? null : obj3;
        c0142.getClass();
        try {
            Object obj6 = c1278.f5869.get(obj);
            if (!(obj6 instanceof View)) {
                obj6 = null;
            }
            c2658 = (View) obj6;
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        if (c2658 instanceof C2658) {
            c2658 = null;
        }
        ViewGroup viewGroup4 = c2658 instanceof ViewGroup ? (ViewGroup) c2658 : null;
        if (viewGroup4 == null) {
            m640(obj, str, AbstractC2328.m4341(-826218136634222L));
            return false;
        }
        c2503.f12330 = new WeakReference(viewGroup4);
        if (obj5 == null) {
            if (obj4 == null) {
                try {
                    c26584 = c1278.f5870.get(obj);
                    if (c26584 == null) {
                        c26584 = null;
                    }
                } catch (Throwable th2) {
                    c26584 = new C2658(th2);
                }
                obj4 = c26584 instanceof C2658 ? null : c26584;
                if (obj4 == null) {
                    m640(obj, str, AbstractC2328.m4341(-826243906437998L));
                    return false;
                }
            }
            try {
                c26583 = c1278.f5871.invoke(obj4, null);
            } catch (Throwable th3) {
                c26583 = new C2658(th3);
            }
            Throwable thM4249 = C2248.m4249(c26583);
            if (thM4249 != null) {
                C2336.f11496.m4355(AbstractC2328.m4341(-826299741012846L), thM4249);
            }
            obj5 = c26583 instanceof C2658 ? null : c26583;
            if (obj5 == null) {
                m640(obj, str, AbstractC2328.m4341(-826346985653102L));
                return false;
            }
        }
        List listM638 = m638();
        String strM645 = m645(obj5, listM638);
        int iM657 = m657();
        if (m644(iM657)) {
            strM4341 = iM657 + '|' + strM645;
        } else {
            strM4341 = AbstractC2328.m4341(-826385640358766L);
        }
        String str3 = strM4341;
        WeakReference weakReference = c2503.f12323;
        ImageView imageView2 = weakReference != null ? (ImageView) weakReference.get() : null;
        if (str3.length() > 0 && c2503.f12329 && c2503.f12321.equals(str3)) {
            if ((imageView2 != null ? imageView2.getParent() : null) == viewGroup4) {
                c2503.f12328 = new WeakReference(obj5);
                Map map = f877;
                AbstractC2328.m4341(-826389935326062L);
                synchronized (map) {
                    AbstractC2328.m4341(-826467244737390L);
                    map.put(viewGroup4, new WeakReference(c2503));
                }
                imageView2.setVisibility(0);
                C1606 c1606M6552 = m655(viewGroup4, strM645);
                if (c1606M6552 != null) {
                    C0142 c01422 = f880;
                    long j2 = c2503.f12324;
                    c01422.getClass();
                    m652(viewGroup4, c2503, c1606M6552, j2, iM657);
                }
                String str4 = AbstractC2328.m4341(-827257518719854L) + str + ':' + strM645 + ':' + iM657;
                ConcurrentHashMap.KeySetView keySetView2 = f861;
                if (keySetView2.size() < 64 && keySetView2.add(str4)) {
                    C2336.f11496.m4354(str + AbstractC2328.m4341(-827287583490926L) + iM657 + AbstractC2328.m4341(-827382072771438L) + strM645);
                }
            }
        } else {
            ViewGroup viewGroup5 = viewGroup4;
            c2503.f12324++;
            m660(c2503);
            try {
                WeakReference weakReference2 = c2503.f12323;
                ImageView imageView3 = weakReference2 != null ? (ImageView) weakReference2.get() : null;
                if (imageView3 == null || imageView3.getParent() != viewGroup5) {
                    ViewParent parent = imageView3 != null ? imageView3.getParent() : null;
                    ViewGroup viewGroup6 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(imageView3);
                    }
                    ImageView imageView4 = new ImageView(viewGroup5.getContext());
                    imageView4.setClickable(false);
                    imageView4.setFocusable(false);
                    imageView4.setImportantForAccessibility(2);
                    imageView4.setContentDescription(null);
                    imageView4.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    int i3 = 0;
                    while (i3 < viewGroup5.getChildCount()) {
                        View childAt = viewGroup5.getChildAt(i3);
                        if ((childAt instanceof ViewGroup) || (childAt instanceof ImageView) || childAt.getBackground() != null || childAt.isClickable() || childAt.isFocusable() || childAt.getContentDescription() != null) {
                            break;
                        }
                        i3++;
                    }
                    viewGroup5.addView(imageView4, i3, new ViewGroup.LayoutParams(-1, -1));
                    c26582 = imageView4;
                } else {
                    c26582 = imageView3;
                }
            } catch (Throwable th4) {
                c26582 = new C2658(th4);
            }
            Throwable thM42492 = C2248.m4249(c26582);
            if (thM42492 != null) {
                C2336.f11496.m4355(AbstractC2328.m4341(-826810842121070L), thM42492);
            }
            ImageView imageView5 = (ImageView) (c26582 instanceof C2658 ? null : c26582);
            if (imageView5 == null) {
                m640(obj, str, AbstractC2328.m4341(-826544554148718L));
                return false;
            }
            c2503.f12328 = new WeakReference(obj5);
            c2503.f12323 = new WeakReference(imageView5);
            AbstractC2328.m4341(-910472510079854L);
            c2503.f12325 = strM645;
            c2503.f12329 = true;
            AbstractC2328.m4341(-910506869818222L);
            c2503.f12321 = str3;
            Map map2 = f877;
            AbstractC2328.m4341(-826578913887086L);
            synchronized (map2) {
                AbstractC2328.m4341(-826656223298414L);
                map2.put(viewGroup5, new WeakReference(c2503));
            }
            long j3 = c2503.f12324;
            m658(imageView5);
            if (!m644(iM657) || (c1606M655 = m655(viewGroup5, strM645)) == null) {
                ViewGroup viewGroup7 = viewGroup5;
                j = j3;
                i2 = iM657;
                viewGroup = viewGroup7;
                if (i2 != 1) {
                    m3(imageView5, m634());
                    viewGroup3 = viewGroup;
                } else {
                    if (i2 == 2) {
                        Set set = AbstractC0133.f831;
                        C2578 c2578M579 = AbstractC0133.m579(Collections.singletonList(listM638));
                        if (c2578M579.isEmpty()) {
                            m3(imageView5, -16777216);
                            viewGroup3 = viewGroup;
                        } else {
                            imageView = imageView5;
                            long j4 = j;
                            str2 = strM645;
                            m633(c2503, imageView, c2578M579, str2, j4, 2);
                            viewGroup2 = viewGroup;
                        }
                    } else {
                        long j5 = j;
                        str2 = strM645;
                        imageView = imageView5;
                        if (i2 == 3) {
                            Set set2 = AbstractC0133.f831;
                            C2578 c2578M5792 = AbstractC0133.m579(Collections.singletonList(listM638));
                            if (c2578M5792.isEmpty()) {
                                m3(imageView, -16777216);
                                viewGroup2 = viewGroup;
                            } else {
                                m656(c2503, imageView, c2578M5792, str2, j5);
                                viewGroup2 = viewGroup;
                            }
                        } else if (i2 == 4) {
                            Set set3 = AbstractC0133.f831;
                            C2578 c2578M580 = AbstractC0133.m580(C1860.f9345, Collections.singletonList(listM638));
                            if (c2578M580.isEmpty()) {
                                m3(imageView, -16777216);
                                viewGroup2 = viewGroup;
                            } else {
                                m633(c2503, imageView, c2578M580, str2, j5, 4);
                                viewGroup2 = viewGroup;
                            }
                        } else {
                            if (i2 != 5) {
                                return false;
                            }
                            C1082 c1082 = C1082.f4981;
                            Resources resources = imageView.getResources();
                            AbstractC2328.m4341(-826733532709742L);
                            Drawable drawableM2286 = C1082.m2286(resources);
                            if (drawableM2286 == null) {
                                m3(imageView, -16777216);
                                viewGroup2 = viewGroup;
                            } else {
                                m650(c2503, imageView, drawableM2286, j5);
                                viewGroup2 = viewGroup;
                            }
                        }
                    }
                    size = listM638.size();
                    String str5 = AbstractC2328.m4341(-827012705583982L) + str + ':' + str2 + ':' + m657();
                    keySetView = f861;
                    if (keySetView.size() < 64 && keySetView.add(str5)) {
                        C2336.f11496.m4354(str + AbstractC2328.m4341(-827051360289646L) + m657() + AbstractC2328.m4341(-827124374733678L) + str2 + AbstractC2328.m4341(-827150144537454L) + size + AbstractC2328.m4341(-827184504275822L) + viewGroup2.getClass().getName() + AbstractC2328.m4341(-827218864014190L) + viewGroup2.indexOfChild(imageView) + '/' + viewGroup2.getChildCount());
                    }
                }
                imageView = imageView5;
                str2 = strM645;
                viewGroup2 = viewGroup3;
                size = listM638.size();
                String str52 = AbstractC2328.m4341(-827012705583982L) + str + ':' + str2 + ':' + m657();
                keySetView = f861;
                if (keySetView.size() < 64) {
                    C2336.f11496.m4354(str + AbstractC2328.m4341(-827051360289646L) + m657() + AbstractC2328.m4341(-827124374733678L) + str2 + AbstractC2328.m4341(-827150144537454L) + size + AbstractC2328.m4341(-827184504275822L) + viewGroup2.getClass().getName() + AbstractC2328.m4341(-827218864014190L) + viewGroup2.indexOfChild(imageView) + '/' + viewGroup2.getChildCount());
                }
            } else {
                f880.getClass();
                j = j3;
                i2 = iM657;
                ViewGroup viewGroup8 = viewGroup5;
                viewGroup3 = viewGroup8;
                viewGroup = viewGroup8;
                if (m652(viewGroup5, c2503, c1606M655, j, i2)) {
                    imageView = imageView5;
                    str2 = strM645;
                    viewGroup2 = viewGroup3;
                    size = listM638.size();
                    String str522 = AbstractC2328.m4341(-827012705583982L) + str + ':' + str2 + ':' + m657();
                    keySetView = f861;
                    if (keySetView.size() < 64) {
                    }
                } else {
                    if (i2 != 1) {
                    }
                    imageView = imageView5;
                    str2 = strM645;
                    viewGroup2 = viewGroup3;
                    size = listM638.size();
                    String str5222 = AbstractC2328.m4341(-827012705583982L) + str + ':' + str2 + ':' + m657();
                    keySetView = f861;
                    if (keySetView.size() < 64) {
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public static native Bitmap m632(Bitmap bitmap, String str);

    /* JADX INFO: renamed from: ᛱᲀᲈᛲ, reason: contains not printable characters */
    public static native void m633(C2503 c2503, ImageView imageView, C2578 c2578, String str, long j, int i);

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public static native int m634();

    /* JADX INFO: renamed from: ᛲᛳᛵᛱ, reason: contains not printable characters */
    public static native List m635(Object obj);

    /* JADX INFO: renamed from: ᛲᲀᛲᛲ, reason: contains not printable characters */
    public static native boolean m636(C2503 c2503, ImageView imageView, String str, long j, AbstractC0429 abstractC0429);

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public static native boolean m637(Object obj, String str);

    /* JADX INFO: renamed from: ᛳᛴᲇᛶ, reason: contains not printable characters */
    public static native List m638();

    /* JADX INFO: renamed from: ᛳᛷᛶᛲ, reason: contains not printable characters */
    public static native void m639(String str, C0873 c0873, int i, int i2, C0975 c0975);

    /* JADX INFO: renamed from: ᛴᛸᛴᛸ, reason: contains not printable characters */
    public static native void m640(Object obj, String str, String str2);

    /* JADX INFO: renamed from: ᛴᛸᲁᛵ, reason: contains not printable characters */
    public static native Object m641(Object obj, String str);

    /* JADX INFO: renamed from: ᛵᛲᛵᲁ, reason: contains not printable characters */
    public static final native void m642();

    /* JADX INFO: renamed from: ᛵᲈᲇᛵ, reason: contains not printable characters */
    public static native C2578 m643(Object obj);

    /* JADX INFO: renamed from: ᛶᛴᛱᛲ, reason: contains not printable characters */
    public static native boolean m644(int i);

    /* JADX INFO: renamed from: ᛶᛵᛸᛲ, reason: contains not printable characters */
    public static native String m645(Object obj, List list);

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public static native ImageView m646(Object obj);

    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    public static native boolean m647(Object obj, Class cls, InterfaceC1549 interfaceC1549);

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public static native void m648(Object obj);

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public static final native ArrayList m649(Class cls);

    /* JADX INFO: renamed from: ᛷᲈᛳᛲ, reason: contains not printable characters */
    public static native void m650(C2503 c2503, ImageView imageView, Drawable drawable, long j);

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public static native int m651(Bitmap bitmap);

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public static native boolean m652(ViewGroup viewGroup, C2503 c2503, C1606 c1606, long j, int i);

    /* JADX INFO: renamed from: ᛸᲀᛷᛲ, reason: contains not printable characters */
    public static native C2503 m653(Object obj);

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public static native void m654(ImageView imageView, boolean z);

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public static native C1606 m655(ViewGroup viewGroup, String str);

    /* JADX INFO: renamed from: ᲁᛵᲁᲁ, reason: contains not printable characters */
    public static native void m656(C2503 c2503, ImageView imageView, C2578 c2578, String str, long j);

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public static native int m657();

    /* JADX INFO: renamed from: ᲇᲇᲈᲀ, reason: contains not printable characters */
    public static native void m658(ImageView imageView);

    /* JADX INFO: renamed from: ᲈᛳ */
    public static native void m3(ImageView imageView, int i);

    /* JADX INFO: renamed from: ᲈᛳᛵᛴ, reason: contains not printable characters */
    public static native void m659(C2503 c2503, ImageView imageView, String str, long j);

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public static native void m660(C2503 c2503);

    @Override // yyds.AbstractC0145
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final native void mo420();
}
