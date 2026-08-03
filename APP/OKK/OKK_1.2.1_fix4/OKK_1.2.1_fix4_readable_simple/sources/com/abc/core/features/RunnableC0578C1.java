package com.abc.core.features;

import android.app.Activity;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p009E0.AbstractC0181l;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: c0.C1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0578C1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f1717a;

    public /* synthetic */ RunnableC0578C1(float r1) {
        this.f1717a = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set r02 = WallpaperOverlayHook.f1799h.keySet();
        AbstractC0307g.m702d(r02, "<get-keys>(...)");
        Iterator r03 = AbstractC0181l.m553y0(r02).iterator();
    L3:
        boolean r1 = r03.hasNext();
        Object r2 = WallpaperOverlayHook.f1792a;
        if (r1 == false) goto L13;
        Activity r12 = (Activity) r03.next();
        if (r12.isFinishing() == true) goto L3;
        if (AbstractC0425j.m1005J0(r12.getClass().getName(), "LauncherUI", false) == false) goto L3;
        if (WallpaperOverlayHook.m1458p(r12) == true) goto L11;
        WallpaperOverlayHook.m1443a(r12);
        goto L3
    L11:
        WallpaperOverlayHook.m1453k(r12);
        goto L3
    L13:
        Set r04 = WallpaperOverlayHook.f1797f.entrySet();
        AbstractC0307g.m702d(r04, "<get-entries>(...)");
        Iterator r05 = AbstractC0181l.m553y0(r04).iterator();
    L15:
        if (r05.hasNext() == false) goto L26;
        Object r13 = r05.next();
        AbstractC0307g.m702d(r13, "next(...)");
        Map.Entry r14 = (Map.Entry) r13;
        Activity r4 = (Activity) r14.getKey();
        WeakReference r15 = (WeakReference) r14.getValue();
        if (r4.isFinishing() == true) goto L15;
        ImageView r16 = (ImageView) r15.get();
        if (r16 == null) goto L15;
        if (AbstractC0425j.m1005J0(r4.getClass().getName(), "LauncherUI", false) == false) goto L25;
        if (WallpaperOverlayHook.m1458p(r4) == false) goto L25;
        WallpaperOverlayHook.m1453k(r4);
    L25:
        r16.setAlpha(this.f1717a);
        r16.setVisibility(0);
        WallpaperOverlayHook.m1460r(r16);
        goto L15
    }
}
