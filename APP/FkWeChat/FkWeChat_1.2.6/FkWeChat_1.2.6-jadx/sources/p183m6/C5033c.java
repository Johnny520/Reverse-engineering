package p183m6;

/* JADX INFO: renamed from: m6.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C5033c extends AbstractC5032b {

    /* JADX INFO: renamed from: b */
    public boolean f15307b;

    public C5033c(int i10, boolean z10) {
        this.f15306a = i10;
        this.f15307b = z10;
    }

    @Override // p183m6.AbstractC5032b
    /* JADX INFO: renamed from: a */
    public byte mo20322a() {
        return (byte) 1;
    }

    @Override // p183m6.AbstractC5032b
    /* JADX INFO: renamed from: b */
    public boolean mo20323b() {
        return this.f15307b;
    }

    @Override // p183m6.AbstractC5032b
    /* JADX INFO: renamed from: c */
    public float mo20324c() {
        return this.f15307b ? 1.0f : 0.0f;
    }

    @Override // p183m6.AbstractC5032b
    /* JADX INFO: renamed from: d */
    public int mo20325d() {
        return this.f15307b ? 1 : 0;
    }

    @Override // p183m6.AbstractC5032b
    /* JADX INFO: renamed from: e */
    public long mo20326e() {
        return this.f15307b ? 1L : 0L;
    }

    @Override // p183m6.AbstractC5032b
    /* JADX INFO: renamed from: f */
    public String mo20327f() {
        return this.f15307b ? "true" : "false";
    }
}
