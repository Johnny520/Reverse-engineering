package p230p8;

import android.content.ContentValues;
import gg.AbstractC1416l;

/* JADX INFO: renamed from: p8.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3355g {

    /* JADX INFO: renamed from: a */
    public final Object f10807a;

    /* JADX INFO: renamed from: b */
    public final ContentValues f10808b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3355g(Object obj, ContentValues contentValues) {
        obj.getClass();
        this.f10807a = obj;
        this.f10808b = contentValues;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3355g)) {
            return false;
        }
        C3355g c3355g = (C3355g) obj;
        return AbstractC1416l.m3825a(this.f10807a, c3355g.f10807a) && this.f10808b.equals(c3355g.f10808b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10808b.hashCode() + (this.f10807a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SnsCachedPostRecord(nativeInfo=" + this.f10807a + ", values=" + this.f10808b + ")";
    }
}
