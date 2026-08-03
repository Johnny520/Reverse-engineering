package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class bu {
    public com.tendcloud.tenddata.a a;
    public com.tendcloud.tenddata.bu.a b;

    public enum a extends java.lang.Enum<com.tendcloud.tenddata.bu.a> {
        private static final /* synthetic */ com.tendcloud.tenddata.bu.a[] $VALUES = null;
        public static final com.tendcloud.tenddata.bu.a HIGH = null;
        public static final com.tendcloud.tenddata.bu.a IMMEDIATELY = null;
        private final int indexNum;

        static {
                com.tendcloud.tenddata.bu$a r0 = new com.tendcloud.tenddata.bu$a
                java.lang.String r1 = "IMMEDIATELY"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.tendcloud.tenddata.bu.a.IMMEDIATELY = r0
                com.tendcloud.tenddata.bu$a r1 = new com.tendcloud.tenddata.bu$a
                java.lang.String r3 = "HIGH"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.tendcloud.tenddata.bu.a.HIGH = r1
                r3 = 2
                com.tendcloud.tenddata.bu$a[] r3 = new com.tendcloud.tenddata.bu.a[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.tendcloud.tenddata.bu.a.$VALUES = r3
                return
        }

        a(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.indexNum = r3
                return
        }

        public static com.tendcloud.tenddata.bu.a valueOf(java.lang.String r1) {
                java.lang.Class<com.tendcloud.tenddata.bu$a> r0 = com.tendcloud.tenddata.bu.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.tendcloud.tenddata.bu$a r1 = (com.tendcloud.tenddata.bu.a) r1
                return r1
        }

        public static com.tendcloud.tenddata.bu.a[] values() {
                com.tendcloud.tenddata.bu$a[] r0 = com.tendcloud.tenddata.bu.a.$VALUES
                java.lang.Object r0 = r0.clone()
                com.tendcloud.tenddata.bu$a[] r0 = (com.tendcloud.tenddata.bu.a[]) r0
                return r0
        }

        public int index() {
                r1 = this;
                int r0 = r1.indexNum
                return r0
        }
    }

    public bu() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            com.tendcloud.tenddata.bu$a r0 = com.tendcloud.tenddata.bu.a.IMMEDIATELY
            r1.b = r0
            return
    }
}
