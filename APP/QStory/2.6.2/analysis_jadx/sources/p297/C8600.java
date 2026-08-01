package p297;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8600 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f24032;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String[] f24033;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f24034;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f24035;

    public C8600(String str, String str2, Class[] clsArr) {
        this.f24035 = str;
        this.f24034 = str2;
        this.f24033 = new String[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            this.f24033[i] = clsArr[i].getName();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8600.class != obj.getClass()) {
            return false;
        }
        C8600 c8600 = (C8600) obj;
        return this.f24035.equals(c8600.f24035) && Objects.equals(this.f24034, c8600.f24034) && Arrays.equals(this.f24033, c8600.f24033);
    }

    public final int hashCode() {
        if (this.f24032 == 0) {
            this.f24032 = (Objects.hash(this.f24035, this.f24034) * 31) + Arrays.hashCode(this.f24033);
        }
        return this.f24032;
    }

    public C8600(String str, String str2, String[] strArr) {
        this.f24035 = str;
        this.f24034 = str2;
        this.f24033 = strArr;
    }
}
