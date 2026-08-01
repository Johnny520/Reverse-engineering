package io.fastkv;

import io.fastkv.interfaces.FastEncoder;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class Container {

    public static class ArrayContainer extends VarContainer {
        public ArrayContainer(int r1, int r2, Object r3, int r4, boolean r5) {
            super(r1, r2, r3, r4, r5);
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(BaseContainer r4) {
            if (r4.getType() == 7) goto L5;
            return false;
        L5:
            Object r42 = ((ArrayContainer) r4).value;
            Object r0 = this.value;
            if (r0 != r42) goto L9;
            return true;
        L9:
            if (r0 == null) goto L21;
            if (r42 == null) goto L21;
            if ((r0 instanceof String) == false) goto L16;
            return r0.equals(r42);
        L16:
            if ((r0 instanceof byte[]) == false) goto L21;
            if ((r42 instanceof byte[]) == false) goto L21;
            return Arrays.equals((byte[]) r0, (byte[]) r42);
        L21:
            return false;
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
            return 7;
        }
    }

    public static abstract class BaseContainer {
        int offset;

        public BaseContainer() {
        }

        public abstract boolean equalTo(BaseContainer r1);

        public abstract byte getType();
    }

    public static class BooleanContainer extends BaseContainer {
        boolean value;

        public BooleanContainer(int r1, boolean r2) {
            this.offset = r1;
            this.value = r2;
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(BaseContainer r3) {
            if (r3.getType() == 1) goto L5;
            return false;
        L5:
            if (((BooleanContainer) r3).value != this.value) goto L9;
            return true;
        L9:
            return false;
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
            return 1;
        }
    }

    public static class DoubleContainer extends BaseContainer {
        double value;

        public DoubleContainer(int r1, double r2) {
            this.offset = r1;
            this.value = r2;
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(BaseContainer r5) {
            if (r5.getType() == 5) goto L5;
            return false;
        L5:
            if (((DoubleContainer) r5).value != this.value) goto L10;
            return true;
        L10:
            return false;
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
            return 5;
        }
    }

    public static class FloatContainer extends BaseContainer {
        float value;

        public FloatContainer(int r1, float r2) {
            this.offset = r1;
            this.value = r2;
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(BaseContainer r3) {
            if (r3.getType() == 3) goto L5;
            return false;
        L5:
            if (((FloatContainer) r3).value != this.value) goto L10;
            return true;
        L10:
            return false;
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
            return 3;
        }
    }

    public static class IntContainer extends BaseContainer {
        int value;

        public IntContainer(int r1, int r2) {
            this.offset = r1;
            this.value = r2;
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(BaseContainer r3) {
            if (r3.getType() == 2) goto L5;
            return false;
        L5:
            if (((IntContainer) r3).value != this.value) goto L10;
            return true;
        L10:
            return false;
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
            return 2;
        }
    }

    public static class LongContainer extends BaseContainer {
        long value;

        public LongContainer(int r1, long r2) {
            this.offset = r1;
            this.value = r2;
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(BaseContainer r5) {
            if (r5.getType() == 4) goto L5;
            return false;
        L5:
            if (((LongContainer) r5).value != this.value) goto L10;
            return true;
        L10:
            return false;
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
            return 4;
        }
    }

    public static class ObjectContainer extends VarContainer {
        FastEncoder encoder;

        public ObjectContainer(int r1, int r2, Object r3, int r4, boolean r5) {
            super(r1, r2, r3, r4, r5);
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(BaseContainer r3) {
            if (r3.getType() == 8) goto L5;
            return false;
        L5:
            if (Objects.equals(((ObjectContainer) r3).value, this.value) == false) goto L10;
            return true;
        L10:
            return false;
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
            return 8;
        }
    }

    public static class StringContainer extends VarContainer {
        public StringContainer(int r1, int r2, String r3, int r4, boolean r5) {
            super(r1, r2, r3, r4, r5);
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(BaseContainer r3) {
            if (r3.getType() != 6) goto L10;
            StringContainer r32 = (StringContainer) r3;
            if (r32.external == this.external) goto L7;
            return false;
        L7:
            if (Objects.equals(r32.value, this.value) == false) goto L13;
            return true;
        L13:
            return false;
        L10:
            return false;
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
            return 6;
        }
    }

    public static abstract class VarContainer extends BaseContainer {
        boolean external;
        int start;
        Object value;
        int valueSize;

        public VarContainer(int r1, int r2, Object r3, int r4, boolean r5) {
            this.start = r1;
            this.offset = r2;
            this.value = r3;
            this.valueSize = r4;
            this.external = r5;
        }
    }

    public Container() {
    }
}
