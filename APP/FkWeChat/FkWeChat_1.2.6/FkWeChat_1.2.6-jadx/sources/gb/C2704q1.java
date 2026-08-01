package gb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p200nb.AbstractC5538c;
import p200nb.AbstractC5540e;
import p200nb.AbstractC5561z;
import p244qb.AbstractC6370a;

/* JADX INFO: renamed from: gb.q1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2704q1 extends AbstractC5540e implements Iterable, InterfaceC1400a {

    /* JADX INFO: renamed from: r */
    public static final a f7069r = new a(null);

    /* JADX INFO: renamed from: s */
    public static final C2704q1 f7070s = new C2704q1(AbstractC5114x.m20800o());

    public C2704q1(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2698o1 abstractC2698o1 = (AbstractC2698o1) it.next();
            m22558e(abstractC2698o1.mo9528b(), abstractC2698o1);
        }
    }

    @Override // p200nb.AbstractC5535a
    /* JADX INFO: renamed from: c */
    public AbstractC5561z mo9576c() {
        return f7069r;
    }

    /* JADX INFO: renamed from: q */
    public final C2704q1 m9577q(C2704q1 c2704q1) {
        c2704q1.getClass();
        if (isEmpty() && c2704q1.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f7069r.m22605h().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            AbstractC2698o1 abstractC2698o1 = (AbstractC2698o1) mo22557a().get(iIntValue);
            AbstractC2698o1 abstractC2698o12 = (AbstractC2698o1) c2704q1.mo22557a().get(iIntValue);
            AbstractC6370a.m25339a(arrayList, abstractC2698o1 == null ? abstractC2698o12 != null ? abstractC2698o12.mo9527a(abstractC2698o1) : null : abstractC2698o1.mo9527a(abstractC2698o12));
        }
        return f7069r.m9584j(arrayList);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m9578r(AbstractC2698o1 abstractC2698o1) {
        abstractC2698o1.getClass();
        return mo22557a().get(f7069r.m22603e(abstractC2698o1.mo9528b())) != null;
    }

    /* JADX INFO: renamed from: s */
    public final C2704q1 m9579s(C2704q1 c2704q1) {
        c2704q1.getClass();
        if (isEmpty() && c2704q1.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f7069r.m22605h().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            AbstractC2698o1 abstractC2698o1 = (AbstractC2698o1) mo22557a().get(iIntValue);
            AbstractC2698o1 abstractC2698o12 = (AbstractC2698o1) c2704q1.mo22557a().get(iIntValue);
            AbstractC6370a.m25339a(arrayList, abstractC2698o1 == null ? abstractC2698o12 != null ? abstractC2698o12.mo9529c(abstractC2698o1) : null : abstractC2698o1.mo9529c(abstractC2698o12));
        }
        return f7069r.m9584j(arrayList);
    }

    /* JADX INFO: renamed from: t */
    public final C2704q1 m9580t(AbstractC2698o1 abstractC2698o1) {
        abstractC2698o1.getClass();
        if (m9578r(abstractC2698o1)) {
            return this;
        }
        if (isEmpty()) {
            return new C2704q1(abstractC2698o1);
        }
        return f7069r.m9584j(AbstractC5081g0.m20534F0(AbstractC5081g0.m20554X0(this), abstractC2698o1));
    }

    /* JADX INFO: renamed from: u */
    public final C2704q1 m9581u(AbstractC2698o1 abstractC2698o1) {
        abstractC2698o1.getClass();
        if (!isEmpty()) {
            AbstractC5538c abstractC5538cMo22557a = mo22557a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : abstractC5538cMo22557a) {
                if (!AbstractC1061t.m3842c((AbstractC2698o1) obj, abstractC2698o1)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() != mo22557a().mo22566a()) {
                return f7069r.m9584j(arrayList);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: gb.q1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC5561z {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        @Override // p200nb.AbstractC5561z
        /* JADX INFO: renamed from: c */
        public int mo9583c(ConcurrentHashMap concurrentHashMap, String str, InterfaceC0184l interfaceC0184l) {
            int iIntValue;
            concurrentHashMap.getClass();
            str.getClass();
            interfaceC0184l.getClass();
            Integer num = (Integer) concurrentHashMap.get(str);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = (Integer) concurrentHashMap.get(str);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        Object objMo27m = interfaceC0184l.mo27m(str);
                        concurrentHashMap.putIfAbsent(str, Integer.valueOf(((Number) objMo27m).intValue()));
                        iIntValue = ((Number) objMo27m).intValue();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return iIntValue;
        }

        /* JADX INFO: renamed from: j */
        public final C2704q1 m9584j(List list) {
            list.getClass();
            return list.isEmpty() ? m9585k() : new C2704q1(list, null);
        }

        /* JADX INFO: renamed from: k */
        public final C2704q1 m9585k() {
            return C2704q1.f7070s;
        }

        public a() {
        }
    }

    public /* synthetic */ C2704q1(List list, AbstractC1043k abstractC1043k) {
        this(list);
    }

    public C2704q1(AbstractC2698o1 abstractC2698o1) {
        this(AbstractC5112w.m20789e(abstractC2698o1));
    }
}
