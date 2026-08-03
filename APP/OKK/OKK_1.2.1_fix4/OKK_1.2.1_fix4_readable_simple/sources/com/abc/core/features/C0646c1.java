package com.abc.core.features;

import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Locale;
import p001A0.AbstractC0040p;
import p009E0.C0172c;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: c0.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0646c1 extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2008b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MomentsAdsBlocker f2009c;

    public C0646c1(int r1) {
        this.f2008b = r1;
        switch(r1) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        this.f2009c = MomentsAdsBlocker.f2016a;
        return;
    L6:
        this.f2009c = MomentsAdsBlocker.f2016a;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b r9) {
        switch(this.f2008b) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        this.f2009c.getClass();
        if (MomentsAdsBlocker.m1630a() == false) goto L78;
        Object r92 = r9.f2669b;
        if (r92 == null) goto L79;
        C0172c r02 = AbstractC0317q.m714c(r92.getClass().getDeclaredFields());     // Catch: Throwable -> L26
    L12:
        if (r02.hasNext() == false) goto L48;
        Field r1 = (Field) r02.next();     // Catch: Throwable -> L26
        if (Modifier.isStatic(r1.getModifiers()) == true) goto L12;
        r1.setAccessible(true);     // Catch: Throwable -> L26
        if (AbstractC0307g.m699a(r1.getType(), String.class) == true) goto L19;
        if (AbstractC0307g.m699a(r1.getType(), Integer.TYPE) == true) goto L36;
        if (AbstractC0307g.m699a(r1.getType(), Integer.class) == false) goto L12;
    L36:
        String r2 = r1.getName();     // Catch: Throwable -> L26
        AbstractC0307g.m702d(r2, "getName(...)");     // Catch: Throwable -> L26
        String r22 = r2.toLowerCase(Locale.ROOT);     // Catch: Throwable -> L26
        AbstractC0307g.m702d(r22, "toLowerCase(...)");     // Catch: Throwable -> L26
        if (AbstractC0425j.m1005J0(r22, "ad", false) == false) goto L39;
    L58:
        r1.set(r92, 0);     // Catch: Throwable -> L44
    L44:
        th = move-exception;
        AbstractC0040p.m116u(th);     // Catch: Throwable -> L26
        goto L12
    L39:
        if (AbstractC0425j.m1005J0(r22, "type", false) == false) goto L12;
        if (AbstractC0425j.m1005J0(r22, "action", false) == false) goto L12;
    L19:
        String r23 = r1.getName();     // Catch: Throwable -> L26
        AbstractC0307g.m702d(r23, "getName(...)");     // Catch: Throwable -> L26
        String r24 = r23.toLowerCase(Locale.ROOT);     // Catch: Throwable -> L26
        AbstractC0307g.m702d(r24, "toLowerCase(...)");     // Catch: Throwable -> L26
        if (AbstractC0425j.m1005J0(r24, "ad", false) == false) goto L22;
    L54:
        r1.set(r92, "");     // Catch: Throwable -> L30
    L30:
        th = move-exception;
        AbstractC0040p.m116u(th);     // Catch: Throwable -> L26
        goto L12
    L22:
        if (AbstractC0425j.m1005J0(r24, "uxinfo", false) == true) goto L54;
        if (AbstractC0425j.m1005J0(r24, "aid", false) == false) goto L12;
    L48:
        int r93 = MomentsAdsBlocker.f2018c.incrementAndGet();
        if (r93 > 5) goto L51;
    L52:
        MomentsAdsBlocker.m1631b("neutralized ADInfo #" + r93);
        return;
    L51:
        if ((r93 % 50) == 0) goto L52;
        return;
    L26:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L48
    L79:
        return;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b r2) {
        switch(this.f2008b) {
            case 1: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        this.f2009c.getClass();
        if (MomentsAdsBlocker.m1630a() == false) goto L10;
        r2.m1946c(Boolean.TRUE);
        return;
    }
}
