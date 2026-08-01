package androidx.collection;

import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC5176;
import p089.C7766;
import p091.C7787;
import p299.C9213;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C1115 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Object f1308;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f1309;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f1310;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f1311;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f1312;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f1313;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f1314;

    public C1115(C9213 c9213, int i, String str, String str2, Object obj) {
        this.f1313 = 1;
        this.f1308 = null;
        this.f1314 = c9213;
        this.f1312 = i;
        this.f1311 = c9213.m14504(str);
        this.f1310 = c9213.m14504(str2);
        if (obj != null) {
            this.f1309 = c9213.m14508(obj).f23478;
        }
    }

    public String toString() {
        String str;
        switch (this.f1313) {
            case 0:
                synchronized (((C7787) this.f1314)) {
                    try {
                        int i = this.f1310;
                        int i2 = this.f1309 + i;
                        str = "LruCache[maxSize=" + this.f1312 + ",hits=" + this.f1310 + ",misses=" + this.f1309 + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0096, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1391(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        obj2.getClass();
        synchronized (((C7787) this.f1314)) {
            this.f1311++;
            C7766 c7766 = (C7766) this.f1308;
            c7766.getClass();
            objPut = c7766.f18849.put(obj, obj2);
            if (objPut != null) {
                this.f1311--;
            }
        }
        int i = this.f1312;
        while (true) {
            synchronized (((C7787) this.f1314)) {
                try {
                    if (this.f1311 < 0 || (((C7766) this.f1308).f18849.isEmpty() && this.f1311 != 0)) {
                        break;
                    }
                    if (this.f1311 <= i || ((C7766) this.f1308).f18849.isEmpty()) {
                        break;
                    }
                    Set setEntrySet = ((C7766) this.f1308).f18849.entrySet();
                    setEntrySet.getClass();
                    Map.Entry entry = (Map.Entry) AbstractC5176.m9375(setEntrySet);
                    if (entry == null) {
                        return objPut;
                    }
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    C7766 c77662 = (C7766) this.f1308;
                    c77662.getClass();
                    key.getClass();
                    c77662.f18849.remove(key);
                    int i2 = this.f1311;
                    value.getClass();
                    this.f1311 = i2 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object m1392(Object obj) {
        obj.getClass();
        synchronized (((C7787) this.f1314)) {
            C7766 c7766 = (C7766) this.f1308;
            c7766.getClass();
            Object obj2 = c7766.f18849.get(obj);
            if (obj2 != null) {
                this.f1310++;
                return obj2;
            }
            this.f1309++;
            return null;
        }
    }

    public C1115(int i) {
        this.f1313 = 0;
        this.f1312 = i;
        if (i > 0) {
            this.f1308 = new C7766(1);
            this.f1314 = new C7787(9);
        } else {
            C6755.m11869("maxSize <= 0");
            throw null;
        }
    }
}
