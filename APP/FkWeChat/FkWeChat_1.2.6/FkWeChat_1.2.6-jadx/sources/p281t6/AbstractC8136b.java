package p281t6;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p080f9.C2356c;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5071c1;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p299ub.C8614c;

/* JADX INFO: renamed from: t6.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8136b {

    /* JADX INFO: renamed from: a */
    public static final Set f27204a;

    /* JADX INFO: renamed from: b */
    public static final Set f27205b;

    /* JADX INFO: renamed from: c */
    public static final Set f27206c;

    /* JADX INFO: renamed from: d */
    public static final List f27207d;

    /* JADX INFO: renamed from: e */
    public static final Set f27208e;

    /* JADX INFO: renamed from: f */
    public static final Set f27209f;

    /* JADX INFO: renamed from: g */
    public static final List f27210g;

    static {
        List listM20533E0 = AbstractC5081g0.m20533E0(AbstractC5081g0.m20531C0(new C2356c('a', 'z'), new C2356c('A', 'Z')), new C2356c('0', '9'));
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listM20533E0, 10));
        Iterator it = listM20533E0.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        f27204a = AbstractC5081g0.m20564c1(arrayList);
        f27205b = AbstractC5081g0.m20564c1(AbstractC5081g0.m20533E0(AbstractC5081g0.m20531C0(new C2356c('a', 'z'), new C2356c('A', 'Z')), new C2356c('0', '9')));
        f27206c = AbstractC5081g0.m20564c1(AbstractC5081g0.m20533E0(AbstractC5081g0.m20531C0(new C2356c('a', 'f'), new C2356c('A', 'F')), new C2356c('0', '9')));
        Set setM20487i = AbstractC5068b1.m20487i(':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', '-', '.', '_', '~', '+');
        ArrayList arrayList2 = new ArrayList(AbstractC5116y.m20814z(setM20487i, 10));
        Iterator it2 = setM20487i.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        f27207d = arrayList2;
        f27208e = AbstractC5068b1.m20487i(':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', '-', '.', '_', '~');
        f27209f = AbstractC5071c1.m20503l(f27205b, AbstractC5068b1.m20487i('!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'));
        List listM20803r = AbstractC5114x.m20803r('-', '.', '_', '~');
        ArrayList arrayList3 = new ArrayList(AbstractC5116y.m20814z(listM20803r, 10));
        Iterator it3 = listM20803r.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        f27210g = arrayList3;
    }

    /* JADX INFO: renamed from: a */
    public static final int m31586a(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        if ('a' > c10 || c10 >= 'g') {
            return -1;
        }
        return c10 - 'W';
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        r0.append(p299ub.AbstractC8611a0.m33056A(r2, 0, r4, false, 4, null));
        r9 = r2;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String m31587b(java.lang.CharSequence r8, int r9, int r10, int r11, boolean r12, java.nio.charset.Charset r13) throws p281t6.C8157l0 {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p281t6.AbstractC8136b.m31587b(java.lang.CharSequence, int, int, int, boolean, java.nio.charset.Charset):java.lang.String");
    }

    /* JADX INFO: renamed from: c */
    public static final String m31588c(String str, int i10, int i11, boolean z10, Charset charset) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (z10 && cCharAt == '+')) {
                return m31587b(str, i10, i11, i12, z10, charset);
            }
        }
        return (i10 == 0 && i11 == str.length()) ? str.toString() : str.substring(i10, i11);
    }

    /* JADX INFO: renamed from: d */
    public static final String m31589d(String str, int i10, int i11, Charset charset) {
        str.getClass();
        charset.getClass();
        return m31588c(str, i10, i11, false, charset);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m31590e(String str, int i10, int i11, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            charset = C8614c.f28652b;
        }
        return m31589d(str, i10, i11, charset);
    }

    /* JADX INFO: renamed from: f */
    public static final String m31591f(String str, int i10, int i11, boolean z10, Charset charset) {
        str.getClass();
        charset.getClass();
        return m31588c(str, i10, i11, z10, charset);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m31592g(String str, int i10, int i11, boolean z10, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            charset = C8614c.f28652b;
        }
        return m31591f(str, i10, i11, z10, charset);
    }
}
