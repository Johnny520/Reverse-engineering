package p178m1;

import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import java.util.Iterator;
import java.util.Map;
import p055e.AbstractC1960a;
import p172l8.C4710q;

/* JADX INFO: renamed from: m1.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4792d {
    /* JADX INFO: renamed from: a */
    public static final void m19202a(C4789a c4789a, SparseArray sparseArray) {
        if (c4789a.m19178b().m19247a().isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
            C4797i c4797i = C4797i.f14274a;
            if (c4797i.m19220f(autofillValue)) {
                c4789a.m19178b().m19248b(iKeyAt, c4797i.m19214C(autofillValue).toString());
            } else {
                if (c4797i.m19218d(autofillValue)) {
                    throw new C4710q("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (c4797i.m19219e(autofillValue)) {
                    throw new C4710q("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (c4797i.m19221g(autofillValue)) {
                    throw new C4710q("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m19203b(C4789a c4789a, ViewStructure viewStructure) {
        if (c4789a.m19178b().m19247a().isEmpty()) {
            return;
        }
        C4797i c4797i = C4797i.f14274a;
        int iM19215a = c4797i.m19215a(viewStructure, c4789a.m19178b().m19247a().size());
        Iterator it = c4789a.m19178b().m19247a().entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            AbstractC1960a.m7104a(entry.getValue());
            ViewStructure viewStructureM19222h = c4797i.m19222h(viewStructure, iM19215a);
            c4797i.m19224j(viewStructureM19222h, c4789a.m19179c(), iIntValue);
            c4797i.m19237w(viewStructureM19222h, iIntValue, c4789a.m19180d().getContext().getPackageName(), null, null);
            c4797i.m19225k(viewStructureM19222h, AbstractC4806r.m19252b(InterfaceC4805q.f14280a.m19249a()));
            throw null;
        }
    }
}
