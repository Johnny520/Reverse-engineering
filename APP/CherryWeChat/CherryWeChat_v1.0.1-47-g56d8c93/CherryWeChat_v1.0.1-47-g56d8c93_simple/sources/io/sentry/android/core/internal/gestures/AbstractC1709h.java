package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.gestures.C1903b;
import io.sentry.internal.gestures.EnumC1902a;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1709h {

    /* JADX INFO: renamed from: a */
    public static final int[] f6183a = null;

    static {
        f6183a = new int[2];
    }

    /* JADX INFO: renamed from: a */
    public static C1903b m3884a(SentryAndroidOptions r10, View r11, float r12, float r13, EnumC1902a r14) {
        List<C1702a> r102 = r10.getGestureTargetLocators();
        LinkedList r0 = new LinkedList();
        r0.add(r11);
        C1903b r1 = null;
    L4:
        if (r0.size() <= 0) goto L60;
        View r2 = (View) r0.poll();
        if (r2 == null) goto L4;
        int[] r3 = f6183a;
        r2.getLocationOnScreen(r3);
        int r5 = r3[0];
        int r32 = r3[1];
        int r7 = r2.getWidth();
        int r8 = r2.getHeight();
        if (r12 < r5) goto L4;
        if (r12 > (r5 + r7)) goto L4;
        if (r13 < r32) goto L4;
        if (r13 > (r32 + r8)) goto L4;
        if ((r2 instanceof ViewGroup) == false) goto L22;
        ViewGroup r33 = (ViewGroup) r2;
        int r52 = 0;
    L20:
        if (r52 >= r33.getChildCount()) goto L22;
        r0.add(r33.getChildAt(r52));
        r52 = r52 + 1;
    L22:
        int r34 = 0;
    L24:
        if (r34 >= r102.size()) goto L4;
        C1702a r53 = r102.get(r34);
        r53.getClass();
        if (r14 != EnumC1902a.CLICKABLE) goto L34;
        if (r2.isClickable() == false) goto L34;
        if (r2.getVisibility() != 0) goto L34;
        C1903b r82 = new C1903b(r2, AbstractC1856a.m4066l(r2), m3885b(r2));     // Catch: Resources.NotFoundException -> L61
    L52:
        if (r82 == null) goto L59;
        if (r14 != EnumC1902a.CLICKABLE) goto L57;
        r1 = r82;
        goto L59
    L57:
        if (r14 != EnumC1902a.SCROLLABLE) goto L59;
        return r82;
    L59:
        r34 = r34 + 1;
    L51:
        r82 = null;
    L34:
        if (r14 != EnumC1902a.SCROLLABLE) goto L51;
        if (r53.f6165a == true) goto L38;
        boolean r54 = false;
    L39:
        if (r54 == true) goto L45;
        if (AbsListView.class.isAssignableFrom(r2.getClass()) == true) goto L45;
        if (ScrollView.class.isAssignableFrom(r2.getClass()) == true) goto L45;
    L47:
        boolean r55 = false;
    L48:
        if (r55 == false) goto L51;
        r82 = new C1903b(r2, AbstractC1856a.m4066l(r2), m3885b(r2));     // Catch: Resources.NotFoundException -> L61
    L45:
        if (r2.getVisibility() != 0) goto L47;
        r55 = true;
        goto L48
    L38:
        r54 = ScrollingView.class.isAssignableFrom(r2.getClass());
        goto L39
    L60:
        return r1;
    }

    /* JADX INFO: renamed from: b */
    public static String m3885b(View r2) {
        int r0 = r2.getId();
        if (r0 == (-1)) goto L15;
        if (((-16777216) & r0) == 0) goto L7;
    L8:
        Resources r22 = r2.getContext().getResources();
        if (r22 != null) goto L11;
        return "";
    L11:
        return r22.getResourceEntryName(r0);
    L7:
        if ((16777215 & r0) == 0) goto L8;
    L15:
        throw new Resources.NotFoundException();
    }
}
