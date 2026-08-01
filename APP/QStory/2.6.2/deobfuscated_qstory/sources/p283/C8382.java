package p283;

import net.bytebuddy.pool.TypePool;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8382 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f23212;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f23213;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f23214;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f23215;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8382 f23204 = new C8382(0, "VZCBSIFJD", 0, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C8382 f23203 = new C8382(1, "VZCBSIFJD", 1, 2);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C8382 f23207 = new C8382(2, "VZCBSIFJD", 2, 3);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C8382 f23206 = new C8382(3, "VZCBSIFJD", 3, 4);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C8382 f23210 = new C8382(4, "VZCBSIFJD", 4, 5);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C8382 f23211 = new C8382(5, "VZCBSIFJD", 5, 6);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C8382 f23208 = new C8382(6, "VZCBSIFJD", 6, 7);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C8382 f23209 = new C8382(7, "VZCBSIFJD", 7, 8);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C8382 f23205 = new C8382(8, "VZCBSIFJD", 8, 9);

    public C8382(int i, String str, int i2, int i3) {
        this.f23215 = i;
        this.f23214 = str;
        this.f23213 = i2;
        this.f23212 = i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C8382 m13924(int i, int i2, String str) {
        char cCharAt = str.charAt(i);
        if (cCharAt == '(') {
            return new C8382(11, str, i, i2);
        }
        if (cCharAt == 'F') {
            return f23208;
        }
        if (cCharAt == 'L') {
            return new C8382(10, str, i + 1, i2 - 1);
        }
        if (cCharAt == 'S') {
            return f23210;
        }
        if (cCharAt == 'V') {
            return f23204;
        }
        if (cCharAt == 'I') {
            return f23211;
        }
        if (cCharAt == 'J') {
            return f23209;
        }
        if (cCharAt == 'Z') {
            return f23203;
        }
        if (cCharAt == '[') {
            return new C8382(9, str, i, i2);
        }
        switch (cCharAt) {
            case 'B':
                return f23206;
            case 'C':
                return f23207;
            case 'D':
                return f23205;
            default:
                C5919.m11245();
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m13925(String str) {
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
        if (!(obj instanceof C8382)) {
            return false;
        }
        C8382 c8382 = (C8382) obj;
        int i = this.f23215;
        if (i == 12) {
            i = 10;
        }
        int i2 = c8382.f23215;
        if (i != (i2 != 12 ? i2 : 10)) {
            return false;
        }
        int i3 = c8382.f23213;
        int i4 = c8382.f23212;
        int i5 = this.f23212;
        int i6 = this.f23213;
        if (i5 - i6 != i4 - i3) {
            return false;
        }
        while (i6 < i5) {
            if (this.f23214.charAt(i6) != c8382.f23214.charAt(i3)) {
                return false;
            }
            i6++;
            i3++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f23215;
        int iCharAt = (i == 12 ? 10 : i) * 13;
        if (i >= 9) {
            for (int i2 = this.f23213; i2 < this.f23212; i2++) {
                iCharAt = (this.f23214.charAt(i2) + iCharAt) * 17;
            }
        }
        return iCharAt;
    }

    public final String toString() {
        return m13926();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m13926() {
        String str = this.f23214;
        int i = this.f23212;
        int i2 = this.f23213;
        int i3 = this.f23215;
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
