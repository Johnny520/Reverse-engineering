package gd;

import cd.C1517b;
import java.lang.reflect.Method;
import md.InterfaceC5154i;
import md.InterfaceC5156k;
import me.yun.fkwechat.loader.api.HookEngine;
import p053dd.AbstractC1949a;
import p068ed.AbstractC2212a;
import p201nd.C5580h;

/* JADX INFO: renamed from: gd.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2764e extends AbstractC2212a {

    /* JADX INFO: renamed from: h */
    public static Object f7217h;

    /* JADX INFO: renamed from: e */
    public Class f7218e;

    /* JADX INFO: renamed from: f */
    public Class f7219f;

    /* JADX INFO: renamed from: g */
    public Class f7220g;

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m9887m(String str, InterfaceC5154i interfaceC5154i) {
        f7217h = interfaceC5154i.getThisObject();
        C5580h.dispatchCdnDownload(new AbstractC1949a.a(interfaceC5154i.getArgs()[0], str));
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m9888n(String str, InterfaceC5154i interfaceC5154i) {
        f7217h = interfaceC5154i.getThisObject();
        C5580h.dispatchCdnUpload(new AbstractC1949a.b(interfaceC5154i.getArgs()[0], str));
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: h */
    public boolean mo7972h() {
        this.f7218e = C1517b.findClass().inClass("com.tencent.mars.cdn.CdnManager").get();
        this.f7219f = C1517b.findClass().usingStrings("aeskey must be 32 bytes").get();
        Class<?> cls = C1517b.findClass().usingStrings("must set marscdnBizType,apptype").get();
        this.f7220g = cls;
        return (this.f7218e == null || this.f7219f == null || cls == null) ? false : true;
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: j */
    public void mo7974j() {
        HookEngine.hookAllConstructorsBefore(this.f7218e, new InterfaceC5156k() { // from class: gd.a
            @Override // md.InterfaceC5156k
            /* JADX INFO: renamed from: a */
            public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                C2764e.f7217h = interfaceC5154i.getThisObject();
            }
        });
        for (Method method : this.f7218e.getDeclaredMethods()) {
            final String name = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length >= 1) {
                if (parameterTypes[0] == this.f7219f && name.startsWith("OnJni")) {
                    HookEngine.hookBefore(method, new InterfaceC5156k() { // from class: gd.b
                        @Override // md.InterfaceC5156k
                        /* JADX INFO: renamed from: a */
                        public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                            C2764e.m9887m(name, interfaceC5154i);
                        }
                    });
                } else if (parameterTypes[0] == this.f7220g && name.startsWith("OnJni")) {
                    HookEngine.hookBefore(method, new InterfaceC5156k() { // from class: gd.c
                        @Override // md.InterfaceC5156k
                        /* JADX INFO: renamed from: a */
                        public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                            C2764e.m9888n(name, interfaceC5154i);
                        }
                    });
                }
            }
            if (name.startsWith("create") && (method.getReturnType() == this.f7219f || method.getReturnType() == this.f7220g)) {
                HookEngine.hookAfter(method, new InterfaceC5156k() { // from class: gd.d
                    @Override // md.InterfaceC5156k
                    /* JADX INFO: renamed from: a */
                    public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                        this.f7209a.m9891q(name, interfaceC5154i);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m9891q(String str, InterfaceC5154i interfaceC5154i) {
        Object result = interfaceC5154i.getResult();
        if (result == null) {
            return;
        }
        if (result.getClass() == this.f7219f) {
            C5580h.dispatchCdnDownload(new AbstractC1949a.a(result, "FACTORY_" + str));
        } else {
            C5580h.dispatchCdnUpload(new AbstractC1949a.b(result, "FACTORY_" + str));
        }
    }
}
