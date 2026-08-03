package com.android.dex;

/* JADX INFO: loaded from: classes.dex */
public final class ClassData {
    private final com.android.dex.ClassData.Method[] directMethods;
    private final com.android.dex.ClassData.Field[] instanceFields;
    private final com.android.dex.ClassData.Field[] staticFields;
    private final com.android.dex.ClassData.Method[] virtualMethods;

    public static class Field {
        private final int accessFlags;
        private final int fieldIndex;

        public Field(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.fieldIndex = r1
                r0.accessFlags = r2
                return
        }

        public int getAccessFlags() {
                r1 = this;
                int r0 = r1.accessFlags
                return r0
        }

        public int getFieldIndex() {
                r1 = this;
                int r0 = r1.fieldIndex
                return r0
        }
    }

    public static class Method {
        private final int accessFlags;
        private final int codeOffset;
        private final int methodIndex;

        public Method(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.methodIndex = r1
                r0.accessFlags = r2
                r0.codeOffset = r3
                return
        }

        public int getAccessFlags() {
                r1 = this;
                int r0 = r1.accessFlags
                return r0
        }

        public int getCodeOffset() {
                r1 = this;
                int r0 = r1.codeOffset
                return r0
        }

        public int getMethodIndex() {
                r1 = this;
                int r0 = r1.methodIndex
                return r0
        }
    }

    public ClassData(com.android.dex.ClassData.Field[] r1, com.android.dex.ClassData.Field[] r2, com.android.dex.ClassData.Method[] r3, com.android.dex.ClassData.Method[] r4) {
            r0 = this;
            r0.<init>()
            r0.staticFields = r1
            r0.instanceFields = r2
            r0.directMethods = r3
            r0.virtualMethods = r4
            return
    }

    public com.android.dex.ClassData.Field[] allFields() {
            r5 = this;
            com.android.dex.ClassData$Field[] r0 = r5.staticFields
            int r1 = r0.length
            com.android.dex.ClassData$Field[] r2 = r5.instanceFields
            int r2 = r2.length
            int r1 = r1 + r2
            com.android.dex.ClassData$Field[] r1 = new com.android.dex.ClassData.Field[r1]
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            com.android.dex.ClassData$Field[] r0 = r5.instanceFields
            com.android.dex.ClassData$Field[] r2 = r5.staticFields
            int r2 = r2.length
            int r4 = r0.length
            java.lang.System.arraycopy(r0, r3, r1, r2, r4)
            return r1
    }

    public com.android.dex.ClassData.Method[] allMethods() {
            r5 = this;
            com.android.dex.ClassData$Method[] r0 = r5.directMethods
            int r1 = r0.length
            com.android.dex.ClassData$Method[] r2 = r5.virtualMethods
            int r2 = r2.length
            int r1 = r1 + r2
            com.android.dex.ClassData$Method[] r1 = new com.android.dex.ClassData.Method[r1]
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            com.android.dex.ClassData$Method[] r0 = r5.virtualMethods
            com.android.dex.ClassData$Method[] r2 = r5.directMethods
            int r2 = r2.length
            int r4 = r0.length
            java.lang.System.arraycopy(r0, r3, r1, r2, r4)
            return r1
    }

    public com.android.dex.ClassData.Method[] getDirectMethods() {
            r1 = this;
            com.android.dex.ClassData$Method[] r0 = r1.directMethods
            return r0
    }

    public com.android.dex.ClassData.Field[] getInstanceFields() {
            r1 = this;
            com.android.dex.ClassData$Field[] r0 = r1.instanceFields
            return r0
    }

    public com.android.dex.ClassData.Field[] getStaticFields() {
            r1 = this;
            com.android.dex.ClassData$Field[] r0 = r1.staticFields
            return r0
    }

    public com.android.dex.ClassData.Method[] getVirtualMethods() {
            r1 = this;
            com.android.dex.ClassData$Method[] r0 = r1.virtualMethods
            return r0
    }
}
