package p000a;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0469a extends C0287Pe {
    /* JADX INFO: renamed from: g */
    public C0507c m1140g(int i) {
        C0507c c0507c = new C0507c();
        int iM780b = m780b(4);
        if (iM780b == 0) {
            return null;
        }
        int iM779a = m779a((i * 4) + m783e(iM780b));
        ByteBuffer byteBuffer = this.f981b;
        C0631i9.m1481d(byteBuffer, "bb");
        c0507c.m781c(iM779a, byteBuffer);
        return c0507c;
    }

    /* JADX INFO: renamed from: h */
    public C0526d m1141h(int i) {
        C0526d c0526d = new C0526d();
        int iM780b = m780b(4);
        if (iM780b == 0) {
            return null;
        }
        int iM779a = m779a((i * 4) + m783e(iM780b));
        ByteBuffer byteBuffer = this.f981b;
        C0631i9.m1481d(byteBuffer, "bb");
        c0526d.m781c(iM779a, byteBuffer);
        return c0526d;
    }

    /* JADX INFO: renamed from: i */
    public C0735o m1142i(int i) {
        C0735o c0735o = new C0735o();
        int iM780b = m780b(4);
        if (iM780b == 0) {
            return null;
        }
        int iM779a = m779a((i * 4) + m783e(iM780b));
        ByteBuffer byteBuffer = this.f981b;
        C0631i9.m1481d(byteBuffer, "bb");
        c0735o.m781c(iM779a, byteBuffer);
        return c0735o;
    }

    /* JADX INFO: renamed from: j */
    public int m1143j() {
        int iM780b = m780b(4);
        if (iM780b != 0) {
            return m784f(iM780b);
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public C0754p m1144k(int i) {
        C0754p c0754p = new C0754p();
        int iM780b = m780b(4);
        if (iM780b == 0) {
            return null;
        }
        int iM779a = m779a((i * 4) + m783e(iM780b));
        ByteBuffer byteBuffer = this.f981b;
        C0631i9.m1481d(byteBuffer, "bb");
        c0754p.m781c(iM779a, byteBuffer);
        return c0754p;
    }

    /* JADX INFO: renamed from: l */
    public C0287Pe m1145l(C0287Pe c0287Pe) {
        int iM780b = m780b(8);
        if (iM780b == 0) {
            return null;
        }
        int i = iM780b + this.f980a;
        ByteBuffer byteBuffer = this.f981b;
        c0287Pe.m781c(byteBuffer.getInt(i) + i, byteBuffer);
        return c0287Pe;
    }
}
