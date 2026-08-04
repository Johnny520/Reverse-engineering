package yyds;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛷᲇᛷᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1664 extends AbstractC0145 {

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public static long f8469;

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public static long f8471;

    /* JADX INFO: renamed from: ᛱᲀᲈᛲ, reason: contains not printable characters */
    public static Method f8472;

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public static Boolean f8474;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public static boolean f8476;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public static C0126 f8478;

    /* JADX INFO: renamed from: ᛲᲀᛲᛲ, reason: contains not printable characters */
    public static Method f8479;

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public static C2410 f8480;

    /* JADX INFO: renamed from: ᛳᛴᲇᛶ, reason: contains not printable characters */
    public static Method f8481;

    /* JADX INFO: renamed from: ᛳᛷᛶᛲ, reason: contains not printable characters */
    public static Field f8482;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public static long f8483;

    /* JADX INFO: renamed from: ᛴᛸᛴᛸ, reason: contains not printable characters */
    public static Field f8485;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static boolean f8487;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public static int f8488;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public static C0993 f8489;

    /* JADX INFO: renamed from: ᛵᲈᲇᛵ, reason: contains not printable characters */
    public static Field f8490;

    /* JADX INFO: renamed from: ᛶᛴᛱᛲ, reason: contains not printable characters */
    public static Method f8492;

    /* JADX INFO: renamed from: ᛶᛵᛸᛲ, reason: contains not printable characters */
    public static Field f8493;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public static C0993 f8495;

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public static C0633 f8496;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public static long f8497;

    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    public static Method f8499;

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public static String f8501;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public static int f8502;

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public static C1684 f8505;

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public static long f8506;

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public static String f8507;

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public static String f8509;

    /* JADX INFO: renamed from: ᲁᛵᲁᲁ, reason: contains not printable characters */
    public static Method f8510;

    /* JADX INFO: renamed from: ᲇᲇᲈᲀ, reason: contains not printable characters */
    public static Method f8514;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public static long f8517;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C1664 f8513 = new C1664();

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final Handler f8494 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final ArrayList f8473 = new ArrayList();

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final WeakHashMap f8477 = new WeakHashMap();

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final WeakHashMap f8504 = new WeakHashMap();

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final WeakHashMap f8498 = new WeakHashMap();

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final WeakHashMap f8500 = new WeakHashMap();

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static WeakReference f8475 = new WeakReference(null);

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static WeakReference f8470 = new WeakReference(null);

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static WeakReference f8484 = new WeakReference(null);

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static WeakReference f8512 = new WeakReference(null);

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static final LinkedHashSet f8491 = new LinkedHashSet();

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static int f8508 = -1;

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public static int f8503 = -1;

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public static List f8516 = C1860.f9345;

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public static WeakReference f8511 = new WeakReference(null);

    /* JADX INFO: renamed from: ᛵᛲᛵᲁ, reason: contains not printable characters */
    public static final RunnableC1128 f8486 = new RunnableC1128(2);

    /* JADX INFO: renamed from: ᲈᛳᛵᛴ, reason: contains not printable characters */
    public static final RunnableC1128 f8515 = new RunnableC1128(3);

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public static String m3381(Object obj) {
        String str;
        if (obj == null) {
            return null;
        }
        Aweme aweme = obj instanceof Aweme ? (Aweme) obj : null;
        if (aweme != null && (str = aweme.aid) != null) {
            return str;
        }
        return obj.getClass().getName() + '@' + System.identityHashCode(obj);
    }

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public static LinearLayout m3382(ViewGroup viewGroup) {
        Object c2658;
        try {
            Field field = f8490;
            Object obj = field != null ? field.get(viewGroup) : null;
            c2658 = obj instanceof LinearLayout ? (LinearLayout) obj : null;
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-844033660978030L), thM4249);
        }
        return (LinearLayout) (c2658 instanceof C2658 ? null : c2658);
    }

    /* JADX INFO: renamed from: ᛱᲀᲈᛲ, reason: contains not printable characters */
    public static Field m3383(C1743 c1743, String str) {
        Object c2658;
        Field fieldM3483;
        if (c1743 != null) {
            try {
                fieldM3483 = C1743.m3483(c1743, f8513.m678());
                fieldM3483.setAccessible(true);
            } catch (Throwable th) {
                c2658 = new C2658(th);
            }
        } else {
            fieldM3483 = null;
        }
        c2658 = fieldM3483;
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null) {
            C2336.f11496.m4355(AbstractC0897.m1988(new StringBuilder(AbstractC2328.m4341(-843874747188078L)), str, -843921991828334L), thM4249);
        }
        return (Field) (c2658 instanceof C2658 ? null : c2658);
    }

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public static void m3384(String str) {
        if (f8476) {
            C2410 c2410 = f8480;
            f8476 = false;
            f8494.removeCallbacks(f8515);
            f8511.clear();
            f8496 = null;
            f8480 = null;
            m3391();
            if (c2410 != null) {
                c2410.mo371(str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX INFO: renamed from: ᛲᲀᛲᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0126 m3385(ViewGroup viewGroup) {
        int iIntValue;
        Integer num;
        Integer num2;
        Object objM672 = AbstractC0145.m672(viewGroup, AbstractC2328.m4341(-846739490374510L), new Object[0]);
        int iIntValue2 = -1;
        if (objM672 != null) {
            String strM4341 = AbstractC2328.m4341(-846812504818542L);
            Object[] objArr = new Object[0];
            try {
                int i = AbstractC2293.f11258;
                C2014 c2014M1327 = AbstractC0476.m1327(objM672);
                ((C0903) c2014M1327.f10074).f4118 = 2;
                C1189 c1189M3892 = c2014M1327.m3892();
                c1189M3892.m4478();
                c1189M3892.f12003 = strM4341;
                AbstractC2328.m4341(-872178581668718L);
                C0536 c0536 = (C0536) AbstractC1595.m3281(c1189M3892.mo736());
                Object objM1372 = c0536 != null ? c0536.m1372(Arrays.copyOf(objArr, 0)) : null;
                if (!(objM1372 instanceof Integer)) {
                    objM1372 = null;
                }
                num2 = (Integer) objM1372;
            } catch (Exception e) {
                C2336.f11496.m4355(AbstractC2328.m4341(-846937058870126L), e);
                num2 = null;
            }
            iIntValue = num2 != null ? num2.intValue() : -1;
        }
        if (objM672 != null) {
            String strM43412 = AbstractC2328.m4341(-847010073314158L);
            Object[] objArr2 = new Object[0];
            try {
                int i2 = AbstractC2293.f11258;
                C2014 c2014M13272 = AbstractC0476.m1327(objM672);
                ((C0903) c2014M13272.f10074).f4118 = 2;
                C1189 c1189M38922 = c2014M13272.m3892();
                c1189M38922.m4478();
                c1189M38922.f12003 = strM43412;
                AbstractC2328.m4341(-872178581668718L);
                C0536 c05362 = (C0536) AbstractC1595.m3281(c1189M38922.mo736());
                Object objM13722 = c05362 != null ? c05362.m1372(Arrays.copyOf(objArr2, 0)) : null;
                if (!(objM13722 instanceof Integer)) {
                    objM13722 = null;
                }
                num = (Integer) objM13722;
            } catch (Exception e2) {
                C2336.f11496.m4355(AbstractC2328.m4341(-847130332398446L), e2);
                num = null;
            }
            if (num != null) {
                iIntValue2 = num.intValue();
            }
        }
        int i3 = iIntValue2;
        View childAt = viewGroup.getChildAt(0);
        int top = childAt != null ? childAt.getTop() : 0;
        Object objM3396 = m3396(viewGroup);
        View view = objM3396 instanceof View ? (View) objM3396 : null;
        int scrollY = view != null ? view.getScrollY() : Integer.MIN_VALUE;
        if (iIntValue >= 0 || i3 >= 0 || viewGroup.getChildCount() != 0) {
            return new C0126(iIntValue, i3, top, viewGroup.getChildCount(), scrollY);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2235 m3386(Object obj, boolean z) {
        Object c2658;
        Object c26582;
        Object c26583;
        Object c26584;
        C2708 c2708;
        List list;
        try {
            Method method = f8479;
            c2658 = method != null ? method.invoke(obj, null) : null;
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-844742330581870L), thM4249);
        }
        if (c2658 instanceof C2658) {
            c2658 = null;
        }
        if (c2658 == null) {
            c2708 = null;
        } else {
            try {
                Method method2 = f8510;
                Object objInvoke = method2 != null ? method2.invoke(c2658, null) : null;
                c26582 = objInvoke instanceof List ? (List) objInvoke : null;
                if (c26582 == null) {
                    c26582 = C1860.f9345;
                }
            } catch (Throwable th2) {
                c26582 = new C2658(th2);
            }
            Throwable thM42492 = C2248.m4249(c26582);
            if (thM42492 != null) {
                C2336.f11496.m4355(AbstractC2328.m4341(-844815345025902L), thM42492);
            }
            if (c26582 instanceof C2658) {
                c26582 = null;
            }
            List list2 = (List) c26582;
            if (list2 != null) {
                try {
                    Method method3 = f8492;
                    Object objInvoke2 = method3 != null ? method3.invoke(c2658, null) : null;
                    c26583 = objInvoke2 instanceof Boolean ? (Boolean) objInvoke2 : null;
                } catch (Throwable th3) {
                    c26583 = new C2658(th3);
                }
                Throwable thM42493 = C2248.m4249(c26583);
                if (thM42493 != null) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-844888359469934L), thM42493);
                }
                if (c26583 instanceof C2658) {
                    c26583 = null;
                }
                Boolean bool = (Boolean) c26583;
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    try {
                        Method method4 = f8472;
                        Object objInvoke3 = method4 != null ? method4.invoke(c2658, null) : null;
                        c26584 = objInvoke3 instanceof Boolean ? (Boolean) objInvoke3 : null;
                    } catch (Throwable th4) {
                        c26584 = new C2658(th4);
                    }
                    Throwable thM42494 = C2248.m4249(c26584);
                    if (thM42494 != null) {
                        C2336.f11496.m4355(AbstractC2328.m4341(-844961373913966L), thM42494);
                    }
                    if (c26584 instanceof C2658) {
                        c26584 = null;
                    }
                    Boolean bool2 = (Boolean) c26584;
                    if (bool2 != null) {
                        c2708 = new C2708(list2, zBooleanValue, bool2.booleanValue());
                    }
                }
            }
        }
        if (c2708 == null) {
            return null;
        }
        boolean z2 = c2708.f13292;
        List list3 = c2708.f13290;
        Object objM3281 = AbstractC1595.m3281(list3);
        Object objM3276 = AbstractC1595.m3276(list3.size() / 2, list3);
        Object objM3261 = AbstractC1595.m3261(list3);
        String strM3381 = m3381(objM3281);
        String strM33812 = m3381(objM3276);
        String strM33813 = m3381(objM3261);
        boolean z3 = z && AbstractC1544.m3188(f8474, Boolean.TRUE) && !z2;
        if (z) {
            f8474 = Boolean.valueOf(z2);
        }
        if (z && !z3 && f8503 == list3.size() && AbstractC1544.m3188(f8507, strM3381) && AbstractC1544.m3188(f8509, strM33812) && AbstractC1544.m3188(f8501, strM33813)) {
            list = f8516;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list3) {
                if (obj2 instanceof Aweme) {
                    arrayList.add(obj2);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                Aweme aweme = (Aweme) obj3;
                String strValueOf = aweme.aid;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(System.identityHashCode(aweme));
                }
                if (hashSet.add(strValueOf)) {
                    arrayList2.add(obj3);
                }
            }
            if (z) {
                f8503 = list3.size();
                f8507 = strM3381;
                f8509 = strM33812;
                f8501 = strM33813;
                f8516 = arrayList2;
                f8471++;
            }
            list = arrayList2;
        }
        return new C2235(list, c2708.f13291, z2);
    }

    /* JADX INFO: renamed from: ᛳᛴᲇᛶ, reason: contains not printable characters */
    public static /* synthetic */ void m3387(C1664 c1664, EnumC0676 enumC0676, int i) {
        boolean z = (i & 1) == 0;
        if ((i & 2) != 0) {
            enumC0676 = EnumC0676.f3220;
        }
        c1664.getClass();
        m3392(z, enumC0676);
    }

    /* JADX INFO: renamed from: ᛳᛷᛶᛲ, reason: contains not printable characters */
    public static void m3388() {
        Handler handler = f8494;
        RunnableC1128 runnableC1128 = f8486;
        handler.removeCallbacks(runnableC1128);
        handler.postDelayed(runnableC1128, 450L);
    }

    /* JADX INFO: renamed from: ᛴᛸᛴᛸ, reason: contains not printable characters */
    public static void m3389(EnumC0676 enumC0676) {
        C0302 c0302 = (C0302) f8484.get();
        if (c0302 != null) {
            int i = C0302.f1594;
            c0302.m967(enumC0676, 0L);
            c0302.setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: ᛵᲈᲇᛵ, reason: contains not printable characters */
    public static C0302 m3390(Object obj) {
        ImageView imageViewM3402;
        int i;
        Drawable drawableNewDrawable;
        Drawable drawableMutate;
        C0302 c0302;
        ViewGroup viewGroupM3397 = m3397(obj);
        if (viewGroupM3397 != null) {
            f8498.put(viewGroupM3397, new WeakReference(obj));
            LinearLayout linearLayoutM3382 = m3382(viewGroupM3397);
            if (linearLayoutM3382 != null && (imageViewM3402 = m3402(viewGroupM3397)) != null) {
                WeakHashMap weakHashMap = f8477;
                WeakReference weakReference = (WeakReference) weakHashMap.get(viewGroupM3397);
                if (weakReference != null && (c0302 = (C0302) weakReference.get()) != null) {
                    C0302 c03022 = c0302.getParent() == linearLayoutM3382 ? c0302 : null;
                    if (c03022 != null) {
                        return c03022;
                    }
                }
                weakHashMap.remove(viewGroupM3397);
                int iM2904 = AbstractC1426.m2904(32);
                int iM29042 = AbstractC1426.m2904(6);
                Context context = viewGroupM3397.getContext();
                AbstractC2328.m4341(-844196869735278L);
                C0302 c03023 = new C0302(context);
                c03023.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                c03023.setPadding(iM29042, iM29042, iM29042, iM29042);
                c03023.setClickable(true);
                c03023.setFocusable(true);
                c03023.setVisibility(8);
                Drawable drawable = imageViewM3402.getDrawable();
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null && (drawableNewDrawable = constantState.newDrawable(viewGroupM3397.getResources())) != null && (drawableMutate = drawableNewDrawable.mutate()) != null) {
                        drawable = drawableMutate;
                    }
                    c03023.setImageDrawable(drawable);
                }
                TypedValue typedValue = new TypedValue();
                if (c03023.getContext().getTheme().resolveAttribute(R.attr.selectableItemBackgroundBorderless, typedValue, true) && (i = typedValue.resourceId) != 0) {
                    c03023.setBackgroundResource(i);
                }
                c03023.setOnClickListener(new ViewOnClickListenerC1462(14, c03023));
                linearLayoutM3382.setOrientation(0);
                ViewGroup.LayoutParams layoutParams = linearLayoutM3382.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = AbstractC1426.m2904(32);
                    linearLayoutM3382.setLayoutParams(layoutParams);
                }
                linearLayoutM3382.addView(c03023, new LinearLayout.LayoutParams(iM2904, -1));
                weakHashMap.put(viewGroupM3397, new WeakReference(c03023));
                return c03023;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛶᛴᛱᛲ, reason: contains not printable characters */
    public static void m3391() {
        f8503 = -1;
        f8507 = null;
        f8509 = null;
        f8501 = null;
        f8516 = C1860.f9345;
        f8474 = null;
        f8471 = 0L;
        f8505 = null;
    }

    /* JADX INFO: renamed from: ᛶᛵᛸᛲ, reason: contains not printable characters */
    public static void m3392(boolean z, EnumC0676 enumC0676) {
        ViewGroup viewGroup = (ViewGroup) f8470.get();
        if (z && viewGroup != null) {
            AbstractC0145.m672(viewGroup, AbstractC2328.m4341(-846039410705262L), new Object[0]);
        }
        f8487 = false;
        f8494.removeCallbacks(f8486);
        C0302 c0302 = (C0302) f8484.get();
        if (c0302 != null) {
            int iOrdinal = enumC0676.ordinal();
            if (iOrdinal == 3) {
                c0302.m967(enumC0676, 1100L);
            } else if (iOrdinal != 4) {
                int i = C0302.f1594;
                c0302.m967(enumC0676, 0L);
            } else {
                c0302.m967(enumC0676, 1400L);
            }
            c0302.setAlpha(1.0f);
        }
        f8484.clear();
        f8475.clear();
        f8470.clear();
        f8512.clear();
        f8495 = null;
        f8489 = null;
        f8478 = null;
        f8517 = 0L;
        f8488 = 0;
    }

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public static boolean m3393(ViewGroup viewGroup) {
        String strM4341 = AbstractC2328.m4341(-848663635723118L);
        Object[] objArr = new Object[0];
        Integer num = null;
        try {
            int i = AbstractC2293.f11258;
            C2014 c2014M1327 = AbstractC0476.m1327(viewGroup);
            ((C0903) c2014M1327.f10074).f4118 = 2;
            C1189 c1189M3892 = c2014M1327.m3892();
            c1189M3892.m4478();
            c1189M3892.f12003 = strM4341;
            AbstractC2328.m4341(-872178581668718L);
            C0536 c0536 = (C0536) AbstractC1595.m3281(c1189M3892.mo736());
            Object objM1372 = c0536 != null ? c0536.m1372(Arrays.copyOf(objArr, 0)) : null;
            if (!(objM1372 instanceof Integer)) {
                objM1372 = null;
            }
            num = (Integer) objM1372;
        } catch (Exception e) {
            C2336.f11496.m4355(AbstractC2328.m4341(-848728060232558L), e);
        }
        return (num != null ? num.intValue() : 0) == 0;
    }

    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    public static C0921 m3394(Object obj) {
        Object c2658;
        Object c26582;
        Object c26583;
        Object c26584;
        try {
            Method method = f8479;
            c2658 = method != null ? method.invoke(obj, null) : null;
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-846447432598382L), thM4249);
        }
        if (c2658 instanceof C2658) {
            c2658 = null;
        }
        if (c2658 == null) {
            return null;
        }
        try {
            Method method2 = f8472;
            Object objInvoke = method2 != null ? method2.invoke(c2658, null) : null;
            c26582 = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
        } catch (Throwable th2) {
            c26582 = new C2658(th2);
        }
        Throwable thM42492 = C2248.m4249(c26582);
        if (thM42492 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-846520447042414L), thM42492);
        }
        if (c26582 instanceof C2658) {
            c26582 = null;
        }
        Boolean bool = (Boolean) c26582;
        if (bool == null) {
            return null;
        }
        boolean zBooleanValue = bool.booleanValue();
        try {
            Method method3 = f8492;
            Object objInvoke2 = method3 != null ? method3.invoke(c2658, null) : null;
            c26583 = objInvoke2 instanceof Boolean ? (Boolean) objInvoke2 : null;
        } catch (Throwable th3) {
            c26583 = new C2658(th3);
        }
        Throwable thM42493 = C2248.m4249(c26583);
        if (thM42493 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-846593461486446L), thM42493);
        }
        if (c26583 instanceof C2658) {
            c26583 = null;
        }
        Boolean bool2 = (Boolean) c26583;
        if (bool2 == null) {
            return null;
        }
        boolean zBooleanValue2 = bool2.booleanValue();
        try {
            Method method4 = f8510;
            Object objInvoke3 = method4 != null ? method4.invoke(c2658, null) : null;
            c26584 = objInvoke3 instanceof List ? (List) objInvoke3 : null;
        } catch (Throwable th4) {
            c26584 = new C2658(th4);
        }
        Throwable thM42494 = C2248.m4249(c26584);
        if (thM42494 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-846666475930478L), thM42494);
        }
        if (c26584 instanceof C2658) {
            c26584 = null;
        }
        List list = (List) c26584;
        if (list == null) {
            return null;
        }
        return new C0921(zBooleanValue2, zBooleanValue, new C0993(list.size(), m3381(AbstractC1595.m3261(list))));
    }

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public static final void m3395(LinkedHashSet linkedHashSet, Class cls) {
        Class<?>[] interfaces = cls.getInterfaces();
        AbstractC2328.m4341(-849389485196142L);
        for (Class<?> cls2 : interfaces) {
            if (linkedHashSet.add(cls2)) {
                m3395(linkedHashSet, cls2);
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            m3395(linkedHashSet, superclass);
        }
    }

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public static ViewParent m3396(ViewGroup viewGroup) {
        Class<?> declaringClass;
        Method method = f8481;
        if (method == null || (declaringClass = method.getDeclaringClass()) == null) {
            return null;
        }
        for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
            if (declaringClass.isInstance(parent)) {
                return parent;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public static ViewGroup m3397(Object obj) {
        Object c2658;
        try {
            Field field = f8485;
            Object obj2 = field != null ? field.get(obj) : null;
            c2658 = obj2 instanceof ViewGroup ? (ViewGroup) obj2 : null;
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-843934876730222L), thM4249);
        }
        return (ViewGroup) (c2658 instanceof C2658 ? null : c2658);
    }

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public static void m3398(C2235 c2235) {
        List list = c2235.f11036;
        C1684 c1684 = new C1684(list.size(), m3381(AbstractC1595.m3281(list)), m3381((Aweme) AbstractC1595.m3276(list.size() / 2, list)), m3381(AbstractC1595.m3261(list)), c2235.f11037, c2235.f11038, f8471);
        if (c1684.equals(f8505)) {
            return;
        }
        f8505 = c1684;
        C0633 c0633 = f8496;
        if (c0633 != null) {
            c0633.mo371(c2235);
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public static void m3399(String str) {
        m3392(true, EnumC0676.f3219);
        AbstractC1960.m3789(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0053  */
    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Method m3400(ViewParent viewParent) throws NoSuchMethodException {
        Object next;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m3395(linkedHashSet, viewParent.getClass());
        int i = 1;
        C0969 c0969 = new C0969(new C1119(AbstractC1529.m3164(AbstractC1529.m3163(AbstractC1529.m3160(new C0558(i, linkedHashSet), new C0514(0)), new C0514(i)), new C2713(12, viewParent))), new C0514(15));
        if (c0969.hasNext()) {
            next = c0969.next();
            if (c0969.hasNext()) {
            }
        } else {
            next = null;
        }
        Method method = (Method) next;
        if (method != null) {
            return method;
        }
        Method method2 = ViewGroup.class.getMethod(AbstractC2328.m4341(-846249864102766L), MotionEvent.class);
        Class<?> cls = viewParent.getClass();
        String name = method2.getName();
        Class<?>[] parameterTypes = method2.getParameterTypes();
        Method method3 = cls.getMethod(name, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        String name2 = method3.getDeclaringClass().getName();
        AbstractC2328.m4341(-846331468481390L);
        if (name2.startsWith(AbstractC2328.m4341(-846387303056238L))) {
            return null;
        }
        return method3;
    }

    /* JADX INFO: renamed from: ᲁᛵᲁᲁ, reason: contains not printable characters */
    public static Method m3401(C0757 c0757, String str) {
        Object c2658;
        Method methodM1702;
        if (c0757 != null) {
            try {
                methodM1702 = C0757.m1702(c0757, f8513.m678());
                methodM1702.setAccessible(true);
            } catch (Throwable th) {
                c2658 = new C2658(th);
            }
        } else {
            methodM1702 = null;
        }
        c2658 = methodM1702;
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null) {
            C2336.f11496.m4355(AbstractC0897.m1988(new StringBuilder(AbstractC2328.m4341(-843814617645934L)), str, -843861862286190L), thM4249);
        }
        return (Method) (c2658 instanceof C2658 ? null : c2658);
    }

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public static ImageView m3402(ViewGroup viewGroup) {
        Object c2658;
        try {
            Field field = f8493;
            Object obj = field != null ? field.get(viewGroup) : null;
            c2658 = obj instanceof ImageView ? (ImageView) obj : null;
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-844115265356654L), thM4249);
        }
        return (ImageView) (c2658 instanceof C2658 ? null : c2658);
    }

    /* JADX INFO: renamed from: ᲇᲇᲈᲀ, reason: contains not printable characters */
    public static void m3403(Object obj, boolean z) {
        ImageView imageViewM3402;
        ViewGroup viewGroupM3397 = m3397(obj);
        if (viewGroupM3397 == null || m3390(obj) == null || !AbstractC1544.m3188(f8504.get(viewGroupM3397), Boolean.TRUE) || (imageViewM3402 = m3402(viewGroupM3397)) == null) {
            return;
        }
        viewGroupM3397.clearAnimation();
        viewGroupM3397.setVisibility(0);
        imageViewM3402.setVisibility(z ? 0 : 4);
    }

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public static C1101 m3404() {
        Object objPrevious;
        C0179 c0179 = new C0179(29);
        ArrayList arrayList = f8473;
        AbstractC1432.m2926(arrayList, c0179);
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            ViewGroup viewGroup = (ViewGroup) ((C1101) objPrevious).f5067.get();
            if (viewGroup != null && viewGroup.isAttachedToWindow() && viewGroup.isShown() && viewGroup.getWindowVisibility() == 0 && viewGroup.getGlobalVisibleRect(new Rect())) {
                break;
            }
        }
        return (C1101) objPrevious;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX INFO: renamed from: ᛵᛲᛵᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3405(Object obj, Object obj2) {
        C0302 c0302M3390;
        LinearLayout linearLayoutM3382;
        ImageView imageViewM3402;
        ViewParent viewParent;
        boolean z;
        ViewGroup viewGroupM3397 = m3397(obj);
        if (viewGroupM3397 == null || (c0302M3390 = m3390(obj)) == null || (linearLayoutM3382 = m3382(viewGroupM3397)) == null || (imageViewM3402 = m3402(viewGroupM3397)) == null) {
            return;
        }
        if (obj2 == null) {
            z = false;
        } else {
            C0179 c0179 = new C0179(28);
            ArrayList arrayList = f8473;
            AbstractC1432.m2926(arrayList, c0179);
            String strM4341 = AbstractC2328.m4341(-844265589212014L);
            Object[] objArr = new Object[0];
            try {
                int i = AbstractC2293.f11258;
                C2014 c2014M1327 = AbstractC0476.m1327(obj2);
                ((C0903) c2014M1327.f10074).f4118 = 2;
                C1189 c1189M3892 = c2014M1327.m3892();
                c1189M3892.m4478();
                c1189M3892.f12003 = strM4341;
                AbstractC2328.m4341(-872178581668718L);
                C0536 c0536 = (C0536) AbstractC1595.m3281(c1189M3892.mo736());
                Object objM1372 = c0536 != null ? c0536.m1372(Arrays.copyOf(objArr, 0)) : null;
                if (!(objM1372 instanceof View)) {
                    objM1372 = null;
                }
                viewParent = (View) objM1372;
            } catch (Exception e) {
                C2336.f11496.m4355(AbstractC2328.m4341(-844299948950382L), e);
                viewParent = null;
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                loop0: while (it.hasNext()) {
                    ViewGroup viewGroup = (ViewGroup) ((C1101) it.next()).f5067.get();
                    if (viewGroup != null && viewParent != null) {
                        f8513.getClass();
                        if (viewGroup != viewParent) {
                            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                                if (parent != viewParent) {
                                }
                            }
                        }
                        z = true;
                        break;
                    }
                }
                z = false;
            }
        }
        WeakHashMap weakHashMap = f8500;
        if (obj2 == null) {
            weakHashMap.remove(viewGroupM3397);
        } else {
            weakHashMap.put(viewGroupM3397, new WeakReference(obj2));
        }
        f8504.put(viewGroupM3397, Boolean.valueOf(z));
        c0302M3390.setVisibility(z ? 0 : 8);
        ViewGroup.LayoutParams layoutParams = linearLayoutM3382.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = AbstractC1426.m2904(z ? 64 : 32);
            linearLayoutM3382.setLayoutParams(layoutParams);
        }
        if (z) {
            return;
        }
        if (f8487) {
            m3387(this, null, 2);
        }
        imageViewM3402.setVisibility(0);
    }

    @Override // yyds.AbstractC0145
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo420() {
        C1329 c1329 = C1329.f6114;
        C0757 c0757 = (C0757) AbstractC2104.m4019(-657022194975598L, -657142454059886L);
        C0757 c07572 = (C0757) AbstractC2104.m4019(-657189698700142L, -657288482947950L);
        C0757 c07573 = (C0757) AbstractC2104.m4019(-657335727588206L, -657447396737902L);
        C0757 c07574 = (C0757) AbstractC2104.m4019(-657494641378158L, -657610605495150L);
        C0757 c07575 = (C0757) AbstractC2104.m4019(-657657850135406L, -657782404186990L);
        C0757 c07576 = (C0757) AbstractC2104.m4019(-657829648827246L, -657937023009646L);
        f8499 = m3401(c07572, AbstractC2328.m4341(-843359351112558L));
        f8479 = m3401(c07573, AbstractC2328.m4341(-843402300785518L));
        f8492 = m3401(c07574, AbstractC2328.m4341(-843432365556590L));
        f8472 = m3401(c07575, AbstractC2328.m4341(-843479610196846L));
        f8510 = m3401(c07576, AbstractC2328.m4341(-843526854837102L));
        f8482 = m3383((C1743) AbstractC2104.m4019(-657984267649902L, -658104526734190L), AbstractC2328.m4341(-843556919608174L));
        f8485 = m3383((C1743) AbstractC2104.m4019(-659466031367022L, -659586290451310L), AbstractC2328.m4341(-843625639084910L));
        f8490 = m3383((C1743) AbstractC2104.m4019(-659633535091566L, -659775269012334L), AbstractC2328.m4341(-843668588757870L));
        f8493 = m3383((C1743) AbstractC2104.m4019(-659822513652590L, -659934182802286L), AbstractC2328.m4341(-843698653528942L));
        f8481 = m3401((C0757) AbstractC2104.m4019(-659981427442542L, -660110276461422L), AbstractC2328.m4341(-843728718300014L));
        f8514 = m3401((C0757) AbstractC2104.m4019(-660157521101678L, -660277780185966L), AbstractC2328.m4341(-843775962940270L));
        int i = 26;
        m675(c0757, null, new C0179(26));
        String strM4341 = AbstractC2328.m4341(-658851851043694L);
        AbstractC2328.m4341(-658959225226094L);
        m675((C0757) C1586.m3253(strM4341), null, new C0514(2));
        String strM43412 = AbstractC2328.m4341(-659006469866350L);
        AbstractC2328.m4341(-659126728950638L);
        C0757 c07577 = (C0757) C1586.m3253(strM43412);
        AbstractC2328.m4341(-990900067664750L);
        C1329 c13292 = C1329.f6114;
        if (c07577 != null) {
            C0213 c0213M4006 = AbstractC2104.m4006(-848994348204910L);
            c0213M4006.m871(new C0179(27));
            m682(c07577.m1704() ? c07577.m1703(m678()) : C0757.m1702(c07577, m678()), null, new C0052(i, c0213M4006));
        }
        m687((C0757) AbstractC2104.m4019(-659173973590894L, -659272757838702L), null, new C0514(3));
        String strM43413 = AbstractC2328.m4341(-659320002478958L);
        AbstractC2328.m4341(-659418786726766L);
        m675((C0757) C1586.m3253(strM43413), null, new C0514(4));
    }
}
