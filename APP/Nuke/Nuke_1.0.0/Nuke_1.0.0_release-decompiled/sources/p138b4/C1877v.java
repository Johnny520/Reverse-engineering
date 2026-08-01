package p138b4;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import p061L2.C0981u;
import p117X2.AbstractC1665j;
import p118X3.AbstractC1703m;
import p118X3.C1691a;
import p118X3.C1709s;
import p121Y1.C1753n;
import p123Y3.AbstractC1776g;

/* JADX INFO: renamed from: b4.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1877v {

    /* JADX INFO: renamed from: a */
    public final C1691a f6387a;

    /* JADX INFO: renamed from: b */
    public final C1753n f6388b;

    /* JADX INFO: renamed from: c */
    public final C1869n f6389c;

    /* JADX INFO: renamed from: d */
    public final boolean f6390d;

    /* JADX INFO: renamed from: e */
    public final List f6391e;

    /* JADX INFO: renamed from: f */
    public int f6392f;

    /* JADX INFO: renamed from: g */
    public Object f6393g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f6394h;

    public C1877v(C1691a c1691a, C1753n c1753n, C1869n c1869n, boolean z5) {
        List listM3183j;
        AbstractC1665j.m2985e(c1753n, "routeDatabase");
        this.f6387a = c1691a;
        this.f6388b = c1753n;
        this.f6389c = c1869n;
        this.f6390d = z5;
        C0981u c0981u = C0981u.f3047d;
        this.f6391e = c0981u;
        this.f6393g = c0981u;
        this.f6394h = new ArrayList();
        C1709s c1709s = c1691a.f5782h;
        c1869n.f6329g.getClass();
        AbstractC1665j.m2985e(c1709s, "url");
        URI uriM3053h = c1709s.m3053h();
        if (uriM3053h.getHost() == null) {
            listM3183j = AbstractC1776g.m3183j(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> listSelect = c1691a.f5781g.select(uriM3053h);
            listM3183j = (listSelect == null || listSelect.isEmpty()) ? AbstractC1776g.m3183j(new Proxy[]{Proxy.NO_PROXY}) : AbstractC1776g.m3182i(listSelect);
        }
        this.f6391e = listM3183j;
        this.f6392f = 0;
        AbstractC1703m abstractC1703m = c1869n.f6329g;
        List list = this.f6391e;
        abstractC1703m.getClass();
        AbstractC1665j.m2985e(list, "proxies");
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3369a() {
        return this.f6392f < this.f6391e.size() || !this.f6394h.isEmpty();
    }
}
