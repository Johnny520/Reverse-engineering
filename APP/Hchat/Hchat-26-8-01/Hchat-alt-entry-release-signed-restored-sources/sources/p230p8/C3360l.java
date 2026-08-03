package p230p8;

import gg.AbstractC1416l;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: p8.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3360l {

    /* JADX INFO: renamed from: a */
    public final String f10844a;

    /* JADX INFO: renamed from: b */
    public final C3370v f10845b;

    /* JADX INFO: renamed from: c */
    public final Object f10846c;

    /* JADX INFO: renamed from: d */
    public final WeakReference f10847d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3360l(String str, C3370v c3370v, Object obj, WeakReference weakReference) {
        this.f10844a = str;
        this.f10845b = c3370v;
        this.f10846c = obj;
        this.f10847d = weakReference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3360l)) {
            return false;
        }
        C3360l c3360l = (C3360l) obj;
        return AbstractC1416l.m3825a(this.f10844a, c3360l.f10844a) && this.f10845b.equals(c3360l.f10845b) && AbstractC1416l.m3825a(this.f10846c, c3360l.f10846c) && AbstractC1416l.m3825a(this.f10847d, c3360l.f10847d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f10844a;
        int iHashCode = (this.f10845b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        Object obj = this.f10846c;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        WeakReference weakReference = this.f10847d;
        return iHashCode2 + (weakReference != null ? weakReference.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SnsContextMenuTarget(snsId=" + this.f10844a + ", snapshot=" + this.f10845b + ", nativeInfo=" + this.f10846c + ", anchorView=" + this.f10847d + ")";
    }
}
