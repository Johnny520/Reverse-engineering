package p024b9;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import p098g9.InterfaceC2548b;
import p098g9.InterfaceC2551e;
import p098g9.InterfaceC2560n;
import p372z8.C9887b;

/* JADX INFO: renamed from: b9.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1033f implements InterfaceC2548b, Serializable {

    /* JADX INFO: renamed from: w */
    public static final Object f3188w = a.f3195q;

    /* JADX INFO: renamed from: q */
    public transient InterfaceC2548b f3189q;

    /* JADX INFO: renamed from: r */
    public final Object f3190r;

    /* JADX INFO: renamed from: s */
    public final Class f3191s;

    /* JADX INFO: renamed from: t */
    public final String f3192t;

    /* JADX INFO: renamed from: u */
    public final String f3193u;

    /* JADX INFO: renamed from: v */
    public final boolean f3194v;

    /* JADX INFO: renamed from: b9.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a implements Serializable {

        /* JADX INFO: renamed from: q */
        public static final a f3195q = new a();

        private Object readResolve() {
            return f3195q;
        }
    }

    public AbstractC1033f(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f3190r = obj;
        this.f3191s = cls;
        this.f3192t = str;
        this.f3193u = str2;
        this.f3194v = z10;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC2548b mo3777a() {
        InterfaceC2548b interfaceC2548b = this.f3189q;
        if (interfaceC2548b != null) {
            return interfaceC2548b;
        }
        InterfaceC2548b interfaceC2548bMo3771c = mo3771c();
        this.f3189q = interfaceC2548bMo3771c;
        return interfaceC2548bMo3771c;
    }

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC2548b mo3771c();

    @Override // p098g9.InterfaceC2548b
    /* JADX INFO: renamed from: d */
    public List mo3778d() {
        return mo3785v().mo3778d();
    }

    @Override // p098g9.InterfaceC2548b
    /* JADX INFO: renamed from: f */
    public InterfaceC2560n mo3779f() {
        return mo3785v().mo3779f();
    }

    /* JADX INFO: renamed from: g */
    public Object m3780g() {
        return this.f3190r;
    }

    @Override // p098g9.InterfaceC2548b
    public String getName() {
        return this.f3192t;
    }

    @Override // p098g9.InterfaceC2548b
    /* JADX INFO: renamed from: j */
    public boolean mo3781j() {
        return mo3785v().mo3781j();
    }

    /* JADX INFO: renamed from: l */
    public InterfaceC2551e m3782l() {
        Class cls = this.f3191s;
        if (cls == null) {
            return null;
        }
        return this.f3194v ? AbstractC1052o0.m3808c(cls) : AbstractC1052o0.m3807b(cls);
    }

    @Override // p098g9.InterfaceC2548b
    /* JADX INFO: renamed from: n */
    public boolean mo3783n() {
        return mo3785v().mo3783n();
    }

    @Override // p098g9.InterfaceC2548b
    /* JADX INFO: renamed from: r */
    public Object mo3784r(Map map) {
        return mo3785v().mo3784r(map);
    }

    /* JADX INFO: renamed from: v */
    public InterfaceC2548b mo3785v() {
        InterfaceC2548b interfaceC2548bMo3777a = mo3777a();
        if (interfaceC2548bMo3777a != this) {
            return interfaceC2548bMo3777a;
        }
        throw new C9887b();
    }

    /* JADX INFO: renamed from: w */
    public String m3786w() {
        return this.f3193u;
    }
}
