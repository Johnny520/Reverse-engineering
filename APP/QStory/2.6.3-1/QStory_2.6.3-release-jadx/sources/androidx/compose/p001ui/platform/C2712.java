package androidx.compose.p001ui.platform;

import androidx.appcompat.app.AbstractC0927;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2712 extends AbstractC0927 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static C2712 f5731;

    @Override // androidx.appcompat.app.AbstractC0927
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int[] mo864(int i) {
        int length = m876().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && m876().charAt(i) == '\n' && (m876().charAt(i) == '\n' || (i != 0 && m876().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !m4046(i2)) {
            i2++;
        }
        return m875(i, i2);
    }

    @Override // androidx.appcompat.app.AbstractC0927
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final int[] mo868(int i) {
        int length = m876().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && m876().charAt(i - 1) == '\n' && !m4046(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (m876().charAt(i2) == '\n' || (i2 != 0 && m876().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return m875(i2, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean m4046(int i) {
        if (i <= 0 || m876().charAt(i - 1) == '\n') {
            return false;
        }
        return i == m876().length() || m876().charAt(i) == '\n';
    }
}
