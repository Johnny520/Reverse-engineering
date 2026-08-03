package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class KeyBuilder {
    private final org.simpleframework.xml.core.Label label;

    public static class Key {
        private final org.simpleframework.xml.core.KeyBuilder.KeyType type;
        private final java.lang.String value;

        public Key(org.simpleframework.xml.core.KeyBuilder.KeyType r1, java.lang.String r2) throws java.lang.Exception {
                r0 = this;
                r0.<init>()
                r0.value = r2
                r0.type = r1
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof org.simpleframework.xml.core.KeyBuilder.Key
                if (r0 == 0) goto Lb
                org.simpleframework.xml.core.KeyBuilder$Key r2 = (org.simpleframework.xml.core.KeyBuilder.Key) r2
                boolean r2 = r1.equals(r2)
                return r2
            Lb:
                r2 = 0
                return r2
        }

        public boolean equals(org.simpleframework.xml.core.KeyBuilder.Key r3) {
                r2 = this;
                org.simpleframework.xml.core.KeyBuilder$KeyType r0 = r2.type
                org.simpleframework.xml.core.KeyBuilder$KeyType r1 = r3.type
                if (r0 != r1) goto Lf
                java.lang.String r3 = r3.value
                java.lang.String r0 = r2.value
                boolean r3 = r3.equals(r0)
                return r3
            Lf:
                r3 = 0
                return r3
        }

        public int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.value
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.value
                return r0
        }
    }

    public enum KeyType extends java.lang.Enum<org.simpleframework.xml.core.KeyBuilder.KeyType> {
        private static final /* synthetic */ org.simpleframework.xml.core.KeyBuilder.KeyType[] $VALUES = null;
        public static final org.simpleframework.xml.core.KeyBuilder.KeyType ATTRIBUTE = null;
        public static final org.simpleframework.xml.core.KeyBuilder.KeyType ELEMENT = null;
        public static final org.simpleframework.xml.core.KeyBuilder.KeyType TEXT = null;

        static {
                org.simpleframework.xml.core.KeyBuilder$KeyType r0 = new org.simpleframework.xml.core.KeyBuilder$KeyType
                java.lang.String r1 = "TEXT"
                r2 = 0
                r0.<init>(r1, r2)
                org.simpleframework.xml.core.KeyBuilder.KeyType.TEXT = r0
                org.simpleframework.xml.core.KeyBuilder$KeyType r1 = new org.simpleframework.xml.core.KeyBuilder$KeyType
                java.lang.String r2 = "ATTRIBUTE"
                r3 = 1
                r1.<init>(r2, r3)
                org.simpleframework.xml.core.KeyBuilder.KeyType.ATTRIBUTE = r1
                org.simpleframework.xml.core.KeyBuilder$KeyType r2 = new org.simpleframework.xml.core.KeyBuilder$KeyType
                java.lang.String r3 = "ELEMENT"
                r4 = 2
                r2.<init>(r3, r4)
                org.simpleframework.xml.core.KeyBuilder.KeyType.ELEMENT = r2
                org.simpleframework.xml.core.KeyBuilder$KeyType[] r0 = new org.simpleframework.xml.core.KeyBuilder.KeyType[]{r0, r1, r2}
                org.simpleframework.xml.core.KeyBuilder.KeyType.$VALUES = r0
                return
        }

        KeyType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.simpleframework.xml.core.KeyBuilder.KeyType valueOf(java.lang.String r1) {
                java.lang.Class<org.simpleframework.xml.core.KeyBuilder$KeyType> r0 = org.simpleframework.xml.core.KeyBuilder.KeyType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.simpleframework.xml.core.KeyBuilder$KeyType r1 = (org.simpleframework.xml.core.KeyBuilder.KeyType) r1
                return r1
        }

        public static org.simpleframework.xml.core.KeyBuilder.KeyType[] values() {
                org.simpleframework.xml.core.KeyBuilder$KeyType[] r0 = org.simpleframework.xml.core.KeyBuilder.KeyType.$VALUES
                java.lang.Object r0 = r0.clone()
                org.simpleframework.xml.core.KeyBuilder$KeyType[] r0 = (org.simpleframework.xml.core.KeyBuilder.KeyType[]) r0
                return r0
        }
    }

    public KeyBuilder(org.simpleframework.xml.core.Label r1) {
            r0 = this;
            r0.<init>()
            r0.label = r1
            return
    }

    private java.lang.Object getKey(org.simpleframework.xml.core.KeyBuilder.KeyType r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Label r0 = r2.label
            java.lang.String[] r0 = r0.getPaths()
            java.lang.String r0 = r2.getKey(r0)
            if (r3 != 0) goto Ld
            return r0
        Ld:
            org.simpleframework.xml.core.KeyBuilder$Key r1 = new org.simpleframework.xml.core.KeyBuilder$Key
            r1.<init>(r3, r0)
            return r1
    }

    private java.lang.String getKey(java.lang.String[] r5) throws java.lang.Exception {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.length
            if (r1 <= 0) goto L1c
            java.util.Arrays.sort(r5)
            int r1 = r5.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L1c
            r3 = r5[r2]
            r0.append(r3)
            r3 = 62
            r0.append(r3)
            int r2 = r2 + 1
            goto Ld
        L1c:
            java.lang.String r5 = r0.toString()
            return r5
    }

    public java.lang.Object getKey() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            boolean r0 = r0.isAttribute()
            if (r0 == 0) goto Lf
            org.simpleframework.xml.core.KeyBuilder$KeyType r0 = org.simpleframework.xml.core.KeyBuilder.KeyType.ATTRIBUTE
            java.lang.Object r0 = r1.getKey(r0)
            return r0
        Lf:
            org.simpleframework.xml.core.KeyBuilder$KeyType r0 = org.simpleframework.xml.core.KeyBuilder.KeyType.ELEMENT
            java.lang.Object r0 = r1.getKey(r0)
            return r0
    }
}
