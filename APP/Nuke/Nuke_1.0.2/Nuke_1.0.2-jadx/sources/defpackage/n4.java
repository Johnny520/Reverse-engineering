package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class n4 implements g22, kh1, q50, nu, sh0, x00, k40, z92 {
    public final /* synthetic */ int h;
    public Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n4(int i) {
        this.h = i;
        switch (i) {
            case AIChatConfig.DefaultContextRounds /* 6 */:
                TimeUnit.MINUTES.getClass();
                iy2 iy2Var = iy2.l;
                iy2Var.getClass();
                this.i = new ud0(iy2Var);
                break;
            case 8:
                this.i = new z8(14);
                break;
            case 11:
                this.i = new gt2(se.b);
                break;
            case 12:
                this.i = new ConcurrentHashMap(16);
                break;
            case 15:
                break;
            case 21:
                this.i = new hh1(0);
                break;
            case 28:
                le1 le1Var = new le1();
                this.i = le1Var;
                if (!le1Var.i) {
                    if (le1Var.j) {
                        k22.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    le1Var.a();
                    le1Var.j = true;
                    break;
                }
                break;
            default:
                this.i = new m4(this);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static i81 B(n4 n4Var, int i) {
        d91 d91Var = (d91) n4Var.i;
        vr2 vr2VarB = tl.B();
        in0 in0VarE = vr2VarB != null ? vr2VarB.e() : null;
        vr2 vr2VarK = tl.K(vr2VarB);
        try {
            x81 x81Var = (x81) d91Var.f.getValue();
            tl.U(vr2VarB, vr2VarK, in0VarE);
            j81 j81Var = d91Var.p;
            long j = x81Var.j;
            boolean z = d91Var.d;
            nx0 nx0Var = new nx0(i, x81Var);
            f90 f90Var = j81Var.c;
            if (f90Var == null) {
                return sn.F;
            }
            b5 b5Var = j81Var.b;
            q22 q22Var = (q22) f90Var.d;
            boolean z2 = q22Var instanceof sa;
            p22 p22Var = new p22(f90Var, i, b5Var, nx0Var);
            p22Var.k = new fz(j);
            if (!z2) {
                q22Var.a(p22Var);
            } else if (z) {
                sa saVar = (sa) q22Var;
                saVar.i.add(new j32(1, p22Var));
                if (!saVar.j) {
                    saVar.j = true;
                    saVar.h.post(saVar);
                }
            } else {
                sa saVar2 = (sa) q22Var;
                saVar2.i.add(new j32(0, p22Var));
                if (!saVar2.j) {
                    saVar2.j = true;
                    saVar2.h.post(saVar2);
                }
            }
            tp0.R("compose:lazy:schedule_prefetch:index", i);
            return p22Var;
        } catch (Throwable th) {
            tl.U(vr2VarB, vr2VarK, in0VarE);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void A(float f, float f2, long j) {
        qp qpVarQ = ((b5) this.i).q();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        qpVarQ.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        qpVarQ.b(f, f2);
        qpVarQ.g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void C(float f, float f2) {
        ((b5) this.i).q().g(f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.g22
    public long a(d11 d11Var, long j, d61 d61Var, long j2) {
        long j3 = ((z01) ((xm0) this.i).a()).a;
        int iD = up0.d(d11Var.a + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), d61Var == d61.h);
        return (((long) up0.d(d11Var.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) iD) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k40
    public void b() {
        ((r62) this.i).c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q50
    public short c() throws IOException {
        int i = ((InputStream) this.i).read();
        if (i != -1) {
            return (short) i;
        }
        throw new p50();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nu
    public long d() {
        x60 x60Var = (x60) this.i;
        long jD = x60Var.A.d();
        if (jD != 16) {
            return jD;
        }
        pa2 pa2Var = (pa2) p40.p(x60Var, sa2.a);
        if (pa2Var != null) {
            long j = pa2Var.a;
            if (j != 16) {
                return j;
            }
        }
        return ((ju) p40.p(x60Var, c00.a)).a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q50
    public int e() {
        return c() | (c() << 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k40
    public Object f() {
        r62 r62Var = (r62) this.i;
        r62Var.reset();
        return r62Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q50
    public int g(int i, byte[] bArr) throws p50 {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = ((InputStream) this.i).read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new p50();
        }
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void h(r61 r61Var) {
        if (!r61Var.H()) {
            kz0.b("DepthSortedSet.add called on an unattached node");
        }
        ((gt2) this.i).add(r61Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x00
    public Object j(Object obj) {
        Charset charsetA;
        u92 u92Var = (u92) obj;
        s92 s92Var = u92Var.h;
        if (s92Var == null) {
            on onVarG = u92Var.g();
            vf1 vf1VarE = u92Var.e();
            if (vf1VarE == null || (charsetA = vf1.a(vf1VarE)) == null) {
                charsetA = wq.a;
            }
            s92Var = new s92(onVarG, charsetA);
            u92Var.h = s92Var;
        }
        l41 l41Var = new l41(s92Var);
        l41Var.L(2);
        try {
            Object objB = ((q43) this.i).b(l41Var);
            if (l41Var.I() == 10) {
                return objB;
            }
            throw new t31("JSON document was not fully consumed.");
        } finally {
            u92Var.close();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sh0
    public Object k() {
        switch (this.h) {
            case 17:
                e9 e9Var = (e9) this.i;
                return new w40((af0) e9Var.j, (b5) e9Var.k);
            default:
                ze0 ze0Var = (ze0) this.i;
                return new ff0(ze0Var.a, ze0Var.b, ze0Var.c, ze0Var.d, ze0Var.e, ze0Var.f, ze0Var.g);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l4 l(int i) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void m() {
        ((yx) this.i).getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte[] n(String str, boolean z, boolean z2) {
        String string;
        if (z2) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (!xe1.Q(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            string = sb.toString();
        } else {
            string = str;
        }
        if (!z2) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (xe1.Q(str.charAt(i2))) {
                    c80.p("INVALID_ARGUMENT", "Base64 input contains whitespace.", 0, null, null, 28);
                    return null;
                }
            }
        }
        y(((((long) string.length()) + 3) / 4) * 3);
        try {
            byte[] bArrDecode = (z ? Base64.getUrlDecoder() : Base64.getDecoder()).decode(string);
            bArrDecode.getClass();
            return bArrDecode;
        } catch (IllegalArgumentException e) {
            c80.p("INVALID_ARGUMENT", "Input is not valid Base64.", 0, null, e, 12);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte[] o(String str) {
        if (str.length() % 2 != 0) {
            c80.p("INVALID_ARGUMENT", "Hex input must have an even length.", 0, null, null, 28);
            return null;
        }
        y(((long) str.length()) / 2);
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            char cCharAt = str.charAt(i2);
            xe1.j(16);
            int iDigit = Character.digit((int) cCharAt, 16);
            Integer numValueOf = Integer.valueOf(iDigit);
            if (iDigit < 0) {
                numValueOf = null;
            }
            char cCharAt2 = str.charAt(i2 + 1);
            xe1.j(16);
            int iDigit2 = Character.digit((int) cCharAt2, 16);
            Integer numValueOf2 = Integer.valueOf(iDigit2);
            if (iDigit2 < 0) {
                numValueOf2 = null;
            }
            if (numValueOf == null || numValueOf2 == null) {
                c80.p("INVALID_ARGUMENT", "Input is not valid hexadecimal.", 0, null, null, 28);
                return null;
            }
            bArr[i] = (byte) ((numValueOf.intValue() << 4) | numValueOf2.intValue());
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String p(byte[] bArr, boolean z) {
        y(bArr.length);
        try {
            String string = StandardCharsets.UTF_8.newDecoder().onMalformedInput(z ? CodingErrorAction.REPORT : CodingErrorAction.REPLACE).onUnmappableCharacter(z ? CodingErrorAction.REPORT : CodingErrorAction.REPLACE).decode(ByteBuffer.wrap(bArr)).toString();
            string.getClass();
            return string;
        } catch (Exception e) {
            c80.p("INVALID_ARGUMENT", "Input is not valid UTF-8.", 0, null, e, 12);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kh1
    public jh1 q(kj1 kj1Var) {
        switch (this.h) {
            case 8:
                return new ao(1, (z8) this.i);
            default:
                return new rw0((hh1) this.i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hi0 r() {
        hi0 hi0Var = new hi0();
        hi0Var.a = (yf1) this.i;
        return hi0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l4 s(int i) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q50
    public long skip(long j) throws IOException {
        InputStream inputStream = (InputStream) this.i;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int t(dz dzVar) {
        iy0 iy0Var;
        z70 z70Var = (z70) this.i;
        if (dzVar instanceof q30) {
            b42 b42Var = (b42) z70Var.h;
            b42Var.f();
            iy0Var = (iy0) ((TreeMap) b42Var.g).get((q30) dzVar);
            if (iy0Var == null) {
                s.j("not found");
                return 0;
            }
        } else if (dzVar instanceof r30) {
            b42 b42Var2 = (b42) z70Var.i;
            b42Var2.f();
            iy0Var = (iy0) ((TreeMap) b42Var2.g).get(((r30) dzVar).h);
            if (iy0Var == null) {
                s.g("not found: ", dzVar);
                return 0;
            }
        } else if (dzVar instanceof n30) {
            xg1 xg1Var = (xg1) z70Var.l;
            xg1Var.f();
            iy0Var = (iy0) xg1Var.f.get((n30) dzVar);
            if (iy0Var == null) {
                s.j("not found");
                return 0;
            }
        } else if (dzVar instanceof c30) {
            ni0 ni0Var = (ni0) z70Var.k;
            ni0Var.f();
            iy0Var = (iy0) ni0Var.f.get((c30) dzVar);
            if (iy0Var == null) {
                s.j("not found");
                return 0;
            }
        } else {
            z70Var.getClass();
            iy0Var = null;
        }
        if (iy0Var == null) {
            return -1;
        }
        return iy0Var.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.h) {
            case 11:
                return ((gt2) this.i).toString();
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void u(float f, float f2, float f3, float f4) {
        b5 b5Var = (b5) this.i;
        qp qpVarQ = b5Var.q();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (b5Var.u() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (b5Var.u() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            jz0.a("Width and height must be greater than or equal to zero");
        }
        b5Var.E(jFloatToRawIntBits);
        qpVarQ.g(f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sg1 v() {
        sg1 sg1Var = new sg1();
        sg1Var.a = (yf1) this.i;
        return sg1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean w(int i, int i2, Bundle bundle) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean x(r61 r61Var) {
        if (!r61Var.H()) {
            kz0.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((gt2) this.i).remove(r61Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void y(long j) {
        ((bf2) this.i).getClass();
        if (j <= 16777216) {
            return;
        }
        c80.p("QUOTA_EXCEEDED", "Encoding input or output exceeds 16777216 bytes.", 0, null, null, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void z(float f, long j) {
        qp qpVarQ = ((b5) this.i).q();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        qpVarQ.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        qpVarQ.c(f);
        qpVarQ.g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public n4(bf2 bf2Var) {
        this.h = 16;
        bf2Var.getClass();
        this.i = bf2Var;
    }

    public n4(InputStream inputStream, td1 td1Var) {
        this.h = 22;
        r62 r62Var = new r62(inputStream, td1Var);
        this.i = r62Var;
        r62Var.mark(5242880);
    }

    public n4(l40 l40Var) {
        this.h = 19;
        this.i = Collections.unmodifiableMap(new HashMap(l40Var.a));
    }

    public n4(Context context) {
        this.h = 23;
        this.i = new r80(context, 3);
    }

    public n4(ir0 ir0Var, q43 q43Var) {
        this.h = 20;
        this.i = q43Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[PHI: r11
  0x0028: PHI (r11v1 int) = (r11v0 int), (r11v3 int), (r11v4 int) binds: [B:5:0x0018, B:10:0x0021, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n4(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        this.h = 2;
        int length = fArr.length - 1;
        sf[][] sfVarArr = new sf[length][];
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
            sf[] sfVarArr2 = new sf[length2];
            int i8 = 0;
            while (i8 < length2) {
                int i9 = i8 * 2;
                float[] fArr5 = fArr3;
                int i10 = length2;
                float f3 = fArr5[i9];
                int i11 = i9 + 1;
                sf[] sfVarArr3 = sfVarArr2;
                float f4 = fArr5[i11];
                float f5 = fArr4[i9];
                float f6 = fArr4[i11];
                int i12 = i8;
                sfVarArr3[i12] = new sf(i, f, f2, f3, f4, f5, f6);
                i8 = i12 + 1;
                fArr3 = fArr5;
                length2 = i10;
                sfVarArr2 = sfVarArr3;
            }
            sfVarArr[i4] = sfVarArr2;
            i3 = i;
            i4 = i7;
        }
        this.i = sfVarArr;
    }

    public /* synthetic */ n4(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    public void i(int i, l4 l4Var, String str, Bundle bundle) {
    }
}
