package p216od;

import bsh.C1168e1;
import bsh.C1182g3;
import bsh.RunnableC1205k2;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import md.AbstractC5161p;
import me.yun.fkwechat.core.config.AppConfig;
import me.yun.fkwechat.loader.api.HookEngine;
import me.yun.silk.SilkCodec;
import p084fd.AbstractC2422b;
import p201nd.C5580h;
import p201nd.C5582j;
import p201nd.C5583k;
import p201nd.C5584l;
import p201nd.C5586n;
import p201nd.C5587o;
import p315vd.AbstractC8922b;

/* JADX INFO: renamed from: od.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C5732a {

    /* JADX INFO: renamed from: a */
    public C5733b f18071a;

    /* JADX INFO: renamed from: b */
    public RunnableC1205k2 f18072b;

    /* JADX INFO: renamed from: c */
    public C5580h f18073c;

    /* JADX INFO: renamed from: d */
    public C5586n f18074d;

    public C5732a(C5733b c5733b) {
        this.f18071a = c5733b;
    }

    /* JADX INFO: renamed from: a */
    public boolean m23185a() {
        if (this.f18071a == null) {
            return false;
        }
        this.f18072b = new RunnableC1205k2();
        try {
            m23189e();
            this.f18072b.m4478N(this.f18071a.f18080f.getAbsoluteFile());
            C5580h c5580h = this.f18073c;
            if (c5580h == null) {
                return true;
            }
            c5580h.invokeOnLoad();
            return true;
        } catch (Throwable th) {
            m23190f();
            AbstractC5736e.m23199d(this.f18071a, th);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m23186b(C1182g3 c1182g3, Class cls, Object obj) {
        boolean z10 = obj == null;
        for (Class<?> cls2 : cls.getDeclaredClasses()) {
            if (Modifier.isPublic(cls2.getModifiers())) {
                c1182g3.mo4358T(cls2.getName().replace('$', '.'));
            }
        }
        for (Method method : cls.getDeclaredMethods()) {
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers) == z10) {
                c1182g3.mo4383m0(new C1168e1(method, obj));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m23187c() {
        C1182g3 c1182g3M4496q = this.f18072b.m4496q();
        try {
            m23186b(c1182g3M4496q, C5587o.class, new C5587o(this));
            m23186b(c1182g3M4496q, C5584l.class, new C5584l(this));
            m23186b(c1182g3M4496q, C5586n.class, this.f18074d);
            m23186b(c1182g3M4496q, C5582j.class, new C5582j(this));
            m23186b(c1182g3M4496q, SilkCodec.class, new SilkCodec());
            m23186b(c1182g3M4496q, C5583k.class, null);
            m23186b(c1182g3M4496q, AbstractC8922b.class, null);
            m23186b(c1182g3M4496q, AbstractC5161p.class, null);
            m23186b(c1182g3M4496q, HookEngine.class, null);
        } catch (Throwable th) {
            AbstractC5736e.m23199d(this.f18071a, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m23188d() {
        C1182g3 c1182g3M4496q = this.f18072b.m4496q();
        try {
            c1182g3M4496q.m4397t0("pluginSdk", 1);
            c1182g3M4496q.m4397t0("pluginName", this.f18071a.m23192b());
            c1182g3M4496q.m4397t0("pluginAuthor", this.f18071a.m23191a());
            c1182g3M4496q.m4397t0("pluginVersion", this.f18071a.m23194d());
            c1182g3M4496q.m4397t0("pluginPath", this.f18071a.m23193c());
            c1182g3M4496q.m4397t0("hostVerName", AppConfig.hostVersionName);
            c1182g3M4496q.m4397t0("hostVerCode", Integer.valueOf(AppConfig.hostVersionCode));
            c1182g3M4496q.m4397t0("hostContext", AppConfig.hostContext);
            c1182g3M4496q.m4397t0("hostLoader", AppConfig.hostClassLoader);
            c1182g3M4496q.m4397t0("myWxId", AbstractC2422b.m8720d());
            this.f18072b.m4484d(getClass().getClassLoader());
            this.f18072b.m4484d(AppConfig.hostClassLoader);
        } catch (Throwable th) {
            AbstractC5736e.m23199d(this.f18071a, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m23189e() {
        if (this.f18072b != null) {
            C5580h c5580h = new C5580h(this);
            this.f18073c = c5580h;
            C5580h.register(c5580h);
            this.f18074d = new C5586n(this);
            m23188d();
            m23187c();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m23190f() {
        try {
            C5580h c5580h = this.f18073c;
            if (c5580h != null) {
                c5580h.invokeOnUnload();
                C5580h.unregister(this.f18073c);
                this.f18073c = null;
            }
            C5586n c5586n = this.f18074d;
            if (c5586n != null) {
                c5586n.clearMcpTools();
                this.f18074d = null;
            }
            RunnableC1205k2 runnableC1205k2 = this.f18072b;
            if (runnableC1205k2 != null) {
                runnableC1205k2.m4496q().m4378k();
                this.f18072b.m4470F();
            }
        } catch (Throwable th) {
            try {
                AbstractC5736e.m23199d(this.f18071a, th);
            } finally {
                this.f18072b = null;
            }
        }
    }
}
