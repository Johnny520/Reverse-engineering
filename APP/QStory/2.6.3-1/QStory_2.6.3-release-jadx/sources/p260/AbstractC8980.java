package p260;

import io.ktor.util.AbstractC5049;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲子世苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8980 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean[] f22820;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Set f22821;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean[] f22822;

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
        f22822 = zArr;
        f22821 = AbstractC5179.m9404(new String[]{"CON", "PRN", "AUX", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9"});
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
        f22820 = zArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m14161(String str) {
        char cCharAt;
        int length = str.length();
        if (length != 0 && (((cCharAt = str.charAt(0)) != '.' || (length != 1 && (length != 2 || str.charAt(1) != '.'))) && (cCharAt != '~' || length != 1))) {
            boolean[] zArr = f22822;
            zArr.getClass();
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                char cCharAt2 = str.charAt(length - 1);
                if (cCharAt2 != ' ' && cCharAt2 != '.') {
                    for (int i = 0; i < str.length(); i++) {
                        char cCharAt3 = str.charAt(i);
                        if (AbstractC5227.m9464(cCharAt3, 32) >= 0) {
                            boolean[] zArr2 = f22820;
                            zArr2.getClass();
                            if (cCharAt3 < zArr2.length && zArr2[cCharAt3]) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            } else {
                Set set = f22821;
                if (!set.contains(str) && !set.contains(AbstractC5049.m9191(str))) {
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m14162(String str, ArrayList arrayList) {
        CharSequence charSequenceSubSequence;
        if (str.length() == 0 || str.equals(".") || str.equals("~") || f22821.contains(AbstractC5049.m9191(str))) {
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
            if (AbstractC5227.m9464(cCharAt, 32) >= 0) {
                boolean[] zArr = f22820;
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
