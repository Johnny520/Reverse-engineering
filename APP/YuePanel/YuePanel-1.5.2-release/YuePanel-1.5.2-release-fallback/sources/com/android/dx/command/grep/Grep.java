package com.android.dx.command.grep;

/* JADX INFO: loaded from: classes.dex */
public final class Grep {
    private final com.android.dx.io.CodeReader codeReader;
    private int count;
    private com.android.dex.ClassDef currentClass;
    private com.android.dex.ClassData.Method currentMethod;
    private final com.android.dex.Dex dex;
    private final java.io.PrintWriter out;
    private final java.util.Set<java.lang.Integer> stringIds;


    public Grep(com.android.dex.Dex r3, java.util.regex.Pattern r4, java.io.PrintWriter r5) {
            r2 = this;
            r2.<init>()
            com.android.dx.io.CodeReader r0 = new com.android.dx.io.CodeReader
            r0.<init>()
            r2.codeReader = r0
            r1 = 0
            r2.count = r1
            r2.dex = r3
            r2.out = r5
            java.util.Set r3 = r2.getStringIds(r3, r4)
            r2.stringIds = r3
            com.android.dx.command.grep.Grep$1 r3 = new com.android.dx.command.grep.Grep$1
            r3.<init>(r2)
            r0.setStringVisitor(r3)
            return
    }

    public static /* synthetic */ void access$000(com.android.dx.command.grep.Grep r0, int r1) {
            r0.encounterString(r1)
            return
    }

    private void encounterString(int r4) {
            r3 = this;
            java.util.Set<java.lang.Integer> r0 = r3.stringIds
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L3b
            java.io.PrintWriter r0 = r3.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.location()
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            com.android.dex.Dex r2 = r3.dex
            java.util.List r2 = r2.strings()
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.println(r4)
            int r4 = r3.count
            int r4 = r4 + 1
            r3.count = r4
        L3b:
            return
    }

    private java.util.Set<java.lang.Integer> getStringIds(com.android.dex.Dex r4, java.util.regex.Pattern r5) {
            r3 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.List r4 = r4.strings()
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        Le:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r4.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.regex.Matcher r2 = r5.matcher(r2)
            boolean r2 = r2.find()
            if (r2 == 0) goto L2b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.add(r2)
        L2b:
            int r1 = r1 + 1
            goto Le
        L2e:
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

    private void readArray(com.android.dex.EncodedValueReader r5) {
            r4 = this;
            int r0 = r5.readArray()
            r1 = 0
        L5:
            if (r1 >= r0) goto L22
            int r2 = r5.peek()
            r3 = 23
            if (r2 == r3) goto L18
            r3 = 28
            if (r2 == r3) goto L14
            goto L1f
        L14:
            r4.readArray(r5)
            goto L1f
        L18:
            int r2 = r5.readString()
            r4.encounterString(r2)
        L1f:
            int r1 = r1 + 1
            goto L5
        L22:
            return
    }

    public int grep() {
            r7 = this;
            com.android.dex.Dex r0 = r7.dex
            java.lang.Iterable r0 = r0.classDefs()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L60
            java.lang.Object r1 = r0.next()
            com.android.dex.ClassDef r1 = (com.android.dex.ClassDef) r1
            r7.currentClass = r1
            r7.currentMethod = r2
            int r2 = r1.getClassDataOffset()
            if (r2 != 0) goto L22
            goto La
        L22:
            com.android.dex.Dex r2 = r7.dex
            com.android.dex.ClassData r2 = r2.readClassData(r1)
            int r1 = r1.getStaticValuesOffset()
            if (r1 == 0) goto L3c
            com.android.dex.EncodedValueReader r3 = new com.android.dex.EncodedValueReader
            com.android.dex.Dex r4 = r7.dex
            com.android.dex.Dex$Section r1 = r4.open(r1)
            r3.<init>(r1)
            r7.readArray(r3)
        L3c:
            com.android.dex.ClassData$Method[] r1 = r2.allMethods()
            int r2 = r1.length
            r3 = 0
        L42:
            if (r3 >= r2) goto La
            r4 = r1[r3]
            r7.currentMethod = r4
            int r5 = r4.getCodeOffset()
            if (r5 == 0) goto L5d
            com.android.dx.io.CodeReader r5 = r7.codeReader
            com.android.dex.Dex r6 = r7.dex
            com.android.dex.Code r4 = r6.readCode(r4)
            short[] r4 = r4.getInstructions()
            r5.visitAll(r4)
        L5d:
            int r3 = r3 + 1
            goto L42
        L60:
            r7.currentClass = r2
            r7.currentMethod = r2
            int r0 = r7.count
            return r0
    }
}
