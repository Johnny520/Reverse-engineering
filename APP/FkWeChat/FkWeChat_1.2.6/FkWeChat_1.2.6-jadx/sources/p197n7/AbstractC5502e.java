package p197n7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p034c7.InterfaceC1355b;
import p184m7.C5057a;
import p185m8.AbstractC5116y;
import p210o7.AbstractC5653e;
import p281t6.AbstractC8168u;
import p281t6.C8134a;
import p281t6.C8140d;
import p281t6.C8156l;
import p281t6.C8169v;

/* JADX INFO: renamed from: n7.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5502e {
    /* JADX INFO: renamed from: a */
    public static final boolean m22357a(List list, C8140d c8140d) {
        list.getClass();
        if (list.isEmpty() || c8140d == null) {
            return true;
        }
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (c8140d.m31600h(((C5503f) it.next()).m22360b())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final List m22358b(InterfaceC1355b interfaceC1355b) throws C5057a {
        interfaceC1355b.getClass();
        String strM22861f = AbstractC5653e.m22861f(interfaceC1355b.mo5372m(), C8169v.f27347a.m31674c());
        try {
            List<C8156l> listM31663e = AbstractC8168u.m31663e(strM22861f);
            ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listM31663e, 10));
            for (C8156l c8156l : listM31663e) {
                arrayList.add(new C5503f(C8140d.f27220f.m31606b(c8156l.m31636d()), c8156l.m31635c()));
            }
            return arrayList;
        } catch (C8134a e10) {
            throw new C5057a("Illegal Accept header format: " + strM22861f, e10);
        }
    }
}
