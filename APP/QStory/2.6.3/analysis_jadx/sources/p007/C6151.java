package p007;

import androidx.compose.ui.graphics.vector.C1562;
import androidx.core.view.C2268;
import io.ktor.client.plugins.AbstractC3933;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4347;
import kotlin.text.AbstractC5144;
import p013.AbstractC6225;
import p054.InterfaceC6567;
import p175.AbstractC7739;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6151 implements Iterable, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C6151 f16892 = new C6151(new String[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String[] f16893;

    public C6151(String[] strArr) {
        strArr.getClass();
        this.f16893 = strArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C6151 m11548(Map map) {
        map.getClass();
        String[] strArr = new String[map.size() * 2];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String string = AbstractC5144.m10155(str).toString();
            String string2 = AbstractC5144.m10155(str2).toString();
            AbstractC7739.m13058(string);
            AbstractC7739.m13057(string2, string);
            strArr[i] = string;
            strArr[i + 1] = string2;
            i += 2;
        }
        return new C6151(strArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6151) {
            return Arrays.equals(this.f16893, ((C6151) obj).f16893);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16893);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(m11550(i), m11552(i));
        }
        return new C2268(pairArr);
    }

    public final int size() {
        return this.f16893.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strM11550 = m11550(i);
            String strM11552 = m11552(i);
            sb.append(strM11550);
            sb.append(": ");
            if (AbstractC6225.m11688(strM11550)) {
                strM11552 = "██";
            }
            sb.append(strM11552);
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1562 m11549() {
        C1562 c1562 = new C1562(6, false);
        ArrayList arrayList = c1562.f4600;
        arrayList.getClass();
        String[] strArr = this.f16893;
        strArr.getClass();
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        arrayList.addAll(listAsList);
        return c1562;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m11550(int i) {
        String str = (String) AbstractC4347.m8824(i * 2, this.f16893);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m11551(String str) {
        String[] strArr = this.f16893;
        strArr.getClass();
        int length = strArr.length - 2;
        int iM8307 = AbstractC3933.m8307(length, 0, -2);
        if (iM8307 > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iM8307) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String m11552(int i) {
        String str = (String) AbstractC4347.m8824((i * 2) + 1, this.f16893);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }
}
