package p252;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.layout.C1481;
import io.ktor.util.AbstractC5049;
import java.util.Collection;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.text.AbstractC5976;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;
import p050.AbstractC7176;
import p191.AbstractC8568;
import p267.AbstractC9004;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8929 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List f22720 = AbstractC7176.m12487("");

    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0124  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14127(C8930 c8930, String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int iIntValue;
        char c;
        c8930.getClass();
        str.getClass();
        int length = str.length();
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                i6 = -1;
                break;
            } else if (!AbstractC8568.m13623(str.charAt(i6))) {
                break;
            } else {
                i6++;
            }
        }
        int length2 = str.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i7 = length2 - 1;
                if (!AbstractC8568.m13623(str.charAt(length2))) {
                    break;
                } else if (i7 < 0) {
                    break;
                } else {
                    length2 = i7;
                }
            }
            length2 = -1;
        } else {
            length2 = -1;
        }
        int i8 = length2 + 1;
        char cCharAt = str.charAt(i6);
        if (('a' > cCharAt || cCharAt >= '{') && ('A' > cCharAt || cCharAt >= '[')) {
            i = i6;
            i2 = i;
        } else {
            i = i6;
            i2 = -1;
        }
        while (i < i8) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 == ':') {
                if (i2 != -1) {
                    C6755.m11869(AbstractC7012.m12147(i2, "Illegal character in scheme at position "));
                    return;
                }
                i3 = i - i6;
                if (i3 > 0) {
                    String strSubstring = str.substring(i6, i6 + i3);
                    C8920 c8920 = C8920.f22665;
                    String strM9190 = AbstractC5049.m9190(strSubstring);
                    C8920 c89202 = (C8920) C8920.f22664.get(strM9190);
                    if (c89202 == null) {
                        c89202 = new C8920(strM9190, 0);
                    }
                    c8930.f22724 = c89202;
                    i6 += i3 + 1;
                }
                i4 = 0;
                while (true) {
                    i5 = i6 + i4;
                    if (i5 >= i8 || str.charAt(i5) != '/') {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (!c8930.m14131().f22667.equals("file")) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            C6755.m11869("Invalid file url: ".concat(str));
                            return;
                        } else {
                            c8930.f22727 = "";
                            AbstractC9004.m14186(c8930, "/".concat(str.substring(i5, i8)));
                            return;
                        }
                    }
                    int iM10730 = AbstractC5976.m10730(str, '/', i5, 4);
                    if (iM10730 == -1 || iM10730 == i8) {
                        c8930.f22727 = str.substring(i5, i8);
                        return;
                    } else {
                        c8930.f22727 = str.substring(i5, iM10730);
                        AbstractC9004.m14186(c8930, str.substring(iM10730, i8));
                        return;
                    }
                }
                if (c8930.m14131().f22667.equals("mailto")) {
                    if (i4 != 0) {
                        C6755.m11869("Failed requirement.");
                        return;
                    }
                    int iM10729 = AbstractC5976.m10729(str, "@", i5, false, 4);
                    if (iM10729 == -1) {
                        C6755.m11869(AbstractC0900.m718("Invalid mailto url: ", str, ", it should contain '@'."));
                        return;
                    }
                    String strM14137 = AbstractC8940.m14137(0, 0, str.substring(i5, iM10729), 7);
                    c8930.f22723 = strM14137 != null ? AbstractC8940.m14135(strM14137, false) : null;
                    c8930.f22727 = str.substring(iM10729 + 1, i8);
                    return;
                }
                if (c8930.m14131().f22667.equals("about")) {
                    if (i4 == 0) {
                        c8930.f22727 = str.substring(i5, i8);
                        return;
                    } else {
                        C6755.m11869("Failed requirement.");
                        return;
                    }
                }
                if (i4 >= 2) {
                    while (true) {
                        int iM10732 = AbstractC5976.m10732(str, AbstractC5049.m9187("@/\\?#"), i5, false);
                        Integer numValueOf = Integer.valueOf(iM10732);
                        if (iM10732 <= 0) {
                            numValueOf = null;
                        }
                        iIntValue = numValueOf != null ? numValueOf.intValue() : i8;
                        if (iIntValue >= i8 || str.charAt(iIntValue) != '@') {
                            break;
                        }
                        int iM14128 = m14128(i5, iIntValue, str);
                        if (iM14128 != -1) {
                            c8930.f22723 = str.substring(i5, iM14128);
                            c8930.f22722 = str.substring(iM14128 + 1, iIntValue);
                        } else {
                            c8930.f22723 = str.substring(i5, iIntValue);
                        }
                        i5 = iIntValue + 1;
                    }
                    int iM141282 = m14128(i5, iIntValue, str);
                    Integer numValueOf2 = Integer.valueOf(iM141282);
                    if (iM141282 <= 0) {
                        numValueOf2 = null;
                    }
                    int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : iIntValue;
                    c8930.f22727 = str.substring(i5, iIntValue2);
                    int i9 = iIntValue2 + 1;
                    c8930.m14129(i9 < iIntValue ? Integer.parseInt(str.substring(i9, iIntValue)) : 0);
                    i5 = iIntValue;
                }
                List list = f22720;
                if (i5 >= i8) {
                    if (str.charAt(length2) != '/') {
                        list = EmptyList.INSTANCE;
                    }
                    c8930.m14130(list);
                    return;
                }
                c8930.m14130(i4 == 0 ? AbstractC5176.m9360(1, c8930.f22728) : EmptyList.INSTANCE);
                int iM107322 = AbstractC5976.m10732(str, AbstractC5049.m9187("?#"), i5, false);
                Integer numValueOf3 = Integer.valueOf(iM107322);
                if (iM107322 <= 0) {
                    numValueOf3 = null;
                }
                int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : i8;
                if (iIntValue3 > i5) {
                    String strSubstring2 = str.substring(i5, iIntValue3);
                    Collection collection = (c8930.f22728.size() == 1 && ((CharSequence) AbstractC5176.m9379(c8930.f22728)).length() == 0) ? EmptyList.INSTANCE : c8930.f22728;
                    List listM10709 = strSubstring2.equals("/") ? list : AbstractC5976.m10709(strSubstring2, new char[]{'/'});
                    if (i4 != 1) {
                        list = EmptyList.INSTANCE;
                    }
                    c8930.f22728 = AbstractC5176.m9352(AbstractC5176.m9352(listM10709, list), collection);
                    i5 = iIntValue3;
                }
                if (i5 < i8 && str.charAt(i5) == '?') {
                    int i10 = i5 + 1;
                    if (i10 == i8) {
                        c8930.f22726 = true;
                        i5 = i8;
                    } else {
                        int iM107302 = AbstractC5976.m10730(str, '#', i10, 4);
                        Integer numValueOf4 = iM107302 > 0 ? Integer.valueOf(iM107302) : null;
                        int iIntValue4 = numValueOf4 != null ? numValueOf4.intValue() : i8;
                        AbstractC8568.m13620(0, 6, str.substring(i10, iIntValue4)).mo8914(new C1481(c8930, 16));
                        i5 = iIntValue4;
                    }
                }
                if (i5 >= i8 || str.charAt(i5) != '#') {
                    return;
                }
                c8930.f22729 = str.substring(i5 + 1, i8);
                return;
            }
            if (cCharAt2 == '#' || cCharAt2 == '/' || cCharAt2 == '?') {
                break;
            }
            if (i2 != -1 || ('a' <= cCharAt2 && cCharAt2 < '{')) {
                c = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
            } else {
                c = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
                if (('A' > cCharAt2 || cCharAt2 >= '[') && (('0' > cCharAt2 || cCharAt2 >= ':') && cCharAt2 != '.' && cCharAt2 != '+' && cCharAt2 != '-')) {
                    i2 = i;
                }
            }
            i++;
        }
        i3 = -1;
        if (i3 > 0) {
        }
        i4 = 0;
        while (true) {
            i5 = i6 + i4;
            if (i5 >= i8) {
                break;
            }
            break;
            break;
            i4++;
        }
        if (!c8930.m14131().f22667.equals("file")) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int m14128(int i, int i2, String str) {
        boolean z = false;
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ':') {
                if (cCharAt == '[') {
                    z = true;
                } else if (cCharAt == ']') {
                    z = false;
                }
            } else if (!z) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
