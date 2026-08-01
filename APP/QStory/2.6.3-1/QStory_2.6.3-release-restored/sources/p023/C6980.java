package p023;

import androidx.compose.p001ui.graphics.vector.C2397;
import androidx.core.view.C3101;
import io.ktor.client.plugins.AbstractC4765;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC5179;
import kotlin.text.AbstractC5976;
import p029.AbstractC7054;
import p070.InterfaceC7396;
import p191.AbstractC8568;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6980 implements Iterable, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C6980 f17237 = new C6980(new String[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String[] f17238;

    public C6980(String[] strArr) {
        strArr.getClass();
        this.f17238 = strArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C6980 m12107(Map map) {
        map.getClass();
        String[] strArr = new String[map.size() * 2];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String string = AbstractC5976.m10714(str).toString();
            String string2 = AbstractC5976.m10714(str2).toString();
            AbstractC8568.m13617(string);
            AbstractC8568.m13616(string2, string);
            strArr[i] = string;
            strArr[i + 1] = string2;
            i += 2;
        }
        return new C6980(strArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6980) {
            return Arrays.equals(this.f17238, ((C6980) obj).f17238);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17238);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(m12109(i), m12111(i));
        }
        return new C3101(pairArr);
    }

    public final int size() {
        return this.f17238.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strM12109 = m12109(i);
            String strM12111 = m12111(i);
            sb.append(strM12109);
            sb.append(": ");
            if (AbstractC7054.m12247(strM12109)) {
                strM12111 = "██";
            }
            sb.append(strM12111);
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2397 m12108() {
        C2397 c2397 = new C2397(6, false);
        ArrayList arrayList = c2397.f4945;
        arrayList.getClass();
        String[] strArr = this.f17238;
        strArr.getClass();
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        arrayList.addAll(listAsList);
        return c2397;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m12109(int i) {
        String str = (String) AbstractC5179.m9383(i * 2, this.f17238);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m12110(String str) {
        String[] strArr = this.f17238;
        strArr.getClass();
        int length = strArr.length - 2;
        int iM8866 = AbstractC4765.m8866(length, 0, -2);
        if (iM8866 > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iM8866) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String m12111(int i) {
        String str = (String) AbstractC5179.m9383((i * 2) + 1, this.f17238);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }
}
