package ae;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p215od.C3128a;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p302ud.C4305a;
import p302ud.C4322r;
import p332wb.AbstractC4855en;
import p350xd.C5775b;
import p351xe.AbstractC5792m;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: ae.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0075f {

    /* JADX INFO: renamed from: b */
    public final int f233b;

    /* JADX INFO: renamed from: c */
    public C4305a f234c;

    /* JADX INFO: renamed from: e */
    public C5775b f236e;

    /* JADX INFO: renamed from: f */
    public AbstractC3508l f237f;

    /* JADX INFO: renamed from: g */
    public C0077h f238g;

    /* JADX INFO: renamed from: h */
    public boolean f239h;

    /* JADX INFO: renamed from: a */
    public final ArrayList f232a = new ArrayList(1);

    /* JADX INFO: renamed from: d */
    public final ArrayList f235d = new ArrayList();

    /* JADX INFO: renamed from: i */
    public boolean f240i = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0075f(int i9) {
        this.f233b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m442a(C4322r c4322r, C3128a c3128a) {
        ArrayList arrayList = this.f232a;
        if (c3128a != null) {
            if (arrayList.contains(c3128a)) {
                return false;
            }
            return arrayList.add(c3128a);
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        c4322r.m6380I("Throwable added to exception handler: '" + (arrayList.isEmpty() ? "all" : AbstractC5798s.m10517k(arrayList, " | ", new C0073d(0))) + "', keep only Throwable");
        arrayList.clear();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final AbstractC3506j m443b() {
        if (m444c()) {
            return AbstractC3506j.f11398o;
        }
        ArrayList arrayList = this.f232a;
        return arrayList.size() == 1 ? ((C3128a) arrayList.iterator().next()).f10138g : AbstractC3506j.f11398o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m444c() {
        ArrayList arrayList = this.f232a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((C3128a) it.next()).f10141j.equals("java.lang.Throwable")) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0075f.class != obj.getClass()) {
            return false;
        }
        C0075f c0075f = (C0075f) obj;
        return this.f233b == c0075f.f233b && this.f232a.equals(c0075f.f232a) && Objects.equals(this.f238g, c0075f.f238g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Objects.hash(this.f232a, Integer.valueOf(this.f233b));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        ArrayList arrayList = this.f232a;
        return AbstractC4855en.m9264h(arrayList.isEmpty() ? "all" : AbstractC5798s.m10517k(arrayList, " | ", new C0073d(0)), " -> ", AbstractC5792m.m10487d(this.f233b));
    }
}
