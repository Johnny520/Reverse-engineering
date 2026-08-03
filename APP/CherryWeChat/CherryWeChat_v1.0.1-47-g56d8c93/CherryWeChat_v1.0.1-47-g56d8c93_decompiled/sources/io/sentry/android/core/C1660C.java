package io.sentry.android.core;

import android.view.View;
import io.sentry.C1981r;
import io.sentry.android.replay.C1798s;
import io.sentry.android.replay.InterfaceC1781e;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC0714Qj;

/* JADX INFO: renamed from: io.sentry.android.core.C */
/* JADX INFO: loaded from: classes.dex */
public final class C1660C extends CopyOnWriteArrayList {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5955a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5956b;

    public /* synthetic */ C1660C(int i, Object obj) {
        this.f5955a = i;
        this.f5956b = obj;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f5955a) {
            case 0:
                InterfaceC1659B interfaceC1659B = (InterfaceC1659B) obj;
                boolean zAdd = super.add(interfaceC1659B);
                if (Boolean.FALSE.equals(((C1661D) this.f5956b).f5958b.f5963d)) {
                    interfaceC1659B.mo3807d();
                } else if (Boolean.TRUE.equals(((C1661D) this.f5956b).f5958b.f5963d)) {
                    interfaceC1659B.mo3808f();
                }
                return zAdd;
            default:
                InterfaceC1781e interfaceC1781e = (InterfaceC1781e) obj;
                C1798s c1798s = (C1798s) this.f5956b;
                C1981r c1981rM4173a = c1798s.f6520b.m4173a();
                try {
                    for (View view : c1798s.f6522d) {
                        if (interfaceC1781e != null) {
                            interfaceC1781e.mo3939d(view, true);
                        }
                        break;
                    }
                    AbstractC0714Qj.m1489k(c1981rM4173a, null);
                    return super.add(interfaceC1781e);
                } finally {
                }
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f5955a) {
            case 1:
                if (obj == null ? true : obj instanceof InterfaceC1781e) {
                    return super.contains((InterfaceC1781e) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f5955a) {
            case 1:
                if (obj == null ? true : obj instanceof InterfaceC1781e) {
                    return super.indexOf((InterfaceC1781e) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f5955a) {
            case 1:
                if (obj == null ? true : obj instanceof InterfaceC1781e) {
                    return super.lastIndexOf((InterfaceC1781e) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public /* bridge */ boolean remove(Object obj) {
        switch (this.f5955a) {
            case 1:
                if (obj == null ? true : obj instanceof InterfaceC1781e) {
                    return super.remove((InterfaceC1781e) obj);
                }
                return false;
            default:
                return super.remove(obj);
        }
    }
}
