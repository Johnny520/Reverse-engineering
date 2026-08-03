package p247qe;

import androidx.lifecycle.C0100e0;
import java.util.ArrayList;
import java.util.List;
import me.C2833a;
import p025bc.AbstractC0255e;
import p246qd.AbstractC3508l;
import p246qd.C3514r;
import p302ud.C4320p;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: qe.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3516a {

    /* JADX INFO: renamed from: a */
    public final C4320p f11449a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f11450b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3516a(C4320p c4320p, AbstractC3508l abstractC3508l) {
        this.f11449a = c4320p;
        List<AbstractC3508l> list = c4320p.f14398m;
        ArrayList arrayList = new ArrayList(list.size());
        C3514r c3514r = c4320p.f14397l;
        if (c3514r == abstractC3508l) {
            for (AbstractC3508l abstractC3508l2 : list) {
                abstractC3508l2.getClass();
                if (abstractC3508l2 instanceof C3514r) {
                    arrayList.add(((C3514r) abstractC3508l2).f11440m);
                }
            }
        } else {
            arrayList.add(c3514r.f11440m);
            for (AbstractC3508l abstractC3508l3 : list) {
                if (abstractC3508l3 != abstractC3508l) {
                    abstractC3508l3.getClass();
                    if (abstractC3508l3 instanceof C3514r) {
                        arrayList.add(((C3514r) abstractC3508l3).f11440m);
                    }
                }
            }
        }
        this.f11450b = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo7413a(C0100e0 c0100e0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("(", String.valueOf(this.f11449a.f14396k), ":", AbstractC5798s.m10517k(this.f11450b, ", ", new C2833a(8)), ")");
    }
}
