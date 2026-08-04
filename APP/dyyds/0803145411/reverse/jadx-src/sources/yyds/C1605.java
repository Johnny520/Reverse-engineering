package yyds;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛷᛸᛱᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1605 implements Iterable, InterfaceC0527 {

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C1605 f8173 = new C1605(new String[0]);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String[] f8174;

    public C1605(String[] strArr) {
        this.f8174 = strArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1605) {
            return Arrays.equals(this.f8174, ((C1605) obj).f8174);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8174);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(AbstractC0797.m1836(this, i), AbstractC0797.m1817(this, i));
        }
        return new C0437(1, pairArr);
    }

    public final int size() {
        return this.f8174.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strM1836 = AbstractC0797.m1836(this, i);
            String strM1817 = AbstractC0797.m1817(this, i);
            sb.append(strM1836);
            sb.append(": ");
            if (AbstractC1429.m2922(strM1836)) {
                strM1817 = "██";
            }
            sb.append(strM1817);
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String m3306(String str) {
        String[] strArr = this.f8174;
        int length = strArr.length - 2;
        int iM3792 = AbstractC1960.m3792(length, 0, -2);
        if (iM3792 > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iM3792) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }
}
