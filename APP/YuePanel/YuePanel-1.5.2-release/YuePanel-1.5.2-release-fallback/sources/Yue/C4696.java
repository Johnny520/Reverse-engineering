package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4696 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int f14909;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.String f14910;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.lang.String f14911;

    public C4696(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f14909 = r1
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.f14910 = r1
            r0.f14911 = r2
            return
    }

    public C4696(int r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = this;
            r0.<init>()
            r0.f14909 = r1
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.f14910 = r1
            java.lang.String r1 = java.lang.String.format(r2, r3)
            r0.f14911 = r1
            return
    }

    public C4696(Yue.C1092 r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            int r0 = r2.m5824()
            r1.f14909 = r0
            java.lang.String r2 = r2.m5825()
            r1.f14910 = r2
            r1.f14911 = r3
            return
    }

    public C4696(Yue.C1092 r2, java.lang.String r3, java.lang.Object... r4) {
            r1 = this;
            r1.<init>()
            int r0 = r2.m5824()
            r1.f14909 = r0
            java.lang.String r2 = r2.m5825()
            r1.f14910 = r2
            java.lang.String r2 = java.lang.String.format(r3, r4)
            r1.f14911 = r2
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<"
            r0.append(r1)
            java.lang.String r1 = r2.f14910
            r0.append(r1)
            java.lang.String r1 = ">: "
            r0.append(r1)
            java.lang.String r1 = r2.f14911
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.String m18604() {
            r1 = this;
            java.lang.String r0 = r1.f14910
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.String m18605() {
            r1 = this;
            java.lang.String r0 = r1.f14911
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m18606() {
            r1 = this;
            int r0 = r1.f14909
            return r0
    }
}
