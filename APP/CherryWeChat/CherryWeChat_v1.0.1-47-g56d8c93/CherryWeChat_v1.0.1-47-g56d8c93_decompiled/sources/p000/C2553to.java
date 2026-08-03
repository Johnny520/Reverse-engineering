package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: to */
/* JADX INFO: loaded from: classes.dex */
public final class C2553to extends AbstractC2639vo {

    /* JADX INFO: renamed from: c */
    public static final Class f8873c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* JADX INFO: renamed from: d */
    public static List m5040d(int i, long j, Object obj) {
        List list = (List) AbstractC2092jD.f7366c.m2908i(j, obj);
        if (list.isEmpty()) {
            List c0331Hn = list instanceof InterfaceC0374In ? new C0331Hn(i) : ((list instanceof InterfaceC2336ou) && (list instanceof InterfaceC0458Kl)) ? ((InterfaceC0458Kl) list).mo716f(i) : new ArrayList(i);
            AbstractC2092jD.m4276p(j, obj, c0331Hn);
            return c0331Hn;
        }
        if (f8873c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            AbstractC2092jD.m4276p(j, obj, arrayList);
            return arrayList;
        }
        if (list instanceof C1254cD) {
            C0331Hn c0331Hn2 = new C0331Hn(list.size() + i);
            c0331Hn2.addAll((C1254cD) list);
            AbstractC2092jD.m4276p(j, obj, c0331Hn2);
            return c0331Hn2;
        }
        if ((list instanceof InterfaceC2336ou) && (list instanceof InterfaceC0458Kl)) {
            InterfaceC0458Kl interfaceC0458Kl = (InterfaceC0458Kl) list;
            if (!((AbstractC0172E) interfaceC0458Kl).f453a) {
                InterfaceC0458Kl interfaceC0458KlMo716f = interfaceC0458Kl.mo716f(list.size() + i);
                AbstractC2092jD.m4276p(j, obj, interfaceC0458KlMo716f);
                return interfaceC0458KlMo716f;
            }
        }
        return list;
    }

    @Override // p000.AbstractC2639vo
    /* JADX INFO: renamed from: a */
    public final void mo5041a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) AbstractC2092jD.f7366c.m2908i(j, obj);
        if (list instanceof InterfaceC0374In) {
            objUnmodifiableList = ((InterfaceC0374In) list).mo717l();
        } else {
            if (f8873c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC2336ou) && (list instanceof InterfaceC0458Kl)) {
                AbstractC0172E abstractC0172E = (AbstractC0172E) ((InterfaceC0458Kl) list);
                if (abstractC0172E.f453a) {
                    abstractC0172E.f453a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC2092jD.m4276p(j, obj, objUnmodifiableList);
    }

    @Override // p000.AbstractC2639vo
    /* JADX INFO: renamed from: b */
    public final void mo5042b(long j, Object obj, Object obj2) {
        List list = (List) AbstractC2092jD.f7366c.m2908i(j, obj2);
        List listM5040d = m5040d(list.size(), j, obj);
        int size = listM5040d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM5040d.addAll(list);
        }
        if (size > 0) {
            list = listM5040d;
        }
        AbstractC2092jD.m4276p(j, obj, list);
    }

    @Override // p000.AbstractC2639vo
    /* JADX INFO: renamed from: c */
    public final List mo5043c(long j, Object obj) {
        return m5040d(10, j, obj);
    }
}
