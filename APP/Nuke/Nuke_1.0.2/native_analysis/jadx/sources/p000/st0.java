package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class st0 {

    /* JADX INFO: renamed from: a */
    public static final ArrayList f10362a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap.KeySetView f10363b = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f10364c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static boolean m5000a(AbstractC0812vj abstractC0812vj) {
        abstractC0812vj.getClass();
        if (!m5001b(abstractC0812vj)) {
            return false;
        }
        ArrayList arrayList = f10362a;
        if (!arrayList.contains(abstractC0812vj)) {
            ConcurrentHashMap.KeySetView keySetView = f10363b;
            if (keySetView.add(abstractC0812vj)) {
                vb1 vb1Var = new vb1(0);
                LinkedHashMap linkedHashMap = vb1Var.f11892a;
                try {
                    abstractC0812vj.mo319h(vb1Var);
                    vb1Var.m5665b(abstractC0812vj);
                    Set setKeySet = linkedHashMap.keySet();
                    setKeySet.getClass();
                    for (tb1 tb1Var : AbstractC0142du.m1153K0(setKeySet)) {
                        if (!m5000a(tb1Var)) {
                            throw new IllegalStateException(("Listener " + tb1Var.mo9d() + " requested by " + abstractC0812vj.mo9d() + " is not available").toString());
                        }
                    }
                    abstractC0812vj.mo140g();
                    arrayList.add(abstractC0812vj);
                    Set setKeySet2 = linkedHashMap.keySet();
                    setKeySet2.getClass();
                    if (!AbstractC0142du.m1153K0(setKeySet2).isEmpty()) {
                        ConcurrentHashMap concurrentHashMap = f10364c;
                        Set setKeySet3 = linkedHashMap.keySet();
                        setKeySet3.getClass();
                        concurrentHashMap.put(abstractC0812vj, AbstractC0142du.m1153K0(setKeySet3));
                    }
                    return true;
                } finally {
                    try {
                        Collection<ub1> collectionValues = linkedHashMap.values();
                        collectionValues.getClass();
                        for (ub1 ub1Var : collectionValues) {
                            ub1Var.getClass();
                            ub1Var.f11207a.m5154k(abstractC0812vj);
                        }
                        throw th;
                    } finally {
                        keySetView.remove(abstractC0812vj);
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m5001b(AbstractC0812vj abstractC0812vj) {
        boolean zIsEmpty;
        abstractC0812vj.getClass();
        if (!abstractC0812vj.mo5706f() || !abstractC0812vj.f11987c) {
            return false;
        }
        boolean z = abstractC0812vj instanceof tb1;
        if (z) {
            tb1 tb1Var = (tb1) abstractC0812vj;
            synchronized (tb1Var.f10666d) {
                zIsEmpty = tb1Var.f10666d.isEmpty();
            }
            if (zIsEmpty) {
                return false;
            }
        }
        pp1 pp1Var = pp1.f8445a;
        if (pp1.m3933e(abstractC0812vj.mo9d()) && !abstractC0812vj.mo1778b()) {
            return false;
        }
        if (z) {
            return true;
        }
        return pp1.m3931c().m3604a(abstractC0812vj.mo9d(), abstractC0812vj.f11985a);
    }

    /* JADX INFO: renamed from: c */
    public static void m5002c(AbstractC0812vj abstractC0812vj) {
        ConcurrentHashMap concurrentHashMap = f10364c;
        abstractC0812vj.getClass();
        if (abstractC0812vj instanceof tb1) {
            return;
        }
        ArrayList arrayList = f10362a;
        if (arrayList.contains(abstractC0812vj)) {
            try {
                abstractC0812vj.mo320i();
            } finally {
                arrayList.remove(abstractC0812vj);
                Set set = (Set) concurrentHashMap.remove(abstractC0812vj);
                if (set != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((tb1) it.next()).m5154k(abstractC0812vj);
                    }
                }
            }
        }
    }
}
