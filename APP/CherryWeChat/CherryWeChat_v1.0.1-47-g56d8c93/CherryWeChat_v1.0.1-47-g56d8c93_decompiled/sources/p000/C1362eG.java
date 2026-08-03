package p000;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: eG */
/* JADX INFO: loaded from: classes.dex */
public final class C1362eG extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4868a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4869b;

    public /* synthetic */ C1362eG(int i, Object obj) {
        this.f4868a = i;
        this.f4869b = obj;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f4868a) {
            case 0:
                AbstractC0295Gu.m625r(-580340276000821L);
                super.afterHookedMethod(methodHookParam);
                InterfaceC1416fj interfaceC1416fj = (InterfaceC1416fj) ((C2428qs) this.f4869b).f8523d;
                if (interfaceC1416fj != null) {
                    interfaceC1416fj.mo90g(new C1494hG(new C2428qs(methodHookParam)));
                }
                break;
            default:
                AbstractC0295Gu.m625r(-577982338955317L);
                super.afterHookedMethod(methodHookParam);
                InterfaceC1416fj interfaceC1416fj2 = ((C1538iG) this.f4869b).f5427i;
                if (interfaceC1416fj2 != null) {
                    interfaceC1416fj2.mo90g(new C1494hG(new C2428qs(methodHookParam)));
                }
                break;
        }
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException {
        switch (this.f4868a) {
            case 0:
                AbstractC0295Gu.m625r(-580314506197045L);
                super.beforeHookedMethod(methodHookParam);
                C1197b c1197b = (C1197b) ((C2428qs) this.f4869b).f8522c;
                if (c1197b != null) {
                    c1197b.mo90g(new C1494hG(new C2428qs(methodHookParam)));
                }
                break;
            default:
                AbstractC0295Gu.m625r(-577956569151541L);
                super.beforeHookedMethod(methodHookParam);
                InterfaceC1416fj interfaceC1416fj = ((C1538iG) this.f4869b).f5426h;
                if (interfaceC1416fj != null) {
                    interfaceC1416fj.mo90g(new C1494hG(new C2428qs(methodHookParam)));
                }
                break;
        }
    }
}
