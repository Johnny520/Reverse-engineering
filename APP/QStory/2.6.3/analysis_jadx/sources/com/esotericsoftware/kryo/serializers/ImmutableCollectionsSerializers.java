package com.esotericsoftware.kryo.serializers;

import androidx.activity.AbstractC0053;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.util.Util;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ImmutableCollectionsSerializers {
    public static void addDefaultSerializers(Kryo kryo) {
        if (Util.isClassAvailable("java.util.ImmutableCollections")) {
            JdkImmutableListSerializer.addDefaultSerializers(kryo);
            JdkImmutableMapSerializer.addDefaultSerializers(kryo);
            JdkImmutableSetSerializer.addDefaultSerializers(kryo);
        }
    }

    public static void registerSerializers(Kryo kryo) {
        JdkImmutableListSerializer.registerSerializers(kryo);
        JdkImmutableMapSerializer.registerSerializers(kryo);
        JdkImmutableSetSerializer.registerSerializers(kryo);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class JdkImmutableListSerializer extends CollectionSerializer<List<Object>> {
        private JdkImmutableListSerializer() {
            setElementsCanBeNull(false);
        }

        public static void addDefaultSerializers(Kryo kryo) {
            JdkImmutableListSerializer jdkImmutableListSerializer = new JdkImmutableListSerializer();
            kryo.addDefaultSerializer(Collections.EMPTY_LIST.getClass(), jdkImmutableListSerializer);
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{1}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            kryo.addDefaultSerializer(Collections.unmodifiableList(arrayList).getClass(), jdkImmutableListSerializer);
            Object[] objArr = {1, 2, 3, 4};
            ArrayList arrayList2 = new ArrayList(4);
            for (int i = 0; i < 4; i++) {
                Object obj2 = objArr[i];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
            }
            kryo.addDefaultSerializer(Collections.unmodifiableList(arrayList2).getClass(), jdkImmutableListSerializer);
            Object[] objArr2 = {1, 2, 3, 4};
            ArrayList arrayList3 = new ArrayList(4);
            for (int i2 = 0; i2 < 4; i2++) {
                Object obj3 = objArr2[i2];
                Objects.requireNonNull(obj3);
                arrayList3.add(obj3);
            }
            kryo.addDefaultSerializer(Collections.unmodifiableList(arrayList3).subList(0, 2).getClass(), jdkImmutableListSerializer);
        }

        public static void registerSerializers(Kryo kryo) {
            JdkImmutableListSerializer jdkImmutableListSerializer = new JdkImmutableListSerializer();
            kryo.register(Collections.EMPTY_LIST.getClass(), jdkImmutableListSerializer);
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{1}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            kryo.register(Collections.unmodifiableList(arrayList).getClass(), jdkImmutableListSerializer);
            Object[] objArr = {1, 2, 3, 4};
            ArrayList arrayList2 = new ArrayList(4);
            for (int i = 0; i < 4; i++) {
                Object obj2 = objArr[i];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
            }
            kryo.register(Collections.unmodifiableList(arrayList2).getClass(), jdkImmutableListSerializer);
            Object[] objArr2 = {1, 2, 3, 4};
            ArrayList arrayList3 = new ArrayList(4);
            for (int i2 = 0; i2 < 4; i2++) {
                Object obj3 = objArr2[i2];
                Objects.requireNonNull(obj3);
                arrayList3.add(obj3);
            }
            kryo.register(Collections.unmodifiableList(arrayList3).subList(0, 2).getClass(), jdkImmutableListSerializer);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public List<Object> copy(Kryo kryo, List<Object> list) {
            List list2 = (List) super.copy(kryo, list);
            ArrayList arrayList = new ArrayList(list2.size());
            for (Object obj : list2) {
                Objects.requireNonNull(obj);
                arrayList.add(obj);
            }
            return Collections.unmodifiableList(arrayList);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public List<Object> create(Kryo kryo, Input input, Class<? extends List<Object>> cls, int i) {
            return new ArrayList(i);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public List<Object> createCopy(Kryo kryo, List<Object> list) {
            return new ArrayList(list.size());
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer, com.esotericsoftware.kryo.Serializer
        public List<Object> read(Kryo kryo, Input input, Class<? extends List<Object>> cls) {
            List list = (List) super.read(kryo, input, (Class) cls);
            if (list == null) {
                return null;
            }
            Object[] array = list.toArray();
            ArrayList arrayList = new ArrayList(array.length);
            for (Object obj : array) {
                Objects.requireNonNull(obj);
                arrayList.add(obj);
            }
            return Collections.unmodifiableList(arrayList);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public /* bridge */ /* synthetic */ Collection create(Kryo kryo, Input input, Class cls, int i) {
            return create(kryo, input, (Class<? extends List<Object>>) cls, i);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer, com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Collection read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends List<Object>>) cls);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer, com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends List<Object>>) cls);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class JdkImmutableSetSerializer extends CollectionSerializer<Set<Object>> {
        private JdkImmutableSetSerializer() {
            setElementsCanBeNull(false);
        }

        public static void addDefaultSerializers(Kryo kryo) {
            JdkImmutableSetSerializer jdkImmutableSetSerializer = new JdkImmutableSetSerializer();
            kryo.addDefaultSerializer(Collections.EMPTY_SET.getClass(), jdkImmutableSetSerializer);
            HashSet hashSet = new HashSet(1);
            Object obj = new Object[]{1}[0];
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                C5925.m11310(AbstractC0053.m153(obj, "duplicate element: "));
                return;
            }
            kryo.addDefaultSerializer(Collections.unmodifiableSet(hashSet).getClass(), jdkImmutableSetSerializer);
            Object[] objArr = {1, 2, 3, 4};
            HashSet hashSet2 = new HashSet(4);
            for (int i = 0; i < 4; i++) {
                Object obj2 = objArr[i];
                Objects.requireNonNull(obj2);
                if (!hashSet2.add(obj2)) {
                    C5925.m11310(AbstractC0053.m153(obj2, "duplicate element: "));
                    return;
                }
            }
            kryo.addDefaultSerializer(Collections.unmodifiableSet(hashSet2).getClass(), jdkImmutableSetSerializer);
        }

        public static void registerSerializers(Kryo kryo) {
            JdkImmutableSetSerializer jdkImmutableSetSerializer = new JdkImmutableSetSerializer();
            kryo.register(Collections.EMPTY_SET.getClass(), jdkImmutableSetSerializer);
            HashSet hashSet = new HashSet(1);
            Object obj = new Object[]{1}[0];
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                C5925.m11310(AbstractC0053.m153(obj, "duplicate element: "));
                return;
            }
            kryo.register(Collections.unmodifiableSet(hashSet).getClass(), jdkImmutableSetSerializer);
            Object[] objArr = {1, 2, 3, 4};
            HashSet hashSet2 = new HashSet(4);
            for (int i = 0; i < 4; i++) {
                Object obj2 = objArr[i];
                Objects.requireNonNull(obj2);
                if (!hashSet2.add(obj2)) {
                    C5925.m11310(AbstractC0053.m153(obj2, "duplicate element: "));
                    return;
                }
            }
            kryo.register(Collections.unmodifiableSet(hashSet2).getClass(), jdkImmutableSetSerializer);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public Set<Object> copy(Kryo kryo, Set<Object> set) {
            Set set2 = (Set) super.copy(kryo, set);
            HashSet hashSet = new HashSet(set2.size());
            for (Object obj : set2) {
                Objects.requireNonNull(obj);
                hashSet.add(obj);
            }
            return Collections.unmodifiableSet(hashSet);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public Set<Object> create(Kryo kryo, Input input, Class<? extends Set<Object>> cls, int i) {
            return new HashSet();
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer, com.esotericsoftware.kryo.Serializer
        public Set<Object> read(Kryo kryo, Input input, Class<? extends Set<Object>> cls) {
            Set set = (Set) super.read(kryo, input, (Class) cls);
            if (set == null) {
                return null;
            }
            Object[] array = set.toArray();
            HashSet hashSet = new HashSet(array.length);
            for (Object obj : array) {
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    C5925.m11310(AbstractC0053.m153(obj, "duplicate element: "));
                    return null;
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public /* bridge */ /* synthetic */ Collection create(Kryo kryo, Input input, Class cls, int i) {
            return create(kryo, input, (Class<? extends Set<Object>>) cls, i);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public Set<Object> createCopy(Kryo kryo, Set<Object> set) {
            return new HashSet();
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer, com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Collection read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends Set<Object>>) cls);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer, com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends Set<Object>>) cls);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class JdkImmutableMapSerializer extends MapSerializer<Map<Object, Object>> {
        private JdkImmutableMapSerializer() {
            setKeysCanBeNull(false);
            setValuesCanBeNull(false);
        }

        public static void addDefaultSerializers(Kryo kryo) {
            JdkImmutableMapSerializer jdkImmutableMapSerializer = new JdkImmutableMapSerializer();
            kryo.addDefaultSerializer(Collections.EMPTY_MAP.getClass(), jdkImmutableMapSerializer);
            Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(1, 2)};
            HashMap map = new HashMap(1);
            Map.Entry entry = entryArr[0];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                C5925.m11310(AbstractC0053.m153(key, "duplicate key: "));
                return;
            }
            kryo.addDefaultSerializer(Collections.unmodifiableMap(map).getClass(), jdkImmutableMapSerializer);
            Map.Entry[] entryArr2 = {new AbstractMap.SimpleEntry(1, 2), new AbstractMap.SimpleEntry(3, 4)};
            HashMap map2 = new HashMap(2);
            for (int i = 0; i < 2; i++) {
                Map.Entry entry2 = entryArr2[i];
                Object key2 = entry2.getKey();
                Objects.requireNonNull(key2);
                Object value2 = entry2.getValue();
                Objects.requireNonNull(value2);
                if (map2.put(key2, value2) != null) {
                    C5925.m11310(AbstractC0053.m153(key2, "duplicate key: "));
                    return;
                }
            }
            kryo.addDefaultSerializer(Collections.unmodifiableMap(map2).getClass(), jdkImmutableMapSerializer);
        }

        public static void registerSerializers(Kryo kryo) {
            JdkImmutableMapSerializer jdkImmutableMapSerializer = new JdkImmutableMapSerializer();
            kryo.register(Collections.EMPTY_MAP.getClass(), jdkImmutableMapSerializer);
            Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(1, 2)};
            HashMap map = new HashMap(1);
            Map.Entry entry = entryArr[0];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                C5925.m11310(AbstractC0053.m153(key, "duplicate key: "));
                return;
            }
            kryo.register(Collections.unmodifiableMap(map).getClass(), jdkImmutableMapSerializer);
            Map.Entry[] entryArr2 = {new AbstractMap.SimpleEntry(1, 2), new AbstractMap.SimpleEntry(3, 4)};
            HashMap map2 = new HashMap(2);
            for (int i = 0; i < 2; i++) {
                Map.Entry entry2 = entryArr2[i];
                Object key2 = entry2.getKey();
                Objects.requireNonNull(key2);
                Object value2 = entry2.getValue();
                Objects.requireNonNull(value2);
                if (map2.put(key2, value2) != null) {
                    C5925.m11310(AbstractC0053.m153(key2, "duplicate key: "));
                    return;
                }
            }
            kryo.register(Collections.unmodifiableMap(map2).getClass(), jdkImmutableMapSerializer);
        }

        @Override // com.esotericsoftware.kryo.serializers.MapSerializer, com.esotericsoftware.kryo.Serializer
        public Map<Object, Object> copy(Kryo kryo, Map<Object, Object> map) {
            Map mapCopy = super.copy(kryo, map);
            HashMap map2 = new HashMap(mapCopy.size());
            for (Map.Entry entry : mapCopy.entrySet()) {
                Object key = entry.getKey();
                Objects.requireNonNull(key);
                Object value = entry.getValue();
                Objects.requireNonNull(value);
                map2.put(key, value);
            }
            return Collections.unmodifiableMap(map2);
        }

        @Override // com.esotericsoftware.kryo.serializers.MapSerializer
        public Map<Object, Object> create(Kryo kryo, Input input, Class<? extends Map<Object, Object>> cls, int i) {
            return new HashMap();
        }

        @Override // com.esotericsoftware.kryo.serializers.MapSerializer
        public Map<Object, Object> createCopy(Kryo kryo, Map<Object, Object> map) {
            return new HashMap();
        }

        @Override // com.esotericsoftware.kryo.serializers.MapSerializer, com.esotericsoftware.kryo.Serializer
        public Map<Object, Object> read(Kryo kryo, Input input, Class<? extends Map<Object, Object>> cls) {
            Map map = super.read(kryo, input, (Class<? extends Map>) cls);
            if (map == null) {
                return null;
            }
            HashMap map2 = new HashMap(map.size());
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Objects.requireNonNull(key);
                Object value = entry.getValue();
                Objects.requireNonNull(value);
                map2.put(key, value);
            }
            return Collections.unmodifiableMap(map2);
        }

        @Override // com.esotericsoftware.kryo.serializers.MapSerializer, com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends Map<Object, Object>>) cls);
        }
    }
}
