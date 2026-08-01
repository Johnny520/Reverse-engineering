package androidx.core.view;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3092 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3091 f6914;

    static {
        new C3092("", 0, 0);
    }

    public C3092(String str, int i, int i2) {
        this.f6914 = new C3091(str, i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C3092 m4774(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        String string;
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            StringBuilder sbM709 = AbstractC0900.m709(i8, i7, "M0,", " A", ",");
            sbM709.append(i8);
            sbM709.append(" 0 1,1 ");
            sbM709.append(i);
            sbM709.append(",");
            sbM709.append(i8);
            sbM709.append(" A");
            sbM709.append(i7);
            sbM709.append(",");
            sbM709.append(i8);
            sbM709.append(" 0 1,1 0,");
            sbM709.append(i8);
            sbM709.append(" Z");
            string = sbM709.toString();
        } else {
            StringBuilder sb = new StringBuilder("M ");
            int iMin = Math.min(i / 2, i2 / 2);
            int iMin2 = Math.min(iMin, i3);
            int iMin3 = Math.min(iMin, i4);
            int iMin4 = Math.min(iMin, i5);
            int iMin5 = Math.min(iMin, i6);
            sb.append(iMin2);
            sb.append(",0 L ");
            sb.append(i - iMin3);
            sb.append(",0");
            if (iMin3 > 0) {
                sb.append(" A ");
                sb.append(iMin3);
                sb.append(",");
                sb.append(iMin3);
                sb.append(" 0 0,1 ");
                sb.append(i);
                sb.append(",");
                sb.append(iMin3);
            }
            sb.append(" L ");
            sb.append(i);
            sb.append(",");
            sb.append(i2 - iMin4);
            if (iMin4 > 0) {
                sb.append(" A ");
                sb.append(iMin4);
                sb.append(",");
                sb.append(iMin4);
                sb.append(" 0 0,1 ");
                sb.append(i - iMin4);
                sb.append(",");
                sb.append(i2);
            }
            sb.append(" L ");
            sb.append(iMin5);
            sb.append(",");
            sb.append(i2);
            if (iMin5 > 0) {
                sb.append(" A ");
                sb.append(iMin5);
                sb.append(",");
                sb.append(iMin5);
                sb.append(" 0 0,1 0,");
                sb.append(i2 - iMin5);
            }
            if (iMin2 > 0) {
                sb.append(" L 0,");
                sb.append(iMin2);
                sb.append(" A ");
                sb.append(iMin2);
                sb.append(",");
                sb.append(iMin2);
                sb.append(" 0 0,1 ");
                sb.append(iMin2);
                sb.append(",0");
            }
            sb.append(" Z");
            string = sb.toString();
        }
        return new C3092(string, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3092) {
            return this.f6914.equals(((C3092) obj).f6914);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6914.hashCode();
    }

    public final String toString() {
        return this.f6914.toString();
    }
}
