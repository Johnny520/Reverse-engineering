package p049I2;

/* JADX INFO: renamed from: I2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0785c extends AbstractC0784b {

    /* JADX INFO: renamed from: b */
    public boolean f2527b;

    public C0785c(int i5, boolean z5) {
        this.f2526a = i5;
        this.f2527b = z5;
    }

    @Override // p049I2.AbstractC0784b
    /* JADX INFO: renamed from: a */
    public final byte mo1331a() {
        return (byte) 1;
    }

    @Override // p049I2.AbstractC0784b
    /* JADX INFO: renamed from: b */
    public final boolean mo1332b() {
        return this.f2527b;
    }

    @Override // p049I2.AbstractC0784b
    /* JADX INFO: renamed from: c */
    public final float mo1333c() {
        return this.f2527b ? 1.0f : 0.0f;
    }

    @Override // p049I2.AbstractC0784b
    /* JADX INFO: renamed from: d */
    public final int mo1334d() {
        return this.f2527b ? 1 : 0;
    }

    @Override // p049I2.AbstractC0784b
    /* JADX INFO: renamed from: e */
    public final long mo1335e() {
        return this.f2527b ? 1L : 0L;
    }

    @Override // p049I2.AbstractC0784b
    /* JADX INFO: renamed from: f */
    public final String mo1336f() {
        return this.f2527b ? "true" : "false";
    }
}
