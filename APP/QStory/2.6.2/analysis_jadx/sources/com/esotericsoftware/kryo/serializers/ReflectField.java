package com.esotericsoftware.kryo.serializers;

import androidx.profileinstaller.AbstractC2442;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Registration;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import com.esotericsoftware.kryo.util.Generics;
import com.esotericsoftware.kryo.util.Util;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class ReflectField extends FieldSerializer.CachedField {
    final FieldSerializer fieldSerializer;
    final Generics.GenericType genericType;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class BooleanReflectField extends FieldSerializer.CachedField {
        public BooleanReflectField(Field field) {
            super(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setBoolean(obj2, field.getBoolean(obj));
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (boolean)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            try {
                this.field.setBoolean(obj, input.readBoolean());
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (boolean)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            try {
                output.writeBoolean(this.field.getBoolean(obj));
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (boolean)", kryoException);
                throw kryoException;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class ByteReflectField extends FieldSerializer.CachedField {
        public ByteReflectField(Field field) {
            super(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setByte(obj2, field.getByte(obj));
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (byte)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            try {
                this.field.setByte(obj, input.readByte());
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (byte)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            try {
                output.writeByte(this.field.getByte(obj));
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (byte)", kryoException);
                throw kryoException;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class CharReflectField extends FieldSerializer.CachedField {
        public CharReflectField(Field field) {
            super(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setChar(obj2, field.getChar(obj));
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (char)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            try {
                this.field.setChar(obj, input.readChar());
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (char)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            try {
                output.writeChar(this.field.getChar(obj));
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (char)", kryoException);
                throw kryoException;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class DoubleReflectField extends FieldSerializer.CachedField {
        public DoubleReflectField(Field field) {
            super(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setDouble(obj2, field.getDouble(obj));
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (double)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            try {
                this.field.setDouble(obj, input.readDouble());
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (double)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            try {
                output.writeDouble(this.field.getDouble(obj));
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (double)", kryoException);
                throw kryoException;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class FloatReflectField extends FieldSerializer.CachedField {
        public FloatReflectField(Field field) {
            super(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setFloat(obj2, field.getFloat(obj));
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (float)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            try {
                this.field.setFloat(obj, input.readFloat());
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (float)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            try {
                output.writeFloat(this.field.getFloat(obj));
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (float)", kryoException);
                throw kryoException;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class IntReflectField extends FieldSerializer.CachedField {
        public IntReflectField(Field field) {
            super(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setInt(obj2, field.getInt(obj));
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (int)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            try {
                boolean z = this.varEncoding;
                Field field = this.field;
                if (z) {
                    field.setInt(obj, input.readVarInt(false));
                } else {
                    field.setInt(obj, input.readInt());
                }
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (int)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            try {
                boolean z = this.varEncoding;
                Field field = this.field;
                if (z) {
                    output.writeVarInt(field.getInt(obj), false);
                } else {
                    output.writeInt(field.getInt(obj));
                }
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (int)", kryoException);
                throw kryoException;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class LongReflectField extends FieldSerializer.CachedField {
        public LongReflectField(Field field) {
            super(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setLong(obj2, field.getLong(obj));
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (long)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            try {
                boolean z = this.varEncoding;
                Field field = this.field;
                if (z) {
                    field.setLong(obj, input.readVarLong(false));
                } else {
                    field.setLong(obj, input.readLong());
                }
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (long)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            try {
                boolean z = this.varEncoding;
                Field field = this.field;
                if (z) {
                    output.writeVarLong(field.getLong(obj), false);
                } else {
                    output.writeLong(field.getLong(obj));
                }
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (long)", kryoException);
                throw kryoException;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class ShortReflectField extends FieldSerializer.CachedField {
        public ShortReflectField(Field field) {
            super(field);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setShort(obj2, field.getShort(obj));
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (short)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            try {
                this.field.setShort(obj, input.readShort());
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (short)", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            try {
                output.writeShort(this.field.getShort(obj));
            } catch (Throwable th) {
                KryoException kryoException = new KryoException(th);
                AbstractC2442.m4551(new StringBuilder(), this.name, " (short)", kryoException);
                throw kryoException;
            }
        }
    }

    public ReflectField(Field field, FieldSerializer fieldSerializer, Generics.GenericType genericType) {
        super(field);
        this.fieldSerializer = fieldSerializer;
        this.genericType = genericType;
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
    public void copy(Object obj, Object obj2) {
        try {
            set(obj2, this.fieldSerializer.kryo.copy(get(obj)));
        } catch (KryoException e) {
            e.addTrace(this.name + " (" + this.fieldSerializer.type.getName() + ")");
            throw e;
        } catch (IllegalAccessException e2) {
            C3073.m6911(this.name, this.fieldSerializer.type.getName(), e2);
        } catch (Throwable th) {
            KryoException kryoException = new KryoException(th);
            kryoException.addTrace(this.name + " (" + this.fieldSerializer.type.getName() + ")");
            throw kryoException;
        }
    }

    public Object get(Object obj) {
        return this.field.get(obj);
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
    public void read(Input input, Object obj) {
        Object objectOrNull;
        Kryo kryo = this.fieldSerializer.kryo;
        try {
            Serializer serializer = this.serializer;
            Class clsResolveFieldClass = resolveFieldClass();
            if (clsResolveFieldClass == null) {
                Registration registration = kryo.readClass(input);
                if (registration == null) {
                    set(obj, null);
                    return;
                }
                if (serializer == null) {
                    serializer = registration.getSerializer();
                }
                kryo.getGenerics().pushGenericType(this.genericType);
                objectOrNull = kryo.readObject(input, registration.getType(), serializer);
            } else {
                if (serializer == null) {
                    serializer = kryo.getSerializer(clsResolveFieldClass);
                    if (this.valueClass != null && this.reuseSerializer) {
                        this.serializer = serializer;
                    }
                }
                kryo.getGenerics().pushGenericType(this.genericType);
                objectOrNull = this.canBeNull ? kryo.readObjectOrNull(input, clsResolveFieldClass, serializer) : kryo.readObject(input, clsResolveFieldClass, serializer);
            }
            kryo.getGenerics().popGenericType();
            set(obj, objectOrNull);
        } catch (KryoException e) {
            e.addTrace(this.name + " (" + this.fieldSerializer.type.getName() + ")");
            throw e;
        } catch (IllegalAccessException e2) {
            C3073.m6911(this.name, this.fieldSerializer.type.getName(), e2);
        } catch (Throwable th) {
            KryoException kryoException = new KryoException(th);
            kryoException.addTrace(this.name + " (" + this.fieldSerializer.type.getName() + ")");
            throw kryoException;
        }
    }

    public Class resolveFieldClass() {
        Class clsResolve;
        return (this.valueClass == null && (clsResolve = this.genericType.resolve(this.fieldSerializer.kryo.getGenerics())) != null && this.fieldSerializer.kryo.isFinal(clsResolve)) ? this.field.getType().isArray() ? Util.getArrayType(clsResolve) : clsResolve : this.valueClass;
    }

    public void set(Object obj, Object obj2) throws IllegalAccessException {
        this.field.set(obj, obj2);
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
    public void write(Output output, Object obj) {
        Kryo kryo = this.fieldSerializer.kryo;
        try {
            Object obj2 = get(obj);
            Serializer serializer = this.serializer;
            Class clsResolveFieldClass = resolveFieldClass();
            if (clsResolveFieldClass != null) {
                if (serializer == null) {
                    serializer = kryo.getSerializer(clsResolveFieldClass);
                    if (this.valueClass != null && this.reuseSerializer) {
                        this.serializer = serializer;
                    }
                }
                kryo.getGenerics().pushGenericType(this.genericType);
                if (this.canBeNull) {
                    kryo.writeObjectOrNull(output, obj2, serializer);
                } else {
                    if (obj2 == null) {
                        throw new KryoException("Field value cannot be null when canBeNull is false: " + this.name + " (" + obj.getClass().getName() + ")");
                    }
                    kryo.writeObject(output, obj2, serializer);
                }
            } else {
                if (obj2 == null) {
                    kryo.writeClass(output, null);
                    return;
                }
                Registration registrationWriteClass = kryo.writeClass(output, obj2.getClass());
                if (serializer == null) {
                    serializer = registrationWriteClass.getSerializer();
                }
                kryo.getGenerics().pushGenericType(this.genericType);
                kryo.writeObject(output, obj2, serializer);
            }
            kryo.getGenerics().popGenericType();
        } catch (KryoException e) {
            e.addTrace(this.name + " (" + obj.getClass().getName() + ")");
            throw e;
        } catch (IllegalAccessException e2) {
            C3073.m6911(this.name, obj.getClass().getName(), e2);
        } catch (StackOverflowError e3) {
            throw new KryoException("A StackOverflow occurred. The most likely cause is that your data has a circular reference resulting in infinite recursion. Try enabling references with Kryo.setReferences(true). If your data structure is really more than " + kryo.getDepth() + " levels deep then try increasing your Java stack size.", e3);
        } catch (Throwable th) {
            KryoException kryoException = new KryoException(th);
            kryoException.addTrace(this.name + " (" + obj.getClass().getName() + ")");
            throw kryoException;
        }
    }
}
