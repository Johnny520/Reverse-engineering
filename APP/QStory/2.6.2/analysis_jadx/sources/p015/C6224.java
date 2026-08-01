package p015;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.ui.graphics.vector.C1562;
import androidx.core.view.C2268;
import com.bumptech.glide.AbstractC3065;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4346;
import kotlin.text.AbstractC5143;
import p017.AbstractC6233;
import p054.InterfaceC6566;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6224 implements Iterable, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C6224 f17131 = new C6224(new String[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String[] f17132;

    public C6224(String[] strArr) {
        strArr.getClass();
        this.f17132 = strArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C6224 m11677(Map map) {
        map.getClass();
        String[] strArr = new String[map.size() * 2];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String string = AbstractC5143.m10150(str).toString();
            String string2 = AbstractC5143.m10150(str2).toString();
            AbstractC3065.m6819(string);
            AbstractC3065.m6818(string2, string);
            strArr[i] = string;
            strArr[i + 1] = string2;
            i += 2;
        }
        return new C6224(strArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6224) {
            return Arrays.equals(this.f17132, ((C6224) obj).f17132);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17132);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(m11679(i), m11681(i));
        }
        return new C2268(pairArr);
    }

    public final int size() {
        return this.f17132.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strM11679 = m11679(i);
            String strM11681 = m11681(i);
            sb.append(strM11679);
            sb.append(": ");
            if (AbstractC6233.m11698(strM11679)) {
                strM11681 = "██";
            }
            sb.append(strM11681);
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1562 m11678() {
        C1562 c1562 = new C1562(6, false);
        ArrayList arrayList = c1562.f4599;
        arrayList.getClass();
        String[] strArr = this.f17132;
        strArr.getClass();
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        arrayList.addAll(listAsList);
        return c1562;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m11679(int i) {
        String str = (String) AbstractC4346.m8845(i * 2, this.f17132);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m11680(String str) {
        String[] strArr = this.f17132;
        strArr.getClass();
        int length = strArr.length - 2;
        int iM1155 = AbstractC0455.m1155(length, 0, -2);
        if (iM1155 > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iM1155) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String m11681(int i) {
        String str = (String) AbstractC4346.m8845((i * 2) + 1, this.f17132);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }
}
