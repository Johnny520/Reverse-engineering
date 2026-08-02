package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class st0 {
    public static final ArrayList a = new ArrayList();
    public static final ConcurrentHashMap.KeySetView b = ConcurrentHashMap.newKeySet();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static boolean a(vj vjVar) {
        vjVar.getClass();
        if (!b(vjVar)) {
            return false;
        }
        ArrayList arrayList = a;
        if (!arrayList.contains(vjVar)) {
            ConcurrentHashMap.KeySetView keySetView = b;
            if (keySetView.add(vjVar)) {
                vb1 vb1Var = new vb1(0);
                LinkedHashMap linkedHashMap = vb1Var.a;
                try {
                    vjVar.h(vb1Var);
                    vb1Var.b(vjVar);
                    Set setKeySet = linkedHashMap.keySet();
                    setKeySet.getClass();
                    for (tb1 tb1Var : du.K0(setKeySet)) {
                        if (!a(tb1Var)) {
                            throw new IllegalStateException(("Listener " + tb1Var.d() + " requested by " + vjVar.d() + " is not available").toString());
                        }
                    }
                    vjVar.g();
                    arrayList.add(vjVar);
                    Set setKeySet2 = linkedHashMap.keySet();
                    setKeySet2.getClass();
                    if (!du.K0(setKeySet2).isEmpty()) {
                        ConcurrentHashMap concurrentHashMap = c;
                        Set setKeySet3 = linkedHashMap.keySet();
                        setKeySet3.getClass();
                        concurrentHashMap.put(vjVar, du.K0(setKeySet3));
                    }
                    return true;
                } finally {
                    try {
                        Collection<ub1> collectionValues = linkedHashMap.values();
                        collectionValues.getClass();
                        for (ub1 ub1Var : collectionValues) {
                            ub1Var.getClass();
                            ub1Var.a.k(vjVar);
                        }
                        throw th;
                    } finally {
                        keySetView.remove(vjVar);
                    }
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean b(vj vjVar) {
        boolean zIsEmpty;
        vjVar.getClass();
        if (!vjVar.f() || !vjVar.c) {
            return false;
        }
        boolean z = vjVar instanceof tb1;
        if (z) {
            tb1 tb1Var = (tb1) vjVar;
            synchronized (tb1Var.d) {
                zIsEmpty = tb1Var.d.isEmpty();
            }
            if (zIsEmpty) {
                return false;
            }
        }
        pp1 pp1Var = pp1.a;
        if (pp1.e(vjVar.d()) && !vjVar.b()) {
            return false;
        }
        if (z) {
            return true;
        }
        return pp1.c().a(vjVar.d(), vjVar.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(vj vjVar) {
        ConcurrentHashMap concurrentHashMap = c;
        vjVar.getClass();
        if (vjVar instanceof tb1) {
            return;
        }
        ArrayList arrayList = a;
        if (arrayList.contains(vjVar)) {
            try {
                vjVar.i();
            } finally {
                arrayList.remove(vjVar);
                Set set = (Set) concurrentHashMap.remove(vjVar);
                if (set != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((tb1) it.next()).k(vjVar);
                    }
                }
            }
        }
    }
}
