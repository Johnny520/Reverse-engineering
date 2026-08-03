package p230p8;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: p8.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3352e {

    /* JADX INFO: renamed from: a */
    public final String f10795a;

    /* JADX INFO: renamed from: b */
    public final String f10796b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3352e(String str, String str2) {
        str.getClass();
        this.f10795a = str;
        this.f10796b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3352e)) {
            return false;
        }
        C3352e c3352e = (C3352e) obj;
        return AbstractC1416l.m3825a(this.f10795a, c3352e.f10795a) && this.f10796b.equals(c3352e.f10796b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10796b.hashCode() + (this.f10795a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("ResolvedMotionPhoto(imagePath=", this.f10795a, ", videoPath=", this.f10796b, ")");
    }
}
