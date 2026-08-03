package p226p3;

import gg.AbstractC1416l;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: p3.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3292a {

    /* JADX INFO: renamed from: b */
    public static final C3292a f10464b = new C3292a();

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f10465a = new LinkedHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C3292a) {
            return AbstractC1416l.m3825a(this.f10465a, ((C3292a) obj).f10465a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10465a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CreationExtras(extras=" + this.f10465a + ')';
    }
}
