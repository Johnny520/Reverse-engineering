package bsh;

/* JADX INFO: renamed from: bsh.u4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1267u4 extends RuntimeException {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: q */
    public int f3834q;

    public C1267u4(boolean z10, int i10, int i11, int i12, String str, int i13, int i14) {
        this(m5106a(z10, i10, i11, i12, str, i13), i14);
    }

    /* JADX INFO: renamed from: a */
    public static String m5106a(boolean z10, int i10, int i11, int i12, String str, int i13) {
        String str2;
        char c10 = (char) i13;
        StringBuilder sb2 = new StringBuilder("Lexical error at line ");
        sb2.append(i11);
        sb2.append(", column ");
        sb2.append(i12);
        sb2.append(".  Encountered: ");
        if (z10) {
            str2 = "<EOF> ";
        } else {
            str2 = "\"" + m5107b(String.valueOf(c10)) + "\" (" + i13 + "), ";
        }
        sb2.append(str2);
        sb2.append("after : \"");
        sb2.append(m5107b(str));
        sb2.append("\"");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static final String m5107b(String str) {
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
                        if (cCharAt < ' ' || cCharAt > '~') {
                            String str2 = "0000" + Integer.toString(cCharAt, 16);
                            sb2.append("\\u");
                            sb2.append(str2.substring(str2.length() - 4, str2.length()));
                        } else {
                            sb2.append(cCharAt);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }

    public C1267u4(String str, int i10) {
        super(str);
        this.f3834q = i10;
    }
}
