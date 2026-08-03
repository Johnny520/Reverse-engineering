package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class JSONValidator {
    private final com.alibaba.fastjson2.JSONReader jsonReader;
    private com.alibaba.fastjson2.JSONValidator.Type type;
    private java.lang.Boolean validateResult;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public enum Type extends java.lang.Enum<com.alibaba.fastjson2.JSONValidator.Type> {
        private static final /* synthetic */ com.alibaba.fastjson2.JSONValidator.Type[] $VALUES = null;
        public static final com.alibaba.fastjson2.JSONValidator.Type Array = null;
        public static final com.alibaba.fastjson2.JSONValidator.Type Object = null;
        public static final com.alibaba.fastjson2.JSONValidator.Type Value = null;

        static {
                com.alibaba.fastjson2.JSONValidator$Type r0 = new com.alibaba.fastjson2.JSONValidator$Type
                java.lang.String r1 = "Object"
                r2 = 0
                r0.<init>(r1, r2)
                com.alibaba.fastjson2.JSONValidator.Type.Object = r0
                com.alibaba.fastjson2.JSONValidator$Type r1 = new com.alibaba.fastjson2.JSONValidator$Type
                java.lang.String r2 = "Array"
                r3 = 1
                r1.<init>(r2, r3)
                com.alibaba.fastjson2.JSONValidator.Type.Array = r1
                com.alibaba.fastjson2.JSONValidator$Type r2 = new com.alibaba.fastjson2.JSONValidator$Type
                java.lang.String r3 = "Value"
                r4 = 2
                r2.<init>(r3, r4)
                com.alibaba.fastjson2.JSONValidator.Type.Value = r2
                com.alibaba.fastjson2.JSONValidator$Type[] r0 = new com.alibaba.fastjson2.JSONValidator.Type[]{r0, r1, r2}
                com.alibaba.fastjson2.JSONValidator.Type.$VALUES = r0
                return
        }

        Type(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.alibaba.fastjson2.JSONValidator.Type valueOf(java.lang.String r1) {
                java.lang.Class<com.alibaba.fastjson2.JSONValidator$Type> r0 = com.alibaba.fastjson2.JSONValidator.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.alibaba.fastjson2.JSONValidator$Type r1 = (com.alibaba.fastjson2.JSONValidator.Type) r1
                return r1
        }

        public static com.alibaba.fastjson2.JSONValidator.Type[] values() {
                com.alibaba.fastjson2.JSONValidator$Type[] r0 = com.alibaba.fastjson2.JSONValidator.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                com.alibaba.fastjson2.JSONValidator$Type[] r0 = (com.alibaba.fastjson2.JSONValidator.Type[]) r0
                return r0
        }
    }

    public JSONValidator(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            r0.<init>()
            r0.jsonReader = r1
            return
    }

    public static com.alibaba.fastjson2.JSONValidator from(com.alibaba.fastjson2.JSONReader r1) {
            com.alibaba.fastjson2.JSONValidator r0 = new com.alibaba.fastjson2.JSONValidator
            r0.<init>(r1)
            return r0
    }

    public static com.alibaba.fastjson2.JSONValidator from(java.lang.String r1) {
            com.alibaba.fastjson2.JSONValidator r0 = new com.alibaba.fastjson2.JSONValidator
            com.alibaba.fastjson2.JSONReader r1 = com.alibaba.fastjson2.JSONReader.of(r1)
            r0.<init>(r1)
            return r0
    }

    public static com.alibaba.fastjson2.JSONValidator fromUtf8(byte[] r1) {
            com.alibaba.fastjson2.JSONValidator r0 = new com.alibaba.fastjson2.JSONValidator
            com.alibaba.fastjson2.JSONReader r1 = com.alibaba.fastjson2.JSONReader.of(r1)
            r0.<init>(r1)
            return r0
    }

    public com.alibaba.fastjson2.JSONValidator.Type getType() {
            r1 = this;
            com.alibaba.fastjson2.JSONValidator$Type r0 = r1.type
            if (r0 != 0) goto L7
            r1.validate()
        L7:
            com.alibaba.fastjson2.JSONValidator$Type r0 = r1.type
            return r0
    }

    public boolean validate() {
            r2 = this;
            java.lang.Boolean r0 = r2.validateResult
            if (r0 == 0) goto L9
            boolean r0 = r0.booleanValue()
            return r0
        L9:
            com.alibaba.fastjson2.JSONReader r0 = r2.jsonReader     // Catch: java.lang.Throwable -> L3c java.lang.Throwable -> L3e
            char r0 = r0.current()     // Catch: java.lang.Throwable -> L3c java.lang.Throwable -> L3e
            com.alibaba.fastjson2.JSONReader r1 = r2.jsonReader     // Catch: java.lang.Throwable -> L3c java.lang.Throwable -> L3e
            r1.skipValue()     // Catch: java.lang.Throwable -> L3c java.lang.Throwable -> L3e
            com.alibaba.fastjson2.JSONReader r1 = r2.jsonReader
            r1.close()
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 != r1) goto L22
            com.alibaba.fastjson2.JSONValidator$Type r0 = com.alibaba.fastjson2.JSONValidator.Type.Object
            r2.type = r0
            goto L2f
        L22:
            r1 = 91
            if (r0 != r1) goto L2b
            com.alibaba.fastjson2.JSONValidator$Type r0 = com.alibaba.fastjson2.JSONValidator.Type.Array
            r2.type = r0
            goto L2f
        L2b:
            com.alibaba.fastjson2.JSONValidator$Type r0 = com.alibaba.fastjson2.JSONValidator.Type.Value
            r2.type = r0
        L2f:
            com.alibaba.fastjson2.JSONReader r0 = r2.jsonReader
            boolean r0 = r0.isEnd()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r2.validateResult = r1
            return r0
        L3c:
            r0 = move-exception
            goto L49
        L3e:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L3c
            r2.validateResult = r0     // Catch: java.lang.Throwable -> L3c
            com.alibaba.fastjson2.JSONReader r0 = r2.jsonReader
            r0.close()
            r0 = 0
            return r0
        L49:
            com.alibaba.fastjson2.JSONReader r1 = r2.jsonReader
            r1.close()
            throw r0
    }
}
