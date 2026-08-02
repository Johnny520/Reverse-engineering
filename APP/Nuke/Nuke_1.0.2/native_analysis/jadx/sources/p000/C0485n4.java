package p000;

import android.content.Context;
import android.os.Bundle;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: n4 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class C0485n4 implements g22, kh1, q50, InterfaceC0513nu, sh0, x00, k40, z92 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6982h;

    /* JADX INFO: renamed from: i */
    public Object f6983i;

    public C0485n4(int i) {
        this.f6982h = i;
        switch (i) {
            case AIChatConfig.DefaultContextRounds /* 6 */:
                TimeUnit.MINUTES.getClass();
                iy2 iy2Var = iy2.f4834l;
                iy2Var.getClass();
                this.f6983i = new ud0(iy2Var);
                break;
            case 8:
                this.f6983i = new C0953z8(14);
                break;
            case 11:
                this.f6983i = new gt2(AbstractC0691se.f10069b);
                break;
            case 12:
                this.f6983i = new ConcurrentHashMap(16);
                break;
            case 15:
                break;
            case 21:
                this.f6983i = new hh1(0);
                break;
            case 28:
                le1 le1Var = new le1();
                this.f6983i = le1Var;
                if (!le1Var.f6078i) {
                    if (le1Var.f6079j) {
                        k22.m2599a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    le1Var.m2902a();
                    le1Var.f6079j = true;
                    break;
                }
                break;
            default:
                this.f6983i = new C0448m4(this);
                break;
        }
    }

    /* JADX INFO: renamed from: B */
    public static i81 m3233B(C0485n4 c0485n4, int i) {
        d91 d91Var = (d91) c0485n4.f6983i;
        vr2 vr2VarM5275B = AbstractC0738tl.m5275B();
        in0 in0VarMo77e = vr2VarM5275B != null ? vr2VarM5275B.mo77e() : null;
        vr2 vr2VarM5283K = AbstractC0738tl.m5283K(vr2VarM5275B);
        try {
            x81 x81Var = (x81) d91Var.f1921f.getValue();
            AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
            j81 j81Var = d91Var.f1931p;
            long j = x81Var.f12883j;
            boolean z = d91Var.f1919d;
            nx0 nx0Var = new nx0(i, x81Var);
            f90 f90Var = j81Var.f4915c;
            if (f90Var == null) {
                return C0700sn.f10202F;
            }
            C0043b5 c0043b5 = j81Var.f4914b;
            q22 q22Var = (q22) f90Var.f2865d;
            boolean z2 = q22Var instanceof ViewOnAttachStateChangeListenerC0687sa;
            p22 p22Var = new p22(f90Var, i, c0043b5, nx0Var);
            p22Var.f7939k = new C0221fz(j);
            if (!z2) {
                q22Var.mo4046a(p22Var);
            } else if (z) {
                ViewOnAttachStateChangeListenerC0687sa viewOnAttachStateChangeListenerC0687sa = (ViewOnAttachStateChangeListenerC0687sa) q22Var;
                viewOnAttachStateChangeListenerC0687sa.f10001i.add(new j32(1, p22Var));
                if (!viewOnAttachStateChangeListenerC0687sa.f10002j) {
                    viewOnAttachStateChangeListenerC0687sa.f10002j = true;
                    viewOnAttachStateChangeListenerC0687sa.f10000h.post(viewOnAttachStateChangeListenerC0687sa);
                }
            } else {
                ViewOnAttachStateChangeListenerC0687sa viewOnAttachStateChangeListenerC0687sa2 = (ViewOnAttachStateChangeListenerC0687sa) q22Var;
                viewOnAttachStateChangeListenerC0687sa2.f10001i.add(new j32(0, p22Var));
                if (!viewOnAttachStateChangeListenerC0687sa2.f10002j) {
                    viewOnAttachStateChangeListenerC0687sa2.f10002j = true;
                    viewOnAttachStateChangeListenerC0687sa2.f10000h.post(viewOnAttachStateChangeListenerC0687sa2);
                }
            }
            tp0.m5354R("compose:lazy:schedule_prefetch:index", i);
            return p22Var;
        } catch (Throwable th) {
            AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
            throw th;
        }
    }

    /* JADX INFO: renamed from: A */
    public void m3234A(float f, float f2, long j) {
        InterfaceC0627qp interfaceC0627qpM430q = ((C0043b5) this.f6983i).m430q();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        interfaceC0627qpM430q.mo1518g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        interfaceC0627qpM430q.mo1513b(f, f2);
        interfaceC0627qpM430q.mo1518g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    /* JADX INFO: renamed from: C */
    public void m3235C(float f, float f2) {
        ((C0043b5) this.f6983i).m430q().mo1518g(f, f2);
    }

    @Override // p000.g22
    /* JADX INFO: renamed from: a */
    public long mo1788a(d11 d11Var, long j, d61 d61Var, long j2) {
        long j3 = ((z01) ((xm0) this.f6983i).mo6a()).f13695a;
        int iM5539d = up0.m5539d(d11Var.f1807a + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), d61Var == d61.f1885h);
        return (((long) up0.m5539d(d11Var.f1808b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) iM5539d) << 32);
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: b */
    public void mo872b() {
        ((r62) this.f6983i).m4397c();
    }

    @Override // p000.q50
    /* JADX INFO: renamed from: c */
    public short mo2375c() throws IOException {
        int i = ((InputStream) this.f6983i).read();
        if (i != -1) {
            return (short) i;
        }
        throw new p50();
    }

    @Override // p000.InterfaceC0513nu
    /* JADX INFO: renamed from: d */
    public long mo2185d() {
        x60 x60Var = (x60) this.f6983i;
        long jMo2185d = x60Var.f12837A.mo2185d();
        if (jMo2185d != 16) {
            return jMo2185d;
        }
        pa2 pa2Var = (pa2) p40.m3733p(x60Var, sa2.f10013a);
        if (pa2Var != null) {
            long j = pa2Var.f8230a;
            if (j != 16) {
                return j;
            }
        }
        return ((C0363ju) p40.m3733p(x60Var, c00.f1090a)).f5219a;
    }

    @Override // p000.q50
    /* JADX INFO: renamed from: e */
    public int mo2376e() {
        return mo2375c() | (mo2375c() << 8);
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: f */
    public Object mo873f() {
        r62 r62Var = (r62) this.f6983i;
        r62Var.reset();
        return r62Var;
    }

    @Override // p000.q50
    /* JADX INFO: renamed from: g */
    public int mo2377g(int i, byte[] bArr) throws p50 {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = ((InputStream) this.f6983i).read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new p50();
        }
        return i2;
    }

    /* JADX INFO: renamed from: h */
    public void m3236h(r61 r61Var) {
        if (!r61Var.m4350H()) {
            kz0.m2764b("DepthSortedSet.add called on an unattached node");
        }
        ((gt2) this.f6983i).add(r61Var);
    }

    @Override // p000.x00
    /* JADX INFO: renamed from: j */
    public Object mo1846j(Object obj) {
        Charset charsetM5671a;
        u92 u92Var = (u92) obj;
        s92 s92Var = u92Var.f11171h;
        if (s92Var == null) {
            InterfaceC0549on interfaceC0549onMo275g = u92Var.mo275g();
            vf1 vf1VarMo274e = u92Var.mo274e();
            if (vf1VarMo274e == null || (charsetM5671a = vf1.m5671a(vf1VarMo274e)) == null) {
                charsetM5671a = AbstractC0856wq.f12612a;
            }
            s92Var = new s92(interfaceC0549onMo275g, charsetM5671a);
            u92Var.f11171h = s92Var;
        }
        l41 l41Var = new l41(s92Var);
        l41Var.m2817L(2);
        try {
            Object objMo97b = ((q43) this.f6983i).mo97b(l41Var);
            if (l41Var.m2814I() == 10) {
                return objMo97b;
            }
            throw new t31("JSON document was not fully consumed.");
        } finally {
            u92Var.close();
        }
    }

    @Override // p000.sh0
    /* JADX INFO: renamed from: k */
    public Object mo2447k() {
        switch (this.f6982h) {
            case 17:
                C0158e9 c0158e9 = (C0158e9) this.f6983i;
                return new w40((af0) c0158e9.f2353j, (C0043b5) c0158e9.f2354k);
            default:
                ze0 ze0Var = (ze0) this.f6983i;
                return new ff0(ze0Var.f13852a, ze0Var.f13853b, ze0Var.f13854c, ze0Var.f13855d, ze0Var.f13856e, ze0Var.f13857f, ze0Var.f13858g);
        }
    }

    /* JADX INFO: renamed from: l */
    public C0411l4 mo655l(int i) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public void m3237m() {
        ((AbstractC0941yx) this.f6983i).getClass();
    }

    /* JADX INFO: renamed from: n */
    public byte[] m3238n(String str, boolean z, boolean z2) {
        String string;
        if (z2) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (!xe1.m6099Q(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            string = sb.toString();
        } else {
            string = str;
        }
        if (!z2) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (xe1.m6099Q(str.charAt(i2))) {
                    c80.m672p("INVALID_ARGUMENT", "Base64 input contains whitespace.", 0, null, null, 28);
                    return null;
                }
            }
        }
        m3246y(((((long) string.length()) + 3) / 4) * 3);
        try {
            byte[] bArrDecode = (z ? Base64.getUrlDecoder() : Base64.getDecoder()).decode(string);
            bArrDecode.getClass();
            return bArrDecode;
        } catch (IllegalArgumentException e) {
            c80.m672p("INVALID_ARGUMENT", "Input is not valid Base64.", 0, null, e, 12);
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public byte[] m3239o(String str) {
        if (str.length() % 2 != 0) {
            c80.m672p("INVALID_ARGUMENT", "Hex input must have an even length.", 0, null, null, 28);
            return null;
        }
        m3246y(((long) str.length()) / 2);
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            char cCharAt = str.charAt(i2);
            xe1.m6127j(16);
            int iDigit = Character.digit((int) cCharAt, 16);
            Integer numValueOf = Integer.valueOf(iDigit);
            if (iDigit < 0) {
                numValueOf = null;
            }
            char cCharAt2 = str.charAt(i2 + 1);
            xe1.m6127j(16);
            int iDigit2 = Character.digit((int) cCharAt2, 16);
            Integer numValueOf2 = Integer.valueOf(iDigit2);
            if (iDigit2 < 0) {
                numValueOf2 = null;
            }
            if (numValueOf == null || numValueOf2 == null) {
                c80.m672p("INVALID_ARGUMENT", "Input is not valid hexadecimal.", 0, null, null, 28);
                return null;
            }
            bArr[i] = (byte) ((numValueOf.intValue() << 4) | numValueOf2.intValue());
        }
        return bArr;
    }

    /* JADX INFO: renamed from: p */
    public String m3240p(byte[] bArr, boolean z) {
        m3246y(bArr.length);
        try {
            String string = StandardCharsets.UTF_8.newDecoder().onMalformedInput(z ? CodingErrorAction.REPORT : CodingErrorAction.REPLACE).onUnmappableCharacter(z ? CodingErrorAction.REPORT : CodingErrorAction.REPLACE).decode(ByteBuffer.wrap(bArr)).toString();
            string.getClass();
            return string;
        } catch (Exception e) {
            c80.m672p("INVALID_ARGUMENT", "Input is not valid UTF-8.", 0, null, e, 12);
            return null;
        }
    }

    @Override // p000.kh1
    /* JADX INFO: renamed from: q */
    public jh1 mo1330q(kj1 kj1Var) {
        switch (this.f6982h) {
            case 8:
                return new C0025ao(1, (C0953z8) this.f6983i);
            default:
                return new rw0((hh1) this.f6983i);
        }
    }

    /* JADX INFO: renamed from: r */
    public hi0 m3241r() {
        hi0 hi0Var = new hi0();
        hi0Var.f13870a = (yf1) this.f6983i;
        return hi0Var;
    }

    /* JADX INFO: renamed from: s */
    public C0411l4 mo656s(int i) {
        return null;
    }

    @Override // p000.q50
    public long skip(long j) throws IOException {
        InputStream inputStream = (InputStream) this.f6983i;
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            long jSkip = inputStream.skip(j2);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j2 -= jSkip;
        }
        return j - j2;
    }

    /* JADX INFO: renamed from: t */
    public int m3242t(AbstractC0147dz abstractC0147dz) {
        iy0 iy0Var;
        z70 z70Var = (z70) this.f6983i;
        if (abstractC0147dz instanceof q30) {
            b42 b42Var = (b42) z70Var.f13757h;
            b42Var.m2518f();
            iy0Var = (iy0) ((TreeMap) b42Var.f555g).get((q30) abstractC0147dz);
            if (iy0Var == null) {
                C0676s.m4651j("not found");
                return 0;
            }
        } else if (abstractC0147dz instanceof r30) {
            b42 b42Var2 = (b42) z70Var.f13758i;
            b42Var2.m2518f();
            iy0Var = (iy0) ((TreeMap) b42Var2.f555g).get(((r30) abstractC0147dz).f9342h);
            if (iy0Var == null) {
                C0676s.m4648g("not found: ", abstractC0147dz);
                return 0;
            }
        } else if (abstractC0147dz instanceof n30) {
            xg1 xg1Var = (xg1) z70Var.f13761l;
            xg1Var.m2518f();
            iy0Var = (iy0) xg1Var.f13025f.get((n30) abstractC0147dz);
            if (iy0Var == null) {
                C0676s.m4651j("not found");
                return 0;
            }
        } else if (abstractC0147dz instanceof c30) {
            ni0 ni0Var = (ni0) z70Var.f13760k;
            ni0Var.m2518f();
            iy0Var = (iy0) ni0Var.f7164f.get((c30) abstractC0147dz);
            if (iy0Var == null) {
                C0676s.m4651j("not found");
                return 0;
            }
        } else {
            z70Var.getClass();
            iy0Var = null;
        }
        if (iy0Var == null) {
            return -1;
        }
        return iy0Var.m2415e();
    }

    public String toString() {
        switch (this.f6982h) {
            case 11:
                return ((gt2) this.f6983i).toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m3243u(float f, float f2, float f3, float f4) {
        C0043b5 c0043b5 = (C0043b5) this.f6983i;
        InterfaceC0627qp interfaceC0627qpM430q = c0043b5.m430q();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c0043b5.m434u() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c0043b5.m434u() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            jz0.m2596a("Width and height must be greater than or equal to zero");
        }
        c0043b5.m414E(jFloatToRawIntBits);
        interfaceC0627qpM430q.mo1518g(f, f2);
    }

    /* JADX INFO: renamed from: v */
    public sg1 m3244v() {
        sg1 sg1Var = new sg1();
        sg1Var.f13870a = (yf1) this.f6983i;
        return sg1Var;
    }

    /* JADX INFO: renamed from: w */
    public boolean mo657w(int i, int i2, Bundle bundle) {
        return false;
    }

    /* JADX INFO: renamed from: x */
    public boolean m3245x(r61 r61Var) {
        if (!r61Var.m4350H()) {
            kz0.m2764b("DepthSortedSet.remove called on an unattached node");
        }
        return ((gt2) this.f6983i).remove(r61Var);
    }

    /* JADX INFO: renamed from: y */
    public void m3246y(long j) {
        ((bf2) this.f6983i).getClass();
        if (j <= 16777216) {
            return;
        }
        c80.m672p("QUOTA_EXCEEDED", "Encoding input or output exceeds 16777216 bytes.", 0, null, null, 28);
    }

    /* JADX INFO: renamed from: z */
    public void m3247z(float f, long j) {
        InterfaceC0627qp interfaceC0627qpM430q = ((C0043b5) this.f6983i).m430q();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        interfaceC0627qpM430q.mo1518g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        interfaceC0627qpM430q.mo1514c(f);
        interfaceC0627qpM430q.mo1518g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public C0485n4(bf2 bf2Var) {
        this.f6982h = 16;
        bf2Var.getClass();
        this.f6983i = bf2Var;
    }

    public C0485n4(InputStream inputStream, td1 td1Var) {
        this.f6982h = 22;
        r62 r62Var = new r62(inputStream, td1Var);
        this.f6983i = r62Var;
        r62Var.mark(5242880);
    }

    public C0485n4(l40 l40Var) {
        this.f6982h = 19;
        this.f6983i = Collections.unmodifiableMap(new HashMap(l40Var.f5918a));
    }

    public C0485n4(Context context) {
        this.f6982h = 23;
        this.f6983i = new r80(context, 3);
    }

    public C0485n4(ir0 ir0Var, q43 q43Var) {
        this.f6982h = 20;
        this.f6983i = q43Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[PHI: r11
  0x0028: PHI (r11v1 int) = (r11v0 int), (r11v3 int), (r11v4 int) binds: [B:5:0x0018, B:10:0x0021, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0485n4(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        this.f6982h = 2;
        int length = fArr.length - 1;
        C0692sf[][] c0692sfArr = new C0692sf[length][];
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i4 < length) {
            int i5 = iArr[i4];
            int i6 = 3;
            if (i5 == 0) {
                i = i6;
            } else if (i5 == 1) {
                i2 = 1;
                i = i2;
            } else {
                if (i5 != 2) {
                    if (i5 != 3) {
                        i6 = 4;
                        if (i5 != 4) {
                            i6 = 5;
                            if (i5 != 5) {
                                i = i3;
                            }
                        }
                    } else {
                        if (i2 == 1) {
                        }
                        i = i2;
                    }
                }
                i2 = 2;
                i = i2;
            }
            float[] fArr3 = fArr2[i4];
            int i7 = i4 + 1;
            float[] fArr4 = fArr2[i7];
            float f = fArr[i4];
            float f2 = fArr[i7];
            int length2 = (fArr3.length / 2) + (fArr3.length % 2);
            C0692sf[] c0692sfArr2 = new C0692sf[length2];
            int i8 = 0;
            while (i8 < length2) {
                int i9 = i8 * 2;
                float[] fArr5 = fArr3;
                int i10 = length2;
                float f3 = fArr5[i9];
                int i11 = i9 + 1;
                C0692sf[] c0692sfArr3 = c0692sfArr2;
                float f4 = fArr5[i11];
                float f5 = fArr4[i9];
                float f6 = fArr4[i11];
                int i12 = i8;
                c0692sfArr3[i12] = new C0692sf(i, f, f2, f3, f4, f5, f6);
                i8 = i12 + 1;
                fArr3 = fArr5;
                length2 = i10;
                c0692sfArr2 = c0692sfArr3;
            }
            c0692sfArr[i4] = c0692sfArr2;
            i3 = i;
            i4 = i7;
        }
        this.f6983i = c0692sfArr;
    }

    public /* synthetic */ C0485n4(int i, Object obj) {
        this.f6982h = i;
        this.f6983i = obj;
    }

    /* JADX INFO: renamed from: i */
    public void mo654i(int i, C0411l4 c0411l4, String str, Bundle bundle) {
    }
}
