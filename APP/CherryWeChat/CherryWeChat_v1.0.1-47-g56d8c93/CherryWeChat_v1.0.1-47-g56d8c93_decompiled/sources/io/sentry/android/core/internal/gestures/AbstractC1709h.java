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
    public static final int[] f6183a = new int[2];

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d3  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1903b m3884a(SentryAndroidOptions sentryAndroidOptions, View view, float f, float f2, EnumC1902a enumC1902a) {
        C1903b c1903b;
        List<C1702a> gestureTargetLocators = sentryAndroidOptions.getGestureTargetLocators();
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        C1903b c1903b2 = null;
        while (linkedList.size() > 0) {
            View view2 = (View) linkedList.poll();
            if (view2 != null) {
                int[] iArr = f6183a;
                view2.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                int width = view2.getWidth();
                int height = view2.getHeight();
                if (f >= i && f <= i + width && f2 >= i2 && f2 <= i2 + height) {
                    if (view2 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view2;
                        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                            linkedList.add(viewGroup.getChildAt(i3));
                        }
                    }
                    for (int i4 = 0; i4 < gestureTargetLocators.size(); i4++) {
                        C1702a c1702a = gestureTargetLocators.get(i4);
                        c1702a.getClass();
                        if (enumC1902a == EnumC1902a.CLICKABLE && view2.isClickable() && view2.getVisibility() == 0) {
                            try {
                                c1903b = new C1903b(view2, AbstractC1856a.m4066l(view2), m3885b(view2));
                            } catch (Resources.NotFoundException unused) {
                                c1903b = null;
                            }
                        } else if (enumC1902a != EnumC1902a.SCROLLABLE) {
                            c1903b = null;
                        } else if (((!c1702a.f6165a ? false : ScrollingView.class.isAssignableFrom(view2.getClass())) || AbsListView.class.isAssignableFrom(view2.getClass()) || ScrollView.class.isAssignableFrom(view2.getClass())) && view2.getVisibility() == 0) {
                            c1903b = new C1903b(view2, AbstractC1856a.m4066l(view2), m3885b(view2));
                        }
                        if (c1903b != null) {
                            if (enumC1902a == EnumC1902a.CLICKABLE) {
                                c1903b2 = c1903b;
                            } else if (enumC1902a == EnumC1902a.SCROLLABLE) {
                                return c1903b;
                            }
                        }
                    }
                }
            }
        }
        return c1903b2;
    }

    /* JADX INFO: renamed from: b */
    public static String m3885b(View view) {
        int id = view.getId();
        if (id == -1 || (((-16777216) & id) == 0 && (16777215 & id) != 0)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id) : "";
    }
}
