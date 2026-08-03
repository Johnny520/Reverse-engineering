package ac;

import okhttp3.HttpUrl;

/* JADX INFO: renamed from: ac.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0056i extends AbstractC0057j {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ac.AbstractC0049b
    /* JADX INFO: renamed from: a */
    public final byte mo327a() {
        return (byte) 6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ac.AbstractC0049b
    /* JADX INFO: renamed from: b */
    public final boolean mo328b() {
        String str = (String) this.f171b;
        if (str == null) {
            return false;
        }
        return "true".equalsIgnoreCase(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ac.AbstractC0049b
    /* JADX INFO: renamed from: c */
    public final float mo329c() {
        String str = (String) this.f171b;
        if (str == null || str.isEmpty()) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str.trim());
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ac.AbstractC0049b
    /* JADX INFO: renamed from: d */
    public final int mo330d() {
        String str = (String) this.f171b;
        if (str == null || str.isEmpty()) {
            return 0;
        }
        try {
            return str.contains(".") ? (int) Double.parseDouble(str) : Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ac.AbstractC0049b
    /* JADX INFO: renamed from: e */
    public final long mo331e() {
        String str = (String) this.f171b;
        if (str == null || str.isEmpty()) {
            return 0L;
        }
        try {
            return str.contains(".") ? (long) Double.parseDouble(str) : Long.parseLong(str.trim());
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ac.AbstractC0049b
    /* JADX INFO: renamed from: f */
    public final String mo332f() {
        Object obj = this.f171b;
        return obj != null ? (String) obj : HttpUrl.FRAGMENT_ENCODE_SET;
    }
}
