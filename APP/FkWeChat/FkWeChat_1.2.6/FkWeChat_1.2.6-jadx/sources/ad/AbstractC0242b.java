package ad;

/* JADX INFO: renamed from: ad.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0242b {
    /* JADX INFO: renamed from: a */
    public static final byte m651a(char c10) {
        if (c10 < '~') {
            return C0272l.f665c[c10];
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: b */
    public static final char m652b(int i10) {
        if (i10 < 117) {
            return C0272l.f664b[i10];
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: c */
    public static final String m653c(byte b10) {
        return b10 == 1 ? "quotation mark '\"'" : b10 == 2 ? "string escape sequence '\\'" : b10 == 4 ? "comma ','" : b10 == 5 ? "colon ':'" : b10 == 6 ? "start of the object '{'" : b10 == 7 ? "end of the object '}'" : b10 == 8 ? "start of the array '['" : b10 == 9 ? "end of the array ']'" : b10 == 10 ? "end of the input" : b10 == 127 ? "invalid token" : "valid token";
    }
}
