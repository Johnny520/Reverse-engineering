package com.abc.core.features;

import android.view.View;
import android.view.ViewGroup;
import de.robv.android.xposed.AbstractC0762d;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p031Q0.AbstractC0307g;
import p031Q0.C0312l;

/* JADX INFO: renamed from: c0.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0594I {

    /* JADX INFO: renamed from: a */
    public static final C0594I f1812a = new C0594I();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f1813b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f1814c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final Set f1815d;

    /* JADX INFO: renamed from: e */
    public static final Set f1816e;

    /* JADX INFO: renamed from: f */
    public static final AtomicInteger f1817f;

    static {
        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        AbstractC0307g.m702d(setNewSetFromMap, "newSetFromMap(...)");
        f1815d = setNewSetFromMap;
        Set setNewSetFromMap2 = Collections.newSetFromMap(new WeakHashMap());
        AbstractC0307g.m702d(setNewSetFromMap2, "newSetFromMap(...)");
        f1816e = setNewSetFromMap2;
        f1817f = new AtomicInteger(0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m1469a(ViewGroup viewGroup) {
        if (BottomTabConfig.m1809d()) {
            Set set = f1815d;
            synchronized (set) {
                if (set.add(viewGroup)) {
                    viewGroup.post(new RunnableC0579D(viewGroup, 3));
                    viewGroup.postDelayed(new RunnableC0579D(viewGroup, 4), 400L);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1470b(ViewGroup viewGroup) {
        if (BottomTabConfig.m1809d()) {
            if (f1814c.compareAndSet(false, true)) {
                try {
                    C0312l c0312l = new C0312l();
                    m1471c(viewGroup, new SettingsEntryHook(0, c0312l));
                    int iIncrementAndGet = f1817f.incrementAndGet();
                    int i2 = c0312l.f594a;
                    if (i2 > 0 && iIncrementAndGet <= 3) {
                        m1472d("hideTitles count=" + i2 + " (#" + iIncrementAndGet + ")");
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1471c(View view, SettingsEntryHook settingsEntryHook) {
        settingsEntryHook.invoke(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0307g.m702d(childAt, "getChildAt(...)");
                m1471c(childAt, settingsEntryHook);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m1472d(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-BottomTab] " + str);
        } catch (Throwable unused) {
        }
    }
}
