package p154k5;

import bsh.C1259t2;
import p239q5.C6268s;
import p239q5.C6274y;
import p309v5.AbstractC8826h;
import p309v5.C8829k;
import p309v5.InterfaceC8819a;
import p376zd.C9987e;

/* JADX INFO: renamed from: k5.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3967d0 extends AbstractC3971f0 {

    /* JADX INFO: renamed from: e */
    public final C3970f f11461e;

    /* JADX INFO: renamed from: f */
    public final C8829k f11462f;

    /* JADX INFO: renamed from: g */
    public final C3970f[] f11463g;

    /* JADX INFO: renamed from: h */
    public final boolean f11464h;

    public C3967d0(C6274y c6274y, C3970f c3970f, C8829k c8829k, C3970f[] c3970fArr) {
        super(c6274y, C6268s.f19445s);
        if (c3970f == null) {
            C1259t2.m5095a("user == null");
            throw null;
        }
        if (c8829k == null) {
            C1259t2.m5095a("cases == null");
            throw null;
        }
        if (c3970fArr == null) {
            C1259t2.m5095a("targets == null");
            throw null;
        }
        int size = c8829k.size();
        if (size != c3970fArr.length) {
            C9987e.m38645a("cases / targets mismatch");
            throw null;
        }
        if (size > 65535) {
            C9987e.m38645a("too many cases");
            throw null;
        }
        this.f11461e = c3970f;
        this.f11462f = c8829k;
        this.f11463g = c3970fArr;
        this.f11464h = m15732C(c8829k);
    }

    /* JADX INFO: renamed from: B */
    public static long m15731B(C8829k c8829k) {
        long jM33920z = (((((long) c8829k.m33920z(c8829k.size() - 1)) - ((long) c8829k.m33920z(0))) + 1) * 2) + 4;
        if (jM33920z <= 2147483647L) {
            return jM33920z;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m15732C(C8829k c8829k) {
        if (c8829k.size() < 2) {
            return true;
        }
        long jM15731B = m15731B(c8829k);
        return jM15731B >= 0 && jM15731B <= (m15733D(c8829k) * 5) / 4;
    }

    /* JADX INFO: renamed from: D */
    public static long m15733D(C8829k c8829k) {
        return (((long) c8829k.size()) * 4) + 2;
    }

    /* JADX INFO: renamed from: A */
    public boolean m15734A() {
        return this.f11464h;
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: a */
    public String mo15678a() {
        StringBuilder sb2 = new StringBuilder(100);
        int length = this.f11463g.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append("\n    ");
            sb2.append(this.f11462f.m33920z(i10));
            sb2.append(": ");
            sb2.append(this.f11463g[i10]);
        }
        return sb2.toString();
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: b */
    public int mo15679b() {
        boolean z10 = this.f11464h;
        C8829k c8829k = this.f11462f;
        return (int) (z10 ? m15731B(c8829k) : m15733D(c8829k));
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: s */
    public String mo15680s(boolean z10) {
        int iM15772h = this.f11461e.m15772h();
        StringBuilder sb2 = new StringBuilder(100);
        int length = this.f11463g.length;
        sb2.append(this.f11464h ? "packed" : "sparse");
        sb2.append("-switch-payload // for switch @ ");
        sb2.append(AbstractC8826h.m33898g(iM15772h));
        for (int i10 = 0; i10 < length; i10++) {
            int iM15772h2 = this.f11463g[i10].m15772h();
            sb2.append("\n  ");
            sb2.append(this.f11462f.m33920z(i10));
            sb2.append(": ");
            sb2.append(AbstractC8826h.m33901j(iM15772h2));
            sb2.append(" // ");
            sb2.append(AbstractC8826h.m33895d(iM15772h2 - iM15772h));
        }
        return sb2.toString();
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: y */
    public AbstractC3976j mo15681y(C6268s c6268s) {
        return new C3967d0(m15777m(), this.f11461e, this.f11462f, this.f11463g);
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: z */
    public void mo15682z(InterfaceC8819a interfaceC8819a) {
        int iM15772h;
        int iM15772h2 = this.f11461e.m15772h();
        int iMo15830d = AbstractC3979m.f11567T.m15793b().mo15830d();
        int length = this.f11463g.length;
        int i10 = 0;
        if (!this.f11464h) {
            interfaceC8819a.writeShort(512);
            interfaceC8819a.writeShort(length);
            for (int i11 = 0; i11 < length; i11++) {
                interfaceC8819a.writeInt(this.f11462f.m33920z(i11));
            }
            while (i10 < length) {
                interfaceC8819a.writeInt(this.f11463g[i10].m15772h() - iM15772h2);
                i10++;
            }
            return;
        }
        int iM33920z = length == 0 ? 0 : this.f11462f.m33920z(0);
        int iM33920z2 = ((length == 0 ? 0 : this.f11462f.m33920z(length - 1)) - iM33920z) + 1;
        interfaceC8819a.writeShort(256);
        interfaceC8819a.writeShort(iM33920z2);
        interfaceC8819a.writeInt(iM33920z);
        int i12 = 0;
        while (i10 < iM33920z2) {
            if (this.f11462f.m33920z(i12) > iM33920z + i10) {
                iM15772h = iMo15830d;
            } else {
                iM15772h = this.f11463g[i12].m15772h() - iM15772h2;
                i12++;
            }
            interfaceC8819a.writeInt(iM15772h);
            i10++;
        }
    }
}
