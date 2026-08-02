package p000;

/* JADX INFO: renamed from: de */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0127de {
    public static final C0088ce Companion = new C0088ce();

    /* JADX INFO: renamed from: a */
    public final String f2003a;

    /* JADX INFO: renamed from: b */
    public final String f2004b;

    public /* synthetic */ C0127de(int i, String str, String str2) {
        this.f2003a = (i & 1) == 0 ? "\"$sender\"尝试撤回一条消息" : str;
        if ((i & 2) == 0) {
            this.f2004b = "yyyy/MM/dd HH:mm:ss";
        } else {
            this.f2004b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0127de)) {
            return false;
        }
        C0127de c0127de = (C0127de) obj;
        return t11.m5086l(this.f2003a, c0127de.f2003a) && t11.m5086l(this.f2004b, c0127de.f2004b);
    }

    public final int hashCode() {
        return this.f2004b.hashCode() + (this.f2003a.hashCode() * 31);
    }

    public final String toString() {
        return vi0.m5692k("AntiRevokeConf(pattern=", this.f2003a, ", timeFormat=", this.f2004b, ")");
    }

    public C0127de(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f2003a = str;
        this.f2004b = str2;
    }
}
