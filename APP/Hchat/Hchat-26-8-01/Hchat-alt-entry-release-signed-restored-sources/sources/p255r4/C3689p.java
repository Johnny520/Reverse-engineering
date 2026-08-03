package p255r4;

import bsh.C0353j;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.Adler32;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;
import p073f4.C1064a;
import p089g1.C1275d;
import p136j8.C2104o;
import p192n4.C2893a;
import p311v4.AbstractC4446a;
import p311v4.AbstractC4454e;
import p311v4.C4447a0;
import p311v4.C4451c0;
import p311v4.C4453d0;
import p311v4.C4463l;
import p311v4.C4464m;
import p311v4.C4475x;
import p326w4.C4683c;
import p376z4.C6089c;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3689p {

    /* JADX INFO: renamed from: a */
    public final C2893a f11999a;

    /* JADX INFO: renamed from: b */
    public final C3680k0 f12000b;

    /* JADX INFO: renamed from: c */
    public final C3680k0 f12001c;

    /* JADX INFO: renamed from: d */
    public final C3680k0 f12002d;

    /* JADX INFO: renamed from: e */
    public final C3680k0 f12003e;

    /* JADX INFO: renamed from: f */
    public final C3674h0 f12004f;

    /* JADX INFO: renamed from: g */
    public final C3674h0 f12005g;

    /* JADX INFO: renamed from: h */
    public final C3674h0 f12006h;

    /* JADX INFO: renamed from: i */
    public final C3703w f12007i;

    /* JADX INFO: renamed from: j */
    public final C3678j0 f12008j;

    /* JADX INFO: renamed from: k */
    public final C3671g f12009k;

    /* JADX INFO: renamed from: l */
    public final C3680k0 f12010l;

    /* JADX INFO: renamed from: m */
    public final C3671g f12011m;

    /* JADX INFO: renamed from: n */
    public final C3674h0 f12012n;

    /* JADX INFO: renamed from: o */
    public final C3680k0 f12013o;

    /* JADX INFO: renamed from: p */
    public final C3674h0 f12014p;

    /* JADX INFO: renamed from: q */
    public final AbstractC3688o0[] f12015q;

    /* JADX INFO: renamed from: r */
    public int f12016r;

    /* JADX INFO: renamed from: s */
    public final int f12017s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3689p(C2893a c2893a) {
        this.f11999a = c2893a;
        C3674h0 c3674h0 = new C3674h0(this, 4);
        this.f12014p = c3674h0;
        C3680k0 c3680k0 = new C3680k0(null, this, 4, 1);
        this.f12001c = c3680k0;
        C3680k0 c3680k02 = new C3680k0("word_data", this, 4, 2);
        this.f12000b = c3680k02;
        C3680k0 c3680k03 = new C3680k0("string_data", this, 1, 3);
        this.f12003e = c3680k03;
        C3680k0 c3680k04 = new C3680k0(null, this, 1, 1);
        this.f12010l = c3680k04;
        C3680k0 c3680k05 = new C3680k0("byte_data", this, 1, 2);
        this.f12013o = c3680k05;
        C3674h0 c3674h02 = new C3674h0(this, 2);
        this.f12004f = c3674h02;
        C3674h0 c3674h03 = new C3674h0(this, 3);
        this.f12005g = c3674h03;
        C3674h0 c3674h04 = new C3674h0(this, 1);
        this.f12006h = c3674h04;
        C3703w c3703w = new C3703w(this);
        this.f12007i = c3703w;
        C3678j0 c3678j0 = new C3678j0(this);
        this.f12008j = c3678j0;
        C3671g c3671g = new C3671g(this, 1);
        this.f12009k = c3671g;
        C3680k0 c3680k06 = new C3680k0("map", this, 4, 1);
        this.f12002d = c3680k06;
        if (c2893a.m6293a(26)) {
            C3671g c3671g2 = new C3671g(this, 0);
            this.f12011m = c3671g2;
            C3674h0 c3674h05 = new C3674h0(this, 0);
            this.f12012n = c3674h05;
            this.f12015q = new AbstractC3688o0[]{c3674h0, c3674h02, c3674h03, c3674h04, c3703w, c3678j0, c3671g, c3671g2, c3674h05, c3680k02, c3680k0, c3680k03, c3680k05, c3680k04, c3680k06};
        } else {
            this.f12011m = null;
            this.f12012n = null;
            this.f12015q = new AbstractC3688o0[]{c3674h0, c3674h02, c3674h03, c3674h04, c3703w, c3678j0, c3671g, c3680k02, c3680k0, c3680k03, c3680k05, c3680k04, c3680k06};
        }
        this.f12016r = -1;
        this.f12017s = 79;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m7701a(C3679k c3679k) {
        C3671g c3671g = this.f12009k;
        TreeMap treeMap = c3671g.f11926g;
        try {
            C4683c c4683c = c3679k.f11947h.f14784g;
            c3671g.m7699g();
            if (treeMap.get(c4683c) == null) {
                treeMap.put(c4683c, c3679k);
            } else {
                C1275d.m3412f(c4683c, "already added: ");
            }
        } catch (NullPointerException unused) {
            C0353j.m1305c("clazz == null");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m7702b(AbstractC4446a abstractC4446a) {
        if (abstractC4446a == null) {
            C0353j.m1305c("cst == null");
            return;
        }
        if (abstractC4446a instanceof C4451c0) {
            this.f12004f.m7662r((C4451c0) abstractC4446a);
            return;
        }
        if (abstractC4446a instanceof C4453d0) {
            this.f12005g.m7660p((C4453d0) abstractC4446a);
            return;
        }
        if (abstractC4446a instanceof AbstractC4454e) {
            this.f12008j.m7672m((AbstractC4454e) abstractC4446a);
            return;
        }
        boolean z9 = abstractC4446a instanceof C4464m;
        C3703w c3703w = this.f12007i;
        if (z9) {
            c3703w.m7708m((C4464m) abstractC4446a);
            return;
        }
        if (abstractC4446a instanceof C4463l) {
            c3703w.m7708m(((C4463l) abstractC4446a).m8908k());
            return;
        }
        if (abstractC4446a instanceof C4447a0) {
            this.f12006h.m7663s(((C4447a0) abstractC4446a).f14757g);
        } else if (abstractC4446a instanceof C4475x) {
            this.f12012n.m7661q((C4475x) abstractC4446a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C6090d m7703c(boolean z9, boolean z10) {
        int i9;
        this.f12009k.m7697d();
        this.f12010l.m7697d();
        C3680k0 c3680k0 = this.f12000b;
        c3680k0.m7697d();
        C2893a c2893a = this.f11999a;
        boolean zM6293a = c2893a.m6293a(26);
        C3671g c3671g = this.f12011m;
        if (zM6293a) {
            c3671g.m7697d();
        }
        this.f12013o.m7697d();
        boolean zM6293a2 = c2893a.m6293a(26);
        C3674h0 c3674h0 = this.f12012n;
        if (zM6293a2) {
            c3674h0.m7697d();
        }
        this.f12008j.m7697d();
        this.f12007i.m7697d();
        this.f12006h.m7697d();
        this.f12001c.m7697d();
        this.f12005g.m7697d();
        this.f12004f.m7697d();
        this.f12003e.m7697d();
        this.f12014p.m7697d();
        AbstractC3688o0[] abstractC3688o0Arr = this.f12015q;
        int length = abstractC3688o0Arr.length;
        int i10 = 0;
        int iMo7676h = 0;
        while (true) {
            int i11 = 1;
            if (i10 >= length) {
                this.f12016r = iMo7676h;
                byte[] bArr = new byte[iMo7676h];
                C6090d c6090d = new C6090d(bArr, false);
                if (z9) {
                    int i12 = this.f12017s;
                    if (i12 < 40) {
                        C2104o.m5294t("annotationWidth < 40");
                        return null;
                    }
                    int i13 = (((i12 - 7) / 15) + 1) & (-2);
                    if (i13 < 6) {
                        i13 = 6;
                    } else if (i13 > 10) {
                        i13 = 10;
                    }
                    c6090d.f24598e = new ArrayList(1000);
                    c6090d.f24599f = i12;
                    c6090d.f24600g = i13;
                    c6090d.f24597d = z10;
                }
                int i14 = 0;
                while (i14 < length) {
                    try {
                        AbstractC3688o0 abstractC3688o0 = abstractC3688o0Arr[i14];
                        if ((abstractC3688o0 == c3671g || abstractC3688o0 == c3674h0) && abstractC3688o0.mo7652c().isEmpty()) {
                            i9 = i11;
                        } else {
                            i9 = i11;
                            int iM7696b = abstractC3688o0.m7696b() - c6090d.f24596c;
                            if (iM7696b < 0) {
                                throw new C1064a("excess write of " + (-iM7696b), null);
                            }
                            c6090d.m10839o(iM7696b);
                            abstractC3688o0.m7700i(c6090d);
                        }
                        i14++;
                        i11 = i9;
                    } catch (RuntimeException e6) {
                        C1064a c1064a = e6 instanceof C1064a ? (C1064a) e6 : new C1064a(null, e6);
                        c1064a.m2687a("...while writing section " + i14);
                        throw c1064a;
                    }
                }
                int i15 = i11;
                int i16 = c6090d.f24596c;
                if (i16 != this.f12016r) {
                    C0353j.m1309g("foreshortened write");
                    return null;
                }
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    messageDigest.update(bArr, 32, i16 - 32);
                    try {
                        int iDigest = messageDigest.digest(bArr, 12, 20);
                        if (iDigest != 20) {
                            throw new RuntimeException("unexpected digest write: " + iDigest + " bytes");
                        }
                        int i17 = c6090d.f24596c;
                        Adler32 adler32 = new Adler32();
                        adler32.update(bArr, 12, i17 - 12);
                        int value = (int) adler32.getValue();
                        bArr[8] = (byte) value;
                        bArr[9] = (byte) (value >> 8);
                        bArr[10] = (byte) (value >> 16);
                        bArr[11] = (byte) (value >> 24);
                        if (z9) {
                            EnumC3662b0 enumC3662b0 = EnumC3662b0.f11894x;
                            c3680k0.m7698f();
                            TreeMap treeMap = new TreeMap();
                            for (AbstractC3682l0 abstractC3682l0 : c3680k0.f11956f) {
                                if (abstractC3682l0.mo7639b() == enumC3662b0) {
                                    treeMap.put(abstractC3682l0.mo7642l(), abstractC3682l0);
                                }
                            }
                            if (treeMap.size() != 0) {
                                c6090d.m10827b(0, "\nmethod code index:\n\n");
                                for (Map.Entry entry : treeMap.entrySet()) {
                                    c6090d.m10827b(0, ((AbstractC3682l0) entry.getValue()).m7682g() + ' ' + ((String) entry.getKey()) + '\n');
                                }
                            }
                            HashMap map = new HashMap(50);
                            for (AbstractC3688o0 abstractC3688o02 : abstractC3688o0Arr) {
                                for (AbstractC3660a0 abstractC3660a0 : abstractC3688o02.mo7652c()) {
                                    String str = abstractC3660a0.mo7639b().f11899i;
                                    C3690p0 c3690p0 = (C3690p0) map.get(str);
                                    if (c3690p0 == null) {
                                        map.put(str, new C3690p0(abstractC3660a0, str));
                                    } else {
                                        int iMo7644c = abstractC3660a0.mo7644c();
                                        c3690p0.f12019b++;
                                        c3690p0.f12020c += iMo7644c;
                                        if (iMo7644c > c3690p0.f12021d) {
                                            c3690p0.f12021d = iMo7644c;
                                        }
                                        if (iMo7644c < c3690p0.f12022e) {
                                            c3690p0.f12022e = iMo7644c;
                                        }
                                    }
                                }
                            }
                            if (map.size() != 0) {
                                c6090d.m10827b(0, "\nstatistics:\n");
                                TreeMap treeMap2 = new TreeMap();
                                for (C3690p0 c3690p02 : map.values()) {
                                    treeMap2.put(c3690p02.f12018a, c3690p02);
                                }
                                for (C3690p0 c3690p03 : treeMap2.values()) {
                                    StringBuilder sb2 = new StringBuilder();
                                    StringBuilder sb3 = new StringBuilder("  ");
                                    sb3.append(c3690p03.f12018a);
                                    sb3.append(": ");
                                    sb3.append(c3690p03.f12019b);
                                    sb3.append(" item");
                                    int i18 = i15;
                                    sb3.append(c3690p03.f12019b == i18 ? HttpUrl.FRAGMENT_ENCODE_SET : "s");
                                    sb3.append("; ");
                                    sb3.append(c3690p03.f12020c);
                                    sb3.append(" bytes total\n");
                                    sb2.append(sb3.toString());
                                    if (c3690p03.f12022e == c3690p03.f12021d) {
                                        sb2.append("    " + c3690p03.f12022e + " bytes/item\n");
                                    } else {
                                        sb2.append("    " + c3690p03.f12022e + ".." + c3690p03.f12021d + " bytes/item; average " + (c3690p03.f12020c / c3690p03.f12019b) + "\n");
                                    }
                                    c6090d.m10828c(sb2.toString());
                                    i15 = i18;
                                }
                            }
                            c6090d.m10830e();
                            ArrayList arrayList = c6090d.f24598e;
                            if (arrayList != null) {
                                int size = arrayList.size();
                                while (true) {
                                    if (size <= 0) {
                                        break;
                                    }
                                    int i19 = size - 1;
                                    C6089c c6089c = (C6089c) c6090d.f24598e.get(i19);
                                    int i20 = c6089c.f24592a;
                                    int i21 = c6090d.f24596c;
                                    if (i20 > i21) {
                                        c6090d.f24598e.remove(i19);
                                        size--;
                                    } else if (c6089c.f24593b > i21) {
                                        c6089c.f24593b = i21;
                                    }
                                }
                            }
                        }
                        return c6090d;
                    } catch (DigestException e7) {
                        throw new RuntimeException(e7);
                    }
                } catch (NoSuchAlgorithmException e10) {
                    throw new RuntimeException(e10);
                }
            }
            AbstractC3688o0 abstractC3688o03 = abstractC3688o0Arr[i10];
            if ((abstractC3688o03 != c3671g && abstractC3688o03 != c3674h0) || !abstractC3688o03.mo7652c().isEmpty()) {
                if (iMo7676h < 0) {
                    abstractC3688o03.getClass();
                    C2104o.m5294t("fileOffset < 0");
                    return null;
                }
                if (abstractC3688o03.f11997d >= 0) {
                    C0353j.m1309g("fileOffset already set");
                    return null;
                }
                int i22 = abstractC3688o03.f11996c - 1;
                int i23 = (iMo7676h + i22) & (~i22);
                abstractC3688o03.f11997d = i23;
                if (i23 < iMo7676h) {
                    C0353j.m1309g(AbstractC0921a.m2249l(i10, "bogus placement for section "));
                    return null;
                }
                C3680k0 c3680k02 = this.f12002d;
                if (abstractC3688o03 == c3680k02) {
                    try {
                        C3664c0.m7646n(abstractC3688o0Arr, c3680k02);
                        c3680k02.m7697d();
                    } catch (RuntimeException e11) {
                        throw C1064a.m2686b("...while writing section " + i10, e11);
                    }
                }
                if (abstractC3688o03 instanceof C3680k0) {
                    ((C3680k0) abstractC3688o03).m7680m();
                }
                iMo7676h = abstractC3688o03.mo7676h() + i23;
            }
            i10++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m7704d(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byteArrayOutputStream.write(m7703c(false, true).f24595b);
    }
}
