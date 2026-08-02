package defpackage;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.Adler32;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z70 {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public Object n;
    public Serializable o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Serializable, jm2[]] */
    public z70(z8 z8Var) {
        b42 b42Var = new b42(3, this);
        this.n = b42Var;
        eh1 eh1Var = new eh1(null, this, 4, 1);
        this.c = eh1Var;
        eh1 eh1Var2 = new eh1("word_data", this, 4, 2);
        this.b = eh1Var2;
        eh1 eh1Var3 = new eh1("string_data", this, 1, 3);
        this.e = eh1Var3;
        eh1 eh1Var4 = new eh1(null, this, 1, 1);
        this.f = eh1Var4;
        eh1 eh1Var5 = new eh1("byte_data", this, 1, 2);
        this.g = eh1Var5;
        b42 b42Var2 = new b42(1, this);
        this.h = b42Var2;
        b42 b42Var3 = new b42(2, this);
        this.i = b42Var3;
        b42 b42Var4 = new b42(0, this);
        this.j = b42Var4;
        ni0 ni0Var = new ni0(this);
        this.k = ni0Var;
        xg1 xg1Var = new xg1(this);
        this.l = xg1Var;
        ys ysVar = new ys(this);
        this.m = ysVar;
        eh1 eh1Var6 = new eh1("map", this, 4, 1);
        this.d = eh1Var6;
        this.o = new jm2[]{b42Var, b42Var2, b42Var3, b42Var4, ni0Var, xg1Var, ysVar, eh1Var2, eh1Var, eh1Var3, eh1Var5, eh1Var4, eh1Var6};
        this.a = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(dz dzVar) {
        if (dzVar == null) {
            um2.f("cst == null");
            return;
        }
        if (dzVar instanceof q30) {
            ((b42) this.h).o((q30) dzVar);
            return;
        }
        if (dzVar instanceof r30) {
            ((b42) this.i).p((r30) dzVar);
        } else if (dzVar instanceof n30) {
            ((xg1) this.l).m((n30) dzVar);
        } else if (dzVar instanceof c30) {
            ((ni0) this.k).m((c30) dzVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte[] b() {
        eh1 eh1Var = (eh1) this.d;
        jm2[] jm2VarArr = (jm2[]) this.o;
        ((ys) this.m).d();
        ((eh1) this.f).d();
        ((eh1) this.b).d();
        ((eh1) this.g).d();
        ((xg1) this.l).d();
        ((ni0) this.k).d();
        ((b42) this.j).d();
        ((eh1) this.c).d();
        ((b42) this.i).d();
        ((b42) this.h).d();
        ((eh1) this.e).d();
        ((b42) this.n).d();
        int length = jm2VarArr.length;
        int iH = 0;
        for (int i = 0; i < length; i++) {
            jm2 jm2Var = jm2VarArr[i];
            if ((jm2Var != null && jm2Var != null) || !jm2Var.c().isEmpty()) {
                if (iH < 0) {
                    jm2Var.getClass();
                    s.j("fileOffset < 0");
                    return null;
                }
                if (jm2Var.d >= 0) {
                    c80.j("fileOffset already set");
                    return null;
                }
                int i2 = jm2Var.c - 1;
                int i3 = (~i2) & (iH + i2);
                jm2Var.d = i3;
                if (i3 < iH) {
                    c80.j(vi0.g("bogus placement for section ", i));
                    return null;
                }
                if (jm2Var == eh1Var) {
                    try {
                        te1.l(jm2VarArr, eh1Var);
                        eh1Var.d();
                    } catch (RuntimeException e) {
                        throw sg0.a(e, "...while writing section " + i);
                    }
                }
                if (jm2Var instanceof eh1) {
                    ((eh1) jm2Var).m();
                }
                iH = jm2Var.h() + i3;
            }
        }
        this.a = iH;
        byte[] bArr = new byte[iH];
        yn ynVar = new yn(bArr, false);
        for (int i4 = 0; i4 < length; i4++) {
            try {
                jm2 jm2Var2 = jm2VarArr[i4];
                if ((jm2Var2 != null && jm2Var2 != null) || !jm2Var2.c().isEmpty()) {
                    int iB = jm2Var2.b() - ynVar.c;
                    if (iB < 0) {
                        throw new sg0(null, "excess write of " + (-iB));
                    }
                    ynVar.n(iB);
                    jm2Var2.i(ynVar);
                }
            } catch (RuntimeException e2) {
                sg0 sg0Var = e2 instanceof sg0 ? (sg0) e2 : new sg0(e2, null);
                String strG = vi0.g("...while writing section ", i4);
                StringBuffer stringBuffer = sg0Var.h;
                stringBuffer.append(strG);
                if (!strG.endsWith("\n")) {
                    stringBuffer.append('\n');
                }
                throw sg0Var;
            }
        }
        int i5 = ynVar.c;
        if (i5 != this.a) {
            c80.j("foreshortened write");
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr, 32, i5 - 32);
            try {
                int iDigest = messageDigest.digest(bArr, 12, 20);
                if (iDigest != 20) {
                    throw new RuntimeException("unexpected digest write: " + iDigest + " bytes");
                }
                int i6 = ynVar.c;
                Adler32 adler32 = new Adler32();
                adler32.update(bArr, 12, i6 - 12);
                int value = (int) adler32.getValue();
                bArr[8] = (byte) value;
                bArr[9] = (byte) (value >> 8);
                bArr[10] = (byte) (value >> 16);
                bArr[11] = (byte) (value >> 24);
                return ynVar.b;
            } catch (DigestException e3) {
                throw new RuntimeException(e3);
            }
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException(e4);
        }
    }

    public z70(Class cls, Class cls2, Method method, Class cls3, Method method2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.b = cls;
        this.c = method;
        this.d = cls3;
        this.e = method2;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = new ConcurrentHashMap();
        this.a = -20000;
    }
}
