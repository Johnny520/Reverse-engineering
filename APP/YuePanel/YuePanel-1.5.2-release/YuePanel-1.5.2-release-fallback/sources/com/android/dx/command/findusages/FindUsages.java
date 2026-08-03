package com.android.dx.command.findusages;

/* JADX INFO: loaded from: classes.dex */
public final class FindUsages {
    private final com.android.dx.io.CodeReader codeReader;
    private com.android.dex.ClassDef currentClass;
    private com.android.dex.ClassData.Method currentMethod;
    private final com.android.dex.Dex dex;
    private final java.util.Set<java.lang.Integer> fieldIds;
    private final java.util.Set<java.lang.Integer> methodIds;
    private final java.io.PrintWriter out;



    public FindUsages(com.android.dex.Dex r7, java.lang.String r8, java.lang.String r9, java.io.PrintWriter r10) {
            r6 = this;
            r6.<init>()
            com.android.dx.io.CodeReader r0 = new com.android.dx.io.CodeReader
            r0.<init>()
            r6.codeReader = r0
            r6.dex = r7
            r6.out = r10
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r8)
            java.util.regex.Pattern r9 = java.util.regex.Pattern.compile(r9)
            java.util.List r2 = r7.strings()
            r3 = 0
        L25:
            int r4 = r2.size()
            if (r3 >= r4) goto L56
            java.lang.Object r4 = r2.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            java.util.regex.Matcher r5 = r8.matcher(r4)
            boolean r5 = r5.matches()
            if (r5 == 0) goto L42
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r0.add(r5)
        L42:
            java.util.regex.Matcher r4 = r9.matcher(r4)
            boolean r4 = r4.matches()
            if (r4 == 0) goto L53
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r1.add(r4)
        L53:
            int r3 = r3 + 1
            goto L25
        L56:
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto Lb7
            boolean r8 = r1.isEmpty()
            if (r8 == 0) goto L63
            goto Lb7
        L63:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            r6.methodIds = r8
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            r6.fieldIds = r8
            java.util.Iterator r8 = r0.iterator()
        L75:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto La2
            java.lang.Object r9 = r8.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            r9.intValue()
            java.util.List r0 = r7.typeIds()
            int r9 = java.util.Collections.binarySearch(r0, r9)
            if (r9 >= 0) goto L8f
            goto L75
        L8f:
            java.util.Set<java.lang.Integer> r0 = r6.methodIds
            java.util.Set r2 = r6.getMethodIds(r7, r1, r9)
            r0.addAll(r2)
            java.util.Set<java.lang.Integer> r0 = r6.fieldIds
            java.util.Set r9 = r6.getFieldIds(r7, r1, r9)
            r0.addAll(r9)
            goto L75
        La2:
            com.android.dx.io.CodeReader r8 = r6.codeReader
            com.android.dx.command.findusages.FindUsages$1 r9 = new com.android.dx.command.findusages.FindUsages$1
            r9.<init>(r6, r10, r7)
            r8.setFieldVisitor(r9)
            com.android.dx.io.CodeReader r8 = r6.codeReader
            com.android.dx.command.findusages.FindUsages$2 r9 = new com.android.dx.command.findusages.FindUsages$2
            r9.<init>(r6, r10, r7)
            r8.setMethodVisitor(r9)
            return
        Lb7:
            r7 = 0
            r6.fieldIds = r7
            r6.methodIds = r7
            return
    }

    public static /* synthetic */ java.util.Set access$000(com.android.dx.command.findusages.FindUsages r0) {
            java.util.Set<java.lang.Integer> r0 = r0.fieldIds
            return r0
    }

    public static /* synthetic */ java.lang.String access$100(com.android.dx.command.findusages.FindUsages r0) {
            java.lang.String r0 = r0.location()
            return r0
    }

    public static /* synthetic */ java.util.Set access$200(com.android.dx.command.findusages.FindUsages r0) {
            java.util.Set<java.lang.Integer> r0 = r0.methodIds
            return r0
    }

    private java.util.Set<java.lang.Integer> findAssignableTypes(com.android.dex.Dex r6, int r7) {
            r5 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0.add(r7)
            java.lang.Iterable r6 = r6.classDefs()
            java.util.Iterator r6 = r6.iterator()
        L14:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L5d
            java.lang.Object r7 = r6.next()
            com.android.dex.ClassDef r7 = (com.android.dex.ClassDef) r7
            int r1 = r7.getSupertypeIndex()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L3a
            int r7 = r7.getTypeIndex()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0.add(r7)
            goto L14
        L3a:
            short[] r1 = r7.getInterfaces()
            int r2 = r1.length
            r3 = 0
        L40:
            if (r3 >= r2) goto L14
            short r4 = r1[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L5a
            int r7 = r7.getTypeIndex()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0.add(r7)
            goto L14
        L5a:
            int r3 = r3 + 1
            goto L40
        L5d:
            return r0
    }

    private java.util.Set<java.lang.Integer> getFieldIds(com.android.dex.Dex r5, java.util.Set<java.lang.Integer> r6, int r7) {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.List r5 = r5.fieldIds()
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        Le:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r5.next()
            com.android.dex.FieldId r2 = (com.android.dex.FieldId) r2
            int r3 = r2.getNameIndex()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r6.contains(r3)
            if (r3 == 0) goto L35
            int r2 = r2.getDeclaringClassIndex()
            if (r7 != r2) goto L35
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.add(r2)
        L35:
            int r1 = r1 + 1
            goto Le
        L38:
            return r0
    }

    private java.util.Set<java.lang.Integer> getMethodIds(com.android.dex.Dex r5, java.util.Set<java.lang.Integer> r6, int r7) {
            r4 = this;
            java.util.Set r7 = r4.findAssignableTypes(r5, r7)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.List r5 = r5.methodIds()
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        L12:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r5.next()
            com.android.dex.MethodId r2 = (com.android.dex.MethodId) r2
            int r3 = r2.getNameIndex()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r6.contains(r3)
            if (r3 == 0) goto L41
            int r2 = r2.getDeclaringClassIndex()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r7.contains(r2)
            if (r2 == 0) goto L41
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.add(r2)
        L41:
            int r1 = r1 + 1
            goto L12
        L44:
            return r0
    }

    private java.lang.String location() {
            r3 = this;
            com.android.dex.Dex r0 = r3.dex
            java.util.List r0 = r0.typeNames()
            com.android.dex.ClassDef r1 = r3.currentClass
            int r1 = r1.getTypeIndex()
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            com.android.dex.ClassData$Method r1 = r3.currentMethod
            if (r1 == 0) goto L4c
            com.android.dex.Dex r1 = r3.dex
            java.util.List r1 = r1.methodIds()
            com.android.dex.ClassData$Method r2 = r3.currentMethod
            int r2 = r2.getMethodIndex()
            java.lang.Object r1 = r1.get(r2)
            com.android.dex.MethodId r1 = (com.android.dex.MethodId) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "."
            r2.append(r0)
            com.android.dex.Dex r0 = r3.dex
            java.util.List r0 = r0.strings()
            int r1 = r1.getNameIndex()
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L4c:
            return r0
    }

    public void findUsages() {
            r10 = this;
            java.util.Set<java.lang.Integer> r0 = r10.fieldIds
            if (r0 == 0) goto Ld5
            java.util.Set<java.lang.Integer> r0 = r10.methodIds
            if (r0 != 0) goto La
            goto Ld5
        La:
            com.android.dex.Dex r0 = r10.dex
            java.lang.Iterable r0 = r0.classDefs()
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto Ld1
            java.lang.Object r1 = r0.next()
            com.android.dex.ClassDef r1 = (com.android.dex.ClassDef) r1
            r10.currentClass = r1
            r10.currentMethod = r2
            int r2 = r1.getClassDataOffset()
            if (r2 != 0) goto L2c
            goto L14
        L2c:
            com.android.dex.Dex r2 = r10.dex
            com.android.dex.ClassData r1 = r2.readClassData(r1)
            com.android.dex.ClassData$Field[] r2 = r1.allFields()
            int r3 = r2.length
            r4 = 0
            r5 = r4
        L39:
            if (r5 >= r3) goto L77
            r6 = r2[r5]
            int r6 = r6.getFieldIndex()
            java.util.Set<java.lang.Integer> r7 = r10.fieldIds
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L74
            java.io.PrintWriter r7 = r10.out
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r10.location()
            r8.append(r9)
            java.lang.String r9 = " field declared "
            r8.append(r9)
            com.android.dex.Dex r9 = r10.dex
            java.util.List r9 = r9.fieldIds()
            java.lang.Object r6 = r9.get(r6)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.println(r6)
        L74:
            int r5 = r5 + 1
            goto L39
        L77:
            com.android.dex.ClassData$Method[] r1 = r1.allMethods()
            int r2 = r1.length
        L7c:
            if (r4 >= r2) goto L14
            r3 = r1[r4]
            r10.currentMethod = r3
            int r5 = r3.getMethodIndex()
            java.util.Set<java.lang.Integer> r6 = r10.methodIds
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto Lb9
            java.io.PrintWriter r6 = r10.out
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r10.location()
            r7.append(r8)
            java.lang.String r8 = " method declared "
            r7.append(r8)
            com.android.dex.Dex r8 = r10.dex
            java.util.List r8 = r8.methodIds()
            java.lang.Object r5 = r8.get(r5)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.println(r5)
        Lb9:
            int r5 = r3.getCodeOffset()
            if (r5 == 0) goto Lce
            com.android.dx.io.CodeReader r5 = r10.codeReader
            com.android.dex.Dex r6 = r10.dex
            com.android.dex.Code r3 = r6.readCode(r3)
            short[] r3 = r3.getInstructions()
            r5.visitAll(r3)
        Lce:
            int r4 = r4 + 1
            goto L7c
        Ld1:
            r10.currentClass = r2
            r10.currentMethod = r2
        Ld5:
            return
    }
}
