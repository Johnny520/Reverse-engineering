package com.abc.core.features;

import android.R;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import de.robv.android.xposed.AbstractC0762d;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: c0.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0693s0 {

    /* JADX INFO: renamed from: b */
    public static volatile Field f2188b;

    /* JADX INFO: renamed from: e */
    public static volatile int f2191e;

    /* JADX INFO: renamed from: f */
    public static volatile boolean f2192f;

    /* JADX INFO: renamed from: a */
    public static final C0693s0 f2187a = new C0693s0();

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f2189c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final Handler f2190d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public static void m1789b(View view, int i2) {
        int iIntValue;
        int iIntValue2;
        if (i2 > 12) {
            return;
        }
        if (view.getVisibility() == 0 && !(view instanceof ViewGroup) && !view.isClickable() && !view.isLongClickable() && view.getAlpha() > 0.01f) {
            int height = view.getHeight();
            Integer numValueOf = Integer.valueOf(height);
            if (height <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Integer numValueOf2 = layoutParams != null ? Integer.valueOf(layoutParams.height) : null;
                iIntValue = numValueOf2 != null ? numValueOf2.intValue() : 0;
            }
            int width = view.getWidth();
            Integer numValueOf3 = Integer.valueOf(width);
            if (width <= 0) {
                numValueOf3 = null;
            }
            if (numValueOf3 != null) {
                iIntValue2 = numValueOf3.intValue();
            } else {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                Integer numValueOf4 = layoutParams2 != null ? Integer.valueOf(layoutParams2.width) : null;
                iIntValue2 = numValueOf4 != null ? numValueOf4.intValue() : 0;
            }
            int iMax = Math.max(4, ((int) (view.getResources().getDisplayMetrics().density * 1.5f)) + 1);
            if (1 <= iIntValue && iIntValue <= iMax) {
                Object parent = view.getParent();
                View view2 = parent instanceof View ? (View) parent : null;
                int width2 = view2 != null ? view2.getWidth() : 0;
                if (iIntValue2 == -1 || width2 <= 0 || iIntValue2 >= width2 / 4) {
                    view.setVisibility(8);
                    return;
                }
            }
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        if (childCount > 120) {
            childCount = 120;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt != null) {
                m1789b(childAt, i2 + 1);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1790c(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-HomeDivider] " + str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1791a(Object obj) {
        Object objM116u;
        Object objM116u2;
        Object objM116u3;
        View view;
        View viewFindViewById;
        try {
            Field field = f2188b;
            Object obj2 = field != null ? field.get(obj) : null;
            objM116u = obj2 instanceof ListView ? (ListView) obj2 : null;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        ListView listView = (ListView) objM116u;
        if (listView != null) {
            try {
                listView.setDivider(null);
            } catch (Throwable th2) {
                AbstractC0040p.m116u(th2);
            }
            try {
                listView.setDividerHeight(0);
            } catch (Throwable th3) {
                AbstractC0040p.m116u(th3);
            }
            int childCount = listView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = listView.getChildAt(i2);
                if (childAt != null) {
                    int i3 = f2191e;
                    if (i3 != 0 && (viewFindViewById = childAt.findViewById(i3)) != null && viewFindViewById.getVisibility() != 8) {
                        viewFindViewById.setVisibility(8);
                    }
                    m1789b(childAt, 0);
                }
            }
        }
        try {
            Object objM887g = AbstractC0358S.m887g(obj, "getView", new Object[0]);
            objM116u2 = objM887g instanceof View ? (View) objM887g : null;
        } catch (Throwable th4) {
            objM116u2 = AbstractC0040p.m116u(th4);
        }
        if (objM116u2 instanceof C0140f) {
            objM116u2 = null;
        }
        View view2 = (View) objM116u2;
        if (view2 == null) {
            try {
                Object objM887g2 = AbstractC0358S.m887g(obj, "findViewById", Integer.valueOf(R.id.content));
                objM116u3 = objM887g2 instanceof View ? (View) objM887g2 : null;
            } catch (Throwable th5) {
                objM116u3 = AbstractC0040p.m116u(th5);
            }
            View view3 = (View) (objM116u3 instanceof C0140f ? null : objM116u3);
            view = listView;
            if (view3 != null) {
                view = view3;
            } else if (listView == null) {
                return;
            }
        } else {
            view = view2;
        }
        m1789b(view, 0);
    }
}
