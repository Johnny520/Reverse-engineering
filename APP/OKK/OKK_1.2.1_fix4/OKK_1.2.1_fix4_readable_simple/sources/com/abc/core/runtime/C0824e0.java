package com.abc.core.runtime;

import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: f0.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0824e0 extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2988b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Class f2989c;

    public C0824e0(Class r1, ClassLoader r2, int r3) {
        this.f2988b = r3;
        SettingsEntryInjector r22 = SettingsEntryInjector.f2992a;
        this.f2989c = r1;
        switch(r3) {
            case 1: goto L11;
            case 2: goto L9;
            case 3: goto L7;
            default: goto L5;
        };
    L5:
        return;
    L7:
        return;
    L9:
        return;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b r4) {
        Class r1 = this.f2989c;
        switch(this.f2988b) {
            case 0: goto L11;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        return;
    L6:
        if (r1.isInstance(r4.f2669b) == false) goto L15;
        Object r42 = r4.f2669b;
        AbstractC0307g.m702d(r42, "thisObject");
        SettingsEntryInjector r02 = SettingsEntryInjector.f2992a;
        SettingsEntryInjector.m2140f(r42);
        return;
    L15:
        return;
    L11:
        if (r1.isInstance(r4.f2669b) == false) goto L16;
        Object r43 = r4.f2669b;
        AbstractC0307g.m702d(r43, "thisObject");
        SettingsEntryInjector r03 = SettingsEntryInjector.f2992a;
        SettingsEntryInjector.m2140f(r43);
        return;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b r4) {
        Class r02 = this.f2989c;
        switch(this.f2988b) {
            case 2: goto L9;
            case 3: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        Object r42 = r4.f2669b;
        AbstractC0307g.m702d(r42, "thisObject");
        Object r43 = SettingsEntryInjector.m2136b(r02, r42);
        if (r43 == null) goto L13;
        SettingsEntryInjector r03 = SettingsEntryInjector.f2992a;
        SettingsEntryInjector.m2140f(r43);
        return;
    L13:
        return;
    L9:
        Object r44 = r4.f2669b;
        AbstractC0307g.m702d(r44, "thisObject");
        Object r45 = SettingsEntryInjector.m2136b(r02, r44);
        if (r45 == null) goto L14;
        SettingsEntryInjector r04 = SettingsEntryInjector.f2992a;
        SettingsEntryInjector.m2140f(r45);
        return;
    }
}
