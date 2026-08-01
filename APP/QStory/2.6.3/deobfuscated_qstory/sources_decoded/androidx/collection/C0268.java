package androidx.collection;

import p073.C6937;
import p075.C6958;
import p283.C8384;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C0268 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Object f963;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f964;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f965;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f966;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f967;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f968;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f969;

    public C0268(C8384 c8384, int i, String str, String str2, Object obj) {
        this.f968 = 1;
        this.f963 = null;
        this.f969 = c8384;
        this.f967 = i;
        this.f966 = c8384.m13945(str);
        this.f965 = c8384.m13945(str2);
        if (obj != null) {
            this.f964 = c8384.m13949(obj).f23133;
        }
    }

    public String toString() {
        String str;
        switch (this.f968) {
            case 0:
                synchronized (((C6958) this.f969)) {
                    try {
                        int i = this.f965;
                        int i2 = this.f964 + i;
                        str = "LruCache[maxSize=" + this.f967 + ",hits=" + this.f965 + ",misses=" + this.f964 + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
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
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m831(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            r5.getClass()
            r6.getClass()
            java.lang.Object r0 = r4.f969
            飘花落叶言世楪哲苏子兰.飘花落叶言子楪苏世兰哲 r0 = (p075.C6958) r0
            monitor-enter(r0)
            int r1 = r4.f966     // Catch: java.lang.Throwable -> L27
            int r1 = r1 + 1
            r4.f966 = r1     // Catch: java.lang.Throwable -> L27
            java.lang.Object r1 = r4.f963     // Catch: java.lang.Throwable -> L27
            飘花落叶言世楪哲子苏兰.飘花落叶言子楪哲苏世兰 r1 = (p073.C6937) r1     // Catch: java.lang.Throwable -> L27
            r1.getClass()     // Catch: java.lang.Throwable -> L27
            java.util.LinkedHashMap r1 = r1.f18504     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = r1.put(r5, r6)     // Catch: java.lang.Throwable -> L27
            if (r5 == 0) goto L2a
            int r6 = r4.f966     // Catch: java.lang.Throwable -> L27
            int r6 = r6 + (-1)
            r4.f966 = r6     // Catch: java.lang.Throwable -> L27
            goto L2a
        L27:
            r4 = move-exception
            goto La1
        L2a:
            monitor-exit(r0)
            int r6 = r4.f967
        L2d:
            java.lang.Object r0 = r4.f969
            飘花落叶言世楪哲苏子兰.飘花落叶言子楪苏世兰哲 r0 = (p075.C6958) r0
            monitor-enter(r0)
            int r1 = r4.f966     // Catch: java.lang.Throwable -> L47
            if (r1 < 0) goto L97
            java.lang.Object r1 = r4.f963     // Catch: java.lang.Throwable -> L47
            飘花落叶言世楪哲子苏兰.飘花落叶言子楪哲苏世兰 r1 = (p073.C6937) r1     // Catch: java.lang.Throwable -> L47
            java.util.LinkedHashMap r1 = r1.f18504     // Catch: java.lang.Throwable -> L47
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L49
            int r1 = r4.f966     // Catch: java.lang.Throwable -> L47
            if (r1 != 0) goto L97
            goto L49
        L47:
            r4 = move-exception
            goto L9f
        L49:
            int r1 = r4.f966     // Catch: java.lang.Throwable -> L47
            if (r1 <= r6) goto L95
            java.lang.Object r1 = r4.f963     // Catch: java.lang.Throwable -> L47
            飘花落叶言世楪哲子苏兰.飘花落叶言子楪哲苏世兰 r1 = (p073.C6937) r1     // Catch: java.lang.Throwable -> L47
            java.util.LinkedHashMap r1 = r1.f18504     // Catch: java.lang.Throwable -> L47
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L5a
            goto L95
        L5a:
            java.lang.Object r1 = r4.f963     // Catch: java.lang.Throwable -> L47
            飘花落叶言世楪哲子苏兰.飘花落叶言子楪哲苏世兰 r1 = (p073.C6937) r1     // Catch: java.lang.Throwable -> L47
            java.util.LinkedHashMap r1 = r1.f18504     // Catch: java.lang.Throwable -> L47
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L47
            r1.getClass()     // Catch: java.lang.Throwable -> L47
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L47
            java.lang.Object r1 = kotlin.collections.AbstractC4344.m8816(r1)     // Catch: java.lang.Throwable -> L47
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L47
            if (r1 != 0) goto L73
            monitor-exit(r0)
            return r5
        L73:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r3 = r4.f963     // Catch: java.lang.Throwable -> L47
            飘花落叶言世楪哲子苏兰.飘花落叶言子楪哲苏世兰 r3 = (p073.C6937) r3     // Catch: java.lang.Throwable -> L47
            r3.getClass()     // Catch: java.lang.Throwable -> L47
            r2.getClass()     // Catch: java.lang.Throwable -> L47
            java.util.LinkedHashMap r3 = r3.f18504     // Catch: java.lang.Throwable -> L47
            r3.remove(r2)     // Catch: java.lang.Throwable -> L47
            int r2 = r4.f966     // Catch: java.lang.Throwable -> L47
            r1.getClass()     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + (-1)
            r4.f966 = r2     // Catch: java.lang.Throwable -> L47
            monitor-exit(r0)
            goto L2d
        L95:
            monitor-exit(r0)
            return r5
        L97:
            java.lang.String r4 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L47
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L47
            throw r5     // Catch: java.lang.Throwable -> L47
        L9f:
            monitor-exit(r0)
            throw r4
        La1:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C0268.m831(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object m832(Object obj) {
        obj.getClass();
        synchronized (((C6958) this.f969)) {
            C6937 c6937 = (C6937) this.f963;
            c6937.getClass();
            Object obj2 = c6937.f18504.get(obj);
            if (obj2 != null) {
                this.f965++;
                return obj2;
            }
            this.f964++;
            return null;
        }
    }

    public C0268(int i) {
        this.f968 = 0;
        this.f967 = i;
        if (i > 0) {
            this.f963 = new C6937(1);
            this.f969 = new C6958(9);
        } else {
            C5925.m11310("maxSize <= 0");
            throw null;
        }
    }
}
