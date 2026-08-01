package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.C1565a;
import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.C1607k;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.annotation.JSONCreator;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.support.LambdaMiscCodec;
import com.alibaba.fastjson2.writer.ObjectWriter;
import java.lang.reflect.Type;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface ApacheLang3Support {

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class PairReader implements ObjectReader {
        static final long LEFT = Fnv.hashCode64("left");
        static final long RIGHT = Fnv.hashCode64("right");
        final Type leftType;
        final Class objectClass;

        /* JADX INFO: renamed from: of */
        final BiFunction f4743of;
        final Type rightType;

        public PairReader(Class cls, Type type, Type type2) {
            this.objectClass = cls;
            this.leftType = type;
            this.rightType = type2;
            try {
                this.f4743of = LambdaMiscCodec.createBiFunction(cls.getMethod("of", Object.class, Object.class));
            } catch (NoSuchMethodException e10) {
                C1565a.m6255a("Pair.of method not found", e10);
                throw null;
            }
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReader
        public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
            Object obj2;
            Object fieldName = null;
            if (jSONReader.nextIfNull()) {
                return null;
            }
            if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY)) {
                long typeHashCode = jSONReader.readTypeHashCode();
                if (typeHashCode != 4645080105124911238L && typeHashCode != -2802985644706367574L && typeHashCode != 8310287657375596772L) {
                    C1607k.m6296a("not support inputType : ", jSONReader.getString());
                    return null;
                }
            }
            if (jSONReader.nextIfObjectStart()) {
                obj2 = null;
                for (int i10 = 0; i10 < 100 && !jSONReader.nextIfObjectEnd(); i10++) {
                    if (jSONReader.isString()) {
                        long fieldNameHashCode = jSONReader.readFieldNameHashCode();
                        if (fieldNameHashCode == LEFT) {
                            fieldName = jSONReader.read(this.leftType);
                        } else if (fieldNameHashCode == RIGHT) {
                            obj2 = jSONReader.read(this.rightType);
                        } else if (i10 == 0) {
                            fieldName = jSONReader.getFieldName();
                            obj2 = jSONReader.read(this.rightType);
                        } else {
                            jSONReader.skipValue();
                        }
                    } else {
                        if (i10 != 0) {
                            C1569c.m6258a(jSONReader.info("not support input"));
                            return null;
                        }
                        fieldName = jSONReader.read(this.leftType);
                        obj2 = jSONReader.read(this.rightType);
                    }
                }
            } else {
                if (!jSONReader.isArray()) {
                    C1569c.m6258a(jSONReader.info("not support input"));
                    return null;
                }
                if (jSONReader.startArray() != 2) {
                    C1569c.m6258a(jSONReader.info("not support input"));
                    return null;
                }
                fieldName = jSONReader.read(this.leftType);
                obj2 = jSONReader.read(this.rightType);
            }
            return this.f4743of.apply(fieldName, obj2);
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReader
        public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
            Object obj2;
            Object fieldName = null;
            if (jSONReader.nextIfNull()) {
                return null;
            }
            if (jSONReader.nextIfObjectStart()) {
                obj2 = null;
                for (int i10 = 0; i10 < 100 && !jSONReader.nextIfObjectEnd(); i10++) {
                    if (jSONReader.isString()) {
                        long fieldNameHashCode = jSONReader.readFieldNameHashCode();
                        if (fieldNameHashCode == LEFT) {
                            fieldName = jSONReader.read(this.leftType);
                        } else if (fieldNameHashCode == RIGHT) {
                            obj2 = jSONReader.read(this.rightType);
                        } else if (i10 == 0) {
                            fieldName = jSONReader.getFieldName();
                            jSONReader.nextIfMatch(':');
                            obj2 = jSONReader.read(this.rightType);
                        } else {
                            jSONReader.skipValue();
                        }
                    } else {
                        if (i10 != 0) {
                            C1569c.m6258a(jSONReader.info("not support input"));
                            return null;
                        }
                        fieldName = jSONReader.read(this.leftType);
                        jSONReader.nextIfMatch(':');
                        obj2 = jSONReader.read(this.rightType);
                    }
                }
            } else {
                if (!jSONReader.nextIfArrayStart()) {
                    C1569c.m6258a(jSONReader.info("not support input"));
                    return null;
                }
                fieldName = jSONReader.read(this.leftType);
                obj2 = jSONReader.read(this.rightType);
                if (!jSONReader.nextIfArrayEnd()) {
                    C1569c.m6258a(jSONReader.info("not support input"));
                    return null;
                }
            }
            return this.f4743of.apply(fieldName, obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class PairWriter implements ObjectWriter {
        static final byte[] leftName = JSONB.toBytes("left");
        static final byte[] rightName = JSONB.toBytes("right");
        Function left;
        final Class objectClass;
        Function right;
        final String typeName;
        final long typeNameHash;
        byte[] typeNameJSONB;

        public PairWriter(Class cls) {
            this.objectClass = cls;
            String name = cls.getName();
            this.typeName = name;
            this.typeNameHash = Fnv.hashCode64(name);
        }

        public Object getLeft(Object obj) {
            Class<?> cls = obj.getClass();
            if (this.left == null) {
                try {
                    this.left = LambdaMiscCodec.createFunction(cls.getMethod("getLeft", null));
                } catch (NoSuchMethodException e10) {
                    C1565a.m6255a("getLeft method not found", e10);
                    return null;
                }
            }
            return this.left.apply(obj);
        }

        public Object getRight(Object obj) {
            Class<?> cls = obj.getClass();
            if (this.right == null) {
                try {
                    this.right = LambdaMiscCodec.createFunction(cls.getMethod("getRight", null));
                } catch (NoSuchMethodException e10) {
                    C1565a.m6255a("getRight method not found", e10);
                    return null;
                }
            }
            return this.right.apply(obj);
        }

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
            if (obj == null) {
                jSONWriter.writeNull();
                return;
            }
            Object left = getLeft(obj);
            Object right = getRight(obj);
            jSONWriter.startObject();
            if ((jSONWriter.getFeatures(j10) & JSONWriter.Feature.WritePairAsJavaBean.mask) != 0) {
                jSONWriter.writeName("left");
                jSONWriter.writeColon();
                jSONWriter.writeAny(left);
                jSONWriter.writeName("right");
            } else {
                jSONWriter.writeNameAny(left);
            }
            jSONWriter.writeColon();
            jSONWriter.writeAny(right);
            jSONWriter.endObject();
        }

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
            if (obj == null) {
                jSONWriter.writeNull();
                return;
            }
            if ((jSONWriter.getFeatures(j10) & JSONWriter.Feature.WriteClassName.mask) != 0) {
                if (this.typeNameJSONB == null) {
                    this.typeNameJSONB = JSONB.toBytes(this.typeName);
                }
                jSONWriter.writeTypeName(this.typeNameJSONB, this.typeNameHash);
            }
            jSONWriter.startObject();
            Object left = getLeft(obj);
            Object right = getRight(obj);
            jSONWriter.writeNameRaw(leftName, PairReader.LEFT);
            jSONWriter.writeAny(left);
            jSONWriter.writeNameRaw(rightName, PairReader.RIGHT);
            jSONWriter.writeAny(right);
            jSONWriter.endObject();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface TripleMixIn<L, M, R> {
        @JSONCreator
        /* JADX INFO: renamed from: of */
        static <L, M, R> Object m6474of(L l10, M m10, R r10) {
            return null;
        }
    }
}
