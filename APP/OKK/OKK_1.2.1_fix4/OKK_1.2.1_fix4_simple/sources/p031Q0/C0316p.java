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

    public C0316p(int r2) {
        this.f597a = new ArrayList(r2);
    }

    /* JADX INFO: renamed from: a */
    public void m709a(Object r2) {
        this.f597a.add(r2);
    }

    /* JADX INFO: renamed from: b */
    public void m710b(Object r4) {
        if (r4 != null) goto L4;
        return;
    L4:
        boolean r02 = r4 instanceof Object[];
        ArrayList r1 = this.f597a;
        if (r02 == false) goto L10;
        Object[] r42 = (Object[]) r4;
        if (r42.length <= 0) goto L24;
        r1.ensureCapacity(r1.size() + r42.length);
        Collections.addAll(r1, r42);
        return;
    L24:
        return;
    L10:
        if ((r4 instanceof Collection) == false) goto L13;
        r1.addAll((Collection) r4);
        return;
    L13:
        if ((r4 instanceof Iterable) == false) goto L19;
        Iterator r43 = ((Iterable) r4).iterator();
    L16:
        if (r43.hasNext() == false) goto L31;
        r1.add(r43.next());
        goto L16
    L31:
        return;
    L19:
        if ((r4 instanceof Iterator) == false) goto L26;
        Iterator r44 = (Iterator) r4;
    L22:
        if (r44.hasNext() == false) goto L32;
        r1.add(r44.next());
        goto L22
    L32:
        return;
    L26:
        throw new UnsupportedOperationException("Don't know how to spread " + r4.getClass());
    }

    /* JADX INFO: renamed from: c */
    public List m711c() {
        if (this.f597a.isEmpty() == true) goto L5;
        ArrayList r02 = this.f597a;
        monitor-enter(r02);
        ArrayList r1 = new ArrayList(this.f597a);     // Catch: Throwable -> L11
        monitor-exit(r02);     // Catch: Throwable -> L11
        return r1;
    L11:
        th = move-exception;
        throw th;
    L5:
        return Collections.emptyList();
    }

    public C0316p() {
        this.f597a = new ArrayList();
        new HashMap();
        new HashMap();
    }
}
