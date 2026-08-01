package p026E3;

import de.robv.android.xposed.XC_MethodHook;
import p000A.C0071l;
import p021D3.C0274k;
import p044H3.AbstractC0646a;
import p056K2.C0887m;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: E3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0286b extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1601c f914a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0646a f915b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC1601c f916c;

    public C0286b(C0071l c0071l, AbstractC0646a abstractC0646a, InterfaceC1601c interfaceC1601c) {
        this.f914a = c0071l;
        this.f915b = abstractC0646a;
        this.f916c = interfaceC1601c;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        AbstractC1665j.m2985e(methodHookParam, "param");
        try {
            InterfaceC1601c interfaceC1601c = this.f916c;
            if (interfaceC1601c != null) {
                interfaceC1601c.mo1h(new C0285a(methodHookParam));
            }
        } catch (Throwable th) {
            AbstractC0646a abstractC0646a = this.f915b;
            if (abstractC0646a != null) {
                C0887m c0887m = C0274k.f881a;
                C0274k.m476s(abstractC0646a, "after_callback", th, "After hook callback failed");
            }
            throw th;
        }
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        AbstractC1665j.m2985e(methodHookParam, "param");
        try {
            InterfaceC1601c interfaceC1601c = this.f914a;
            if (interfaceC1601c != null) {
                interfaceC1601c.mo1h(new C0285a(methodHookParam));
            }
        } catch (Throwable th) {
            AbstractC0646a abstractC0646a = this.f915b;
            if (abstractC0646a != null) {
                C0887m c0887m = C0274k.f881a;
                C0274k.m476s(abstractC0646a, "before_callback", th, "Before hook callback failed");
            }
            throw th;
        }
    }
}
