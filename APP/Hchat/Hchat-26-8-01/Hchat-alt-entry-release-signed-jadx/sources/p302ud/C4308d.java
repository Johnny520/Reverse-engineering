package p302ud;

import af.C0084g;
import java.util.List;
import java.util.function.Consumer;
import p351xe.AbstractC5795p;
import p351xe.AbstractC5798s;
import p351xe.C5791l;

/* JADX INFO: renamed from: ud.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4308d implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14364a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [xe.l.b(java.util.List, java.util.function.Function):void] */
    public /* synthetic */ C4308d(C5791l c5791l) {
        this.f14364a = 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f14364a) {
            case 0:
                ((C4309e) obj).m8670o0();
                return;
            case 1:
                ((C4311g) obj).m6229F();
                return;
            case 2:
                C4305a c4305a = (C4305a) obj;
                c4305a.getClass();
                try {
                    List list = c4305a.f14353n;
                    List listM10519m = AbstractC5798s.m10519m(list);
                    c4305a.f14353n = listM10519m;
                    List list2 = c4305a.f14354o;
                    if (list != list2) {
                        listM10519m = AbstractC5798s.m10519m(list2);
                    }
                    c4305a.f14354o = listM10519m;
                    c4305a.f14352m = AbstractC5798s.m10519m(c4305a.f14352m);
                    c4305a.f14360u = AbstractC5798s.m10519m(c4305a.f14360u);
                    if (c4305a.f14357r != null) {
                        return;
                    } else {
                        throw new C0084g("Dominance frontier not set for block: ".concat(String.valueOf(c4305a)));
                    }
                } catch (Exception e6) {
                    throw new C0084g("Failed to lock block: ".concat(String.valueOf(c4305a)), e6);
                }
            default:
                ((AbstractC5795p) obj).getClass();
                throw null;
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ud.e.o0():void] */
    public /* synthetic */ C4308d(int i9) {
        this.f14364a = i9;
    }
}
