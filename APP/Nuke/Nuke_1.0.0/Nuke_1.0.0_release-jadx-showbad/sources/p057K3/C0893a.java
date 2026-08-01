package p057K3;

import com.bumptech.glide.AbstractC1922d;
import com.bumptech.glide.AbstractC1924f;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import nuke.data.cipher.NativeCrypto;
import p000A.C0038T0;
import p014C1.C0240b;
import p029F0.C0363A;
import p050I3.C0801a;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0973m;
import p117X2.AbstractC1665j;
import p118X3.AbstractC1682D;
import p118X3.AbstractC1687I;
import p118X3.C1679A;
import p118X3.C1683E;
import p118X3.C1684F;
import p118X3.C1693c;
import p118X3.C1706p;
import p118X3.C1707q;
import p118X3.EnumC1716z;
import p118X3.InterfaceC1690L;
import p118X3.InterfaceC1710t;
import p123Y3.AbstractC1774e;
import p144c4.C1917g;
import p149d3.AbstractC1973a;
import p149d3.AbstractC1976d;
import p149d3.AbstractC1983k;
import p208n4.C2706e;
import p213o2.C2785n;

/* JADX INFO: renamed from: K3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0893a implements InterfaceC1710t {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2783a = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0893a() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    @Override // p118X3.InterfaceC1710t
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1684F mo1903a(C1917g c1917g) {
        C0038T0 c0038t0;
        C0038T0 c0038t02;
        C1684F c1684f;
        C1707q c1707q;
        int i5;
        C0038T0 c0038t03;
        String string;
        switch (this.f2783a) {
            case 0:
                C1679A c1679a = c1917g.f6489e;
                if (!AbstractC1983k.m3656S(c1679a.f5712a.m3047b(), "/api/client/", false)) {
                    return c1917g.m3409b(c1679a);
                }
                C0894b c0894b = AbstractC0898f.f2788a;
                if (c0894b == null) {
                    return c1917g.m3409b(c1679a);
                }
                String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
                String string2 = UUID.randomUUID().toString();
                AbstractC1665j.m2984d(string2, "toString(...)");
                AbstractC1682D abstractC1682D = c1679a.f5715d;
                String str = "{}";
                if (abstractC1682D != null) {
                    C2706e c2706e = new C2706e();
                    abstractC1682D.mo521d(c2706e);
                    String strMo4731z = c2706e.mo4731z(AbstractC1973a.f6662a);
                    if (!AbstractC1976d.m3637e0(strMo4731z)) {
                        str = strMo4731z;
                    }
                }
                String str2 = str;
                C2785n c2785n = C0801a.f2578a;
                String str3 = c1679a.f5713b;
                String strM3047b = c1679a.f5712a.m3047b();
                String str4 = c0894b.f2784a;
                String str5 = c0894b.f2785b;
                AbstractC1665j.m2985e(str3, "method");
                AbstractC1665j.m2985e(str4, "userId");
                AbstractC1665j.m2985e(strValueOf, "timestamp");
                Locale locale = Locale.US;
                AbstractC1665j.m2984d(locale, "US");
                String upperCase = str3.toUpperCase(locale);
                AbstractC1665j.m2984d(upperCase, "toUpperCase(...)");
                String strM2016W = AbstractC0973m.m2016W(AbstractC0972l.m1987K(new String[]{upperCase, strM3047b, str4, str5, strValueOf, string2, str2}), "\n", null, null, null, 62);
                AbstractC1665j.m2985e(strM2016W, "payload");
                String strSignClientPayload = NativeCrypto.INSTANCE.signClientPayload(strM2016W);
                C0240b c0240bM3001a = c1679a.m3001a();
                c0240bM3001a.m436m("X-Client-Id", c0894b.f2784a);
                c0240bM3001a.m436m("X-Platform", c0894b.f2785b);
                c0240bM3001a.m436m("X-Timestamp", strValueOf);
                c0240bM3001a.m436m("X-Nonce", string2);
                c0240bM3001a.m436m("X-Signature", strSignClientPayload);
                return c1917g.m3409b(new C1679A(c0240bM3001a));
            default:
                System.currentTimeMillis();
                C1679A c1679a2 = c1917g.f6489e;
                C0038T0 c0038t04 = new C0038T0(25, c1679a2, null);
                C1693c c1693c = c1679a2.f5717f;
                if (c1693c == null) {
                    int i6 = C1693c.f5788n;
                    C1707q c1707q2 = c1679a2.f5714c;
                    AbstractC1665j.m2985e(c1707q2, "headers");
                    int size = c1707q2.size();
                    String str6 = null;
                    int i7 = 0;
                    boolean z5 = true;
                    boolean z6 = false;
                    boolean z7 = false;
                    int iM3172m = -1;
                    int iM3172m2 = -1;
                    boolean z8 = false;
                    boolean z9 = false;
                    boolean z10 = false;
                    int iM3172m3 = -1;
                    int iM3172m4 = -1;
                    boolean z11 = false;
                    boolean z12 = false;
                    boolean z13 = false;
                    while (i7 < size) {
                        String strM3039b = c1707q2.m3039b(i7);
                        String strM3041d = c1707q2.m3041d(i7);
                        if (strM3039b.equalsIgnoreCase("Cache-Control")) {
                            if (str6 == null) {
                                str6 = strM3041d;
                            }
                            i5 = 0;
                            while (i5 < strM3041d.length()) {
                                int length = strM3041d.length();
                                int length2 = i5;
                                while (true) {
                                    if (length2 >= length) {
                                        length2 = strM3041d.length();
                                    } else if (!AbstractC1976d.m3628V("=,;", strM3041d.charAt(length2))) {
                                        length2++;
                                    }
                                }
                                String strSubstring = strM3041d.substring(i5, length2);
                                AbstractC1665j.m2984d(strSubstring, "substring(...)");
                                String string3 = AbstractC1976d.m3647o0(strSubstring).toString();
                                if (length2 == strM3041d.length() || strM3041d.charAt(length2) == ',' || strM3041d.charAt(length2) == ';') {
                                    c0038t03 = c0038t04;
                                    i5 = length2 + 1;
                                    string = null;
                                } else {
                                    int length3 = length2 + 1;
                                    byte[] bArr = AbstractC1774e.f6072a;
                                    int length4 = strM3041d.length();
                                    while (true) {
                                        if (length3 < length4) {
                                            char cCharAt = strM3041d.charAt(length3);
                                            c0038t03 = c0038t04;
                                            if (cCharAt == ' ' || cCharAt == '\t') {
                                                length3++;
                                                c0038t04 = c0038t03;
                                            }
                                        } else {
                                            c0038t03 = c0038t04;
                                            length3 = strM3041d.length();
                                        }
                                    }
                                    if (length3 >= strM3041d.length() || strM3041d.charAt(length3) != '\"') {
                                        int length5 = strM3041d.length();
                                        int length6 = length3;
                                        while (true) {
                                            if (length6 < length5) {
                                                int i8 = length5;
                                                if (!AbstractC1976d.m3628V(",;", strM3041d.charAt(length6))) {
                                                    length6++;
                                                    length5 = i8;
                                                }
                                            } else {
                                                length6 = strM3041d.length();
                                            }
                                        }
                                        String strSubstring2 = strM3041d.substring(length3, length6);
                                        AbstractC1665j.m2984d(strSubstring2, "substring(...)");
                                        string = AbstractC1976d.m3647o0(strSubstring2).toString();
                                        i5 = length6;
                                    } else {
                                        int i9 = length3 + 1;
                                        int iM3634b0 = AbstractC1976d.m3634b0(strM3041d, '\"', i9, 4);
                                        String strSubstring3 = strM3041d.substring(i9, iM3634b0);
                                        AbstractC1665j.m2984d(strSubstring3, "substring(...)");
                                        i5 = iM3634b0 + 1;
                                        string = strSubstring3;
                                    }
                                }
                                if ("no-cache".equalsIgnoreCase(string3)) {
                                    z6 = true;
                                } else if ("no-store".equalsIgnoreCase(string3)) {
                                    z7 = true;
                                } else if ("max-age".equalsIgnoreCase(string3)) {
                                    iM3172m = AbstractC1774e.m3172m(string, -1);
                                } else if ("s-maxage".equalsIgnoreCase(string3)) {
                                    iM3172m2 = AbstractC1774e.m3172m(string, -1);
                                } else if ("private".equalsIgnoreCase(string3)) {
                                    z8 = true;
                                } else if ("public".equalsIgnoreCase(string3)) {
                                    z9 = true;
                                } else if ("must-revalidate".equalsIgnoreCase(string3)) {
                                    z10 = true;
                                } else if ("max-stale".equalsIgnoreCase(string3)) {
                                    iM3172m3 = AbstractC1774e.m3172m(string, Integer.MAX_VALUE);
                                } else if ("min-fresh".equalsIgnoreCase(string3)) {
                                    iM3172m4 = AbstractC1774e.m3172m(string, -1);
                                } else if ("only-if-cached".equalsIgnoreCase(string3)) {
                                    z11 = true;
                                } else if ("no-transform".equalsIgnoreCase(string3)) {
                                    z12 = true;
                                } else if ("immutable".equalsIgnoreCase(string3)) {
                                    z13 = true;
                                }
                                c0038t04 = c0038t03;
                            }
                            i7++;
                            c0038t04 = c0038t04;
                        } else if (!strM3039b.equalsIgnoreCase("Pragma")) {
                            i7++;
                            c0038t04 = c0038t04;
                        }
                        z5 = false;
                        i5 = 0;
                        while (i5 < strM3041d.length()) {
                        }
                        i7++;
                        c0038t04 = c0038t04;
                    }
                    c0038t0 = c0038t04;
                    C1693c c1693c2 = new C1693c(z6, z7, iM3172m, iM3172m2, z8, z9, z10, iM3172m3, iM3172m4, z11, z12, z13, !z5 ? null : str6);
                    c1679a2.f5717f = c1693c2;
                    c1693c = c1693c2;
                } else {
                    c0038t0 = c0038t04;
                }
                if (c1693c.f5798j) {
                    Object obj = null;
                    c0038t02 = new C0038T0(25, obj, obj);
                } else {
                    c0038t02 = c0038t0;
                }
                C1679A c1679a3 = (C1679A) c0038t02.f169e;
                C1684F c1684f2 = (C1684F) c0038t02.f170f;
                if (c1679a3 == null && c1684f2 == null) {
                    C1684F c1684f3 = new C1684F(c1917g.f6489e, EnumC1716z.f5945g, "Unsatisfiable Request (only-if-cached)", 504, null, new C1707q((String[]) new ArrayList(20).toArray(new String[0])), AbstractC1687I.f5761e, null, null, null, null, -1L, System.currentTimeMillis(), null, InterfaceC1690L.f5774a);
                    c1917g.f6485a.f6329g.getClass();
                    return c1684f3;
                }
                if (c1679a3 == null) {
                    AbstractC1665j.m2982b(c1684f2);
                    C1683E c1683eM3005b = c1684f2.m3005b();
                    C1684F c1684fM3420F = AbstractC1922d.m3420F(c1684f2);
                    C1683E.m3003b("cacheResponse", c1684fM3420F);
                    c1683eM3005b.f5732j = c1684fM3420F;
                    C1684F c1684fM3004a = c1683eM3005b.m3004a();
                    c1917g.f6485a.f6329g.getClass();
                    return c1684fM3004a;
                }
                if (c1684f2 != null) {
                    c1917g.f6485a.f6329g.getClass();
                }
                C1684F c1684fM3409b = c1917g.m3409b(c1679a3);
                if (c1684f2 == null) {
                    c1684f = null;
                } else {
                    if (c1684fM3409b.f5741g == 304) {
                        C1683E c1683eM3005b2 = c1684f2.m3005b();
                        C1707q c1707q3 = c1684f2.f5743i;
                        C1707q c1707q4 = c1684fM3409b.f5743i;
                        C1706p c1706p = new C1706p(0);
                        int size2 = c1707q3.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            String strM3039b2 = c1707q3.m3039b(i10);
                            String strM3041d2 = c1707q3.m3041d(i10);
                            if ("Warning".equalsIgnoreCase(strM3039b2)) {
                                c1707q = c1707q3;
                                if (AbstractC1983k.m3656S(strM3041d2, "1", false)) {
                                }
                                i10++;
                                c1707q3 = c1707q;
                            } else {
                                c1707q = c1707q3;
                            }
                            if ("Content-Length".equalsIgnoreCase(strM3039b2) || "Content-Encoding".equalsIgnoreCase(strM3039b2) || "Content-Type".equalsIgnoreCase(strM3039b2) || !AbstractC1924f.m3503o(strM3039b2) || c1707q4.m3038a(strM3039b2) == null) {
                                c1706p.m3023b(strM3039b2, strM3041d2);
                            }
                            i10++;
                            c1707q3 = c1707q;
                        }
                        int size3 = c1707q4.size();
                        for (int i11 = 0; i11 < size3; i11++) {
                            String strM3039b3 = c1707q4.m3039b(i11);
                            if (!"Content-Length".equalsIgnoreCase(strM3039b3) && !"Content-Encoding".equalsIgnoreCase(strM3039b3) && !"Content-Type".equalsIgnoreCase(strM3039b3) && AbstractC1924f.m3503o(strM3039b3)) {
                                c1706p.m3023b(strM3039b3, c1707q4.m3041d(i11));
                            }
                        }
                        c1683eM3005b2.f5728f = c1706p.m3024c().m3040c();
                        c1683eM3005b2.f5734l = c1684fM3409b.f5749o;
                        c1683eM3005b2.f5735m = c1684fM3409b.f5750p;
                        C1684F c1684fM3420F2 = AbstractC1922d.m3420F(c1684f2);
                        C1683E.m3003b("cacheResponse", c1684fM3420F2);
                        c1683eM3005b2.f5732j = c1684fM3420F2;
                        C1684F c1684fM3420F3 = AbstractC1922d.m3420F(c1684fM3409b);
                        C1683E.m3003b("networkResponse", c1684fM3420F3);
                        c1683eM3005b2.f5731i = c1684fM3420F3;
                        c1683eM3005b2.m3004a();
                        c1684fM3409b.f5744j.close();
                        AbstractC1665j.m2982b(null);
                        throw null;
                    }
                    c1684f = null;
                    AbstractC1774e.m3161b(c1684f2.f5744j);
                }
                C1683E c1683eM3005b3 = c1684fM3409b.m3005b();
                C1684F c1684fM3420F4 = c1684f2 != null ? AbstractC1922d.m3420F(c1684f2) : c1684f;
                C1683E.m3003b("cacheResponse", c1684fM3420F4);
                c1683eM3005b3.f5732j = c1684fM3420F4;
                C1684F c1684fM3420F5 = AbstractC1922d.m3420F(c1684fM3409b);
                C1683E.m3003b("networkResponse", c1684fM3420F5);
                c1683eM3005b3.f5731i = c1684fM3420F5;
                return c1683eM3005b3.m3004a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0893a(C0363A c0363a) {
    }
}
