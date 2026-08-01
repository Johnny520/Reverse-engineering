package p237s4;

import me.dartcv.nuke.BuildConfig;
import p273z0.AbstractC3510c;

/* JADX INFO: renamed from: s4.a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3202a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m5466a(StringBuilder sb, int i5, char c5) {
        sb.append(i5);
        sb.append(c5);
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m5467b(int i5, int i6, int i7, int i8, int i9) {
        AbstractC3510c.m5763a(i5);
        AbstractC3510c.m5763a(i6);
        AbstractC3510c.m5763a(i7);
        AbstractC3510c.m5763a(i8);
        AbstractC3510c.m5763a(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m5468c(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m5469d(int i5) {
        switch (i5) {
            case BuildConfig.VERSION_CODE /* 1 */:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
