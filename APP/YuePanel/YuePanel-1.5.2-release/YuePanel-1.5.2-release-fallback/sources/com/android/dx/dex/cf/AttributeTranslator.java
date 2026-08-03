package com.android.dx.dex.cf;

/* JADX INFO: loaded from: classes.dex */
class AttributeTranslator {
    private AttributeTranslator() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.android.dx.rop.annotation.Annotations getAnnotations(com.android.dx.cf.iface.AttributeList r2) {
            com.android.dx.rop.annotation.Annotations r0 = getAnnotations0(r2)
            com.android.dx.rop.annotation.Annotation r1 = getSignature(r2)
            com.android.dx.rop.annotation.Annotation r2 = getSourceDebugExtension(r2)
            if (r1 == 0) goto L12
            com.android.dx.rop.annotation.Annotations r0 = com.android.dx.rop.annotation.Annotations.combine(r0, r1)
        L12:
            if (r2 == 0) goto L18
            com.android.dx.rop.annotation.Annotations r0 = com.android.dx.rop.annotation.Annotations.combine(r0, r2)
        L18:
            return r0
    }

    private static com.android.dx.rop.annotation.Annotations getAnnotations0(com.android.dx.cf.iface.AttributeList r2) {
            java.lang.String r0 = "RuntimeVisibleAnnotations"
            com.android.dx.cf.iface.Attribute r0 = r2.findFirst(r0)
            com.android.dx.cf.attrib.AttRuntimeVisibleAnnotations r0 = (com.android.dx.cf.attrib.AttRuntimeVisibleAnnotations) r0
            java.lang.String r1 = "RuntimeInvisibleAnnotations"
            com.android.dx.cf.iface.Attribute r2 = r2.findFirst(r1)
            com.android.dx.cf.attrib.AttRuntimeInvisibleAnnotations r2 = (com.android.dx.cf.attrib.AttRuntimeInvisibleAnnotations) r2
            if (r0 != 0) goto L1c
            if (r2 != 0) goto L17
            com.android.dx.rop.annotation.Annotations r2 = com.android.dx.rop.annotation.Annotations.EMPTY
            return r2
        L17:
            com.android.dx.rop.annotation.Annotations r2 = r2.getAnnotations()
            return r2
        L1c:
            if (r2 != 0) goto L23
            com.android.dx.rop.annotation.Annotations r2 = r0.getAnnotations()
            return r2
        L23:
            com.android.dx.rop.annotation.Annotations r0 = r0.getAnnotations()
            com.android.dx.rop.annotation.Annotations r2 = r2.getAnnotations()
            com.android.dx.rop.annotation.Annotations r2 = com.android.dx.rop.annotation.Annotations.combine(r0, r2)
            return r2
    }

    public static com.android.dx.rop.annotation.Annotations getClassAnnotations(com.android.dx.cf.direct.DirectClassFile r5, com.android.dx.dex.cf.CfOptions r6) {
            com.android.dx.rop.cst.CstType r0 = r5.getThisClass()
            com.android.dx.cf.iface.AttributeList r1 = r5.getAttributes()
            com.android.dx.rop.annotation.Annotations r2 = getAnnotations(r1)
            com.android.dx.rop.annotation.Annotation r3 = translateEnclosingMethod(r1)
            if (r3 != 0) goto L14
            r4 = 1
            goto L15
        L14:
            r4 = 0
        L15:
            com.android.dx.rop.annotation.Annotations r0 = translateInnerClasses(r0, r1, r4)     // Catch: com.android.dx.util.Warning -> L20
            if (r0 == 0) goto L3b
            com.android.dx.rop.annotation.Annotations r2 = com.android.dx.rop.annotation.Annotations.combine(r2, r0)     // Catch: com.android.dx.util.Warning -> L20
            goto L3b
        L20:
            r0 = move-exception
            java.io.PrintStream r6 = r6.warn
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "warning: "
            r1.append(r4)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.println(r0)
        L3b:
            if (r3 == 0) goto L41
            com.android.dx.rop.annotation.Annotations r2 = com.android.dx.rop.annotation.Annotations.combine(r2, r3)
        L41:
            int r6 = r5.getAccessFlags()
            boolean r6 = com.android.dx.rop.code.AccessFlags.isAnnotation(r6)
            if (r6 == 0) goto L55
            com.android.dx.rop.annotation.Annotation r5 = translateAnnotationDefaults(r5)
            if (r5 == 0) goto L55
            com.android.dx.rop.annotation.Annotations r2 = com.android.dx.rop.annotation.Annotations.combine(r2, r5)
        L55:
            return r2
    }

    public static com.android.dx.rop.type.TypeList getExceptions(com.android.dx.cf.iface.Method r1) {
            com.android.dx.cf.iface.AttributeList r1 = r1.getAttributes()
            java.lang.String r0 = "Exceptions"
            com.android.dx.cf.iface.Attribute r1 = r1.findFirst(r0)
            com.android.dx.cf.attrib.AttExceptions r1 = (com.android.dx.cf.attrib.AttExceptions) r1
            if (r1 != 0) goto L11
            com.android.dx.rop.type.StdTypeList r1 = com.android.dx.rop.type.StdTypeList.EMPTY
            return r1
        L11:
            com.android.dx.rop.type.TypeList r1 = r1.getExceptions()
            return r1
    }

    public static com.android.dx.rop.annotation.Annotations getMethodAnnotations(com.android.dx.cf.iface.Method r2) {
            com.android.dx.cf.iface.AttributeList r0 = r2.getAttributes()
            com.android.dx.rop.annotation.Annotations r0 = getAnnotations(r0)
            com.android.dx.rop.type.TypeList r2 = getExceptions(r2)
            int r1 = r2.size()
            if (r1 == 0) goto L1a
            com.android.dx.rop.annotation.Annotation r2 = com.android.dx.dex.file.AnnotationUtils.makeThrows(r2)
            com.android.dx.rop.annotation.Annotations r0 = com.android.dx.rop.annotation.Annotations.combine(r0, r2)
        L1a:
            return r0
    }

    public static com.android.dx.rop.annotation.AnnotationsList getParameterAnnotations(com.android.dx.cf.iface.Method r2) {
            com.android.dx.cf.iface.AttributeList r2 = r2.getAttributes()
            java.lang.String r0 = "RuntimeVisibleParameterAnnotations"
            com.android.dx.cf.iface.Attribute r0 = r2.findFirst(r0)
            com.android.dx.cf.attrib.AttRuntimeVisibleParameterAnnotations r0 = (com.android.dx.cf.attrib.AttRuntimeVisibleParameterAnnotations) r0
            java.lang.String r1 = "RuntimeInvisibleParameterAnnotations"
            com.android.dx.cf.iface.Attribute r2 = r2.findFirst(r1)
            com.android.dx.cf.attrib.AttRuntimeInvisibleParameterAnnotations r2 = (com.android.dx.cf.attrib.AttRuntimeInvisibleParameterAnnotations) r2
            if (r0 != 0) goto L20
            if (r2 != 0) goto L1b
            com.android.dx.rop.annotation.AnnotationsList r2 = com.android.dx.rop.annotation.AnnotationsList.EMPTY
            return r2
        L1b:
            com.android.dx.rop.annotation.AnnotationsList r2 = r2.getParameterAnnotations()
            return r2
        L20:
            if (r2 != 0) goto L27
            com.android.dx.rop.annotation.AnnotationsList r2 = r0.getParameterAnnotations()
            return r2
        L27:
            com.android.dx.rop.annotation.AnnotationsList r0 = r0.getParameterAnnotations()
            com.android.dx.rop.annotation.AnnotationsList r2 = r2.getParameterAnnotations()
            com.android.dx.rop.annotation.AnnotationsList r2 = com.android.dx.rop.annotation.AnnotationsList.combine(r0, r2)
            return r2
    }

    private static com.android.dx.rop.annotation.Annotation getSignature(com.android.dx.cf.iface.AttributeList r1) {
            java.lang.String r0 = "Signature"
            com.android.dx.cf.iface.Attribute r1 = r1.findFirst(r0)
            com.android.dx.cf.attrib.AttSignature r1 = (com.android.dx.cf.attrib.AttSignature) r1
            if (r1 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            com.android.dx.rop.cst.CstString r1 = r1.getSignature()
            com.android.dx.rop.annotation.Annotation r1 = com.android.dx.dex.file.AnnotationUtils.makeSignature(r1)
            return r1
    }

    private static com.android.dx.rop.annotation.Annotation getSourceDebugExtension(com.android.dx.cf.iface.AttributeList r1) {
            java.lang.String r0 = "SourceDebugExtension"
            com.android.dx.cf.iface.Attribute r1 = r1.findFirst(r0)
            com.android.dx.cf.attrib.AttSourceDebugExtension r1 = (com.android.dx.cf.attrib.AttSourceDebugExtension) r1
            if (r1 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            com.android.dx.rop.cst.CstString r1 = r1.getSmapString()
            com.android.dx.rop.annotation.Annotation r1 = com.android.dx.dex.file.AnnotationUtils.makeSourceDebugExtension(r1)
            return r1
    }

    private static com.android.dx.rop.annotation.Annotation translateAnnotationDefaults(com.android.dx.cf.direct.DirectClassFile r7) {
            com.android.dx.rop.cst.CstType r0 = r7.getThisClass()
            com.android.dx.cf.iface.MethodList r7 = r7.getMethods()
            int r1 = r7.size()
            com.android.dx.rop.annotation.Annotation r2 = new com.android.dx.rop.annotation.Annotation
            com.android.dx.rop.annotation.AnnotationVisibility r3 = com.android.dx.rop.annotation.AnnotationVisibility.EMBEDDED
            r2.<init>(r0, r3)
            r0 = 0
            r3 = r0
        L15:
            if (r0 >= r1) goto L41
            com.android.dx.cf.iface.Method r4 = r7.get(r0)
            com.android.dx.cf.iface.AttributeList r5 = r4.getAttributes()
            java.lang.String r6 = "AnnotationDefault"
            com.android.dx.cf.iface.Attribute r5 = r5.findFirst(r6)
            com.android.dx.cf.attrib.AttAnnotationDefault r5 = (com.android.dx.cf.attrib.AttAnnotationDefault) r5
            if (r5 == 0) goto L3e
            com.android.dx.rop.annotation.NameValuePair r3 = new com.android.dx.rop.annotation.NameValuePair
            com.android.dx.rop.cst.CstNat r4 = r4.getNat()
            com.android.dx.rop.cst.CstString r4 = r4.getName()
            com.android.dx.rop.cst.Constant r5 = r5.getValue()
            r3.<init>(r4, r5)
            r2.add(r3)
            r3 = 1
        L3e:
            int r0 = r0 + 1
            goto L15
        L41:
            if (r3 != 0) goto L45
            r7 = 0
            return r7
        L45:
            r2.setImmutable()
            com.android.dx.rop.annotation.Annotation r7 = com.android.dx.dex.file.AnnotationUtils.makeAnnotationDefault(r2)
            return r7
    }

    private static com.android.dx.rop.annotation.Annotation translateEnclosingMethod(com.android.dx.cf.iface.AttributeList r2) {
            java.lang.String r0 = "EnclosingMethod"
            com.android.dx.cf.iface.Attribute r2 = r2.findFirst(r0)
            com.android.dx.cf.attrib.AttEnclosingMethod r2 = (com.android.dx.cf.attrib.AttEnclosingMethod) r2
            if (r2 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            com.android.dx.rop.cst.CstType r0 = r2.getEnclosingClass()
            com.android.dx.rop.cst.CstNat r2 = r2.getMethod()
            if (r2 != 0) goto L1b
            com.android.dx.rop.annotation.Annotation r2 = com.android.dx.dex.file.AnnotationUtils.makeEnclosingClass(r0)
            return r2
        L1b:
            com.android.dx.rop.cst.CstMethodRef r1 = new com.android.dx.rop.cst.CstMethodRef
            r1.<init>(r0, r2)
            com.android.dx.rop.annotation.Annotation r2 = com.android.dx.dex.file.AnnotationUtils.makeEnclosingMethod(r1)
            return r2
    }

    private static com.android.dx.rop.annotation.Annotations translateInnerClasses(com.android.dx.rop.cst.CstType r9, com.android.dx.cf.iface.AttributeList r10, boolean r11) {
            java.lang.String r0 = "InnerClasses"
            com.android.dx.cf.iface.Attribute r10 = r10.findFirst(r0)
            com.android.dx.cf.attrib.AttInnerClasses r10 = (com.android.dx.cf.attrib.AttInnerClasses) r10
            r0 = 0
            if (r10 != 0) goto Lc
            return r0
        Lc:
            com.android.dx.cf.attrib.InnerClassList r10 = r10.getInnerClasses()
            int r1 = r10.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r5 = r0
            r4 = r3
        L1c:
            if (r4 >= r1) goto L42
            com.android.dx.cf.attrib.InnerClassList$Item r6 = r10.get(r4)
            com.android.dx.rop.cst.CstType r7 = r6.getInnerClass()
            boolean r8 = r7.equals(r9)
            if (r8 == 0) goto L2e
            r5 = r6
            goto L3f
        L2e:
            com.android.dx.rop.cst.CstType r6 = r6.getOuterClass()
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L3f
            com.android.dx.rop.type.Type r6 = r7.getClassType()
            r2.add(r6)
        L3f:
            int r4 = r4 + 1
            goto L1c
        L42:
            int r10 = r2.size()
            if (r5 != 0) goto L4b
            if (r10 != 0) goto L4b
            return r0
        L4b:
            com.android.dx.rop.annotation.Annotations r0 = new com.android.dx.rop.annotation.Annotations
            r0.<init>()
            if (r5 == 0) goto L95
            com.android.dx.rop.cst.CstString r1 = r5.getInnerName()
            int r4 = r5.getAccessFlags()
            com.android.dx.rop.annotation.Annotation r1 = com.android.dx.dex.file.AnnotationUtils.makeInnerClass(r1, r4)
            r0.add(r1)
            if (r11 == 0) goto L95
            com.android.dx.rop.cst.CstType r11 = r5.getOuterClass()
            if (r11 == 0) goto L75
            com.android.dx.rop.cst.CstType r9 = r5.getOuterClass()
            com.android.dx.rop.annotation.Annotation r9 = com.android.dx.dex.file.AnnotationUtils.makeEnclosingClass(r9)
            r0.add(r9)
            goto L95
        L75:
            com.android.dx.util.Warning r10 = new com.android.dx.util.Warning
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Ignoring InnerClasses attribute for an anonymous inner class\n("
            r11.append(r0)
            java.lang.String r9 = r9.toHuman()
            r11.append(r9)
            java.lang.String r9 = ") that doesn't come with an\nassociated EnclosingMethod attribute. This class was probably produced by a\ncompiler that did not target the modern .class file format. The recommended\nsolution is to recompile the class from source, using an up-to-date compiler\nand without specifying any \"-target\" type options. The consequence of ignoring\nthis warning is that reflective operations on this class will incorrectly\nindicate that it is *not* an inner class."
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        L95:
            if (r10 == 0) goto Lb4
            com.android.dx.rop.type.StdTypeList r9 = new com.android.dx.rop.type.StdTypeList
            r9.<init>(r10)
        L9c:
            if (r3 >= r10) goto Laa
            java.lang.Object r11 = r2.get(r3)
            com.android.dx.rop.type.Type r11 = (com.android.dx.rop.type.Type) r11
            r9.set(r3, r11)
            int r3 = r3 + 1
            goto L9c
        Laa:
            r9.setImmutable()
            com.android.dx.rop.annotation.Annotation r9 = com.android.dx.dex.file.AnnotationUtils.makeMemberClasses(r9)
            r0.add(r9)
        Lb4:
            r0.setImmutable()
            return r0
    }
}
