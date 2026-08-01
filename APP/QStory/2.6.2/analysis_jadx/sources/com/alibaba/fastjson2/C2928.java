package com.alibaba.fastjson2;

import androidx.compose.ui.graphics.vector.C1562;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p222.C7989;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2928 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f9274;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f9275;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f9276;

    public C2928() {
        this.f9274 = new C1562(3, false);
        this.f9276 = 15000L;
        this.f9275 = Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public synchronized void m6322(long j) {
        while (this.f9275 > j) {
            Iterator it = ((LinkedHashMap) this.f9274).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C7989 c7989 = (C7989) entry.getValue();
            this.f9275 -= (long) c7989.f22075;
            Object key = entry.getKey();
            it.remove();
            mo6324(key, c7989.f22076);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public synchronized Object m6323(Object obj, Object obj2) {
        int iMo6325 = mo6325(obj2);
        long j = iMo6325;
        if (j >= this.f9276) {
            mo6324(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f9275 += j;
        }
        C7989 c7989 = (C7989) ((LinkedHashMap) this.f9274).put(obj, obj2 == null ? null : new C7989(obj2, iMo6325));
        if (c7989 != null) {
            this.f9275 -= (long) c7989.f22075;
            if (!c7989.f22076.equals(obj2)) {
                mo6324(obj, c7989.f22076);
            }
        }
        m6322(this.f9276);
        return c7989 != null ? c7989.f22076 : null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int mo6325(Object obj) {
        return 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public synchronized Object m6326(Object obj) {
        C7989 c7989;
        c7989 = (C7989) ((LinkedHashMap) this.f9274).get(obj);
        return c7989 != null ? c7989.f22076 : null;
    }

    public C2928(long j) {
        this.f9274 = new LinkedHashMap(100, 0.75f, true);
        this.f9276 = j;
    }

    public C2928(long j, long j2, String str) {
        this.f9274 = str;
        this.f9276 = j;
        this.f9275 = j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo6324(Object obj, Object obj2) {
    }
}
