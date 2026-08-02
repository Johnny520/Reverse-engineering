package p000;

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

    /* JADX INFO: renamed from: a */
    public int f13750a;

    /* JADX INFO: renamed from: b */
    public final Object f13751b;

    /* JADX INFO: renamed from: c */
    public final Object f13752c;

    /* JADX INFO: renamed from: d */
    public final Object f13753d;

    /* JADX INFO: renamed from: e */
    public final Object f13754e;

    /* JADX INFO: renamed from: f */
    public final Object f13755f;

    /* JADX INFO: renamed from: g */
    public final Object f13756g;

    /* JADX INFO: renamed from: h */
    public final Object f13757h;

    /* JADX INFO: renamed from: i */
    public final Object f13758i;

    /* JADX INFO: renamed from: j */
    public final Object f13759j;

    /* JADX INFO: renamed from: k */
    public final Object f13760k;

    /* JADX INFO: renamed from: l */
    public final Object f13761l;

    /* JADX INFO: renamed from: m */
    public final Object f13762m;

    /* JADX INFO: renamed from: n */
    public Object f13763n;

    /* JADX INFO: renamed from: o */
    public Serializable f13764o;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Serializable, jm2[]] */
    public z70(C0953z8 c0953z8) {
        b42 b42Var = new b42(3, this);
        this.f13763n = b42Var;
        eh1 eh1Var = new eh1(null, this, 4, 1);
        this.f13752c = eh1Var;
        eh1 eh1Var2 = new eh1("word_data", this, 4, 2);
        this.f13751b = eh1Var2;
        eh1 eh1Var3 = new eh1("string_data", this, 1, 3);
        this.f13754e = eh1Var3;
        eh1 eh1Var4 = new eh1(null, this, 1, 1);
        this.f13755f = eh1Var4;
        eh1 eh1Var5 = new eh1("byte_data", this, 1, 2);
        this.f13756g = eh1Var5;
        b42 b42Var2 = new b42(1, this);
        this.f13757h = b42Var2;
        b42 b42Var3 = new b42(2, this);
        this.f13758i = b42Var3;
        b42 b42Var4 = new b42(0, this);
        this.f13759j = b42Var4;
        ni0 ni0Var = new ni0(this);
        this.f13760k = ni0Var;
        xg1 xg1Var = new xg1(this);
        this.f13761l = xg1Var;
        C0934ys c0934ys = new C0934ys(this);
        this.f13762m = c0934ys;
        eh1 eh1Var6 = new eh1("map", this, 4, 1);
        this.f13753d = eh1Var6;
        this.f13764o = new jm2[]{b42Var, b42Var2, b42Var3, b42Var4, ni0Var, xg1Var, c0934ys, eh1Var2, eh1Var, eh1Var3, eh1Var5, eh1Var4, eh1Var6};
        this.f13750a = -1;
    }

    /* JADX INFO: renamed from: a */
    public void m6385a(AbstractC0147dz abstractC0147dz) {
        if (abstractC0147dz == null) {
            um2.m5516f("cst == null");
            return;
        }
        if (abstractC0147dz instanceof q30) {
            ((b42) this.f13757h).m403o((q30) abstractC0147dz);
            return;
        }
        if (abstractC0147dz instanceof r30) {
            ((b42) this.f13758i).m404p((r30) abstractC0147dz);
        } else if (abstractC0147dz instanceof n30) {
            ((xg1) this.f13761l).m6151m((n30) abstractC0147dz);
        } else if (abstractC0147dz instanceof c30) {
            ((ni0) this.f13760k).m3310m((c30) abstractC0147dz);
        }
    }

    /* JADX INFO: renamed from: b */
    public byte[] m6386b() {
        eh1 eh1Var = (eh1) this.f13753d;
        jm2[] jm2VarArr = (jm2[]) this.f13764o;
        ((C0934ys) this.f13762m).m2517d();
        ((eh1) this.f13755f).m2517d();
        ((eh1) this.f13751b).m2517d();
        ((eh1) this.f13756g).m2517d();
        ((xg1) this.f13761l).m2517d();
        ((ni0) this.f13760k).m2517d();
        ((b42) this.f13759j).m2517d();
        ((eh1) this.f13752c).m2517d();
        ((b42) this.f13758i).m2517d();
        ((b42) this.f13757h).m2517d();
        ((eh1) this.f13754e).m2517d();
        ((b42) this.f13763n).m2517d();
        int length = jm2VarArr.length;
        int iMo1351h = 0;
        for (int i = 0; i < length; i++) {
            jm2 jm2Var = jm2VarArr[i];
            if ((jm2Var != null && jm2Var != null) || !jm2Var.mo398c().isEmpty()) {
                if (iMo1351h < 0) {
                    jm2Var.getClass();
                    C0676s.m4651j("fileOffset < 0");
                    return null;
                }
                if (jm2Var.f5110d >= 0) {
                    c80.m667j("fileOffset already set");
                    return null;
                }
                int i2 = jm2Var.f5109c - 1;
                int i3 = (~i2) & (iMo1351h + i2);
                jm2Var.f5110d = i3;
                if (i3 < iMo1351h) {
                    c80.m667j(vi0.m5688g("bogus placement for section ", i));
                    return null;
                }
                if (jm2Var == eh1Var) {
                    try {
                        te1.m5244l(jm2VarArr, eh1Var);
                        eh1Var.m2517d();
                    } catch (RuntimeException e) {
                        throw sg0.m4862a(e, "...while writing section " + i);
                    }
                }
                if (jm2Var instanceof eh1) {
                    ((eh1) jm2Var).m1355m();
                }
                iMo1351h = jm2Var.mo1351h() + i3;
            }
        }
        this.f13750a = iMo1351h;
        byte[] bArr = new byte[iMo1351h];
        C0929yn c0929yn = new C0929yn(bArr, false);
        for (int i4 = 0; i4 < length; i4++) {
            try {
                jm2 jm2Var2 = jm2VarArr[i4];
                if ((jm2Var2 != null && jm2Var2 != null) || !jm2Var2.mo398c().isEmpty()) {
                    int iM2516b = jm2Var2.m2516b() - c0929yn.f13526c;
                    if (iM2516b < 0) {
                        throw new sg0(null, "excess write of " + (-iM2516b));
                    }
                    c0929yn.m6302n(iM2516b);
                    jm2Var2.m2520i(c0929yn);
                }
            } catch (RuntimeException e2) {
                sg0 sg0Var = e2 instanceof sg0 ? (sg0) e2 : new sg0(e2, null);
                String strM5688g = vi0.m5688g("...while writing section ", i4);
                StringBuffer stringBuffer = sg0Var.f10110h;
                stringBuffer.append(strM5688g);
                if (!strM5688g.endsWith("\n")) {
                    stringBuffer.append('\n');
                }
                throw sg0Var;
            }
        }
        int i5 = c0929yn.f13526c;
        if (i5 != this.f13750a) {
            c80.m667j("foreshortened write");
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
                int i6 = c0929yn.f13526c;
                Adler32 adler32 = new Adler32();
                adler32.update(bArr, 12, i6 - 12);
                int value = (int) adler32.getValue();
                bArr[8] = (byte) value;
                bArr[9] = (byte) (value >> 8);
                bArr[10] = (byte) (value >> 16);
                bArr[11] = (byte) (value >> 24);
                return c0929yn.f13525b;
            } catch (DigestException e3) {
                throw new RuntimeException(e3);
            }
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException(e4);
        }
    }

    public z70(Class cls, Class cls2, Method method, Class cls3, Method method2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f13751b = cls;
        this.f13752c = method;
        this.f13753d = cls3;
        this.f13754e = method2;
        this.f13755f = str;
        this.f13756g = str2;
        this.f13757h = str3;
        this.f13758i = str4;
        this.f13759j = str5;
        this.f13760k = str6;
        this.f13761l = str7;
        this.f13762m = new ConcurrentHashMap();
        this.f13750a = -20000;
    }
}
