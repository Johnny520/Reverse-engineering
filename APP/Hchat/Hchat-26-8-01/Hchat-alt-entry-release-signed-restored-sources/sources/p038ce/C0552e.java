package p038ce;

import ae.C0074e;
import ae.C0075f;
import ae.C0077h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;
import p020b5.C0192k;
import p246qd.AbstractC3506j;
import p302ud.C4311g;
import p302ud.C4322r;
import p302ud.InterfaceC4316l;

/* JADX INFO: renamed from: ce.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0552e implements BiConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1735a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1736b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0552e(Object obj, int i9) {
        this.f1735a = i9;
        this.f1736b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f1735a) {
            case 0:
                C4322r c4322r = (C4322r) this.f1736b;
                C0075f c0075f = (C0075f) obj;
                if (((List) obj2).isEmpty()) {
                    c0075f.f240i = true;
                    c0075f.f235d.forEach(new C0074e(0));
                    C0560m.m1573p(c4322r.f14402B, c0075f.f234c);
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f1736b;
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((C0075f) obj);
                arrayList.add(new C0077h(arrayList.size(), arrayList2, (List) obj2));
                break;
            default:
                HashMap map = (HashMap) this.f1736b;
                InterfaceC4316l interfaceC4316l = (InterfaceC4316l) obj2;
                if (interfaceC4316l.mo6656f().f10148i.equals(AbstractC3506j.f11385b) && (interfaceC4316l instanceof C4311g) && (obj instanceof Integer)) {
                    C4311g c4311g = (C4311g) interfaceC4316l;
                    C0192k c0192k = c4311g.f14391m;
                    if (c0192k.m856h() && c0192k.m851c()) {
                        map.put((Integer) obj, c4311g);
                        break;
                    }
                }
                break;
        }
    }
}
