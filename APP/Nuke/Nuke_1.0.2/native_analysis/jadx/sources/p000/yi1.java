package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yi1 {

    /* JADX INFO: renamed from: a */
    public final int f13468a;

    /* JADX INFO: renamed from: b */
    public final int f13469b;

    /* JADX INFO: renamed from: c */
    public final String f13470c;

    /* JADX INFO: renamed from: d */
    public final byte[] f13471d;

    /* JADX INFO: renamed from: e */
    public final int f13472e;

    /* JADX INFO: renamed from: f */
    public final long f13473f;

    /* JADX INFO: renamed from: g */
    public final long f13474g;

    /* JADX INFO: renamed from: h */
    public final String f13475h;

    /* JADX INFO: renamed from: i */
    public final long f13476i;

    /* JADX INFO: renamed from: j */
    public final long f13477j;

    /* JADX INFO: renamed from: k */
    public final int f13478k;

    /* JADX INFO: renamed from: l */
    public final long f13479l;

    public yi1(int i, int i2, String str, byte[] bArr, int i3, long j, long j2, String str2, long j3, long j4, int i4, long j5, int i5) {
        int i6 = (i5 & 1024) != 0 ? 0 : i4;
        long j6 = (i5 & 2048) != 0 ? 0L : j5;
        this.f13468a = i;
        this.f13469b = i2;
        this.f13470c = str;
        this.f13471d = bArr;
        this.f13472e = i3;
        this.f13473f = j;
        this.f13474g = j2;
        this.f13475h = str2;
        this.f13476i = j3;
        this.f13477j = j4;
        this.f13478k = i6;
        this.f13479l = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yi1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        yi1 yi1Var = (yi1) obj;
        return this.f13468a == yi1Var.f13468a && this.f13469b == yi1Var.f13469b && this.f13472e == yi1Var.f13472e && this.f13473f == yi1Var.f13473f && this.f13474g == yi1Var.f13474g && this.f13476i == yi1Var.f13476i && this.f13477j == yi1Var.f13477j && this.f13478k == yi1Var.f13478k && this.f13479l == yi1Var.f13479l && this.f13470c.equals(yi1Var.f13470c) && Arrays.equals(this.f13471d, yi1Var.f13471d) && this.f13475h.equals(yi1Var.f13475h);
    }

    public final int hashCode() {
        int iM2207f = hk1.m2207f(this.f13470c, hk1.m2204c((hk1.m2204c(hk1.m2204c(hk1.m2204c(hk1.m2204c(((((this.f13468a * 31) + this.f13469b) * 31) + this.f13472e) * 31, 31, this.f13473f), 31, this.f13474g), 31, this.f13476i), 31, this.f13477j) + this.f13478k) * 31, 31, this.f13479l), 31);
        byte[] bArr = this.f13471d;
        return hk1.m2207f(this.f13475h, (iM2207f + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31, 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.f13471d);
        StringBuilder sbM2212k = hk1.m2212k("MsgInfoBean(isSend=", this.f13468a, this.f13469b, ", status=", ", talker=");
        hk1.m2216o(sbM2212k, this.f13470c, ", lvbuffer=", string, ", type=");
        sbM2212k.append(this.f13472e);
        sbM2212k.append(", msgId=");
        sbM2212k.append(this.f13473f);
        sbM2212k.append(", bizChatId=");
        sbM2212k.append(this.f13474g);
        sbM2212k.append(", content=");
        sbM2212k.append(this.f13475h);
        sbM2212k.append(", createTime=");
        sbM2212k.append(this.f13476i);
        sbM2212k.append(", msgSvrId=");
        sbM2212k.append(this.f13477j);
        sbM2212k.append(", flags=");
        sbM2212k.append(this.f13478k);
        sbM2212k.append(", msgSeq=");
        sbM2212k.append(this.f13479l);
        sbM2212k.append(", imgPath=null)");
        return sbM2212k.toString();
    }
}
