package io.fastkv;

/* JADX INFO: loaded from: classes.dex */
class Container {

    public static class ArrayContainer extends io.fastkv.Container.VarContainer {
        public ArrayContainer(int r1, int r2, java.lang.Object r3, int r4, boolean r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(io.fastkv.Container.BaseContainer r4) {
                r3 = this;
                byte r0 = r4.getType()
                r1 = 7
                r2 = 0
                if (r0 == r1) goto L9
                return r2
            L9:
                io.fastkv.Container$ArrayContainer r4 = (io.fastkv.Container.ArrayContainer) r4
                java.lang.Object r4 = r4.value
                java.lang.Object r0 = r3.value
                if (r0 != r4) goto L13
                r4 = 1
                return r4
            L13:
                if (r0 == 0) goto L31
                if (r4 == 0) goto L31
                boolean r1 = r0 instanceof java.lang.String
                if (r1 == 0) goto L20
                boolean r4 = r0.equals(r4)
                return r4
            L20:
                boolean r1 = r0 instanceof byte[]
                if (r1 == 0) goto L31
                boolean r1 = r4 instanceof byte[]
                if (r1 == 0) goto L31
                byte[] r0 = (byte[]) r0
                byte[] r4 = (byte[]) r4
                boolean r4 = java.util.Arrays.equals(r0, r4)
                return r4
            L31:
                return r2
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
                r1 = this;
                r0 = 7
                return r0
        }
    }

    public static abstract class BaseContainer {
        int offset;

        public BaseContainer() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract boolean equalTo(io.fastkv.Container.BaseContainer r1);

        public abstract byte getType();
    }

    public static class BooleanContainer extends io.fastkv.Container.BaseContainer {
        boolean value;

        public BooleanContainer(int r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.offset = r1
                r0.value = r2
                return
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(io.fastkv.Container.BaseContainer r3) {
                r2 = this;
                byte r0 = r3.getType()
                r1 = 1
                if (r0 != r1) goto L10
                io.fastkv.Container$BooleanContainer r3 = (io.fastkv.Container.BooleanContainer) r3
                boolean r3 = r3.value
                boolean r0 = r2.value
                if (r3 != r0) goto L10
                return r1
            L10:
                r3 = 0
                return r3
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public static class DoubleContainer extends io.fastkv.Container.BaseContainer {
        double value;

        public DoubleContainer(int r1, double r2) {
                r0 = this;
                r0.<init>()
                r0.offset = r1
                r0.value = r2
                return
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(io.fastkv.Container.BaseContainer r5) {
                r4 = this;
                byte r0 = r5.getType()
                r1 = 5
                if (r0 != r1) goto L13
                io.fastkv.Container$DoubleContainer r5 = (io.fastkv.Container.DoubleContainer) r5
                double r0 = r5.value
                double r2 = r4.value
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 != 0) goto L13
                r5 = 1
                return r5
            L13:
                r5 = 0
                return r5
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
                r1 = this;
                r0 = 5
                return r0
        }
    }

    public static class FloatContainer extends io.fastkv.Container.BaseContainer {
        float value;

        public FloatContainer(int r1, float r2) {
                r0 = this;
                r0.<init>()
                r0.offset = r1
                r0.value = r2
                return
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(io.fastkv.Container.BaseContainer r3) {
                r2 = this;
                byte r0 = r3.getType()
                r1 = 3
                if (r0 != r1) goto L13
                io.fastkv.Container$FloatContainer r3 = (io.fastkv.Container.FloatContainer) r3
                float r3 = r3.value
                float r0 = r2.value
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 != 0) goto L13
                r3 = 1
                return r3
            L13:
                r3 = 0
                return r3
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
                r1 = this;
                r0 = 3
                return r0
        }
    }

    public static class IntContainer extends io.fastkv.Container.BaseContainer {
        int value;

        public IntContainer(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.offset = r1
                r0.value = r2
                return
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(io.fastkv.Container.BaseContainer r3) {
                r2 = this;
                byte r0 = r3.getType()
                r1 = 2
                if (r0 != r1) goto L11
                io.fastkv.Container$IntContainer r3 = (io.fastkv.Container.IntContainer) r3
                int r3 = r3.value
                int r0 = r2.value
                if (r3 != r0) goto L11
                r3 = 1
                return r3
            L11:
                r3 = 0
                return r3
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
                r1 = this;
                r0 = 2
                return r0
        }
    }

    public static class LongContainer extends io.fastkv.Container.BaseContainer {
        long value;

        public LongContainer(int r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.offset = r1
                r0.value = r2
                return
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(io.fastkv.Container.BaseContainer r5) {
                r4 = this;
                byte r0 = r5.getType()
                r1 = 4
                if (r0 != r1) goto L13
                io.fastkv.Container$LongContainer r5 = (io.fastkv.Container.LongContainer) r5
                long r0 = r5.value
                long r2 = r4.value
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 != 0) goto L13
                r5 = 1
                return r5
            L13:
                r5 = 0
                return r5
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
                r1 = this;
                r0 = 4
                return r0
        }
    }

    public static class ObjectContainer extends io.fastkv.Container.VarContainer {
        io.fastkv.interfaces.FastEncoder encoder;

        public ObjectContainer(int r1, int r2, java.lang.Object r3, int r4, boolean r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(io.fastkv.Container.BaseContainer r3) {
                r2 = this;
                byte r0 = r3.getType()
                r1 = 8
                if (r0 != r1) goto L16
                io.fastkv.Container$ObjectContainer r3 = (io.fastkv.Container.ObjectContainer) r3
                java.lang.Object r3 = r3.value
                java.lang.Object r0 = r2.value
                boolean r3 = java.util.Objects.equals(r3, r0)
                if (r3 == 0) goto L16
                r3 = 1
                return r3
            L16:
                r3 = 0
                return r3
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
                r1 = this;
                r0 = 8
                return r0
        }
    }

    public static class StringContainer extends io.fastkv.Container.VarContainer {
        public StringContainer(int r1, int r2, java.lang.String r3, int r4, boolean r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // io.fastkv.Container.BaseContainer
        public boolean equalTo(io.fastkv.Container.BaseContainer r3) {
                r2 = this;
                byte r0 = r3.getType()
                r1 = 6
                if (r0 != r1) goto L1b
                io.fastkv.Container$StringContainer r3 = (io.fastkv.Container.StringContainer) r3
                boolean r0 = r3.external
                boolean r1 = r2.external
                if (r0 != r1) goto L1b
                java.lang.Object r3 = r3.value
                java.lang.Object r0 = r2.value
                boolean r3 = java.util.Objects.equals(r3, r0)
                if (r3 == 0) goto L1b
                r3 = 1
                return r3
            L1b:
                r3 = 0
                return r3
        }

        @Override // io.fastkv.Container.BaseContainer
        public byte getType() {
                r1 = this;
                r0 = 6
                return r0
        }
    }

    public static abstract class VarContainer extends io.fastkv.Container.BaseContainer {
        boolean external;
        int start;
        java.lang.Object value;
        int valueSize;

        public VarContainer(int r1, int r2, java.lang.Object r3, int r4, boolean r5) {
                r0 = this;
                r0.<init>()
                r0.start = r1
                r0.offset = r2
                r0.value = r3
                r0.valueSize = r4
                r0.external = r5
                return
        }
    }

    public Container() {
            r0 = this;
            r0.<init>()
            return
    }
}
