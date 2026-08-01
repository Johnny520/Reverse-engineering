package p251;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏哲世.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8183 extends AbstractC8184 {
    @Override // p251.AbstractC8172
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo13588() {
        Object obj = this.f22557;
        return obj != null ? (String) obj : "";
    }

    @Override // p251.AbstractC8172
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final long mo13589() {
        String str = (String) this.f22557;
        if (str == null || str.isEmpty()) {
            return 0L;
        }
        try {
            return str.contains(".") ? (long) Double.parseDouble(str) : Long.parseLong(str.trim());
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @Override // p251.AbstractC8172
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo13590() {
        String str = (String) this.f22557;
        if (str == null || str.isEmpty()) {
            return 0;
        }
        try {
            return str.contains(".") ? (int) Double.parseDouble(str) : Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // p251.AbstractC8172
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final float mo13591() {
        String str = (String) this.f22557;
        if (str == null || str.isEmpty()) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str.trim());
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }

    @Override // p251.AbstractC8172
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo13592() {
        String str = (String) this.f22557;
        if (str == null) {
            return false;
        }
        return "true".equalsIgnoreCase(str);
    }

    @Override // p251.AbstractC8172
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final byte mo13593() {
        return (byte) 6;
    }
}
