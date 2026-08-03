package p000;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: eG */
/* JADX INFO: loaded from: classes.dex */
public final class C1362eG extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4868a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4869b;

    public /* synthetic */ C1362eG(int r1, Object r2) {
        this.f4868a = r1;
        this.f4869b = r2;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam r4) {
        switch(this.f4868a) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-577982338955317L);
        super.afterHookedMethod(r4);
        InterfaceC1416fj r0 = ((C1538iG) this.f4869b).f5427i;
        if (r0 == null) goto L12;
        r0.mo90g(new C1494hG(new C2428qs(r4)));
        return;
    L12:
        return;
    L8:
        AbstractC0295Gu.m625r(-580340276000821L);
        super.afterHookedMethod(r4);
        InterfaceC1416fj r02 = (InterfaceC1416fj) ((C2428qs) this.f4869b).f8523d;
        if (r02 == null) goto L13;
        r02.mo90g(new C1494hG(new C2428qs(r4)));
        return;
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam r4) {
        switch(this.f4868a) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-577956569151541L);
        super.beforeHookedMethod(r4);
        InterfaceC1416fj r0 = ((C1538iG) this.f4869b).f5426h;
        if (r0 == null) goto L12;
        r0.mo90g(new C1494hG(new C2428qs(r4)));
        return;
    L12:
        return;
    L8:
        AbstractC0295Gu.m625r(-580314506197045L);
        super.beforeHookedMethod(r4);
        C1197b r02 = (C1197b) ((C2428qs) this.f4869b).f8522c;
        if (r02 == null) goto L13;
        r02.mo90g(new C1494hG(new C2428qs(r4)));
        return;
    }
}
