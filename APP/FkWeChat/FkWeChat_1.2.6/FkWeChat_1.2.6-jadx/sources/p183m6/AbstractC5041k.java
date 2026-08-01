package p183m6;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import p196n6.InterfaceC5496a;
import p196n6.InterfaceC5497b;
import p376zd.C10010p0;

/* JADX INFO: renamed from: m6.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5041k {
    /* JADX INFO: renamed from: a */
    public static byte m20332a(byte b10) {
        switch (b10) {
            case 9:
                return (byte) 6;
            case 10:
                return (byte) 7;
            case Opcodes.FCONST_0 /* 11 */:
                return (byte) 8;
            default:
                return b10;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m20333b(byte b10) {
        return b10 == 9 || b10 == 10 || b10 == 11;
    }

    /* JADX INFO: renamed from: c */
    public static void m20334c(SharedPreferencesC5046p sharedPreferencesC5046p, C5042l c5042l, InterfaceC5496a interfaceC5496a, byte b10, String str, int i10) {
        if (b10 == 1) {
            sharedPreferencesC5046p.f15333f.put(str, new C5033c(i10, c5042l.m20348c() == 1));
            return;
        }
        if (b10 == 2) {
            sharedPreferencesC5046p.f15333f.put(str, new C5036f(i10, c5042l.m20357l(interfaceC5496a)));
            return;
        }
        if (b10 == 3) {
            sharedPreferencesC5046p.f15333f.put(str, new C5035e(i10, c5042l.m20354i(interfaceC5496a)));
        } else if (b10 != 4) {
            sharedPreferencesC5046p.f15333f.put(str, new C5034d(i10, c5042l.m20353h(interfaceC5496a)));
        } else {
            sharedPreferencesC5046p.f15333f.put(str, new C5037g(i10, c5042l.m20360o(interfaceC5496a)));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m20335d(SharedPreferencesC5046p sharedPreferencesC5046p, C5042l c5042l, InterfaceC5496a interfaceC5496a, byte b10, String str, int i10, int i11, byte b11) throws Exception {
        boolean zM20333b = m20333b(b10);
        int iM20355j = zM20333b ? c5042l.m20355j() : c5042l.m20361p() & 65535;
        int i12 = zM20333b ? 4 : 2;
        boolean z10 = (b11 & JSONB.Constants.BC_INT32_SHORT_MIN) != 0;
        if (z10 && iM20355j != 32) {
            C10010p0.m38820a("name size not match");
            return;
        }
        byte bM20332a = m20332a(b10);
        if (bM20332a == 6) {
            sharedPreferencesC5046p.f15333f.put(str, new C5039i(i11, i10 + i12, z10 ? c5042l.m20362q(iM20355j) : c5042l.m20363r(interfaceC5496a, iM20355j), iM20355j, z10));
        } else if (bM20332a != 7) {
            m20338g(sharedPreferencesC5046p, c5042l, interfaceC5496a, str, i10, i11, iM20355j, z10, i12);
        } else {
            sharedPreferencesC5046p.f15333f.put(str, new C5031a(i11, i10 + i12, z10 ? c5042l.m20362q(iM20355j) : c5042l.m20350e(interfaceC5496a, iM20355j), iM20355j, z10));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        throw new java.lang.Exception("parse dara failed");
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m20336e(p183m6.SharedPreferencesC5046p r10, boolean r11) {
        /*
            r1 = 0
            if (r11 == 0) goto Lc
            r10.getClass()
            java.lang.String r11 = "miss cipher"
            p183m6.AbstractC5053w.m20452b(r10, r11)
            return r1
        Lc:
            if (r11 == 0) goto L11
            r10.getClass()
        L11:
            m6.l r3 = r10.f15335h
            r11 = 12
            r3.f15319c = r11
        L17:
            int r8 = r3.f15319c     // Catch: java.lang.Exception -> L44
            int r11 = r10.f15331d     // Catch: java.lang.Exception -> L44
            java.lang.String r0 = "parse dara failed"
            r2 = 1
            if (r8 >= r11) goto L8c
            byte r9 = r3.m20348c()     // Catch: java.lang.Exception -> L44
            r11 = r9 & 63
            byte r5 = (byte) r11     // Catch: java.lang.Exception -> L44
            if (r5 < r2) goto L86
            r11 = 11
            if (r5 > r11) goto L86
            byte r11 = r3.m20348c()     // Catch: java.lang.Exception -> L44
            r11 = r11 & 255(0xff, float:3.57E-43)
            if (r11 == 0) goto L7e
            r0 = 5
            if (r9 >= 0) goto L63
            int r2 = r3.f15319c     // Catch: java.lang.Exception -> L44
            int r2 = r2 + r11
            r3.f15319c = r2     // Catch: java.lang.Exception -> L44
            if (r5 > r0) goto L47
            int[] r11 = p183m6.SharedPreferencesC5046p.f15325A     // Catch: java.lang.Exception -> L44
            r11 = r11[r5]     // Catch: java.lang.Exception -> L44
            goto L5a
        L44:
            r0 = move-exception
        L45:
            r11 = r0
            goto L9a
        L47:
            boolean r11 = m20333b(r5)     // Catch: java.lang.Exception -> L44
            if (r11 == 0) goto L52
            int r11 = r3.m20355j()     // Catch: java.lang.Exception -> L44
            goto L5a
        L52:
            short r11 = r3.m20361p()     // Catch: java.lang.Exception -> L44
            r0 = 65535(0xffff, float:9.1834E-41)
            r11 = r11 & r0
        L5a:
            int r0 = r3.f15319c     // Catch: java.lang.Exception -> L44
            int r0 = r0 + r11
            r3.f15319c = r0     // Catch: java.lang.Exception -> L44
            p183m6.AbstractC5050t.m20441c(r10, r8, r0)     // Catch: java.lang.Exception -> L44
            goto L17
        L63:
            r4 = 0
            java.lang.String r6 = r3.m20363r(r4, r11)     // Catch: java.lang.Exception -> L44
            int r7 = r3.f15319c     // Catch: java.lang.Exception -> L44
            if (r5 > r0) goto L76
            r2 = r10
            m20334c(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L72
            r10 = r2
            goto L17
        L72:
            r0 = move-exception
            r11 = r0
            r10 = r2
            goto L9a
        L76:
            r2 = r10
            m20335d(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L7b
            goto L17
        L7b:
            r0 = move-exception
            r10 = r2
            goto L45
        L7e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L44
            java.lang.String r0 = "invalid key size"
            r11.<init>(r0)     // Catch: java.lang.Exception -> L44
            throw r11     // Catch: java.lang.Exception -> L44
        L86:
            java.lang.Exception r11 = new java.lang.Exception     // Catch: java.lang.Exception -> L44
            r11.<init>(r0)     // Catch: java.lang.Exception -> L44
            throw r11     // Catch: java.lang.Exception -> L44
        L8c:
            if (r8 == r11) goto L97
            java.lang.Exception r11 = new java.lang.Exception
            r11.<init>(r0)
            p183m6.AbstractC5053w.m20451a(r10, r11)
            return r1
        L97:
            r10.f15339l = r1
            return r2
        L9a:
            p183m6.AbstractC5053w.m20451a(r10, r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p183m6.AbstractC5041k.m20336e(m6.p, boolean):boolean");
    }

    /* JADX INFO: renamed from: f */
    public static void m20337f(SharedPreferencesC5046p sharedPreferencesC5046p, InterfaceC5496a interfaceC5496a, String str, int i10, int i11, int i12) throws Exception {
        int length;
        C5042l c5042l;
        if (interfaceC5496a == null) {
            c5042l = sharedPreferencesC5046p.f15335h;
            length = i12;
        } else {
            byte[] bArr = new byte[i12];
            C5042l c5042l2 = sharedPreferencesC5046p.f15335h;
            System.arraycopy(c5042l2.f15318b, c5042l2.f15319c, bArr, 0, i12);
            byte[] bArrM22344a = interfaceC5496a.m22344a(bArr);
            C5042l c5042l3 = new C5042l(bArrM22344a);
            length = bArrM22344a.length;
            c5042l = c5042l3;
        }
        int iM20348c = c5042l.m20348c() & 255;
        String strM20362q = c5042l.m20362q(iM20348c);
        InterfaceC5497b interfaceC5497b = (InterfaceC5497b) sharedPreferencesC5046p.f15330c.get(strM20362q);
        int i13 = length - (iM20348c + 1);
        if (i13 < 0) {
            throw new Exception("parse dara failed");
        }
        if (interfaceC5497b == null) {
            AbstractC5053w.m20452b(sharedPreferencesC5046p, "object with tag: " + strM20362q + " without encoder");
            return;
        }
        try {
            Object objMo20456a = interfaceC5497b.mo20456a(c5042l.f15318b, c5042l.f15319c, i13);
            if (objMo20456a != null) {
                C5038h c5038h = new C5038h(i11, i10 + 2, objMo20456a, i12, false);
                c5038h.f15312f = interfaceC5497b;
                sharedPreferencesC5046p.f15333f.put(str, c5038h);
            }
        } catch (Exception e10) {
            AbstractC5053w.m20451a(sharedPreferencesC5046p, e10);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m20338g(SharedPreferencesC5046p sharedPreferencesC5046p, C5042l c5042l, InterfaceC5496a interfaceC5496a, String str, int i10, int i11, int i12, boolean z10, int i13) throws Exception {
        if (z10) {
            sharedPreferencesC5046p.f15333f.put(str, new C5038h(i11, i10 + i13, c5042l.m20362q(i12), i12, true));
        } else {
            m20337f(sharedPreferencesC5046p, interfaceC5496a, str, i10, i11, i12);
            c5042l.f15319c = i10 + i13 + i12;
        }
    }
}
