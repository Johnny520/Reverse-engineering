package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.SymbolTable;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.filter.NameFilter;
import com.alibaba.fastjson2.filter.PropertyFilter;
import com.alibaba.fastjson2.filter.PropertyPreFilter;
import com.alibaba.fastjson2.filter.ValueFilter;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriterAdapter<T> implements ObjectWriter<T> {
    static final String TYPE = "@type";
    final boolean containsNoneFieldGetter;
    final long features;
    protected final FieldWriter[] fieldWriterArray;
    final List<FieldWriter> fieldWriters;
    final boolean googleCollection;
    boolean hasFilter;
    final boolean hasValueField;
    final long[] hashCodes;
    byte[] jsonbClassInfo;
    final short[] mapping;
    NameFilter nameFilter;
    char[] nameWithColonUTF16;
    byte[] nameWithColonUTF8;
    final Class objectClass;
    PropertyFilter propertyFilter;
    PropertyPreFilter propertyPreFilter;
    final boolean serializable;
    final String typeKey;
    byte[] typeKeyJSONB;
    protected final String typeName;
    protected final long typeNameHash;
    protected final byte[] typeNameJSONB;
    protected long typeNameSymbolCache;
    ValueFilter valueFilter;

    public ObjectWriterAdapter(Class<T> cls, String str, String str2, long j10, List<FieldWriter> list) {
        if (str2 == null && cls != null) {
            str2 = (!Enum.class.isAssignableFrom(cls) || cls.isEnum()) ? TypeUtils.getTypeName(cls) : cls.getSuperclass().getName();
        }
        this.objectClass = cls;
        this.typeKey = (str == null || str.isEmpty()) ? TYPE : str;
        this.typeName = str2;
        this.typeNameHash = str2 != null ? Fnv.hashCode64(str2) : 0L;
        this.typeNameJSONB = JSONB.toBytes(str2);
        this.features = j10;
        this.fieldWriters = list;
        this.serializable = cls == null || Serializable.class.isAssignableFrom(cls);
        this.googleCollection = "com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList".equals(str2) || "com.google.common.collect.AbstractMapBasedMultimap$WrappedSet".equals(str2);
        FieldWriter[] fieldWriterArr = new FieldWriter[list.size()];
        this.fieldWriterArray = fieldWriterArr;
        list.toArray(fieldWriterArr);
        this.hasValueField = fieldWriterArr.length == 1 && (fieldWriterArr[0].features & FieldInfo.VALUE_MASK) != 0;
        int length = fieldWriterArr.length;
        long[] jArr = new long[length];
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            FieldWriter[] fieldWriterArr2 = this.fieldWriterArray;
            if (i10 >= fieldWriterArr2.length) {
                break;
            }
            FieldWriter fieldWriter = fieldWriterArr2[i10];
            jArr[i10] = Fnv.hashCode64(fieldWriter.fieldName);
            if (fieldWriter.method != null && (fieldWriter.features & FieldInfo.FIELD_MASK) == 0) {
                z10 = true;
            }
            i10++;
        }
        this.containsNoneFieldGetter = z10;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length);
        this.hashCodes = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
        this.mapping = new short[jArrCopyOf.length];
        for (int i11 = 0; i11 < length; i11++) {
            this.mapping[Arrays.binarySearch(this.hashCodes, jArr[i11])] = (short) i11;
        }
    }

    private boolean writeClassInfoSymbol(JSONWriter jSONWriter, SymbolTable symbolTable) {
        int ordinalByHashCode;
        int iIdentityHashCode = System.identityHashCode(symbolTable);
        long j10 = this.typeNameSymbolCache;
        if (j10 == 0) {
            ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.typeNameHash);
            if (ordinalByHashCode != -1) {
                this.typeNameSymbolCache = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
            }
        } else if (((int) j10) == iIdentityHashCode) {
            ordinalByHashCode = (int) (j10 >> 32);
        } else {
            ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.typeNameHash);
            if (ordinalByHashCode != -1) {
                this.typeNameSymbolCache = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
            }
        }
        if (ordinalByHashCode == -1) {
            return false;
        }
        jSONWriter.writeRaw(JSONB.Constants.BC_TYPED_ANY);
        jSONWriter.writeInt32(-ordinalByHashCode);
        return true;
    }

    public void errorOnNoneSerializable() {
        throw new JSONException("not support none serializable class ".concat(this.objectClass.getName()));
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public long getFeatures() {
        return this.features;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public FieldWriter getFieldWriter(long j10) {
        int iBinarySearch = Arrays.binarySearch(this.hashCodes, j10);
        if (iBinarySearch < 0) {
            return null;
        }
        return this.fieldWriterArray[this.mapping[iBinarySearch]];
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public List<FieldWriter> getFieldWriters() {
        return this.fieldWriters;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public final boolean hasFilter(JSONWriter jSONWriter) {
        return jSONWriter.hasFilter(this.containsNoneFieldGetter) | this.hasFilter;
    }

    public final boolean hasFilter0(JSONWriter jSONWriter) {
        return jSONWriter.hasFilter() | this.hasFilter;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void setNameFilter(NameFilter nameFilter) {
        this.nameFilter = nameFilter;
        if (nameFilter != null) {
            this.hasFilter = true;
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void setPropertyFilter(PropertyFilter propertyFilter) {
        this.propertyFilter = propertyFilter;
        if (propertyFilter != null) {
            this.hasFilter = true;
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void setPropertyPreFilter(PropertyPreFilter propertyPreFilter) {
        this.propertyPreFilter = propertyPreFilter;
        if (propertyPreFilter != null) {
            this.hasFilter = true;
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void setValueFilter(ValueFilter valueFilter) {
        this.valueFilter = valueFilter;
        if (valueFilter != null) {
            this.hasFilter = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JSONObject toJSONObject(T t10, long j10) {
        JSONObject jSONObject = new JSONObject();
        int size = this.fieldWriters.size();
        for (int i10 = 0; i10 < size; i10++) {
            FieldWriter fieldWriter = this.fieldWriters.get(i10);
            Object fieldValue = fieldWriter.getFieldValue(t10);
            String str = fieldWriter.format;
            Class cls = fieldWriter.fieldClass;
            if (str != null) {
                if (cls == Date.class) {
                    fieldValue = "millis".equals(str) ? Long.valueOf(((Date) fieldValue).getTime()) : DateUtils.format((Date) fieldValue, str);
                } else if (cls == LocalDate.class) {
                    fieldValue = DateUtils.format((LocalDate) fieldValue, str);
                } else if (cls == LocalDateTime.class) {
                    fieldValue = DateUtils.format((LocalDateTime) fieldValue, str);
                }
            }
            if ((fieldWriter.features & FieldInfo.UNWRAPPED_MASK) == 0) {
                if (fieldValue != null) {
                    String name = fieldValue.getClass().getName();
                    if (Collection.class.isAssignableFrom(cls) && fieldValue.getClass() != JSONObject.class && !name.equals("com.alibaba.fastjson.JSONObject")) {
                        Collection collection = (Collection) fieldValue;
                        JSONArray jSONArray = new JSONArray(collection.size());
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            jSONArray.add(next == t10 ? jSONObject : JSON.toJSON(next));
                        }
                        fieldValue = jSONArray;
                    }
                }
                if (fieldValue != null || ((this.features | j10) & JSONWriter.Feature.WriteNulls.mask) != 0) {
                    if (fieldValue == t10) {
                        fieldValue = jSONObject;
                    }
                    if ((fieldValue instanceof Enum) && (JSONWriter.Feature.WriteEnumsUsingName.mask & j10) != 0) {
                        fieldValue = ((Enum) fieldValue).name();
                    }
                    if ((fieldWriter instanceof FieldWriterObject) && fieldValue != null && !(fieldValue instanceof Map)) {
                        ObjectWriter initWriter = fieldWriter.getInitWriter();
                        if (initWriter == null) {
                            initWriter = JSONFactory.getObjectWriter(fieldWriter.fieldType, this.features | j10);
                        }
                        if (initWriter instanceof ObjectWriterAdapter) {
                            ObjectWriterAdapter objectWriterAdapter = (ObjectWriterAdapter) initWriter;
                            fieldValue = !objectWriterAdapter.getFieldWriters().isEmpty() ? objectWriterAdapter.toJSONObject(fieldValue) : JSON.toJSON(fieldValue);
                        }
                    }
                    jSONObject.put(fieldWriter.fieldName, fieldValue);
                }
            } else if (fieldValue instanceof Map) {
                jSONObject.putAll((Map) fieldValue);
            } else {
                ObjectWriter initWriter2 = fieldWriter.getInitWriter();
                if (initWriter2 == null) {
                    initWriter2 = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter(cls);
                }
                List<FieldWriter> fieldWriters = initWriter2.getFieldWriters();
                int size2 = fieldWriters.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    FieldWriter fieldWriter2 = fieldWriters.get(i11);
                    jSONObject.put(fieldWriter2.fieldName, fieldWriter2.getFieldValue(fieldValue));
                }
            }
        }
        return jSONObject;
    }

    public Map<String, Object> toMap(Object obj) {
        int size = this.fieldWriters.size();
        JSONObject jSONObject = new JSONObject(size, 1.0f);
        for (int i10 = 0; i10 < size; i10++) {
            FieldWriter fieldWriter = this.fieldWriters.get(i10);
            jSONObject.put(fieldWriter.fieldName, fieldWriter.getFieldValue(obj));
        }
        return jSONObject;
    }

    public String toString() {
        return this.objectClass.getName();
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (this.hasValueField) {
            this.fieldWriterArray[0].writeValue(jSONWriter, obj);
            return;
        }
        long features = this.features | j10 | jSONWriter.getFeatures();
        boolean z10 = (JSONWriter.Feature.BeanToArray.mask & features) != 0;
        if (jSONWriter.jsonb) {
            if (z10) {
                writeArrayMappingJSONB(jSONWriter, obj, obj2, type, j10);
                return;
            } else {
                writeJSONB(jSONWriter, obj, obj2, type, j10);
                return;
            }
        }
        if (this.googleCollection) {
            ObjectWriterImplCollection.INSTANCE.write(jSONWriter, (Collection) obj, obj2, type, j10);
            return;
        }
        if (z10) {
            writeArrayMapping(jSONWriter, obj, obj2, type, j10);
            return;
        }
        if (!this.serializable) {
            if ((JSONWriter.Feature.ErrorOnNoneSerializable.mask & features) != 0) {
                errorOnNoneSerializable();
                return;
            } else if ((features & JSONWriter.Feature.IgnoreNoneSerializable.mask) != 0) {
                jSONWriter.writeNull();
                return;
            }
        }
        if (hasFilter(jSONWriter)) {
            writeWithFilter(jSONWriter, obj, obj2, type, j10);
            return;
        }
        jSONWriter.startObject();
        if (jSONWriter.isWriteTypeInfo(obj, this.features | j10)) {
            writeTypeInfo(jSONWriter);
        }
        int size = this.fieldWriters.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.fieldWriters.get(i10).write(jSONWriter, obj);
        }
        jSONWriter.endObject();
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeArrayMappingJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (jSONWriter.isWriteTypeInfo(obj, type, j10)) {
            writeClassInfo(jSONWriter);
        }
        int size = this.fieldWriters.size();
        jSONWriter.startArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            this.fieldWriters.get(i10).writeValue(jSONWriter, obj);
        }
    }

    public final void writeClassInfo(JSONWriter jSONWriter) {
        SymbolTable symbolTable = jSONWriter.symbolTable;
        if (symbolTable == null || !writeClassInfoSymbol(jSONWriter, symbolTable)) {
            jSONWriter.writeTypeName(this.typeNameJSONB, this.typeNameHash);
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        long features = this.features | j10 | jSONWriter.getFeatures();
        if (!this.serializable) {
            if ((JSONWriter.Feature.ErrorOnNoneSerializable.mask & features) != 0) {
                errorOnNoneSerializable();
                return;
            } else if ((JSONWriter.Feature.IgnoreNoneSerializable.mask & features) != 0) {
                jSONWriter.writeNull();
                return;
            }
        }
        if ((features & JSONWriter.Feature.IgnoreNoneSerializable.mask) != 0) {
            writeWithFilter(jSONWriter, obj, obj2, type, j10);
            return;
        }
        int length = this.fieldWriterArray.length;
        if (jSONWriter.isWriteTypeInfo(obj, type, j10)) {
            writeClassInfo(jSONWriter);
        }
        jSONWriter.startObject();
        for (int i10 = 0; i10 < length; i10++) {
            this.fieldWriters.get(i10).write(jSONWriter, obj);
        }
        jSONWriter.endObject();
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public boolean writeTypeInfo(JSONWriter jSONWriter) {
        if (jSONWriter.utf8) {
            if (this.nameWithColonUTF8 == null) {
                int length = this.typeKey.length();
                int length2 = this.typeName.length();
                int i10 = length + length2;
                byte[] bArr = new byte[i10 + 5];
                bArr[0] = 34;
                this.typeKey.getBytes(0, length, bArr, 1);
                bArr[length + 1] = 34;
                bArr[length + 2] = 58;
                bArr[length + 3] = 34;
                this.typeName.getBytes(0, length2, bArr, length + 4);
                bArr[i10 + 4] = 34;
                this.nameWithColonUTF8 = bArr;
            }
            jSONWriter.writeNameRaw(this.nameWithColonUTF8);
            return true;
        }
        if (!jSONWriter.utf16) {
            if (!jSONWriter.jsonb) {
                jSONWriter.writeString(this.typeKey);
                jSONWriter.writeColon();
                jSONWriter.writeString(this.typeName);
                return true;
            }
            if (this.typeKeyJSONB == null) {
                this.typeKeyJSONB = JSONB.toBytes(this.typeKey);
            }
            jSONWriter.writeRaw(this.typeKeyJSONB);
            jSONWriter.writeRaw(this.typeNameJSONB);
            return true;
        }
        if (this.nameWithColonUTF16 == null) {
            int length3 = this.typeKey.length();
            int length4 = this.typeName.length();
            int i11 = length3 + length4;
            char[] cArr = new char[i11 + 5];
            cArr[0] = '\"';
            this.typeKey.getChars(0, length3, cArr, 1);
            cArr[length3 + 1] = '\"';
            cArr[length3 + 2] = ':';
            cArr[length3 + 3] = '\"';
            this.typeName.getChars(0, length4, cArr, length3 + 4);
            cArr[i11 + 4] = '\"';
            this.nameWithColonUTF16 = cArr;
        }
        jSONWriter.writeNameRaw(this.nameWithColonUTF16);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0 A[PHI: r19
  0x00c0: PHI (r19v6 int) = (r19v1 int), (r19v1 int), (r19v1 int), (r19v1 int), (r19v7 int) binds: [B:78:0x0103, B:74:0x00f5, B:67:0x00e8, B:59:0x00d5, B:50:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeWithFilter(com.alibaba.fastjson2.JSONWriter r38, java.lang.Object r39, java.lang.Object r40, java.lang.reflect.Type r41, long r42) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.ObjectWriterAdapter.writeWithFilter(com.alibaba.fastjson2.JSONWriter, java.lang.Object, java.lang.Object, java.lang.reflect.Type, long):void");
    }

    public ObjectWriterAdapter(Class<T> cls, List<FieldWriter> list) {
        this(cls, null, null, 0L, list);
    }

    public JSONObject toJSONObject(T t10) {
        return toJSONObject(t10, 0L);
    }
}
