package retrofit2;

import androidx.activity.AbstractC0900;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.EOFException;
import java.lang.reflect.Method;
import java.util.Objects;
import lin.xposed.hook.javaplugin.C6385;
import p020.C6921;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6603 extends AbstractC6615 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f16189;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f16190;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Method f16191;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f16192;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C6611 f16193;

    public C6603(Method method, int i, String str, boolean z) {
        C6611 c6611 = C6611.f16211;
        this.f16191 = method;
        this.f16190 = i;
        Objects.requireNonNull(str, "name == null");
        this.f16189 = str;
        this.f16193 = c6611;
        this.f16192 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    @Override // retrofit2.AbstractC6615
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo11710(C6589 c6589, Object obj) throws EOFException {
        String strM12039;
        String strReplace;
        String str = this.f16189;
        if (obj == null) {
            throw AbstractC6615.m11740(this.f16191, this.f16190, AbstractC0900.m718("Path parameter \"", str, "\" value must not be null."), new Object[0]);
        }
        this.f16193.getClass();
        String string = obj.toString();
        if (c6589.f16123 == null) {
            C6385.m11429();
            return;
        }
        int length = string.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = string.codePointAt(iCharCount);
            boolean z = this.f16192;
            int i = 47;
            int i2 = -1;
            int i3 = 127;
            int i4 = 32;
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                C6921 c6921 = new C6921();
                c6921.m12051(0, iCharCount, string);
                C6921 c69212 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = string.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 < i4 || iCodePointAt2 >= i3 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i2 || (!z && (iCodePointAt2 == i || iCodePointAt2 == 37))) {
                            if (c69212 == null) {
                                c69212 = new C6921();
                            }
                            c69212.m12047(iCodePointAt2);
                            long j = c69212.f16992;
                            long j2 = 0;
                            while (j2 < j) {
                                byte bM12045 = c69212.m12045(j2);
                                C6921 c69213 = c69212;
                                int i5 = bM12045 & DefaultClassResolver.NAME;
                                c6921.m12029(37);
                                char[] cArr = C6589.f16119;
                                c6921.m12029(cArr[(i5 >> 4) & 15]);
                                c6921.m12029(cArr[bM12045 & 15]);
                                j2++;
                                c69212 = c69213;
                            }
                            c69212.m12034();
                        } else {
                            c6921.m12047(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i = 47;
                    i2 = -1;
                    i3 = 127;
                    i4 = 32;
                }
                strM12039 = c6921.m12039();
                strReplace = c6589.f16123.replace("{" + str + "}", strM12039);
                if (C6589.f16118.matcher(strReplace).matches()) {
                    c6589.f16123 = strReplace;
                    return;
                } else {
                    C6755.m11869("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(string));
                    return;
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        strM12039 = string;
        strReplace = c6589.f16123.replace("{" + str + "}", strM12039);
        if (C6589.f16118.matcher(strReplace).matches()) {
        }
    }
}
