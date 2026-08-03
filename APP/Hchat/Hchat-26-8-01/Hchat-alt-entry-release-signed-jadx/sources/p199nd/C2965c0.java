package p199nd;

import java.util.ArrayList;
import java.util.Iterator;
import md.C2825b;
import p214oc.InterfaceC3124a;
import p214oc.InterfaceC3125b;
import p233pd.C3406q;
import p246qd.C3514r;

/* JADX INFO: renamed from: nd.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2965c0 implements InterfaceC3125b {

    /* JADX INFO: renamed from: g */
    public final ArrayList f9719g = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC3124a mo441a() {
        return C2825b.f9209x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PHI:");
        ArrayList<C3406q> arrayList = this.f9719g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3514r c3514r = ((C3406q) it.next()).f14397l;
            if (c3514r != null) {
                sb2.append(" r");
                sb2.append(c3514r.f11439l);
            }
        }
        for (C3406q c3406q : arrayList) {
            sb2.append("\n  ");
            sb2.append(c3406q);
        }
        return sb2.toString();
    }
}
