package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.util.IOUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class JSONPathSegmentIndex extends JSONPathSegment {
    final int index;
    static final JSONPathSegmentIndex ZERO = new JSONPathSegmentIndex(0);
    static final JSONPathSegmentIndex ONE = new JSONPathSegmentIndex(1);
    static final JSONPathSegmentIndex TWO = new JSONPathSegmentIndex(2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONPathSegmentIndex(int i9) {
        if (i9 >= 0) {
            this.index = i9;
        } else {
            C0086a.m464w("not support negative index");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static JSONPathSegmentIndex m1658of(int i9) {
        return i9 == 0 ? ZERO : i9 == 1 ? ONE : i9 == 2 ? TWO : new JSONPathSegmentIndex(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            if (this.index < list.size()) {
                context.value = list.get(this.index);
            }
            context.eval = true;
            return;
        }
        if ((obj instanceof SortedSet) || (obj instanceof LinkedHashSet) || (this.index == 0 && (obj instanceof Collection) && ((Collection) obj).size() == 1)) {
            Iterator it = ((Collection) obj).iterator();
            int i9 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (i9 == this.index) {
                    context.value = next;
                    break;
                }
                i9++;
            }
            context.eval = true;
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int i10 = this.index;
            if (i10 < objArr.length) {
                context.value = objArr[i10];
            }
            context.eval = true;
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            int length = Array.getLength(obj);
            int i11 = this.index;
            if (i11 < length) {
                context.value = Array.get(obj, i11);
            }
            context.eval = true;
            return;
        }
        if (Map.class.isAssignableFrom(cls)) {
            context.value = eval((Map) obj);
            context.eval = true;
        } else if (this.index == 0) {
            context.value = obj;
            context.eval = true;
        } else {
            StringBuilder sb2 = new StringBuilder("jsonpath not support operate : ");
            sb2.append(context.path);
            C0086a.m460s(sb2, ", objectClass", cls.getName());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        int iStringSize = IOUtils.stringSize(this.index);
        char[] cArr = new char[iStringSize + 2];
        cArr[0] = '[';
        IOUtils.writeInt32(cArr, 1, this.index);
        cArr[iStringSize + 1] = ']';
        return new String(cArr);
    }

    private Object eval(Map map) {
        Object obj = map.get(Integer.valueOf(this.index));
        if (obj == null) {
            obj = map.get(Integer.toString(this.index));
        }
        if (obj == null) {
            int size = map.size();
            Iterator it = map.entrySet().iterator();
            int i9 = 0;
            if (size != 1 && !(map instanceof LinkedHashMap) && !(map instanceof SortedMap)) {
                while (i9 <= this.index && i9 < map.size() && it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if ((key instanceof Long) && key.equals(Long.valueOf(this.index))) {
                        return value;
                    }
                    i9++;
                }
            } else {
                while (i9 <= this.index && i9 < size && it.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    Object key2 = entry2.getKey();
                    Object value2 = entry2.getValue();
                    boolean z9 = key2 instanceof Long;
                    int i10 = this.index;
                    if (z9) {
                        if (key2.equals(Long.valueOf(i10))) {
                            return value2;
                        }
                    } else if (i9 == i10) {
                        obj = value2;
                    }
                    i9++;
                }
            }
        }
        return obj;
    }
}
