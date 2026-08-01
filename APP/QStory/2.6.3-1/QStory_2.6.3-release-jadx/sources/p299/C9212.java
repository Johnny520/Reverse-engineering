package p299;

import net.bytebuddy.pool.TypePool;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9212 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f23556;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f23557;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f23558;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f23559;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C9212 f23548 = new C9212(0, "VZCBSIFJD", 0, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C9212 f23547 = new C9212(1, "VZCBSIFJD", 1, 2);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C9212 f23551 = new C9212(2, "VZCBSIFJD", 2, 3);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C9212 f23550 = new C9212(3, "VZCBSIFJD", 3, 4);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C9212 f23554 = new C9212(4, "VZCBSIFJD", 4, 5);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C9212 f23555 = new C9212(5, "VZCBSIFJD", 5, 6);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C9212 f23552 = new C9212(6, "VZCBSIFJD", 6, 7);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C9212 f23553 = new C9212(7, "VZCBSIFJD", 7, 8);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C9212 f23549 = new C9212(8, "VZCBSIFJD", 8, 9);

    public C9212(int i, String str, int i2, int i3) {
        this.f23559 = i;
        this.f23558 = str;
        this.f23557 = i2;
        this.f23556 = i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C9212 m14500(int i, int i2, String str) {
        char cCharAt = str.charAt(i);
        if (cCharAt == '(') {
            return new C9212(11, str, i, i2);
        }
        if (cCharAt == 'F') {
            return f23552;
        }
        if (cCharAt == 'L') {
            return new C9212(10, str, i + 1, i2 - 1);
        }
        if (cCharAt == 'S') {
            return f23554;
        }
        if (cCharAt == 'V') {
            return f23548;
        }
        if (cCharAt == 'I') {
            return f23555;
        }
        if (cCharAt == 'J') {
            return f23553;
        }
        if (cCharAt == 'Z') {
            return f23547;
        }
        if (cCharAt == '[') {
            return new C9212(9, str, i, i2);
        }
        switch (cCharAt) {
            case 'B':
                return f23550;
            case 'C':
                return f23551;
            case 'D':
                return f23549;
            default:
                C6755.m11865();
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m14501(String str) {
        int i;
        char cCharAt = str.charAt(1);
        int i2 = 1;
        int i3 = 1;
        while (cCharAt != ')') {
            if (cCharAt == 'J' || cCharAt == 'D') {
                i2++;
                i3 += 2;
            } else {
                while (str.charAt(i2) == '[') {
                    i2++;
                }
                int i4 = i2 + 1;
                if (str.charAt(i2) == 'L') {
                    while (true) {
                        i = i4 + 1;
                        if (str.charAt(i4) == ';') {
                            break;
                        }
                        i4 = i;
                    }
                    i4 = i;
                }
                i3++;
                i2 = i4;
            }
            cCharAt = str.charAt(i2);
        }
        char cCharAt2 = str.charAt(i2 + 1);
        if (cCharAt2 == 'V') {
            return i3 << 2;
        }
        return (i3 << 2) | ((cCharAt2 == 'J' || cCharAt2 == 'D') ? 2 : 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9212)) {
            return false;
        }
        C9212 c9212 = (C9212) obj;
        int i = this.f23559;
        if (i == 12) {
            i = 10;
        }
        int i2 = c9212.f23559;
        if (i != (i2 != 12 ? i2 : 10)) {
            return false;
        }
        int i3 = c9212.f23557;
        int i4 = c9212.f23556;
        int i5 = this.f23556;
        int i6 = this.f23557;
        if (i5 - i6 != i4 - i3) {
            return false;
        }
        while (i6 < i5) {
            if (this.f23558.charAt(i6) != c9212.f23558.charAt(i3)) {
                return false;
            }
            i6++;
            i3++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f23559;
        int iCharAt = (i == 12 ? 10 : i) * 13;
        if (i >= 9) {
            for (int i2 = this.f23557; i2 < this.f23556; i2++) {
                iCharAt = (this.f23558.charAt(i2) + iCharAt) * 17;
            }
        }
        return iCharAt;
    }

    public final String toString() {
        return m14502();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m14502() {
        String str = this.f23558;
        int i = this.f23556;
        int i2 = this.f23557;
        int i3 = this.f23559;
        if (i3 == 10) {
            return str.substring(i2 - 1, i + 1);
        }
        if (i3 != 12) {
            return str.substring(i2, i);
        }
        StringBuilder sb = new StringBuilder("L");
        sb.append((CharSequence) str, i2, i);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
        return sb.toString();
    }
}
