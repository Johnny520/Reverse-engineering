package com.tendcloud.tenddata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.tendcloud.tenddata.bb */
/* JADX INFO: loaded from: classes.dex */
public class C0047bb {

    /* JADX INFO: renamed from: a */
    private static int f247a = 2;

    /* JADX INFO: renamed from: b */
    private static int f248b = 6;

    /* JADX INFO: renamed from: c */
    private static int f249c = 6;

    /* JADX INFO: renamed from: d */
    private static int f250d = -40;

    /* JADX INFO: renamed from: e */
    private static int f251e = 4;

    /* JADX INFO: renamed from: f */
    private C0043ay f252f;

    /* JADX INFO: renamed from: com.tendcloud.tenddata.bb$a */
    public class a {
        public C0046ba fp1;
        public C0046ba fp2;
        public double score;

        public a(C0046ba c0046ba, C0046ba c0046ba2, double d) {
            this.fp1 = c0046ba;
            this.fp2 = c0046ba2;
            this.score = d;
        }
    }

    /* JADX INFO: renamed from: com.tendcloud.tenddata.bb$b */
    public class b {
        public Object key;
        public Object value;

        public b(Object obj, Object obj2) {
            this.key = obj;
            this.value = obj2;
        }
    }

    public C0047bb() {
        this(new C0043ay());
    }

    public C0047bb(C0043ay c0043ay) {
        this.f252f = c0043ay;
    }

    /* JADX INFO: renamed from: a */
    public double m267a(int i, int i2) {
        if (i >= 0 || i2 >= 0) {
            return 0.0d;
        }
        double d = (i2 + i) / 2;
        double dAbs = Math.abs(((double) i) - d);
        int i3 = f247a;
        return Math.pow(((dAbs > ((double) i3) ? dAbs - ((double) i3) : 0.0d) + d) / d, f248b);
    }

    /* JADX INFO: renamed from: a */
    public double m268a(C0046ba c0046ba, C0046ba c0046ba2) {
        Map<String, C0042ax> mapM263a = c0046ba.m263a(false);
        Map<String, C0042ax> mapM263a2 = c0046ba2.m263a(false);
        HashSet hashSet = new HashSet();
        int i = 0;
        int iM246c = 0;
        double d = 0.0d;
        double dM267a = 0.0d;
        for (Map.Entry<String, C0042ax> entry : mapM263a.entrySet()) {
            C0042ax value = entry.getValue();
            C0042ax c0042ax = mapM263a2.get(entry.getKey());
            iM246c += value.m246c();
            if (c0042ax == null) {
                hashSet.add(value);
            } else {
                i++;
                double dM272b = m272b(value.m246c(), c0042ax.m246c());
                d += dM272b;
                dM267a += m267a(value.m246c(), c0042ax.m246c()) * dM272b;
            }
        }
        if (i == 0) {
            return 0.0d;
        }
        for (Map.Entry<String, C0042ax> entry2 : mapM263a2.entrySet()) {
            iM246c += entry2.getValue().m246c();
            if (!mapM263a.containsKey(entry2.getKey())) {
                hashSet.add(entry2.getValue());
            }
        }
        int iMax = Math.max(this.f252f.m253d(), (int) (((double) (iM246c / ((c0046ba2.m265c().size() + c0046ba.m265c().size()) - 0))) + 1.2d));
        Iterator it = hashSet.iterator();
        double d2 = 0.0d;
        while (it.hasNext()) {
            if (((C0042ax) it.next()).m246c() > iMax) {
                d2 += 1.0d;
            }
        }
        return (1.0d - Math.pow(d2 / (((double) (i * 2)) + d2), f251e)) * (dM267a / d);
    }

    /* JADX INFO: renamed from: a */
    public double m269a(C0046ba c0046ba, List<C0046ba> list) {
        Iterator<C0046ba> it = list.iterator();
        double dMax = 0.0d;
        while (it.hasNext()) {
            dMax = Math.max(m268a(it.next(), c0046ba), dMax);
        }
        return dMax;
    }

    /* JADX INFO: renamed from: a */
    public double m270a(List<C0046ba> list, List<C0046ba> list2) {
        double d = 0.0d;
        if (list.isEmpty() || list2.isEmpty()) {
            return 0.0d;
        }
        LinkedList linkedList = new LinkedList();
        m274b(list, list2, linkedList);
        int i = 0;
        for (a aVar : linkedList) {
            if (aVar.fp1 != null && aVar.fp2 != null) {
                d += aVar.score;
                i++;
            }
        }
        return d / ((double) i);
    }

    /* JADX INFO: renamed from: a */
    public double m271a(List<C0046ba> list, List<C0046ba> list2, List<C0046ba> list3) {
        C0046ba c0046baM266d;
        C0046ba c0046ba;
        double d = 0.0d;
        if (list.isEmpty() || list2.isEmpty()) {
            list3.addAll(list);
            list3.addAll(list2);
            return 0.0d;
        }
        LinkedList linkedList = new LinkedList();
        m274b(list, list2, linkedList);
        int i = 0;
        for (a aVar : linkedList) {
            C0046ba c0046ba2 = aVar.fp1;
            if (c0046ba2 != null && (c0046ba = aVar.fp2) != null) {
                d += aVar.score;
                i++;
                c0046baM266d = m273b(c0046ba2, c0046ba);
            } else if (list3.size() < this.f252f.m251b()) {
                C0046ba c0046ba3 = aVar.fp1;
                c0046baM266d = c0046ba3 == null ? aVar.fp2.m266d() : c0046ba3.m266d();
            }
            list3.add(c0046baM266d);
        }
        return d / ((double) i);
    }

    /* JADX INFO: renamed from: b */
    public double m272b(int i, int i2) {
        if (i >= 0 || i2 >= 0) {
            return 0.0d;
        }
        double dMax = Math.max(i, i2);
        int i3 = f250d;
        if (dMax >= i3) {
            return 1.0d;
        }
        return Math.pow((dMax + 128.0d) / ((double) (i3 + 128)), f249c);
    }

    /* JADX INFO: renamed from: b */
    public C0046ba m273b(C0046ba c0046ba, C0046ba c0046ba2) {
        Map<String, C0042ax> mapM263a = c0046ba.m263a(false);
        Map<String, C0042ax> mapM263a2 = c0046ba2.m263a(false);
        TreeMap treeMap = new TreeMap();
        C0046ba c0046ba3 = new C0046ba();
        c0046ba3.setPoiId(c0046ba2.m264b());
        c0046ba3.setTimestamp(c0046ba2.m262a());
        LinkedList linkedList = new LinkedList();
        c0046ba3.setBsslist(linkedList);
        for (Map.Entry<String, C0042ax> entry : mapM263a.entrySet()) {
            C0042ax value = entry.getValue();
            C0042ax c0042ax = mapM263a2.get(entry.getKey());
            if (c0042ax == null) {
                double d = -value.m246c();
                while (treeMap.containsKey(Double.valueOf(d))) {
                    d += 1.0E-4d;
                }
                treeMap.put(Double.valueOf(d), value);
            } else {
                linkedList.add(new C0042ax(c0042ax.m244a(), c0042ax.m245b(), (byte) ((value.m246c() + c0042ax.m246c()) / 2), c0042ax.m247d(), c0042ax.m248e()));
            }
        }
        for (Map.Entry<String, C0042ax> entry2 : mapM263a2.entrySet()) {
            if (!mapM263a.containsKey(entry2.getKey())) {
                double d2 = -entry2.getValue().m246c();
                while (treeMap.containsKey(Double.valueOf(d2))) {
                    d2 += 1.0E-4d;
                }
                treeMap.put(Double.valueOf(d2), entry2.getValue());
            }
        }
        for (Map.Entry entry3 : treeMap.entrySet()) {
            byte b2 = (byte) (-((Double) entry3.getKey()).doubleValue());
            if (linkedList.size() >= this.f252f.m252c() || b2 < this.f252f.m253d()) {
                break;
            }
            linkedList.add(entry3.getValue());
        }
        return c0046ba3;
    }

    /* JADX INFO: renamed from: b */
    public void m274b(List<C0046ba> list, List<C0046ba> list2, List<a> list3) {
        ArrayList<a> arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C0046ba c0046ba : list) {
            for (C0046ba c0046ba2 : list2) {
                hashSet2.add(c0046ba2);
                arrayList.add(new a(c0046ba, c0046ba2, m268a(c0046ba, c0046ba2)));
            }
            hashSet.add(c0046ba);
        }
        Collections.sort(arrayList, new Comparator<a>() { // from class: com.tendcloud.tenddata.bb.1
            /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
            @Override // java.util.Comparator
            public int compare(a aVar, a aVar2) {
                double d = aVar.score;
                double d2 = aVar2.score;
                if (d == d2) {
                    return 0;
                }
                return d < d2 ? 1 : -1;
            }
        });
        list3.clear();
        for (a aVar : arrayList) {
            if (hashSet.contains(aVar.fp1) && hashSet2.contains(aVar.fp2)) {
                hashSet.remove(aVar.fp1);
                hashSet2.remove(aVar.fp2);
                list3.add(aVar);
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            list3.add(new a((C0046ba) it.next(), null, 0.0d));
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            list3.add(new a(null, (C0046ba) it2.next(), 0.0d));
        }
    }
}
