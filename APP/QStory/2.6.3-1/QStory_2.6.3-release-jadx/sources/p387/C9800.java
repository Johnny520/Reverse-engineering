package p387;

import bsh.C3466;
import java.io.IOException;
import java.io.StringWriter;
import org.apache.commons.lang3.AbstractC6533;

/* JADX INFO: renamed from: 飘花落叶言苏子哲兰楪世.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9800 extends AbstractC9798 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f25543;

    @Override // p387.AbstractC9798
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo11619(CharSequence charSequence, int i, StringWriter stringWriter) throws IOException {
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        int i2;
        int i3;
        int i4 = 2;
        switch (this.f25543) {
            case 0:
                int length = (charSequence.length() - i) - 1;
                StringBuilder sb = new StringBuilder();
                if (charSequence.charAt(i) != '\\' || length <= 0) {
                    return 0;
                }
                int i5 = i + 1;
                char cCharAt4 = charSequence.charAt(i5);
                int i6 = AbstractC6533.f15985;
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
                    C3466.m5900(charSequence.subSequence(i, charSequence.length()), "Less than 4 hex digits in unicode value: '", "' due to end of CharSequence");
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
