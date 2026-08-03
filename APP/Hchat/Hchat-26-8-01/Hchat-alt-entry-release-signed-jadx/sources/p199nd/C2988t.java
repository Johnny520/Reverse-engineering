package p199nd;

import java.util.ArrayList;
import java.util.HashSet;
import md.C2825b;
import p000a.AbstractC0000a;
import p302ud.C4305a;
import p302ud.C4310f;

/* JADX INFO: renamed from: nd.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2988t {

    /* JADX INFO: renamed from: a */
    public final C4305a f9755a;

    /* JADX INFO: renamed from: b */
    public final C4305a f9756b;

    /* JADX INFO: renamed from: c */
    public final HashSet f9757c;

    /* JADX INFO: renamed from: d */
    public int f9758d;

    /* JADX INFO: renamed from: e */
    public C2988t f9759e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2988t(HashSet hashSet, C4305a c4305a, C4305a c4305a2) {
        this.f9755a = c4305a;
        this.f9756b = c4305a2;
        this.f9757c = hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final ArrayList m6395a() {
        ArrayList arrayList = new ArrayList();
        HashSet<C4305a> hashSet = this.f9757c;
        for (C4305a c4305a : hashSet) {
            for (C4305a c4305a2 : c4305a.f14353n) {
                if (!hashSet.contains(c4305a2) && !AbstractC0000a.m85q0(c4305a2)) {
                    arrayList.add(new C4310f(c4305a, c4305a2));
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final HashSet m6396b() {
        HashSet hashSet = new HashSet();
        HashSet<C4305a> hashSet2 = this.f9757c;
        for (C4305a c4305a : hashSet2) {
            for (C4305a c4305a2 : c4305a.f14353n) {
                if (!hashSet2.contains(c4305a2)) {
                    if (!c4305a2.f9217g.mo6236b(C2825b.f9178E)) {
                        hashSet.add(c4305a);
                    }
                }
            }
        }
        return hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "LOOP:" + this.f9758d + ": " + String.valueOf(this.f9755a) + "->" + String.valueOf(this.f9756b);
    }
}
