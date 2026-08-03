package com.alibaba.fastjson2.util;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
@com.alibaba.fastjson2.annotation.JSONType(deserializeFeatures = {com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType}, typeName = "java.lang.reflect.ParameterizedType")
public final class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType {
    private final java.lang.reflect.Type[] actualTypeArguments;
    private final java.lang.reflect.Type ownerType;
    private final java.lang.reflect.Type rawType;

    public ParameterizedTypeImpl(java.lang.reflect.Type r1, java.lang.reflect.Type... r2) {
            r0 = this;
            r0.<init>()
            r0.rawType = r1
            r0.actualTypeArguments = r2
            r1 = 0
            r0.ownerType = r1
            return
    }

    @com.alibaba.fastjson2.annotation.JSONCreator(parameterNames = {"actualTypeArguments", "ownerType", "rawType"})
    public ParameterizedTypeImpl(java.lang.reflect.Type[] r1, java.lang.reflect.Type r2, java.lang.reflect.Type r3) {
            r0 = this;
            r0.<init>()
            r0.actualTypeArguments = r1
            r0.ownerType = r2
            r0.rawType = r3
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L3b
            java.lang.Class<com.alibaba.fastjson2.util.ParameterizedTypeImpl> r2 = com.alibaba.fastjson2.util.ParameterizedTypeImpl.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L3b
        L10:
            com.alibaba.fastjson2.util.ParameterizedTypeImpl r5 = (com.alibaba.fastjson2.util.ParameterizedTypeImpl) r5
            java.lang.reflect.Type[] r2 = r4.actualTypeArguments
            java.lang.reflect.Type[] r3 = r5.actualTypeArguments
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L1d
            return r1
        L1d:
            java.lang.reflect.Type r2 = r4.ownerType
            java.lang.reflect.Type r3 = r5.ownerType
            if (r2 == 0) goto L2a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2d
            goto L2c
        L2a:
            if (r3 == 0) goto L2d
        L2c:
            return r1
        L2d:
            java.lang.reflect.Type r2 = r4.rawType
            java.lang.reflect.Type r5 = r5.rawType
            if (r2 == 0) goto L38
            boolean r5 = r2.equals(r5)
            return r5
        L38:
            if (r5 != 0) goto L3b
            return r0
        L3b:
            return r1
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type[] getActualTypeArguments() {
            r1 = this;
            java.lang.reflect.Type[] r0 = r1.actualTypeArguments
            return r0
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getOwnerType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.ownerType
            return r0
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getRawType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.rawType
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.reflect.Type[] r0 = r3.actualTypeArguments
            r1 = 0
            if (r0 == 0) goto La
            int r0 = java.util.Arrays.hashCode(r0)
            goto Lb
        La:
            r0 = r1
        Lb:
            int r0 = r0 * 31
            java.lang.reflect.Type r2 = r3.ownerType
            if (r2 == 0) goto L16
            int r2 = r2.hashCode()
            goto L17
        L16:
            r2 = r1
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.reflect.Type r2 = r3.rawType
            if (r2 == 0) goto L22
            int r1 = r2.hashCode()
        L22:
            int r0 = r0 + r1
            return r0
    }
}
