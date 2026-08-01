package p049I2;

/* JADX INFO: renamed from: I2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0791i extends AbstractC0792j {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p049I2.AbstractC0784b
    /* JADX INFO: renamed from: a */
    public final byte mo1331a() {
        return (byte) 6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p049I2.AbstractC0784b
    /* JADX INFO: renamed from: b */
    public final boolean mo1332b() {
        String str = (String) this.f2532b;
        if (str == null) {
            return false;
        }
        return "true".equalsIgnoreCase(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p049I2.AbstractC0784b
    /* JADX INFO: renamed from: c */
    public final float mo1333c() {
        String str = (String) this.f2532b;
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
    @Override // p049I2.AbstractC0784b
    /* JADX INFO: renamed from: d */
    public final int mo1334d() {
        String str = (String) this.f2532b;
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
    @Override // p049I2.AbstractC0784b
    /* JADX INFO: renamed from: e */
    public final long mo1335e() {
        String str = (String) this.f2532b;
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
    @Override // p049I2.AbstractC0784b
    /* JADX INFO: renamed from: f */
    public final String mo1336f() {
        Object obj = this.f2532b;
        return obj != null ? (String) obj : "";
    }
}
