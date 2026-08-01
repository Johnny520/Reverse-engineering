package p118X3;

import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;
import p000A.C0066i0;
import p007B0.C0173F;
import p029F0.C0363A;
import p117X2.AbstractC1665j;
import p123Y3.AbstractC1776g;
import p196l4.C2514c;

/* JADX INFO: renamed from: X3.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1714x {

    /* JADX INFO: renamed from: b */
    public C0066i0 f5894b;

    /* JADX INFO: renamed from: e */
    public final C0363A f5897e;

    /* JADX INFO: renamed from: f */
    public final boolean f5898f;

    /* JADX INFO: renamed from: g */
    public final boolean f5899g;

    /* JADX INFO: renamed from: h */
    public final C1692b f5900h;

    /* JADX INFO: renamed from: i */
    public final boolean f5901i;

    /* JADX INFO: renamed from: j */
    public final boolean f5902j;

    /* JADX INFO: renamed from: k */
    public final C1692b f5903k;

    /* JADX INFO: renamed from: l */
    public final C1692b f5904l;

    /* JADX INFO: renamed from: m */
    public final C1692b f5905m;

    /* JADX INFO: renamed from: n */
    public final SocketFactory f5906n;

    /* JADX INFO: renamed from: o */
    public final List f5907o;

    /* JADX INFO: renamed from: p */
    public final List f5908p;

    /* JADX INFO: renamed from: q */
    public final C2514c f5909q;

    /* JADX INFO: renamed from: r */
    public final C1696f f5910r;

    /* JADX INFO: renamed from: s */
    public final int f5911s;

    /* JADX INFO: renamed from: t */
    public final int f5912t;

    /* JADX INFO: renamed from: u */
    public final int f5913u;

    /* JADX INFO: renamed from: a */
    public final C0173F f5893a = new C0173F(4);

    /* JADX INFO: renamed from: c */
    public final ArrayList f5895c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f5896d = new ArrayList();

    public C1714x() {
        TimeZone timeZone = AbstractC1776g.f6076a;
        this.f5897e = new C0363A(12);
        this.f5898f = true;
        this.f5899g = true;
        C1692b c1692b = C1692b.f5785b;
        this.f5900h = c1692b;
        this.f5901i = true;
        this.f5902j = true;
        this.f5903k = C1692b.f5786c;
        this.f5904l = C1692b.f5787d;
        this.f5905m = c1692b;
        SocketFactory socketFactory = SocketFactory.getDefault();
        AbstractC1665j.m2984d(socketFactory, "getDefault(...)");
        this.f5906n = socketFactory;
        this.f5907o = C1715y.f5915C;
        this.f5908p = C1715y.f5914B;
        this.f5909q = C2514c.f8034a;
        this.f5910r = C1696f.f5802c;
        this.f5911s = 10000;
        this.f5912t = 10000;
        this.f5913u = 10000;
    }
}
