package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3528 implements InterfaceC5736 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f5978 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f5979 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f5980 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f5981 = 3;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final InterfaceC5736 f5982;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f5983 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f5984 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f5985 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Object f5986 = null;

    public C3528(@InterfaceC6391 InterfaceC5736 interfaceC5736) {
        this.f5982 = interfaceC5736;
    }

    @Override // Yue.InterfaceC5736
    /* JADX INFO: renamed from: ۥ */
    public void mo595(int i, int i2) {
        m9456();
        this.f5982.mo595(i, i2);
    }

    @Override // Yue.InterfaceC5736
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo596(int i, int i2) {
        int i3;
        if (this.f5983 == 1 && i >= (i3 = this.f5984)) {
            int i4 = this.f5985;
            if (i <= i3 + i4) {
                this.f5985 = i4 + i2;
                this.f5984 = Math.min(i, i3);
                return;
            }
        }
        m9456();
        this.f5984 = i;
        this.f5985 = i2;
        this.f5983 = 1;
    }

    @Override // Yue.InterfaceC5736
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void mo9454(int i, int i2) {
        int i3;
        if (this.f5983 == 2 && (i3 = this.f5984) >= i && i3 <= i + i2) {
            this.f5985 += i2;
            this.f5984 = i;
        } else {
            m9456();
            this.f5984 = i;
            this.f5985 = i2;
            this.f5983 = 2;
        }
    }

    @Override // Yue.InterfaceC5736
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void mo9455(int i, int i2, Object obj) {
        int i3;
        if (this.f5983 == 3) {
            int i4 = this.f5984;
            int i5 = this.f5985;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f5986 == obj) {
                this.f5984 = Math.min(i, i4);
                this.f5985 = Math.max(i5 + i4, i3) - this.f5984;
                return;
            }
        }
        m9456();
        this.f5984 = i;
        this.f5985 = i2;
        this.f5986 = obj;
        this.f5983 = 3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m9456() {
        int i = this.f5983;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.f5982.mo596(this.f5984, this.f5985);
        } else if (i == 2) {
            this.f5982.mo9454(this.f5984, this.f5985);
        } else if (i == 3) {
            this.f5982.mo9455(this.f5984, this.f5985, this.f5986);
        }
        this.f5986 = null;
        this.f5983 = 0;
    }
}
