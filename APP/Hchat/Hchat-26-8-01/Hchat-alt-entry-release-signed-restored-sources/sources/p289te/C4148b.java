package p289te;

import java.util.ArrayList;
import p003a2.C0014a;
import p025bc.C0261k;
import p082fd.C1211h;
import p084ff.C1217c;
import p162l3.C2469w;

/* JADX INFO: renamed from: te.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4148b implements Comparable {

    /* JADX INFO: renamed from: g */
    public final C0261k f13672g;

    /* JADX INFO: renamed from: h */
    public final C1217c f13673h;

    /* JADX INFO: renamed from: i */
    public final C0014a f13674i;

    /* JADX INFO: renamed from: j */
    public final ClassLoader f13675j;

    /* JADX INFO: renamed from: k */
    public C2469w f13676k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f13677l = new ArrayList();

    /* JADX INFO: renamed from: m */
    public C1211h f13678m;

    /* JADX INFO: renamed from: n */
    public boolean f13679n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4148b(C0261k c0261k, C1217c c1217c) {
        this.f13672g = c0261k;
        this.f13673h = c1217c;
        c1217c.getClass();
        this.f13674i = new C0014a(25);
        this.f13675j = C1217c.class.getClassLoader();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m8344a() {
        this.f13674i.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m8344a();
        ((C4148b) obj).m8344a();
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4148b)) {
            return false;
        }
        m8344a();
        ((C4148b) obj).m8344a();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        m8344a();
        return 88294036;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        m8344a();
        return "dex-input";
    }
}
