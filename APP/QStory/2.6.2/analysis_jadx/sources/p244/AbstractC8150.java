package p244;

import io.ktor.util.AbstractC4216;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲子世苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean[] f22477;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Set f22478;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean[] f22479;

    static {
        char[] cArr = {'A', 'a', 'C', 'c', 'l', 'L', 'P', Advice.OffsetMapping.ForOrigin.Renderer.ForPropertyName.SYMBOL, 'n', 'N'};
        boolean[] zArr = new boolean[256];
        int i = 0;
        while (true) {
            int i2 = -1;
            boolean z = true;
            if (i >= 256) {
                break;
            }
            char c = (char) i;
            int i3 = 0;
            while (true) {
                if (i3 >= 10) {
                    break;
                }
                if (c == cArr[i3]) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
            if (i2 < 0) {
                z = false;
            }
            zArr[i] = z;
            i++;
        }
        f22479 = zArr;
        f22478 = AbstractC4346.m8852(new String[]{"CON", "PRN", "AUX", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9"});
        char[] cArr2 = {'\\', '/', ':', TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH, '?', '\"', '<', '>', '|'};
        boolean[] zArr2 = new boolean[256];
        for (int i4 = 0; i4 < 256; i4++) {
            char c2 = (char) i4;
            int i5 = 0;
            while (true) {
                if (i5 >= 9) {
                    i5 = -1;
                    break;
                } else if (c2 == cArr2[i5]) {
                    break;
                } else {
                    i5++;
                }
            }
            zArr2[i4] = i5 >= 0;
        }
        f22477 = zArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m13573(java.lang.String r7) {
        /*
            int r0 = r7.length()
            r1 = 1
            if (r0 != 0) goto L9
            goto L71
        L9:
            r2 = 0
            char r3 = r7.charAt(r2)
            r4 = 46
            if (r3 != r4) goto L1e
            if (r0 == r1) goto L71
            r5 = 2
            if (r0 != r5) goto L1e
            char r5 = r7.charAt(r1)
            if (r5 != r4) goto L1e
            goto L71
        L1e:
            r5 = 126(0x7e, float:1.77E-43)
            if (r3 != r5) goto L25
            if (r0 != r1) goto L25
            goto L71
        L25:
            boolean[] r5 = p244.AbstractC8150.f22479
            r5.getClass()
            int r6 = r5.length
            if (r3 >= r6) goto L44
            boolean r3 = r5[r3]
            if (r3 == 0) goto L44
            java.util.Set r3 = p244.AbstractC8150.f22478
            boolean r5 = r3.contains(r7)
            if (r5 != 0) goto L71
            java.lang.String r5 = io.ktor.util.AbstractC4216.m8642(r7)
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L44
            goto L71
        L44:
            int r0 = r0 - r1
            char r0 = r7.charAt(r0)
            r3 = 32
            if (r0 == r3) goto L71
            if (r0 == r4) goto L71
            r0 = r2
        L50:
            int r4 = r7.length()
            if (r0 >= r4) goto L70
            char r4 = r7.charAt(r0)
            int r5 = kotlin.jvm.internal.AbstractC4394.m8915(r4, r3)
            if (r5 < 0) goto L71
            boolean[] r5 = p244.AbstractC8150.f22477
            r5.getClass()
            int r6 = r5.length
            if (r4 >= r6) goto L6d
            boolean r4 = r5[r4]
            if (r4 == 0) goto L6d
            return r1
        L6d:
            int r0 = r0 + 1
            goto L50
        L70:
            return r2
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p244.AbstractC8150.m13573(java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m13574(String str, ArrayList arrayList) {
        CharSequence charSequenceSubSequence;
        if (str.length() == 0 || str.equals(".") || str.equals("~") || f22478.contains(AbstractC4216.m8642(str))) {
            return;
        }
        if (str.equals("..")) {
            if (arrayList.isEmpty()) {
                return;
            }
            arrayList.remove(arrayList.size() - 1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (AbstractC4394.m8915(cCharAt, 32) >= 0) {
                boolean[] zArr = f22477;
                zArr.getClass();
                if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                    sb.append(cCharAt);
                }
            }
        }
        String string = sb.toString();
        int length2 = string.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i2 = length2 - 1;
                char cCharAt2 = string.charAt(length2);
                if (cCharAt2 != ' ' && cCharAt2 != '.') {
                    charSequenceSubSequence = string.subSequence(0, length2 + 1);
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length2 = i2;
                }
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        String string2 = charSequenceSubSequence.toString();
        if (string2.length() <= 0) {
            string2 = null;
        }
        if (string2 != null) {
            arrayList.add(string2);
        }
    }
}
