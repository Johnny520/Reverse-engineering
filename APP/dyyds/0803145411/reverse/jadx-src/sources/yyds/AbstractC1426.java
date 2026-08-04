package yyds;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.SeekBar;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: yyds.ᛶᲁᛳᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1426 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final LinkedHashMap f6739 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final int f6740 = AbstractC2328.m4341(-696127872205678L).hashCode();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final int f6741 = AbstractC2328.m4341(-696196591682414L).hashCode();

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final int f6742 = AbstractC2328.m4341(-696278196061038L).hashCode();

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static View m2895(View view, String str) {
        Context context;
        Resources resources;
        AbstractC2328.m4341(-693512237122414L);
        Integer numValueOf = (view == null || (context = view.getContext()) == null || (resources = context.getResources()) == null) ? null : Integer.valueOf(resources.getIdentifier(str, AbstractC2328.m4341(-693542301893486L), view.getContext().getPackageName()));
        if (numValueOf == null || numValueOf.intValue() == 0) {
            return null;
        }
        return view.findViewById(numValueOf.intValue());
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static void m2896(View view) {
        String hexString = Integer.toHexString(System.identityHashCode(view));
        LinkedHashMap linkedHashMap = f6739;
        view.getViewTreeObserver().removeOnDrawListener((ViewTreeObserver.OnDrawListener) linkedHashMap.get(hexString));
        linkedHashMap.remove(hexString);
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static void m2897(View view, InterfaceC1549 interfaceC1549) {
        AbstractC2328.m4341(-693387683070830L);
        AbstractC2328.m4341(-693417747841902L);
        interfaceC1549.mo371(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                AbstractC2328.m4341(-693443517645678L);
                m2897(childAt, interfaceC1549);
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static void m2898(Activity activity, boolean z) {
        if (activity != null) {
            Window window = activity.getWindow();
            AbstractC2328.m4341(-694276741301102L);
            AbstractC2328.m4341(-694246676530030L);
            if (z) {
                window.addFlags(8192);
            } else {
                window.clearFlags(8192);
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m2899(final View view) {
        m2896(view);
        final ViewGroup viewGroup = (ViewGroup) view;
        String hexString = Integer.toHexString(System.identityHashCode(view));
        final C0172 c0172 = new C0172();
        final C0172 c01722 = new C0172();
        ViewTreeObserver.OnDrawListener onDrawListener = new ViewTreeObserver.OnDrawListener() { // from class: yyds.ᛴᛴᛳᲀ
            /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
            @Override // android.view.ViewTreeObserver.OnDrawListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onDraw() {
                int i = AbstractC1426.f6742;
                int i2 = AbstractC1426.f6741;
                int i3 = AbstractC1426.f6740;
                C1509 c1509 = C1509.f7142;
                C1985 c1985 = C1985.f9939;
                boolean zM3848 = c1985.m3848();
                c1509.getClass();
                int iIntValue = zM3848 ? ((Number) C1509.f7124.m1579(C1509.f7179[25])).intValue() : ((Number) C1509.f7242.m1579(C1509.f7179[29])).intValue();
                c1509.getClass();
                float fM3057 = C1509.m3057(iIntValue);
                ViewGroup viewGroup2 = (ViewGroup) view;
                C2807 c2807M1485 = AbstractC0598.m1485(0, viewGroup2.getChildCount());
                int i4 = c2807M1485.f12492;
                int i5 = c2807M1485.f12493;
                if (i4 <= i5) {
                    while (true) {
                        View childAt = viewGroup2.getChildAt(i4);
                        AbstractC2328.m4341(-695341893190510L);
                        C0172 c01723 = c0172;
                        if (c01723.f997 != null) {
                            int id = childAt.getId();
                            Integer num = (Integer) c01723.f997;
                            if (num == null || id != num.intValue()) {
                                if (!(childAt instanceof ViewStub) && childAt.isAttachedToWindow()) {
                                    if ((childAt instanceof ViewGroup) && c01723.f997 == null) {
                                        ViewGroup viewGroup3 = (ViewGroup) childAt;
                                        if (AbstractC1426.m2901(viewGroup3, AbstractC2328.m4341(-695410612667246L)) != null) {
                                            c01723.f997 = Integer.valueOf(viewGroup3.getId());
                                        }
                                    } else {
                                        if (fM3057 != childAt.getAlpha()) {
                                            childAt.setAlpha(fM3057);
                                        }
                                        C1509.f7142.getClass();
                                        if (C1509.m3116()) {
                                            if ((C1509.m3069() && c1985.m3848()) || fM3057 == 0.0f) {
                                                if (childAt.getVisibility() == 0) {
                                                    childAt.setTag(i3, Boolean.TRUE);
                                                    childAt.setTag(i2, Boolean.valueOf(childAt.isClickable()));
                                                    childAt.setTag(i, Boolean.valueOf(childAt.isFocusable()));
                                                    childAt.setClickable(false);
                                                    childAt.setFocusable(false);
                                                    childAt.setVisibility(4);
                                                }
                                            } else if (childAt.getVisibility() == 4 && AbstractC1544.m3188(childAt.getTag(i3), Boolean.TRUE)) {
                                                childAt.setTag(i3, null);
                                                childAt.setVisibility(0);
                                                Object tag = childAt.getTag(i2);
                                                Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                                                childAt.setClickable(bool != null ? bool.booleanValue() : true);
                                                Object tag2 = childAt.getTag(i);
                                                Boolean bool2 = tag2 instanceof Boolean ? (Boolean) tag2 : null;
                                                childAt.setFocusable(bool2 != null ? bool2.booleanValue() : true);
                                            }
                                        }
                                    }
                                }
                            }
                            if (i4 == i5) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                C0172 c01724 = c01722;
                Object obj = c01724.f997;
                ViewGroup viewGroup4 = viewGroup;
                if (obj != null) {
                    View viewM2895 = AbstractC1426.m2895(viewGroup4, ((Integer) obj).toString());
                    if (viewM2895 != null) {
                        AbstractC2758.m4883(viewM2895);
                        return;
                    }
                    return;
                }
                ViewGroup viewGroupM2902 = AbstractC1426.m2902(AbstractC1426.m2901(viewGroup4, AbstractC2328.m4341(-695633950966638L)));
                if (viewGroupM2902 != null) {
                    c01724.f997 = Integer.valueOf(viewGroupM2902.getId());
                    AbstractC2758.m4883(viewGroupM2902);
                }
            }
        };
        LinkedHashMap linkedHashMap = f6739;
        linkedHashMap.putIfAbsent(hexString, onDrawListener);
        viewGroup.getViewTreeObserver().addOnDrawListener((ViewTreeObserver.OnDrawListener) linkedHashMap.get(hexString));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0045  */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m2900(Context context, View view) {
        Object objM1376;
        String strM4341;
        AbstractC2328.m4341(-694478604764014L);
        AbstractC2328.m4341(-694512964502382L);
        C2615.f12860.getClass();
        Object objM4698 = C2615.m4698();
        if (objM4698 != null) {
            int i = AbstractC2293.f11258;
            C1189 c1189M3892 = AbstractC0476.m1327(objM4698).m3892();
            c1189M3892.f12003 = AbstractC2328.m4341(-697631110759278L);
            C0536 c0536 = (C0536) AbstractC1595.m3280(c1189M3892.mo736());
            objM1376 = c0536 != null ? c0536.m1376(new Object[0]) : null;
        }
        if (objM1376 != null) {
            int i2 = AbstractC2293.f11258;
            C0802 c0802M3893 = AbstractC0476.m1327(objM1376).m3893();
            c0802M3893.f12003 = AbstractC2328.m4341(-697592456053614L);
            C1558 c1558 = (C1558) AbstractC1595.m3280(c0802M3893.mo736());
            strM4341 = c1558 != null ? (String) c1558.m3210() : null;
        }
        String strM4715 = C2615.m4715();
        if (C2615.m4715().equals(AbstractC2328.m4341(-697433542263662L))) {
            C0078 c0078 = C2604.f12804;
            C2604.m4681(context, AbstractC2328.m4341(-694534439338862L));
            return false;
        }
        if (strM4341 == null) {
            strM4341 = AbstractC2328.m4341(-694564504109934L);
        }
        AbstractC2328.m4341(-694341165810542L);
        AbstractC2328.m4341(-694371230581614L);
        AbstractC2328.m4341(-694405590319982L);
        AbstractC2328.m4341(-694444245025646L);
        Object tag = view.getTag(R.id.view_ext_watermark_tag);
        C0175 c0175 = tag instanceof C0175 ? (C0175) tag : null;
        if (c0175 != null) {
            AbstractC2328.m4341(-585841701978990L);
            AbstractC2328.m4341(-585880356684654L);
            if (c0175.f1000.equals(strM4341) && c0175.f1001.equals(strM4715)) {
                c0175.f1002.m4781(view);
                return true;
            }
        }
        if (c0175 != null) {
            view.getOverlay().remove(c0175.f1002);
            view.removeOnLayoutChangeListener(c0175.f1003);
        }
        C2683 c2683 = new C2683(strM4341, strM4715);
        ViewOnLayoutChangeListenerC2008 viewOnLayoutChangeListenerC2008 = new ViewOnLayoutChangeListenerC2008(2, c2683);
        view.setTag(R.id.view_ext_watermark_tag, new C0175(strM4341, strM4715, c2683, viewOnLayoutChangeListenerC2008));
        view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC2008);
        c2683.m4781(view);
        view.getOverlay().add(c2683);
        view.post(new RunnableC2696(c2683, 14, view));
        return true;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static View m2901(ViewGroup viewGroup, String str) {
        View viewM2901;
        AbstractC2328.m4341(-694203726857070L);
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getClass().getName().equals(str)) {
                return childAt;
            }
            if ((childAt instanceof ViewGroup) && (viewM2901 = m2901((ViewGroup) childAt, str)) != null) {
                return viewM2901;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static ViewGroup m2902(View view) {
        ViewParent parent;
        if (view == null || (parent = view.getParent()) == null) {
            return null;
        }
        return (ViewGroup) (parent instanceof ViewGroup ? parent : null);
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static int m2903(MotionEvent motionEvent, Context context) {
        AbstractC2328.m4341(-694087762740078L);
        AbstractC2328.m4341(-694117827511150L);
        int i = context.getResources().getDisplayMetrics().widthPixels;
        int i2 = context.getResources().getDisplayMetrics().heightPixels;
        C1509.f7142.getClass();
        int i3 = 1;
        if (C1509.m3098() == 9) {
            int i4 = motionEvent.getRawX() < ((float) (i / 3)) ? 0 : motionEvent.getRawX() < ((float) ((i * 2) / 3)) ? 1 : 2;
            if (motionEvent.getRawY() < i2 / 3) {
                i3 = 0;
            } else if (motionEvent.getRawY() >= (i2 * 2) / 3) {
                i3 = 2;
            }
            return (i3 * 3) + i4;
        }
        boolean z = motionEvent.getRawX() < ((float) (i / 2));
        boolean z2 = motionEvent.getRawY() < ((float) (i2 / 2));
        if (z && z2) {
            return 0;
        }
        if (z || !z2) {
            return (!z || z2) ? 3 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static int m2904(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static int m2905(Context context, float f) {
        AbstractC2328.m4341(-695324713321326L);
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static View m2906(View view) {
        AbstractC2328.m4341(-693022610850670L);
        if (SeekBar.class.isInstance(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            AbstractC2328.m4341(-693052675621742L);
            View viewM2906 = m2906(childAt);
            if (viewM2906 != null) {
                return viewM2906;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static int m2907(Context context, int i) {
        AbstractC2328.m4341(-693864424440686L);
        return (int) (i * context.getResources().getDisplayMetrics().density);
    }
}
