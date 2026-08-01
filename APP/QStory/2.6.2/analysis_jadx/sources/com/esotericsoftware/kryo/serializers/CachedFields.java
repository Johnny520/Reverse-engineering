package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.SerializerFactory;
import com.esotericsoftware.kryo.serializers.AsmField;
import com.esotericsoftware.kryo.serializers.CollectionSerializer;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import com.esotericsoftware.kryo.serializers.MapSerializer;
import com.esotericsoftware.kryo.serializers.ReflectField;
import com.esotericsoftware.kryo.serializers.UnsafeField;
import com.esotericsoftware.kryo.util.Generics;
import com.esotericsoftware.kryo.util.Util;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class CachedFields implements Comparator<FieldSerializer.CachedField> {
    static final FieldSerializer.CachedField[] emptyCachedFields = new FieldSerializer.CachedField[0];
    private Object access;
    private final FieldSerializer serializer;
    FieldSerializer.CachedField[] fields = new FieldSerializer.CachedField[0];
    FieldSerializer.CachedField[] copyFields = new FieldSerializer.CachedField[0];
    private final ArrayList<Field> removedFields = new ArrayList<>();

    public CachedFields(FieldSerializer fieldSerializer) {
        this.serializer = fieldSerializer;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void addField(java.lang.reflect.Field r18, boolean r19, java.util.ArrayList<com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField> r20, java.util.ArrayList<com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField> r21) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.serializers.CachedFields.addField(java.lang.reflect.Field, boolean, java.util.ArrayList, java.util.ArrayList):void");
    }

    private void applyAnnotations(FieldSerializer.CachedField cachedField) {
        Field field = cachedField.field;
        if (field.isAnnotationPresent(FieldSerializer.Bind.class)) {
            if (cachedField.serializer != null) {
                C3073.m6910(cachedField.field.getDeclaringClass().getName(), "@Bind applied to a field that already has a serializer: ", cachedField.field.getName());
                return;
            }
            FieldSerializer.Bind bind = (FieldSerializer.Bind) field.getAnnotation(FieldSerializer.Bind.class);
            Class clsValueClass = bind.valueClass();
            if (clsValueClass == Object.class) {
                clsValueClass = null;
            }
            if (clsValueClass != null) {
                cachedField.setValueClass(clsValueClass);
            }
            Serializer serializerNewSerializer = newSerializer(clsValueClass, bind.serializer(), bind.serializerFactory());
            if (serializerNewSerializer != null) {
                cachedField.setSerializer(serializerNewSerializer);
            }
            cachedField.setCanBeNull(bind.canBeNull());
            cachedField.setVariableLengthEncoding(bind.variableLengthEncoding());
            cachedField.setOptimizePositive(bind.optimizePositive());
        }
        if (field.isAnnotationPresent(CollectionSerializer.BindCollection.class)) {
            if (cachedField.serializer != null) {
                C3073.m6910(cachedField.field.getDeclaringClass().getName(), "@BindCollection applied to a field that already has a serializer: ", cachedField.field.getName());
                return;
            }
            if (!Collection.class.isAssignableFrom(field.getType())) {
                throw new KryoException("@BindCollection can only be used with a field implementing Collection: " + Util.className(field.getType()));
            }
            CollectionSerializer.BindCollection bindCollection = (CollectionSerializer.BindCollection) field.getAnnotation(CollectionSerializer.BindCollection.class);
            Class clsElementClass = bindCollection.elementClass();
            if (clsElementClass == Object.class) {
                clsElementClass = null;
            }
            Serializer serializerNewSerializer2 = newSerializer(clsElementClass, bindCollection.elementSerializer(), bindCollection.elementSerializerFactory());
            CollectionSerializer collectionSerializer = new CollectionSerializer();
            collectionSerializer.setElementsCanBeNull(bindCollection.elementsCanBeNull());
            if (clsElementClass != null) {
                collectionSerializer.setElementClass(clsElementClass);
            }
            if (serializerNewSerializer2 != null) {
                collectionSerializer.setElementSerializer(serializerNewSerializer2);
            }
            cachedField.setSerializer(collectionSerializer);
        }
        if (field.isAnnotationPresent(MapSerializer.BindMap.class)) {
            if (cachedField.serializer != null) {
                C3073.m6910(cachedField.field.getDeclaringClass().getName(), "@BindMap applied to a field that already has a serializer: ", cachedField.field.getName());
                return;
            }
            if (!Map.class.isAssignableFrom(field.getType())) {
                throw new KryoException("@BindMap can only be used with a field implementing Map: " + Util.className(field.getType()));
            }
            MapSerializer.BindMap bindMap = (MapSerializer.BindMap) field.getAnnotation(MapSerializer.BindMap.class);
            Class clsValueClass2 = bindMap.valueClass();
            if (clsValueClass2 == Object.class) {
                clsValueClass2 = null;
            }
            Serializer serializerNewSerializer3 = newSerializer(clsValueClass2, bindMap.valueSerializer(), bindMap.valueSerializerFactory());
            Class clsKeyClass = bindMap.keyClass();
            Class cls = clsKeyClass != Object.class ? clsKeyClass : null;
            Serializer serializerNewSerializer4 = newSerializer(cls, bindMap.keySerializer(), bindMap.keySerializerFactory());
            MapSerializer mapSerializer = new MapSerializer();
            mapSerializer.setKeysCanBeNull(bindMap.keysCanBeNull());
            mapSerializer.setValuesCanBeNull(bindMap.valuesCanBeNull());
            if (cls != null) {
                mapSerializer.setKeyClass(cls);
            }
            if (serializerNewSerializer4 != null) {
                mapSerializer.setKeySerializer(serializerNewSerializer4);
            }
            if (clsValueClass2 != null) {
                mapSerializer.setValueClass(clsValueClass2);
            }
            if (serializerNewSerializer3 != null) {
                mapSerializer.setValueSerializer(serializerNewSerializer3);
            }
            cachedField.setSerializer(mapSerializer);
        }
    }

    private FieldSerializer.CachedField newAsmField(Field field, Class cls, Generics.GenericType genericType) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return new AsmField.IntAsmField(field);
            }
            if (cls == Float.TYPE) {
                return new AsmField.FloatAsmField(field);
            }
            if (cls == Boolean.TYPE) {
                return new AsmField.BooleanAsmField(field);
            }
            if (cls == Long.TYPE) {
                return new AsmField.LongAsmField(field);
            }
            if (cls == Double.TYPE) {
                return new AsmField.DoubleAsmField(field);
            }
            if (cls == Short.TYPE) {
                return new AsmField.ShortAsmField(field);
            }
            if (cls == Character.TYPE) {
                return new AsmField.CharAsmField(field);
            }
            if (cls == Byte.TYPE) {
                return new AsmField.ByteAsmField(field);
            }
        }
        return (cls != String.class || (this.serializer.kryo.getReferences() && this.serializer.kryo.getReferenceResolver().useReferences(String.class))) ? new AsmField(field, this.serializer, genericType) : new AsmField.StringAsmField(field);
    }

    private FieldSerializer.CachedField newReflectField(Field field, Class cls, Generics.GenericType genericType) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return new ReflectField.IntReflectField(field);
            }
            if (cls == Float.TYPE) {
                return new ReflectField.FloatReflectField(field);
            }
            if (cls == Boolean.TYPE) {
                return new ReflectField.BooleanReflectField(field);
            }
            if (cls == Long.TYPE) {
                return new ReflectField.LongReflectField(field);
            }
            if (cls == Double.TYPE) {
                return new ReflectField.DoubleReflectField(field);
            }
            if (cls == Short.TYPE) {
                return new ReflectField.ShortReflectField(field);
            }
            if (cls == Character.TYPE) {
                return new ReflectField.CharReflectField(field);
            }
            if (cls == Byte.TYPE) {
                return new ReflectField.ByteReflectField(field);
            }
        }
        return new ReflectField(field, this.serializer, genericType);
    }

    private Serializer newSerializer(Class cls, Class cls2, Class cls3) {
        if (cls2 == Serializer.class) {
            cls2 = null;
        }
        if (cls3 == SerializerFactory.class) {
            cls3 = null;
        }
        if (cls3 == null && cls2 != null) {
            cls3 = SerializerFactory.ReflectionSerializerFactory.class;
        }
        if (cls3 == null) {
            return null;
        }
        return Util.newFactory(cls3, cls2).newSerializer(this.serializer.kryo, cls);
    }

    private FieldSerializer.CachedField newUnsafeField(Field field, Class cls, Generics.GenericType genericType) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return new UnsafeField.IntUnsafeField(field);
            }
            if (cls == Float.TYPE) {
                return new UnsafeField.FloatUnsafeField(field);
            }
            if (cls == Boolean.TYPE) {
                return new UnsafeField.BooleanUnsafeField(field);
            }
            if (cls == Long.TYPE) {
                return new UnsafeField.LongUnsafeField(field);
            }
            if (cls == Double.TYPE) {
                return new UnsafeField.DoubleUnsafeField(field);
            }
            if (cls == Short.TYPE) {
                return new UnsafeField.ShortUnsafeField(field);
            }
            if (cls == Character.TYPE) {
                return new UnsafeField.CharUnsafeField(field);
            }
            if (cls == Byte.TYPE) {
                return new UnsafeField.ByteUnsafeField(field);
            }
        }
        return (cls != String.class || (this.serializer.kryo.getReferences() && this.serializer.kryo.getReferenceResolver().useReferences(String.class))) ? new UnsafeField(field, this.serializer, genericType) : new UnsafeField.StringUnsafeField(field);
    }

    public void rebuild() {
        if (this.serializer.type.isInterface()) {
            FieldSerializer.CachedField[] cachedFieldArr = emptyCachedFields;
            this.fields = cachedFieldArr;
            this.copyFields = cachedFieldArr;
            this.serializer.initializeCachedFields();
            return;
        }
        ArrayList<FieldSerializer.CachedField> arrayList = new ArrayList<>();
        ArrayList<FieldSerializer.CachedField> arrayList2 = new ArrayList<>();
        boolean z = (Util.unsafe || Util.isAndroid || !Modifier.isPublic(this.serializer.type.getModifiers())) ? false : true;
        for (Class superclass = this.serializer.type; superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                addField(field, z, arrayList, arrayList2);
            }
        }
        if (this.fields.length != arrayList.size()) {
            this.fields = new FieldSerializer.CachedField[arrayList.size()];
        }
        arrayList.toArray(this.fields);
        Arrays.sort(this.fields, this);
        if (this.copyFields.length != arrayList2.size()) {
            this.copyFields = new FieldSerializer.CachedField[arrayList2.size()];
        }
        arrayList2.toArray(this.copyFields);
        Arrays.sort(this.copyFields, this);
        this.serializer.initializeCachedFields();
    }

    public void removeField(String str) {
        boolean z;
        boolean z2;
        int i = 0;
        while (true) {
            FieldSerializer.CachedField[] cachedFieldArr = this.fields;
            z = true;
            if (i >= cachedFieldArr.length) {
                z2 = false;
                break;
            }
            FieldSerializer.CachedField cachedField = cachedFieldArr[i];
            if (cachedField.name.equals(str)) {
                FieldSerializer.CachedField[] cachedFieldArr2 = this.fields;
                int length = cachedFieldArr2.length - 1;
                FieldSerializer.CachedField[] cachedFieldArr3 = new FieldSerializer.CachedField[length];
                System.arraycopy(cachedFieldArr2, 0, cachedFieldArr3, 0, i);
                System.arraycopy(this.fields, i + 1, cachedFieldArr3, i, length - i);
                this.fields = cachedFieldArr3;
                this.removedFields.add(cachedField.field);
                z2 = true;
                break;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            FieldSerializer.CachedField[] cachedFieldArr4 = this.copyFields;
            if (i2 >= cachedFieldArr4.length) {
                z = z2;
                break;
            }
            FieldSerializer.CachedField cachedField2 = cachedFieldArr4[i2];
            if (cachedField2.name.equals(str)) {
                FieldSerializer.CachedField[] cachedFieldArr5 = this.copyFields;
                int length2 = cachedFieldArr5.length - 1;
                FieldSerializer.CachedField[] cachedFieldArr6 = new FieldSerializer.CachedField[length2];
                System.arraycopy(cachedFieldArr5, 0, cachedFieldArr6, 0, i2);
                System.arraycopy(this.copyFields, i2 + 1, cachedFieldArr6, i2, length2 - i2);
                this.copyFields = cachedFieldArr6;
                this.removedFields.add(cachedField2.field);
                break;
            }
            i2++;
        }
        if (z) {
            return;
        }
        C5919.m11249(AbstractC6136.m11549(this.serializer.type, AbstractC6136.m11550("Field \"", str, "\" not found on class: ")));
    }

    @Override // java.util.Comparator
    public int compare(FieldSerializer.CachedField cachedField, FieldSerializer.CachedField cachedField2) {
        return cachedField.name.compareTo(cachedField2.name);
    }

    public void removeField(FieldSerializer.CachedField cachedField) {
        boolean z;
        boolean z2;
        int i = 0;
        while (true) {
            FieldSerializer.CachedField[] cachedFieldArr = this.fields;
            z = true;
            if (i >= cachedFieldArr.length) {
                z2 = false;
                break;
            }
            FieldSerializer.CachedField cachedField2 = cachedFieldArr[i];
            if (cachedField2 == cachedField) {
                int length = cachedFieldArr.length - 1;
                FieldSerializer.CachedField[] cachedFieldArr2 = new FieldSerializer.CachedField[length];
                System.arraycopy(cachedFieldArr, 0, cachedFieldArr2, 0, i);
                System.arraycopy(this.fields, i + 1, cachedFieldArr2, i, length - i);
                this.fields = cachedFieldArr2;
                this.removedFields.add(cachedField2.field);
                z2 = true;
                break;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            FieldSerializer.CachedField[] cachedFieldArr3 = this.copyFields;
            if (i2 >= cachedFieldArr3.length) {
                z = z2;
                break;
            }
            FieldSerializer.CachedField cachedField3 = cachedFieldArr3[i2];
            if (cachedField3 == cachedField) {
                int length2 = cachedFieldArr3.length - 1;
                FieldSerializer.CachedField[] cachedFieldArr4 = new FieldSerializer.CachedField[length2];
                System.arraycopy(cachedFieldArr3, 0, cachedFieldArr4, 0, i2);
                System.arraycopy(this.copyFields, i2 + 1, cachedFieldArr4, i2, length2 - i2);
                this.copyFields = cachedFieldArr4;
                this.removedFields.add(cachedField3.field);
                break;
            }
            i2++;
        }
        if (z) {
            return;
        }
        StringBuilder sb = new StringBuilder("Field \"");
        sb.append(cachedField);
        sb.append("\" not found on class: ");
        C5919.m11249(AbstractC6136.m11549(this.serializer.type, sb));
    }
}
