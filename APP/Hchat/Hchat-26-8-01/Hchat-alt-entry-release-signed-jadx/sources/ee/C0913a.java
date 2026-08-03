package ee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p025bc.AbstractC0255e;
import p302ud.C4305a;
import p302ud.C4322r;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: ee.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0913a {

    /* JADX INFO: renamed from: a */
    public final C4322r f2845a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f2846b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f2847c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final HashSet f2848d = new HashSet();

    /* JADX INFO: renamed from: e */
    public final C0914b f2849e = new C0914b();

    /* JADX INFO: renamed from: f */
    public final C4305a f2850f;

    /* JADX INFO: renamed from: g */
    public C0914b f2851g;

    /* JADX INFO: renamed from: h */
    public List f2852h;

    /* JADX INFO: renamed from: i */
    public int f2853i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0913a(C4322r c4322r, C4305a c4305a, ArrayList arrayList) {
        this.f2845a = c4322r;
        this.f2850f = c4305a;
        this.f2846b = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("FinallyExtractInfo{\n finally:\n  ", String.valueOf(this.f2849e), "\n dups:\n  ", AbstractC5798s.m10516j(this.f2847c, "\n  "), "\n}");
    }
}
