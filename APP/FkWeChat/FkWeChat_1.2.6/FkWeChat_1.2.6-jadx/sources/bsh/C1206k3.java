package bsh;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: renamed from: bsh.k3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1206k3 extends C1163d2 {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: w */
    public static String f3657w;

    /* JADX INFO: renamed from: t */
    public C1261t4 f3658t;

    /* JADX INFO: renamed from: u */
    public int[][] f3659u;

    /* JADX INFO: renamed from: v */
    public String[] f3660v;

    public C1206k3(C1261t4 c1261t4, int[][] iArr, String[] strArr) {
        super(m4507i(c1261t4, iArr, strArr), null, null);
        this.f3658t = c1261t4;
        this.f3659u = iArr;
        this.f3660v = strArr;
    }

    /* JADX INFO: renamed from: g */
    public static String m4506g(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\f') {
                sb2.append("\\f");
            } else if (cCharAt == '\r') {
                sb2.append("\\r");
            } else if (cCharAt == '\"') {
                sb2.append("\\\"");
            } else if (cCharAt == '\'') {
                sb2.append("\\'");
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        sb2.append("\\b");
                        break;
                    case '\t':
                        sb2.append("\\t");
                        break;
                    case '\n':
                        sb2.append("\\n");
                        break;
                    default:
                        char cCharAt2 = str.charAt(i10);
                        if (cCharAt2 < ' ' || cCharAt2 > '~') {
                            String str2 = "0000" + Integer.toString(cCharAt2, 16);
                            sb2.append("\\u".concat(str2.substring(str2.length() - 4, str2.length())));
                        } else {
                            sb2.append(cCharAt2);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m4507i(C1261t4 c1261t4, int[][] iArr, String[] strArr) {
        StringBuilder sb2 = new StringBuilder("Unable to parse code syntax. Encountered:");
        if (c1261t4 != null) {
            C1261t4 c1261t42 = c1261t4;
            while (true) {
                c1261t42 = c1261t42.f3821w;
                if (c1261t42 == null) {
                    break;
                }
                sb2.append(" ");
                sb2.append(m4506g(c1261t42.f3820v));
            }
            sb2.append(" at line ");
            sb2.append(c1261t4.f3821w.f3816r);
            sb2.append(", column ");
            sb2.append(c1261t4.f3821w.f3817s);
            if (f3657w != null) {
                sb2.append(" in: ");
                sb2.append(f3657w);
            }
        }
        if (((Boolean) RunnableC1205k2.f3633D.get()).booleanValue() && iArr.length != 0) {
            sb2.append(System.getProperty("line.separator", "\n"));
            sb2.append("Exppected");
            if (iArr.length > 1) {
                sb2.append(" one of");
            }
            sb2.append(": ");
            for (int[] iArr2 : iArr) {
                int i10 = 0;
                while (true) {
                    if (i10 < iArr2.length) {
                        sb2.append(strArr[iArr2[i10]].replace('\"', ' ').trim());
                        sb2.append(' ');
                        i10++;
                    }
                }
            }
        }
        return sb2.toString();
    }

    @Override // bsh.C1163d2, java.lang.Throwable
    public String getMessage() {
        return m4507i(this.f3658t, this.f3659u, this.f3660v);
    }

    /* JADX INFO: renamed from: h */
    public String m4508h(boolean z10) {
        return getMessage();
    }

    /* JADX INFO: renamed from: j */
    public void m4509j(String str) {
        f3657w = str;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getMessage();
    }

    public C1206k3() {
        this(_UrlKt.FRAGMENT_ENCODE_SET);
    }

    public C1206k3(String str) {
        super(str, null, null);
    }

    public C1206k3(String str, Throwable th) {
        super(str, null, null, th);
    }
}
