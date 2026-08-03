package p038ce;

import ae.C0075f;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import p121i4.C1962c0;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4322r;

/* JADX INFO: renamed from: ce.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0553f implements BiConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1737a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ce.l.g(ud.r):void, re.c.i(i4.c0):void] */
    public /* synthetic */ C0553f(int i9) {
        this.f1737a = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f1737a) {
            case 0:
                ((List) obj2).removeAll(((C0075f) obj).f235d);
                break;
            case 1:
                ((C4309e) obj).f14386z = C1962c0.m4858j((Set) obj2);
                break;
            case 2:
                ((C4309e) obj).f14367B = C1962c0.m4858j((Set) obj2);
                break;
            case 3:
                ((C4309e) obj).f14368C = C1962c0.m4858j((Set) obj2);
                break;
            case 4:
                ((C4311g) obj).f14393o = C1962c0.m4858j((Set) obj2);
                break;
            default:
                ((C4322r) obj).f14408H = C1962c0.m4858j((Set) obj2);
                break;
        }
    }
}
