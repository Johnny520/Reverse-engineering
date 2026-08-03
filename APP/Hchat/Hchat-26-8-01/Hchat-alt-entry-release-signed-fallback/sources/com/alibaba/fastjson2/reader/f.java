package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements java.util.function.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1846a;

    public /* synthetic */ f(int r1) {
            r0 = this;
            r0.f1846a = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f1846a
            switch(r0) {
                case 0: goto Lc5;
                case 1: goto Lbe;
                case 2: goto Lb7;
                case 3: goto Lb0;
                case 4: goto La9;
                case 5: goto La2;
                case 6: goto L9b;
                case 7: goto L94;
                case 8: goto L8d;
                case 9: goto L88;
                case 10: goto L83;
                case 11: goto L7e;
                case 12: goto L79;
                case 13: goto L74;
                case 14: goto L6f;
                case 15: goto L68;
                case 16: goto L61;
                case 17: goto L5a;
                case 18: goto L53;
                case 19: goto L4c;
                case 20: goto L45;
                case 21: goto L3e;
                case 22: goto L39;
                case 23: goto L32;
                case 24: goto L2b;
                case 25: goto L24;
                case 26: goto L1c;
                case 27: goto L14;
                case 28: goto Ld;
                default: goto L5;
            }
        L5:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r2 = (java.lang.String) r2
            r0.<init>(r2)
            return r0
        Ld:
            java.lang.String r2 = (java.lang.String) r2
            java.net.InetAddress r2 = com.alibaba.fastjson2.reader.ObjectReaderProvider.p(r2)
            return r2
        L14:
            java.util.concurrent.atomic.AtomicLongArray r0 = new java.util.concurrent.atomic.AtomicLongArray
            long[] r2 = (long[]) r2
            r0.<init>(r2)
            return r0
        L1c:
            java.util.concurrent.atomic.AtomicIntegerArray r0 = new java.util.concurrent.atomic.AtomicIntegerArray
            int[] r2 = (int[]) r2
            r0.<init>(r2)
            return r0
        L24:
            java.lang.String r2 = (java.lang.String) r2
            java.util.TimeZone r2 = com.alibaba.fastjson2.reader.ObjectReaderProvider.s(r2)
            return r2
        L2b:
            java.lang.String r2 = (java.lang.String) r2
            java.time.ZoneId r2 = com.alibaba.fastjson2.reader.ObjectReaderProvider.h(r2)
            return r2
        L32:
            java.lang.String r2 = (java.lang.String) r2
            java.time.Duration r2 = java.time.Duration.parse(r2)
            return r2
        L39:
            java.lang.Object r2 = com.alibaba.fastjson2.reader.ObjectReaderImplMap.a(r2)
            return r2
        L3e:
            java.util.Map r2 = (java.util.Map) r2
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            return r2
        L45:
            java.util.SortedMap r2 = (java.util.SortedMap) r2
            java.util.SortedMap r2 = java.util.Collections.synchronizedSortedMap(r2)
            return r2
        L4c:
            java.util.Map r2 = (java.util.Map) r2
            java.util.Map r2 = java.util.Collections.synchronizedMap(r2)
            return r2
        L53:
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Collection r2 = com.alibaba.fastjson2.reader.ObjectReaderImplListStr.b(r2)
            return r2
        L5a:
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Collection r2 = com.alibaba.fastjson2.reader.ObjectReaderImplListStr.a(r2)
            return r2
        L61:
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Collection r2 = java.util.Collections.synchronizedCollection(r2)
            return r2
        L68:
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = java.util.Collections.synchronizedList(r2)
            return r2
        L6f:
            java.lang.Object r2 = com.alibaba.fastjson2.reader.ObjectReaderImplList.h(r2)
            return r2
        L74:
            java.lang.Object r2 = com.alibaba.fastjson2.reader.ObjectReaderImplList.j(r2)
            return r2
        L79:
            java.lang.Object r2 = com.alibaba.fastjson2.reader.ObjectReaderImplList.k(r2)
            return r2
        L7e:
            java.lang.Object r2 = com.alibaba.fastjson2.reader.ObjectReaderImplList.c(r2)
            return r2
        L83:
            java.lang.Object r2 = com.alibaba.fastjson2.reader.ObjectReaderImplList.e(r2)
            return r2
        L88:
            java.lang.Object r2 = com.alibaba.fastjson2.reader.ObjectReaderImplList.b(r2)
            return r2
        L8d:
            java.util.SortedSet r2 = (java.util.SortedSet) r2
            java.util.SortedSet r2 = java.util.Collections.synchronizedSortedSet(r2)
            return r2
        L94:
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = com.alibaba.fastjson2.reader.ObjectReaderImplList.g(r2)
            return r2
        L9b:
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Collection r2 = com.alibaba.fastjson2.reader.ObjectReaderImplList.i(r2)
            return r2
        La2:
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = com.alibaba.fastjson2.reader.ObjectReaderImplList.l(r2)
            return r2
        La9:
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Collection r2 = com.alibaba.fastjson2.reader.ObjectReaderImplList.f(r2)
            return r2
        Lb0:
            java.util.Set r2 = (java.util.Set) r2
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r2)
            return r2
        Lb7:
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            return r2
        Lbe:
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Collection r2 = java.util.Collections.unmodifiableCollection(r2)
            return r2
        Lc5:
            java.util.Set r2 = (java.util.Set) r2
            java.util.Set r2 = java.util.Collections.synchronizedSet(r2)
            return r2
    }
}
