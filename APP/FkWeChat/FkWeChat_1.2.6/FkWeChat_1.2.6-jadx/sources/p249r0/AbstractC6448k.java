package p249r0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import okhttp3.C5754i;
import p010a9.InterfaceC0173a;
import p166l2.InterfaceC4553j;
import p248r.InterfaceC6432h;
import p265s1.InterfaceC7143t1;

/* JADX INFO: renamed from: r0.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6448k {
    /* JADX INFO: renamed from: c */
    public static final C6441d m25516c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof C6441d) {
                return (C6441d) childAt;
            }
        }
        C6441d c6441d = new C6441d(viewGroup.getContext());
        viewGroup.addView(c6441d);
        return c6441d;
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC4553j m25517d(InterfaceC6432h interfaceC6432h, boolean z10, float f10, InterfaceC7143t1 interfaceC7143t1, InterfaceC0173a interfaceC0173a) {
        return new C6438a(interfaceC6432h, z10, f10, interfaceC7143t1, interfaceC0173a, null);
    }

    /* JADX INFO: renamed from: e */
    public static final ViewGroup m25518e(View view) {
        Object obj = view;
        while (!(obj instanceof ViewGroup)) {
            ViewParent parent = ((View) obj).getParent();
            if (!(parent instanceof View)) {
                C5754i.m23255a("Couldn't find a valid parent for ", obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                return null;
            }
            obj = parent;
        }
        return (ViewGroup) obj;
    }
}
