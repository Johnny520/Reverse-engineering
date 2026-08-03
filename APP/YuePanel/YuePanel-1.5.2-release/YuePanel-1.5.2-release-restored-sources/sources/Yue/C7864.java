package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7864 {

    /* JADX INFO: renamed from: ۥ */
    public int f3121;

    /* JADX INFO: renamed from: ۥ۟ */
    public String f3122;

    public C7864(int i, String str) {
        this.f3121 = i;
        this.f3122 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7864) && ((C7864) obj).f3121 == this.f3121;
    }

    public int hashCode() {
        return this.f3122.hashCode();
    }
}
