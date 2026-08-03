package p381zb;

import okhttp3.HttpUrl;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3147k;

/* JADX INFO: renamed from: zb.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6134c {

    /* JADX INFO: renamed from: a */
    public static final C3147k f24714a = new C3147k("[0-9a-fA-F]{24,64}");

    /* JADX INFO: renamed from: b */
    public static final C3147k f24715b = new C3147k("[0-9]{12,}");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m10904a(char c10) {
        if ('A' <= c10 && c10 < '[') {
            return true;
        }
        if ('a' > c10 || c10 >= '{') {
            return ('0' <= c10 && c10 < ':') || c10 == '_' || c10 == '-' || c10 == '.';
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m10905b(String str) {
        String string = str != null ? AbstractC3149m.m6703R0(str).toString() : null;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int length = string.length();
        if (3 <= length && length < 81 && !AbstractC3156t.m6733W(string, "@chatroom", false) && !AbstractC3156t.m6733W(string, "@im.chatroom", false) && !AbstractC3149m.m6710i0(string, ':') && !AbstractC3149m.m6710i0(string, '\n') && !AbstractC3149m.m6710i0(string, '\r') && !AbstractC3149m.m6710i0(string, ' ') && !AbstractC3156t.m6740d0(string, "http://", false) && !AbstractC3156t.m6740d0(string, "https://", false) && !AbstractC3156t.m6740d0(string, "THUMBNAIL_DIRPATH://", false)) {
            if (AbstractC3156t.m6733W(string, "@openim", false)) {
                String strM6687B0 = AbstractC3149m.m6687B0(string, "@openim");
                if (strM6687B0.length() > 0 && !AbstractC3149m.m6710i0(strM6687B0, '@')) {
                    for (int i9 = 0; i9 < strM6687B0.length(); i9++) {
                        if (m10904a(strM6687B0.charAt(i9))) {
                        }
                    }
                    return true;
                }
            } else if (!AbstractC3149m.m6710i0(string, '@') && !f24714a.m6683d(string) && !f24715b.m6683d(string)) {
                int i10 = 0;
                while (true) {
                    if (i10 >= string.length()) {
                        break;
                    }
                    char cCharAt = string.charAt(i10);
                    if (('A' <= cCharAt && cCharAt < '[') || ('a' <= cCharAt && cCharAt < '{')) {
                        for (int i11 = 0; i11 < string.length(); i11++) {
                            if (m10904a(string.charAt(i11))) {
                            }
                        }
                    } else {
                        i10++;
                    }
                }
            }
        }
        return false;
    }
}
