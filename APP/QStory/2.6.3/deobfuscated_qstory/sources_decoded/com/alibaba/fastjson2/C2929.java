package com.alibaba.fastjson2;

import androidx.compose.ui.graphics.vector.C1562;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p222.C7990;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2929 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f9276;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f9277;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f9278;

    public C2929() {
        this.f9276 = new C1562(3, false);
        this.f9278 = 15000L;
        this.f9277 = Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public synchronized void m6380(long j) {
        while (this.f9277 > j) {
            Iterator it = ((LinkedHashMap) this.f9276).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C7990 c7990 = (C7990) entry.getValue();
            this.f9277 -= (long) c7990.f22072;
            Object key = entry.getKey();
            it.remove();
            mo6382(key, c7990.f22073);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public synchronized Object m6381(Object obj, Object obj2) {
        int iMo6383 = mo6383(obj2);
        long j = iMo6383;
        if (j >= this.f9278) {
            mo6382(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f9277 += j;
        }
        C7990 c7990 = (C7990) ((LinkedHashMap) this.f9276).put(obj, obj2 == null ? null : new C7990(obj2, iMo6383));
        if (c7990 != null) {
            this.f9277 -= (long) c7990.f22072;
            if (!c7990.f22073.equals(obj2)) {
                mo6382(obj, c7990.f22073);
            }
        }
        m6380(this.f9278);
        return c7990 != null ? c7990.f22073 : null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int mo6383(Object obj) {
        return 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public synchronized Object m6384(Object obj) {
        C7990 c7990;
        c7990 = (C7990) ((LinkedHashMap) this.f9276).get(obj);
        return c7990 != null ? c7990.f22073 : null;
    }

    public C2929(long j) {
        this.f9276 = new LinkedHashMap(100, 0.75f, true);
        this.f9278 = j;
    }

    public C2929(String str, long j, long j2) {
        this.f9276 = str;
        this.f9278 = j;
        this.f9277 = j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo6382(Object obj, Object obj2) {
    }
}
