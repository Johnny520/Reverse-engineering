package p066ed;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import p246qd.AbstractC3506j;

/* JADX INFO: renamed from: ed.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0909b {

    /* JADX INFO: renamed from: a */
    public final AbstractC3506j f2826a;

    /* JADX INFO: renamed from: b */
    public final int f2827b;

    /* JADX INFO: renamed from: c */
    public AbstractC3506j[] f2828c;

    /* JADX INFO: renamed from: d */
    public Map f2829d = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: e */
    public List f2830e = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: f */
    public final int f2831f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0909b(int i9, int i10, AbstractC3506j abstractC3506j) {
        this.f2826a = abstractC3506j;
        this.f2827b = i9;
        this.f2831f = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0909b.class != obj.getClass()) {
            return false;
        }
        return this.f2826a.equals(((C0909b) obj).f2826a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2826a.f11410a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f2826a.toString();
    }
}
