package org.luckypray.dexkit.result;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nAnnotationData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationData.kt\norg/luckypray/dexkit/result/AnnotationData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1858#2,3:80\n*S KotlinDebug\n*F\n+ 1 AnnotationData.kt\norg/luckypray/dexkit/result/AnnotationData\n*L\n70#1:80,3\n*E\n"})
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 %2\u00020\u0001:\u0001%BA\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0011R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b#\u0010\u0011¨\u0006&"}, d2 = {"Lorg/luckypray/dexkit/result/AnnotationData;", "Lorg/luckypray/dexkit/result/base/BaseData;", "Lorg/luckypray/dexkit/DexKitBridge;", "bridge", "", "dexId", "typeId", "", "typeDescriptor", "Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;", "visibility", "", "Lorg/luckypray/dexkit/result/AnnotationElementData;", "elements", "<init>", "(Lorg/luckypray/dexkit/DexKitBridge;IILjava/lang/String;Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "I", "getTypeId", "()I", "Ljava/lang/String;", "getTypeDescriptor", "Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;", "getVisibility", "()Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;", "Ljava/util/List;", "getElements", "()Ljava/util/List;", "Lorg/luckypray/dexkit/wrap/DexClass;", "dexClass$delegate", "LYue/ۥ۠ۦۨۨ;", "getDexClass", "()Lorg/luckypray/dexkit/wrap/DexClass;", "dexClass", "getTypeName", "typeName", "-Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class AnnotationData extends org.luckypray.dexkit.result.base.BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.result.AnnotationData.Companion f30801Companion = null;

    @Yue.InterfaceC4418
    private final Yue.InterfaceC3574 dexClass$delegate;

    @Yue.InterfaceC4418
    private final java.util.List<org.luckypray.dexkit.result.AnnotationElementData> elements;

    @Yue.InterfaceC4418
    private final java.lang.String typeDescriptor;
    private final int typeId;

    @Yue.InterfaceC4543
    private final org.luckypray.dexkit.query.enums.AnnotationVisibilityType visibility;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationData$-Companion, reason: invalid class name */
    @Yue.InterfaceC4201(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\t¨\u0006\n"}, d2 = {"Lorg/luckypray/dexkit/result/AnnotationData$-Companion;", "", "()V", "from", "Lorg/luckypray/dexkit/result/AnnotationData;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "annotationMeta", "Lorg/luckypray/dexkit/schema/-AnnotationMeta;", "Lorg/luckypray/dexkit/InnerAnnotationMeta;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.result.AnnotationData from(@Yue.InterfaceC4418 org.luckypray.dexkit.DexKitBridge r10, @Yue.InterfaceC4418 org.luckypray.dexkit.schema.AnnotationMeta r11) {
                r9 = this;
                java.lang.String r0 = "bridge"
                Yue.C3329.m13906(r10, r0)
                java.lang.String r0 = "annotationMeta"
                Yue.C3329.m13906(r11, r0)
                int r3 = r11.m30807getDexIdpVg5ArA()
                int r4 = r11.m30808getTypeIdpVg5ArA()
                java.lang.String r5 = r11.getTypeDescriptor()
                Yue.C3329.m13903(r5)
                org.luckypray.dexkit.query.enums.AnnotationVisibilityType$Companion r0 = org.luckypray.dexkit.query.enums.AnnotationVisibilityType.Companion
                byte r1 = r11.getVisibility()
                org.luckypray.dexkit.query.enums.AnnotationVisibilityType r6 = r0.from(r1)
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                int r0 = r11.getElementsLength()
                r1 = 0
            L2d:
                if (r1 >= r0) goto L42
                org.luckypray.dexkit.result.AnnotationElementData$-Companion r2 = org.luckypray.dexkit.result.AnnotationElementData.f30802Companion
                org.luckypray.dexkit.schema.-AnnotationElementMeta r8 = r11.elements(r1)
                Yue.C3329.m13903(r8)
                org.luckypray.dexkit.result.AnnotationElementData r2 = r2.from(r10, r8)
                r7.add(r2)
                int r1 = r1 + 1
                goto L2d
            L42:
                Yue.ۥۣۢ۠ۤ r11 = Yue.C6593.f23016
                org.luckypray.dexkit.result.AnnotationData r11 = new org.luckypray.dexkit.result.AnnotationData
                r8 = 0
                r1 = r11
                r2 = r10
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return r11
        }
    }

    static {
            org.luckypray.dexkit.result.AnnotationData$-Companion r0 = new org.luckypray.dexkit.result.AnnotationData$-Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.result.AnnotationData.f30801Companion = r0
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
            r6.typeId = r9
            r6.typeDescriptor = r10
            r6.visibility = r11
            r6.elements = r12
            org.luckypray.dexkit.result.AnnotationData$dexClass$2 r7 = new org.luckypray.dexkit.result.AnnotationData$dexClass$2
            r7.<init>(r6)
            Yue.ۥ۠ۦۨۨ r7 = Yue.C3579.m14505(r7)
            r6.dexClass$delegate = r7
            return
    }

    public /* synthetic */ AnnotationData(org.luckypray.dexkit.DexKitBridge r1, int r2, int r3, java.lang.String r4, org.luckypray.dexkit.query.enums.AnnotationVisibilityType r5, java.util.List r6, Yue.C1769 r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private final org.luckypray.dexkit.wrap.DexClass getDexClass() {
            r1 = this;
            Yue.ۥ۠ۦۨۨ r0 = r1.dexClass$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.wrap.DexClass r0 = (org.luckypray.dexkit.wrap.DexClass) r0
            return r0
    }

    @Yue.InterfaceC4418
    public final java.util.List<org.luckypray.dexkit.result.AnnotationElementData> getElements() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.result.AnnotationElementData> r0 = r1.elements
            return r0
    }

    @Yue.InterfaceC4418
    public final java.lang.String getTypeDescriptor() {
            r1 = this;
            java.lang.String r0 = r1.typeDescriptor
            return r0
    }

    public final int getTypeId() {
            r1 = this;
            int r0 = r1.typeId
            return r0
    }

    @Yue.InterfaceC4418
    public final java.lang.String getTypeName() {
            r1 = this;
            org.luckypray.dexkit.wrap.DexClass r0 = r1.getDexClass()
            java.lang.String r0 = r0.getTypeName()
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.enums.AnnotationVisibilityType getVisibility() {
            r1 = this;
            org.luckypray.dexkit.query.enums.AnnotationVisibilityType r0 = r1.visibility
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.typeDescriptor
            java.lang.String r1 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "@"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            java.util.List<org.luckypray.dexkit.result.AnnotationElementData> r1 = r5.elements
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L2b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r1.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto L3c
            Yue.C1208.m6228()
        L3c:
            org.luckypray.dexkit.result.AnnotationElementData r3 = (org.luckypray.dexkit.result.AnnotationElementData) r3
            if (r2 == 0) goto L45
            java.lang.String r2 = ", "
            r0.append(r2)
        L45:
            r0.append(r3)
            r2 = r4
            goto L2b
        L4a:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            Yue.C3329.m13905(r0, r1)
            return r0
    }
}
