package com.alibaba.fastjson2;

import androidx.compose.p001ui.graphics.vector.C2397;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p238.C8819;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3762 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f9621;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f9622;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f9623;

    public C3762() {
        this.f9621 = new C2397(3, false);
        this.f9623 = 15000L;
        this.f9622 = Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public synchronized void m6940(long j) {
        while (this.f9622 > j) {
            Iterator it = ((LinkedHashMap) this.f9621).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C8819 c8819 = (C8819) entry.getValue();
            this.f9622 -= (long) c8819.f22417;
            Object key = entry.getKey();
            it.remove();
            mo6942(key, c8819.f22418);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public synchronized Object m6941(Object obj, Object obj2) {
        int iMo6943 = mo6943(obj2);
        long j = iMo6943;
        if (j >= this.f9623) {
            mo6942(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f9622 += j;
        }
        C8819 c8819 = (C8819) ((LinkedHashMap) this.f9621).put(obj, obj2 == null ? null : new C8819(obj2, iMo6943));
        if (c8819 != null) {
            this.f9622 -= (long) c8819.f22417;
            if (!c8819.f22418.equals(obj2)) {
                mo6942(obj, c8819.f22418);
            }
        }
        m6940(this.f9623);
        return c8819 != null ? c8819.f22418 : null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int mo6943(Object obj) {
        return 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public synchronized Object m6944(Object obj) {
        C8819 c8819;
        c8819 = (C8819) ((LinkedHashMap) this.f9621).get(obj);
        return c8819 != null ? c8819.f22418 : null;
    }

    public C3762(long j) {
        this.f9621 = new LinkedHashMap(100, 0.75f, true);
        this.f9623 = j;
    }

    public C3762(String str, long j, long j2) {
        this.f9621 = str;
        this.f9623 = j;
        this.f9622 = j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo6942(Object obj, Object obj2) {
    }
}
