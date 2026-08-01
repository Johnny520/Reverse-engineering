package p086r0;

import p022L.AbstractC0174d;

/* JADX INFO: renamed from: r0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0893d {

    /* JADX INFO: renamed from: a */
    public final String f3079a;

    /* JADX INFO: renamed from: b */
    public final String f3080b;

    /* JADX INFO: renamed from: c */
    public final String f3081c;

    /* JADX INFO: renamed from: d */
    public final String f3082d;

    /* JADX INFO: renamed from: e */
    public final String f3083e;

    /* JADX INFO: renamed from: f */
    public final String f3084f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0893d(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f3079a = str;
        this.f3080b = str2;
        this.f3081c = str3;
        this.f3082d = str4;
        this.f3083e = str5;
        this.f3084f = str6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0893d)) {
            return false;
        }
        C0893d c0893d = (C0893d) obj;
        return this.f3079a.equals(c0893d.f3079a) && this.f3080b.equals(c0893d.f3080b) && this.f3081c.equals(c0893d.f3081c) && this.f3082d.equals(c0893d.f3082d) && this.f3083e.equals(c0893d.f3083e) && this.f3084f.equals(c0893d.f3084f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3084f.hashCode() + AbstractC0174d.m347c(this.f3083e, (((this.f3082d.hashCode() + AbstractC0174d.m347c(this.f3081c, AbstractC0174d.m347c(this.f3080b, this.f3079a.hashCode() * 31, 31), 31)) * 31) + 115) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageStorageConfig(storageClassName=");
        sb.append(this.f3079a);
        sb.append(", messageClassName=");
        sb.append(this.f3080b);
        sb.append(", serviceClassName=");
        sb.append(this.f3081c);
        sb.append(", locatorClassName=");
        sb.append(this.f3082d);
        sb.append(", locatorMethodName=s, storageGetterName=");
        sb.append(this.f3083e);
        sb.append(", insertMethodName=");
        return AbstractC0174d.m356l(sb, this.f3084f, ")");
    }
}
