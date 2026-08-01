package p118X3;

import java.io.Closeable;
import p068N1.C1013c;
import p117X2.AbstractC1665j;
import p208n4.InterfaceC2721t;

/* JADX INFO: renamed from: X3.F */
/* JADX INFO: loaded from: classes.dex */
public final class C1684F implements Closeable {

    /* JADX INFO: renamed from: d */
    public final C1679A f5738d;

    /* JADX INFO: renamed from: e */
    public final EnumC1716z f5739e;

    /* JADX INFO: renamed from: f */
    public final String f5740f;

    /* JADX INFO: renamed from: g */
    public final int f5741g;

    /* JADX INFO: renamed from: h */
    public final C1705o f5742h;

    /* JADX INFO: renamed from: i */
    public final C1707q f5743i;

    /* JADX INFO: renamed from: j */
    public final AbstractC1687I f5744j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC2721t f5745k;

    /* JADX INFO: renamed from: l */
    public final C1684F f5746l;

    /* JADX INFO: renamed from: m */
    public final C1684F f5747m;

    /* JADX INFO: renamed from: n */
    public final C1684F f5748n;

    /* JADX INFO: renamed from: o */
    public final long f5749o;

    /* JADX INFO: renamed from: p */
    public final long f5750p;

    /* JADX INFO: renamed from: q */
    public final C1013c f5751q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC1690L f5752r;

    /* JADX INFO: renamed from: s */
    public final boolean f5753s;

    public C1684F(C1679A c1679a, EnumC1716z enumC1716z, String str, int i5, C1705o c1705o, C1707q c1707q, AbstractC1687I abstractC1687I, InterfaceC2721t interfaceC2721t, C1684F c1684f, C1684F c1684f2, C1684F c1684f3, long j5, long j6, C1013c c1013c, InterfaceC1690L interfaceC1690L) {
        AbstractC1665j.m2985e(c1679a, "request");
        AbstractC1665j.m2985e(enumC1716z, "protocol");
        AbstractC1665j.m2985e(str, "message");
        AbstractC1665j.m2985e(abstractC1687I, "body");
        AbstractC1665j.m2985e(interfaceC1690L, "trailersSource");
        this.f5738d = c1679a;
        this.f5739e = enumC1716z;
        this.f5740f = str;
        this.f5741g = i5;
        this.f5742h = c1705o;
        this.f5743i = c1707q;
        this.f5744j = abstractC1687I;
        this.f5745k = interfaceC2721t;
        this.f5746l = c1684f;
        this.f5747m = c1684f2;
        this.f5748n = c1684f3;
        this.f5749o = j5;
        this.f5750p = j6;
        this.f5751q = c1013c;
        this.f5752r = interfaceC1690L;
        boolean z5 = false;
        if (200 <= i5 && i5 < 300) {
            z5 = true;
        }
        this.f5753s = z5;
    }

    /* JADX INFO: renamed from: b */
    public final C1683E m3005b() {
        C1683E c1683e = new C1683E();
        c1683e.f5725c = -1;
        c1683e.f5729g = AbstractC1687I.f5761e;
        c1683e.f5737o = InterfaceC1690L.f5774a;
        c1683e.f5723a = this.f5738d;
        c1683e.f5724b = this.f5739e;
        c1683e.f5725c = this.f5741g;
        c1683e.f5726d = this.f5740f;
        c1683e.f5727e = this.f5742h;
        c1683e.f5728f = this.f5743i.m3040c();
        c1683e.f5729g = this.f5744j;
        c1683e.f5730h = this.f5745k;
        c1683e.f5731i = this.f5746l;
        c1683e.f5732j = this.f5747m;
        c1683e.f5733k = this.f5748n;
        c1683e.f5734l = this.f5749o;
        c1683e.f5735m = this.f5750p;
        c1683e.f5736n = this.f5751q;
        c1683e.f5737o = this.f5752r;
        return c1683e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5744j.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f5739e + ", code=" + this.f5741g + ", message=" + this.f5740f + ", url=" + this.f5738d.f5712a + '}';
    }
}
