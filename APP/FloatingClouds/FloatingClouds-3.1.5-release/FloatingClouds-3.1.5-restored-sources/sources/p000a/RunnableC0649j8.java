package p000a;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: a.j8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0649j8 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2401a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0706m8 f2402b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2403c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Set f2404d;

    public /* synthetic */ RunnableC0649j8(C0706m8 c0706m8, Object obj, Set set, int i) {
        this.f2401a = i;
        this.f2402b = c0706m8;
        this.f2403c = obj;
        this.f2404d = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Method methodM1606g;
        Set<String> set = this.f2404d;
        Object obj = this.f2403c;
        C0706m8 c0706m8 = this.f2402b;
        switch (this.f2401a) {
            case 0:
                try {
                    c0706m8.getClass();
                    List listM1607h = C0706m8.m1607h(obj);
                    if (listM1607h != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listM1607h) {
                            if (!c0706m8.m1622v(obj2, set)) {
                                arrayList.add(obj2);
                            }
                        }
                        if (arrayList.size() != listM1607h.size()) {
                            C0706m8.m1615t(obj, arrayList);
                            C0706m8.m1613p(obj);
                        }
                    }
                    C0413Wf c0413Wf = C0413Wf.f1577a;
                } catch (Throwable th) {
                    C0920xd.m2206a(th);
                }
                break;
            default:
                try {
                    c0706m8.getClass();
                    Object objM1608i = C0706m8.m1608i(obj, "d");
                    List<?> list = C0198Kf.m549b(objM1608i) ? (List) objM1608i : null;
                    if (list != null) {
                        int iM1605e = C0706m8.m1605e(list);
                        c0706m8.m1617f(list, set);
                        if (iM1605e != C0706m8.m1605e(list) && obj != null && (methodM1606g = C0706m8.m1606g(obj)) != null) {
                            try {
                                methodM1606g.setAccessible(true);
                                methodM1606g.invoke(obj, null);
                                break;
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    C0413Wf c0413Wf2 = C0413Wf.f1577a;
                } catch (Throwable th2) {
                    C0920xd.m2206a(th2);
                    return;
                }
                break;
        }
    }
}
