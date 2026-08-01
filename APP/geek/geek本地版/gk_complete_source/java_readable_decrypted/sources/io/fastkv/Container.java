package io.fastkv;

import io.fastkv.interfaces.FastEncoder;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class Container {

    public static class ArrayContainer extends VarContainer {
        public ArrayContainer(int i, int i2, Object obj, int i3, boolean z) {
            super(i, i2, obj, i3, z);
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(BaseContainer baseContainer) {
            if (baseContainer.getType() != 7) {
                return false;
            }
            Object obj = ((ArrayContainer) baseContainer).value;
            Object obj2 = this.value;
            if (obj2 == obj) {
                return true;
            }
            if (obj2 != null && obj != null) {
                if (obj2 instanceof String) {
                    return obj2.equals(obj);
                }
                if ((obj2 instanceof byte[]) && (obj instanceof byte[])) {
                    return Arrays.equals((byte[]) obj2, (byte[]) obj);
                }
            }
            return false;
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
            return (byte) 7;
        }
    }

    public static abstract class BaseContainer {
        int offset;

        public abstract boolean equalTo(BaseContainer baseContainer);

        public abstract byte getType();
    }

    public static class BooleanContainer extends BaseContainer {
        boolean value;

        public BooleanContainer(int i, boolean z) {
            this.offset = i;
            this.value = z;
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(BaseContainer baseContainer) {
            return baseContainer.getType() == 1 && ((BooleanContainer) baseContainer).value == this.value;
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
            return (byte) 1;
        }
    }

    public static class DoubleContainer extends BaseContainer {
        double value;

        public DoubleContainer(int i, double d) {
            this.offset = i;
            this.value = d;
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(BaseContainer baseContainer) {
            return baseContainer.getType() == 5 && ((DoubleContainer) baseContainer).value == this.value;
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
            return (byte) 5;
        }
    }

    public static class FloatContainer extends BaseContainer {
        float value;

        public FloatContainer(int i, float f) {
            this.offset = i;
            this.value = f;
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(BaseContainer baseContainer) {
            return baseContainer.getType() == 3 && ((FloatContainer) baseContainer).value == this.value;
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
            return (byte) 3;
        }
    }

    public static class IntContainer extends BaseContainer {
        int value;

        public IntContainer(int i, int i2) {
            this.offset = i;
            this.value = i2;
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(BaseContainer baseContainer) {
            return baseContainer.getType() == 2 && ((IntContainer) baseContainer).value == this.value;
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
            return (byte) 2;
        }
    }

    public static class LongContainer extends BaseContainer {
        long value;

        public LongContainer(int i, long j) {
            this.offset = i;
            this.value = j;
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(BaseContainer baseContainer) {
            return baseContainer.getType() == 4 && ((LongContainer) baseContainer).value == this.value;
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
            return (byte) 4;
        }
    }

    public static class ObjectContainer extends VarContainer {
        FastEncoder encoder;

        public ObjectContainer(int i, int i2, Object obj, int i3, boolean z) {
            super(i, i2, obj, i3, z);
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(BaseContainer baseContainer) {
            return baseContainer.getType() == 8 && Objects.equals(((ObjectContainer) baseContainer).value, this.value);
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
            return (byte) 8;
        }
    }

    public static class StringContainer extends VarContainer {
        public StringContainer(int i, int i2, String str, int i3, boolean z) {
            super(i, i2, str, i3, z);
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(BaseContainer baseContainer) {
            if (baseContainer.getType() != 6) {
                return false;
            }
            StringContainer stringContainer = (StringContainer) baseContainer;
            return stringContainer.external == this.external && Objects.equals(stringContainer.value, this.value);
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
            return (byte) 6;
        }
    }

    public static abstract class VarContainer extends BaseContainer {
        boolean external;
        int start;
        Object value;
        int valueSize;

        public VarContainer(int i, int i2, Object obj, int i3, boolean z) {
            this.start = i;
            this.offset = i2;
            this.value = obj;
            this.valueSize = i3;
            this.external = z;
        }
    }
}
