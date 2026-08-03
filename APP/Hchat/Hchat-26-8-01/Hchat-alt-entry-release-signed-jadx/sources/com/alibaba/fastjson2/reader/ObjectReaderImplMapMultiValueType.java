package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.util.MapMultiValueType;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.function.Function;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplMapMultiValueType implements ObjectReader {
    final Function builder;
    final Class instanceType;
    final Class mapType;
    final MapMultiValueType multiValueType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplMapMultiValueType(MapMultiValueType mapMultiValueType) {
        this.multiValueType = mapMultiValueType;
        Class cls = mapMultiValueType.mapType;
        this.mapType = cls;
        String name = cls.getName();
        if (cls == Map.class || cls == AbstractMap.class || name.equals("java.util.Collections$SingletonMap")) {
            cls = HashMap.class;
        } else if (name.equals("java.util.Collections$UnmodifiableMap")) {
            cls = LinkedHashMap.class;
        } else if (cls == SortedMap.class) {
            cls = TreeMap.class;
        } else if (cls == ConcurrentMap.class) {
            cls = ConcurrentHashMap.class;
        } else if (cls == ConcurrentNavigableMap.class) {
            cls = ConcurrentSkipListMap.class;
        }
        this.instanceType = cls;
        this.builder = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(long j3) {
        Class cls = this.instanceType;
        if (cls == null || cls.isInterface()) {
            return new HashMap();
        }
        try {
            return this.instanceType.newInstance();
        } catch (Exception e6) {
            C0086a.m465x("create map error", e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:24:0x0070
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r14, java.lang.reflect.Type r15, java.lang.Object r16, long r17) {
        /*
            r13 = this;
            boolean r0 = r14.nextIfObjectStart()
            r1 = 0
            if (r0 != 0) goto L2e
            boolean r0 = r14.nextIfNullOrEmptyString()
            if (r0 == 0) goto Le
            return r1
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "expect '{', but '"
            r0.<init>(r1)
            char r1 = r14.current()
            r0.append(r1)
            java.lang.String r1 = "'"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r14 = r14.info(r0)
            p012ah.C0086a.m464w(r14)
        L2c:
            r14 = 0
            return r14
        L2e:
            com.alibaba.fastjson2.JSONReader$Context r0 = r14.getContext()
            long r2 = r0.features
            long r2 = r2 | r17
            java.lang.Class r4 = r13.instanceType
            java.lang.Class<java.util.HashMap> r5 = java.util.HashMap.class
            if (r4 != r5) goto L59
            java.util.function.Supplier r0 = r0.getObjectSupplier()
            java.lang.Class r4 = r13.mapType
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            if (r4 != r5) goto L53
            if (r0 == 0) goto L53
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Map r4 = com.alibaba.fastjson2.util.TypeUtils.getInnerMap(r0)
            goto L6b
        L53:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            goto L62
        L59:
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r0 = com.alibaba.fastjson2.JSONObject.class
            if (r4 != r0) goto L64
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            r0.<init>()
        L62:
            r4 = r1
            goto L6b
        L64:
            java.lang.Object r0 = r13.createInstance(r2)
            java.util.Map r0 = (java.util.Map) r0
            goto L62
        L6b:
            r5 = r1
        L6c:
            boolean r6 = r14.nextIfObjectEnd()
            if (r6 != 0) goto Lf0
            boolean r6 = r14.isEnd()
            if (r6 == 0) goto L7a
            goto Lf0
        L7a:
            boolean r6 = r14.nextIfNull()
            if (r6 == 0) goto L95
            r6 = 58
            boolean r6 = r14.nextIfMatch(r6)
            if (r6 == 0) goto L8b
            r9 = r5
            r5 = r1
            goto La0
        L8b:
            java.lang.String r0 = "illegal json"
            java.lang.String r14 = r14.info(r0)
            p012ah.C0086a.m464w(r14)
            goto L2c
        L95:
            java.lang.String r5 = r14.readFieldName()
            com.alibaba.fastjson2.util.MapMultiValueType r6 = r13.multiValueType
            java.lang.reflect.Type r6 = r6.getType(r5)
            r9 = r6
        La0:
            if (r9 != 0) goto La7
            java.lang.Object r6 = r14.readAny()
            goto Lb4
        La7:
            com.alibaba.fastjson2.reader.ObjectReader r7 = r14.getObjectReader(r9)
            r11 = 0
            r8 = r14
            r10 = r16
            java.lang.Object r6 = r7.readObject(r8, r9, r10, r11)
        Lb4:
            r7 = 0
            if (r6 != 0) goto Lc2
            com.alibaba.fastjson2.JSONReader$Feature r10 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreNullPropertyValue
            long r10 = r10.mask
            long r10 = r10 & r2
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 == 0) goto Lc2
            goto Led
        Lc2:
            if (r4 == 0) goto Lc9
            java.lang.Object r10 = r4.put(r5, r6)
            goto Lcd
        Lc9:
            java.lang.Object r10 = r0.put(r5, r6)
        Lcd:
            if (r10 == 0) goto Led
            com.alibaba.fastjson2.JSONReader$Feature r11 = com.alibaba.fastjson2.JSONReader.Feature.DuplicateKeyValueAsArray
            long r11 = r11.mask
            long r11 = r11 & r2
            int r7 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r7 == 0) goto Led
            boolean r7 = r10 instanceof java.util.Collection
            if (r7 == 0) goto Le6
            r7 = r10
            java.util.Collection r7 = (java.util.Collection) r7
            r7.add(r6)
            r0.put(r5, r10)
            goto Led
        Le6:
            com.alibaba.fastjson2.JSONArray r6 = com.alibaba.fastjson2.JSONArray.m1634of(r10, r6)
            r0.put(r5, r6)
        Led:
            r5 = r9
            goto L6c
        Lf0:
            r14.nextIfComma()
            java.util.function.Function r14 = r13.builder
            if (r14 == 0) goto Lfc
            java.lang.Object r14 = r14.apply(r0)
            return r14
        Lfc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderImplMapMultiValueType.readObject(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }
}
