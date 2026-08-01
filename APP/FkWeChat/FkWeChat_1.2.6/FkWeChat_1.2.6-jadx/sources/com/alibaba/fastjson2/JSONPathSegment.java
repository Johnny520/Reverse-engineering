package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderBean;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.FieldWriter;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterAdapter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import okhttp3.internal.url._UrlKt;
import p319w2.C9079i0;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
abstract class JSONPathSegment {

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class AllSegment extends JSONPathSegment {
        static final AllSegment INSTANCE = new AllSegment(false);
        static final AllSegment INSTANCE_ARRAY = new AllSegment(true);
        final boolean array;

        public AllSegment(boolean z10) {
            this.array = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:69:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x00e5  */
        @Override // com.alibaba.fastjson2.JSONPathSegment
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void accept(com.alibaba.fastjson2.JSONReader r9, com.alibaba.fastjson2.JSONPath.Context r10) {
            /*
                Method dump skipped, instruction units count: 340
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONPathSegment.AllSegment.accept(com.alibaba.fastjson2.JSONReader, com.alibaba.fastjson2.JSONPath$Context):void");
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (obj == null) {
                context.value = null;
                context.eval = true;
                return;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                JSONArray jSONArray = new JSONArray(map.size());
                for (Object obj2 : map.values()) {
                    if (this.array && (obj2 instanceof Collection)) {
                        jSONArray.addAll((Collection) obj2);
                    } else {
                        jSONArray.add(obj2);
                    }
                }
                if (context.next != null) {
                    context.value = new JSONPath.Sequence(jSONArray);
                } else {
                    context.value = jSONArray;
                }
                context.eval = true;
                return;
            }
            int i10 = 0;
            if (obj instanceof List) {
                List list = (List) obj;
                JSONArray jSONArray2 = new JSONArray(list.size());
                JSONPathSegment jSONPathSegment = context.next;
                if (jSONPathSegment != null || this.array) {
                    if (jSONPathSegment != null) {
                        context.value = new JSONPath.Sequence(list);
                    } else {
                        context.value = obj;
                    }
                    context.eval = true;
                    return;
                }
                while (i10 < list.size()) {
                    Object obj3 = list.get(i10);
                    if (obj3 instanceof Map) {
                        jSONArray2.addAll(((Map) obj3).values());
                    } else {
                        jSONArray2.add(obj3);
                    }
                    i10++;
                }
                context.value = jSONArray2;
                context.eval = true;
                return;
            }
            if (obj instanceof Collection) {
                context.value = obj;
                context.eval = true;
                return;
            }
            if (!(obj instanceof JSONPath.Sequence)) {
                List<FieldWriter> fieldWriters = context.path.getWriterContext().provider.getObjectWriter((Class) obj.getClass()).getFieldWriters();
                int size = fieldWriters.size();
                JSONArray jSONArray3 = new JSONArray(size);
                while (i10 < size) {
                    jSONArray3.add(fieldWriters.get(i10).getFieldValue(obj));
                    i10++;
                }
                context.value = jSONArray3;
                context.eval = true;
                return;
            }
            List list2 = ((JSONPath.Sequence) obj).values;
            JSONArray jSONArray4 = new JSONArray(list2.size());
            if (context.next != null) {
                context.value = new JSONPath.Sequence(list2);
                context.eval = true;
                return;
            }
            while (i10 < list2.size()) {
                Object obj4 = list2.get(i10);
                if ((obj4 instanceof Map) && !this.array) {
                    jSONArray4.addAll(((Map) obj4).values());
                } else if (obj4 instanceof Collection) {
                    jSONArray4.addAll((Collection) obj4);
                } else {
                    jSONArray4.add(obj4);
                }
                i10++;
            }
            context.value = jSONArray4;
            context.eval = true;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public boolean remove(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (obj instanceof Map) {
                ((Map) obj).clear();
                return true;
            }
            if (obj instanceof Collection) {
                ((Collection) obj).clear();
                return true;
            }
            C1607k.m6296a("UnsupportedOperation ", AllSegment.class);
            return false;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void set(JSONPath.Context context, Object obj) {
            JSONPath.Context context2 = context.parent;
            Object obj2 = context2 == null ? context.root : context2.value;
            if (obj2 instanceof Map) {
                Iterator it = ((Map) obj2).entrySet().iterator();
                while (it.hasNext()) {
                    ((Map.Entry) it.next()).setValue(obj);
                }
            } else {
                if (obj2 instanceof List) {
                    Collections.fill((List) obj2, obj);
                    return;
                }
                if (obj2 == null || !obj2.getClass().isArray()) {
                    C1607k.m6296a("UnsupportedOperation ", AllSegment.class);
                    return;
                }
                int length = Array.getLength(obj2);
                for (int i10 = 0; i10 < length; i10++) {
                    Array.set(obj2, i10, obj);
                }
            }
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void setCallback(JSONPath.Context context, BiFunction biFunction) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object value = entry.getValue();
                    Object objApply = biFunction.apply(obj, value);
                    if (objApply != value) {
                        entry.setValue(objApply);
                    }
                }
                return;
            }
            int i10 = 0;
            if (obj instanceof List) {
                List list = (List) obj;
                while (i10 < list.size()) {
                    Object obj2 = list.get(i10);
                    Object objApply2 = biFunction.apply(obj, obj2);
                    if (objApply2 != obj2) {
                        list.set(i10, objApply2);
                    }
                    i10++;
                }
                return;
            }
            if (obj == null || !obj.getClass().isArray()) {
                C1607k.m6296a("UnsupportedOperation ", AllSegment.class);
                return;
            }
            int length = Array.getLength(obj);
            while (i10 < length) {
                Object obj3 = Array.get(obj, i10);
                Object objApply3 = biFunction.apply(obj, obj3);
                if (objApply3 != obj3) {
                    Array.set(obj, i10, objApply3);
                }
                i10++;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class EntrySetSegment extends JSONPathSegment implements EvalSegment {
        static final EntrySetSegment INSTANCE = new EntrySetSegment();

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            if (!jSONReader.isObject()) {
                C1569c.m6258a("TODO");
                return;
            }
            jSONReader.next();
            JSONArray jSONArray = new JSONArray();
            while (!jSONReader.nextIfObjectEnd()) {
                jSONArray.add(JSONObject.m6195of("key", (Object) jSONReader.readFieldName(), "value", jSONReader.readAny()));
            }
            context.value = jSONArray;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (!(obj instanceof Map)) {
                C1569c.m6258a("TODO");
                return;
            }
            Map map = (Map) obj;
            JSONArray jSONArray = new JSONArray(map.size());
            for (Map.Entry entry : map.entrySet()) {
                jSONArray.add(JSONObject.m6195of("key", entry.getKey(), "value", entry.getValue()));
            }
            context.value = jSONArray;
            context.eval = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface EvalSegment {
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class KeysSegment extends JSONPathSegment implements EvalSegment {
        static final KeysSegment INSTANCE = new KeysSegment();

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            if (!jSONReader.isObject()) {
                C1569c.m6258a("TODO");
                return;
            }
            jSONReader.next();
            JSONArray jSONArray = new JSONArray();
            while (!jSONReader.nextIfObjectEnd()) {
                jSONArray.add(jSONReader.readFieldName());
                jSONReader.skipValue();
            }
            context.value = jSONArray;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (!(obj instanceof Map)) {
                C1569c.m6258a("TODO");
            } else {
                context.value = new JSONArray(((Map) obj).keySet());
                context.eval = true;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class LengthSegment extends JSONPathSegment implements EvalSegment {
        static final LengthSegment INSTANCE = new LengthSegment();

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            if (context.parent == null) {
                context.root = jSONReader.readAny();
                context.eval = true;
            }
            eval(context);
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (obj == null) {
                return;
            }
            context.value = Integer.valueOf(obj instanceof Collection ? ((Collection) obj).size() : obj.getClass().isArray() ? Array.getLength(obj) : obj instanceof Map ? ((Map) obj).size() : obj instanceof String ? ((String) obj).length() : obj instanceof JSONPath.Sequence ? ((JSONPath.Sequence) obj).values.size() : 1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class MaxSegment extends JSONPathSegment implements EvalSegment {
        static final MaxSegment INSTANCE = new MaxSegment();

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            eval(context);
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (obj == null) {
                return;
            }
            Object obj2 = null;
            if (obj instanceof Collection) {
                for (Object obj3 : (Collection) obj) {
                    if (obj3 != null && (obj2 == null || TypeUtils.compare(obj2, obj3) < 0)) {
                        obj2 = obj3;
                    }
                }
            } else if (obj instanceof Object[]) {
                for (Object obj4 : (Object[]) obj) {
                    if (obj4 != null && (obj2 == null || TypeUtils.compare(obj2, obj4) < 0)) {
                        obj2 = obj4;
                    }
                }
            } else {
                if (!(obj instanceof JSONPath.Sequence)) {
                    C9079i0.m35296a();
                    return;
                }
                for (Object obj5 : ((JSONPath.Sequence) obj).values) {
                    if (obj5 != null && (obj2 == null || TypeUtils.compare(obj2, obj5) < 0)) {
                        obj2 = obj5;
                    }
                }
            }
            context.value = obj2;
            context.eval = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class MinSegment extends JSONPathSegment implements EvalSegment {
        static final MinSegment INSTANCE = new MinSegment();

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            eval(context);
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (obj == null) {
                return;
            }
            Object obj2 = null;
            if (obj instanceof Collection) {
                for (Object obj3 : (Collection) obj) {
                    if (obj3 != null && (obj2 == null || TypeUtils.compare(obj2, obj3) > 0)) {
                        obj2 = obj3;
                    }
                }
            } else if (obj instanceof Object[]) {
                for (Object obj4 : (Object[]) obj) {
                    if (obj4 != null && (obj2 == null || TypeUtils.compare(obj2, obj4) > 0)) {
                        obj2 = obj4;
                    }
                }
            } else {
                if (!(obj instanceof JSONPath.Sequence)) {
                    C9079i0.m35296a();
                    return;
                }
                for (Object obj5 : ((JSONPath.Sequence) obj).values) {
                    if (obj5 != null && (obj2 == null || TypeUtils.compare(obj2, obj5) > 0)) {
                        obj2 = obj5;
                    }
                }
            }
            context.value = obj2;
            context.eval = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class MultiIndexSegment extends JSONPathSegment {
        final int[] indexes;

        public MultiIndexSegment(int[] iArr) {
            this.indexes = iArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:63:0x00c7, code lost:
        
            r6.value = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00c9, code lost:
        
            return;
         */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
        @Override // com.alibaba.fastjson2.JSONPathSegment
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void accept(com.alibaba.fastjson2.JSONReader r5, com.alibaba.fastjson2.JSONPath.Context r6) {
            /*
                Method dump skipped, instruction units count: 226
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONPathSegment.MultiIndexSegment.accept(com.alibaba.fastjson2.JSONReader, com.alibaba.fastjson2.JSONPath$Context):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
        @Override // com.alibaba.fastjson2.JSONPathSegment
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void eval(com.alibaba.fastjson2.JSONPath.Context r13) {
            /*
                r12 = this;
                com.alibaba.fastjson2.JSONPath$Context r0 = r13.parent
                if (r0 != 0) goto L7
                java.lang.Object r0 = r13.root
                goto L9
            L7:
                java.lang.Object r0 = r0.value
            L9:
                com.alibaba.fastjson2.JSONArray r1 = new com.alibaba.fastjson2.JSONArray
                r1.<init>()
                boolean r2 = r0 instanceof com.alibaba.fastjson2.JSONPath.Sequence
                r3 = 0
                if (r2 == 0) goto L4b
                com.alibaba.fastjson2.JSONPath$Sequence r0 = (com.alibaba.fastjson2.JSONPath.Sequence) r0
                java.util.List r0 = r0.values
                int r2 = r0.size()
            L1b:
                if (r3 >= r2) goto L47
                java.lang.Object r4 = r0.get(r3)
                r13.value = r4
                com.alibaba.fastjson2.JSONPath$Context r5 = new com.alibaba.fastjson2.JSONPath$Context
                com.alibaba.fastjson2.JSONPath r6 = r13.path
                com.alibaba.fastjson2.JSONPathSegment r8 = r13.current
                com.alibaba.fastjson2.JSONPathSegment r9 = r13.next
                long r10 = r13.readerFeatures
                r7 = r13
                r5.<init>(r6, r7, r8, r9, r10)
                r12.eval(r5)
                java.lang.Object r13 = r5.value
                boolean r4 = r13 instanceof java.util.Collection
                if (r4 == 0) goto L40
                java.util.Collection r13 = (java.util.Collection) r13
                r1.addAll(r13)
                goto L43
            L40:
                r1.add(r13)
            L43:
                int r3 = r3 + 1
                r13 = r7
                goto L1b
            L47:
                r7 = r13
                r7.value = r1
                return
            L4b:
                r7 = r13
                int[] r13 = r12.indexes
                int r2 = r13.length
            L4f:
                if (r3 >= r2) goto L98
                r4 = r13[r3]
                boolean r5 = r0 instanceof java.util.List
                if (r5 == 0) goto L73
                r5 = r0
                java.util.List r5 = (java.util.List) r5
                if (r4 < 0) goto L67
                int r6 = r5.size()
                if (r4 >= r6) goto L95
                java.lang.Object r4 = r5.get(r4)
                goto L88
            L67:
                int r6 = r5.size()
                int r6 = r6 + r4
                if (r6 < 0) goto L95
                java.lang.Object r4 = r5.get(r6)
                goto L88
            L73:
                boolean r5 = r0 instanceof java.lang.Object[]
                if (r5 == 0) goto L95
                r5 = r0
                java.lang.Object[] r5 = (java.lang.Object[]) r5
                if (r4 < 0) goto L82
                int r6 = r5.length
                if (r4 >= r6) goto L95
                r4 = r5[r4]
                goto L88
            L82:
                int r6 = r5.length
                int r6 = r6 + r4
                if (r6 < 0) goto L95
                r4 = r5[r6]
            L88:
                boolean r5 = r4 instanceof java.util.Collection
                if (r5 == 0) goto L92
                java.util.Collection r4 = (java.util.Collection) r4
                r1.addAll(r4)
                goto L95
            L92:
                r1.add(r4)
            L95:
                int r3 = r3 + 1
                goto L4f
            L98:
                r7.value = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONPathSegment.MultiIndexSegment.eval(com.alibaba.fastjson2.JSONPath$Context):void");
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void set(JSONPath.Context context, Object obj) {
            JSONPath.Context context2 = context.parent;
            Object obj2 = context2 == null ? context.root : context2.value;
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    for (int i11 : this.indexes) {
                        if (i11 == i10) {
                            list.set(i10, obj);
                        }
                    }
                }
                return;
            }
            if (obj2 == null || !obj2.getClass().isArray()) {
                C1607k.m6296a("UnsupportedOperation ", MultiIndexSegment.class);
                return;
            }
            int length = Array.getLength(obj2);
            for (int i12 = 0; i12 < length; i12++) {
                for (int i13 : this.indexes) {
                    if (i13 == i12) {
                        Array.set(obj2, i12, obj);
                    }
                }
            }
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void setCallback(JSONPath.Context context, BiFunction biFunction) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    for (int i11 : this.indexes) {
                        if (i11 == i10) {
                            list.set(i10, biFunction.apply(obj, list.get(i10)));
                        }
                    }
                }
                return;
            }
            if (obj == null || !obj.getClass().isArray()) {
                C1607k.m6296a("UnsupportedOperation ", MultiIndexSegment.class);
                return;
            }
            int length = Array.getLength(obj);
            for (int i12 = 0; i12 < length; i12++) {
                for (int i13 : this.indexes) {
                    if (i13 == i12) {
                        Array.set(obj, i12, biFunction.apply(obj, Array.get(obj, i12)));
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class MultiNameSegment extends JSONPathSegment {
        final long[] nameHashCodes;
        final Set<String> nameSet = new HashSet();
        final String[] names;

        public MultiNameSegment(String[] strArr) {
            this.names = strArr;
            this.nameHashCodes = new long[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                this.nameHashCodes[i10] = Fnv.hashCode64(strArr[i10]);
                this.nameSet.add(strArr[i10]);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
        
            if ((r0 instanceof com.alibaba.fastjson2.JSONPathSegment.MultiIndexSegment) == false) goto L12;
         */
        @Override // com.alibaba.fastjson2.JSONPathSegment
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void accept(com.alibaba.fastjson2.JSONReader r9, com.alibaba.fastjson2.JSONPath.Context r10) {
            /*
                r8 = this;
                com.alibaba.fastjson2.JSONPath$Context r0 = r10.parent
                if (r0 == 0) goto L16
                boolean r1 = r0.eval
                if (r1 != 0) goto L12
                com.alibaba.fastjson2.JSONPathSegment r0 = r0.current
                boolean r1 = r0 instanceof com.alibaba.fastjson2.JSONPathFilter
                if (r1 != 0) goto L12
                boolean r0 = r0 instanceof com.alibaba.fastjson2.JSONPathSegment.MultiIndexSegment
                if (r0 == 0) goto L16
            L12:
                r8.eval(r10)
                return
            L16:
                java.lang.Object r9 = r9.readAny()
                boolean r0 = r9 instanceof java.util.Map
                r1 = 0
                if (r0 == 0) goto L3d
                java.util.Map r9 = (java.util.Map) r9
                com.alibaba.fastjson2.JSONArray r0 = new com.alibaba.fastjson2.JSONArray
                java.lang.String[] r2 = r8.names
                int r2 = r2.length
                r0.<init>(r2)
                java.lang.String[] r2 = r8.names
                int r3 = r2.length
            L2c:
                if (r1 >= r3) goto L3a
                r4 = r2[r1]
                java.lang.Object r4 = r9.get(r4)
                r0.add(r4)
                int r1 = r1 + 1
                goto L2c
            L3a:
                r10.value = r0
                return
            L3d:
                boolean r0 = r9 instanceof java.util.Collection
                if (r0 == 0) goto L88
                com.alibaba.fastjson2.JSONPathSegment r0 = r10.next
                if (r0 != 0) goto L85
                java.util.Collection r9 = (java.util.Collection) r9
                com.alibaba.fastjson2.JSONArray r0 = new com.alibaba.fastjson2.JSONArray
                int r2 = r9.size()
                r0.<init>(r2)
                java.util.Iterator r9 = r9.iterator()
            L54:
                boolean r2 = r9.hasNext()
                if (r2 == 0) goto L82
                java.lang.Object r2 = r9.next()
                boolean r3 = r2 instanceof java.util.Map
                if (r3 == 0) goto L54
                java.util.Map r2 = (java.util.Map) r2
                com.alibaba.fastjson2.JSONArray r3 = new com.alibaba.fastjson2.JSONArray
                java.lang.String[] r4 = r8.names
                int r4 = r4.length
                r3.<init>(r4)
                java.lang.String[] r4 = r8.names
                int r5 = r4.length
                r6 = r1
            L70:
                if (r6 >= r5) goto L7e
                r7 = r4[r6]
                java.lang.Object r7 = r2.get(r7)
                r3.add(r7)
                int r6 = r6 + 1
                goto L70
            L7e:
                r0.add(r3)
                goto L54
            L82:
                r10.value = r0
                return
            L85:
                r10.value = r9
                return
            L88:
                java.lang.String r9 = "UnsupportedOperation "
                java.lang.Class<com.alibaba.fastjson2.JSONPathSegment$MultiNameSegment> r10 = com.alibaba.fastjson2.JSONPathSegment.MultiNameSegment.class
                com.alibaba.fastjson2.C1607k.m6296a(r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONPathSegment.MultiNameSegment.accept(com.alibaba.fastjson2.JSONReader, com.alibaba.fastjson2.JSONPath$Context):void");
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            int i10 = 0;
            if (obj instanceof Map) {
                Map map = (Map) obj;
                JSONArray jSONArray = new JSONArray(this.names.length);
                String[] strArr = this.names;
                int length = strArr.length;
                while (i10 < length) {
                    jSONArray.add(map.get(strArr[i10]));
                    i10++;
                }
                context.value = jSONArray;
                return;
            }
            if (obj instanceof Collection) {
                context.value = obj;
                return;
            }
            ObjectWriter objectWriter = context.path.getWriterContext().provider.getObjectWriter((Class) obj.getClass());
            JSONArray jSONArray2 = new JSONArray(this.names.length);
            while (i10 < this.names.length) {
                FieldWriter fieldWriter = objectWriter.getFieldWriter(this.nameHashCodes[i10]);
                jSONArray2.add(fieldWriter != null ? fieldWriter.getFieldValue(obj) : null);
                i10++;
            }
            context.value = jSONArray2;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public boolean remove(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (obj instanceof Map) {
                Map map = (Map) obj;
                int i10 = 0;
                for (String str : this.names) {
                    if (map.remove(str) != null) {
                        i10++;
                    }
                }
                return i10 > 0;
            }
            ObjectReader objectReader = context.path.getReaderContext().provider.getObjectReader(obj.getClass());
            if (!(objectReader instanceof ObjectReaderBean)) {
                C1607k.m6296a("UnsupportedOperation ", MultiNameSegment.class);
                return false;
            }
            int i11 = 0;
            for (long j10 : this.nameHashCodes) {
                FieldReader fieldReader = objectReader.getFieldReader(j10);
                if (fieldReader != null) {
                    fieldReader.accept(obj, (Object) null);
                    i11++;
                }
            }
            return i11 > 0;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void set(JSONPath.Context context, Object obj) {
            JSONPath.Context context2 = context.parent;
            Object obj2 = context2 == null ? context.root : context2.value;
            int i10 = 0;
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                String[] strArr = this.names;
                int length = strArr.length;
                while (i10 < length) {
                    map.put(strArr[i10], obj);
                    i10++;
                }
                return;
            }
            ObjectReader objectReader = context.path.getReaderContext().provider.getObjectReader(obj2.getClass());
            if (!(objectReader instanceof ObjectReaderBean)) {
                C1607k.m6296a("UnsupportedOperation ", MultiNameSegment.class);
                return;
            }
            long[] jArr = this.nameHashCodes;
            int length2 = jArr.length;
            while (i10 < length2) {
                FieldReader fieldReader = objectReader.getFieldReader(jArr[i10]);
                if (fieldReader != null) {
                    fieldReader.accept(obj2, obj);
                }
                i10++;
            }
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void setCallback(JSONPath.Context context, BiFunction biFunction) {
            FieldReader fieldReader;
            Object fieldValue;
            Object objApply;
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            int i10 = 0;
            if (obj instanceof Map) {
                Map map = (Map) obj;
                String[] strArr = this.names;
                int length = strArr.length;
                while (i10 < length) {
                    String str = strArr[i10];
                    Object obj2 = map.get(str);
                    Object objApply2 = biFunction.apply(map, obj2);
                    if (objApply2 != obj2) {
                        map.put(str, objApply2);
                    }
                    i10++;
                }
                return;
            }
            ObjectWriter objectWriter = context.path.getWriterContext().provider.getObjectWriter((Class) obj.getClass());
            if (objectWriter instanceof ObjectWriterAdapter) {
                ObjectReader objectReader = context.path.getReaderContext().provider.getObjectReader(obj.getClass());
                if (objectReader instanceof ObjectReaderBean) {
                    long[] jArr = this.nameHashCodes;
                    int length2 = jArr.length;
                    while (i10 < length2) {
                        long j10 = jArr[i10];
                        FieldWriter fieldWriter = objectWriter.getFieldWriter(j10);
                        if (fieldWriter != null && (fieldReader = objectReader.getFieldReader(j10)) != null && (objApply = biFunction.apply(obj, (fieldValue = fieldWriter.getFieldValue(obj)))) != fieldValue) {
                            fieldReader.accept(obj, objApply);
                        }
                        i10++;
                    }
                    return;
                }
            }
            C1607k.m6296a("UnsupportedOperation ", MultiNameSegment.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class RandomIndexSegment extends JSONPathSegment {
        public static final RandomIndexSegment INSTANCE = new RandomIndexSegment();
        Random random;

        /* JADX WARN: Code restructure failed: missing block: B:59:0x00c7, code lost:
        
            if (r5.random != null) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00c9, code lost:
        
            r5.random = new java.util.Random();
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00d0, code lost:
        
            r7.value = r0.get(java.lang.Math.abs(r5.random.nextInt()) % r0.size());
            r7.eval = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00e7, code lost:
        
            return;
         */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
        @Override // com.alibaba.fastjson2.JSONPathSegment
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void accept(com.alibaba.fastjson2.JSONReader r6, com.alibaba.fastjson2.JSONPath.Context r7) {
            /*
                Method dump skipped, instruction units count: 256
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONPathSegment.RandomIndexSegment.accept(com.alibaba.fastjson2.JSONReader, com.alibaba.fastjson2.JSONPath$Context):void");
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (obj instanceof List) {
                List list = (List) obj;
                if (list.isEmpty()) {
                    return;
                }
                if (this.random == null) {
                    this.random = new Random();
                }
                context.value = list.get(Math.abs(this.random.nextInt()) % list.size());
                context.eval = true;
                return;
            }
            if (!(obj instanceof Object[])) {
                C1569c.m6258a("TODO");
                return;
            }
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 0) {
                return;
            }
            if (this.random == null) {
                this.random = new Random();
            }
            context.value = objArr[this.random.nextInt() % objArr.length];
            context.eval = true;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void setCallback(JSONPath.Context context, BiFunction biFunction) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (!(obj instanceof List)) {
                C1569c.m6258a("UnsupportedOperation ");
                return;
            }
            List list = (List) obj;
            if (this.random == null) {
                this.random = new Random();
            }
            int iAbs = Math.abs(this.random.nextInt()) % list.size();
            list.set(iAbs, biFunction.apply(list, list.get(iAbs)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class RangeIndexSegment extends JSONPathSegment {
        final int begin;
        final int end;

        public RangeIndexSegment(int i10, int i11) {
            this.begin = i10;
            this.end = i11;
        }

        /* JADX WARN: Removed duplicated region for block: B:76:0x00cb  */
        @Override // com.alibaba.fastjson2.JSONPathSegment
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void accept(com.alibaba.fastjson2.JSONReader r6, com.alibaba.fastjson2.JSONPath.Context r7) {
            /*
                Method dump skipped, instruction units count: 294
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONPathSegment.RangeIndexSegment.accept(com.alibaba.fastjson2.JSONReader, com.alibaba.fastjson2.JSONPath$Context):void");
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            JSONArray jSONArray = new JSONArray();
            int i10 = 0;
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                while (i10 < size) {
                    int i11 = this.begin;
                    int i12 = i11 >= 0 ? i10 : i10 - size;
                    if (i12 >= i11 && i12 < this.end) {
                        jSONArray.add(list.get(i10));
                    }
                    i10++;
                }
                context.value = jSONArray;
                context.eval = true;
                return;
            }
            if (!(obj instanceof Object[])) {
                C1569c.m6258a("TODO");
                return;
            }
            Object[] objArr = (Object[]) obj;
            while (i10 < objArr.length) {
                int i13 = this.begin;
                if ((i10 >= i13 && i10 <= this.end) || (i10 - objArr.length > i13 && i10 - objArr.length <= this.end)) {
                    jSONArray.add(objArr[i10]);
                }
                i10++;
            }
            context.value = jSONArray;
            context.eval = true;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public boolean remove(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (!(obj instanceof List)) {
                C1607k.m6296a("UnsupportedOperation ", RangeIndexSegment.class);
                return false;
            }
            List list = (List) obj;
            int size = list.size();
            int i10 = 0;
            for (int i11 = size - 1; i11 >= 0; i11--) {
                int i12 = this.begin;
                int i13 = i12 >= 0 ? i11 : i11 - size;
                if (i13 >= i12 && i13 < this.end) {
                    list.remove(i11);
                    i10++;
                }
            }
            return i10 > 0;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void set(JSONPath.Context context, Object obj) {
            JSONPath.Context context2 = context.parent;
            Object obj2 = context2 == null ? context.root : context2.value;
            int i10 = 0;
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                while (i10 < size) {
                    int i11 = this.begin;
                    int i12 = i11 >= 0 ? i10 : i10 - size;
                    if (i12 >= i11 && i12 < this.end) {
                        list.set(i10, obj);
                    }
                    i10++;
                }
                return;
            }
            if (obj2 == null || !obj2.getClass().isArray()) {
                C1607k.m6296a("UnsupportedOperation ", RangeIndexSegment.class);
                return;
            }
            int length = Array.getLength(obj2);
            while (i10 < length) {
                int i13 = this.begin;
                int i14 = i13 >= 0 ? i10 : i10 - length;
                if (i14 >= i13 && i14 < this.end) {
                    Array.set(obj2, i10, obj);
                }
                i10++;
            }
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void setCallback(JSONPath.Context context, BiFunction biFunction) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            int i10 = 0;
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                while (i10 < size) {
                    int i11 = this.begin;
                    int i12 = i11 >= 0 ? i10 : i10 - size;
                    if (i12 >= i11 && i12 < this.end) {
                        list.set(i12, biFunction.apply(list, list.get(i10)));
                    }
                    i10++;
                }
                return;
            }
            if (obj == null || !obj.getClass().isArray()) {
                C1607k.m6296a("UnsupportedOperation ", RangeIndexSegment.class);
                return;
            }
            int length = Array.getLength(obj);
            while (i10 < length) {
                int i13 = this.begin;
                int i14 = i13 >= 0 ? i10 : i10 - length;
                if (i14 >= i13 && i14 < this.end) {
                    Array.set(obj, i10, biFunction.apply(obj, Array.get(obj, i10)));
                }
                i10++;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class RootSegment extends JSONPathSegment {
        static final RootSegment INSTANCE = new RootSegment();

        private RootSegment() {
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            if (context.parent != null) {
                C1569c.m6258a("not support operation");
            } else {
                context.value = jSONReader.readAny();
                context.eval = true;
            }
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            context.value = context2 == null ? context.root : context2.root;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class SelfSegment extends JSONPathSegment {
        static final SelfSegment INSTANCE = new SelfSegment();

        private SelfSegment() {
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            context.value = jSONReader.readAny();
            context.eval = true;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            context.value = context2 == null ? context.root : context2.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class SumSegment extends JSONPathSegment implements EvalSegment {
        static final SumSegment INSTANCE = new SumSegment();

        public static Number add(Number number, Number number2) {
            boolean z10 = true;
            boolean z11 = (number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long);
            boolean z12 = (number2 instanceof Byte) || (number2 instanceof Short) || (number2 instanceof Integer) || (number2 instanceof Long);
            if (z11 && z12) {
                return Long.valueOf(number.longValue() + number2.longValue());
            }
            boolean z13 = (number instanceof Float) || (number instanceof Double);
            if (!(number2 instanceof Float) && !(number2 instanceof Double)) {
                z10 = false;
            }
            if (z13 || z10) {
                return Double.valueOf(number.doubleValue() + number2.doubleValue());
            }
            if ((number instanceof BigDecimal) || (number2 instanceof BigDecimal)) {
                return TypeUtils.toBigDecimal(number).add(TypeUtils.toBigDecimal(number2));
            }
            if ((number instanceof BigInteger) || (number2 instanceof BigInteger)) {
                return TypeUtils.toBigInteger(number).add(TypeUtils.toBigInteger(number2));
            }
            C1569c.m6258a("not support operation");
            return null;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            eval(context);
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (obj == null) {
                return;
            }
            Number numberAdd = 0;
            if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    if (obj2 != null) {
                        numberAdd = add(numberAdd, (Number) obj2);
                    }
                }
            } else if (obj instanceof Object[]) {
                for (Object obj3 : (Object[]) obj) {
                    if (obj3 != null) {
                        numberAdd = add(numberAdd, (Number) obj3);
                    }
                }
            } else {
                if (!(obj instanceof JSONPath.Sequence)) {
                    C9079i0.m35296a();
                    return;
                }
                for (Object obj4 : ((JSONPath.Sequence) obj).values) {
                    if (obj4 != null) {
                        numberAdd = add(numberAdd, (Number) obj4);
                    }
                }
            }
            context.value = numberAdd;
            context.eval = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class ValuesSegment extends JSONPathSegment implements EvalSegment {
        static final ValuesSegment INSTANCE = new ValuesSegment();

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            eval(context);
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (obj == null) {
                context.value = null;
                context.eval = true;
            } else if (!(obj instanceof Map)) {
                C1569c.m6258a("TODO");
            } else {
                context.value = new JSONArray((Collection<?>) ((Map) obj).values());
                context.eval = true;
            }
        }
    }

    public abstract void accept(JSONReader jSONReader, JSONPath.Context context);

    public boolean contains(JSONPath.Context context) {
        eval(context);
        return context.value != null;
    }

    public abstract void eval(JSONPath.Context context);

    public boolean remove(JSONPath.Context context) {
        throw new JSONException("UnsupportedOperation " + getClass());
    }

    public void set(JSONPath.Context context, Object obj) {
        throw new JSONException("UnsupportedOperation " + getClass());
    }

    public void setCallback(JSONPath.Context context, BiFunction biFunction) {
        throw new JSONException("UnsupportedOperation " + getClass());
    }

    public void setInt(JSONPath.Context context, int i10) {
        set(context, Integer.valueOf(i10));
    }

    public void setLong(JSONPath.Context context, long j10) {
        set(context, Long.valueOf(j10));
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class CycleNameSegment extends JSONPathSegment {
        final String name;
        final long nameHashCode;
        static final long HASH_STAR = Fnv.hashCode64("*");
        static final long HASH_EMPTY = Fnv.hashCode64(_UrlKt.FRAGMENT_ENCODE_SET);

        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public class LoopCallback {
            final BiFunction callback;
            final JSONPath.Context context;

            public LoopCallback(JSONPath.Context context, BiFunction biFunction) {
                this.context = context;
                this.callback = biFunction;
            }

            public void accept(Object obj) {
                if (obj instanceof Map) {
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        Object value = entry.getValue();
                        if (CycleNameSegment.this.name.equals(entry.getKey())) {
                            entry.setValue(this.callback.apply(obj, value));
                            this.context.eval = true;
                        } else if (value != null) {
                            accept(value);
                        }
                    }
                    return;
                }
                if (obj instanceof Collection) {
                    for (Object obj2 : (List) obj) {
                        if (obj2 != null) {
                            accept(obj2);
                        }
                    }
                    return;
                }
                Class<?> cls = obj.getClass();
                ObjectReader objectReader = JSONFactory.getDefaultObjectReaderProvider().getObjectReader(cls);
                ObjectWriter objectWriter = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter((Class) cls);
                if (objectReader instanceof ObjectReaderBean) {
                    FieldReader fieldReader = objectReader.getFieldReader(CycleNameSegment.this.nameHashCode);
                    FieldWriter fieldWriter = objectWriter.getFieldWriter(CycleNameSegment.this.nameHashCode);
                    if (fieldWriter != null && fieldReader != null) {
                        fieldReader.accept(obj, this.callback.apply(obj, fieldWriter.getFieldValue(obj)));
                        this.context.eval = true;
                        return;
                    }
                }
                Iterator<FieldWriter> it = objectWriter.getFieldWriters().iterator();
                while (it.hasNext()) {
                    accept(it.next().getFieldValue(obj));
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public class LoopRemove {
            final JSONPath.Context context;

            public LoopRemove(JSONPath.Context context) {
                this.context = context;
            }

            public void accept(Object obj) {
                FieldReader fieldReader;
                if (obj instanceof Map) {
                    Iterator it = ((Map) obj).entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (CycleNameSegment.this.name.equals(entry.getKey())) {
                            it.remove();
                            this.context.eval = true;
                        } else {
                            Object value = entry.getValue();
                            if (value != null) {
                                accept(value);
                            }
                        }
                    }
                    return;
                }
                if (obj instanceof Collection) {
                    for (Object obj2 : (List) obj) {
                        if (obj2 != null) {
                            accept(obj2);
                        }
                    }
                    return;
                }
                Class<?> cls = obj.getClass();
                ObjectReader objectReader = JSONFactory.getDefaultObjectReaderProvider().getObjectReader(cls);
                if ((objectReader instanceof ObjectReaderBean) && (fieldReader = objectReader.getFieldReader(CycleNameSegment.this.nameHashCode)) != null) {
                    fieldReader.accept(obj, (Object) null);
                    this.context.eval = true;
                } else {
                    Iterator<FieldWriter> it2 = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter((Class) cls).getFieldWriters().iterator();
                    while (it2.hasNext()) {
                        accept(it2.next().getFieldValue(obj));
                    }
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public class LoopSet {
            final JSONPath.Context context;
            final Object value;

            public LoopSet(JSONPath.Context context, Object obj) {
                this.context = context;
                this.value = obj;
            }

            public void accept(Object obj) {
                FieldReader fieldReader;
                if (obj instanceof Map) {
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        if (CycleNameSegment.this.name.equals(entry.getKey())) {
                            entry.setValue(this.value);
                            this.context.eval = true;
                        } else {
                            Object value = entry.getValue();
                            if (value != null) {
                                accept(value);
                            }
                        }
                    }
                    return;
                }
                if (obj instanceof Collection) {
                    for (Object obj2 : (List) obj) {
                        if (obj2 != null) {
                            accept(obj2);
                        }
                    }
                    return;
                }
                Class<?> cls = obj.getClass();
                ObjectReader objectReader = JSONFactory.getDefaultObjectReaderProvider().getObjectReader(cls);
                if ((objectReader instanceof ObjectReaderBean) && (fieldReader = objectReader.getFieldReader(CycleNameSegment.this.nameHashCode)) != null) {
                    fieldReader.accept(obj, this.value);
                    this.context.eval = true;
                } else {
                    Iterator<FieldWriter> it = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter((Class) cls).getFieldWriters().iterator();
                    while (it.hasNext()) {
                        accept(it.next().getFieldValue(obj));
                    }
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public class MapRecursive implements Consumer {
            static final int maxLevel = 2048;
            final JSONPath.Context context;
            final int level;
            final List values;

            public MapRecursive(JSONPath.Context context, List list, int i10) {
                this.context = context;
                this.values = list;
                this.level = i10;
            }

            private void recursive(final Object obj, List list, int i10) {
                if (i10 >= maxLevel) {
                    C1569c.m6258a("level too large");
                    return;
                }
                if (obj instanceof Map) {
                    Collection collectionValues = ((Map) obj).values();
                    long j10 = CycleNameSegment.this.nameHashCode;
                    if (j10 == CycleNameSegment.HASH_STAR) {
                        list.addAll(collectionValues);
                    } else if (j10 == CycleNameSegment.HASH_EMPTY) {
                        list.add(obj);
                    }
                    collectionValues.forEach(this);
                    return;
                }
                if (obj instanceof Collection) {
                    Collection collection = (Collection) obj;
                    long j11 = CycleNameSegment.this.nameHashCode;
                    if (j11 == CycleNameSegment.HASH_STAR) {
                        list.addAll(collection);
                    } else if (j11 == CycleNameSegment.HASH_EMPTY) {
                        list.add(obj);
                    }
                    collection.forEach(this);
                    return;
                }
                if (obj != null) {
                    ObjectWriter objectWriter = this.context.path.getWriterContext().getObjectWriter(obj.getClass());
                    if (objectWriter instanceof ObjectWriterAdapter) {
                        List<FieldWriter> fieldWriters = ((ObjectWriterAdapter) objectWriter).getFieldWriters();
                        recursive((fieldWriters == null || fieldWriters.isEmpty()) ? new ArrayList() : fieldWriters.stream().filter(new Predicate() { // from class: com.alibaba.fastjson2.b0
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj2) {
                                return Objects.nonNull((FieldWriter) obj2);
                            }
                        }).map(new Function() { // from class: com.alibaba.fastjson2.c0
                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return ((FieldWriter) obj2).getFieldValue(obj);
                            }
                        }).collect(Collectors.toList()), list, i10 + 1);
                    }
                }
            }

            @Override // java.util.function.Consumer
            public void accept(Object obj) {
                recursive(obj, this.values, this.level);
            }
        }

        public CycleNameSegment(String str, long j10) {
            this.name = str;
            this.nameHashCode = j10;
        }

        /* JADX WARN: Removed duplicated region for block: B:133:0x00f6 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:134:0x0117 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:140:0x00ea A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:146:0x0085 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0110  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void accept(com.alibaba.fastjson2.JSONReader r10, com.alibaba.fastjson2.JSONPath.Context r11, java.util.List<java.lang.Object> r12) {
            /*
                Method dump skipped, instruction units count: 354
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONPathSegment.CycleNameSegment.accept(com.alibaba.fastjson2.JSONReader, com.alibaba.fastjson2.JSONPath$Context, java.util.List):void");
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            JSONArray jSONArray = new JSONArray();
            (shouldRecursive() ? new MapRecursive(context, jSONArray, 0) : new MapLoop(context, jSONArray)).accept(obj);
            if (jSONArray.size() == 1 && (jSONArray.get(0) instanceof Collection)) {
                context.value = jSONArray.get(0);
            } else {
                context.value = jSONArray;
            }
            Object obj2 = context.value;
            if ((obj2 instanceof List) && (context.next instanceof JSONPathFilter)) {
                context.value = new JSONPath.Sequence((List) obj2);
            }
            context.eval = true;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public boolean remove(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            new LoopRemove(context).accept(context2 == null ? context.root : context2.value);
            context.eval = true;
            return true;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void set(JSONPath.Context context, Object obj) {
            JSONPath.Context context2 = context.parent;
            new LoopSet(context, obj).accept(context2 == null ? context.root : context2.value);
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void setCallback(JSONPath.Context context, BiFunction biFunction) {
            JSONPath.Context context2 = context.parent;
            new LoopCallback(context, biFunction).accept(context2 == null ? context.root : context2.value);
        }

        public boolean shouldRecursive() {
            long j10 = this.nameHashCode;
            return j10 == HASH_STAR || j10 == HASH_EMPTY;
        }

        public String toString() {
            return ".." + this.name;
        }

        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public class MapLoop implements BiConsumer, Consumer {
            final JSONPath.Context context;
            final List values;

            public MapLoop(JSONPath.Context context, List list) {
                this.context = context;
                this.values = list;
            }

            @Override // java.util.function.Consumer
            public void accept(Object obj) {
                if (obj == null) {
                    return;
                }
                if (obj instanceof Map) {
                    ((Map) obj).forEach(this);
                    return;
                }
                if (obj instanceof List) {
                    ((List) obj).forEach(this);
                    return;
                }
                ObjectWriter objectWriter = this.context.path.getWriterContext().getObjectWriter(obj.getClass());
                boolean z10 = objectWriter instanceof ObjectWriterAdapter;
                CycleNameSegment cycleNameSegment = CycleNameSegment.this;
                if (!z10) {
                    if (cycleNameSegment.nameHashCode == CycleNameSegment.HASH_STAR) {
                        this.values.add(obj);
                        return;
                    }
                    return;
                }
                FieldWriter fieldWriter = objectWriter.getFieldWriter(cycleNameSegment.nameHashCode);
                if (fieldWriter != null) {
                    Object fieldValue = fieldWriter.getFieldValue(obj);
                    if (fieldValue != null) {
                        this.values.add(fieldValue);
                        return;
                    }
                    return;
                }
                for (int i10 = 0; i10 < objectWriter.getFieldWriters().size(); i10++) {
                    accept(objectWriter.getFieldWriters().get(i10).getFieldValue(obj));
                }
            }

            @Override // java.util.function.BiConsumer
            public void accept(Object obj, Object obj2) {
                if (CycleNameSegment.this.name.equals(obj)) {
                    this.values.add(obj2);
                }
                if (obj2 instanceof Map) {
                    ((Map) obj2).forEach(this);
                } else if (obj2 instanceof List) {
                    ((List) obj2).forEach(this);
                } else if (CycleNameSegment.this.nameHashCode == CycleNameSegment.HASH_STAR) {
                    this.values.add(obj2);
                }
            }
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            JSONArray jSONArray = new JSONArray();
            accept(jSONReader, context, jSONArray);
            context.value = jSONArray;
            context.eval = true;
        }
    }
}
