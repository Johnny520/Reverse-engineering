package p313;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9421 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f24368;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String[] f24369;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f24370;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f24371;

    public C9421(String str, String str2, Class[] clsArr) {
        this.f24371 = str;
        this.f24370 = str2;
        this.f24369 = new String[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            this.f24369[i] = clsArr[i].getName();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9421.class != obj.getClass()) {
            return false;
        }
        C9421 c9421 = (C9421) obj;
        return this.f24371.equals(c9421.f24371) && Objects.equals(this.f24370, c9421.f24370) && Arrays.equals(this.f24369, c9421.f24369);
    }

    public final int hashCode() {
        if (this.f24368 == 0) {
            this.f24368 = (Objects.hash(this.f24371, this.f24370) * 31) + Arrays.hashCode(this.f24369);
        }
        return this.f24368;
    }

    public C9421(String str, String str2, String[] strArr) {
        this.f24371 = str;
        this.f24370 = str2;
        this.f24369 = strArr;
    }
}
