package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class KeyBuilder {
    private final org.simpleframework.xml.core.Label label;

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static class Key {
        private final org.simpleframework.xml.core.KeyBuilder.KeyType type;
        private final java.lang.String value;

        public Key(org.simpleframework.xml.core.KeyBuilder.KeyType r1, java.lang.String r2) {
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
                boolean r1 = r1.equals(r2)
                return r1
            Lb:
                r1 = 0
                return r1
        }

        public boolean equals(org.simpleframework.xml.core.KeyBuilder.Key r3) {
                r2 = this;
                org.simpleframework.xml.core.KeyBuilder$KeyType r0 = r2.type
                org.simpleframework.xml.core.KeyBuilder$KeyType r1 = r3.type
                if (r0 != r1) goto Lf
                java.lang.String r3 = r3.value
                java.lang.String r2 = r2.value
                boolean r2 = r3.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r0 = this;
                java.lang.String r0 = r0.value
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r0 = this;
                java.lang.String r0 = r0.value
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
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

    private java.lang.Object getKey(org.simpleframework.xml.core.KeyBuilder.KeyType r2) {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            java.lang.String[] r0 = r0.getPaths()
            java.lang.String r1 = r1.getKey(r0)
            if (r2 != 0) goto Ld
            return r1
        Ld:
            org.simpleframework.xml.core.KeyBuilder$Key r0 = new org.simpleframework.xml.core.KeyBuilder$Key
            r0.<init>(r2, r1)
            return r0
    }

    private java.lang.String getKey(java.lang.String[] r4) {
            r3 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r0 = r4.length
            if (r0 <= 0) goto L1c
            java.util.Arrays.sort(r4)
            int r0 = r4.length
            r1 = 0
        Ld:
            if (r1 >= r0) goto L1c
            r2 = r4[r1]
            r3.append(r2)
            r2 = 62
            r3.append(r2)
            int r1 = r1 + 1
            goto Ld
        L1c:
            java.lang.String r3 = r3.toString()
            return r3
    }

    public java.lang.Object getKey() {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.label
            boolean r0 = r0.isAttribute()
            if (r0 == 0) goto Lf
            org.simpleframework.xml.core.KeyBuilder$KeyType r0 = org.simpleframework.xml.core.KeyBuilder.KeyType.ATTRIBUTE
            java.lang.Object r1 = r1.getKey(r0)
            return r1
        Lf:
            org.simpleframework.xml.core.KeyBuilder$KeyType r0 = org.simpleframework.xml.core.KeyBuilder.KeyType.ELEMENT
            java.lang.Object r1 = r1.getKey(r0)
            return r1
    }
}
