package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: gh */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0240gh {

    /* JADX INFO: renamed from: a */
    public final String f3513a;

    /* JADX INFO: renamed from: b */
    public final String f3514b;

    /* JADX INFO: renamed from: c */
    public final String f3515c;

    /* JADX INFO: renamed from: d */
    public final String f3516d;

    /* JADX INFO: renamed from: e */
    public final int f3517e;

    /* JADX INFO: renamed from: f */
    public final int f3518f;

    /* JADX INFO: renamed from: g */
    public final String f3519g;

    /* JADX INFO: renamed from: h */
    public final String f3520h;

    /* JADX INFO: renamed from: i */
    public final int f3521i;

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f3522j;

    public C0240gh(String str, String str2, String str3, String str4, int i, int i2, String str5, String str6, int i3) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        str4.getClass();
        this.f3513a = str;
        this.f3514b = str2;
        this.f3515c = str3;
        this.f3516d = str4;
        this.f3517e = i;
        this.f3518f = i2;
        this.f3519g = str5;
        this.f3520h = str6;
        this.f3521i = i3;
        this.f3522j = atomicBoolean;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0240gh)) {
            return false;
        }
        C0240gh c0240gh = (C0240gh) obj;
        return t11.m5086l(this.f3513a, c0240gh.f3513a) && t11.m5086l(this.f3514b, c0240gh.f3514b) && t11.m5086l(this.f3515c, c0240gh.f3515c) && t11.m5086l(this.f3516d, c0240gh.f3516d) && this.f3517e == c0240gh.f3517e && this.f3518f == c0240gh.f3518f && t11.m5086l(this.f3519g, c0240gh.f3519g) && t11.m5086l(this.f3520h, c0240gh.f3520h) && this.f3521i == c0240gh.f3521i && t11.m5086l(this.f3522j, c0240gh.f3522j);
    }

    public final int hashCode() {
        return this.f3522j.hashCode() + vi0.m5685d(this.f3521i, hk1.m2207f(this.f3520h, hk1.m2207f(this.f3519g, vi0.m5685d(this.f3518f, vi0.m5685d(this.f3517e, hk1.m2207f(this.f3516d, hk1.m2207f(this.f3515c, hk1.m2207f(this.f3514b, this.f3513a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM5696o = vi0.m5696o("RedPacketInfo(sendId=", this.f3513a, ", nativeUrl=", this.f3514b, ", talker=");
        hk1.m2216o(sbM5696o, this.f3515c, ", sender=", this.f3516d, ", msgType=");
        sbM5696o.append(this.f3517e);
        sbM5696o.append(", channelId=");
        sbM5696o.append(this.f3518f);
        sbM5696o.append(", headImg=");
        hk1.m2216o(sbM5696o, this.f3519g, ", nickName=", this.f3520h, ", receiveMode=");
        sbM5696o.append(this.f3521i);
        sbM5696o.append(", openRequested=");
        sbM5696o.append(this.f3522j);
        sbM5696o.append(")");
        return sbM5696o.toString();
    }
}
