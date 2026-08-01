package p000;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class cf1 {

    /* JADX INFO: renamed from: a */
    public static final cf1 f801a = new cf1();

    /* JADX INFO: renamed from: b */
    public static final int f802b = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private cf1() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    private final String m513b(String str) {
        int length;
        int length2;
        if (!k41.m1764V(str, "red_id", false)) {
            return null;
        }
        Pattern patternCompile = Pattern.compile("<string\\s+name=\"red_id\">([^<]+)<");
        patternCompile.getClass();
        str.getClass();
        Matcher matcher = patternCompile.matcher(str);
        matcher.getClass();
        od0 od0VarM1204c = g60.m1204c(matcher, 0, str);
        if (od0VarM1204c != null) {
            String str2 = (String) ((nd0) od0VarM1204c.m2878a()).get(1);
            if (!k41.m1769a0(str2) && 2 <= (length2 = str2.length()) && length2 < 41) {
                return str2;
            }
        }
        Pattern patternCompile2 = Pattern.compile("<long\\s+name=\"red_id\"\\s+value=\"([^\"]+)\"");
        patternCompile2.getClass();
        Matcher matcher2 = patternCompile2.matcher(str);
        matcher2.getClass();
        od0 od0VarM1204c2 = g60.m1204c(matcher2, 0, str);
        if (od0VarM1204c2 == null) {
            return null;
        }
        String str3 = (String) ((nd0) od0VarM1204c2.m2878a()).get(1);
        if (k41.m1769a0(str3) || 2 > (length = str3.length()) || length >= 41) {
            return null;
        }
        return str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    private final String m514g(String str) {
        File[] fileArrListFiles;
        String strM513b;
        File file = new File(str, "shared_prefs");
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles(new bf1())) == null) {
            return null;
        }
        for (File file2 : fileArrListFiles) {
            try {
                file2.getClass();
                strM513b = m513b(AbstractC0627pt.m3156c0(file2));
            } catch (Exception unused) {
            }
            if (strM513b != null) {
                return strM513b;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final boolean m515h(File file) {
        if (file.isFile()) {
            String name = file.getName();
            name.getClass();
            if (r41.m3380Q(name, ".xml", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    private final String m516i(Class<?> cls, Object obj, String... strArr) {
        String str;
        for (String str2 : strArr) {
            try {
                Object objInvoke = cls.getMethod(str2, null).invoke(obj, null);
                str = objInvoke instanceof String ? (String) objInvoke : null;
            } catch (Exception unused) {
            }
            if (str != null && !k41.m1769a0(str)) {
                return str;
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m517c(String str, ClassLoader classLoader) {
        int length;
        str.getClass();
        classLoader.getClass();
        C0090a c0090aM518d = m518d(classLoader);
        if (c0090aM518d != null) {
            String strM526f = c0090aM518d.m526f();
            if (!k41.m1769a0(strM526f) && 2 <= (length = strM526f.length()) && length < 41) {
                return strM526f;
            }
        }
        String strM514g = m514g(str);
        if (strM514g != null) {
            return strM514g;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C0090a m518d(ClassLoader classLoader) {
        String str;
        String str2;
        String strM516i = "";
        classLoader.getClass();
        try {
            Class<?> clsLoadClass = classLoader.loadClass("com.xingin.account.impl.UserServiceImpl");
            Object objInvoke = clsLoadClass.getMethod("getUserInfo", null).invoke(clsLoadClass.getDeclaredField("INSTANCE").get(null), null);
            if (objInvoke != null) {
                try {
                    Object objInvoke2 = classLoader.loadClass("com.xingin.account.entities.BaseUserInfo").getMethod("getUserid", null).invoke(objInvoke, null);
                    str = objInvoke2 instanceof String ? (String) objInvoke2 : null;
                } catch (Exception unused) {
                }
                if (str == null) {
                    str = "";
                }
                try {
                    Object objInvoke3 = classLoader.loadClass("com.xingin.account.entities.BaseUserInfo").getMethod("getRedId", null).invoke(objInvoke, null);
                    str2 = objInvoke3 instanceof String ? (String) objInvoke3 : null;
                } catch (Exception unused2) {
                }
                if (str2 == null) {
                    str2 = "";
                }
                try {
                    Class<?> clsLoadClass2 = classLoader.loadClass("com.xingin.account.entities.BaseUserInfo");
                    clsLoadClass2.getClass();
                    strM516i = m516i(clsLoadClass2, objInvoke, "getNickname", "getNickName", "getName", "getScreenName");
                } catch (Exception unused3) {
                }
                if (!k41.m1769a0(str) || !k41.m1769a0(str2)) {
                    if (k41.m1769a0(str2) && str.length() >= 20) {
                        for (int i = 0; i < str.length(); i++) {
                            char cCharAt = str.charAt(i);
                            if (('0' > cCharAt || cCharAt >= ':') && (('a' > cCharAt || cCharAt >= 'g') && ('A' > cCharAt || cCharAt >= 'G'))) {
                            }
                        }
                    }
                    return new C0090a(str2, str, strM516i);
                }
            }
        } catch (Exception unused4) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m519e(String str, ClassLoader classLoader) {
        str.getClass();
        classLoader.getClass();
        return m517c(str, classLoader) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m520f(ClassLoader classLoader) {
        classLoader.getClass();
        return m518d(classLoader) != null;
    }

    /* JADX INFO: renamed from: cf1$a */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C0090a {

        /* JADX INFO: renamed from: d */
        public static final int f803d = 0;

        /* JADX INFO: renamed from: a */
        private final String f804a;

        /* JADX INFO: renamed from: b */
        private final String f805b;

        /* JADX INFO: renamed from: c */
        private final String f806c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0090a(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            this.f804a = str;
            this.f805b = str2;
            this.f806c = str3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: e */
        public static /* synthetic */ C0090a m521e(C0090a c0090a, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c0090a.f804a;
            }
            if ((i & 2) != 0) {
                str2 = c0090a.f805b;
            }
            if ((i & 4) != 0) {
                str3 = c0090a.f806c;
            }
            return c0090a.m525d(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a */
        public final String m522a() {
            return this.f804a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: b */
        public final String m523b() {
            return this.f805b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: c */
        public final String m524c() {
            return this.f806c;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: d */
        public final C0090a m525d(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            return new C0090a(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0090a)) {
                return false;
            }
            C0090a c0090a = (C0090a) obj;
            return p30.m3002l(this.f804a, c0090a.f804a) && p30.m3002l(this.f805b, c0090a.f805b) && p30.m3002l(this.f806c, c0090a.f806c);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: f */
        public final String m526f() {
            String str = this.f804a;
            return str.length() == 0 ? this.f805b : str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: g */
        public final String m527g() {
            return this.f806c;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: h */
        public final String m528h() {
            return this.f804a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return this.f806c.hashCode() + ((this.f805b.hashCode() + (this.f804a.hashCode() * 31)) * 31);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: i */
        public final String m529i() {
            return this.f805b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "XhsUserInfo(redId=" + this.f804a + ", userid=" + this.f805b + ", nickname=" + this.f806c + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:21) call: cf1.a.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ C0090a(String str, String str2, String str3, int i, AbstractC0619pl abstractC0619pl) {
            this(str, str2, (i & 4) != 0 ? "" : str3);
        }
    }
}
