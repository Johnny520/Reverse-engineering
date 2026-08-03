package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7188 {

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f21686 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۥ */
    public int f2729 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f2730 = 0;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f21687 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f21688 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f21689 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f21690 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean f21691 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean f21692 = false;

    /* JADX INFO: renamed from: ۥ */
    public int m3479() {
        return this.f21691 ? this.f2729 : this.f2730;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public int m3480() {
        return this.f2729;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m22516() {
        return this.f2730;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m22517() {
        return this.f21691 ? this.f2730 : this.f2729;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m22518(int i, int i2) {
        this.f21692 = false;
        if (i != Integer.MIN_VALUE) {
            this.f21689 = i;
            this.f2729 = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f21690 = i2;
            this.f2730 = i2;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m22519(boolean z) {
        if (z == this.f21691) {
            return;
        }
        this.f21691 = z;
        if (!this.f21692) {
            this.f2729 = this.f21689;
            this.f2730 = this.f21690;
            return;
        }
        if (z) {
            int i = this.f21688;
            if (i == Integer.MIN_VALUE) {
                i = this.f21689;
            }
            this.f2729 = i;
            int i2 = this.f21687;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.f21690;
            }
            this.f2730 = i2;
            return;
        }
        int i3 = this.f21687;
        if (i3 == Integer.MIN_VALUE) {
            i3 = this.f21689;
        }
        this.f2729 = i3;
        int i4 = this.f21688;
        if (i4 == Integer.MIN_VALUE) {
            i4 = this.f21690;
        }
        this.f2730 = i4;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m22520(int i, int i2) {
        this.f21687 = i;
        this.f21688 = i2;
        this.f21692 = true;
        if (this.f21691) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2729 = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2730 = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2729 = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2730 = i2;
        }
    }
}
