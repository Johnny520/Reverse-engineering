package com.abc.core.features;

import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import p029P0.InterfaceC0286l;

/* JADX INFO: renamed from: c0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C0582E extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1750b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0286l f1751c;

    public /* synthetic */ C0582E(InterfaceC0286l interfaceC0286l, int i2) {
        this.f1750b = i2;
        this.f1751c = interfaceC0286l;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public final void mo1385a(C0760b c0760b) {
        switch (this.f1750b) {
            case 0:
                if (BottomTabConfig.m1807b()) {
                    this.f1751c.invoke(c0760b);
                    break;
                }
                break;
            case 1:
                if (BottomTabConfig.m1807b()) {
                    Object obj = c0760b.f2670c[0];
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    if (bool != null) {
                        this.f1751c.invoke(bool);
                    }
                    break;
                }
                break;
            default:
                if (BottomTabConfig.m1807b()) {
                    Object obj2 = c0760b.f2670c[0];
                    Number number = obj2 instanceof Number ? (Number) obj2 : null;
                    if (number != null) {
                        this.f1751c.invoke(Integer.valueOf(number.intValue()));
                    }
                    break;
                }
                break;
        }
    }
}
