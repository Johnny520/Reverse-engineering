package p031Q0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Q0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0316p {

    /* JADX INFO: renamed from: a */
    public final ArrayList f597a;

    public C0316p(int i2) {
        this.f597a = new ArrayList(i2);
    }

    /* JADX INFO: renamed from: a */
    public void m709a(Object obj) {
        this.f597a.add(obj);
    }

    /* JADX INFO: renamed from: b */
    public void m710b(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z2 = obj instanceof Object[];
        ArrayList arrayList = this.f597a;
        if (z2) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public List m711c() {
        ArrayList arrayList;
        if (this.f597a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f597a) {
            arrayList = new ArrayList(this.f597a);
        }
        return arrayList;
    }

    public C0316p() {
        this.f597a = new ArrayList();
        new HashMap();
        new HashMap();
    }
}
