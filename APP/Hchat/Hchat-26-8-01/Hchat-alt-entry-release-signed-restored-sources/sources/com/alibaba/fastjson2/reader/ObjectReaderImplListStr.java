package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.SortedSet;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplListStr implements ObjectReader {
    final Class instanceType;
    final Class listType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplListStr(Class cls, Class cls2) {
        this.listType = cls;
        this.instanceType = cls2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Collection lambda$readJSONBObject$0(Collection collection) {
        return Collections.singleton(collection.iterator().next());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Collection lambda$readJSONBObject$1(Collection collection) {
        return Collections.singletonList(collection.iterator().next());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j3) {
        if (this.listType.isInstance(collection)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof String)) {
                }
            }
            return collection;
        }
        Collection collection2 = (Collection) createInstance(j3);
        for (Object obj : collection) {
            if (obj == null || (obj instanceof String)) {
                collection2.add(obj);
            } else {
                collection2.add(JSON.toJSONString(obj));
            }
        }
        return collection2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return this.listType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        Collection collection;
        JSONArray jSONArray;
        ArrayList arrayList;
        Class objectClass = this.instanceType;
        C0627f c0627f = null;
        if (jSONReader.nextIfNull()) {
            return null;
        }
        ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(this.listType, 0L, j3);
        if (objectReaderCheckAutoType != null) {
            objectClass = objectReaderCheckAutoType.getObjectClass();
        }
        int i9 = 0;
        if (objectClass == ObjectReaderImplList.CLASS_ARRAYS_LIST) {
            int iStartArray = jSONReader.startArray();
            String[] strArr = new String[iStartArray];
            while (i9 < iStartArray) {
                strArr[i9] = jSONReader.readString();
                i9++;
            }
            return Arrays.asList(strArr);
        }
        int iStartArray2 = jSONReader.startArray();
        if (objectClass == ArrayList.class) {
            if (iStartArray2 > 0) {
                collection = arrayList;
                arrayList = new ArrayList(iStartArray2);
            } else {
                collection = arrayList;
                arrayList = new ArrayList();
            }
        } else if (objectClass == JSONArray.class) {
            if (iStartArray2 > 0) {
                collection = jSONArray;
                jSONArray = new JSONArray(iStartArray2);
            } else {
                collection = jSONArray;
                jSONArray = new JSONArray();
            }
        } else if (objectClass == ObjectReaderImplList.CLASS_UNMODIFIABLE_COLLECTION) {
            ArrayList arrayList2 = new ArrayList();
            c0627f = new C0627f(1);
            collection = arrayList2;
        } else if (objectClass == ObjectReaderImplList.CLASS_UNMODIFIABLE_LIST) {
            ArrayList arrayList3 = new ArrayList();
            c0627f = new C0627f(2);
            collection = arrayList3;
        } else if (objectClass == ObjectReaderImplList.CLASS_UNMODIFIABLE_SET) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            c0627f = new C0627f(3);
            collection = linkedHashSet;
        } else if (objectClass == ObjectReaderImplList.CLASS_SINGLETON) {
            ArrayList arrayList4 = new ArrayList();
            c0627f = new C0627f(17);
            collection = arrayList4;
        } else if (objectClass == ObjectReaderImplList.CLASS_SINGLETON_LIST) {
            ArrayList arrayList5 = new ArrayList();
            c0627f = new C0627f(18);
            collection = arrayList5;
        } else if (objectClass == null || objectClass == this.listType) {
            collection = (Collection) createInstance(jSONReader.context.features | j3);
        } else {
            try {
                collection = (Collection) objectClass.newInstance();
            } catch (IllegalAccessException | InstantiationException e6) {
                C0086a.m465x(jSONReader.info("create instance error " + objectClass), e6);
                return null;
            }
        }
        while (i9 < iStartArray2) {
            collection.add(jSONReader.readString());
            i9++;
        }
        return c0627f != null ? (Collection) c0627f.apply(collection) : collection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, 0L);
        }
        if (jSONReader.readIfNull()) {
            return null;
        }
        Collection hashSet = jSONReader.nextIfSet() ? new HashSet() : (Collection) createInstance(jSONReader.context.features | j3);
        char cCurrent = jSONReader.current();
        if (cCurrent == '[') {
            jSONReader.next();
            while (!jSONReader.nextIfArrayEnd()) {
                String string = jSONReader.readString();
                if (string != null || !(hashSet instanceof SortedSet)) {
                    hashSet.add(string);
                }
            }
        } else {
            if (cCurrent != '\"' && cCurrent != '\'' && cCurrent != '{') {
                C0086a.m464w(jSONReader.info());
                return null;
            }
            String string2 = jSONReader.readString();
            if (!string2.isEmpty()) {
                hashSet.add(string2);
            }
        }
        jSONReader.nextIfComma();
        return hashSet;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(long j3) {
        Class cls = this.instanceType;
        if (cls == ArrayList.class) {
            return new ArrayList();
        }
        if (cls == LinkedList.class) {
            return new LinkedList();
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException unused) {
            C0086a.m450i(this.instanceType, "create list error, type ");
            return null;
        }
    }
}
