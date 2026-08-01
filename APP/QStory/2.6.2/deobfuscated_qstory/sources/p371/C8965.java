package p371;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;

/* JADX INFO: renamed from: 飘花落叶言苏子哲兰世楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8965 extends AbstractC8967 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f25194;

    @Override // p371.AbstractC8967
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo14546(int i, StringWriter stringWriter) throws IOException {
        switch (this.f25194) {
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
                        char[] cArr = AbstractC8968.f25205;
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
