package org.luckypray.dexkit.result;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationElementData extends org.luckypray.dexkit.result.base.BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final org.luckypray.dexkit.result.AnnotationElementData.Companion f13529Companion = null;
    private final java.lang.String name;
    private final org.luckypray.dexkit.result.AnnotationEncodeValue value;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationElementData$-Companion, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(p000.AbstractC1067zq r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final org.luckypray.dexkit.result.AnnotationElementData from(org.luckypray.dexkit.DexKitBridge r3, org.luckypray.dexkit.schema.AnnotationElementMeta r4) {
                r2 = this;
                r3.getClass()
                r4.getClass()
                org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta r2 = new org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta
                r2.<init>()
                org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta r2 = r4.value(r2)
                r2.getClass()
                org.luckypray.dexkit.result.AnnotationElementData r0 = new org.luckypray.dexkit.result.AnnotationElementData
                java.lang.String r4 = r4.getName()
                r4.getClass()
                org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion r1 = org.luckypray.dexkit.result.AnnotationEncodeValue.f13531Companion
                org.luckypray.dexkit.result.AnnotationEncodeValue r2 = r1.from(r3, r2)
                r1 = 0
                r0.<init>(r3, r4, r2, r1)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.result.AnnotationElementData$-Companion r0 = new org.luckypray.dexkit.result.AnnotationElementData$-Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.result.AnnotationElementData.f13529Companion = r0
            return
    }

    private AnnotationElementData(org.luckypray.dexkit.DexKitBridge r7, java.lang.String r8, org.luckypray.dexkit.result.AnnotationEncodeValue r9) {
            r6 = this;
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r0.name = r8
            r0.value = r9
            return
    }

    public /* synthetic */ AnnotationElementData(org.luckypray.dexkit.DexKitBridge r1, java.lang.String r2, org.luckypray.dexkit.result.AnnotationEncodeValue r3, p000.AbstractC1067zq r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public final java.lang.String getName() {
            r0 = this;
            java.lang.String r0 = r0.name
            return r0
    }

    public final org.luckypray.dexkit.result.AnnotationEncodeValue getValue() {
            r0 = this;
            org.luckypray.dexkit.result.AnnotationEncodeValue r0 = r0.value
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = " = "
            r0.append(r1)
            org.luckypray.dexkit.result.AnnotationEncodeValue r2 = r2.value
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
