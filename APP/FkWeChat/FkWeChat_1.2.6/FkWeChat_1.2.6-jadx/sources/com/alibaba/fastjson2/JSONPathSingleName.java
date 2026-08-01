package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderBean;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.reader.ValueConsumer;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.writer.FieldWriter;
import com.alibaba.fastjson2.writer.ObjectWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class JSONPathSingleName extends JSONPathSingle {
    final String name;
    final long nameHashCode;

    public JSONPathSingleName(String str, JSONPathSegmentName jSONPathSegmentName, JSONPath.Feature... featureArr) {
        super(jSONPathSegmentName, str, featureArr);
        this.name = jSONPathSegmentName.name;
        this.nameHashCode = jSONPathSegmentName.nameHashCode;
    }

    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public boolean contains(Object obj) {
        FieldWriter fieldWriter;
        if (obj instanceof Map) {
            return ((Map) obj).containsKey(this.name);
        }
        if (obj instanceof List) {
            List list = (List) obj;
            return !list.isEmpty() && contains(list.get(0));
        }
        ObjectWriter objectWriter = getWriterContext().provider.getObjectWriter((Class) obj.getClass());
        return (objectWriter == null || (fieldWriter = objectWriter.getFieldWriter(this.nameHashCode)) == null || fieldWriter.getFieldValue(obj) == null) ? false : true;
    }

    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public Object eval(Object obj) {
        FieldWriter fieldWriter;
        Object fieldValue;
        Long lValueOf = null;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            fieldValue = map.get(this.name);
            if (fieldValue == null) {
                boolean zIsNumber = IOUtils.isNumber(this.name);
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    if ((key instanceof Enum) && ((Enum) key).name().equals(this.name)) {
                        fieldValue = entry.getValue();
                        break;
                    }
                    if (key instanceof Long) {
                        if (lValueOf == null && zIsNumber) {
                            lValueOf = Long.valueOf(Long.parseLong(this.name));
                        }
                        if (key.equals(lValueOf)) {
                            fieldValue = entry.getValue();
                            break;
                        }
                    }
                }
            }
        } else {
            ObjectWriter objectWriter = getWriterContext().getObjectWriter(obj.getClass());
            if (objectWriter == null || (fieldWriter = objectWriter.getFieldWriter(this.nameHashCode)) == null) {
                return null;
            }
            fieldValue = fieldWriter.getFieldValue(obj);
        }
        return (this.features & JSONPath.Feature.AlwaysReturnList.mask) != 0 ? fieldValue == null ? new JSONArray() : JSONArray.m6185of(fieldValue) : fieldValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object extract(com.alibaba.fastjson2.JSONReader r9) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONPathSingleName.extract(com.alibaba.fastjson2.JSONReader):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public int extractInt32Value(JSONReader jSONReader) {
        if (jSONReader.nextIfObjectStart()) {
            while (jSONReader.f4541ch != '}') {
                if (jSONReader.readFieldNameHashCode() == this.nameHashCode) {
                    char c10 = jSONReader.f4541ch;
                    if (c10 == '\"' || c10 == '\'') {
                        return Integer.parseInt(jSONReader.readString());
                    }
                    if (c10 != '+' && c10 != '-') {
                        if (c10 != ']') {
                            if (c10 != 'f') {
                                if (c10 == 'n') {
                                    jSONReader.readNull();
                                    jSONReader.wasNull = true;
                                    return 0;
                                }
                                if (c10 != 't') {
                                    switch (c10) {
                                        case '0':
                                        case '1':
                                        case Opcodes.AALOAD /* 50 */:
                                        case Opcodes.BALOAD /* 51 */:
                                        case '4':
                                        case Opcodes.SALOAD /* 53 */:
                                        case Opcodes.ISTORE /* 54 */:
                                        case Opcodes.LSTORE /* 55 */:
                                        case Opcodes.FSTORE /* 56 */:
                                        case Opcodes.DSTORE /* 57 */:
                                            break;
                                        default:
                                            C1588i.m6279a("TODO : ", jSONReader.f4541ch);
                                            break;
                                    }
                                    return 0;
                                }
                            }
                            return jSONReader.readBoolValue() ? 1 : 0;
                        }
                        jSONReader.next();
                    }
                    return jSONReader.readInt32Value();
                }
                jSONReader.skipValue();
            }
            jSONReader.wasNull = true;
            return 0;
        }
        jSONReader.wasNull = true;
        return 0;
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public long extractInt64Value(JSONReader jSONReader) {
        if (jSONReader.nextIfObjectStart()) {
            while (jSONReader.f4541ch != '}') {
                if (jSONReader.readFieldNameHashCode() == this.nameHashCode) {
                    char c10 = jSONReader.f4541ch;
                    if (c10 == '\"' || c10 == '\'') {
                        return Long.parseLong(jSONReader.readString());
                    }
                    if (c10 != '+' && c10 != '-') {
                        if (c10 != '[') {
                            if (c10 != ']') {
                                if (c10 != 'f') {
                                    if (c10 == 'n') {
                                        jSONReader.readNull();
                                        jSONReader.wasNull = true;
                                        return 0L;
                                    }
                                    if (c10 != 't') {
                                        if (c10 != '{') {
                                            switch (c10) {
                                                case '0':
                                                case '1':
                                                case Opcodes.AALOAD /* 50 */:
                                                case Opcodes.BALOAD /* 51 */:
                                                case '4':
                                                case Opcodes.SALOAD /* 53 */:
                                                case Opcodes.ISTORE /* 54 */:
                                                case Opcodes.LSTORE /* 55 */:
                                                case Opcodes.FSTORE /* 56 */:
                                                case Opcodes.DSTORE /* 57 */:
                                                    break;
                                                default:
                                                    C1588i.m6279a("TODO : ", jSONReader.f4541ch);
                                                    break;
                                            }
                                            return 0L;
                                        }
                                    }
                                }
                                return jSONReader.readBoolValue() ? 1L : 0L;
                            }
                            jSONReader.next();
                        }
                        return jSONReader.toLong(jSONReader.readObject());
                    }
                    return jSONReader.readInt64Value();
                }
                jSONReader.skipValue();
            }
            jSONReader.wasNull = true;
            return 0L;
        }
        jSONReader.wasNull = true;
        return 0L;
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void extractScalar(JSONReader jSONReader, ValueConsumer valueConsumer) {
        if (jSONReader.nextIfObjectStart()) {
            while (jSONReader.f4541ch != '}') {
                if (jSONReader.readFieldNameHashCode() == this.nameHashCode) {
                    char c10 = jSONReader.f4541ch;
                    if (c10 == '\"' || c10 == '\'') {
                        jSONReader.readString(valueConsumer, false);
                        return;
                    }
                    if (c10 != '+' && c10 != '-') {
                        if (c10 == '[') {
                            valueConsumer.accept(jSONReader.readArray());
                            return;
                        }
                        if (c10 != ']') {
                            if (c10 != 'f') {
                                if (c10 == 'n') {
                                    jSONReader.readNull();
                                    valueConsumer.acceptNull();
                                    return;
                                } else if (c10 != 't') {
                                    if (c10 == '{') {
                                        valueConsumer.accept(jSONReader.readObject());
                                        return;
                                    }
                                    switch (c10) {
                                        case '0':
                                        case '1':
                                        case Opcodes.AALOAD /* 50 */:
                                        case Opcodes.BALOAD /* 51 */:
                                        case '4':
                                        case Opcodes.SALOAD /* 53 */:
                                        case Opcodes.ISTORE /* 54 */:
                                        case Opcodes.LSTORE /* 55 */:
                                        case Opcodes.FSTORE /* 56 */:
                                        case Opcodes.DSTORE /* 57 */:
                                            break;
                                        default:
                                            C1588i.m6279a("TODO : ", jSONReader.f4541ch);
                                            break;
                                    }
                                    return;
                                }
                            }
                            valueConsumer.accept(jSONReader.readBoolValue());
                            return;
                        }
                        jSONReader.next();
                    }
                    jSONReader.readNumber(valueConsumer, false);
                    return;
                }
                jSONReader.skipValue();
            }
            valueConsumer.acceptNull();
            return;
        }
        valueConsumer.acceptNull();
    }

    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public boolean isRef() {
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public boolean remove(Object obj) {
        FieldReader fieldReader;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).remove(this.name) != null;
        }
        ObjectReader objectReader = getReaderContext().getProvider().getObjectReader(obj.getClass());
        if (objectReader == null || (fieldReader = objectReader.getFieldReader(this.nameHashCode)) == null) {
            return false;
        }
        try {
            fieldReader.accept(obj, (Object) null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public void set(Object obj, Object obj2, JSONReader.Feature... featureArr) {
        Class<?> cls;
        Class<?> cls2;
        Function typeConvert;
        if (!(obj instanceof Map)) {
            ObjectReaderProvider provider = getReaderContext().getProvider();
            FieldReader fieldReader = provider.getObjectReader(obj.getClass()).getFieldReader(this.nameHashCode);
            if (obj2 != null && (cls = obj2.getClass()) != (cls2 = fieldReader.fieldClass) && (typeConvert = provider.getTypeConvert(cls, cls2)) != null) {
                obj2 = typeConvert.apply(obj2);
            }
            fieldReader.accept(obj, obj2);
            return;
        }
        Map map = (Map) obj;
        Object objPut = map.put(this.name, obj2);
        if (objPut != null) {
            for (JSONReader.Feature feature : featureArr) {
                if (feature == JSONReader.Feature.DuplicateKeyValueAsArray) {
                    if (!(objPut instanceof Collection)) {
                        map.put(this.name, JSONArray.m6186of(objPut, obj2));
                        return;
                    } else {
                        ((Collection) objPut).add(obj2);
                        map.put(this.name, obj2);
                        return;
                    }
                }
            }
        }
    }

    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public void setCallback(Object obj, BiFunction biFunction) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Object obj2 = map.get(this.name);
            if (obj2 != null || map.containsKey(this.name)) {
                map.put(this.name, biFunction.apply(map, obj2));
                return;
            }
            return;
        }
        Class<?> cls = obj.getClass();
        if (this.readerContext == null) {
            this.readerContext = JSONFactory.createReadContext();
        }
        FieldReader fieldReader = this.readerContext.provider.getObjectReader(cls).getFieldReader(this.nameHashCode);
        if (this.writerContext == null) {
            this.writerContext = JSONFactory.createWriteContext();
        }
        FieldWriter fieldWriter = this.writerContext.provider.getObjectWriter((Class) cls).getFieldWriter(this.nameHashCode);
        if (fieldReader == null || fieldWriter == null) {
            return;
        }
        fieldReader.accept(obj, biFunction.apply(obj, fieldWriter.getFieldValue(obj)));
    }

    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public void setInt(Object obj, int i10) {
        if (obj instanceof Map) {
            ((Map) obj).put(this.name, Integer.valueOf(i10));
        } else {
            getReaderContext().getProvider().getObjectReader(obj.getClass()).setFieldValue(obj, this.name, this.nameHashCode, i10);
        }
    }

    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public void setLong(Object obj, long j10) {
        if (obj instanceof Map) {
            ((Map) obj).put(this.name, Long.valueOf(j10));
        } else {
            getReaderContext().getProvider().getObjectReader(obj.getClass()).setFieldValue(obj, this.name, this.nameHashCode, j10);
        }
    }

    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public void set(Object obj, Object obj2) {
        Function typeConvert;
        if (obj instanceof Map) {
            ((Map) obj).put(this.name, obj2);
            return;
        }
        ObjectReaderProvider provider = getReaderContext().getProvider();
        ObjectReader objectReader = provider.getObjectReader(obj.getClass());
        FieldReader fieldReader = objectReader.getFieldReader(this.nameHashCode);
        if (fieldReader != null) {
            if (obj2 != null) {
                Class<?> cls = obj2.getClass();
                Class cls2 = fieldReader.fieldClass;
                if (!fieldReader.supportAcceptType(cls) && (typeConvert = provider.getTypeConvert(cls, cls2)) != null) {
                    obj2 = typeConvert.apply(obj2);
                }
            }
            fieldReader.accept(obj, obj2);
            return;
        }
        if (objectReader instanceof ObjectReaderBean) {
            objectReader.acceptExtra(obj, this.name, obj2, 0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String extractScalar(com.alibaba.fastjson2.JSONReader r7) {
        /*
            r6 = this;
            boolean r0 = r7.nextIfObjectStart()
            r1 = 0
            if (r0 == 0) goto L80
        L7:
            char r0 = r7.f4541ch
            r2 = 125(0x7d, float:1.75E-43)
            if (r0 != r2) goto L12
            r7.next()
            goto L80
        L12:
            long r2 = r7.readFieldNameHashCode()
            long r4 = r6.nameHashCode
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            char r2 = r7.f4541ch
            r3 = 91
            r4 = 123(0x7b, float:1.72E-43)
            if (r0 != 0) goto L2f
            if (r2 == r4) goto L2f
            if (r2 == r3) goto L2f
            r7.skipValue()
            goto L7
        L2f:
            r0 = 34
            if (r2 == r0) goto L77
            r0 = 39
            if (r2 == r0) goto L77
            r0 = 43
            if (r2 == r0) goto L72
            r0 = 45
            if (r2 == r0) goto L72
            if (r2 == r3) goto L6d
            r0 = 102(0x66, float:1.43E-43)
            if (r2 == r0) goto L64
            r0 = 110(0x6e, float:1.54E-43)
            if (r2 == r0) goto L60
            r0 = 116(0x74, float:1.63E-43)
            if (r2 == r0) goto L64
            if (r2 == r4) goto L5b
            switch(r2) {
                case 48: goto L72;
                case 49: goto L72;
                case 50: goto L72;
                case 51: goto L72;
                case 52: goto L72;
                case 53: goto L72;
                case 54: goto L72;
                case 55: goto L72;
                case 56: goto L72;
                case 57: goto L72;
                default: goto L52;
            }
        L52:
            java.lang.String r0 = "TODO : "
            char r7 = r7.f4541ch
            com.alibaba.fastjson2.C1588i.m6279a(r0, r7)
            r7 = 0
            return r7
        L5b:
            java.util.Map r1 = r7.readObject()
            goto L7b
        L60:
            r7.readNull()
            goto L7b
        L64:
            boolean r7 = r7.readBoolValue()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            goto L7b
        L6d:
            java.util.List r1 = r7.readArray()
            goto L7b
        L72:
            java.lang.Number r1 = r7.readNumber()
            goto L7b
        L77:
            java.lang.String r1 = r7.readString()
        L7b:
            java.lang.String r7 = com.alibaba.fastjson2.JSON.toJSONString(r1)
            return r7
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONPathSingleName.extractScalar(com.alibaba.fastjson2.JSONReader):java.lang.String");
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void extract(JSONReader jSONReader, ValueConsumer valueConsumer) {
        if (jSONReader.nextIfObjectStart()) {
            while (jSONReader.f4541ch != '}') {
                if (jSONReader.readFieldNameHashCode() == this.nameHashCode) {
                    char c10 = jSONReader.f4541ch;
                    if (c10 != '\"' && c10 != '\'') {
                        if (c10 != '+' && c10 != '-') {
                            if (c10 != '[') {
                                if (c10 != 'f') {
                                    if (c10 == 'n') {
                                        jSONReader.readNull();
                                        valueConsumer.acceptNull();
                                        return;
                                    } else if (c10 != 't') {
                                        if (c10 != '{') {
                                            switch (c10) {
                                                case '0':
                                                case '1':
                                                case Opcodes.AALOAD /* 50 */:
                                                case Opcodes.BALOAD /* 51 */:
                                                case '4':
                                                case Opcodes.SALOAD /* 53 */:
                                                case Opcodes.ISTORE /* 54 */:
                                                case Opcodes.LSTORE /* 55 */:
                                                case Opcodes.FSTORE /* 56 */:
                                                case Opcodes.DSTORE /* 57 */:
                                                    break;
                                                default:
                                                    C1588i.m6279a("TODO : ", jSONReader.f4541ch);
                                                    break;
                                            }
                                            return;
                                        }
                                        valueConsumer.accept(jSONReader.readObject());
                                        return;
                                    }
                                }
                                valueConsumer.accept(jSONReader.readBoolValue());
                                return;
                            }
                            valueConsumer.accept(jSONReader.readArray());
                            return;
                        }
                        jSONReader.readNumber(valueConsumer, true);
                        return;
                    }
                    jSONReader.readString(valueConsumer, true);
                    return;
                }
                jSONReader.skipValue();
            }
            valueConsumer.acceptNull();
            return;
        }
        valueConsumer.acceptNull();
    }
}
