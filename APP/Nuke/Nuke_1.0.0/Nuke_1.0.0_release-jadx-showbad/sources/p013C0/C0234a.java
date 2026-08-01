package p013C0;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: C0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0234a {

    /* JADX INFO: renamed from: a */
    public long f787a;

    /* JADX INFO: renamed from: b */
    public float f788b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0234a)) {
            return false;
        }
        C0234a c0234a = (C0234a) obj;
        return this.f787a == c0234a.f787a && Float.compare(this.f788b, c0234a.f788b) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f788b) + (Long.hashCode(this.f787a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f787a);
        sb.append(", dataPoint=");
        return AbstractC0231b.m401l(sb, this.f788b, ')');
    }
}
