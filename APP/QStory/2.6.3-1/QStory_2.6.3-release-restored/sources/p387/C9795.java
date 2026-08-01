package p387;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;

/* JADX INFO: renamed from: 飘花落叶言苏子哲兰楪世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9795 extends AbstractC9797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f25529;

    @Override // p387.AbstractC9797
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo15137(int i, StringWriter stringWriter) throws IOException {
        switch (this.f25529) {
            case 0:
                if (i < 32 || i > 127) {
                    if (i > 65535) {
                        char[] chars = Character.toChars(i);
                        StringBuilder sb = new StringBuilder("\\u");
                        String hexString = Integer.toHexString(chars[0]);
                        Locale locale = Locale.ENGLISH;
                        sb.append(hexString.toUpperCase(locale));
                        sb.append("\\u");
                        sb.append(Integer.toHexString(chars[1]).toUpperCase(locale));
                        stringWriter.write(sb.toString());
                    } else {
                        stringWriter.write("\\u");
                        char[] cArr = AbstractC9798.f25540;
                        stringWriter.write(cArr[(i >> 12) & 15]);
                        stringWriter.write(cArr[(i >> 8) & 15]);
                        stringWriter.write(cArr[(i >> 4) & 15]);
                        stringWriter.write(cArr[i & 15]);
                    }
                }
                break;
            default:
                if (i >= 55296 && i <= 57343) {
                    break;
                }
                break;
        }
        return true;
    }
}
