package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7050 {

    /* JADX INFO: renamed from: ۥ */
    public int f2652;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f2653;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f21291;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f21292;

    /* JADX INFO: renamed from: ۥ */
    public boolean m3340(int i, int i2) {
        int i3;
        int i4 = this.f2652;
        return i >= i4 && i < i4 + this.f21291 && i2 >= (i3 = this.f2653) && i2 < i3 + this.f21292;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public int m3341() {
        return (this.f2652 + this.f21291) / 2;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m21969() {
        return (this.f2653 + this.f21292) / 2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m21970(int i, int i2) {
        this.f2652 -= i;
        this.f2653 -= i2;
        this.f21291 += i * 2;
        this.f21292 += i2 * 2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m21971(C7050 c7050) {
        int i;
        int i2;
        int i3 = this.f2652;
        int i4 = c7050.f2652;
        return i3 >= i4 && i3 < i4 + c7050.f21291 && (i = this.f2653) >= (i2 = c7050.f2653) && i < i2 + c7050.f21292;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m21972(int i, int i2, int i3, int i4) {
        this.f2652 = i;
        this.f2653 = i2;
        this.f21291 = i3;
        this.f21292 = i4;
    }
}
