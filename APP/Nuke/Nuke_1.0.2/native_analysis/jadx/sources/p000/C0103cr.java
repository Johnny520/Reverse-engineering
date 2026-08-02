package p000;

import java.util.List;

/* JADX INFO: renamed from: cr */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0103cr {
    public static final C0065br Companion = new C0065br();

    /* JADX INFO: renamed from: b */
    public static final j71[] f1691b = {AbstractC0570p7.m3746B(i91.f4497h, new C0074c0(18))};

    /* JADX INFO: renamed from: a */
    public final List f1692a;

    public /* synthetic */ C0103cr(int i, List list) {
        if ((i & 1) == 0) {
            this.f1692a = be0.f819h;
        } else {
            this.f1692a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0103cr) && t11.m5086l(this.f1692a, ((C0103cr) obj).f1692a);
    }

    public final int hashCode() {
        return this.f1692a.hashCode();
    }

    public final String toString() {
        return "ChatAutoReplyConf(tasks=" + this.f1692a + ")";
    }

    public C0103cr(List list) {
        list.getClass();
        this.f1692a = list;
    }

    public /* synthetic */ C0103cr() {
        this(be0.f819h);
    }
}
