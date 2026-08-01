package p107h6;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.EOFException;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1067w;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p376zd.C10003m;
import p376zd.C10010p0;
import p376zd.C9995i;
import p376zd.InterfaceC9997j;

/* JADX INFO: renamed from: h6.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2888p {

    /* JADX INFO: renamed from: h */
    public static final a f7617h = new a(null);

    /* JADX INFO: renamed from: i */
    public static final byte[] f7618i = new byte[0];

    /* JADX INFO: renamed from: a */
    public C9995i f7619a = new C9995i();

    /* JADX INFO: renamed from: b */
    public C9995i f7620b = new C9995i();

    /* JADX INFO: renamed from: c */
    public final C9995i.a f7621c = new C9995i.a();

    /* JADX INFO: renamed from: d */
    public byte[] f7622d = f7618i;

    /* JADX INFO: renamed from: e */
    public int f7623e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC4705l f7624f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC4705l f7625g;

    /* JADX INFO: renamed from: h6.p$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public static final b f7626r = new b();

        public b() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C9995i invoke() {
            return new C9995i();
        }
    }

    /* JADX INFO: renamed from: h6.p$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC1067w implements InterfaceC0173a {
        public c() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2886n invoke() {
            return new C2886n(C2888p.this.m10523d());
        }
    }

    public C2888p() {
        EnumC4708o enumC4708o = EnumC4708o.f13923s;
        this.f7624f = AbstractC4706m.m18788b(enumC4708o, b.f7626r);
        this.f7625g = AbstractC4706m.m18788b(enumC4708o, new c());
    }

    /* JADX INFO: renamed from: b */
    public final void m10521b() throws EOFException {
        byte[] bArr = this.f7622d;
        byte[] bArr2 = f7618i;
        if (bArr == bArr2) {
            return;
        }
        this.f7621c.close();
        this.f7620b.skip(this.f7623e);
        this.f7620b.mo38670A0(this.f7619a);
        C9995i c9995i = this.f7619a;
        this.f7619a = this.f7620b;
        this.f7620b = c9995i;
        this.f7622d = bArr2;
        this.f7623e = 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m10522c() {
        return ((int) this.f7619a.size()) + (this.f7622d.length - this.f7623e);
    }

    /* JADX INFO: renamed from: d */
    public final C9995i m10523d() {
        return (C9995i) this.f7624f.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m10524e(int i10) throws EOFException {
        if (this.f7623e >= i10) {
            return;
        }
        m10521b();
        this.f7620b.m38734x(this.f7621c);
        this.f7621c.m38738c(i10);
        C9995i.a aVar = this.f7621c;
        if (aVar.f33566t == 0) {
            int i11 = aVar.f33569w;
            byte[] bArr = aVar.f33567u;
            bArr.getClass();
            if (i11 == bArr.length) {
                byte[] bArr2 = this.f7621c.f33567u;
                bArr2.getClass();
                this.f7622d = bArr2;
                this.f7623e = this.f7621c.f33569w;
                return;
            }
        }
        C10010p0.m38820a("Check failed.");
    }

    /* JADX INFO: renamed from: f */
    public final void m10525f(C10003m c10003m) {
        c10003m.getClass();
        int iM38765G = c10003m.m38765G();
        while (iM38765G != 0) {
            m10524e(1);
            int iMin = Math.min(this.f7623e, iM38765G);
            int i10 = this.f7623e - iMin;
            this.f7623e = i10;
            iM38765G -= iMin;
            c10003m.mo38774g(iM38765G, this.f7622d, i10, iMin);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m10526g(int i10) {
        m10524e(4);
        int i11 = this.f7623e;
        int i12 = i11 - 4;
        this.f7623e = i12;
        byte[] bArr = this.f7622d;
        bArr[i12] = (byte) (i10 & 255);
        bArr[i11 - 3] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 - 2] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 - 1] = (byte) ((i10 >>> 24) & 255);
    }

    /* JADX INFO: renamed from: h */
    public final void m10527h(long j10) {
        m10524e(8);
        int i10 = this.f7623e;
        int i11 = i10 - 8;
        this.f7623e = i11;
        byte[] bArr = this.f7622d;
        bArr[i11] = (byte) (j10 & 255);
        bArr[i10 - 7] = (byte) ((j10 >>> 8) & 255);
        bArr[i10 - 6] = (byte) ((j10 >>> 16) & 255);
        bArr[i10 - 5] = (byte) ((j10 >>> 24) & 255);
        bArr[i10 - 4] = (byte) ((j10 >>> 32) & 255);
        bArr[i10 - 3] = (byte) ((j10 >>> 40) & 255);
        bArr[i10 - 2] = (byte) ((j10 >>> 48) & 255);
        bArr[i10 - 1] = (byte) ((j10 >>> 56) & 255);
    }

    /* JADX INFO: renamed from: i */
    public final void m10528i(int i10) {
        if (i10 >= 0) {
            m10532m(i10);
        } else {
            m10533n(i10);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m10529j(String str) {
        str.getClass();
        int length = str.length() - 1;
        while (length >= 0) {
            int i10 = length - 1;
            char cCharAt = str.charAt(length);
            if (cCharAt < 128) {
                m10524e(1);
                int i11 = this.f7623e;
                byte[] bArr = this.f7622d;
                int i12 = i11 - 1;
                bArr[i12] = (byte) cCharAt;
                int iMax = Math.max(-1, i10 - i12);
                int i13 = i12;
                length = i10;
                while (length > iMax) {
                    char cCharAt2 = str.charAt(length);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    length--;
                    i13--;
                    bArr[i13] = (byte) cCharAt2;
                }
                this.f7623e = i13;
            } else {
                if (cCharAt < 2048) {
                    m10524e(2);
                    byte[] bArr2 = this.f7622d;
                    int i14 = this.f7623e;
                    int i15 = i14 - 1;
                    this.f7623e = i15;
                    bArr2[i15] = (byte) (128 | (cCharAt & '?'));
                    int i16 = i14 - 2;
                    this.f7623e = i16;
                    bArr2[i16] = (byte) ((cCharAt >> 6) | Opcodes.CHECKCAST);
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    m10524e(3);
                    byte[] bArr3 = this.f7622d;
                    int i17 = this.f7623e;
                    int i18 = i17 - 1;
                    this.f7623e = i18;
                    bArr3[i18] = (byte) ((cCharAt & '?') | 128);
                    int i19 = i17 - 2;
                    this.f7623e = i19;
                    bArr3[i19] = (byte) (128 | (63 & (cCharAt >> 6)));
                    int i20 = i17 - 3;
                    this.f7623e = i20;
                    bArr3[i20] = (byte) ((cCharAt >> '\f') | 224);
                } else {
                    char cCharAt3 = i10 >= 0 ? str.charAt(i10) : (char) 65535;
                    if (cCharAt3 > 56319 || 56320 > cCharAt || cCharAt >= 57344) {
                        m10524e(1);
                        byte[] bArr4 = this.f7622d;
                        int i21 = this.f7623e - 1;
                        this.f7623e = i21;
                        bArr4[i21] = JSONB.Constants.BC_INT32_BYTE_MAX;
                    } else {
                        length -= 2;
                        int i22 = (((cCharAt3 & 1023) << 10) | (cCharAt & 1023)) + 65536;
                        m10524e(4);
                        byte[] bArr5 = this.f7622d;
                        int i23 = this.f7623e;
                        int i24 = i23 - 1;
                        this.f7623e = i24;
                        bArr5[i24] = (byte) ((i22 & 63) | 128);
                        int i25 = i23 - 2;
                        this.f7623e = i25;
                        bArr5[i25] = (byte) (((i22 >> 6) & 63) | 128);
                        int i26 = i23 - 3;
                        this.f7623e = i26;
                        bArr5[i26] = (byte) (128 | (63 & (i22 >> 12)));
                        int i27 = i23 - 4;
                        this.f7623e = i27;
                        bArr5[i27] = (byte) ((i22 >> 18) | 240);
                    }
                }
                length = i10;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m10530k(int i10, EnumC2875c enumC2875c) {
        enumC2875c.getClass();
        m10532m(C2886n.f7614b.m10509f(i10, enumC2875c));
    }

    /* JADX INFO: renamed from: l */
    public final void m10531l(InterfaceC9997j interfaceC9997j) {
        interfaceC9997j.getClass();
        m10521b();
        interfaceC9997j.mo38670A0(this.f7619a);
    }

    /* JADX INFO: renamed from: m */
    public final void m10532m(int i10) {
        int iM10511h = C2886n.f7614b.m10511h(i10);
        m10524e(iM10511h);
        int i11 = this.f7623e - iM10511h;
        this.f7623e = i11;
        while (true) {
            int i12 = i10 & (-128);
            byte[] bArr = this.f7622d;
            if (i12 == 0) {
                bArr[i11] = (byte) i10;
                return;
            } else {
                bArr[i11] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
                i11++;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m10533n(long j10) {
        int iM10512i = C2886n.f7614b.m10512i(j10);
        m10524e(iM10512i);
        int i10 = this.f7623e - iM10512i;
        this.f7623e = i10;
        while (true) {
            long j11 = (-128) & j10;
            byte[] bArr = this.f7622d;
            if (j11 == 0) {
                bArr[i10] = (byte) j10;
                return;
            } else {
                bArr[i10] = (byte) ((127 & j10) | 128);
                j10 >>>= 7;
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: h6.p$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
