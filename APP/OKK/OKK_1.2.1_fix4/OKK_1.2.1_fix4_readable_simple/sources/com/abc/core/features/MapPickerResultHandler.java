package com.abc.core.features;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import com.abc.loader.ModernHookEntry;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import p001A0.AbstractC0040p;
import p007D0.C0139e;
import p007D0.C0140f;
import p026N0.AbstractC0270k;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0416a;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0432q;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.O1 */
/* JADX INFO: loaded from: classes.dex */
public final class MapPickerResultHandler extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1894b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0617P1 f1895c;

    public MapPickerResultHandler(int r1) {
        this.f1894b = r1;
        switch(r1) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        this.f1895c = C0617P1.f1903a;
        return;
    L6:
        this.f1895c = C0617P1.f1903a;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public final void mo1385a(C0760b r20) {
        C0617P1 r5 = this.f1895c;
        C0139e r8 = null;
        String r82 = null;
        r8 = null;
        r8 = null;
        switch(this.f1894b) {
            case 0: goto L47;
            default: goto L4;
        };
    L4:
        Object r02 = r20.f2669b;
        if ((r02 instanceof Activity) == false) goto L7;
        Activity r9 = (Activity) r02;
    L8:
        if (r9 != null) goto L11;
        return;
    L11:
        if (AbstractC0307g.m699a(r9.getPackageName(), ModernHookEntry.WECHAT_PACKAGE) == true) goto L14;
        return;
    L14:
        if (AbstractC0425j.m1005J0(r9.getClass().getName(), "RedirectUI", false) == true) goto L144;
        r5.getClass();
        VirtualLocationHook r03 = VirtualLocationHook.f1854a;
        File r52 = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "map_pick_request");
        if (r52.isFile() == false) goto L145;
        Object r04 = AbstractC0270k.m692i0(r52, AbstractC0416a.f921a);     // Catch: Throwable -> L21
    L23:
        boolean r4 = r04 instanceof C0140f;
        Object r05 = r04;
        if (r4 == false) goto L26;
        r05 = null;
    L26:
        String r06 = (String) r05;
        if (r06 == null) goto L146;
        Iterator r07 = AbstractC0425j.m1014S0(r06).iterator();
    L31:
        if (r07.hasNext() == false) goto L35;
        String r42 = (String) r07.next();
        AbstractC0307g.m703e(r42, "it");
        String r43 = AbstractC0425j.m1022a1(r42).toString();
        if (AbstractC0433r.m1033H0(r43, "ts=", false) == false) goto L31;
        r82 = r43;
    L35:
        if (r82 == null) goto L39;
        Long r08 = AbstractC0432q.m1027B0(AbstractC0425j.m1016U0(r82, "ts="));
        if (r08 == null) goto L39;
        long r3 = r08.longValue();
    L41:
        if ((System.currentTimeMillis() - r3) <= 120000) goto L43;
        return;
    L43:
        if (C0617P1.f1905c.compareAndSet(false, true) == false) goto L147;
        C0617P1.f1906d.post(new RunnableC0701v(r9, 8));
        return;
    L147:
        return;
    L39:
        r3 = r52.lastModified();
        goto L41
    L146:
        return;
    L21:
        th = move-exception;
        r04 = AbstractC0040p.m116u(th);
        goto L23
    L145:
        return;
    L144:
        return;
    L7:
        r9 = null;
        goto L8
    L47:
        Object r92 = r20.f2669b;
        if ((r92 instanceof Activity) == false) goto L50;
        Activity r93 = (Activity) r92;
    L51:
        if (r93 != null) goto L54;
        return;
    L54:
        if (AbstractC0307g.m699a(r93.getPackageName(), ModernHookEntry.WECHAT_PACKAGE) == false) goto L153;
        Object r7 = r20.f2670c[0];
        if ((r7 instanceof Integer) == false) goto L59;
        Integer r72 = (Integer) r7;
    L60:
        if (r72 == null) goto L148;
        int r73 = r72.intValue();
        Object r10 = r20.f2670c[1];
        if ((r10 instanceof Integer) == false) goto L64;
        Integer r102 = (Integer) r10;
    L65:
        if (r102 == null) goto L149;
        int r103 = r102.intValue();
        Object r09 = r20.f2670c[2];
        if ((r09 instanceof Intent) == false) goto L69;
        Intent r12 = (Intent) r09;
    L71:
        if (r73 != 44039) goto L154;
        C0617P1.f1905c.set(false);
        if (r103 == (-1)) goto L76;
        VirtualLocationHook r010 = VirtualLocationHook.f1854a;
        VirtualLocationHook.m1487a();
        r5.getClass();
        C0617P1.m1515c("map pick canceled");
        return;
    L76:
        r5.getClass();
        if (r12 == null) goto L113;
        Parcelable r011 = r12.getParcelableExtra("KLocationIntent");
        if (r011 == null) goto L84;
        C0139e r012 = C0617P1.m1513a(r011);
        if (r012 == null) goto L84;
    L83:
        r8 = r012;
    L84:
        Bundle r013 = r12.getExtras();
        C0617P1 r53 = C0617P1.f1903a;
        if (r013 == null) goto L108;
        Set<String> r014 = r013.keySet();
        if (r014 == null) goto L108;
        Iterator<T> r54 = r014.iterator();
    L90:
        if (r54.hasNext() == false) goto L108;
        String r015 = (String) r54.next();
        Bundle r74 = r12.getExtras();     // Catch: Throwable -> L96
        if (r74 == null) goto L98;
        Object r016 = r74.get(r015);     // Catch: Throwable -> L96
    L101:
        if ((r016 instanceof C0140f) == false) goto L103;
        r016 = null;
    L103:
        if (r016 == null) goto L90;
        r012 = C0617P1.m1513a(r016);
        if (r012 == null) goto L90;
    L98:
        r016 = null;
    L96:
        th = move-exception;
        r016 = AbstractC0040p.m116u(th);
    L108:
        String r017 = r12.getDataString();
        if (r017 == null) goto L113;
        r012 = C0617P1.m1514b(r017);
        if (r012 != null) goto L83;
    L113:
        if (r8 != null) goto L115;
        VirtualLocationHook r018 = VirtualLocationHook.f1854a;
        VirtualLocationHook.m1487a();
        Toast.makeText(r93, "OKK：解析地图结果失败", 0).show();
        C0617P1.m1515c("parse result failed data=" + r12);
        return;
    L115:
        double r55 = ((Number) r8.f328a).doubleValue();
        double r75 = ((Number) r8.f329b).doubleValue();
        VirtualLocationHook r019 = VirtualLocationHook.f1854a;
        File r13 = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK", "map_pick_result");
        File r44 = r13.getParentFile();     // Catch: Throwable -> L119
        if (r44 == null) goto L121;
        r44.mkdirs();     // Catch: Throwable -> L119
    L121:
        StringBuilder r45 = new StringBuilder();     // Catch: Throwable -> L119
        Locale r14 = Locale.US;     // Catch: Throwable -> L119
        r45.append("lat=".concat(String.format(r14, "%.6f", Arrays.copyOf(new Object[]{Double.valueOf(r55)}, 1))));     // Catch: Throwable -> L119
        r45.append('\n');     // Catch: Throwable -> L119
        r45.append("lon=".concat(String.format(r14, "%.6f", Arrays.copyOf(new Object[]{Double.valueOf(r75)}, 1))));     // Catch: Throwable -> L119
        r45.append('\n');     // Catch: Throwable -> L119
        r45.append("ts=" + System.currentTimeMillis());     // Catch: Throwable -> L119
        r45.append('\n');     // Catch: Throwable -> L119
        String r020 = r45.toString();     // Catch: Throwable -> L119
        AbstractC0307g.m702d(r020, "toString(...)");     // Catch: Throwable -> L119
        AbstractC0270k.m693j0(r13, r020, AbstractC0416a.f921a);     // Catch: Throwable -> L119
    L124:
        VirtualLocationHook.m1487a();
        VirtualLocationHook.m1494i(true, r55, r75, null, false);
        Toast.makeText(r93, String.format("OKK：已选点 %.5f, %.5f", Arrays.copyOf(new Object[]{Double.valueOf(r55), Double.valueOf(r75)}, 2)), 1).show();
        C0617P1.m1515c("map pick ok lat=" + r55 + " lon=" + r75);
        return;
    L119:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L124
    L154:
        return;
    L69:
        r12 = null;
        goto L71
    L149:
        return;
    L64:
        r102 = null;
        goto L65
    L148:
        return;
    L59:
        r72 = null;
        goto L60
    L153:
        return;
    L50:
        r93 = null;
        goto L51
    }
}
