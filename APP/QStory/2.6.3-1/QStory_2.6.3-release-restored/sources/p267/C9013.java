package p267;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏哲世.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9013 extends AbstractC9014 {
    @Override // p267.AbstractC9002
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo14176() {
        Object obj = this.f22901;
        return obj != null ? (String) obj : "";
    }

    @Override // p267.AbstractC9002
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final long mo14177() {
        String str = (String) this.f22901;
        if (str == null || str.isEmpty()) {
            return 0L;
        }
        try {
            return str.contains(".") ? (long) Double.parseDouble(str) : Long.parseLong(str.trim());
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @Override // p267.AbstractC9002
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo14178() {
        String str = (String) this.f22901;
        if (str == null || str.isEmpty()) {
            return 0;
        }
        try {
            return str.contains(".") ? (int) Double.parseDouble(str) : Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // p267.AbstractC9002
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final float mo14179() {
        String str = (String) this.f22901;
        if (str == null || str.isEmpty()) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str.trim());
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }

    @Override // p267.AbstractC9002
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo14180() {
        String str = (String) this.f22901;
        if (str == null) {
            return false;
        }
        return "true".equalsIgnoreCase(str);
    }

    @Override // p267.AbstractC9002
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final byte mo14181() {
        return (byte) 6;
    }
}
