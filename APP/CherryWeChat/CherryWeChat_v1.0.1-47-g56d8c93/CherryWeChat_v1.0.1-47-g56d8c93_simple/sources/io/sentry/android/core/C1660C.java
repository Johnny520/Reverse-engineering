package io.sentry.android.core;

import android.view.View;
import io.sentry.C1981r;
import io.sentry.android.replay.C1798s;
import io.sentry.android.replay.InterfaceC1781e;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC0714Qj;

/* JADX INFO: renamed from: io.sentry.android.core.C */
/* JADX INFO: loaded from: classes.dex */
public final class C1660C extends CopyOnWriteArrayList {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5955a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5956b;

    public /* synthetic */ C1660C(int r1, Object r2) {
        this.f5955a = r1;
        this.f5956b = r2;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final boolean add(Object r5) {
        switch(this.f5955a) {
            case 0: goto L20;
            default: goto L4;
        };
    L4:
        InterfaceC1781e r52 = (InterfaceC1781e) r5;
        C1798s r0 = (C1798s) this.f5956b;
        C1981r r1 = r0.f6520b.m4173a();
        Iterator r02 = r0.f6522d.iterator();     // Catch: Throwable -> L12
    L6:
        if (r02.hasNext() == false) goto L14;
        View r2 = (View) r02.next();     // Catch: Throwable -> L12
        if (r52 == null) goto L6;
        r52.mo3939d(r2, true);     // Catch: Throwable -> L12
        goto L6
    L14:
        AbstractC0714Qj.m1489k(r1, null);
        return super.add(r52);
    L12:
        th = move-exception;
        throw th;     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        AbstractC0714Qj.m1489k(r1, th);
        throw th;
    L20:
        InterfaceC1659B r53 = (InterfaceC1659B) r5;
        boolean r03 = super.add(r53);
        if (Boolean.FALSE.equals(((C1661D) this.f5956b).f5958b.f5963d) == false) goto L24;
        r53.mo3807d();
    L26:
        return r03;
    L24:
        if (Boolean.TRUE.equals(((C1661D) this.f5956b).f5958b.f5963d) == false) goto L26;
        r53.mo3808f();
        goto L26
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public /* bridge */ boolean contains(Object r2) {
        switch(this.f5955a) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        if (r2 != null) goto L8;
        boolean r0 = true;
    L9:
        if (r0 == true) goto L12;
        return false;
    L12:
        return super.contains((InterfaceC1781e) r2);
    L8:
        r0 = r2 instanceof InterfaceC1781e;
        goto L9
    L5:
        return super.contains(r2);
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public /* bridge */ int indexOf(Object r2) {
        switch(this.f5955a) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        if (r2 != null) goto L8;
        boolean r0 = true;
    L9:
        if (r0 == true) goto L12;
        return -1;
    L12:
        return super.indexOf((InterfaceC1781e) r2);
    L8:
        r0 = r2 instanceof InterfaceC1781e;
        goto L9
    L5:
        return super.indexOf(r2);
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public /* bridge */ int lastIndexOf(Object r2) {
        switch(this.f5955a) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        if (r2 != null) goto L8;
        boolean r0 = true;
    L9:
        if (r0 == true) goto L12;
        return -1;
    L12:
        return super.lastIndexOf((InterfaceC1781e) r2);
    L8:
        r0 = r2 instanceof InterfaceC1781e;
        goto L9
    L5:
        return super.lastIndexOf(r2);
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public /* bridge */ boolean remove(Object r2) {
        switch(this.f5955a) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        if (r2 != null) goto L8;
        boolean r0 = true;
    L9:
        if (r0 == true) goto L12;
        return false;
    L12:
        return super.remove((InterfaceC1781e) r2);
    L8:
        r0 = r2 instanceof InterfaceC1781e;
        goto L9
    L5:
        return super.remove(r2);
    }
}
