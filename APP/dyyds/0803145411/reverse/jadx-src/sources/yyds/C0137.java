package yyds;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: yyds.ᛱᛶᛱᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0137 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0137 f842 = new C0137();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    private static final InterfaceC0826 f843 = AbstractC1579.m3237(1, new C0824(10));

    /* JADX INFO: renamed from: yyds.ᛱᛶᛱᛴ$ᛲᲈᲁ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public static final class C0138 {

        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
        private final int f844;

        /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
        private final long f845;

        public C0138(int i, long j) {
            this.f844 = i;
            this.f845 = j;
        }

        /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
        public static /* synthetic */ C0138 m619(C0138 c0138, int i, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = c0138.f844;
            }
            if ((i2 & 2) != 0) {
                j = c0138.f845;
            }
            return c0138.m623(i, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0138)) {
                return false;
            }
            C0138 c0138 = (C0138) obj;
            return this.f844 == c0138.f844 && this.f845 == c0138.f845;
        }

        public int hashCode() {
            return Long.hashCode(this.f845) + (Integer.hashCode(this.f844) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-562902281651054L));
            AbstractC2104.m4007(sb, this.f844, -562962411193198L);
            sb.append(this.f845);
            sb.append(')');
            return sb.toString();
        }

        /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
        public final int m620() {
            return this.f844;
        }

        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
        public final int m621() {
            return this.f844;
        }

        /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
        public final long m622() {
            return this.f845;
        }

        /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
        public final C0138 m623(int i, long j) {
            return new C0138(i, j);
        }

        /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
        public final long m624() {
            return this.f845;
        }
    }

    private C0137() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C0138 m613() {
        return f842.m615();
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    private final C0138 m615() {
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(2147483646) + 1;
        long jNextLong = secureRandom.nextLong() & Long.MAX_VALUE;
        if (jNextLong == 0) {
            jNextLong = 1;
        }
        return new C0138(iNextInt, jNextLong);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    private final C0138 m616() {
        Object c2658;
        String strM1455;
        int iEnd;
        int iM1290;
        int iM1307;
        List listSingletonList;
        try {
            File file = new File(AbstractC2328.m4341(-689097010742126L));
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), AbstractC0347.f1806);
            try {
                strM1455 = AbstractC0578.m1455(inputStreamReader);
                inputStreamReader.close();
                iEnd = 0;
                iM1290 = AbstractC0473.m1290(strM1455, ' ', 0, 6);
                iM1307 = AbstractC0473.m1307(strM1455, ')', 0, 6);
            } finally {
            }
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        if (iM1290 <= 0 || iM1307 <= iM1290) {
            throw new IllegalArgumentException(AbstractC2328.m4341(-689165730218862L).toString());
        }
        String strSubstring = strM1455.substring(0, iM1290);
        AbstractC2328.m4341(-689251629564782L);
        int i = Integer.parseInt(strSubstring);
        String strSubstring2 = strM1455.substring(iM1307 + 1);
        AbstractC2328.m4341(-689316054074222L);
        String string = AbstractC0473.m1314(strSubstring2).toString();
        Pattern patternCompile = Pattern.compile(AbstractC2328.m4341(-689380478583662L));
        AbstractC0473.m1305(0);
        Matcher matcher = patternCompile.matcher(string);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            do {
                arrayList.add(string.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(string.subSequence(iEnd, string.length()).toString());
            listSingletonList = arrayList;
        } else {
            listSingletonList = Collections.singletonList(string.toString());
        }
        if (listSingletonList.size() <= 19) {
            throw new IllegalArgumentException(AbstractC2328.m4341(-689397658452846L).toString());
        }
        long j = Long.parseLong((String) listSingletonList.get(19));
        if (i <= 0 || j <= 0) {
            throw new IllegalArgumentException(AbstractC2328.m4341(-689483557798766L).toString());
        }
        c2658 = new C0138(i, j);
        if (c2658 instanceof C2658) {
            c2658 = null;
        }
        return (C0138) c2658;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    private final C0138 m617() {
        return (C0138) f843.getValue();
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0138 m618() {
        C0138 c0138M616 = m616();
        if (c0138M616 != null) {
            return c0138M616;
        }
        String property = System.getProperty(AbstractC2328.m4341(-688723348587374L));
        if (property == null) {
            property = AbstractC2328.m4341(-688800657998702L);
        }
        String property2 = System.getProperty(AbstractC2328.m4341(-688804952965998L));
        if (property2 == null) {
            property2 = AbstractC2328.m4341(-688860787540846L);
        }
        if (AbstractC0473.m1301(property, AbstractC2328.m4341(-688865082508142L), true) || AbstractC0473.m1301(property2, AbstractC2328.m4341(-688899442246510L), true)) {
            throw new SecurityException(AbstractC2328.m4341(-688929507017582L));
        }
        return m617();
    }
}
