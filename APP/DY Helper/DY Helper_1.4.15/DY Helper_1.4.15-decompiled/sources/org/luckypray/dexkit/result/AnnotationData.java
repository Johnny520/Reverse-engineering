package org.luckypray.dexkit.result;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationData extends org.luckypray.dexkit.result.base.BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final org.luckypray.dexkit.result.AnnotationData.Companion f13528Companion = null;
    private final p000.oq0 dexClass$delegate;
    private final java.util.List<org.luckypray.dexkit.result.AnnotationElementData> elements;
    private final java.lang.String typeDescriptor;
    private final int typeId;
    private final org.luckypray.dexkit.query.enums.AnnotationVisibilityType visibility;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationData$-Companion, reason: invalid class name */
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

        public final org.luckypray.dexkit.result.AnnotationData from(org.luckypray.dexkit.DexKitBridge r9, org.luckypray.dexkit.schema.AnnotationMeta r10) {
                r8 = this;
                r9.getClass()
                r10.getClass()
                int r2 = r10.m7414getDexIdpVg5ArA()
                int r3 = r10.m7415getTypeIdpVg5ArA()
                java.lang.String r4 = r10.getTypeDescriptor()
                r4.getClass()
                org.luckypray.dexkit.query.enums.AnnotationVisibilityType$Companion r8 = org.luckypray.dexkit.query.enums.AnnotationVisibilityType.Companion
                byte r0 = r10.getVisibility()
                org.luckypray.dexkit.query.enums.AnnotationVisibilityType r5 = r8.from(r0)
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                int r8 = r10.getElementsLength()
                r0 = 0
            L29:
                if (r0 >= r8) goto L3e
                org.luckypray.dexkit.result.AnnotationElementData$-Companion r1 = org.luckypray.dexkit.result.AnnotationElementData.f13529Companion
                org.luckypray.dexkit.schema.-AnnotationElementMeta r7 = r10.elements(r0)
                r7.getClass()
                org.luckypray.dexkit.result.AnnotationElementData r1 = r1.from(r9, r7)
                r6.add(r1)
                int r0 = r0 + 1
                goto L29
            L3e:
                org.luckypray.dexkit.result.AnnotationData r0 = new org.luckypray.dexkit.result.AnnotationData
                r7 = 0
                r1 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.result.AnnotationData$-Companion r0 = new org.luckypray.dexkit.result.AnnotationData$-Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.result.AnnotationData.f13528Companion = r0
            return
    }

    private AnnotationData(org.luckypray.dexkit.DexKitBridge r7, int r8, int r9, java.lang.String r10, org.luckypray.dexkit.query.enums.AnnotationVisibilityType r11, java.util.List<org.luckypray.dexkit.result.AnnotationElementData> r12) {
            r6 = this;
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r0.typeId = r9
            r0.typeDescriptor = r10
            r0.visibility = r11
            r0.elements = r12
            org.luckypray.dexkit.result.AnnotationData$dexClass$2 r6 = new org.luckypray.dexkit.result.AnnotationData$dexClass$2
            r6.<init>(r0)
            h22 r7 = new h22
            r7.<init>(r6)
            r0.dexClass$delegate = r7
            return
    }

    public /* synthetic */ AnnotationData(org.luckypray.dexkit.DexKitBridge r1, int r2, int r3, java.lang.String r4, org.luckypray.dexkit.query.enums.AnnotationVisibilityType r5, java.util.List r6, p000.AbstractC1067zq r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private final org.luckypray.dexkit.wrap.DexClass getDexClass() {
            r0 = this;
            oq0 r0 = r0.dexClass$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.wrap.DexClass r0 = (org.luckypray.dexkit.wrap.DexClass) r0
            return r0
    }

    public final java.util.List<org.luckypray.dexkit.result.AnnotationElementData> getElements() {
            r0 = this;
            java.util.List<org.luckypray.dexkit.result.AnnotationElementData> r0 = r0.elements
            return r0
    }

    public final java.lang.String getTypeDescriptor() {
            r0 = this;
            java.lang.String r0 = r0.typeDescriptor
            return r0
    }

    public final int getTypeId() {
            r0 = this;
            int r0 = r0.typeId
            return r0
    }

    public final java.lang.String getTypeName() {
            r0 = this;
            org.luckypray.dexkit.wrap.DexClass r0 = r0.getDexClass()
            java.lang.String r0 = r0.getTypeName()
            return r0
    }

    public final org.luckypray.dexkit.query.enums.AnnotationVisibilityType getVisibility() {
            r0 = this;
            org.luckypray.dexkit.query.enums.AnnotationVisibilityType r0 = r0.visibility
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.typeDescriptor
            java.lang.String r1 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "@"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            java.util.List<org.luckypray.dexkit.result.AnnotationElementData> r4 = r4.elements
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L28:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r4.next()
            int r3 = r1 + 1
            if (r1 < 0) goto L44
            org.luckypray.dexkit.result.AnnotationElementData r2 = (org.luckypray.dexkit.result.AnnotationElementData) r2
            if (r1 == 0) goto L3f
            java.lang.String r1 = ", "
            r0.append(r1)
        L3f:
            r0.append(r2)
            r1 = r3
            goto L28
        L44:
            p000.AbstractC1021yh.m6917()
            r4 = 0
            throw r4
        L49:
            java.lang.String r4 = ")"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
