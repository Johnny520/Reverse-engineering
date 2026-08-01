package p371;

import bsh.C2632;
import java.io.IOException;
import java.io.StringWriter;
import org.apache.commons.lang3.AbstractC5702;

/* JADX INFO: renamed from: 飘花落叶言苏子哲兰世楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8970 extends AbstractC8968 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f25208;

    @Override // p371.AbstractC8968
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo11003(CharSequence charSequence, int i, StringWriter stringWriter) throws IOException {
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        int i2;
        int i3;
        int i4 = 2;
        switch (this.f25208) {
            case 0:
                int length = (charSequence.length() - i) - 1;
                StringBuilder sb = new StringBuilder();
                if (charSequence.charAt(i) != '\\' || length <= 0) {
                    return 0;
                }
                int i5 = i + 1;
                char cCharAt4 = charSequence.charAt(i5);
                int i6 = AbstractC5702.f15640;
                if (cCharAt4 < '0' || cCharAt4 > '7') {
                    return 0;
                }
                int i7 = i + 2;
                int i8 = i + 3;
                sb.append(charSequence.charAt(i5));
                if (length > 1 && (cCharAt = charSequence.charAt(i7)) >= '0' && cCharAt <= '7') {
                    sb.append(charSequence.charAt(i7));
                    if (length > 2 && (cCharAt2 = charSequence.charAt(i5)) >= '0' && cCharAt2 <= '3' && (cCharAt3 = charSequence.charAt(i8)) >= '0' && cCharAt3 <= '7') {
                        sb.append(charSequence.charAt(i8));
                    }
                }
                stringWriter.write(Integer.parseInt(sb.toString(), 8));
                return sb.length() + 1;
            default:
                if (charSequence.charAt(i) != '\\' || (i2 = i + 1) >= charSequence.length() || charSequence.charAt(i2) != 'u') {
                    return 0;
                }
                while (true) {
                    i3 = i + i4;
                    if (i3 < charSequence.length() && charSequence.charAt(i3) == 'u') {
                        i4++;
                    }
                }
                if (i3 < charSequence.length() && charSequence.charAt(i3) == '+') {
                    i4++;
                }
                int i9 = i + i4;
                int i10 = i9 + 4;
                if (i10 > charSequence.length()) {
                    C2632.m5295(charSequence.subSequence(i, charSequence.length()), "Less than 4 hex digits in unicode value: '", "' due to end of CharSequence");
                    return 0;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(i9, i10);
                try {
                    stringWriter.write((char) Integer.parseInt(charSequenceSubSequence.toString(), 16));
                    return i4 + 4;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Unable to parse unicode value: " + ((Object) charSequenceSubSequence), e);
                }
        }
    }
}
