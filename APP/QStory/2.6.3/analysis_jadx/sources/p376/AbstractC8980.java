package p376;

import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.regex.Pattern;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.pool.TypePool;
import org.apache.commons.io.IOCase;
import org.slf4j.Marker;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言苏子楪兰世哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8980 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final char f25205;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final char f25206;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String[] f25207 = new String[0];

    static {
        Character.toString(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        char c = File.separatorChar;
        f25206 = c;
        char c2 = '\\';
        if (c != '/') {
            if (c != '\\') {
                C5925.m11310(String.valueOf(c));
                return;
            }
            c2 = '/';
        }
        f25205 = c2;
        Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
        Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9-]*$");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m14581(String str, String str2, IOCase iOCase) {
        ?? r16;
        String[] strArr;
        boolean z;
        boolean z2 = true;
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null && str2 != null) {
            IOCase iOCaseValue = IOCase.value(iOCase, IOCase.SENSITIVE);
            if (str2.indexOf(63) == -1 && str2.indexOf(42) == -1) {
                strArr = new String[]{str2};
                r16 = 1;
            } else {
                char[] charArray = str2.toCharArray();
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                int length = charArray.length;
                int i = 0;
                char c = 0;
                while (i < length) {
                    char c2 = charArray[i];
                    if (c2 == '?' || c2 == '*') {
                        if (sb.length() != 0) {
                            z = z2;
                            arrayList.add(sb.toString());
                            sb.setLength(0);
                        } else {
                            z = z2;
                        }
                        if (c2 == '?') {
                            arrayList.add(TypeDescription.Generic.OfWildcardType.SYMBOL);
                        } else if (c != '*') {
                            arrayList.add(Marker.ANY_MARKER);
                        }
                    } else {
                        sb.append(c2);
                        z = z2;
                    }
                    i++;
                    c = c2;
                    z2 = z;
                }
                r16 = z2;
                if (sb.length() != 0) {
                    arrayList.add(sb.toString());
                }
                strArr = (String[]) arrayList.toArray(f25207);
            }
            ArrayDeque arrayDeque = new ArrayDeque(strArr.length);
            ?? r5 = 0;
            int length2 = 0;
            int i2 = 0;
            do {
                r5 = r5;
                if (!arrayDeque.isEmpty()) {
                    int[] iArr = (int[]) arrayDeque.pop();
                    i2 = iArr[0];
                    length2 = iArr[r16];
                    r5 = r16;
                }
                while (i2 < strArr.length) {
                    if (strArr[i2].equals(TypeDescription.Generic.OfWildcardType.SYMBOL)) {
                        length2++;
                        if (length2 > str.length()) {
                            break;
                        }
                        r5 = 0;
                        i2++;
                    } else if (strArr[i2].equals(Marker.ANY_MARKER)) {
                        if (i2 == strArr.length - 1) {
                            length2 = str.length();
                        }
                        r5 = r16;
                        i2++;
                    } else {
                        if (r5 != 0) {
                            length2 = iOCaseValue.checkIndexOf(str, length2, strArr[i2]);
                            if (length2 == -1) {
                                break;
                            }
                            int iCheckIndexOf = iOCaseValue.checkIndexOf(str, length2 + 1, strArr[i2]);
                            if (iCheckIndexOf >= 0) {
                                arrayDeque.push(new int[]{i2, iCheckIndexOf});
                            }
                            length2 = strArr[i2].length() + length2;
                            r5 = 0;
                        } else {
                            if (!iOCaseValue.checkRegionMatches(str, length2, strArr[i2])) {
                                break;
                            }
                            length2 = strArr[i2].length() + length2;
                            r5 = 0;
                        }
                        i2++;
                    }
                }
                if (i2 == strArr.length && length2 == str.length()) {
                    return r16;
                }
            } while (!arrayDeque.isEmpty());
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m14582(String str) {
        int i;
        if (str == null) {
            return null;
        }
        char c = f25206;
        if (c == '\\') {
            int iLastIndexOf = str.lastIndexOf(c);
            int iLastIndexOf2 = str.lastIndexOf(f25205);
            if (iLastIndexOf == -1) {
                i = iLastIndexOf2 == -1 ? 0 : iLastIndexOf2 + 1;
            } else {
                if (iLastIndexOf2 != -1) {
                    iLastIndexOf = Math.max(iLastIndexOf, iLastIndexOf2);
                }
                i = iLastIndexOf + 1;
            }
            if (str.indexOf(58, i) != -1) {
                C5925.m11310("NTFS ADS separator (':') in file name is forbidden.");
                return null;
            }
        }
        int iLastIndexOf3 = str.lastIndexOf(46);
        if (Math.max(str.lastIndexOf(47), str.lastIndexOf(92)) > iLastIndexOf3) {
            iLastIndexOf3 = -1;
        }
        return iLastIndexOf3 == -1 ? "" : str.substring(iLastIndexOf3 + 1);
    }
}
