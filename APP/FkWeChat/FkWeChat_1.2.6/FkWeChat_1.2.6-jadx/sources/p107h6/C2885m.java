package p107h6;

import com.alibaba.fastjson2.JSONB;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import p024b9.AbstractC1043k;
import p376zd.C10003m;
import p376zd.C10010p0;
import p376zd.C10023w;
import p376zd.C9995i;
import p376zd.InterfaceC9997j;
import p376zd.InterfaceC9999k;

/* JADX INFO: renamed from: h6.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2885m {

    /* JADX INFO: renamed from: j */
    public static final a f7604j = new a(null);

    /* JADX INFO: renamed from: a */
    public final InterfaceC9999k f7605a;

    /* JADX INFO: renamed from: b */
    public long f7606b;

    /* JADX INFO: renamed from: c */
    public long f7607c;

    /* JADX INFO: renamed from: d */
    public int f7608d;

    /* JADX INFO: renamed from: e */
    public int f7609e;

    /* JADX INFO: renamed from: f */
    public int f7610f;

    /* JADX INFO: renamed from: g */
    public long f7611g;

    /* JADX INFO: renamed from: h */
    public EnumC2875c f7612h;

    /* JADX INFO: renamed from: i */
    public final List f7613i;

    public C2885m(InterfaceC9999k interfaceC9999k) {
        interfaceC9999k.getClass();
        this.f7605a = interfaceC9999k;
        this.f7607c = Long.MAX_VALUE;
        this.f7609e = 2;
        this.f7610f = -1;
        this.f7611g = -1L;
        this.f7613i = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m10478a(int i10, EnumC2875c enumC2875c, Object obj) {
        enumC2875c.getClass();
        C2886n c2886n = new C2886n((InterfaceC9997j) this.f7613i.get(this.f7608d - 1));
        AbstractC2882j abstractC2882jM10334g = enumC2875c.m10334g();
        abstractC2882jM10334g.getClass();
        abstractC2882jM10334g.mo10317h(c2886n, i10, obj);
    }

    /* JADX INFO: renamed from: b */
    public final void m10479b(int i10) throws IOException {
        if (this.f7609e == i10) {
            this.f7609e = 6;
            return;
        }
        long j10 = this.f7606b;
        long j11 = this.f7607c;
        if (j10 > j11) {
            C2884l.m10477a("Expected to end at ", this.f7607c, " but was ", this.f7606b);
        } else {
            if (j10 != j11) {
                this.f7609e = 7;
                return;
            }
            this.f7607c = this.f7611g;
            this.f7611g = -1L;
            this.f7609e = 6;
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m10480c() throws ProtocolException {
        if (this.f7609e != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.f7609e);
        }
        long j10 = this.f7607c - this.f7606b;
        this.f7605a.mo38721o(j10);
        this.f7609e = 6;
        this.f7606b = this.f7607c;
        this.f7607c = this.f7611g;
        this.f7611g = -1L;
        return j10;
    }

    /* JADX INFO: renamed from: d */
    public final long m10481d() {
        if (this.f7609e != 2) {
            C10010p0.m38820a("Unexpected call to beginMessage()");
            return 0L;
        }
        int i10 = this.f7608d + 1;
        this.f7608d = i10;
        if (i10 > 65) {
            C10023w.m38841a("Wire recursion limit exceeded");
            return 0L;
        }
        if (i10 > this.f7613i.size()) {
            this.f7613i.add(new C9995i());
        }
        long j10 = this.f7611g;
        this.f7611g = -1L;
        this.f7609e = 6;
        return j10;
    }

    /* JADX INFO: renamed from: e */
    public final void m10482e(long j10) {
        m10483f(j10);
    }

    /* JADX INFO: renamed from: f */
    public final C10003m m10483f(long j10) {
        if (this.f7609e != 6) {
            C10010p0.m38820a("Unexpected call to endMessage()");
            return null;
        }
        int i10 = this.f7608d - 1;
        this.f7608d = i10;
        if (i10 < 0 || this.f7611g != -1) {
            C10010p0.m38820a("No corresponding call to beginMessage()");
            return null;
        }
        if (this.f7606b != this.f7607c && i10 != 0) {
            C2884l.m10477a("Expected to end at ", this.f7607c, " but was ", this.f7606b);
            return null;
        }
        this.f7607c = j10;
        C9995i c9995i = (C9995i) this.f7613i.get(i10);
        return c9995i.size() > 0 ? c9995i.mo38717l0() : C10003m.f33583u;
    }

    /* JADX INFO: renamed from: g */
    public final int m10484g() throws ProtocolException {
        int i10;
        this.f7605a.mo38721o(1L);
        this.f7606b++;
        byte b10 = this.f7605a.readByte();
        if (b10 >= 0) {
            return b10;
        }
        int i11 = b10 & JSONB.Constants.BC_SYMBOL;
        this.f7605a.mo38721o(1L);
        this.f7606b++;
        byte b11 = this.f7605a.readByte();
        if (b11 >= 0) {
            i10 = b11 << 7;
        } else {
            i11 |= (b11 & JSONB.Constants.BC_SYMBOL) << 7;
            this.f7605a.mo38721o(1L);
            this.f7606b++;
            byte b12 = this.f7605a.readByte();
            if (b12 >= 0) {
                i10 = b12 << 14;
            } else {
                i11 |= (b12 & JSONB.Constants.BC_SYMBOL) << 14;
                this.f7605a.mo38721o(1L);
                this.f7606b++;
                byte b13 = this.f7605a.readByte();
                if (b13 < 0) {
                    int i12 = i11 | ((b13 & JSONB.Constants.BC_SYMBOL) << 21);
                    this.f7605a.mo38721o(1L);
                    this.f7606b++;
                    byte b14 = this.f7605a.readByte();
                    int i13 = i12 | (b14 << 28);
                    if (b14 < 0) {
                        for (int i14 = 0; i14 < 5; i14++) {
                            this.f7605a.mo38721o(1L);
                            this.f7606b++;
                            if (this.f7605a.readByte() < 0) {
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                    return i13;
                }
                i10 = b13 << 21;
            }
        }
        return i11 | i10;
    }

    /* JADX INFO: renamed from: h */
    public final int m10485h() {
        int i10 = this.f7609e;
        if (i10 == 7) {
            this.f7609e = 2;
            return this.f7610f;
        }
        if (i10 != 6) {
            C10010p0.m38820a("Unexpected call to nextTag()");
            return 0;
        }
        while (this.f7606b < this.f7607c && !this.f7605a.mo38707g()) {
            int iM10484g = m10484g();
            if (iM10484g == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i11 = iM10484g >> 3;
            this.f7610f = i11;
            int i12 = iM10484g & 7;
            if (i12 == 0) {
                this.f7612h = EnumC2875c.f7536s;
                this.f7609e = 0;
                return i11;
            }
            if (i12 == 1) {
                this.f7612h = EnumC2875c.f7537t;
                this.f7609e = 1;
                return i11;
            }
            if (i12 == 2) {
                this.f7612h = EnumC2875c.f7538u;
                this.f7609e = 2;
                int iM10484g2 = m10484g();
                if (iM10484g2 < 0) {
                    throw new ProtocolException("Negative length: " + iM10484g2);
                }
                if (this.f7611g != -1) {
                    throw new IllegalStateException();
                }
                long j10 = this.f7607c;
                this.f7611g = j10;
                long j11 = this.f7606b + ((long) iM10484g2);
                this.f7607c = j11;
                if (j11 <= j10) {
                    return this.f7610f;
                }
                throw new EOFException();
            }
            if (i12 != 3) {
                if (i12 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i12 == 5) {
                    this.f7612h = EnumC2875c.f7539v;
                    this.f7609e = 5;
                    return i11;
                }
                throw new ProtocolException("Unexpected field encoding: " + i12);
            }
            m10495r(i11);
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public final EnumC2875c m10486i() {
        return this.f7612h;
    }

    /* JADX INFO: renamed from: j */
    public final C10003m m10487j() throws ProtocolException {
        long jM10480c = m10480c();
        this.f7605a.mo38721o(jM10480c);
        return this.f7605a.mo38729u(jM10480c);
    }

    /* JADX INFO: renamed from: k */
    public final int m10488k() throws IOException {
        int i10 = this.f7609e;
        if (i10 != 5 && i10 != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.f7609e);
        }
        this.f7605a.mo38721o(4L);
        this.f7606b += (long) 4;
        int iMo38730u0 = this.f7605a.mo38730u0();
        m10479b(5);
        return iMo38730u0;
    }

    /* JADX INFO: renamed from: l */
    public final long m10489l() throws IOException {
        int i10 = this.f7609e;
        if (i10 != 1 && i10 != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.f7609e);
        }
        this.f7605a.mo38721o(8L);
        this.f7606b += (long) 8;
        long jMo38671B0 = this.f7605a.mo38671B0();
        m10479b(1);
        return jMo38671B0;
    }

    /* JADX INFO: renamed from: m */
    public final String m10490m() throws ProtocolException {
        long jM10480c = m10480c();
        this.f7605a.mo38721o(jM10480c);
        return this.f7605a.mo38726s(jM10480c);
    }

    /* JADX INFO: renamed from: n */
    public final void m10491n(int i10) {
        EnumC2875c enumC2875cM10486i = m10486i();
        enumC2875cM10486i.getClass();
        m10478a(i10, enumC2875cM10486i, enumC2875cM10486i.m10334g().mo10314a(this));
    }

    /* JADX INFO: renamed from: o */
    public final int m10492o() {
        int i10 = this.f7609e;
        if (i10 == 0 || i10 == 2) {
            int iM10484g = m10484g();
            m10479b(0);
            return iM10484g;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f7609e);
    }

    /* JADX INFO: renamed from: p */
    public final long m10493p() throws IOException {
        int i10 = this.f7609e;
        if (i10 != 0 && i10 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f7609e);
        }
        long j10 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            this.f7605a.mo38721o(1L);
            this.f7606b++;
            byte b10 = this.f7605a.readByte();
            j10 |= ((long) (b10 & JSONB.Constants.BC_SYMBOL)) << i11;
            if ((b10 & 128) == 0) {
                m10479b(0);
                return j10;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    /* JADX INFO: renamed from: q */
    public final void m10494q() {
        int i10 = this.f7609e;
        if (i10 == 0) {
            m10493p();
            return;
        }
        if (i10 == 1) {
            m10489l();
            return;
        }
        if (i10 == 2) {
            this.f7605a.skip(m10480c());
        } else if (i10 == 5) {
            m10488k();
        } else {
            C10010p0.m38820a("Unexpected call to skip()");
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m10495r(int i10) throws IOException {
        while (this.f7606b < this.f7607c && !this.f7605a.mo38707g()) {
            int iM10484g = m10484g();
            if (iM10484g == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i11 = iM10484g >> 3;
            int i12 = iM10484g & 7;
            if (i12 == 0) {
                this.f7609e = 0;
                m10493p();
            } else if (i12 == 1) {
                this.f7609e = 1;
                m10489l();
            } else if (i12 == 2) {
                long jM10484g = m10484g();
                this.f7606b += jM10484g;
                this.f7605a.skip(jM10484g);
            } else if (i12 == 3) {
                m10495r(i11);
            } else if (i12 == 4) {
                if (i11 != i10) {
                    throw new ProtocolException("Unexpected end group");
                }
                return;
            } else {
                if (i12 != 5) {
                    throw new ProtocolException("Unexpected field encoding: " + i12);
                }
                this.f7609e = 5;
                m10488k();
            }
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: h6.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
