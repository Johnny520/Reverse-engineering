package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.p006io.Input;
import com.esotericsoftware.kryo.p006io.Output;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import com.esotericsoftware.kryo.util.Generics;
import com.esotericsoftware.reflectasm.FieldAccess;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class AsmField extends ReflectField {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class BooleanAsmField extends FieldSerializer.CachedField {
        public BooleanAsmField(Field field) {
            super(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i = this.accessIndex;
            fieldAccess.setBoolean(obj2, i, fieldAccess.getBoolean(obj, i));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            this.access.setBoolean(obj, this.accessIndex, input.readBoolean());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            output.writeBoolean(this.access.getBoolean(obj, this.accessIndex));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class ByteAsmField extends FieldSerializer.CachedField {
        public ByteAsmField(Field field) {
            super(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i = this.accessIndex;
            fieldAccess.setByte(obj2, i, fieldAccess.getByte(obj, i));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            this.access.setByte(obj, this.accessIndex, input.readByte());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            output.writeByte(this.access.getByte(obj, this.accessIndex));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class CharAsmField extends FieldSerializer.CachedField {
        public CharAsmField(Field field) {
            super(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i = this.accessIndex;
            fieldAccess.setChar(obj2, i, fieldAccess.getChar(obj, i));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            this.access.setChar(obj, this.accessIndex, input.readChar());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            output.writeChar(this.access.getChar(obj, this.accessIndex));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class DoubleAsmField extends FieldSerializer.CachedField {
        public DoubleAsmField(Field field) {
            super(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i = this.accessIndex;
            fieldAccess.setDouble(obj2, i, fieldAccess.getDouble(obj, i));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            this.access.setDouble(obj, this.accessIndex, input.readDouble());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            output.writeDouble(this.access.getDouble(obj, this.accessIndex));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class FloatAsmField extends FieldSerializer.CachedField {
        public FloatAsmField(Field field) {
            super(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i = this.accessIndex;
            fieldAccess.setFloat(obj2, i, fieldAccess.getFloat(obj, i));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            this.access.setFloat(obj, this.accessIndex, input.readFloat());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            output.writeFloat(this.access.getFloat(obj, this.accessIndex));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class IntAsmField extends FieldSerializer.CachedField {
        public IntAsmField(Field field) {
            super(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i = this.accessIndex;
            fieldAccess.setInt(obj2, i, fieldAccess.getInt(obj, i));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            boolean z = this.varEncoding;
            FieldAccess fieldAccess = this.access;
            if (z) {
                fieldAccess.setInt(obj, this.accessIndex, input.readVarInt(false));
            } else {
                fieldAccess.setInt(obj, this.accessIndex, input.readInt());
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            boolean z = this.varEncoding;
            FieldAccess fieldAccess = this.access;
            if (z) {
                output.writeVarInt(fieldAccess.getInt(obj, this.accessIndex), false);
            } else {
                output.writeInt(fieldAccess.getInt(obj, this.accessIndex));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class LongAsmField extends FieldSerializer.CachedField {
        public LongAsmField(Field field) {
            super(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i = this.accessIndex;
            fieldAccess.setLong(obj2, i, fieldAccess.getLong(obj, i));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            boolean z = this.varEncoding;
            FieldAccess fieldAccess = this.access;
            if (z) {
                fieldAccess.setLong(obj, this.accessIndex, input.readVarLong(false));
            } else {
                fieldAccess.setLong(obj, this.accessIndex, input.readLong());
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            boolean z = this.varEncoding;
            FieldAccess fieldAccess = this.access;
            if (z) {
                output.writeVarLong(fieldAccess.getLong(obj, this.accessIndex), false);
            } else {
                output.writeLong(fieldAccess.getLong(obj, this.accessIndex));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class ShortAsmField extends FieldSerializer.CachedField {
        public ShortAsmField(Field field) {
            super(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i = this.accessIndex;
            fieldAccess.setShort(obj2, i, fieldAccess.getShort(obj, i));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            this.access.setShort(obj, this.accessIndex, input.readShort());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            output.writeShort(this.access.getShort(obj, this.accessIndex));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class StringAsmField extends FieldSerializer.CachedField {
        public StringAsmField(Field field) {
            super(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i = this.accessIndex;
            fieldAccess.set(obj2, i, fieldAccess.getString(obj, i));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            this.access.set(obj, this.accessIndex, input.readString());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            output.writeString(this.access.getString(obj, this.accessIndex));
        }
    }

    public AsmField(Field field, FieldSerializer fieldSerializer, Generics.GenericType genericType) {
        super(field, fieldSerializer, genericType);
    }

    @Override // com.esotericsoftware.kryo.serializers.ReflectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
    public void copy(Object obj, Object obj2) {
        try {
            FieldAccess fieldAccess = this.access;
            int i = this.accessIndex;
            fieldAccess.set(obj2, i, this.fieldSerializer.kryo.copy(fieldAccess.get(obj, i)));
        } catch (KryoException e) {
            e.addTrace(this + " (" + this.fieldSerializer.type.getName() + ")");
            throw e;
        } catch (Throwable th) {
            KryoException kryoException = new KryoException(th);
            kryoException.addTrace(this + " (" + this.fieldSerializer.type.getName() + ")");
            throw kryoException;
        }
    }

    @Override // com.esotericsoftware.kryo.serializers.ReflectField
    public Object get(Object obj) {
        return this.access.get(obj, this.accessIndex);
    }

    @Override // com.esotericsoftware.kryo.serializers.ReflectField
    public void set(Object obj, Object obj2) {
        this.access.set(obj, this.accessIndex, obj2);
    }
}
