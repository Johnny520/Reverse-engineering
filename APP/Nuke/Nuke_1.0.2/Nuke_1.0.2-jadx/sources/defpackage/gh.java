package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gh {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;
    public final int i;
    public final AtomicBoolean j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gh(String str, String str2, String str3, String str4, int i, int i2, String str5, String str6, int i3) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
        this.g = str5;
        this.h = str6;
        this.i = i3;
        this.j = atomicBoolean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh)) {
            return false;
        }
        gh ghVar = (gh) obj;
        return t11.l(this.a, ghVar.a) && t11.l(this.b, ghVar.b) && t11.l(this.c, ghVar.c) && t11.l(this.d, ghVar.d) && this.e == ghVar.e && this.f == ghVar.f && t11.l(this.g, ghVar.g) && t11.l(this.h, ghVar.h) && this.i == ghVar.i && t11.l(this.j, ghVar.j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.j.hashCode() + vi0.d(this.i, hk1.f(this.h, hk1.f(this.g, vi0.d(this.f, vi0.d(this.e, hk1.f(this.d, hk1.f(this.c, hk1.f(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbO = vi0.o("RedPacketInfo(sendId=", this.a, ", nativeUrl=", this.b, ", talker=");
        hk1.o(sbO, this.c, ", sender=", this.d, ", msgType=");
        sbO.append(this.e);
        sbO.append(", channelId=");
        sbO.append(this.f);
        sbO.append(", headImg=");
        hk1.o(sbO, this.g, ", nickName=", this.h, ", receiveMode=");
        sbO.append(this.i);
        sbO.append(", openRequested=");
        sbO.append(this.j);
        sbO.append(")");
        return sbO.toString();
    }
}
