package p252;

import io.ktor.http.IllegalHeaderNameException;
import io.ktor.http.IllegalHeaderValueException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8944 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final List f22757;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String[] f22758;

    static {
        String[] strArr = {"Transfer-Encoding", "Upgrade"};
        f22758 = strArr;
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        f22757 = listAsList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m14142(String str) {
        str.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            if (AbstractC5227.m9464(cCharAt, 32) < 0 && cCharAt != '\t') {
                throw new IllegalHeaderValueException(str, i2);
            }
            i++;
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14143(String str) {
        str.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            if (AbstractC5227.m9464(cCharAt, 32) <= 0 || AbstractC5976.m10722("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                throw new IllegalHeaderNameException(str, i2);
            }
            i++;
            i2 = i3;
        }
    }
}
