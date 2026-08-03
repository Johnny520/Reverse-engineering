package com.android.dex;

/* JADX INFO: loaded from: classes.dex */
public class MethodHandle implements java.lang.Comparable<com.android.dex.MethodHandle> {
    private final com.android.dex.Dex dex;
    private final int fieldOrMethodId;
    private final com.android.dex.MethodHandle.MethodHandleType methodHandleType;
    private final int unused1;
    private final int unused2;

    /* JADX INFO: renamed from: com.android.dex.MethodHandle$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$android$dex$MethodHandle$MethodHandleType = null;

        static {
                com.android.dex.MethodHandle$MethodHandleType[] r0 = com.android.dex.MethodHandle.MethodHandleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.android.dex.MethodHandle.AnonymousClass1.$SwitchMap$com$android$dex$MethodHandle$MethodHandleType = r0
                com.android.dex.MethodHandle$MethodHandleType r1 = com.android.dex.MethodHandle.MethodHandleType.METHOD_HANDLE_TYPE_STATIC_PUT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.android.dex.MethodHandle.AnonymousClass1.$SwitchMap$com$android$dex$MethodHandle$MethodHandleType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.android.dex.MethodHandle$MethodHandleType r1 = com.android.dex.MethodHandle.MethodHandleType.METHOD_HANDLE_TYPE_STATIC_GET     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.android.dex.MethodHandle.AnonymousClass1.$SwitchMap$com$android$dex$MethodHandle$MethodHandleType     // Catch: java.lang.NoSuchFieldError -> L28
                com.android.dex.MethodHandle$MethodHandleType r1 = com.android.dex.MethodHandle.MethodHandleType.METHOD_HANDLE_TYPE_INSTANCE_PUT     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.android.dex.MethodHandle.AnonymousClass1.$SwitchMap$com$android$dex$MethodHandle$MethodHandleType     // Catch: java.lang.NoSuchFieldError -> L33
                com.android.dex.MethodHandle$MethodHandleType r1 = com.android.dex.MethodHandle.MethodHandleType.METHOD_HANDLE_TYPE_INSTANCE_GET     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public enum MethodHandleType extends java.lang.Enum<com.android.dex.MethodHandle.MethodHandleType> {
        private static final /* synthetic */ com.android.dex.MethodHandle.MethodHandleType[] $VALUES = null;
        public static final com.android.dex.MethodHandle.MethodHandleType METHOD_HANDLE_TYPE_INSTANCE_GET = null;
        public static final com.android.dex.MethodHandle.MethodHandleType METHOD_HANDLE_TYPE_INSTANCE_PUT = null;
        public static final com.android.dex.MethodHandle.MethodHandleType METHOD_HANDLE_TYPE_INVOKE_CONSTRUCTOR = null;
        public static final com.android.dex.MethodHandle.MethodHandleType METHOD_HANDLE_TYPE_INVOKE_DIRECT = null;
        public static final com.android.dex.MethodHandle.MethodHandleType METHOD_HANDLE_TYPE_INVOKE_INSTANCE = null;
        public static final com.android.dex.MethodHandle.MethodHandleType METHOD_HANDLE_TYPE_INVOKE_INTERFACE = null;
        public static final com.android.dex.MethodHandle.MethodHandleType METHOD_HANDLE_TYPE_INVOKE_STATIC = null;
        public static final com.android.dex.MethodHandle.MethodHandleType METHOD_HANDLE_TYPE_STATIC_GET = null;
        public static final com.android.dex.MethodHandle.MethodHandleType METHOD_HANDLE_TYPE_STATIC_PUT = null;
        private final int value;

        static {
                com.android.dex.MethodHandle$MethodHandleType r0 = new com.android.dex.MethodHandle$MethodHandleType
                java.lang.String r1 = "METHOD_HANDLE_TYPE_STATIC_PUT"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.android.dex.MethodHandle.MethodHandleType.METHOD_HANDLE_TYPE_STATIC_PUT = r0
                com.android.dex.MethodHandle$MethodHandleType r1 = new com.android.dex.MethodHandle$MethodHandleType
                java.lang.String r2 = "METHOD_HANDLE_TYPE_STATIC_GET"
                r3 = 1
                r1.<init>(r2, r3, r3)
                com.android.dex.MethodHandle.MethodHandleType.METHOD_HANDLE_TYPE_STATIC_GET = r1
                com.android.dex.MethodHandle$MethodHandleType r2 = new com.android.dex.MethodHandle$MethodHandleType
                java.lang.String r3 = "METHOD_HANDLE_TYPE_INSTANCE_PUT"
                r4 = 2
                r2.<init>(r3, r4, r4)
                com.android.dex.MethodHandle.MethodHandleType.METHOD_HANDLE_TYPE_INSTANCE_PUT = r2
                com.android.dex.MethodHandle$MethodHandleType r3 = new com.android.dex.MethodHandle$MethodHandleType
                java.lang.String r4 = "METHOD_HANDLE_TYPE_INSTANCE_GET"
                r5 = 3
                r3.<init>(r4, r5, r5)
                com.android.dex.MethodHandle.MethodHandleType.METHOD_HANDLE_TYPE_INSTANCE_GET = r3
                com.android.dex.MethodHandle$MethodHandleType r4 = new com.android.dex.MethodHandle$MethodHandleType
                java.lang.String r5 = "METHOD_HANDLE_TYPE_INVOKE_STATIC"
                r6 = 4
                r4.<init>(r5, r6, r6)
                com.android.dex.MethodHandle.MethodHandleType.METHOD_HANDLE_TYPE_INVOKE_STATIC = r4
                com.android.dex.MethodHandle$MethodHandleType r5 = new com.android.dex.MethodHandle$MethodHandleType
                java.lang.String r6 = "METHOD_HANDLE_TYPE_INVOKE_INSTANCE"
                r7 = 5
                r5.<init>(r6, r7, r7)
                com.android.dex.MethodHandle.MethodHandleType.METHOD_HANDLE_TYPE_INVOKE_INSTANCE = r5
                com.android.dex.MethodHandle$MethodHandleType r6 = new com.android.dex.MethodHandle$MethodHandleType
                java.lang.String r7 = "METHOD_HANDLE_TYPE_INVOKE_DIRECT"
                r8 = 6
                r6.<init>(r7, r8, r8)
                com.android.dex.MethodHandle.MethodHandleType.METHOD_HANDLE_TYPE_INVOKE_DIRECT = r6
                com.android.dex.MethodHandle$MethodHandleType r7 = new com.android.dex.MethodHandle$MethodHandleType
                java.lang.String r8 = "METHOD_HANDLE_TYPE_INVOKE_CONSTRUCTOR"
                r9 = 7
                r7.<init>(r8, r9, r9)
                com.android.dex.MethodHandle.MethodHandleType.METHOD_HANDLE_TYPE_INVOKE_CONSTRUCTOR = r7
                com.android.dex.MethodHandle$MethodHandleType r8 = new com.android.dex.MethodHandle$MethodHandleType
                java.lang.String r9 = "METHOD_HANDLE_TYPE_INVOKE_INTERFACE"
                r10 = 8
                r8.<init>(r9, r10, r10)
                com.android.dex.MethodHandle.MethodHandleType.METHOD_HANDLE_TYPE_INVOKE_INTERFACE = r8
                com.android.dex.MethodHandle$MethodHandleType[] r0 = new com.android.dex.MethodHandle.MethodHandleType[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
                com.android.dex.MethodHandle.MethodHandleType.$VALUES = r0
                return
        }

        MethodHandleType(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static /* synthetic */ int access$000(com.android.dex.MethodHandle.MethodHandleType r0) {
                int r0 = r0.value
                return r0
        }

        public static com.android.dex.MethodHandle.MethodHandleType fromValue(int r5) {
                com.android.dex.MethodHandle$MethodHandleType[] r0 = values()
                int r1 = r0.length
                r2 = 0
            L6:
                if (r2 >= r1) goto L12
                r3 = r0[r2]
                int r4 = r3.value
                if (r4 != r5) goto Lf
                return r3
            Lf:
                int r2 = r2 + 1
                goto L6
            L12:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r5 = java.lang.String.valueOf(r5)
                r0.<init>(r5)
                throw r0
        }

        public static com.android.dex.MethodHandle.MethodHandleType valueOf(java.lang.String r1) {
                java.lang.Class<com.android.dex.MethodHandle$MethodHandleType> r0 = com.android.dex.MethodHandle.MethodHandleType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.android.dex.MethodHandle$MethodHandleType r1 = (com.android.dex.MethodHandle.MethodHandleType) r1
                return r1
        }

        public static com.android.dex.MethodHandle.MethodHandleType[] values() {
                com.android.dex.MethodHandle$MethodHandleType[] r0 = com.android.dex.MethodHandle.MethodHandleType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.android.dex.MethodHandle$MethodHandleType[] r0 = (com.android.dex.MethodHandle.MethodHandleType[]) r0
                return r0
        }

        public boolean isField() {
                r3 = this;
                int[] r0 = com.android.dex.MethodHandle.AnonymousClass1.$SwitchMap$com$android$dex$MethodHandle$MethodHandleType
                int r1 = r3.ordinal()
                r0 = r0[r1]
                r1 = 1
                if (r0 == r1) goto L16
                r2 = 2
                if (r0 == r2) goto L16
                r2 = 3
                if (r0 == r2) goto L16
                r2 = 4
                if (r0 == r2) goto L16
                r0 = 0
                return r0
            L16:
                return r1
        }
    }

    public MethodHandle(com.android.dex.Dex r1, com.android.dex.MethodHandle.MethodHandleType r2, int r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.dex = r1
            r0.methodHandleType = r2
            r0.unused1 = r3
            r0.fieldOrMethodId = r4
            r0.unused2 = r5
            return
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.android.dex.MethodHandle r3) {
            r2 = this;
            com.android.dex.MethodHandle$MethodHandleType r0 = r2.methodHandleType
            com.android.dex.MethodHandle$MethodHandleType r1 = r3.methodHandleType
            if (r0 == r1) goto Lb
            int r3 = r0.compareTo(r1)
            return r3
        Lb:
            int r0 = r2.fieldOrMethodId
            int r3 = r3.fieldOrMethodId
            int r3 = com.android.dex.util.Unsigned.compare(r0, r3)
            return r3
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.android.dex.MethodHandle r1) {
            r0 = this;
            com.android.dex.MethodHandle r1 = (com.android.dex.MethodHandle) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public int getFieldOrMethodId() {
            r1 = this;
            int r0 = r1.fieldOrMethodId
            return r0
    }

    public com.android.dex.MethodHandle.MethodHandleType getMethodHandleType() {
            r1 = this;
            com.android.dex.MethodHandle$MethodHandleType r0 = r1.methodHandleType
            return r0
    }

    public int getUnused1() {
            r1 = this;
            int r0 = r1.unused1
            return r0
    }

    public int getUnused2() {
            r1 = this;
            int r0 = r1.unused2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            com.android.dex.Dex r0 = r3.dex
            java.lang.String r1 = " "
            if (r0 != 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.android.dex.MethodHandle$MethodHandleType r2 = r3.methodHandleType
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.fieldOrMethodId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.android.dex.MethodHandle$MethodHandleType r2 = r3.methodHandleType
            r0.append(r2)
            r0.append(r1)
            com.android.dex.MethodHandle$MethodHandleType r1 = r3.methodHandleType
            boolean r1 = r1.isField()
            if (r1 == 0) goto L41
            com.android.dex.Dex r1 = r3.dex
            java.util.List r1 = r1.fieldIds()
            int r2 = r3.fieldOrMethodId
            java.lang.Object r1 = r1.get(r2)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            goto L4f
        L41:
            com.android.dex.Dex r1 = r3.dex
            java.util.List r1 = r1.methodIds()
            int r2 = r3.fieldOrMethodId
            java.lang.Object r1 = r1.get(r2)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L4f:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void writeTo(com.android.dex.Dex.Section r2) {
            r1 = this;
            com.android.dex.MethodHandle$MethodHandleType r0 = r1.methodHandleType
            int r0 = com.android.dex.MethodHandle.MethodHandleType.access$000(r0)
            r2.writeUnsignedShort(r0)
            int r0 = r1.unused1
            r2.writeUnsignedShort(r0)
            int r0 = r1.fieldOrMethodId
            r2.writeUnsignedShort(r0)
            int r0 = r1.unused2
            r2.writeUnsignedShort(r0)
            return
    }
}
