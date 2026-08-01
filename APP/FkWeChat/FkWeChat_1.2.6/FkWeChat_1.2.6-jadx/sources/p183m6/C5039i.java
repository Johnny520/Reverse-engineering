package p183m6;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: renamed from: m6.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C5039i extends AbstractC5040j {
    public C5039i(int i10, int i11, String str, int i12, boolean z10) {
        super(i10, i11, str, i12, z10);
    }

    @Override // p183m6.AbstractC5032b
    /* JADX INFO: renamed from: a */
    public byte mo20322a() {
        return (byte) 6;
    }

    @Override // p183m6.AbstractC5032b
    /* JADX INFO: renamed from: b */
    public boolean mo20323b() {
        return m20328g((String) this.f15313b);
    }

    @Override // p183m6.AbstractC5032b
    /* JADX INFO: renamed from: c */
    public float mo20324c() {
        return m20329h((String) this.f15313b);
    }

    @Override // p183m6.AbstractC5032b
    /* JADX INFO: renamed from: d */
    public int mo20325d() {
        return m20330i((String) this.f15313b);
    }

    @Override // p183m6.AbstractC5032b
    /* JADX INFO: renamed from: e */
    public long mo20326e() {
        return m20331j((String) this.f15313b);
    }

    @Override // p183m6.AbstractC5032b
    /* JADX INFO: renamed from: f */
    public String mo20327f() {
        Object obj = this.f15313b;
        return obj != null ? (String) obj : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m20328g(String str) {
        if (str == null) {
            return false;
        }
        return "true".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: h */
    public final float m20329h(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                return Float.parseFloat(str.trim());
            } catch (NumberFormatException unused) {
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: i */
    public final int m20330i(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                return str.contains(".") ? (int) Double.parseDouble(str) : Integer.parseInt(str.trim());
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public final long m20331j(String str) {
        if (str == null || str.isEmpty()) {
            return 0L;
        }
        try {
            return str.contains(".") ? (long) Double.parseDouble(str) : Long.parseLong(str.trim());
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }
}
