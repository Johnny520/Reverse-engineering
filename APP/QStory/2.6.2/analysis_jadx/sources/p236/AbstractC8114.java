package p236;

import io.ktor.http.IllegalHeaderNameException;
import io.ktor.http.IllegalHeaderValueException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5143;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8114 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final List f22414;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String[] f22415;

    static {
        String[] strArr = {"Transfer-Encoding", "Upgrade"};
        f22415 = strArr;
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        f22414 = listAsList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m13554(String str) {
        str.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            if (AbstractC4394.m8915(cCharAt, 32) < 0 && cCharAt != '\t') {
                throw new IllegalHeaderValueException(str, i2);
            }
            i++;
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m13555(String str) {
        str.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            if (AbstractC4394.m8915(cCharAt, 32) <= 0 || AbstractC5143.m10172("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                throw new IllegalHeaderNameException(str, i2);
            }
            i++;
            i2 = i3;
        }
    }
}
