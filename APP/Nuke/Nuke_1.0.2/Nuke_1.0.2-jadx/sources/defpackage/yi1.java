package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yi1 {
    public final int a;
    public final int b;
    public final String c;
    public final byte[] d;
    public final int e;
    public final long f;
    public final long g;
    public final String h;
    public final long i;
    public final long j;
    public final int k;
    public final long l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yi1(int i, int i2, String str, byte[] bArr, int i3, long j, long j2, String str2, long j3, long j4, int i4, long j5, int i5) {
        int i6 = (i5 & 1024) != 0 ? 0 : i4;
        long j6 = (i5 & 2048) != 0 ? 0L : j5;
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = bArr;
        this.e = i3;
        this.f = j;
        this.g = j2;
        this.h = str2;
        this.i = j3;
        this.j = j4;
        this.k = i6;
        this.l = j6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yi1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        yi1 yi1Var = (yi1) obj;
        return this.a == yi1Var.a && this.b == yi1Var.b && this.e == yi1Var.e && this.f == yi1Var.f && this.g == yi1Var.g && this.i == yi1Var.i && this.j == yi1Var.j && this.k == yi1Var.k && this.l == yi1Var.l && this.c.equals(yi1Var.c) && Arrays.equals(this.d, yi1Var.d) && this.h.equals(yi1Var.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iF = hk1.f(this.c, hk1.c((hk1.c(hk1.c(hk1.c(hk1.c(((((this.a * 31) + this.b) * 31) + this.e) * 31, 31, this.f), 31, this.g), 31, this.i), 31, this.j) + this.k) * 31, 31, this.l), 31);
        byte[] bArr = this.d;
        return hk1.f(this.h, (iF + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String string = Arrays.toString(this.d);
        StringBuilder sbK = hk1.k("MsgInfoBean(isSend=", this.a, this.b, ", status=", ", talker=");
        hk1.o(sbK, this.c, ", lvbuffer=", string, ", type=");
        sbK.append(this.e);
        sbK.append(", msgId=");
        sbK.append(this.f);
        sbK.append(", bizChatId=");
        sbK.append(this.g);
        sbK.append(", content=");
        sbK.append(this.h);
        sbK.append(", createTime=");
        sbK.append(this.i);
        sbK.append(", msgSvrId=");
        sbK.append(this.j);
        sbK.append(", flags=");
        sbK.append(this.k);
        sbK.append(", msgSeq=");
        sbK.append(this.l);
        sbK.append(", imgPath=null)");
        return sbK.toString();
    }
}
