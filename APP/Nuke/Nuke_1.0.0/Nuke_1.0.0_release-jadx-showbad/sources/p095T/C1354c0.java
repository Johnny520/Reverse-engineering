package p095T;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: T.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1354c0 {

    /* JADX INFO: renamed from: a */
    public final String f4789a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1354c0(String str) {
        this.f4789a = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1354c0) && AbstractC1665j.m2981a(this.f4789a, ((C1354c0) obj).f4789a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4789a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0231b.m402m(new StringBuilder("OpaqueKey(key="), this.f4789a, ')');
    }
}
