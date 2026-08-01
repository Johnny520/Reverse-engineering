package p102z0;

import p022L.AbstractC0174d;

/* JADX INFO: renamed from: z0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1131n {

    /* JADX INFO: renamed from: a */
    public final String f3810a;

    /* JADX INFO: renamed from: b */
    public final String f3811b;

    /* JADX INFO: renamed from: c */
    public final String f3812c;

    /* JADX INFO: renamed from: d */
    public final String f3813d;

    /* JADX INFO: renamed from: e */
    public final String f3814e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1131n(String str, String str2, String str3, String str4, String str5) {
        this.f3810a = str;
        this.f3811b = str2;
        this.f3812c = str3;
        this.f3813d = str4;
        this.f3814e = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1131n)) {
            return false;
        }
        C1131n c1131n = (C1131n) obj;
        return this.f3810a.equals(c1131n.f3810a) && this.f3811b.equals(c1131n.f3811b) && this.f3812c.equals(c1131n.f3812c) && this.f3813d.equals(c1131n.f3813d) && this.f3814e.equals(c1131n.f3814e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3814e.hashCode() + AbstractC0174d.m347c(this.f3813d, (((this.f3812c.hashCode() + AbstractC0174d.m347c(this.f3811b, this.f3810a.hashCode() * 31, 31)) * 31) + 115) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageStorageConfig(messageClassName=");
        sb.append(this.f3810a);
        sb.append(", serviceClassName=");
        sb.append(this.f3811b);
        sb.append(", locatorClassName=");
        sb.append(this.f3812c);
        sb.append(", locatorMethodName=s, storageGetterName=");
        sb.append(this.f3813d);
        sb.append(", insertMethodName=");
        return AbstractC0174d.m356l(sb, this.f3814e, ")");
    }
}
