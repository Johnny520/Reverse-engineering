package p000;

/* JADX INFO: renamed from: xz */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0904xz extends AbstractC0943yz {
    @Override // p000.AbstractC0637qz
    /* JADX INFO: renamed from: a */
    public final byte mo4017a() {
        return (byte) 6;
    }

    @Override // p000.AbstractC0637qz
    /* JADX INFO: renamed from: b */
    public final boolean mo4296b() {
        String str = (String) this.f13677b;
        if (str == null) {
            return false;
        }
        return "true".equalsIgnoreCase(str);
    }

    @Override // p000.AbstractC0637qz
    /* JADX INFO: renamed from: c */
    public final float mo4297c() {
        String str = (String) this.f13677b;
        if (str == null || str.isEmpty()) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str.trim());
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }

    @Override // p000.AbstractC0637qz
    /* JADX INFO: renamed from: d */
    public final int mo4298d() {
        String str = (String) this.f13677b;
        if (str == null || str.isEmpty()) {
            return 0;
        }
        try {
            return str.contains(".") ? (int) Double.parseDouble(str) : Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // p000.AbstractC0637qz
    /* JADX INFO: renamed from: e */
    public final long mo4299e() {
        String str = (String) this.f13677b;
        if (str == null || str.isEmpty()) {
            return 0L;
        }
        try {
            return str.contains(".") ? (long) Double.parseDouble(str) : Long.parseLong(str.trim());
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @Override // p000.AbstractC0637qz
    /* JADX INFO: renamed from: f */
    public final String mo4300f() {
        Object obj = this.f13677b;
        return obj != null ? (String) obj : "";
    }
}
