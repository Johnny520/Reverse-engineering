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
import com.alibaba.fastjson2.filter.AfterFilter;
import com.alibaba.fastjson2.filter.BeanContext;
import com.alibaba.fastjson2.filter.BeforeFilter;
import com.alibaba.fastjson2.filter.ContextNameFilter;
import com.alibaba.fastjson2.filter.ContextValueFilter;
import com.alibaba.fastjson2.filter.LabelFilter;
import com.alibaba.fastjson2.filter.NameFilter;
import com.alibaba.fastjson2.filter.PropertyFilter;
import com.alibaba.fastjson2.filter.PropertyPreFilter;
import com.alibaba.fastjson2.filter.ValueFilter;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
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
    private String typeName;
    protected long typeNameHash;
    protected byte[] typeNameJSONB;
    protected long typeNameSymbolCache;
    ValueFilter valueFilter;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterAdapter(Class<T> cls, String str, String str2, long j3, List<FieldWriter> list) {
        this.objectClass = cls;
        this.typeName = str2;
        this.typeKey = (str == null || str.isEmpty()) ? TYPE : str;
        this.features = j3;
        this.fieldWriters = list;
        this.serializable = cls == null || Serializable.class.isAssignableFrom(cls);
        this.googleCollection = "com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList".equals(str2) || "com.google.common.collect.AbstractMapBasedMultimap$WrappedSet".equals(str2);
        FieldWriter[] fieldWriterArr = new FieldWriter[list.size()];
        this.fieldWriterArray = fieldWriterArr;
        list.toArray(fieldWriterArr);
        this.hasValueField = fieldWriterArr.length == 1 && (fieldWriterArr[0].features & FieldInfo.VALUE_MASK) != 0;
        int length = fieldWriterArr.length;
        long[] jArr = new long[length];
        int i9 = 0;
        boolean z9 = false;
        while (true) {
            FieldWriter[] fieldWriterArr2 = this.fieldWriterArray;
            if (i9 >= fieldWriterArr2.length) {
                break;
            }
            FieldWriter fieldWriter = fieldWriterArr2[i9];
            jArr[i9] = Fnv.hashCode64(fieldWriter.fieldName);
            if (fieldWriter.method != null && (fieldWriter.features & FieldInfo.FIELD_MASK) == 0) {
                z9 = true;
            }
            i9++;
        }
        this.containsNoneFieldGetter = z9;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length);
        this.hashCodes = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
        this.mapping = new short[jArrCopyOf.length];
        for (int i10 = 0; i10 < length; i10++) {
            this.mapping[Arrays.binarySearch(this.hashCodes, jArr[i10])] = (short) i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean writeClassInfoSymbol(JSONWriter jSONWriter, SymbolTable symbolTable) {
        int ordinalByHashCode;
        int iIdentityHashCode = System.identityHashCode(symbolTable);
        long j3 = this.typeNameSymbolCache;
        if (j3 == 0) {
            ordinalByHashCode = symbolTable.getOrdinalByHashCode(getTypeNameHash());
            if (ordinalByHashCode != -1) {
                this.typeNameSymbolCache = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
            }
        } else if (((int) j3) == iIdentityHashCode) {
            ordinalByHashCode = (int) (j3 >> 32);
        } else {
            ordinalByHashCode = symbolTable.getOrdinalByHashCode(getTypeNameHash());
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void errorOnNoneSerializable() {
        throw new JSONException("not support none serializable class ".concat(this.objectClass.getName()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public long getFeatures() {
        return this.features;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public FieldWriter getFieldWriter(long j3) {
        int iBinarySearch = Arrays.binarySearch(this.hashCodes, j3);
        if (iBinarySearch < 0) {
            return null;
        }
        return this.fieldWriterArray[this.mapping[iBinarySearch]];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public List<FieldWriter> getFieldWriters() {
        return this.fieldWriters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getTypeName() {
        Class cls;
        if (this.typeName == null && (cls = this.objectClass) != null) {
            if (!Enum.class.isAssignableFrom(cls) || this.objectClass.isEnum()) {
                this.typeName = TypeUtils.getTypeName(this.objectClass);
            } else {
                this.typeName = this.objectClass.getSuperclass().getName();
            }
        }
        return this.typeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long getTypeNameHash() {
        String typeName;
        if (this.typeNameHash == 0 && (typeName = getTypeName()) != null) {
            this.typeNameHash = Fnv.hashCode64(typeName);
        }
        return this.typeNameHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte[] getTypeNameJSONB() {
        String typeName;
        if (this.typeNameJSONB == null && (typeName = getTypeName()) != null) {
            this.typeNameJSONB = JSONB.toBytes(typeName);
        }
        return this.typeNameJSONB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public final boolean hasFilter(JSONWriter jSONWriter) {
        return this.hasFilter || jSONWriter.hasFilter(this.containsNoneFieldGetter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void setNameFilter(NameFilter nameFilter) {
        this.nameFilter = nameFilter;
        if (nameFilter != null) {
            this.hasFilter = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void setPropertyFilter(PropertyFilter propertyFilter) {
        this.propertyFilter = propertyFilter;
        if (propertyFilter != null) {
            this.hasFilter = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void setPropertyPreFilter(PropertyPreFilter propertyPreFilter) {
        this.propertyPreFilter = propertyPreFilter;
        if (propertyPreFilter != null) {
            this.hasFilter = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void setValueFilter(ValueFilter valueFilter) {
        this.valueFilter = valueFilter;
        if (valueFilter != null) {
            this.hasFilter = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v15, resolved type: com.alibaba.fastjson2.writer.ObjectWriterAdapter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: com.alibaba.fastjson2.writer.FieldWriter */
    /* JADX WARN: Multi-variable type inference failed */
    public JSONObject toJSONObject(T t9, long j3) {
        JSONObject jSONObject = new JSONObject();
        for (FieldWriter fieldWriter : this.fieldWriters) {
            Object fieldValue = fieldWriter.getFieldValue(t9);
            Class cls = fieldWriter.fieldClass;
            if ((fieldWriter.features & FieldInfo.UNWRAPPED_MASK) == 0) {
                if (fieldValue != null) {
                    String name = fieldValue.getClass().getName();
                    if (Collection.class.isAssignableFrom(cls) && fieldValue.getClass() != JSONObject.class && !name.equals("com.alibaba.fastjson.JSONObject")) {
                        Collection collection = (Collection) fieldValue;
                        JSONArray jSONArray = new JSONArray(collection.size());
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            jSONArray.add(next == t9 ? jSONObject : JSON.toJSON(next));
                        }
                        fieldValue = jSONArray;
                    }
                }
                if (fieldValue != null || ((this.features | j3) & JSONWriter.Feature.WriteNulls.mask) != 0) {
                    if (fieldValue == t9) {
                        fieldValue = jSONObject;
                    }
                    if ((fieldValue instanceof Enum) && (JSONWriter.Feature.WriteEnumsUsingName.mask & j3) != 0) {
                        fieldValue = ((Enum) fieldValue).name();
                    }
                    if ((fieldWriter instanceof FieldWriterObject) && fieldValue != null && !(fieldValue instanceof Map)) {
                        ObjectWriter initWriter = fieldWriter.getInitWriter();
                        if (initWriter == null) {
                            initWriter = JSONFactory.getObjectWriter(fieldWriter.fieldType, this.features | j3);
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
                    initWriter2 = JSONFactory.defaultObjectWriterProvider.getObjectWriter(fieldWriter.fieldClass);
                }
                for (FieldWriter fieldWriter2 : initWriter2.getFieldWriters()) {
                    jSONObject.put(fieldWriter2.fieldName, fieldWriter2.getFieldValue(fieldValue));
                }
            }
        }
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Map<String, Object> toMap(Object obj) {
        JSONObject jSONObject = new JSONObject(this.fieldWriters.size());
        for (int i9 = 0; i9 < this.fieldWriters.size(); i9++) {
            FieldWriter fieldWriter = this.fieldWriters.get(i9);
            jSONObject.put(fieldWriter.fieldName, fieldWriter.getFieldValue(obj));
        }
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return this.objectClass.getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (this.hasValueField) {
            this.fieldWriterArray[0].writeValue(jSONWriter, obj);
            return;
        }
        long features = j3 | this.features | jSONWriter.getFeatures();
        boolean z9 = (JSONWriter.Feature.BeanToArray.mask & features) != 0;
        if (jSONWriter.jsonb) {
            if (z9) {
                writeArrayMappingJSONB(jSONWriter, obj, obj2, type, j3);
                return;
            } else {
                writeJSONB(jSONWriter, obj, obj2, type, j3);
                return;
            }
        }
        if (this.googleCollection) {
            ObjectWriterImplCollection.INSTANCE.write(jSONWriter, (Collection) obj, obj2, type, j3);
            return;
        }
        if (z9) {
            writeArrayMapping(jSONWriter, obj, obj2, type, j3);
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
            writeWithFilter(jSONWriter, obj, obj2, type, j3);
            return;
        }
        jSONWriter.startObject();
        if (((this.features | j3) & JSONWriter.Feature.WriteClassName.mask) != 0 || jSONWriter.isWriteTypeInfo(obj, j3)) {
            writeTypeInfo(jSONWriter);
        }
        int size = this.fieldWriters.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.fieldWriters.get(i9).write(jSONWriter, obj);
        }
        jSONWriter.endObject();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeArrayMappingJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (jSONWriter.isWriteTypeInfo(obj, type, j3)) {
            writeClassInfo(jSONWriter);
        }
        int size = this.fieldWriters.size();
        jSONWriter.startArray(size);
        for (int i9 = 0; i9 < size; i9++) {
            this.fieldWriters.get(i9).writeValue(jSONWriter, obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeClassInfo(JSONWriter jSONWriter) {
        SymbolTable symbolTable = jSONWriter.symbolTable;
        if (symbolTable == null || !writeClassInfoSymbol(jSONWriter, symbolTable)) {
            jSONWriter.writeTypeName(getTypeNameJSONB(), getTypeNameHash());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        long features = this.features | j3 | jSONWriter.getFeatures();
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
            writeWithFilter(jSONWriter, obj, obj2, type, j3);
            return;
        }
        int length = this.fieldWriterArray.length;
        if (jSONWriter.isWriteTypeInfo(obj, type, j3)) {
            writeClassInfo(jSONWriter);
        }
        jSONWriter.startObject();
        for (int i9 = 0; i9 < length; i9++) {
            this.fieldWriters.get(i9).write(jSONWriter, obj);
        }
        jSONWriter.endObject();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public boolean writeTypeInfo(JSONWriter jSONWriter) {
        String typeName = getTypeName();
        if (jSONWriter.utf8) {
            if (this.nameWithColonUTF8 == null) {
                int length = this.typeKey.length();
                int length2 = typeName.length();
                int i9 = length + length2;
                byte[] bArr = new byte[i9 + 5];
                bArr[0] = 34;
                this.typeKey.getBytes(0, length, bArr, 1);
                bArr[length + 1] = 34;
                bArr[length + 2] = 58;
                bArr[length + 3] = 34;
                typeName.getBytes(0, length2, bArr, length + 4);
                bArr[i9 + 4] = 34;
                this.nameWithColonUTF8 = bArr;
            }
            jSONWriter.writeNameRaw(this.nameWithColonUTF8);
            return true;
        }
        if (!jSONWriter.utf16) {
            if (!jSONWriter.jsonb) {
                jSONWriter.writeString(this.typeKey);
                jSONWriter.writeColon();
                jSONWriter.writeString(typeName);
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
            int length4 = typeName.length();
            int i10 = length3 + length4;
            char[] cArr = new char[i10 + 5];
            cArr[0] = '\"';
            this.typeKey.getChars(0, length3, cArr, 1);
            cArr[length3 + 1] = '\"';
            cArr[length3 + 2] = ':';
            cArr[length3 + 3] = '\"';
            typeName.getChars(0, length4, cArr, length3 + 4);
            cArr[i10 + 4] = '\"';
            this.nameWithColonUTF16 = cArr;
        }
        jSONWriter.writeNameRaw(this.nameWithColonUTF16);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5 A[PHI: r29 r30
  0x00b5: PHI (r29v4 int) = (r29v1 int), (r29v1 int), (r29v1 int), (r29v1 int), (r29v5 int) binds: [B:71:0x00fa, B:67:0x00ec, B:60:0x00df, B:52:0x00cc, B:45:0x00b3] A[DONT_GENERATE, DONT_INLINE]
  0x00b5: PHI (r30v4 int) = (r30v1 int), (r30v1 int), (r30v1 int), (r30v1 int), (r30v5 int) binds: [B:71:0x00fa, B:67:0x00ec, B:60:0x00df, B:52:0x00cc, B:45:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void writeWithFilter(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        int i9;
        int i10;
        PropertyPreFilter propertyPreFilter;
        NameFilter nameFilter;
        ContextNameFilter contextNameFilter;
        ValueFilter valueFilter;
        ContextValueFilter contextValueFilter;
        long j4;
        BeanContext beanContext;
        boolean z9;
        JSONWriter jSONWriter2;
        BeanContext beanContext2;
        Field declaredField;
        String str;
        ObjectWriterAdapter<T> objectWriterAdapter = this;
        JSONWriter jSONWriter3 = jSONWriter;
        if (obj == null) {
            jSONWriter3.writeNull();
            return;
        }
        if (!jSONWriter3.isWriteTypeInfo(obj, type, objectWriterAdapter.features | j3)) {
            jSONWriter3.startObject();
        } else if (jSONWriter3.jsonb) {
            writeClassInfo(jSONWriter);
            jSONWriter3.startObject();
        } else {
            jSONWriter3.startObject();
            writeTypeInfo(jSONWriter);
        }
        JSONWriter.Context context = jSONWriter3.context;
        boolean z10 = ((context.getFeatures() | j3) & JSONWriter.Feature.IgnoreNonFieldGetter.mask) != 0;
        BeforeFilter beforeFilter = context.getBeforeFilter();
        if (beforeFilter != null) {
            beforeFilter.writeBefore(jSONWriter3, obj);
        }
        PropertyPreFilter propertyPreFilter2 = context.getPropertyPreFilter();
        if (propertyPreFilter2 == null) {
            propertyPreFilter2 = objectWriterAdapter.propertyPreFilter;
        }
        PropertyPreFilter propertyPreFilter3 = propertyPreFilter2;
        NameFilter nameFilter2 = context.getNameFilter();
        NameFilter nameFilter3 = objectWriterAdapter.nameFilter;
        if (nameFilter2 != null) {
            if (nameFilter3 != null) {
                nameFilter2 = NameFilter.compose(nameFilter3, nameFilter2);
            }
            nameFilter3 = nameFilter2;
        }
        ContextNameFilter contextNameFilter2 = context.getContextNameFilter();
        ValueFilter valueFilter2 = context.getValueFilter();
        ValueFilter valueFilter3 = objectWriterAdapter.valueFilter;
        if (valueFilter2 != null) {
            if (valueFilter3 != null) {
                valueFilter2 = ValueFilter.compose(valueFilter3, valueFilter2);
            }
            valueFilter3 = valueFilter2;
        }
        ContextValueFilter contextValueFilter2 = context.getContextValueFilter();
        PropertyFilter propertyFilter = context.getPropertyFilter();
        if (propertyFilter == null) {
            propertyFilter = objectWriterAdapter.propertyFilter;
        }
        PropertyFilter propertyFilter2 = propertyFilter;
        LabelFilter labelFilter = context.getLabelFilter();
        int size = objectWriterAdapter.fieldWriters.size();
        int i11 = 0;
        while (i11 < size) {
            FieldWriter fieldWriter = objectWriterAdapter.fieldWriters.get(i11);
            Field field = fieldWriter.field;
            if (z10) {
                i9 = size;
                i10 = i11;
                if (fieldWriter.method != null && (fieldWriter.features & FieldInfo.FIELD_MASK) == 0) {
                    propertyPreFilter = propertyPreFilter3;
                    nameFilter = nameFilter3;
                    contextNameFilter = contextNameFilter2;
                    valueFilter = valueFilter3;
                    contextValueFilter = contextValueFilter2;
                }
                i11 = i10 + 1;
                nameFilter3 = nameFilter;
                contextNameFilter2 = contextNameFilter;
                valueFilter3 = valueFilter;
                contextValueFilter2 = contextValueFilter;
                size = i9;
                propertyPreFilter3 = propertyPreFilter;
                objectWriterAdapter = this;
            } else {
                i9 = size;
                i10 = i11;
            }
            String str2 = fieldWriter.fieldName;
            if ((propertyPreFilter3 == null || propertyPreFilter3.process(jSONWriter3, obj, str2)) && (labelFilter == null || (str = fieldWriter.label) == null || str.isEmpty() || labelFilter.apply(str))) {
                if (nameFilter3 == null && propertyFilter2 == null && valueFilter3 == null && contextValueFilter2 == null && contextNameFilter2 == null) {
                    fieldWriter.write(jSONWriter3, obj);
                } else {
                    try {
                        Object fieldValue = fieldWriter.getFieldValue(obj);
                        if (fieldValue != null || jSONWriter3.isWriteNulls()) {
                            String strProcess = nameFilter3 != null ? nameFilter3.process(obj, str2, fieldValue) : str2;
                            if (contextNameFilter2 != null) {
                                propertyPreFilter = propertyPreFilter3;
                                beanContext = new BeanContext(objectWriterAdapter.objectClass, fieldWriter.method, field, fieldWriter.fieldName, fieldWriter.label, fieldWriter.fieldClass, fieldWriter.fieldType, fieldWriter.features, fieldWriter.format);
                                strProcess = contextNameFilter2.process(beanContext, obj, strProcess, fieldValue);
                            } else {
                                propertyPreFilter = propertyPreFilter3;
                                beanContext = null;
                            }
                            if (propertyFilter2 == null || propertyFilter2.apply(obj, str2, fieldValue)) {
                                boolean z11 = (strProcess == null || strProcess == str2) ? false : true;
                                Object objApply = valueFilter3 != null ? valueFilter3.apply(obj, str2, fieldValue) : fieldValue;
                                if (contextValueFilter2 != null) {
                                    if (beanContext == null) {
                                        if (field != null || fieldWriter.method == null) {
                                            z9 = z11;
                                            declaredField = field;
                                        } else {
                                            z9 = z11;
                                            declaredField = BeanUtils.getDeclaredField(objectWriterAdapter.objectClass, fieldWriter.fieldName);
                                        }
                                        beanContext2 = new BeanContext(objectWriterAdapter.objectClass, fieldWriter.method, declaredField, fieldWriter.fieldName, fieldWriter.label, fieldWriter.fieldClass, fieldWriter.fieldType, fieldWriter.features, fieldWriter.format);
                                    } else {
                                        z9 = z11;
                                        beanContext2 = beanContext;
                                    }
                                    objApply = contextValueFilter2.process(beanContext2, obj, strProcess, objApply);
                                } else {
                                    z9 = z11;
                                }
                                if (objApply != fieldValue) {
                                    if (z9) {
                                        jSONWriter2 = jSONWriter;
                                        jSONWriter2.writeName(strProcess);
                                        jSONWriter2.writeColon();
                                    } else {
                                        jSONWriter2 = jSONWriter;
                                        fieldWriter.writeFieldName(jSONWriter2);
                                    }
                                    if (objApply == null) {
                                        jSONWriter2.writeNull();
                                        jSONWriter3 = jSONWriter2;
                                    } else {
                                        ObjectWriter objectWriter = fieldWriter.getObjectWriter(jSONWriter2, objApply.getClass());
                                        Object obj3 = objApply;
                                        jSONWriter3 = jSONWriter2;
                                        nameFilter = nameFilter3;
                                        contextNameFilter = contextNameFilter2;
                                        valueFilter = valueFilter3;
                                        contextValueFilter = contextValueFilter2;
                                        objectWriter.write(jSONWriter3, obj3, obj2, type, j3);
                                    }
                                } else {
                                    jSONWriter3 = jSONWriter;
                                    nameFilter = nameFilter3;
                                    contextNameFilter = contextNameFilter2;
                                    valueFilter = valueFilter3;
                                    contextValueFilter = contextValueFilter2;
                                    if (z9) {
                                        jSONWriter3.writeName(strProcess);
                                        jSONWriter3.writeColon();
                                        if (fieldValue == null) {
                                            fieldWriter.getObjectWriter(jSONWriter3, fieldWriter.fieldClass).write(jSONWriter3, null, obj2, type, j3);
                                        } else {
                                            fieldWriter.getObjectWriter(jSONWriter3, fieldValue.getClass()).write(jSONWriter3, fieldValue, obj2, type, j3);
                                        }
                                    } else {
                                        fieldWriter.write(jSONWriter3, obj);
                                    }
                                }
                            } else {
                                jSONWriter3 = jSONWriter;
                            }
                        }
                        nameFilter = nameFilter3;
                        contextNameFilter = contextNameFilter2;
                        valueFilter = valueFilter3;
                        contextValueFilter = contextValueFilter2;
                    } finally {
                        if ((j4 > j ? 1 : (j4 == j ? 0 : -1)) != 0) {
                        }
                    }
                }
                propertyPreFilter = propertyPreFilter3;
                nameFilter = nameFilter3;
                contextNameFilter = contextNameFilter2;
                valueFilter = valueFilter3;
                contextValueFilter = contextValueFilter2;
            }
            i11 = i10 + 1;
            nameFilter3 = nameFilter;
            contextNameFilter2 = contextNameFilter;
            valueFilter3 = valueFilter;
            contextValueFilter2 = contextValueFilter;
            size = i9;
            propertyPreFilter3 = propertyPreFilter;
            objectWriterAdapter = this;
        }
        AfterFilter afterFilter = context.getAfterFilter();
        if (afterFilter != null) {
            afterFilter.writeAfter(jSONWriter3, obj);
        }
        jSONWriter3.endObject();
    }

    public ObjectWriterAdapter(Class<T> cls, List<FieldWriter> list) {
        this(cls, null, null, 0L, list);
    }

    public JSONObject toJSONObject(T t9) {
        return toJSONObject(t9, 0L);
    }
}
