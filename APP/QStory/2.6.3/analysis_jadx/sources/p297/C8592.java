package p297;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8592 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f24023;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String[] f24024;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f24025;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f24026;

    public C8592(String str, String str2, Class[] clsArr) {
        this.f24026 = str;
        this.f24025 = str2;
        this.f24024 = new String[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            this.f24024[i] = clsArr[i].getName();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8592.class != obj.getClass()) {
            return false;
        }
        C8592 c8592 = (C8592) obj;
        return this.f24026.equals(c8592.f24026) && Objects.equals(this.f24025, c8592.f24025) && Arrays.equals(this.f24024, c8592.f24024);
    }

    public final int hashCode() {
        if (this.f24023 == 0) {
            this.f24023 = (Objects.hash(this.f24026, this.f24025) * 31) + Arrays.hashCode(this.f24024);
        }
        return this.f24023;
    }

    public C8592(String str, String str2, String[] strArr) {
        this.f24026 = str;
        this.f24025 = str2;
        this.f24024 = strArr;
    }
}
