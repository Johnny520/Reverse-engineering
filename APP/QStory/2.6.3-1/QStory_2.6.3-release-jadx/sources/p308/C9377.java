package p308;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9377 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C9377 f24193 = new C9377(null, C9387.f24229);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final short[] f24194;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C9387 f24195;

    public C9377(C9387 c9387, short[] sArr) {
        this.f24195 = c9387;
        this.f24194 = sArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        return androidx.window.area.AbstractC3400.m5653(r2.length, r6.f24194.length);
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(Object obj) {
        C9377 c9377 = (C9377) obj;
        int i = 0;
        while (true) {
            short[] sArr = this.f24194;
            if (i >= sArr.length) {
                break;
            }
            short[] sArr2 = c9377.f24194;
            if (i >= sArr2.length) {
                break;
            }
            short s = sArr[i];
            short s2 = sArr2[i];
            if (s != s2) {
                if (s == s2) {
                    return 0;
                }
                return (s & 65535) < (65535 & s2) ? -1 : 1;
            }
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        short[] sArr = this.f24194;
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            C9387 c9387 = this.f24195;
            sb.append(c9387 != null ? c9387.f24230.get(sArr[i]) : Short.valueOf(sArr[i]));
        }
        sb.append(")");
        return sb.toString();
    }
}
