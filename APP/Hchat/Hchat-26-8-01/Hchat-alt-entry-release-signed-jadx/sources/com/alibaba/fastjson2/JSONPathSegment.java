package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONPath;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class JSONPathSegment {

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class SelfSegment extends JSONPathSegment {
        static final SelfSegment INSTANCE = new SelfSegment();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            context.value = context2 == null ? context.root : context2.value;
        }
    }

    public abstract void eval(JSONPath.Context context);
}
