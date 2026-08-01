package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class JSONPathSegmentIndex extends JSONPathSegment {
    final int index;
    static final JSONPathSegmentIndex ZERO = new JSONPathSegmentIndex(0);
    static final JSONPathSegmentIndex ONE = new JSONPathSegmentIndex(1);
    static final JSONPathSegmentIndex TWO = new JSONPathSegmentIndex(2);
    static final JSONPathSegmentIndex LAST = new JSONPathSegmentIndex(-1);

    public JSONPathSegmentIndex(int i10) {
        this.index = i10;
    }

    /* JADX INFO: renamed from: of */
    public static JSONPathSegmentIndex m6215of(int i10) {
        return i10 == 0 ? ZERO : i10 == 1 ? ONE : i10 == 2 ? TWO : i10 == -1 ? LAST : new JSONPathSegmentIndex(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00d7  */
    @Override // com.alibaba.fastjson2.JSONPathSegment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void accept(com.alibaba.fastjson2.JSONReader r8, com.alibaba.fastjson2.JSONPath.Context r9) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONPathSegmentIndex.accept(com.alibaba.fastjson2.JSONReader, com.alibaba.fastjson2.JSONPath$Context):void");
    }

    @Override // com.alibaba.fastjson2.JSONPathSegment
    public void eval(JSONPath.Context context) {
        JSONPath.Context context2 = context.parent;
        Object obj = context2 == null ? context.root : context2.value;
        if (obj == null) {
            context.eval = true;
            return;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int i10 = this.index;
            if (i10 < 0) {
                int size = list.size() + this.index;
                if (size >= 0 && size < list.size()) {
                    context.value = list.get(size);
                }
            } else if (i10 < list.size()) {
                context.value = list.get(this.index);
            }
            context.eval = true;
            return;
        }
        if ((obj instanceof SortedSet) || (obj instanceof LinkedHashSet) || (obj instanceof Queue) || (this.index == 0 && (obj instanceof Collection) && ((Collection) obj).size() == 1)) {
            Iterator it = ((Collection) obj).iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (i11 == this.index) {
                    context.value = next;
                    break;
                }
                i11++;
            }
            context.eval = true;
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int i12 = this.index;
            if (i12 < 0) {
                int length = objArr.length + i12;
                if (length >= 0 && length < objArr.length) {
                    context.value = objArr[length];
                }
            } else if (i12 < objArr.length) {
                context.value = objArr[i12];
            }
            context.eval = true;
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            int length2 = Array.getLength(obj);
            int i13 = this.index;
            if (i13 < 0) {
                int i14 = i13 + length2;
                if (i14 >= 0 && i14 < length2) {
                    context.value = Array.get(obj, i14);
                }
            } else if (i13 < length2) {
                context.value = Array.get(obj, i13);
            }
            context.eval = true;
            return;
        }
        if (!(obj instanceof JSONPath.Sequence)) {
            if (Map.class.isAssignableFrom(cls)) {
                context.value = eval((Map) obj);
                context.eval = true;
                return;
            } else if (this.index == 0) {
                context.value = obj;
                context.eval = true;
                return;
            } else {
                StringBuilder sb2 = new StringBuilder("jsonpath not support operate : ");
                sb2.append(context.path);
                C1572d0.m6260a(sb2, ", objectClass", cls.getName());
                return;
            }
        }
        List list2 = ((JSONPath.Sequence) obj).values;
        JSONArray jSONArray = new JSONArray(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            context.value = it2.next();
            JSONPath.Context context3 = context;
            JSONPath.Context context4 = new JSONPath.Context(context.path, context3, context.current, context.next, context.readerFeatures);
            eval(context4);
            jSONArray.add(context4.value);
            context = context3;
        }
        JSONPath.Context context5 = context;
        if (context5.next != null) {
            context5.value = new JSONPath.Sequence(jSONArray);
        } else {
            context5.value = jSONArray;
        }
        context5.eval = true;
    }

    @Override // com.alibaba.fastjson2.JSONPathSegment
    public boolean remove(JSONPath.Context context) {
        JSONPath.Context context2 = context.parent;
        Object obj = context2 == null ? context.root : context2.value;
        if (!(obj instanceof List)) {
            C1569c.m6258a("UnsupportedOperation");
            return false;
        }
        List list = (List) obj;
        int i10 = this.index;
        if (i10 >= 0) {
            if (i10 >= list.size()) {
                return false;
            }
            list.remove(this.index);
            return true;
        }
        int size = list.size() + this.index;
        if (size < 0) {
            return false;
        }
        list.remove(size);
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONPathSegment
    public void set(JSONPath.Context context, Object obj) {
        JSONPath.Context context2 = context.parent;
        Object obj2 = context2 == null ? context.root : context2.value;
        if (obj2 instanceof List) {
            List list = (List) obj2;
            int i10 = this.index;
            if (i10 < 0) {
                int size = list.size() + this.index;
                if (size >= 0) {
                    list.set(size, obj);
                    return;
                }
                return;
            }
            if (i10 > list.size()) {
                for (int size2 = list.size(); size2 < this.index; size2++) {
                    list.add(null);
                }
            }
            int i11 = this.index;
            int size3 = list.size();
            int i12 = this.index;
            if (i11 < size3) {
                list.set(i12, obj);
                return;
            } else {
                if (i12 <= list.size()) {
                    list.add(obj);
                    return;
                }
                return;
            }
        }
        if (obj2 instanceof Object[]) {
            Object[] objArr = (Object[]) obj2;
            int length = objArr.length;
            int i13 = this.index;
            if (i13 >= 0) {
                if (i13 < length) {
                    objArr[i13] = obj;
                    return;
                }
                return;
            } else {
                int i14 = i13 + length;
                if (i14 < 0 || i14 >= length) {
                    return;
                }
                objArr[i14] = obj;
                return;
            }
        }
        if (obj2 == null || !obj2.getClass().isArray()) {
            C1569c.m6258a("UnsupportedOperation");
            return;
        }
        int length2 = Array.getLength(obj2);
        int i15 = this.index;
        if (i15 >= 0) {
            if (i15 < length2) {
                Array.set(obj2, i15, obj);
            }
        } else {
            int i16 = i15 + length2;
            if (i16 < 0 || i16 >= length2) {
                return;
            }
            Array.set(obj2, i16, obj);
        }
    }

    @Override // com.alibaba.fastjson2.JSONPathSegment
    public void setCallback(JSONPath.Context context, BiFunction biFunction) {
        JSONPath.Context context2 = context.parent;
        Object obj = context2 == null ? context.root : context2.value;
        if (obj instanceof List) {
            List list = (List) obj;
            int i10 = this.index;
            if (i10 >= 0) {
                if (i10 < list.size()) {
                    list.set(this.index, biFunction.apply(obj, list.get(this.index)));
                    return;
                }
                return;
            } else {
                int size = list.size() + this.index;
                if (size >= 0) {
                    list.set(size, biFunction.apply(obj, list.get(size)));
                    return;
                }
                return;
            }
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int i11 = this.index;
            if (i11 >= 0) {
                if (i11 < objArr.length) {
                    objArr[this.index] = biFunction.apply(obj, objArr[i11]);
                    return;
                }
                return;
            } else {
                int length = objArr.length + i11;
                if (length >= 0) {
                    objArr[length] = biFunction.apply(obj, objArr[length]);
                    return;
                }
                return;
            }
        }
        if (obj == null || !obj.getClass().isArray()) {
            C1569c.m6258a("UnsupportedOperation");
            return;
        }
        int length2 = Array.getLength(obj);
        int i12 = this.index;
        if (i12 >= 0) {
            if (i12 < length2) {
                Array.set(obj, this.index, biFunction.apply(obj, Array.get(obj, i12)));
            }
        } else {
            int i13 = length2 + i12;
            if (i13 >= 0) {
                Array.set(obj, i13, biFunction.apply(obj, Array.get(obj, i13)));
            }
        }
    }

    @Override // com.alibaba.fastjson2.JSONPathSegment
    public void setInt(JSONPath.Context context, int i10) {
        JSONPath.Context context2 = context.parent;
        Object obj = context2 == null ? context.root : context2.value;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int i11 = this.index;
            if (i11 >= 0) {
                if (i11 < iArr.length) {
                    iArr[i11] = i10;
                    return;
                }
                return;
            } else {
                int length = iArr.length + i11;
                if (length >= 0) {
                    iArr[length] = i10;
                    return;
                }
                return;
            }
        }
        if (!(obj instanceof long[])) {
            set(context, Integer.valueOf(i10));
            return;
        }
        long[] jArr = (long[]) obj;
        int i12 = this.index;
        if (i12 >= 0) {
            if (i12 < jArr.length) {
                jArr[i12] = i10;
            }
        } else {
            int length2 = jArr.length + i12;
            if (length2 >= 0) {
                jArr[length2] = i10;
            }
        }
    }

    @Override // com.alibaba.fastjson2.JSONPathSegment
    public void setLong(JSONPath.Context context, long j10) {
        JSONPath.Context context2 = context.parent;
        Object obj = context2 == null ? context.root : context2.value;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int i10 = this.index;
            if (i10 >= 0) {
                if (i10 < iArr.length) {
                    iArr[i10] = (int) j10;
                    return;
                }
                return;
            } else {
                int length = iArr.length + i10;
                if (length >= 0) {
                    iArr[length] = (int) j10;
                    return;
                }
                return;
            }
        }
        if (!(obj instanceof long[])) {
            set(context, Long.valueOf(j10));
            return;
        }
        long[] jArr = (long[]) obj;
        int i11 = this.index;
        if (i11 >= 0) {
            if (i11 < jArr.length) {
                jArr[i11] = j10;
            }
        } else {
            int length2 = jArr.length + i11;
            if (length2 >= 0) {
                jArr[length2] = j10;
            }
        }
    }

    public String toString() {
        int i10 = this.index;
        int iStringSize = i10 < 0 ? IOUtils.stringSize(-i10) + 1 : IOUtils.stringSize(i10);
        byte[] bArr = new byte[iStringSize + 2];
        bArr[0] = 91;
        int i11 = iStringSize + 1;
        IOUtils.getChars(this.index, i11, bArr);
        bArr[i11] = 93;
        BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
        return biFunction != null ? biFunction.apply(bArr, JDKUtils.LATIN1) : new String(bArr, StandardCharsets.ISO_8859_1);
    }

    private Object eval(Map map) {
        Object obj = map.get(Integer.valueOf(this.index));
        if (obj == null) {
            obj = map.get(Integer.toString(this.index));
        }
        if (obj == null) {
            int size = map.size();
            Iterator it = map.entrySet().iterator();
            int i10 = 0;
            if (size != 1 && !(map instanceof LinkedHashMap) && !(map instanceof SortedMap)) {
                while (i10 <= this.index && i10 < map.size() && it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if ((key instanceof Long) && key.equals(Long.valueOf(this.index))) {
                        return value;
                    }
                    i10++;
                }
            } else {
                while (i10 <= this.index && i10 < size && it.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    Object key2 = entry2.getKey();
                    Object value2 = entry2.getValue();
                    boolean z10 = key2 instanceof Long;
                    int i11 = this.index;
                    if (z10) {
                        if (key2.equals(Long.valueOf(i11))) {
                            return value2;
                        }
                    } else if (i10 == i11) {
                        obj = value2;
                    }
                    i10++;
                }
            }
        }
        return obj;
    }
}
