package p236;

import io.ktor.http.IllegalHeaderNameException;
import io.ktor.http.IllegalHeaderValueException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5144;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8115 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final List f22412;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String[] f22413;

    static {
        String[] strArr = {"Transfer-Encoding", "Upgrade"};
        f22413 = strArr;
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        f22412 = listAsList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m13583(String str) {
        str.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            if (AbstractC4395.m8905(cCharAt, 32) < 0 && cCharAt != '\t') {
                throw new IllegalHeaderValueException(str, i2);
            }
            i++;
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m13584(String str) {
        str.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            if (AbstractC4395.m8905(cCharAt, 32) <= 0 || AbstractC5144.m10163("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                throw new IllegalHeaderNameException(str, i2);
            }
            i++;
            i2 = i3;
        }
    }
}
