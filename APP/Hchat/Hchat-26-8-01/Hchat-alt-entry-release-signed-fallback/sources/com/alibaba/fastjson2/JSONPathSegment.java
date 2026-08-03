package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class JSONPathSegment {

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class SelfSegment extends com.alibaba.fastjson2.JSONPathSegment {
        static final com.alibaba.fastjson2.JSONPathSegment.SelfSegment INSTANCE = null;

        static {
                com.alibaba.fastjson2.JSONPathSegment$SelfSegment r0 = new com.alibaba.fastjson2.JSONPathSegment$SelfSegment
                r0.<init>()
                com.alibaba.fastjson2.JSONPathSegment.SelfSegment.INSTANCE = r0
                return
        }

        public SelfSegment() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(com.alibaba.fastjson2.JSONPath.Context r2) {
                r1 = this;
                com.alibaba.fastjson2.JSONPath$Context r0 = r2.parent
                if (r0 != 0) goto L7
                java.lang.Object r0 = r2.root
                goto L9
            L7:
                java.lang.Object r0 = r0.value
            L9:
                r2.value = r0
                return
        }
    }

    public JSONPathSegment() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void eval(com.alibaba.fastjson2.JSONPath.Context r1);
}
