package com.tendcloud.tenddata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.tendcloud.tenddata.az */
/* JADX INFO: loaded from: classes.dex */
final class C0044az {

    /* JADX INFO: renamed from: a */
    private static int f237a = 2;

    /* JADX INFO: renamed from: b */
    private static int f238b = 6;

    /* JADX INFO: renamed from: c */
    private static int f239c = 6;

    /* JADX INFO: renamed from: d */
    private static int f240d = -40;

    /* JADX INFO: renamed from: e */
    private static int f241e = 4;

    /* JADX INFO: renamed from: f */
    private b f242f;

    /* JADX INFO: renamed from: com.tendcloud.tenddata.az$a */
    public class a {
        private byte band;
        private String bssid;
        private byte channel;
        private byte rssi;
        private String ssid;

        public a() {
            this.ssid = "";
            this.bssid = "00:00:00:00:00:00";
            this.rssi = (byte) -127;
            this.band = (byte) 1;
            this.channel = (byte) 1;
        }

        public a(String str, String str2, byte b, byte b2, byte b3) {
            this.ssid = str;
            this.bssid = str2;
            this.rssi = b;
            this.band = b2;
            this.channel = b3;
        }

        public a cloneBssEntry() {
            return C0044az.this.new a(this.ssid, this.bssid, this.rssi, this.band, this.channel);
        }

        public byte getBand() {
            return this.band;
        }

        public String getBssid() {
            return this.bssid;
        }

        public byte getChannel() {
            return this.channel;
        }

        public byte getRssi() {
            return this.rssi;
        }

        public String getSsid() {
            return this.ssid;
        }

        public void setBand(byte b) {
            this.band = b;
        }

        public void setBssid(String str) {
            this.bssid = str;
        }

        public void setChannel(byte b) {
            this.channel = b;
        }

        public void setRssi(byte b) {
            this.rssi = b;
        }

        public void setSsid(String str) {
            this.ssid = str;
        }
    }

    /* JADX INFO: renamed from: com.tendcloud.tenddata.az$b */
    public static class b {
        public static final int DEFAULT_MAX_BSS_ENTRIES = 50;
        public static final int DEFAULT_MAX_FINGERPRINTS = 10;
        public static final int DEFAULT_MIN_FINGERPRINTS = 3;
        public static final int DEFAULT_RSSI_THRESHOLD = -85;
        private int maxFingerprints = 10;
        private int minFingerprints = 3;
        private int maxBssEntries = 50;
        private int rssiThreshold = -85;

        public int getMaxBssEntries() {
            return this.maxBssEntries;
        }

        public int getMaxFingerprints() {
            return this.maxFingerprints;
        }

        public int getMinFingerprints() {
            return this.minFingerprints;
        }

        public int getRssiThreshold() {
            return this.rssiThreshold;
        }

        public void setMaxBssEntries(int i) {
            this.maxBssEntries = i;
        }

        public void setMaxFingerprints(int i) {
            this.maxFingerprints = i;
        }

        public void setMinFingerprints(int i) {
            this.minFingerprints = i;
        }

        public void setRssiThreshold(int i) {
            this.rssiThreshold = i;
        }
    }

    /* JADX INFO: renamed from: com.tendcloud.tenddata.az$c */
    public class c {
        private List<a> bsslist;
        private Map<String, a> bssmap;
        private long poiId;
        private int timestamp;

        public c() {
        }

        public c cloneFingerprint() {
            c cVar = C0044az.this.new c();
            cVar.setTimestamp(this.timestamp);
            cVar.setPoiId(this.poiId);
            LinkedList linkedList = new LinkedList();
            Iterator<a> it = this.bsslist.iterator();
            while (it.hasNext()) {
                linkedList.add(it.next().cloneBssEntry());
            }
            cVar.setBsslist(linkedList);
            return cVar;
        }

        public List<a> getBsslist() {
            return this.bsslist;
        }

        public Map<String, a> getBssmap(boolean z) {
            if (this.bssmap == null || z) {
                this.bssmap = new HashMap();
                for (a aVar : this.bsslist) {
                    this.bssmap.put(aVar.getBssid(), aVar);
                }
            }
            return this.bssmap;
        }

        public long getPoiId() {
            return this.poiId;
        }

        public int getTimestamp() {
            return this.timestamp;
        }

        public void setBsslist(List<a> list) {
            this.bsslist = list;
        }

        public void setPoiId(long j) {
            this.poiId = j;
        }

        public void setTimestamp(int i) {
            this.timestamp = i;
        }
    }

    /* JADX INFO: renamed from: com.tendcloud.tenddata.az$d */
    public class d {
        public c fp1;
        public c fp2;
        public double score;

        public d(c cVar, c cVar2, double d) {
            this.fp1 = cVar;
            this.fp2 = cVar2;
            this.score = d;
        }
    }

    /* JADX INFO: renamed from: com.tendcloud.tenddata.az$e */
    public class e {
        public Object key;
        public Object value;

        public e(Object obj, Object obj2) {
            this.key = obj;
            this.value = obj2;
        }
    }

    public C0044az() {
        this(new b());
    }

    public C0044az(b bVar) {
        this.f242f = bVar;
    }

    /* JADX INFO: renamed from: a */
    public double m254a(int i, int i2) {
        if (i >= 0 || i2 >= 0) {
            return 0.0d;
        }
        double d2 = (i2 + i) / 2;
        double dAbs = Math.abs(((double) i) - d2);
        int i3 = f237a;
        return Math.pow(((dAbs > ((double) i3) ? dAbs - ((double) i3) : 0.0d) + d2) / d2, f238b);
    }

    /* JADX INFO: renamed from: a */
    public double m255a(c cVar, c cVar2) {
        Map<String, a> bssmap = cVar.getBssmap(false);
        Map<String, a> bssmap2 = cVar2.getBssmap(false);
        HashSet hashSet = new HashSet();
        int i = 0;
        int rssi = 0;
        double d2 = 0.0d;
        double dM254a = 0.0d;
        for (Map.Entry<String, a> entry : bssmap.entrySet()) {
            a value = entry.getValue();
            a aVar = bssmap2.get(entry.getKey());
            rssi += value.getRssi();
            if (aVar == null) {
                hashSet.add(value);
            } else {
                i++;
                double dM259b = m259b(value.getRssi(), aVar.getRssi());
                d2 += dM259b;
                dM254a = (dM259b * m254a(value.getRssi(), aVar.getRssi())) + dM254a;
            }
        }
        if (i == 0) {
            return 0.0d;
        }
        for (Map.Entry<String, a> entry2 : bssmap2.entrySet()) {
            rssi += entry2.getValue().getRssi();
            if (!bssmap.containsKey(entry2.getKey())) {
                hashSet.add(entry2.getValue());
            }
        }
        int iMax = Math.max(this.f242f.getRssiThreshold(), (int) (((double) (rssi / ((cVar2.getBsslist().size() + cVar.getBsslist().size()) - 0))) + 1.2d));
        Iterator it = hashSet.iterator();
        double d3 = 0.0d;
        while (it.hasNext()) {
            if (((a) it.next()).getRssi() > iMax) {
                d3 += 1.0d;
            }
        }
        return (1.0d - Math.pow(d3 / (((double) (i * 2)) + d3), f241e)) * (dM254a / d2);
    }

    /* JADX INFO: renamed from: a */
    public double m256a(c cVar, List<c> list) {
        Iterator<c> it = list.iterator();
        double dMax = 0.0d;
        while (it.hasNext()) {
            dMax = Math.max(m255a(it.next(), cVar), dMax);
        }
        return dMax;
    }

    /* JADX INFO: renamed from: a */
    public double m257a(List<c> list, List<c> list2) {
        double d2 = 0.0d;
        if (list.isEmpty() || list2.isEmpty()) {
            return 0.0d;
        }
        LinkedList linkedList = new LinkedList();
        m261b(list, list2, linkedList);
        int i = 0;
        for (d dVar : linkedList) {
            if (dVar.fp1 != null && dVar.fp2 != null) {
                d2 += dVar.score;
                i++;
            }
        }
        return d2 / ((double) i);
    }

    /* JADX INFO: renamed from: a */
    public double m258a(List<c> list, List<c> list2, List<c> list3) {
        c cVarCloneFingerprint;
        c cVar;
        double d2 = 0.0d;
        if (list.isEmpty() || list2.isEmpty()) {
            list3.addAll(list);
            list3.addAll(list2);
            return 0.0d;
        }
        LinkedList linkedList = new LinkedList();
        m261b(list, list2, linkedList);
        int i = 0;
        for (d dVar : linkedList) {
            c cVar2 = dVar.fp1;
            if (cVar2 != null && (cVar = dVar.fp2) != null) {
                d2 += dVar.score;
                i++;
                cVarCloneFingerprint = m260b(cVar2, cVar);
            } else if (list3.size() < this.f242f.getMinFingerprints()) {
                c cVar3 = dVar.fp1;
                cVarCloneFingerprint = cVar3 == null ? dVar.fp2.cloneFingerprint() : cVar3.cloneFingerprint();
            }
            list3.add(cVarCloneFingerprint);
        }
        return d2 / ((double) i);
    }

    /* JADX INFO: renamed from: b */
    public double m259b(int i, int i2) {
        if (i >= 0 || i2 >= 0) {
            return 0.0d;
        }
        double dMax = Math.max(i, i2);
        int i3 = f240d;
        if (dMax >= i3) {
            return 1.0d;
        }
        return Math.pow((dMax + 128.0d) / ((double) (i3 + 128)), f239c);
    }

    /* JADX INFO: renamed from: b */
    public c m260b(c cVar, c cVar2) {
        Map<String, a> bssmap = cVar.getBssmap(false);
        Map<String, a> bssmap2 = cVar2.getBssmap(false);
        TreeMap treeMap = new TreeMap();
        c cVar3 = new c();
        cVar3.setPoiId(cVar2.getPoiId());
        cVar3.setTimestamp(cVar2.getTimestamp());
        LinkedList linkedList = new LinkedList();
        cVar3.setBsslist(linkedList);
        for (Map.Entry<String, a> entry : bssmap.entrySet()) {
            a value = entry.getValue();
            a aVar = bssmap2.get(entry.getKey());
            if (aVar == null) {
                double d2 = -value.getRssi();
                while (treeMap.containsKey(Double.valueOf(d2))) {
                    d2 += 1.0E-4d;
                }
                treeMap.put(Double.valueOf(d2), value);
            } else {
                linkedList.add(new a(aVar.getSsid(), aVar.getBssid(), (byte) ((aVar.getRssi() + value.getRssi()) / 2), aVar.getBand(), aVar.getChannel()));
            }
        }
        for (Map.Entry<String, a> entry2 : bssmap2.entrySet()) {
            if (!bssmap.containsKey(entry2.getKey())) {
                double d3 = -entry2.getValue().getRssi();
                while (treeMap.containsKey(Double.valueOf(d3))) {
                    d3 += 1.0E-4d;
                }
                treeMap.put(Double.valueOf(d3), entry2.getValue());
            }
        }
        for (Map.Entry entry3 : treeMap.entrySet()) {
            byte b2 = (byte) (-((Double) entry3.getKey()).doubleValue());
            if (linkedList.size() >= this.f242f.getMaxBssEntries() || b2 < this.f242f.getRssiThreshold()) {
                break;
            }
            linkedList.add(entry3.getValue());
        }
        return cVar3;
    }

    /* JADX INFO: renamed from: b */
    public void m261b(List<c> list, List<c> list2, List<d> list3) {
        ArrayList<d> arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (c cVar : list) {
            for (c cVar2 : list2) {
                hashSet2.add(cVar2);
                arrayList.add(new d(cVar, cVar2, m255a(cVar, cVar2)));
            }
            hashSet.add(cVar);
        }
        Collections.sort(arrayList, new Comparator<d>() { // from class: com.tendcloud.tenddata.az.1
            /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
            @Override // java.util.Comparator
            public int compare(d dVar, d dVar2) {
                if (Double.doubleToLongBits(dVar.score) == Double.doubleToLongBits(dVar2.score)) {
                    return 0;
                }
                return Double.doubleToLongBits(dVar.score) < Double.doubleToLongBits(dVar2.score) ? 1 : -1;
            }
        });
        list3.clear();
        for (d dVar : arrayList) {
            if (hashSet.contains(dVar.fp1) && hashSet2.contains(dVar.fp2)) {
                hashSet.remove(dVar.fp1);
                hashSet2.remove(dVar.fp2);
                list3.add(dVar);
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            list3.add(new d((c) it.next(), null, 0.0d));
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            list3.add(new d(null, (c) it2.next(), 0.0d));
        }
    }
}
