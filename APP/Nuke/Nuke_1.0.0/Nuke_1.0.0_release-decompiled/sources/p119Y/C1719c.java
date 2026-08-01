package p119Y;

import p013C0.C0236c;
import p061L2.AbstractC0966f;
import p124Z.C1777a;

/* JADX INFO: renamed from: Y.c */
/* JADX INFO: loaded from: classes.dex */
public class C1719c extends AbstractC0966f {

    /* JADX INFO: renamed from: f */
    public static final C1719c f5958f = new C1719c(C1728l.f5976e, 0);

    /* JADX INFO: renamed from: d */
    public final C1728l f5959d;

    /* JADX INFO: renamed from: e */
    public final int f5960e;

    public C1719c(C1728l c1728l, int i5) {
        this.f5959d = c1728l;
        this.f5960e = i5;
    }

    /* JADX INFO: renamed from: a */
    public final C1719c m3055a(Object obj, C1777a c1777a) {
        C0236c c0236cM3080u = this.f5959d.m3080u(obj != null ? obj.hashCode() : 0, 0, obj, c1777a);
        return c0236cM3080u == null ? this : new C1719c((C1728l) c0236cM3080u.f794f, this.f5960e + c0236cM3080u.f793e);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f5959d.m3064d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f5959d.m3067g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
